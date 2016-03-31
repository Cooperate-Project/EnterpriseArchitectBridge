package de.cooperateproject.eabridge.eaobjectmodel;

import java.sql.SQLException;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.h2.tools.Server;

import de.cooperateproject.eabridge.eaobjectmodel.DatabaseAdapter.DatabaseProperties;

public class Application {

		public static void main(String[] args) throws SQLException {
			// the name of the database, this database should exist but does not
			// need to contain tables
			String dbName = "enterprise_architect";
			
			HbDataStore hbds = doQuickStart(dbName, args[0]);
			
			System.out.println(hbds.getMappingXML());
			
			Bootstrap.bootstrap(hbds);
		
			Server.createWebServer().start(); 
		}

		public static HbDataStore doQuickStart(String dbName, String password) {
			
		    DatabaseProperties mysql = new DatabaseProperties("com.mysql.jdbc.Driver", "ea", "jdbc:mysql://mammutbaum36.fzi.de:3306/" + dbName, password, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
		    //DatabaseProperties h2 = new DatabaseProperties("org.h2.Driver", "sa", "jdbc:h2:mem:test", password, org.hibernate.dialect.H2Dialect.class.getName());
		    
		    HbDataStore dataStore = DatabaseAdapter.createDataStore(mysql);

			return dataStore;
		}
}