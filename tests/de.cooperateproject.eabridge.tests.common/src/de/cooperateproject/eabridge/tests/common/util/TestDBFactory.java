package de.cooperateproject.eabridge.tests.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.google.common.collect.Maps;

import de.cooperateproject.eabridge.services.hbdbfactory.HibernateDatabaseFactory;

public class TestDBFactory extends HibernateDatabaseFactory {
    protected static final Map<String, Object> defaultProperties;
    
    static {
        Map<String, Object> props = new HashMap<>();
        props.put("eabridge.prefix.whitelist", "hibernate;teneo");
        props.put("eabridge.hbdbfactory.datastore.name", "datastore1");
        props.put("teneo.mapping.cascade_policy_on_non_containment", "REFRESH,PERSIST,MERGE");
        props.put("teneo.mapping.persistence_xml", "/annotations.xml");
        props.put("teneo.naming.strategy", "none");
        props.put("teneo.mapping.always_version", "false");
        props.put("teneo.mapping.always_map_list_as_bag", "true");
        props.put("teneo.mapping.disable_econtainer", "true");
        props.put("teneo.mapping.mapping_file_name", "/hibernate.hbm.xml");
        props.put("hibernate.hbm2ddl.auto", "none");
        defaultProperties = Collections.unmodifiableMap(props);
    }

    private Map<String, String> properties;

    public TestDBFactory(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public HbDataStore getDataStore() {
        if (this.configurationProperties == null) {
            Map<String, Object> props = new HashMap<>(defaultProperties);

            props.putAll(properties);

            super.activate(props);
        }
        return super.getDataStore();
    }

    @Override
    public void destoryDataStore(HbDataStore dataStore) {
        // TODO Auto-generated method stub

    }

}
