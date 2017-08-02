package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection;
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
		method1.getParameters().add(newMethodparam);
		
		persistEntity(session, newMethodparam);
		
		session.close();
		session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		method1 = getFirstMethod(session);
		newMethodparam = method1.getParameters().get(method1.getParameters().size() - 1);
		assertThat(newMethodparam.getName(), equalTo(methodparam.getName()));
		assertThat(newMethodparam.getEa_guid(), equalTo(TEST_EA_GUID));
		assertThat(newMethodparam.getMethod(), equalTo(method1));
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
		newMethodparam.setPosition(2);
		method2.getParameters().add(newMethodparam);
		
		persistEntity(session, newMethodparam);
		
		session.close();
		session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		method2 = getSecondMethod(session);
		
		newMethodparam = method2.getParametersOrdered().get(method2.getParameters().size() - 1);
		assertThat(newMethodparam.getName(), equalTo(TEST_METHODPARAMETER_NAME));
		assertThat(newMethodparam.getEa_guid(), equalTo(TEST_EA_GUID));
		assertThat(newMethodparam.getMethod(), equalTo(method2));
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
		method2.getParameters().add(newMethodparam);
		
		persistEntity(session, newMethodparam);
	}
	
	@Test
	public void testKind() throws Exception {
		initTestDb(TestResource.PeopleChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Method method2 = getSecondMethod(session);
		Methodparameter methodparam = method2.getParameters().get(0);
		assertEquals(ParameterDirection.IN, methodparam.getKind());

	}
	
	@Test
	public void testChangedOrder() throws Exception {
		initTestDb(TestResource.PeopleChangelog);
		
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		Method method2 = getSecondMethod(session);
		Methodparameter newParam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		newParam.setName(TEST_METHODPARAMETER_NAME);
		newParam.setEa_guid(TEST_EA_GUID);
		newParam.setMethod(method2);
		method2.getParameters().add(newParam);
		//method2.getParameters().move(0, 1);
		newParam.setPosition(1);
		method2.getParameters().get(0).setPosition(2);
		
		persistEntity(session, newParam);
		
		session.close();
		session = getTestDB().getDataStore().getSessionFactory().openSession();
		
		method2 = getSecondMethod(session);
		assertThat(method2.getParameters(), hasSize(2));
		assertThat(method2.getParameters().get(0).getName(), equalTo(TEST_METHODPARAMETER_NAME));
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
		
		results.forEach(m -> System.out.println(m.getName()));
		
		return results.get(0);
	}
	
	private static Method getSecondMethod(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Method");
		List<Method> results = HibernateUtils.getListFromQuery(query, Method.class);
		trans.commit();
		
		
		
		Method m = results.get(1);
		m.getParameters().forEach(p -> System.out.println(p.getName()));
		return m;
	}
	
}
