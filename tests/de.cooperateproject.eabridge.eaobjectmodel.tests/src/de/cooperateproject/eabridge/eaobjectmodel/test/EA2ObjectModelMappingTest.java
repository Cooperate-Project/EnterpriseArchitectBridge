package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
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

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.CustomDiffEngine;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;

public class EA2ObjectModelMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testReadSimpleDiagram() throws Exception {
		initTestDb(TestResource.SimpleClassModelChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();

		Query query = session.createQuery("FROM Package WHERE PARENT_ID = 0");
		List<Package> results = HibernateUtils.getListFromQuery(query, Package.class);
		assertEquals(1, results.size());

		Package actualContent = results.get(0);
		Package compareContent = loadModelFromResource(TestResource.SimpleClassModel);

		assertEqualsModel(actualContent, compareContent);
	}
	
	@Test
	public void testReadModificationDateOfElement() throws Exception {
		initTestDb(TestResource.EASingleClassChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();

		Query query = session.createQuery("FROM Element WHERE ElementID = 2");
		List<Element> results = HibernateUtils.getListFromQuery(query, Element.class);
		assertEquals(1, results.size());

		Element actualContent = results.get(0);
		
		Date expectedDate = new Calendar.Builder().setDate(2016, 6, 4).setTimeOfDay(10, 10, 44).build().getTime();
		Date actualDate = actualContent.getModifiedDate();
		
		assertEquals(expectedDate, actualDate);
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
