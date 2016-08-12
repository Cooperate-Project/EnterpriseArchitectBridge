package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.nio.charset.Charset;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.DifferenceEvaluators;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.IgnoreAttributeDifferenceEvaluator;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testAddModel() throws Exception {
		initTestDb(TestResource.EASchemaChangelog);

		Package loadedPackage = loadModelFromResource("resources/SimpleClassModel.xmi");
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();
		
		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		String content = generateChangelog();
		String compareContent = readFile(TestResource.SimpleClassModelChangelog.getFile().getAbsolutePath(),
				Charset.defaultCharset());
		
//		Print changelog for debugging purposes
//		Liquibase liquibase = getLiquibase();
//		liquibase.generateChangeLog(liquibase.getDatabase().getDefaultSchema() , new DiffToChangeLog(new DiffOutputControl()), System.out, Data.class);
		
		Diff myDiff = DiffBuilder.compare(compareContent).withTest(content).withDifferenceEvaluator(DifferenceEvaluators
				.chain(new IgnoreAttributeDifferenceEvaluator("author"), new IgnoreAttributeDifferenceEvaluator("id")))
//				.withNodeFilter(new Predicate<Node>() {
//					
//					@Override
//					public boolean test(Node arg0) {
//						return !(arg0.getLocalName() == "include");
//					}
//				})
				.checkForSimilar().build();

		Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
	}

}
