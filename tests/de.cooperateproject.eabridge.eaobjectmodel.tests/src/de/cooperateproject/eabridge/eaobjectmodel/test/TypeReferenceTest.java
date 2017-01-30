package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.util.List;

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

public class TypeReferenceTest extends TeneoMappingBaseTest {

	@Test
	public void test() throws Exception {
		initTestDb(TestResource.DataTypeChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Element ele = getElement(session);
		
		List<Attribute> atts = ele.getAttributes();
		isPrimitiveTypeReference(atts.get(0).getAttributeType());
		isClassifierTypeReference(atts.get(1).getAttributeType(), session);
		
		List<Method> methods = ele.getMethods();
		isPrimitiveTypeReference(methods.get(0).getReturnType());
		isPrimitiveTypeReference(methods.get(0).getParameters().get(0).getParameterType());
		
		isClassifierTypeReference(methods.get(1).getReturnType(), session);
		isClassifierTypeReference(methods.get(1).getParameters().get(0).getParameterType(), session);
		
	}

	private static Element getElement(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Element");
		List<Element> results = HibernateUtils.getListFromQuery(query, Element.class);
		trans.commit();

		return results.get(1);
	}
	
	private static Element getClassifier(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Element");
		List<Element> results = HibernateUtils.getListFromQuery(query, Element.class);
		trans.commit();

		return results.get(2);
	}
	
	private static void isPrimitiveTypeReference(TypeReference typeRef) {
		Assert.assertNull(typeRef.getClassifier());
		Assert.assertSame(typeRef.getPrimitiveType(), PrimitiveType.INT);
	}
	
	private static void isClassifierTypeReference(TypeReference typeRef, Session session) {
		Assert.assertSame(getClassifier(session), typeRef.getClassifier());
		Assert.assertEquals(getClassifier(session).getName(), typeRef.getType());
	}
}
