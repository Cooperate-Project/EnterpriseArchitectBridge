package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbContext;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.hibernate.Interceptor;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import de.cooperateproject.eabridge.eaobjectmodel.configuration.CustomNamingStrategy;

public class DatabaseAdapter {

    public static class DatabaseProperties {
        private final Map<String, String> properties = Maps.newHashMap();

        public DatabaseProperties(String driver, String user, String jdbcUrl, String password, String dialect) {
            super();
            properties.put(Environment.DRIVER, driver);
            properties.put(Environment.USER, user);
            properties.put(Environment.URL, jdbcUrl);
            properties.put(Environment.PASS, password);
            properties.put(Environment.DIALECT, dialect);
        }

        public Map<String, String> getHibernateConfiguration() {
            return ImmutableMap.copyOf(properties);
        }
    }

    public static HbDataStore createDataStore(DatabaseProperties properties) {
        final Properties props = new Properties();
        
        // database configuration
        props.putAll(properties.getHibernateConfiguration());
        props.setProperty(Environment.HBM2DDL_AUTO, "none");

        // persistence configuration
        props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");
        props.setProperty(PersistenceOptions.PERSISTENCE_XML,
                "de/cooperateproject/eabridge/eaobjectmodel/annotations.xml");
        props.setProperty(PersistenceOptions.SQL_CASE_STRATEGY, "none");
        props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");
        props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");
        props.setProperty(PersistenceOptions.DISABLE_ECONTAINER_MAPPING, "true");

        // data store initialization
        final String hbName = "EAObjectModel";
        final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);
        hbds.setHbContext(new HbContext(){
            @Override
            public Interceptor createInterceptor(Configuration hbConfiguration, EntityNameStrategy ens) {
                return new MappingInterceptor();
            }});
        hbds.setDataStoreProperties(props);
        hbds.setEPackages(new EPackage[] { EaobjectmodelPackage.eINSTANCE });

        final ExtensionManager extensionManager = hbds.getExtensionManager();
        extensionManager.registerExtension(SQLNameStrategy.class.getName(), CustomNamingStrategy.class.getName());
        
        hbds.initialize();

        return hbds;
    }
    
    public static void finalizeDataStore(HbDataStore store) {
        store.close();
        HbHelper.INSTANCE.deRegisterDataStore(store);
    }

}
