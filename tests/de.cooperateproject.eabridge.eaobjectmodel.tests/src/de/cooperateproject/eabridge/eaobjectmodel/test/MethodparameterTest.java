package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.util.List;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;


import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.eabridge.tests.common.TeneoMappingBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public class MethodparameterTest extends TeneoMappingBaseTest {
	
	private final String TEST_EA_GUID = "ABC";
	private final String TEST_METHODPARAMETER_NAME = "ABC";

	@Test
	public void createMethodParamterWithDuplicateName() throws Exception {
		initTestDb(TestResource.PeopleChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Method method1 = getFirstMethod(session);
		Method method2 = getSecondMethod(session);
		Methodparameter methodparam = method2.getParameters().get(0);
		
		Methodparameter newMethodparam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		newMethodparam.setName(methodparam.getName());
		newMethodparam.setMethod(method1);
		newMethodparam.setEa_guid(TEST_EA_GUID);
		
		persistEntity(session, newMethodparam);
	}
	
	@Test
	public void createMethodParamterWithDuplicateMethod() throws Exception {
		initTestDb(TestResource.PeopleChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Method method2 = getSecondMethod(session);
		
		Methodparameter newMethodparam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		newMethodparam.setName(TEST_METHODPARAMETER_NAME);
		newMethodparam.setMethod(method2);
		newMethodparam.setEa_guid(TEST_EA_GUID);
		
		persistEntity(session, newMethodparam);
	}
	
	@Test (expected=NonUniqueObjectException.class)
	public void createDuplicteMethodParamter() throws Exception {
		initTestDb(TestResource.PeopleChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Method method2 = getSecondMethod(session);
		Methodparameter methodparam = method2.getParameters().get(0);
		
		Methodparameter newMethodparam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		newMethodparam.setName(methodparam.getName());
		newMethodparam.setMethod(method2);
		newMethodparam.setEa_guid(TEST_EA_GUID);
		
		persistEntity(session, newMethodparam);
	}
	
	private static void persistEntity(Session session, Object entity) {
		Transaction trans = session.getTransaction();
		trans.begin();
		session.save(entity);
		trans.commit();
	}
	
	private static Method getFirstMethod(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Method");
		List<Method> results = HibernateUtils.getListFromQuery(query, Method.class);
		trans.commit();
		
		return results.get(0);
	}
	
	private static Method getSecondMethod(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Method");
		List<Method> results = HibernateUtils.getListFromQuery(query, Method.class);
		trans.commit();
		
		return results.get(1);
	}
	
}
