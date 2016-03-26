package integrationTest;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.cfg.Environment;
import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

public class EAToTeneoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		String dbName = "eaToTeneo";

		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
		Statement stat = conn.createStatement();

		// this line would initialize the database
		// from the SQL script file 'init.sql'
		stat.execute("runscript from 'classpath:integrationTest/EA_Bridge Scheme.sql'");
		
		final Properties props = new Properties();

		props.setProperty(Environment.DRIVER, "org.h2.Driver");
		props.setProperty(Environment.USER, "");
		props.setProperty(Environment.URL, "jdbc:h2:mem:test;MODE=MYSQL;DATABASE_TO_UPPER=false;IGNORECASE=TRUE");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.H2Dialect.class.getName());
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");

		props.setProperty(PersistenceOptions.PERSISTENCE_XML,
				"de/cooperateproject/eabridge/eaobjectmodel/annotations.xml");

		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "none");

		props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");

		props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");

		// deactivate table creation
		props.setProperty(Environment.HBM2DDL_AUTO, "none");

		// disable generation of econtainer columns
		// references should be redundant
		props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");

		// the name of the session factory
		final String hbName = "EAObjectModel";
		// create the HbDataStore using the name
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);
		
		// set the properties
		hbds.setDataStoreProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
			hbds.initialize();
		} finally {
			// print the generated mapping
			System.err.println(hbds.getMappingXML());
		}

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
