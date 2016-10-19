package de.cooperateproject.incrementalsync.synchronization;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * The TransactinoProvider acts like a singleton and ensures, that there is only
 * one transaction open at a time.
 */
class TransactionProvider {

	private Transaction transaction = null;
	private Session session = null;

	/**
	 * Creates a new TransactionProvider, working with a given session.
	 * 
	 * @param session
	 *            A Hibernate Session to monitor
	 */
	protected TransactionProvider(Session session) {
		this.session = session;
	}

	/**
	 * Opens a transaction, if there is no opened transaction at the moment
	 */
	protected synchronized void openTransaction() {

		if (transaction == null || !transaction.isActive() || transaction.wasCommitted()
				|| transaction.wasRolledBack()) {

			transaction = session.beginTransaction();
		}
	}

	/**
	 * Commits the currently opened transaction, if possible
	 */
	protected synchronized void commitTransaction() {
		if (transaction != null && !(transaction.wasCommitted() || transaction.wasRolledBack())) {

			transaction.commit();
		}
	}

}