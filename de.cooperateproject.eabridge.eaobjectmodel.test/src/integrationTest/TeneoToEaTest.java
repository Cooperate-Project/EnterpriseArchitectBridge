package integrationTest;

import java.io.IOException;
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
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;
import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.EAObjectModelHelper;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;

public class TeneoToEaTest {

	static HbDataStore dataStore;

	@BeforeClass
	public static void setUp() throws Exception {

		final String password = "password";
		String dbName = "enterprise_architect";

		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "ea");
		props.setProperty(Environment.URL, "jdbc:mysql://mammutbaum36.fzi.de:3306/" + dbName);
		props.setProperty(Environment.PASS, password);
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");

		props.setProperty(PersistenceOptions.PERSISTENCE_XML,
				"de/cooperateproject/eabridge/eaobjectmodel/annotations.xml");

		props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "none");

		props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");

		props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");

		props.setProperty(Environment.HBM2DDL_AUTO, "none");

		props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");

		final String hbName = "EAObjectModel";
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);
		dataStore = hbds;

		hbds.setDataStoreProperties(props);

		final ExtensionManager extensionManager = hbds.getExtensionManager();

		extensionManager.registerExtension(SQLNameStrategy.class.getName(), CustomNamingStrategy.class.getName());

		hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });

		try {
			hbds.initialize();
		} finally {
			System.err.println(hbds.getMappingXML());
		}
		
		Package loadedPackage = null;
		try {
			loadedPackage = EAObjectModelHelper.loadModel("resources/Bootstrap.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Session session = hbds.getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		session.createSQLQuery("UPDATE t_package SET 'Parent_ID' = 0 WHERE 'Name' = 'rootPackage'").executeUpdate();
	}

	@Test
	public void test() {
		Session session = dataStore.getSessionFactory().openSession();
		Query query = session.createQuery("SELECT element FROM Element element");
		List<Element> packages = query.list();
		for (Element pack : packages) {
			System.out.println(pack.getName());
		}
	}

}
