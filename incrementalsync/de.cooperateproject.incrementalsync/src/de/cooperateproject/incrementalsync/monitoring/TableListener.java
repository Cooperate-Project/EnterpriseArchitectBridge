package de.cooperateproject.incrementalsync.monitoring;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * A table listener monitors all changes in a database table using generated
 * logging tables. The getUpdates()-Method returns all changes since the last
 * call or since the creation of the Listener.
 */
public class TableListener {

	// These are the constants from the logging tables
	// e.G. created by an Trigger Generator
	private static String COLUMN_ID = "ID";
	private static String COLUMN_TIMESTAMP = "Timestamp";

	private Connection sqlConnection;
	private Table table;
	private String prefix;
	private Timestamp timestamp;
	private boolean isH2 = false;

	/**
	 * Creates a new Table-Listener-Instance, starting with the current time.
	 * 
	 * @param sqlConnection
	 *            The SQL-Connection of the database with the persisted model
	 * @param table
	 *            The table of a mapped entity
	 * @param prefix
	 *            The prefix of the logging tables
	 */
	public TableListener(Connection sqlConnection, Table table, String prefix) {
		this.sqlConnection = sqlConnection;
		this.table = table;
		this.prefix = prefix;

		// Set NOW(6) as initial timestamp
		this.timestamp = getCurrentDataBaseTimestamp();

	}

	/**
	 * Tries to retrieve the current database timestamp with a Query.
	 * 
	 * @return The current time (microseconds) or null if there was a connection
	 *         problem
	 */
	private Timestamp getCurrentDataBaseTimestamp() {
		try {
			Statement s = sqlConnection.createStatement();
			ResultSet rs = s.executeQuery("SELECT NOW(6) as TS");

			if (rs.next()) {
				return rs.getTimestamp("TS", Calendar.getInstance());
			} else {
				throw new SQLException("Unable to retrieve timestamp!");
			}

		} catch (SQLException e) {
			System.out.println(
					"Unexpected SQLException while initialising Listener for table " + table.getEntityName() + ".");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Determines, that the SQL Querries use the H2 Dialect and Functions
	 * instead of the MySQL ones.
	 */
	public void useH2Dialect() {
		this.isH2 = true;
	}

	/**
	 * Returns the table monitored by the listener (NOT the logging table!)
	 * 
	 * @return A Table-Object with information about database and mapping
	 */
	public Table getTable() {
		return this.table;
	}

	/**
	 * Returns all updates since the last call or the creation of the listener
	 * instance.
	 * 
	 * @return An ArrayList-Object with primary keys (String) of all changed
	 *         entities or null if there was an connection problem.
	 */
	public ArrayList<String> getUpdates() {

		try {

			// Get Updates
			Statement s = sqlConnection.createStatement();
			ResultSet rs = s.executeQuery(isH2 ? makeStatementH2() : makeStatementMySQL());
			ArrayList<String> updateList = new ArrayList<String>();

			// Read Updates
			while (rs.next()) {
				this.timestamp = rs.getTimestamp("TS");
				updateList.add(rs.getString(COLUMN_ID));
			}

			s.close();
			return updateList;

		} catch (SQLException e) {
			System.out.println("SQL Exception while updating " + table.getEntityName());
			e.printStackTrace();
			return null;
		}
	}

	private String getTriggerTableName() {
		// e.G. "ht_" + "t_object" = "ht_t_object"
		return prefix + table.getTableName();
	}

	private String makeStatementMySQL() {
		// TS = Current timestamp, COLUMN_ID = changes since last call
		return "SELECT NOW(6) as `TS`, `" + COLUMN_ID + "` FROM `" + getTriggerTableName() + "` WHERE `"
				+ COLUMN_TIMESTAMP + "` >= STR_TO_DATE('" + timestamp.toString() + "', '%Y-%m-%d %H:%i:%s.%f')";
	}

	private String makeStatementH2() {
		return "SELECT NOW(6) as `TS`, `" + COLUMN_ID + "` FROM `" + getTriggerTableName() + "` WHERE `"
				+ COLUMN_TIMESTAMP + "` >= PARSEDATETIME('" + timestamp.toString() + "', 'yyyy-mm-dd hh:mm:ss.SSS')";
	}

}
