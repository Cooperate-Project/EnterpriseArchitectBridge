package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.sql.Connection;

import de.cooperateproject.eabridge.eaobjectmodel.test.util.H2TestDB.DBInitializer;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseConnection;
import liquibase.database.DatabaseFactory;
import liquibase.database.ObjectQuotingStrategy;
import liquibase.database.jvm.JdbcConnection;

public class DBChangelogInitializer implements DBInitializer {

	private final TestResource testResource;

	public DBChangelogInitializer(TestResource testResource) {
		this.testResource = testResource;
	}

	@Override
	public void init(Connection connection) throws Exception {
		DatabaseConnection liquibaseConnection = new JdbcConnection(connection);
		Database db = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(liquibaseConnection);
		db.setObjectQuotingStrategy(ObjectQuotingStrategy.QUOTE_ALL_OBJECTS);
		Liquibase liquibase = LiquibaseFactory.getInstance(testResource, db);
		liquibase.update((String) null);
	}

}
