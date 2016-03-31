package integrationTest;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;

public class MySQLDatabaseTest {

	/**
	 * The main method
	 * 
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		// the name of the database, this database should exist but does not
		// need to contain tables
		String dbName = "ea2emf";

		HbDataStore hbds = doQuickStart(dbName, args[0]);

	}

	/**
	 * The method performing the real action. This method is used by other
	 * tutorials therefore has it been made public and expects the database name
	 * and returns an instance of the HbDataStore.
	 * @throws SQLException 
	 */
	public static HbDataStore doQuickStart(String dbName, String password) throws SQLException {
		
//		MysqlDataSource dataSource = new MysqlDataSource();
//		dataSource.setUser("ea");
//		dataSource.setPassword(password);
//		dataSource.setServerName("jdbc:mysql://mammutbaum36.fzi.de:3306/" + dbName);

		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "ea");
		props.setProperty(Environment.URL, "jdbc:mysql://mammutbaum36.fzi.de:3306/" + dbName);
		props.setProperty(Environment.PASS, password);
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");

		props.setProperty(PersistenceOptions.PERSISTENCE_XML,
				"de/cooperateproject/eabridge/eaobjectmodel/annotations.xml");

		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "none");

		props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");

		props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");

		// deactivate table creation
		props.setProperty(Environment.HBM2DDL_AUTO, "none");

		// link do custom hibernate.hbm.xml
		// props.setProperty(PersistenceOptions.USE_MAPPING_FILE, "true");

		// disable generation of econtainer columns
		// references should be redundant
		props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");

		// the name of the session factory
		final String hbName = "EAObjectModel";
		// create the HbDataStore using the name
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);

		// set the properties
		hbds.setDataStoreProperties(props);

		final ExtensionManager extensionManager = hbds.getExtensionManager();

		extensionManager.registerExtension(SQLNameStrategy.class.getName(), CustomNamingStrategy.class.getName());

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
			hbds.initialize();
		} finally {
			// print the generated mapping
			System.err.println(hbds.getMappingXML());
		}
		
		SessionFactory sessionFactory = hbds.getSessionFactory();
		Session session = sessionFactory.openSession();
//		session.createSQLQuery("CREATE TABLE test (`Object_ID` int(11) NOT NULL DEFAULT '0')").executeUpdate();
		Query query = session.createQuery("SELECT element FROM Element element");
		List<Element> packages = query.list();
		for (Element pack : packages) {
			System.out.println(pack.getName());
		}

		return hbds;
	}
	

}
