package de.cooperateproject.eabridge.tests.common.util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.eabridge.tests.common.TeneoMappingBaseTest;

public class ModellingHelper extends TeneoMappingBaseTest {

	@Ignore @Test
	public void changelog2xmi() throws Exception {
		initTestDb(TestResource.VehicleChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();

		Query query = session.createQuery("FROM Package WHERE PARENT_ID = 0");
		List<Package> results = HibernateUtils.getListFromQuery(query, Package.class);
		assertEquals(1, results.size());

		Package actualContent = results.get(0);
	
		EAObjectModelHelper.saveModel(actualContent, "src/resources/Vehicle.xmi");
	}

}
