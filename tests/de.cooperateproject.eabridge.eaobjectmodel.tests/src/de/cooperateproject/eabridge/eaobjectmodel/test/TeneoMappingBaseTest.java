package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory.LiquibaseLogger;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.Liquibase;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;
import liquibase.exception.DatabaseException;
import liquibase.structure.core.Data;

public abstract class TeneoMappingBaseTest {

	private static MySQLTestDB testDb;

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
	/**
	@Before
	public void setup() throws Exception {
		testDb = null;
	}
		@AfterClass
	public static void finalize() throws Exception {
		testDb.close();
	}
	*/

	public static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
	public static String generateChangelog() throws DatabaseException, IOException, ParserConfigurationException {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		
		Liquibase liquibase = getLiquibase();
		liquibase.generateChangeLog(liquibase.getDatabase().getDefaultSchema() , new DiffToChangeLog(new DiffOutputControl()), ps, Data.class);
		
		String content = baos.toString();
		return content;
	}


	protected static void initTestDb(TestResource testResource) throws Exception {
		testDb = new MySQLTestDB(testResource, "test");
	}

	public Connection getDbConnection() {
		return testDb.getDbConnection();
	}

	public static HbDataStore getDataStore() {
		return testDb.getDataStore();
	}
	
	public static Liquibase getLiquibase() {
		return testDb.getLiquibase();
	}
	
	public static Package loadModelFromResource(String resourcePath) throws IOException {
		Package loadedPackage = null;
		InputStream is = null;
		try {
			is = ObjectModel2EAMappingTest.class.getClassLoader().getResourceAsStream(resourcePath);
			loadedPackage = EAObjectModelHelper.loadModel(is);
		} finally {
			IOUtils.closeQuietly(is);
		}
		return loadedPackage;
	}
	
}
