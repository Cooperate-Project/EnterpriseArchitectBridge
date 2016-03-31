package de.cooperateproject.eabridge.eaobjectmodel.database;

import org.eclipse.emf.teneo.hibernate.HbDataStore;

public abstract class DatabaseFactory {

	public static DatabaseFactory INSTANCE = null;
	
	public abstract HbDataStore createDataStore(DatabaseProperties properties);
	public abstract void destoryDataStore(HbDataStore dataStore);
	
}
