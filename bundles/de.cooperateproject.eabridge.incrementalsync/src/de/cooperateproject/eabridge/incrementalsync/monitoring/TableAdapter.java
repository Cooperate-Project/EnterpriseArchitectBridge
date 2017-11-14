package de.cooperateproject.eabridge.incrementalsync.monitoring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A table adapter monitors all changes in a database table using generated
 * logging tables. The getUpdates()-Method returns all changes since the last
 * call or since the creation of the adapter.
 */
public class TableAdapter {

	private static Logger logger = LoggerFactory.getLogger(TableAdapter.class);

	// These are the constants from the logging tables
	// e.G. created by an Trigger Generator
	private static final String COLUMN_ID = "ID";
	private static final String COLUMN_TIMESTAMP = "Timestamp";

	private Connection sqlConnection;
	private Table table;
	private String prefix;
	private Optional<Timestamp> timestamp;

	/**
	 * Creates a new Table-adapter-Instance, starting with the current time.
	 * 
	 * @param sqlConnection
	 *            The SQL-Connection of the database with the persisted model
	 * @param table
	 *            The table of a mapped entity
	 * @param prefix
	 *            The prefix of the logging tables
	 */
	public TableAdapter(Connection sqlConnection, Table table, String prefix) {
		this.sqlConnection = sqlConnection;
		this.table = table;
		this.prefix = prefix;

		// Set NOW as initial time stamp
		this.timestamp = getCurrentDataBaseTimestamp();
	}

	/**
	 * Tries to retrieve the current database time stamp with a Query.
	 * 
	 * @return The current time (microseconds) or null if there was a connection
	 *         problem
	 */
	private Optional<Timestamp> getCurrentDataBaseTimestamp() {
		try (Statement s = sqlConnection.createStatement()) {
			
			ResultSet rs = s.executeQuery("SELECT NOW(6) as TS");

			if (rs.next()) {
				return Optional.ofNullable(rs.getTimestamp("TS", Calendar.getInstance()));
			} else {
				throw new SQLException("Unable to retrieve timestamp!");
			}

		} catch (SQLException e) {
			logger.error("Unexpected SQLException while initialising adapter for table " + table.getEntityName() + ".",
					e);
		}
		return Optional.empty();
	}

	/**
	 * Returns the table monitored by the adapter (NOT the logging table!)
	 * 
	 * @return A Table-Object with information about database and mapping
	 */
	public Table getTable() {
		return this.table;
	}

	private String getTriggerTableName() {
		// e.G. "ht_" + "t_object" = "ht_t_object"
		// OR: "test." + "ht_" + "t_object" = "test.ht_t_object"

		if (table.getTableName().contains(".")) {
			String[] parts = table.getTableName().split("[.]");

			if (parts.length != 2) {
				logger.debug("Database table name contains more than one sub schema. Unexpected.");
				return "SCHEMA-ERROR";
			}

			return parts[0] + "." + prefix + parts[1];
		} else {
			return prefix + table.getTableName();
		}
	}

	/**
	 * Returns all updates since the last call or the creation of the adapter
	 * instance.
	 * 
	 * @return An ArrayList-Object with primary keys (String) of all changed
	 *         entities or null if there was an connection problem.
	 */
	public ArrayList<String> getUpdates() {

		// Attribute-Name for NOW(6)
		String nowAttribute = "TS";

		// Prepare Statement Pattern
		String statementPattern = "SELECT NOW(6) as %s, %s FROM %s WHERE %s >= ?";
		String statement = String.format(statementPattern, nowAttribute, COLUMN_ID, getTriggerTableName(),
				COLUMN_TIMESTAMP);

		try (PreparedStatement ps = sqlConnection.prepareStatement(statement)) {

			// Check timestamp
			if (!timestamp.isPresent()) {
				throw new SQLException("No timestamp available!");
			}

			// Get Updates
			ps.setTimestamp(1, timestamp.get());
			ResultSet rs = ps.executeQuery();
			ArrayList<String> updateList = new ArrayList<String>();

			// Read Updates
			while (rs.next()) {
				this.timestamp = Optional.ofNullable(rs.getTimestamp(nowAttribute));
				updateList.add(rs.getString(COLUMN_ID));
			}

			return updateList;

		} catch (SQLException e) {
			logger.error("SQL Exception while updating " + table.getEntityName(), e);
			return null;
		}
	}
}