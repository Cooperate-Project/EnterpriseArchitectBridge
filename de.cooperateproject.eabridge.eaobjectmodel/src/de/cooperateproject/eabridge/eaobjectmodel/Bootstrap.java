package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag;
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
		//ID of corresponding Package
		elePack.setPDATA1("2");
		elePack.setType("Package");
		
		Element ele = XcoreFactory.eINSTANCE.createElement();
		ele.setName("element");
		ele.setElementGUID("elementGUID");
		ele.setPackage(pack);
		ele.setType("Class");
		
		Attribute att = XcoreFactory.eINSTANCE.createAttribute();
		att.setParent(ele);
		att.setAllowDuplicates(true);
		att.setAttributeGUID("attributeGUID");
		att.setClassifier("0");
		att.setContainer(null);
		att.setNotes("attNotes");
		att.setName("attName");
		
		AttributeConstraint attConst = XcoreFactory.eINSTANCE.createAttributeConstraint();
		attConst.setConstraint("testconstraint");
		attConst.setAttribute(att);
		attConst.setElementOfAttribute(ele);
		
		AttributeTag attTag = XcoreFactory.eINSTANCE.createAttributeTag();
		attTag.setAttribute(att);
		attTag.setName("attTagName");
		attTag.setNotes("attTagNotes");
		attTag.setTagGUID("attTagGuid");
		
		//composite ID check
		//should fail if not commented
//		AttributeConstraint attConst2 = XcoreFactory.eINSTANCE.createAttributeConstraint();
//		attConst2.setConstraint("testconstraint");
//		attConst2.setAttribute(att);
		
		Connector connect = XcoreFactory.eINSTANCE.createConnector();
		
		
		final SessionFactory sessionFac = hbds.getSessionFactory();
		
		Session session = sessionFac.openSession();
		Transaction trans1 = session.getTransaction();
		
		trans1.begin();
		session.save(rootPack);
		session.save(pack);
		trans1.commit();
		
//		//Workaround for default Parent_ID problem
//		Query query1 = session.createQuery("UPDATE Package SET Parent_ID=0 WHERE Name='package'");
		
		// For setting the right PDATA1 in the element of the second package
		Query query2 = session.createQuery("SELECT package FROM Package package WHERE package.Name='package'");
		List<Package> packages = query2.list();
		elePack.setPDATA1(packages.get(0).getPackageID() + "");
		
		Transaction trans2 = session.getTransaction();
		
		trans2.begin();
		session.save(elePack);
		session.save(ele);
		session.save(att);
		session.save(attConst);
		session.save(attTag);
//		session.save(connect);
		trans2.commit();
	}

}
