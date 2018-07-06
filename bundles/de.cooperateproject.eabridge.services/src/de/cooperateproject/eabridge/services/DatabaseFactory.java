package de.cooperateproject.eabridge.services;

import java.sql.Connection;

public interface DatabaseFactory {

    public Connection getConnection();
	
}
