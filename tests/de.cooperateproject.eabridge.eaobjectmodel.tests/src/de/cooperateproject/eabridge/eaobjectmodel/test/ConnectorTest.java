package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.DirectionType;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.eabridge.tests.common.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public class ConnectorTest extends TeneoMappingBaseTest {
	

	@Test
	public void testSimpleAssociation() throws Exception{
		initTestDb(TestResource.SimpleAssociationChangelog);
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Package pack = getPackage(session);
		
		testUndirectedAssociation(getElement("C", pack).getSourceRelations().get(0), pack);
		
		
	}
	
	private static void testUndirectedAssociation(Connector con, Package pack) {
		Assert.assertSame(DirectionType.UNSPECIFIED, con.getDirection());
		Assert.assertSame(ConnectorType.ASSOCIATION, con.getType());
		Assert.assertNull(con.getSubType());
		Assert.assertSame(getElement("A", pack), con.getDest());
		
	}	
	
	private static Element getElement(String disc, Package pack) {
		return pack.getElements().stream().filter(e -> e.getName().equalsIgnoreCase(disc)).findAny().get();
	}
	
	
	private static Package getPackage(Session session) {
		Transaction trans = session.getTransaction();
		trans.begin();
		Query query = session.createQuery("FROM Package");
		List<Package> results = HibernateUtils.getListFromQuery(query, Package.class);
		trans.commit();
		
		Package simpleAssociationPackage = results.get(1);
		return simpleAssociationPackage;
	}
}
