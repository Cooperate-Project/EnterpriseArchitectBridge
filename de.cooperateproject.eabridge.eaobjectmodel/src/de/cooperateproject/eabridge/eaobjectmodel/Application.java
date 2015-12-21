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
			String dbName = "eaobjectmodel";
			doQuickStart(dbName); // ignore return
			
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
			// props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
			// props.setProperty(Environment.USER, "root");
			// props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" +
			// dbName);
			// props.setProperty(Environment.PASS, "root");
			// props.setProperty(Environment.DIALECT,
			// org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

			props.setProperty(Environment.DRIVER, "org.h2.Driver");
			props.setProperty(Environment.USER, "sa");
			props.setProperty(Environment.URL, "jdbc:h2:mem:test");
			props.setProperty(Environment.PASS, "");
			props.setProperty(Environment.DIALECT, org.hibernate.dialect.H2Dialect.class.getName());

			// set a specific option
			// see this page
			// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
			// for all the available options
			props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
			
			props.setProperty(PersistenceOptions.PERSISTENCE_XML,
					"de/cooperateproject/eabridge/eaobjectmodel/annotations.xml");
			
			props.setProperty(PersistenceOptions.SQL_TABLE_NAME_PREFIX, "t_");
			
			props.setProperty(PersistenceOptions.AUTO_ADAPT_MANUAL_SET_SQL_NAMES, "false");
			
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