package de.cooperateproject.eabridge.services.hbdbfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceFileProvider;
import org.eclipse.emf.teneo.classloader.ClassClassLoaderStrategy;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.hibernate.cfg.Environment;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.services.DatabaseFactory;

@Component(
    configurationPolicy = ConfigurationPolicy.REQUIRE, 
    name=HibernateDatabaseFactory.SERVICE_PID_NAME, 
    immediate=true,
    property = {
        HibernateDatabaseFactory.EABRIDGE_PROPERTIES_PREFIX_WHITELIST + "=hibernate;teneo",
        HibernateDatabaseFactory.EABRIDGE_HBDBFACTORY_DATASTORE_NAME + "=datastore1",
        PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT + "=REFRESH,PERSIST,MERGE",
        PersistenceOptions.PERSISTENCE_XML + "=/annotations.xml",
        PersistenceOptions.SQL_CASE_STRATEGY + "=none",
        PersistenceOptions.ALWAYS_VERSION + "=false",
        PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG + "=true",
        PersistenceOptions.DISABLE_ECONTAINER_MAPPING + "=true",
        PersistenceOptions.MAPPING_FILE_PATH + "=/hibernate.hbm.xml",
        Environment.HBM2DDL_AUTO + "=none"
    })
public class HibernateDatabaseFactory implements DatabaseFactory {
    public static final String EABRIDGE_PROPERTIES_PREFIX_WHITELIST = "eabridge.prefix.whitelist";
    public static final String EABRIDGE_HBDBFACTORY_DATASTORE_NAME = "eabridge.hbdbfactory.datastore.name";
    public static final String SERVICE_PID_NAME = "hbdbfactory";
	
    protected static Logger LOGGER = LoggerFactory.getLogger(HibernateDatabaseFactory.class); 
	protected Map<String, Object> configurationProperties;
	protected List<String> prefixWhitelist;
	private HbDataStore dataStoreInstance = null;
	
	@Activate
	protected void activate (Map<String, Object> properties) {
	    configurationProperties = properties;	    
	    
	    Optional.ofNullable(properties.get(EABRIDGE_PROPERTIES_PREFIX_WHITELIST))
            .filter(String.class::isInstance).map(String.class::cast)
            .map(p -> p.split(";")).map(Arrays::asList)
                .ifPresent(c -> {HibernateDatabaseFactory.this.prefixWhitelist = Collections.unmodifiableList(c);});
	}
	
	@Deactivate
	protected void deactivate() {
	    if (dataStoreInstance != null)
	        destoryDataStore(dataStoreInstance);
	}
	
	@Override
	public Connection getConnection() {
	    try {
            Class.forName(configurationProperties.get(Environment.DRIVER).toString());
        } catch (ClassNotFoundException e) {
            LOGGER.error("The specified driver cannot be found.", e);
        }
	    Connection c = null;
	    try {
    	    c = DriverManager.getConnection(
                    configurationProperties.get(Environment.URL).toString(),
                    configurationProperties.get(Environment.USER).toString(),
                    configurationProperties.get(Environment.PASS).toString());
	    } catch (SQLException ex) {
	        LOGGER.error("The SQL connection could not be opened", ex);
	    }
	    return c;
	}
	
	private boolean DEBUG = false;
	
	@Override
    public synchronized HbDataStore getDataStore() {
        if (this.dataStoreInstance == null) {
            if (DEBUG) {
                try {
                    HbDataStore dataStore = createDataStoreInternal(configurationProperties, false);
                    String newXMLString = modifyMappingXML(dataStore.getMappingXML());
                    URL mappingUrl = FileLocator.toFileURL(new URL(configurationProperties.get(PersistenceOptions.MAPPING_FILE_PATH).toString()));
                    URI mappingURI = new URI(mappingUrl.getProtocol(), mappingUrl.getPath(), null);
                    InputStream existingXMLStream = new FileInputStream(new File(mappingURI));
                    try {
                        String existingXMLString = IOUtils.toString(existingXMLStream);
                        existingXMLString = modifyMappingXML(existingXMLString);
                        if (!newXMLString.equals(existingXMLString)) {
                            File mappingXMLFile = new File(mappingURI.toString().replace("/bin/", "/src/"));
                            FileUtils.write(mappingXMLFile, newXMLString);
                        }
                        destoryDataStore(dataStore);
                        dataStore = null;
                    } finally {
                        IOUtils.closeQuietly(existingXMLStream);
                    }
                } catch (IOException | URISyntaxException ex) {
                    LOGGER.error("Exception during update of teneo mapping file", ex);
                }
            }
                this.dataStoreInstance = createDataStoreInternal(configurationProperties, true);           

        }
        return this.dataStoreInstance;
    }

    @Override
    public void destoryDataStore(HbDataStore dataStore) {
        dataStore.close();
        HbHelper.INSTANCE.deRegisterDataStore(dataStore);
    }
	
	private HbDataStore createDataStoreInternal(Map<String, Object> properties, boolean useExistingMapping) {
		final Properties props = new Properties();
		
		properties.forEach((k, e) -> {
            if (this.prefixWhitelist.stream().anyMatch(pf -> k.startsWith(pf))) {
                props.put(k, e);
            }
        });
		
		if (!useExistingMapping) {
		    props.remove(PersistenceOptions.MAPPING_FILE_PATH);
		}
		
		// workaround for unit tests
		ClassLoaderResolver.setClassLoaderStrategy(new ClassClassLoaderStrategy());

		// data store initialization
		final String hbName = properties.get(EABRIDGE_HBDBFACTORY_DATASTORE_NAME).toString();
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);
		hbds.setDataStoreProperties(props);
		hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });
		
		final ExtensionManager extensionManager = hbds.getExtensionManager();
		extensionManager.registerExtension(SQLNameStrategy.class.getName(), CustomNamingStrategy.class.getName());
		extensionManager.registerExtension(PersistenceFileProvider.class.getName(), URIPersistenceFileProvider.class.getName());
		
		hbds.initialize();
		return hbds;
	}
	
	private static String modifyMappingXML(String mappingXML) {
		return XMLModifier.modifyXML(mappingXML);
	}
	
	

}
