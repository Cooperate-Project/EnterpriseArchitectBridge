package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.xmlunit.diff.Comparison.Detail;
import org.xmlunit.diff.Diff;

import com.google.common.collect.Iterables;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.ChangeLogComparator;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.eabridge.tests.common.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testAddModel() throws Exception {
		initTestDb(TestResource.EASchemaChangelog);

		Package loadedPackage = loadModelFromResource(TestResource.SimpleClassModel);
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		String content = getTestDB().generateChangelog();
		String compareContent = TestResource.SimpleClassModelChangelog.getContent();
		
		Diff myDiff = ChangeLogComparator.createDiffBuilder(compareContent, content).build();
		Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
	}

	@Test
	public void testWriteModificationDateOfElement() throws Exception {
		initTestDb(TestResource.EASingleClassChangelog);

		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		Query query = session.createQuery("FROM Element WHERE ElementID = 2");
		List<Element> results = HibernateUtils.getListFromQuery(query, Element.class);
		assertEquals(1, results.size());
		Element actualContent = results.get(0);
		Date newDate = new Calendar.Builder().setDate(1980, 0, 1).build().getTime();
		actualContent.setModifiedDate(newDate);

		trans.commit();
		session.close();

		String changed = getTestDB().generateChangelog();
		String original = TestResource.EASingleClassChangelog.getContent();
		Diff myDiff = ChangeLogComparator.createDiffBuilder(original, changed).build();
		
		assertEquals("Expected one difference, but got more: " + myDiff.toString(),1, Iterables.size(myDiff.getDifferences()));
		Detail targetDetail = Iterables.getFirst(myDiff.getDifferences(), null).getComparison().getTestDetails();
		assertThat(targetDetail.getTarget(), is(instanceOf(Attr.class)));
		assertEquals("valueDate", targetDetail.getTarget().getNodeName());
		assertEquals(new SimpleDateFormat("yyy-MM-dd HH:mm:ss.S").format(newDate), (String)targetDetail.getValue());

	}


}
