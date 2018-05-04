package de.cooperateproject.eabridge.incrementalsync.synchronization;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.incrementalsync.monitoring.Table;
import de.cooperateproject.eabridge.incrementalsync.monitoring.TableAdapter;

/**
 * IncrementalSync provides functionality to monitor database changes using
 * (generated) logging tables. All recognized updates can be logged and printed.
 * Also, the monitored Hibernate model can be refresh automatically and
 * incrementally.
 */
public class IncrementalSync {

	/**
	 * The IncrementalSync mode. Possible are logging and/or synchronization.
	 */
	public enum MODE {
		LOG_ONLY, SYNC_ONLY, LOG_AND_SYNC
	}
	private static final Logger logger = LoggerFactory.getLogger(IncrementalSync.class);
	
	private final Connection sqlConnection;
	private final SessionWrapper sessionWrapper;
	private final String prefix;

	private ArrayList<Table> tables;
	private MODE mode;

	private boolean remoteChangeFlag = false;
	private Object remoteChangeLock = new Object();
	
	private volatile boolean running = false;
	private boolean enabledSaving = false;
	private volatile int syncInterval = 1000;

	private EContentAdapter savingAdapter;
	private EObject adapterParent = null;
    

	/**
	 * Creates the incremental synchronization to log and update model changes
	 * asynchronously.
	 * 
	 * @param sqlConnection
	 *            The SQL-Connection to work with
	 * @param dbStore
	 *            The Hibernate Data Store from the database factory
	 * @param session
	 *            the currently opened session to synchronize
	 * @param prefix
	 *            the prefix of the (generated) logging tables
	 * @param mode
	 *            the Synchronization-Mode
	 */
	public IncrementalSync(Connection sqlConnection, SessionWrapper wrapper, String prefix, MODE mode) {
		this.sqlConnection = sqlConnection;
		this.tables = SyncUtil.getTables(wrapper);
		this.prefix = prefix;
		this.mode = mode;
		this.sessionWrapper = wrapper;

		initSavingAdapter();
	}

	/**
	 * Disables automatic saving of model changes for the already given object
	 * and all childs recursively.
	 * 
	 */
	public void disableSaving() {

		if (!enabledSaving) {
			logger.warn("Saving is not enabled.");
		} else {
			savingAdapter.unsetTarget(adapterParent);
			adapterParent.eAdapters().remove(savingAdapter);
			adapterParent = null;
			enabledSaving = !enabledSaving;
		}

	}

	/**
	 * Enables automatic saving of model changes for a given object and all
	 * childs recursively. Changes are detected with Adapters and written into
	 * the database. For more safety while using a recursive adapter, only one
	 * root/parent object is allowed per instance.
	 * 
	 * @param parentObject
	 *            The root object or a parent object in the model tree
	 */
	public void enableSaving(EObject parentObject) {

		if (enabledSaving) {
			logger.warn("Already enabled saving.");
		} else {
			adapterParent = parentObject;
			parentObject.eAdapters().add(savingAdapter);
			enabledSaving = !enabledSaving;
		}
	}

	public MODE getMode() {
		return this.mode;
	}

	/**
	 * Returns the currently set synchronization interval in milliseconds.
	 */
	public int getSyncInterval() {
		return syncInterval;
	}

