package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;

public class EA2ObjectModelMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testReadSimpleDiagram() throws Exception {
		initTestDb(TestResource.SimpleClassModelWithSchemaChangelog);
		
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		Query query = session.createQuery("FROM Package WHERE PARENT_ID = 0");
		List<Package> results = query.list();
		System.out.println(results.size());		
		assertEquals(1, results.size());

		Package content = results.get(0);
//		Element element = content.getElements().get(0);
		
		Package compareContent = loadModelFromResource("resources/SimpleClassModel.xmi");
		
//		assertEqualsModel(content, compareContent);
		
	}
	
	private static void assertEqualsModel(Package content, Package compareContent) {		
		EcoreUtil.resolveAll(content);
		EList<Diff> diff = compare(content, compareContent);
		try {
			Assert.assertTrue(diff.isEmpty());
		} catch(AssertionError e) {
			System.out.println("Differences:");
			printDiff(diff);
			throw(e);
		}
	}
	
	private static EList<Diff> compare(Package content, Package compareContent) {
		DefaultComparisonScope scope = new DefaultComparisonScope(content, compareContent, null);
		Comparison comparison = EMFCompare.builder().build().compare(scope);
		return comparison.getDifferences();
	}
	
	private static void printDiff(EList<Diff> diff) {
		for(Diff d : diff) {
			System.out.println(d);
		}
	}
}
