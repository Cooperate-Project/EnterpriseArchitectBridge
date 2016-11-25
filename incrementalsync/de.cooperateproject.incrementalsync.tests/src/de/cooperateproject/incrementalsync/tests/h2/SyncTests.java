package de.cooperateproject.incrementalsync.tests.h2;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.incrementalsync.monitoring.Table;
import de.cooperateproject.incrementalsync.monitoring.TableAdapter;
import de.cooperateproject.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.incrementalsync.synchronization.IncrementalSync.MODE;
import de.cooperateproject.incrementalsync.synchronization.SyncUtil;

/**
 * Contains basic test cases for the IncrementalSync-Project using a
 * H2-Database.
 */
public class SyncTests extends TeneoMappingBaseTest {

	public static final String DB_SCHEMA = "test";

	private Session session;
	private IncrementalSync sync;

	@Before
	public void setUp() throws Exception {
		// Initializes environment. See: TeneoMappingBaseTest
		initTestDb(TestResource.EASingleClassChangelog);

		// Initializes logging tables. In a real environment, this is done by
		// the generated SQL-Code from the IncrementalDbSyncUtil-Project.
		initLoggingTable();

		// Opens a new session
		session = getTestDB().getDataStore().getSessionFactory().openSession();

		// Creates the IncrementalSync-Object
		sync = new IncrementalSync(getTestDB().getDbConnection(), getTestDB().getDataStore(), session, "ht_",
				MODE.LOG_AND_SYNC);
	}

	@After
	public void tearDown() throws Exception {
		// Stop the incremental sync process
		sync.stop();

		// Close the opened session
		session.close();
	}

	@Test
	public void extractMappingTest() throws Exception {

		// Get the list of tables from the current mapping
		ArrayList<Table> tables = SyncUtil.getTables(getTestDB().getDataStore());

		// With the current mapping, there should be 10 elements
		assertEquals(10, tables.size());

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
		Element element = (Element) session.createQuery("FROM Element WHERE ElementID = 2").list().get(0);

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
		Package parent = (Package) session.createQuery("FROM Package WHERE Parent_ID = 1").list().get(0);
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
		Package parent = (Package) session.createQuery("FROM Package WHERE Parent_ID = 1").list().get(0);
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
			session.refresh(entity);
		} catch (org.hibernate.UnresolvableObjectException e) {
			session.evict(entity);
		}

		// Count the elements
		assertEquals(0, parent.getElements().size());

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
