package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.PackageBase;
import de.cooperateproject.eabridge.eaobjectmodel.RootPackage;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.MySQLTestDB;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.CatalogAndSchema;
import liquibase.Liquibase;
import liquibase.database.core.H2Database;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.diff.DiffResult;
import liquibase.diff.ObjectDifferences;
import liquibase.diff.compare.CompareControl;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;
import liquibase.diff.output.report.DiffToReport;
import liquibase.integration.commandline.CommandLineUtils;
import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.snapshot.DatabaseSnapshot;
import liquibase.structure.DatabaseObject;
import liquibase.structure.core.Data;
import liquibase.structure.core.Table;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testAddModel() throws Exception {
		initTestDb(TestResource.EABaseChangelog);

		Liquibase liquibase = getLiquibase();
		liquibase.generateChangeLog(liquibase.getDatabase().getDefaultSchema() , new DiffToChangeLog(new DiffOutputControl()), System.out, Data.class, Table.class);
		
		PackageBase loadedPackage = loadModelFromResource("resources/SimpleClassModel.xmi");
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		session.save(loadedPackage);
		trans.commit();
		
		System.out.print("-------------------Second-------------------");
		
		liquibase.generateChangeLog(liquibase.getDatabase().getDefaultSchema() , new DiffToChangeLog(new DiffOutputControl()), System.out, Data.class, Table.class);

		H2Database compareDb = new H2Database();
		compareDb.executeStatements(null, liquibase.getDatabaseChangeLog(), null);
//
//		Set<Class<? extends DatabaseObject>> types = new HashSet();
//		types.add(Data.class);
		
		
//		DiffResult diff = liquibase.diff(getDatabase(), compareDb, new CompareControl());
		//		DiffToReport diffToReport = new DiffToReport(diff, System.out);
//		diffToReport.print();
//		boolean equal = diff.areEqual();
//
//		compareTestDb.close();

	}

	private static RootPackage loadModelFromResource(String resourcePath) throws IOException {
		RootPackage loadedPackage = null;
		InputStream is = null;
		try {
			is = ObjectModel2EAMappingTest.class.getClassLoader().getResourceAsStream(resourcePath);
			loadedPackage = EAObjectModelHelper.loadModel(is);
		} finally {
			IOUtils.closeQuietly(is);
		}
		return loadedPackage;
	}

}
