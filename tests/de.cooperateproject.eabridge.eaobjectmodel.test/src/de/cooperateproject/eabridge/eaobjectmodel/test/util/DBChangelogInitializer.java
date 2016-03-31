package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.sql.Connection;

import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB.DBInitializer;
import liquibase.Liquibase;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

public class DBChangelogInitializer implements DBInitializer {

	private final String changelogPath;
	
	public DBChangelogInitializer(String changelogPath) {
		this.changelogPath = changelogPath;
	}
	
	@Override
	public void init(Connection connection) throws Exception {
		MySQLDatabase db = new MySQLDatabase();
		db.setConnection(new JdbcConnection(connection));
		Liquibase liquibase = new Liquibase(changelogPath,
				new ClassLoaderResourceAccessor(), db);
		liquibase.update((String) null);
	}

}
