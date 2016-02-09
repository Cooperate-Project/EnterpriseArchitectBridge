package de.cooperateproject.eabridge.eaobjectmodel;

import java.sql.SQLException;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoNewSQLNameStrategy;
import org.h2.tools.Server;
import org.hibernate.cfg.Environment;

import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

public class Application {
	
	/**
	 * Quick Start Tutorial for the <a href="http://wiki.eclipse.org/Teneo">Teneo</a> project.
	 * 
	 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
	 * @version $Revision: 1.7 $
	 */

		/** The main method 
		 * @throws SQLException */
		public static void main(String[] args) throws SQLException {
			// the name of the database, this database should exist but does not
			// need to contain tables
			String dbName = "ea2emf";
			
			HbDataStore hbds = doQuickStart(dbName);
			
			Bootstrap.bootstrap(hbds);
		
			Server.createWebServer().start(); 
		}

		/**
		 * The method performing the real action. This method is used by other tutorials therefore has it
		 * been made public and expects the database name and returns an instance of the HbDataStore.
		 */
		public static HbDataStore doQuickStart(String dbName) {
			

			// The hibernate properties can be set by having a hibernate.properties
			// file in the root of
			// the classpath.
			// Another approach is setting the properties in the HbDataStore.
			// For more information see section 3.1 of the Hibernate manual
			final Properties props = new Properties();
			 props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
			 props.setProperty(Environment.USER, "ea");
			 props.setProperty(Environment.URL, "jdbc:mysql://mammutbaum36.fzi.de:3306/" +
			 dbName);
			 props.setProperty(Environment.PASS, "zjlaisdfasdf3");
			 props.setProperty(Environment.DIALECT,
			 org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

//			props.setProperty(Environment.DRIVER, "org.h2.Driver");
//			props.setProperty(Environment.USER, "sa");
//			props.setProperty(Environment.URL, "jdbc:h2:mem:test");
//			props.setProperty(Environment.PASS, "");
//			props.setProperty(Environment.DIALECT, org.hibernate.dialect.H2Dialect.class.getName());

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
//			props.setProperty(Environment.HBM2DDL_AUTO, "none");
			
			// link do custom hibernate.hbm.xml
//			props.setProperty(PersistenceOptions.USE_MAPPING_FILE, "true");
			
			//disable generation of econtainer columns
			//references should be redundant
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
			hbds.setEPackages(new EPackage[] { XcorePackage.eINSTANCE });

			// initialize, also creates the database tables
			try {
				hbds.initialize();
			} finally {
				// print the generated mapping
				System.err.println(hbds.getMappingXML());
			}


			return hbds;
		}
}