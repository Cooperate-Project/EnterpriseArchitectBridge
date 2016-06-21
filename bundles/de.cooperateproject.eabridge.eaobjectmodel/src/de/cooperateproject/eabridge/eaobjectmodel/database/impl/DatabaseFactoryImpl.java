package de.cooperateproject.eabridge.eaobjectmodel.database.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.hibernate.cfg.Environment;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseProperties;

public class DatabaseFactoryImpl extends DatabaseFactory {

	private final File mappingXMLFile = new File("C:\\users_local\\cooperate\\workspaceXcore\\EnterpriseArchitectBridge\\bundles\\de.cooperateproject.eabridge.eaobjectmodel\\src\\de\\cooperateproject\\eabridge\\eaobjectmodel\\configuration\\hibernate.hbm.xml");
	private final String mappingXMLPath = "/de/cooperateproject/eabridge/eaobjectmodel/configuration/hibernate.hbm.xml";
	
	@Override
	public HbDataStore createDataStore(DatabaseProperties properties) {

		for (int i = 0; i < 2; i++) {

			final Properties props = new Properties();

			// database configuration
			props.putAll(properties.getConfiguration());
			props.setProperty(Environment.HBM2DDL_AUTO, "none");

			// persistence configuration
			props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
			props.setProperty(PersistenceOptions.PERSISTENCE_XML,
					"de/cooperateproject/eabridge/eaobjectmodel/configuration/annotations.xml");
			props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "none");
			props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");
			props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");
			props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");

			if (i == 1) {
				props.setProperty(PersistenceOptions.MAPPING_FILE_PATH, mappingXMLPath);
			}

			// data store initialization
			final String hbName = "EAObjectModel";
			final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);
			hbds.setDataStoreProperties(props);
			hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });

			final ExtensionManager extensionManager = hbds.getExtensionManager();
			extensionManager.registerExtension(SQLNameStrategy.class.getName(), CustomNamingStrategy.class.getName());
			
			hbds.initialize();
			
//			System.out.println(mappingXML);

			if (i == 0) {
				String mappingXML = hbds.getMappingXML();
				mappingXML = XMLModifier.modifyXML(mappingXML);
				
				try {
					FileUtils.writeStringToFile(mappingXMLFile, mappingXML);
				} catch (IOException e) {
					e.printStackTrace();
				}

				hbds.close();
			}
			if (i == 1) {
				return hbds;
			}
		}
		return null;
	}

	@Override
	public void destoryDataStore(HbDataStore dataStore) {
		dataStore.close();
		HbHelper.INSTANCE.deRegisterDataStore(dataStore);
	}

}
