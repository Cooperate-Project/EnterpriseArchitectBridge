package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.util.List;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;

public class CompositePrimaryKeyTest extends TeneoMappingBaseTest {
	
	@Test (expected=NonUniqueObjectException.class)
	public void testIdenticalConstraint() throws Exception {
		initTestDb(TestResource.SimpleClassModelWithSchemaChangelog);
		
		Session session = getDataStore().getSessionFactory().openSession();
		
		Attribute existingAttribute = getExistingAttribute(session);
		
		AttributeConstraint newAttConst = EaobjectmodelFactory.eINSTANCE.createAttributeConstraint();
		newAttConst.setConstraint("newConstraint");
		newAttConst.setAttribute(existingAttribute);
		
		persistEntity(session, newAttConst);
		
		AttributeConstraint newAttConstDuplicate = EaobjectmodelFactory.eINSTANCE.createAttributeConstraint();
		newAttConstDuplicate.setConstraint("newConstraint");
		newAttConstDuplicate.setAttribute(existingAttribute);
		
		persistEntity(session, newAttConstDuplicate);
	}
	
	@Test
	public void testSameConstraintDifferentAttribute() throws Exception {
		initTestDb(TestResource.SimpleClassModelWithSchemaChangelog);
		
		Session session = getDataStore().getSessionFactory().openSession();
		
		Attribute existingAttribute = getExistingAttribute(session);
		
		//adding a constraint to an attribute which already has constraints
		AttributeConstraint attConst = EaobjectmodelFactory.eINSTANCE.createAttributeConstraint();
		attConst.setConstraint("newConstraint");
		attConst.setAttribute(existingAttribute);
		
		persistEntity(session, attConst);
		
		Attribute newAttribute = EaobjectmodelFactory.eINSTANCE.createAttribute();
		newAttribute.setParent(existingAttribute.getParent());
		newAttribute.setAttributeGUID("newAttributeGUID");
		newAttribute.setName("newAttributeName");
		
		persistEntity(session, newAttribute);
		
		//adding a constraint with the same Constraint text to a new Attribute
		AttributeConstraint newAttConst = EaobjectmodelFactory.eINSTANCE.createAttributeConstraint();
		newAttConst.setConstraint("newConstraint");
		newAttConst.setAttribute(newAttribute);
		
		persistEntity(session, newAttConst);
	}
	
	private static void persistEntity(Session session, Object entity) {
		Transaction trans = session.getTransaction();
		trans.begin();
		session.save(entity);
		trans.commit();
	}
	
	private static Attribute getExistingAttribute(Session session) {
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM Attribute");
		List<Attribute> results = HibernateUtils.getListFromQuery(query, Attribute.class);
		trans.commit();
		
		return results.get(0);
	}

}
