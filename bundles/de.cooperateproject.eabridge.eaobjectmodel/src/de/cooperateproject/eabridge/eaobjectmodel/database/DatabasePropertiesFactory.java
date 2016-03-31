package de.cooperateproject.eabridge.eaobjectmodel.database;

public abstract class DatabasePropertiesFactory {

	public static DatabasePropertiesFactory INSTANCE;
	
	public abstract DatabaseProperties create(String driver, String user, String jdbcUrl, String password, String dialect);
	public abstract DatabaseProperties create(String driver, String user, String jdbcUrl, String password, String dialect, String schema);
	
}
