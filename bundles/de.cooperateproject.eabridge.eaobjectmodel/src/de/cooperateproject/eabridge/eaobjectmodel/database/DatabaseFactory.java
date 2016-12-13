package de.cooperateproject.eabridge.eaobjectmodel.database;

import org.eclipse.emf.teneo.hibernate.HbDataStore;

import de.cooperateproject.eabridge.eaobjectmodel.database.impl.DatabaseFactoryImpl;

public abstract class DatabaseFactory {

	public static DatabaseFactory INSTANCE = new DatabaseFactoryImpl();
	
	public abstract HbDataStore createDataStore(DatabaseProperties properties);
	public abstract void destoryDataStore(HbDataStore dataStore);
	
}
