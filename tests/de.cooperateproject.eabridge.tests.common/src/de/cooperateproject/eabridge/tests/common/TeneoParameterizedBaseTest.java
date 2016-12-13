package de.cooperateproject.eabridge.tests.common;

import java.io.IOException;

import org.junit.AfterClass;

import de.cooperateproject.eabridge.tests.common.util.TestDB;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public class TeneoParameterizedBaseTest extends BaseTest {

	private static TestDB testDb;

	@AfterClass
	public static void deinitialize() throws IOException {
		if (testDb != null) {
			testDb.close();
			testDb = null;
		}
	}

	protected static void initTestDb(TestResource testResource) throws Exception {
		testDb = new TestDB(testResource);
	}

	public static TestDB getTestDb() {
		return testDb;
	}
	
}
