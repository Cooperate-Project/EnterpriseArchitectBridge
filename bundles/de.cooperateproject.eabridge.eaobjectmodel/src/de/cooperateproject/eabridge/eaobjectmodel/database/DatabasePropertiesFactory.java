package de.cooperateproject.eabridge.eaobjectmodel.database;

import de.cooperateproject.eabridge.eaobjectmodel.database.impl.DatabasePropertiesFactoryImpl;

public abstract class DatabasePropertiesFactory {

	public static DatabasePropertiesFactory INSTANCE = new DatabasePropertiesFactoryImpl();
	
	public abstract DatabaseProperties create(String driver, String user, String jdbcUrl, String password, String dialect);
	public abstract DatabaseProperties create(String driver, String user, String jdbcUrl, String password, String dialect, String schema);
	
}
