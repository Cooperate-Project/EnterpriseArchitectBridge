package de.cooperateproject.incrementalsync.tests.h2;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.test.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.incrementalsync.monitoring.Table;
import de.cooperateproject.incrementalsync.monitoring.TableListener;
import de.cooperateproject.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.incrementalsync.synchronization.IncrementalSync.MODE;

public class SyncTests extends TeneoMappingBaseTest {

	@Test
	public void testUpdates() throws Exception {
		// Initialisierung der Umgebung. Siehe TeneoMappingBaseTest
		initTestDb(TestResource.EASingleClassChangelog);

		// Initialisierung der Logging Tabellen. In realer Umgebung passiert das
		// durch den Trigger-Generator
		initLoggingTable();

		// Erstellung eines Tables. In realer Umgebung wird dieser aus dem
		// Mapping automatisch extrahiert
		Table table = new Table("t_object", "Element", "Object_ID", "ElementID");
		TableListener listener = new TableListener(getDbConnection(), table, "ht_");
		listener.useH2Dialect();

		// Einfügen eines Logging-Eintrags. In realer Umgebung übernimmt dies
		// ein Trigger
		getDbConnection().createStatement().execute("INSERT INTO ht_t_object VALUES (2, NOW(6));");

		// Auslesen der Updates. "Gefaked" wurde ein Update in Element 2.
		ArrayList<String> updates = listener.getUpdates();
		assert (updates.size() == 1);
		assertEquals(updates.get(0), "2");
	}

	@Test
	public void testRefreshing() throws Exception {
		// Initialisierung der Umgebung. Siehe TeneoMappingBaseTest
		initTestDb(TestResource.EASingleClassChangelog);
		
		// Initialisierung der Logging Tabellen. In realer Umgebung passiert das
		// durch den Trigger-Generator
		initLoggingTable();
		
		// Intilialisieren einer Hibernate Session
		Session session = getDataStore().getSessionFactory().openSession();
		
		// Abrufen des Namnes eines Test-Elements mit Hilfe von Hibernate
		Element element = (Element) session.createQuery("FROM Element WHERE ElementID = 2").list().get(0);
		String elementName = element.getName();

		// Erstellen einer IncrementalSync-Instanz
		IncrementalSync sync = new IncrementalSync(getDbConnection(), getDataStore(), session, "ht_",
				MODE.LOG_AND_SYNC);

		// Erstellung eines Tables. In realer Umgebung wird dieser aus dem
		// Mapping automatisch extrahiert
		Table table = new Table("t_object", "Element", "Object_ID", "ElementID");
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(table);
		sync.setTables(tables);
		
		sync.useH2Dialect();

		// Starten von IncrementelSync (asynchron)
		sync.startASync();

		// Änderung am Namen des Objekts inkl. Eintrag im Logging-Table (simulieren einer externen Änderung)
		element.setName("ChangedTheName");
		getDbConnection().createStatement().execute("INSERT INTO ht_t_object VALUES (2, NOW(6));");

		// IncrementalSync läuft asynchron, standartmäßig mit einem Interval von 1000ms
		Thread.sleep(1100);

		// Erneutes Laden des Namens von Objekt 2
		element = (Element) session.createQuery("FROM Element WHERE ElementID = 2").list().get(0);
		String NewElementName = element.getName();

		// Wenn IncrementalSync richtig gearbeitet hat, muss sich der Name geändert haben
		assertEquals("ChangedTheName", NewElementName);
	}

	private void initLoggingTable() throws SQLException {
		Statement statement = getDbConnection().createStatement();
		String tableNames[] = { "attribute", "attributeconstraints", "attributetag", "connector", "diagram",
				"diagramlinks", "diagramobjects", "object", "operation", "operationsparams", "package" };
		for (String tableName : tableNames)
			statement.execute("CREATE TABLE `ht_t_" + tableName
					+ "` (`ID` INT(11) NOT NULL,`Timestamp` TIMESTAMP(6) NULL DEFAULT NULL,PRIMARY KEY (`ID`))");
	}

}
