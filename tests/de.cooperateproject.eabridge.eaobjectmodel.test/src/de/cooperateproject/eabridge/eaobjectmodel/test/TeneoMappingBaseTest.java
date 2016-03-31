package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.sql.Connection;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.junit.After;
import org.junit.Before;

import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB.DBInitializer;

public abstract class TeneoMappingBaseTest {

	private MySQLTestDB testDb;

	@Before
	public void setup() throws Exception {
		testDb = null;
	}

	@After
	public void finalize() throws Exception {
		testDb.close();
	}
	
	protected void initTestDb(DBInitializer initilaizer) throws Exception {
		testDb = new MySQLTestDB(initilaizer);
	}

	public Connection getDbConnection() {
		return testDb.getDbConnection();
	}

	public HbDataStore getDataStore() {
		return testDb.getDataStore();
	}

	
}
