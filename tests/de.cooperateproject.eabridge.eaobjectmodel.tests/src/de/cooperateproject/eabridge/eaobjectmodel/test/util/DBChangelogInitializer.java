package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.sql.Connection;

import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB.DBInitializer;
import liquibase.Liquibase;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;

public class DBChangelogInitializer implements DBInitializer {

	private final TestResource testResource;

	public DBChangelogInitializer(TestResource testResource) {
		this.testResource = testResource;
	}

	@Override
	public void init(Connection connection) throws Exception {
		MySQLDatabase db = new MySQLDatabase();
		db.setConnection(new JdbcConnection(connection));
		Liquibase liquibase = LiquibaseFactory.getInstance(testResource, db);
		liquibase.update((String) null);
	}

}
