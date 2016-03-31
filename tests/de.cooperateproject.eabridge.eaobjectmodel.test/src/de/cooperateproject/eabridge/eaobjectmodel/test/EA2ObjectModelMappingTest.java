package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.test.util.DBChangelogInitializer;

public class EA2ObjectModelMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testReadSimpleDiagram() throws Exception {
		initTestDb(new DBChangelogInitializer("resources/SimpleClassDiagram.changelog.xml"));
		
		Session session = getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		Query query = session.createQuery("FROM RootPackage");
		List<?> results = query.list();
		trans.commit();

		assertEquals(1, results.size());
	}

}
