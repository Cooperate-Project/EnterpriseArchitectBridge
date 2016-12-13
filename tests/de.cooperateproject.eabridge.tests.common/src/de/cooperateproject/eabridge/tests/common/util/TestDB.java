package de.cooperateproject.eabridge.tests.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.teneo.hibernate.HbDataStore;

import liquibase.CatalogAndSchema;
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

	@SuppressWarnings("unchecked")
	public String generateChangelog() throws DatabaseException, IOException, ParserConfigurationException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		try {
			Liquibase liquibase = getLiquibase();
			CatalogAndSchema defaultSchema = liquibase.getDatabase().getDefaultSchema();
			DiffOutputControl diffOutputControl = new DiffOutputControl();
			liquibase.generateChangeLog(defaultSchema, new DiffToChangeLog(diffOutputControl), ps, Data.class);
			return baos.toString();
		} finally {
			IOUtils.closeQuietly(ps);
			IOUtils.closeQuietly(baos);
		}
	}

	@Override
	public void close() throws IOException {
		testDb.close();
	}

	private static MySQLTestDB initTestDb(TestResource testResource) throws Exception {
		return new MySQLTestDB(testResource, "test");
	}

}
