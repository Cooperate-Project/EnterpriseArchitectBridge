package de.cooperateproject.eabridge.tests.common;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

import de.cooperateproject.eabridge.tests.common.util.TestDB;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public abstract class TeneoMappingBaseTest extends BaseTest {

	private TestDB testDb;
	
	@Before
	public void setup() throws Exception {
		resetTestDB();
	}
	
	@After
	public void finalize() throws Exception {
		resetTestDB();
	}
	
	private void resetTestDB() throws IOException {
		if (testDb != null) {
			testDb.close();
			testDb = null;
		}
	}

	protected void initTestDb(TestResource testResource) throws Exception {
		testDb = new TestDB(testResource);
	}
	
	protected TestDB getTestDB() {
		return testDb;
	}
	
}
