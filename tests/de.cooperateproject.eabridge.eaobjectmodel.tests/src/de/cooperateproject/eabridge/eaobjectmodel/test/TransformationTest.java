package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;

public class TransformationTest extends TeneoMappingBaseTest {

	@Test
	public void testReadSimpleDiagram() throws Exception {
		initTestDb(TestResource.SimpleClassModelChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();

		Query query = session.createQuery("FROM Package WHERE PARENT_ID = 0");
		List<Package> results = HibernateUtils.getListFromQuery(query, Package.class);
		Element ele = results.get(0).getElements().get(0);
		assertEquals(1, results.size());
	}
}
