package de.cooperateproject.eabridge.services;

import java.sql.Connection;

import org.eclipse.emf.teneo.hibernate.HbDataStore;

public interface DatabaseFactory {

    public Connection getConnection();
    
	public HbDataStore getDataStore();
	
	public void destoryDataStore(HbDataStore dataStore);
	
}
