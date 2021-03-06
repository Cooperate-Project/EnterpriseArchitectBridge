package de.cooperateproject.eabridge.incrementalsync.tests.h2;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.incrementalsync.monitoring.Table;
import de.cooperateproject.eabridge.incrementalsync.monitoring.TableAdapter;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync.MODE;
import de.cooperateproject.eabridge.incrementalsync.synchronization.SyncUtil;
import de.cooperateproject.eabridge.tests.common.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

/**
 * Contains basic test cases for the IncrementalSync-Project using a
 * H2-Database.
 */
public class SyncTest extends TeneoMappingBaseTest {

	public static final String DB_SCHEMA = "test";

	private SessionWrapper sessionWrapper;
	private IncrementalSync sync;

	@Before
	public void setUp() throws Exception {
		// Initializes environment. See: TeneoMappingBaseTest
		initTestDb(TestResource.EASingleClassChangelog);

		// Initializes logging tables. In a real environment, this is done by
		// the generated SQL-Code from the IncrementalDbSyncUtil-Project.
		initLoggingTable();

		// Opens a new session
		sessionWrapper = getTestDB().getDataStore().createSessionWrapper();

		// Creates the IncrementalSync-Object
		sync = new IncrementalSync(getTestDB().getDbConnection(), sessionWrapper, "ht_",
				MODE.LOG_AND_SYNC);
	}

	@After
	public void tearDown() throws Exception {
		// Stop the incremental sync process
		sync.stop();

		// Close the opened session
		sessionWrapper.close();
	}

	@Ignore @Test
	public void extractMappingTest() throws Exception {

		// Get the list of tables from the current mapping
		ArrayList<Table> tables = SyncUtil.getTables(this.sessionWrapper);

		// With the current mapping, there should be now 9 elements
		assertEquals(9, tables.size());

	}

	/**
	 * Tests the polling mechanism to receive update notes from database logging
	 * tables.
	 */
	@Test
	public void testUpdatePolling() throws Exception {

		// Initializes a table and listener. In a real environment, this is
		// extracted from the hibernate mapping.
		Table table = new Table(String.format("%s.t_object", DB_SCHEMA), "Element", "Object_ID", "ElementID");
		TableAdapter listener = new TableAdapter(getTestDB().getDbConnection(), table, "ht_");

		// Adds a logging entry. In a real environment, this is done by
		// generated database triggers.
		getTestDB().getDbConnection().createStatement()
				.execute(String.format("INSERT INTO %s.ht_t_object VALUES (2, NOW(6));", DB_SCHEMA));

		// Gets the update. Should find an entry for element #2.
		ArrayList<String> updates = listener.getUpdates();
		assert (updates.size() == 1);
		assertEquals(updates.get(0), "2");
	}

	/**
	 * Tests the behavior of receiving an element-udpate and refreshing it.
	 */
	@Test
	public void testElementUpdate() throws Exception {

		// New name for element update
		final String newName = "ChangedTheName";

		// Use hibernate to get an element
		Element element = (Element) sessionWrapper.executeQuery("FROM Element WHERE ElementID = 2").get(0);

		// Starts IncrementalSync asynchronously
		sync.startASync();

		// Changes the element name and simulates an entry in the logging table
		getTestDB().getDbConnection().createStatement()
				.execute(String.format("UPDATE %s.t_object SET Name='%s' WHERE Object_ID=2", DB_SCHEMA, newName));
		getTestDB().getDbConnection().createStatement()
				.execute(String.format("INSERT INTO %s.ht_t_object VALUES (2, NOW(6));", DB_SCHEMA));
		getTestDB().getDbConnection().commit();

		// Sleep for 1.1 seconds and let IncrementalSync work (should refresh
		// element)
		Thread.sleep(1100);

		// Test, if the name has changed correctly
		assertEquals(element.getName(), newName);
	}

