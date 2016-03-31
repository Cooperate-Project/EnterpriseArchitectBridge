package de.cooperateproject.eabridge.eaobjectmodel.database.impl;

import java.util.Map;

import org.hibernate.cfg.Environment;

import com.google.common.collect.Maps;

import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseProperties;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabasePropertiesFactory;

public class DatabasePropertiesFactoryImpl extends DatabasePropertiesFactory {
	
	@Override
	public DatabaseProperties create(String driver, String user, String jdbcUrl, String password, String dialect) {
		return create(driver, user, jdbcUrl, password, dialect, null);
	}

	@Override
	public DatabaseProperties create(String driver, String user, String jdbcUrl, String password, String dialect,
			String schema) {
		return new DatabaseProperties() {
			@Override
			public Map<String, String> getConfiguration() {
				Map<String, String> properties = Maps.newHashMap();
				
		        properties.put(Environment.DRIVER, driver);
		        properties.put(Environment.USER, user);
		        properties.put(Environment.URL, jdbcUrl);
		        properties.put(Environment.PASS, password);
		        properties.put(Environment.DIALECT, dialect);
		        if (schema != null) {
		        	properties.put(Environment.DEFAULT_SCHEMA, schema);            	
		        }
				
				return properties;
			}
		};
	}

}