	/**
	 * Initializes the adapter object for detection of local changes.
	 */
	private void initSavingAdapter() {
		savingAdapter = new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {

				Object oldValue = notification.getOldValue();
				Object newValue = notification.getNewValue();
				Object notifier = notification.getNotifier();

				// TODO: Saving also for Insert & Delete

				// Check first, if this is a real change
				if (oldValue != null && !oldValue.equals(newValue) || newValue != null && !newValue.equals(oldValue)) {

					// Now check, if the change comes from the database
					// refresh
					// algorithm
					synchronized (remoteChangeLock) {
						if (!remoteChangeFlag) {

							sessionWrapper.beginTransaction();
							try {
							    sessionWrapper.saveOrUpdate(notifier);
							} catch (Exception e) {
								logger.error("Unable to save object: " + notifier.toString(), e);
							} finally {
								sessionWrapper.commitTransaction();
							}
						}
					}

				}
			}
		};

	}

	/**
	 * Returns, if the synchronization is running at the moment
	 * 
	 * @return true, if the synchronization is running (asynchronously). false,
	 *         if it does not run or will stop before the next iteration
	 */
	public boolean isRunning() {
		return running;
	}

	public void setMode(MODE mode) {
		this.mode = mode;
	}

	/**
	 * Sets the synchronization interval.
	 * 
	 * @param syncInterval
	 *            A milliseconds value, greater than zero
	 */
	public void setSyncInterval(int syncInterval) {
		if (syncInterval > 0)
			this.syncInterval = syncInterval;
		else
			throw new IllegalArgumentException("SyncInterval must be greater than zero.");
	}

	/**
	 * Starts the synchronization asynchronously with all given information from
	 * the instantiation.
	 */
	public void startASync() {

		// Create Table Listeners
		ArrayList<TableAdapter> listeners = new ArrayList<TableAdapter>();
		for (Table table : tables) {
			TableAdapter listener = new TableAdapter(sqlConnection, table, prefix);

			listeners.add(listener);
		}

		// Create Thread
		Runnable r = new Runnable() {

			@Override
			public void run() {

				while (isRunning()) {

					// Complete the updates from all listeners
					for (TableAdapter listener : listeners) {
						sync(listener);
					}

					try {
						Thread.sleep(syncInterval);
					} catch (InterruptedException e) {
						logger.error("Thread Sleep Exception.", e);
					}
				}
			}
		};

		// Start
		running = true;
		Thread t = new Thread(r);
		t.start();

	}

	/**
	 * Stops the synchronization before the next iteration.
	 */
	public void stop() {
		running = false;
	}

	/**
	 * Does the synchronization / logging for the updates of a single table
	 * 
	 * @param syncTable
	 *            A TableListener, possibly holding updates from the logging
	 *            table
	 */
	@SuppressWarnings("unchecked")
	private void sync(TableAdapter syncTableAdapter) {

		ArrayList<String> updates = syncTableAdapter.getUpdates();
		Table syncTable = syncTableAdapter.getTable();

		if (updates != null) {

			if (updates.size() > 0) {

				// LOGGING
				String logging = String.format(
						"Updates in the last %d miliseconds (%s) at table %s (%s) at Primary Key(s): %s", syncInterval,
						Calendar.getInstance().getTime().toString(), syncTable.getTableName(),
						syncTable.getEntityName(), SyncUtil.prettyPrintArrayList(updates));

				if (this.mode == MODE.LOG_ONLY || this.mode == MODE.LOG_AND_SYNC) {
					logger.info(logging);
				} else {
					logger.debug(logging);
				}
			}

			// REFRESHING
			if (this.mode == MODE.SYNC_ONLY || this.mode == MODE.LOG_AND_SYNC) {

				// For each update, get Element with query and refresh it
				for (String update : updates) {

					String entityName = syncTable.getEntityName();
					String identifierProperty = syncTable.getIdentifierProperty();

					// Updates using SESSION QUERY
					List<EObject> resultsDB = new ArrayList<EObject>();
					Transaction transaction = sessionWrapper.getHibernateSession().beginTransaction();
					try {

					    resultsDB = (List<EObject>) sessionWrapper.executeQuery(
								String.format("FROM %s WHERE %s = %s", entityName, identifierProperty, update));
						//resultsDB = query.list();
					} catch (Exception e) {
						logger.error("Unable to use hiberante query.", e);
					} finally {
						transaction.commit();
					}

					// Updates using CRITERIA
					Criteria criteria = sessionWrapper.getHibernateSession().createCriteria(entityName);
					// FIXME: identifierProperty always Long?
					criteria.add(Restrictions.eq(identifierProperty, Long.parseLong(update)));
					criteria.setProjection(Projections.rowCount());

					// Merging RESULTS
					boolean sizeHBQuery = (long) criteria.uniqueResult() == 1L;
					boolean sizeDBQuery = resultsDB.size() == 1;

					if (sizeDBQuery && sizeHBQuery) {

						// Element found using both queries. Update element and
						// parent

						EObject elementToRefresh = resultsDB.get(0);
						EObject parent = elementToRefresh.eContainer();

						synchronized (remoteChangeLock) {
							remoteChangeFlag = true;

							sessionWrapper.refresh(elementToRefresh);
							sessionWrapper.refresh(parent);

							remoteChangeFlag = false;
						}

					} else if (!sizeDBQuery && sizeHBQuery) {

						// Only found using criteria (Probably insert). Update
						// parent

						criteria = sessionWrapper.getHibernateSession().createCriteria(entityName);
						// FIXME: identifierProperty always Long?
						criteria.add(Restrictions.eq(identifierProperty, Long.parseLong(update)));

						EObject insertedElement = (EObject) criteria.list().get(0);
						EObject parent = insertedElement.eContainer();

						sessionWrapper.refresh(parent);

					} else if (sizeDBQuery && !sizeHBQuery) {

						// Only found using query (Probably delete). Update
						// parent

						EObject deletedElement = resultsDB.get(0);
						EObject parent = deletedElement.eContainer();

						sessionWrapper.refresh(parent);

					} else {

						// Did not find the element. It is part of a batch
						// operation
						// or should really not be there

						logger.debug("Did not find element. Maybe a batch operation?");

					}

				}
			}
		} else {

			logger.debug("Retrieving database updates from logging tables failed.");

		}

	}

}