	/**
	 * Tests the behavior of inserting a new element an refreshing the parent.
	 */
	@Test
	public void testElementInsert() throws Exception {

		// Using hibernate to receive a package from the dbstore
		Package parent = (Package) sessionWrapper.executeQuery("FROM Package WHERE Parent_ID = 1").get(0);
		assertEquals(parent.getElements().size(), 1);

		// Starts IncrementalSync asynchronously
		sync.startASync();

		// Insert a new element an simulate logging entry
		getTestDB().getDbConnection().createStatement()
				.execute(String.format(
						"INSERT INTO %s.t_object (Name, Object_ID, ea_guid, Package_ID, Object_Type, Author, Complexity, Abstract, Scope, Status, GenType, ParentID, Classifier) VALUES('NewItem', 3, '{143BBD0B-9C9D-4a9b-A983-9D1C5B564CA7}', 2, 'Class', 'sebinside', 1, 0, 'Public', 'Proposed', 'Java', 0, 0)",
						DB_SCHEMA));
		getTestDB().getDbConnection().createStatement()
				.execute(String.format("INSERT INTO %s.ht_t_object VALUES (3, NOW(6));", DB_SCHEMA));
		getTestDB().getDbConnection().commit();

		// Sleep for 1.1 seconds and let IncrementalSync work
		Thread.sleep(1100);

		// Count Elements again
		assertEquals(2, parent.getElements().size());

	}

	/**
	 * Tests the behavior of deleting an element.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testElementDelete() throws Exception {

		// Using hibernate to receive a package from the dbstore
		Package parent = (Package) sessionWrapper.executeQuery("FROM Package WHERE Parent_ID = 1").get(0);
		assertEquals(parent.getElements().size(), 1);

		// Starts IncrementalSync asynchronously
		sync.startASync();

		// Delete Element and simulate logging entry
		getTestDB().getDbConnection().createStatement()
				.execute(String.format("DELETE FROM %s.t_object WHERE Object_ID = 2", DB_SCHEMA));
		getTestDB().getDbConnection().createStatement()
				.execute(String.format("INSERT INTO %s.ht_t_object VALUES (2, NOW(6));", DB_SCHEMA));
		getTestDB().getDbConnection().commit();

		// Sleep for 1.1 seconds and let IncrementalSync work
		Thread.sleep(1100);

		// FIXME: This part should be done by IncremenalSync!
		Element entity = parent.getElements().get(0);
		try {
			sessionWrapper.refresh(entity);
		} catch (org.hibernate.UnresolvableObjectException e) {
			((Session) sessionWrapper.getSession()).evict(entity);
		}

		// Count the elements
		assertEquals(0, parent.getElements().size());

	}

	@Test
	public void testLocalSaving() throws Exception {

		// Using hibernate to receive a parent / root object
		Package parent = (Package) sessionWrapper.executeQuery("FROM Package WHERE Parent_ID = 1").get(0);

		// Use hibernate to get an element
		Element element = (Element) sessionWrapper.executeQuery("FROM Element WHERE ElementID = 2").get(0);
		String initialName = element.getName();

		// Change the name
		element.setName("NewName1");

		// Saving was not enabled. This change should be not persisted.
		ResultSet rs = getTestDB().getDbConnection().createStatement()
				.executeQuery(String.format("SELECT Name FROM %s.t_object WHERE Object_ID = 2", DB_SCHEMA));
		rs.next();
		assertEquals(initialName, rs.getString(1));

		// Now enable adapters (element is child of parent, recursive test!)
		sync.enableSaving(parent);

		// Change the name again
		element.setName("NewName2");

		// Now, the change should have been persisted
		ResultSet rs2 = getTestDB().getDbConnection().createStatement()
				.executeQuery(String.format("SELECT Name FROM %s.t_object WHERE Object_ID = 2", DB_SCHEMA));
		rs2.next();
		assertEquals("NewName2", rs2.getString(1));

		// Now disable adapters again
		sync.disableSaving();

		// Change the name a last time
		element.setName("NewName3");

		// The change should not have been persisted again
		ResultSet rs3 = getTestDB().getDbConnection().createStatement()
				.executeQuery(String.format("SELECT Name FROM %s.t_object WHERE Object_ID = 2", DB_SCHEMA));
		rs3.next();
		assertEquals("NewName2", rs3.getString(1));

	}

	/**
	 * Generates logging tables for the Enterprise Architect Meta-Model to use
	 * with the base test cases. In a real environment, this is done by another
	 * generator.
	 */
	private void initLoggingTable() throws SQLException {
		Statement statement = getTestDB().getDbConnection().createStatement();
		String tableNames[] = { "attribute", "attributeconstraints", "attributetag", "connector", "diagram",
				"diagramlinks", "diagramobjects", "object", "operation", "operationparams", "package" };
		for (String tableName : tableNames)
			statement.execute(String.format(
					"CREATE TABLE %s.`ht_t_" + tableName
							+ "` (`ID` INT(11) NOT NULL,`Timestamp` TIMESTAMP(6) NULL DEFAULT NULL,PRIMARY KEY (`ID`))",
					DB_SCHEMA));
	}

}
