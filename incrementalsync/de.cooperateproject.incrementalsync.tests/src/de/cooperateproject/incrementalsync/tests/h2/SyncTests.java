package de.cooperateproject.incrementalsync.tests.h2;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.eclipse.core.internal.registry.osgi.EquinoxUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.incrementalsync.monitoring.Table;
import de.cooperateproject.incrementalsync.monitoring.TableListener;
import de.cooperateproject.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.incrementalsync.synchronization.IncrementalSync.MODE;

/**
 * Contains basic test cases for the IncrementalSync-Project using a
 * H2-Database.
 */
public class SyncTests extends TeneoMappingBaseTest {

	private Session session;
	private IncrementalSync sync;
	private Table table;

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

		// Creates a table. In a real environment, this step ist automated
		table = new Table("t_object", "Element", "Object_ID", "ElementID");
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(table);
		sync.setTables(tables);
		sync.useH2Dialect();

	}

	@After
	public void tearDown() throws Exception {
		// Stop the incremental sync process
		sync.stop();

		// Close the opened session
		session.close();
	}

	/**
	 * Tests the polling mechanism to receive update notes from database logging
	 * tables.
	 */
	@Test
	public void testUpdatePolling() throws Exception {

		// Initializes a table. In a real environment, this is extracted from
		// the hibernate mapping.
		TableListener listener = new TableListener(getTestDB().getDbConnection(), table, "ht_");
		listener.useH2Dialect();

		// Adds a logging entry. In a real environment, this is done by
		// generated database triggers.
		getTestDB().getDbConnection().createStatement().execute("INSERT INTO ht_t_object VALUES (2, NOW(6));");

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

		// Using hibernate to receive a element from the dbstore
		Element element = (Element) session.createQuery("FROM Element WHERE ElementID = 2").list().get(0);

		// Starts IncrementalSync asynchronously
		sync.startASync();

		// Changes the element name and simulates an entry in the logging table
		element.setName("ChangedTheName");
		getTestDB().getDbConnection().createStatement().execute("INSERT INTO ht_t_object VALUES (2, NOW(6));");

		// Sleep for 1.1 seconds and let IncrementalSync work
		Thread.sleep(1100);

		// Use hibernate to get this element again
		element = (Element) session.createQuery("FROM Element WHERE ElementID = 2").list().get(0);
		String NewElementName = element.getName();

		// Test, if the name has changed correctly
		assertEquals("ChangedTheName", NewElementName);
	}

	@Test
	public void testElementInsert() throws Exception {

		// Using hibernate to receive a package from the dbstore
		Package root = (Package) session.createQuery("FROM Package WHERE Parent_ID = 0").list().get(0);
		assertEquals(root.getElements().size(), 1);

		// Starts IncrementalSync asynchronously
		sync.startASync();

		// Using hibernate to receive a element from the dbstore, then create a
		// own element and add it
		Element element = (Element) session.createQuery("FROM Element WHERE ElementID = 2").list().get(0);
		Element newElement = EcoreUtil.copy(element);
		newElement.setElementID(3L);
		newElement.setName("ANewElement");
		root.getElements().add(newElement);
		session.saveOrUpdate(newElement);
		getTestDB().getDbConnection().createStatement().execute("INSERT INTO ht_t_object VALUES (3, NOW(6));");

		// Sleep for 1.1 seconds and let IncrementalSync work
		Thread.sleep(1100);

		// Get the root package again and count the elements
		root = (Package) session.createQuery("FROM Package WHERE Parent_ID = 0").list().get(0);
		assertEquals(root.getElements().size(), 2);

	}

	/**
	 * Generates logging tables for the Enterprise Architect Meta-Model to use
	 * with the base testcases.
	 */
	private void initLoggingTable() throws SQLException {
		Statement statement = getTestDB().getDbConnection().createStatement();
		String tableNames[] = { "attribute", "attributeconstraints", "attributetag", "connector", "diagram",
				"diagramlinks", "diagramobjects", "object", "operation", "operationsparams", "package" };
		for (String tableName : tableNames)
			statement.execute("CREATE TABLE `ht_t_" + tableName
					+ "` (`ID` INT(11) NOT NULL,`Timestamp` TIMESTAMP(6) NULL DEFAULT NULL,PRIMARY KEY (`ID`))");
	}

}
