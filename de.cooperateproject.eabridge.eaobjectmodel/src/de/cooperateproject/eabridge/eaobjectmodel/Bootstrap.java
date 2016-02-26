package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Package;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcoreFactory;

public class Bootstrap {
	
	public static void bootstrap(HbDataStore hbds) {
		
		Package rootPack = XcoreFactory.eINSTANCE.createPackage();
		rootPack.setName("rootPackage");
		rootPack.setPackageGUID("rootPackageGUID");
		
		Package pack = XcoreFactory.eINSTANCE.createPackage();
		pack.setName("package");
		pack.setPackageGUID("packageGUID");
		pack.setParent(rootPack);
		
		Element elePack = XcoreFactory.eINSTANCE.createElement();
		elePack.setName("elementPackage");
		elePack.setElementGUID("elementPackageGUID");
		elePack.setPackage(rootPack);
		elePack.setPDATA1("2");
		elePack.setType("Package");
		
		Element ele = XcoreFactory.eINSTANCE.createElement();
		ele.setName("testElement");
		ele.setElementGUID("elementGUID");
		ele.setPackage(pack);
		ele.setType("Class");
		
		Attribute att = XcoreFactory.eINSTANCE.createAttribute();
		att.setParent(ele);
		att.setAllowDuplicates(true);
		att.setAttributeGUID("testattribute");
		att.setClassifier("0");
		att.setContainer(null);
		att.setNotes("notes");
		att.setName("name");
		
		AttributeConstraint attConst = XcoreFactory.eINSTANCE.createAttributeConstraint();
		attConst.setConstraint("testconstraint");
		attConst.setAttribute(att);
		
		//composite ID check
		//should fail if not uncommented
//		AttributeConstraint attConst2 = XcoreFactory.eINSTANCE.createAttributeConstraint();
//		attConst2.setConstraint("testconstraint");
//		attConst2.setAttribute(att);
		
		Connector connect = XcoreFactory.eINSTANCE.createConnector();
		
		
		final SessionFactory sessionFac = hbds.getSessionFactory();
		
		Session session = sessionFac.openSession();
		Transaction trans = session.getTransaction();
		
		trans.begin();
		session.save(rootPack);
		session.save(pack);
		session.save(elePack);
		session.save(ele);
		session.save(att);
		session.save(attConst);
//		session.save(connect);
		trans.commit();
	}

}
