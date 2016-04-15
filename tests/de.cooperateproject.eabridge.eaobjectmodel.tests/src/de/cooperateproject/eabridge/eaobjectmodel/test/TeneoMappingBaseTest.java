package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.sql.Connection;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory.LiquibaseLogger;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.H2TestDB;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.H2TestDB.DBInitializer;

public abstract class TeneoMappingBaseTest {

	private H2TestDB testDb;

	@BeforeClass
	public static void init() {
		BasicConfigurator.resetConfiguration();
		final ConsoleAppender appender = new ConsoleAppender(new PatternLayout("%m%n"));
		appender.setThreshold(Priority.INFO);
		appender.addFilter(new Filter() {
			@Override
			public int decide(LoggingEvent arg0) {
				if (LiquibaseLogger.class.getName().equals(arg0.getLoggerName())) {
					if (arg0.getLevel().toInt() <= Level.INFO_INT) {
						return Filter.DENY;
					}
				}
				return Filter.NEUTRAL;
			}
		});
		BasicConfigurator.configure(appender);
		LiquibaseFactory.init();
	}

	@Before
	public void setup() throws Exception {
		testDb = null;
	}

	@After
	public void finalize() throws Exception {
		testDb.close();
	}

	protected void initTestDb(DBInitializer initilaizer) throws Exception {
		testDb = new H2TestDB(initilaizer);
	}

	public Connection getDbConnection() {
		return testDb.getDbConnection();
	}

	public HbDataStore getDataStore() {
		return testDb.getDataStore();
	}

}
