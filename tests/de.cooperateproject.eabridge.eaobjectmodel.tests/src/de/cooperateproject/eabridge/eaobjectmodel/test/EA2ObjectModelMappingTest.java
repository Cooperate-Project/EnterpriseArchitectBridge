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

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.RootPackage;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.CustomDiffEngine;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;

public class EA2ObjectModelMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testReadSimpleDiagram() throws Exception {
		initTestDb(TestResource.SimpleClassModelWithSchemaChangelog);
		
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM RootPackage");
		List<RootPackage> results = query.list();
		trans.commit();

		assertEquals(1, results.size());
		
		RootPackage content = results.get(0);
		
		RootPackage compareContent = loadModelFromResource("resources/SimpleClassModel.xmi");
		
		//needed because of containment workaround
		Attribute att = compareContent.getPackages().get(0).getElements().get(0).getAttributes().get(0);
		att.getConstraints().get(0).setAttribute(att);
		
//		compareContent.getPackages().get(0).getDiagrams().get(0).getDiagramLinks().get(0).setInstanceID((long) 1); 
//		compareContent.getPackages().get(0).getDiagrams().get(0).getDiagramObjects().get(0).setInstanceID((long) 1); 
//		compareContent.getPackages().get(0).getDiagrams().get(0).getDiagramObjects().get(1).setInstanceID((long) 2); 
		
		assertEqualsModel(content, compareContent);
		
//		EAObjectModelHelper.saveModel(compareContent,"resources/test.xmi");
	}
	
	private static void assertEqualsModel(RootPackage content, RootPackage compareContent) {		
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
	
	private static EList<Diff> compare(RootPackage content, RootPackage compareContent) {
		DefaultComparisonScope scope = new DefaultComparisonScope(content, compareContent, null);
		Comparison comparison = EMFCompare.builder().setDiffEngine(CustomDiffEngine.DIFF_ENGINE).build().compare(scope);
		return comparison.getDifferences();
	}
	
	private static void printDiff(EList<Diff> diff) {
		for(Diff d : diff) {
			System.out.println(d);
		}
	}
}
