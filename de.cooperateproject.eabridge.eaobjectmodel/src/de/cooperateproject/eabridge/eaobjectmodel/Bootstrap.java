package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcoreFactory;

public class Bootstrap {
	
	public static void bootstrap(HbDataStore hbds) {
		
		Element ele = XcoreFactory.eINSTANCE.createElement();
				
		Attribute att = XcoreFactory.eINSTANCE.createAttribute();
		att.setAllowDuplicates(true);
		att.setAttributeGUID("testattribute");
		att.setClassifier("0");
		att.setContainer(null);
		att.setNotes("notes");
		att.setName("name");
//		att.setParent(ele);
		
		Connector connect = XcoreFactory.eINSTANCE.createConnector();
		
		
		final SessionFactory sessionFac = hbds.getSessionFactory();
		
		Session session = sessionFac.openSession();
		Transaction trans = session.getTransaction();
		
		trans.begin();
//		session.save(ele);
		session.save(att);
		session.save(connect);
		trans.commit();
	}

}
