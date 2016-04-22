package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.Assert;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

import de.cooperateproject.eabridge.eaobjectmodel.PackageBase;
import de.cooperateproject.eabridge.eaobjectmodel.RootPackage;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.IgnoreAttributeDifferenceEvaluator;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.Liquibase;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;
import liquibase.structure.core.Data;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testAddModel() throws Exception {
		initTestDb(TestResource.EASchemaChangelog);

		Liquibase liquibase = getLiquibase();
		liquibase.generateChangeLog(liquibase.getDatabase().getDefaultSchema() , new DiffToChangeLog(new DiffOutputControl()), System.out, Data.class);
		
		PackageBase loadedPackage = loadModelFromResource("resources/SimpleClassModel.xmi");
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		String content = generateChangelog();
		String compareContent = readFile(TestResource.SimpleClassModelChangelog.getFile().getAbsolutePath(), Charset.defaultCharset());
		
		Diff myDiff = DiffBuilder.compare(content).withTest(compareContent)
				.withDifferenceEvaluator(new IgnoreAttributeDifferenceEvaluator("author"))
				.withDifferenceEvaluator(new IgnoreAttributeDifferenceEvaluator("id"))
				.checkForSimilar()
				.build();
				
		Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
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
