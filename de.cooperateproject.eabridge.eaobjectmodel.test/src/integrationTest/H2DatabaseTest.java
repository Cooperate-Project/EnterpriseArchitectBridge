package integrationTest;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.h2.tools.Server;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;

public class H2DatabaseTest {

    public static void main(String[] args) throws Exception {
		
		final Properties props = new Properties();

		props.setProperty(Environment.DRIVER, "org.h2.Driver");
		props.setProperty(Environment.USER, "");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.H2Dialect.class.getName());
		props.setProperty(Environment.CONNECTION_PROVIDER, EAToTeneoConnectionProvider.class.getName());
		
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
		
		Server.createWebServer().start(); 
		
		SessionFactory sessionFactory = hbds.getSessionFactory();
		Session session = sessionFactory.openSession();
//		session.createSQLQuery("CREATE TABLE test").executeUpdate();
		Query query = session.createQuery("SELECT package FROM Package package WHERE package.Name = Model");
		List<Package> packages = query.list();
    }

}
