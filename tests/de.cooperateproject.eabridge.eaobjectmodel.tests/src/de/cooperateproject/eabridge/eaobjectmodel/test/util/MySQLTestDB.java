package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.eclipse.emf.teneo.hibernate.HbDataStore;

import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseProperties;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabasePropertiesFactory;
import de.cooperateproject.eabridge.eaobjectmodel.database.impl.DatabaseFactoryImpl;
import de.cooperateproject.eabridge.eaobjectmodel.database.impl.DatabasePropertiesFactoryImpl;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;

public class MySQLTestDB implements Closeable {

	public interface DBInitializer {
		public void init(Liquibase liquibase) throws Exception;
	}

	private static final DatabaseFactory dbFactory = new DatabaseFactoryImpl();
	private static final DatabasePropertiesFactory dbPropsFactory = new DatabasePropertiesFactoryImpl();

	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String JDBC_USER = "a";
	private static final String JDBC_PASS = "a";
//	private static final String JDBC_SCHEMA = "TEST";
//	private static final String JDBC_URL = "jdbc:h2:mem:" + JDBC_SCHEMA
//			+ ";MODE=MYSQL;DATABASE_TO_UPPER=false;IGNORECASE=TRUE;INIT=CREATE SCHEMA IF NOT EXISTS " + JDBC_SCHEMA;
	private static final String JDBC_DIALECT = org.hibernate.dialect.MySQLInnoDBDialect.class.getName();

	private final Connection dbConnection;
	private final HbDataStore dbStore;
	private final Liquibase liquibase;
	private final Database database;

	static {
		try {
			org.h2.tools.Server.createWebServer("-webPort", "10500").start();
		} catch (SQLException e) {
			org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MySQLTestDB.class);
			logger.warn("Could not initialize H2 webserver.", e);
		}
	}

	public MySQLTestDB(TestResource testResource, String schema) throws Exception {
		String JDBC_URL = "jdbc:h2:mem:" + schema
				+ ";MODE=MYSQL;DATABASE_TO_UPPER=false;IGNORECASE=TRUE;INIT=CREATE SCHEMA IF NOT EXISTS " + schema;
		
		Class.forName("org.h2.Driver");

		dbConnection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		
		database = new MySQLDatabase();
		database.setConnection(new JdbcConnection(dbConnection));
		liquibase = LiquibaseFactory.getInstance(testResource, database);
		liquibase.update((String) null);
		
		DatabaseProperties dbProps = dbPropsFactory.create(JDBC_DRIVER, JDBC_USER, JDBC_URL, JDBC_PASS, JDBC_DIALECT,
				schema);
		dbStore = dbFactory.createDataStore(dbProps);
	}

	@Override
	public void close() throws IOException {
		try {
			dbFactory.destoryDataStore(dbStore);
			dbConnection.createStatement().execute("SHUTDOWN");
			dbConnection.close();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

	public Connection getDbConnection() {
		return dbConnection;
	}

	public HbDataStore getDataStore() {
		return dbStore;
	}

	public Liquibase getLiquibase() {
		return liquibase;
	}

	public Database getDatabase() {
		return database;
	}
	
	
}
