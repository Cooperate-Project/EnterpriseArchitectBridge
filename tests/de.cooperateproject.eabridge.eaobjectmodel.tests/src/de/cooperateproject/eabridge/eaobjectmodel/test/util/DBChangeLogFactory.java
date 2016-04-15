package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.File;

import liquibase.changelog.DatabaseChangeLog;
import liquibase.database.ObjectQuotingStrategy;

public class DBChangeLogFactory {

	public static DatabaseChangeLog create(File changelogFile) {
		DatabaseChangeLog changelogObject = new DatabaseChangeLog(changelogFile.getAbsolutePath());
		changelogObject.setObjectQuotingStrategy(ObjectQuotingStrategy.QUOTE_ALL_OBJECTS);
		return changelogObject;
	}
	
}
