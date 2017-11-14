package de.cooperateproject.eabridge.tests.common.util;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.cfg.Environment;

import com.google.common.collect.ImmutableMap;

import de.cooperateproject.eabridge.services.DatabaseFactory;
import liquibase.Liquibase;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;

public class MySQLTestDB implements Closeable {

	public interface DBInitializer {
		public void init(Liquibase liquibase) throws Exception;
	}

	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String JDBC_USER = "";
	private static final String JDBC_PASS = "";
	private static final String JDBC_DIALECT = org.hibernate.dialect.MySQLInnoDBDialect.class.getName();

	private final DatabaseFactory dbFactory;
	private final Connection dbConnection;
	private final HbDataStore dbStore;
	private final Liquibase liquibase;

	static {

//		try {
//			org.h2.tools.Server.createWebServer("-webPort", "10500").start();
//		} catch (SQLException e) {
//			org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MySQLTestDB.class);
//			logger.warn("Could not initialize H2 webserver.", e);
//		}

	}

	public MySQLTestDB(TestResource testResource, String schema) throws Exception {
		String JDBC_URL = "jdbc:h2:mem:" + schema
				+ ";DATABASE_TO_UPPER=false;IGNORECASE=TRUE;INIT=CREATE SCHEMA IF NOT EXISTS " + schema;
		
		
		Class.forName(JDBC_DRIVER);

		dbConnection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		
		MySQLDatabase database = new MySQLDatabase();
		database.setConnection(new JdbcConnection(dbConnection));
		liquibase = LiquibaseFactory.getInstance(testResource, database);
		liquibase.update((String) null);
		
		dbFactory = new TestDBFactory(ImmutableMap.<String,String>builder()
                .put(Environment.DRIVER, JDBC_DRIVER)
                .put(Environment.USER, JDBC_USER)
                .put(Environment.URL, JDBC_URL)
                .put(Environment.PASS, JDBC_PASS)
                .put(Environment.DIALECT, JDBC_DIALECT)
                .put(Environment.DEFAULT_SCHEMA, schema)
                .build());
		
		dbStore = dbFactory.getDataStore();
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
	
}
