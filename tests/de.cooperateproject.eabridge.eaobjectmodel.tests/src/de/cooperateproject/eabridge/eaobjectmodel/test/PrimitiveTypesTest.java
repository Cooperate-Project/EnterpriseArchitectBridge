package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.eabridge.tests.common.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public class PrimitiveTypesTest extends TeneoMappingBaseTest {

	@Test
	public void test() throws Exception {
		initTestDb(TestResource.PrimitiveChangelog);		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Element ele = getElement(session);
		List<Attribute> atts = ele.getAttributes();
		
		for (Attribute att : atts) {
			checkPrimitiveType(att);
		}		
	}

	private static Element getElement(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Element");
		List<Element> results = HibernateUtils.getListFromQuery(query, Element.class);
		trans.commit();

		return results.get(1);
	}
	
	private void checkPrimitiveType(Attribute att) {
		Assert.assertEquals(getCorrectPrimitiveType(att.getName()), att.getAttributeType().getPrimitiveType());
	}
	
	private static PrimitiveType getCorrectPrimitiveType(String attName) {
		Optional<PrimitiveType> primitive = PrimitiveType.VALUES
				.stream()
				.filter(prim -> prim.toString().equalsIgnoreCase(attName.replaceAll("Att", "")))
				.findFirst();
		return primitive.get();
	}
}
