package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.teneo.hibernate.HbDataStore;

import liquibase.Liquibase;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;
import liquibase.exception.DatabaseException;
import liquibase.structure.core.Data;

public class TestDB implements Closeable {

	private final MySQLTestDB testDb;

	public TestDB(TestResource testResource) throws Exception {
		testDb = initTestDb(testResource);
	}

	public Connection getDbConnection() {
		return testDb.getDbConnection();
	}

	public HbDataStore getDataStore() {
		return testDb.getDataStore();
	}

	public Liquibase getLiquibase() {
		return testDb.getLiquibase();
	}

	public String generateChangelog() throws DatabaseException, IOException, ParserConfigurationException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		Liquibase liquibase = getLiquibase();
		liquibase.generateChangeLog(liquibase.getDatabase().getDefaultSchema(),
				new DiffToChangeLog(new DiffOutputControl()), ps, Data.class);

		String content = baos.toString();
		return content;
	}

	@Override
	public void close() throws IOException {
		testDb.close();
	}

	private static MySQLTestDB initTestDb(TestResource testResource) throws Exception {
		return new MySQLTestDB(testResource, "test");
	}

}
