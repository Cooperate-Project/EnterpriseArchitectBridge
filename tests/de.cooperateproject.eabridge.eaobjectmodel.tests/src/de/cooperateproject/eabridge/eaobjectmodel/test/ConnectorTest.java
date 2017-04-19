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
import de.cooperateproject.eabridge.eaobjectmodel.IsAggregate;
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
		
		testUndirectedAssociation(getElement("C", pack), pack);
		testDirectedAssociation(getElement("B", pack), pack);
		testComposition(getElement("D", pack), pack);
		testAggregation(getElement("E", pack), pack);
		
	}
	
	private static void testUndirectedAssociation(Element e, Package pack) {
		Connector con = e.getSourceRelations().get(0);
		Assert.assertSame(DirectionType.UNSPECIFIED, con.getDirection());
		Assert.assertSame(ConnectorType.ASSOCIATION, con.getType());
		Assert.assertSame(getElement("A", pack), con.getDest());
		Assert.assertSame(IsAggregate.FALSE, con.getSourceIsAggregate());
		Assert.assertSame(IsAggregate.FALSE, con.getDestIsAggregate());
		Assert.assertFalse(con.isSourceIsNavigable());
		Assert.assertFalse(con.isDestIsNavigable());
	}
	
	private static void testDirectedAssociation(Element e, Package pack) {
		Connector con = e.getSourceRelations().get(0);
		Assert.assertSame(DirectionType.SOURCE_DESTINATION, con.getDirection());
		Assert.assertSame(ConnectorType.ASSOCIATION, con.getType());
		Assert.assertSame(getElement("A", pack), con.getDest());
		Assert.assertSame(IsAggregate.FALSE, con.getSourceIsAggregate());
		Assert.assertSame(IsAggregate.FALSE, con.getDestIsAggregate());
		Assert.assertFalse(con.isSourceIsNavigable());
		Assert.assertTrue(con.isDestIsNavigable());
	}
	
	private static void testComposition(Element e, Package pack) {
		Connector con = e.getSourceRelations().get(0);
		Assert.assertSame(DirectionType.SOURCE_DESTINATION, con.getDirection());
		Assert.assertSame(ConnectorType.AGGREGATION, con.getType());
		Assert.assertSame(getElement("C", pack), con.getDest());
		Assert.assertSame(IsAggregate.FALSE, con.getSourceIsAggregate());
		Assert.assertSame(IsAggregate.COMPOSITION, con.getDestIsAggregate());
		Assert.assertFalse(con.isSourceIsNavigable());
		Assert.assertTrue(con.isDestIsNavigable());
	}
	
	private static void testAggregation(Element e, Package pack) {
		Connector con = e.getSourceRelations().get(0);
		Assert.assertSame(DirectionType.SOURCE_DESTINATION, con.getDirection());
		Assert.assertSame(ConnectorType.AGGREGATION, con.getType());
		Assert.assertSame(getElement("D", pack), con.getDest());
		Assert.assertSame(IsAggregate.FALSE, con.getSourceIsAggregate());
		Assert.assertSame(IsAggregate.AGGREGATION, con.getDestIsAggregate());
		Assert.assertFalse(con.isSourceIsNavigable());
		Assert.assertTrue(con.isDestIsNavigable());
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
		
		Package simpleAssociationPackage = results.get(2);
		return simpleAssociationPackage;
	}
}
