package de.cooperateproject.incrementalsync.synchronization;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import de.cooperateproject.incrementalsync.monitoring.Table;
import de.cooperateproject.incrementalsync.monitoring.TableAdapter;

/**
 * IncrementalSync provides functionality to monitor database changes using
 * (generated) logging tables. All recognized updates can be logged and printed.
 * Also, the monitored Hibernate model can be refresh automatically and
 * incrementally.
 */
public class IncrementalSync {

	private final Connection sqlConnection;
	private final Session session;
	private final String prefix;
	private ArrayList<Table> tables;
	private MODE mode;

	private Boolean remoteChangeFlag = false;
	private volatile boolean running = false;
	private volatile int syncInterval = 1000;

	private static final Logger logger = Logger.getLogger(IncrementalSync.class);

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
	public IncrementalSync(Connection sqlConnection, HbDataStore dbStore, Session session, String prefix, MODE mode) {
		this.sqlConnection = sqlConnection;
		this.tables = SyncUtil.getTables(dbStore);
		this.prefix = prefix;
		this.mode = mode;
		this.session = session;
	}

	/**
	 * Returns the currently set synchronization interval in milliseconds.
	 */
	public int getSyncInterval() {
		return syncInterval;
	}
	
	public MODE getMode() {
		return this.mode;
	}
	
	public void setMode(MODE mode) {
		this.mode = mode;
	}

	/**
	 * Overrides the tables, created from the HbDataStore Mapping.
	 * 
	 * @param tables
	 *            A ArrayList of tables with proper information
	 */
	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
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
	 * Enables automatic saving of model changes for a given object and all
	 * childs recursively. Changes are detected with Adapters and written into
	 * the database.
	 * 
	 * @param parentObject
	 *            The root object or a parent object in the model tree
	 */
	public void enableSaving(EObject parentObject) {

		parentObject.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {

				Object oldValue = notification.getOldValue();
				Object newValue = notification.getNewValue();
				Object notifier = notification.getNotifier();

				// TODO: Saving also for Insert & Delete

				// Check first, if this is a real change
				if (oldValue != null && !oldValue.equals(newValue) || newValue != null && !newValue.equals(oldValue)) {

					// Now check, if the change comes from the database refresh
					// algorithm
					synchronized (remoteChangeFlag) {
						if (!remoteChangeFlag) {

							Transaction transaction = session.beginTransaction();
							session.saveOrUpdate(notifier);
							transaction.commit();
						}
					}

				}
			}
		});
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
						e.printStackTrace();
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
	 * Returns, if the synchronization is running at the moment
	 * 
	 * @return true, if the synchronization is running (asynchronously). false,
	 *         if it does not run or will stop before the next iteration
	 */
	public boolean isRunning() {
		return running;
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
	private void sync(TableAdapter syncTable) {
		ArrayList<String> updates = syncTable.getUpdates();

		if (updates != null) {

			if (updates.size() > 0) {

				// LOGGING
				String loggingString = "Updates in the last " + syncInterval + " miliseconds ("
						+ Calendar.getInstance().getTime().toString() + ") at table "
						+ syncTable.getTable().getTableName() + " (" + syncTable.getTable().getEntityName() + ") "
						+ "at Primary Key(s): " + SyncUtil.prettyPrintArrayList(updates);

				if (this.mode == MODE.LOG_ONLY || this.mode == MODE.LOG_AND_SYNC) {
					logger.info(loggingString);
				} else {
					logger.debug(loggingString);
				}
			}

			// REFRESHING
			if (this.mode == MODE.SYNC_ONLY || this.mode == MODE.LOG_AND_SYNC) {

				// For each update, get Element with query and refresh it
				for (String update : updates) {

					String entityName = syncTable.getTable().getEntityName();
					String identifierProperty = syncTable.getTable().getIdentifierProperty();

					// Updates using SESSION QUERY
					Transaction transaction = session.beginTransaction();
					Query query = session
							.createQuery("FROM " + entityName + " WHERE " + identifierProperty + " = " + update);
					@SuppressWarnings("unchecked")
					List<EObject> resultsDB = query.list();
					transaction.commit();

					// Updates using CRITERIA
					Criteria criteria = session.createCriteria(entityName);
					// FIXME: identifierProperty always Long?
					criteria.add(Restrictions.eq(identifierProperty, Long.parseLong(update)));
					criteria.setProjection(Projections.rowCount());

					// Merging RESULTS
					int sizeHBQuery = Math.toIntExact((long) criteria.uniqueResult());
					int sizeDBQuery = resultsDB.size();

					if (sizeDBQuery == 1 && sizeHBQuery == 1) {

						// Element found using both queries. Update element and
						// parent

						EObject elementToRefresh = resultsDB.get(0);
						EObject parent = elementToRefresh.eContainer();

						synchronized (remoteChangeFlag) {
							remoteChangeFlag = true;

							session.refresh(elementToRefresh);
							session.refresh(parent);

							remoteChangeFlag = false;
						}

					} else if (sizeDBQuery == 0 && sizeHBQuery == 1) {

						// Only found using criteria (Probably insert). Update
						// parent

						criteria = session.createCriteria(entityName);
						// FIXME: identifierProperty always Long?
						criteria.add(Restrictions.eq(identifierProperty, Long.parseLong(update)));

						EObject insertedElement = (EObject) criteria.list().get(0);
						EObject parent = insertedElement.eContainer();

						session.refresh(parent);

					} else if (sizeDBQuery == 1 && sizeHBQuery == 0) {

						// Only found using query (Probably delete). Update
						// parent

						EObject deletedElement = resultsDB.get(0);
						EObject parent = deletedElement.eContainer();

						session.refresh(parent);

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

	/**
	 * The IncrementalSync mode. Possible are logging and/or synchronization.
	 */
	public enum MODE {
		LOG_ONLY, SYNC_ONLY, LOG_AND_SYNC
	}

}
