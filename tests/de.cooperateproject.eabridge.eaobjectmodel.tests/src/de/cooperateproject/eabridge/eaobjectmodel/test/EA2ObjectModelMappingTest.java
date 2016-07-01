package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.CustomDiffEngine;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;

public class EA2ObjectModelMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testReadSimpleDiagram() throws Exception {
		initTestDb(TestResource.SimpleClassModelWithSchemaChangelog);
		
		Session session = getDataStore().getSessionFactory().openSession();

		Query query = session.createQuery("FROM Package WHERE PARENT_ID = 0");
		List<Package> results = HibernateUtils.getListFromQuery(query, Package.class);
		System.out.println(results.size());		
		assertEquals(1, results.size());

		Package actualContent = results.get(0);
		Package compareContent = loadModelFromResource("resources/SimpleClassModel.xmi");

		assertEqualsModel(actualContent, compareContent);
	}
	
	private static void assertEqualsModel(Package content, Package compareContent) {		
		EcoreUtil.resolveAll(content);
		Comparison comparison = compare(content, compareContent);
		
		ByteArrayOutputStream baos = null;
		PrintStream ps = null;
		try {
			baos = new ByteArrayOutputStream();
			ps = new PrintStream(baos);
			EMFComparePrettyPrinter.printDifferences(comparison, ps);
			Assert.assertTrue(baos.toString(), comparison.getDifferences().isEmpty());
		} finally {
			IOUtils.closeQuietly(ps);
			IOUtils.closeQuietly(baos);
		}
	}
	
	private static Comparison compare(Package content, Package compareContent) {
		DefaultComparisonScope scope = new DefaultComparisonScope(content, compareContent, null);
		return EMFCompare.builder().setDiffEngine(CustomDiffEngine.DIFF_ENGINE).build().compare(scope);
	}
}
