package de.cooperateproject.eabridge.eaobjectmodel;

import java.io.IOException;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Bootstrap {

	public static void bootstrap(HbDataStore hbds) {

		Package rootPack = EaobjectmodelFactory.eINSTANCE.createPackage();
		rootPack.setName("rootPackage");
		rootPack.setPackageGUID("rootPackageGUID");

		Package pack = EaobjectmodelFactory.eINSTANCE.createPackage();
		pack.setName("package");
		pack.setPackageGUID("packageGUID");
		pack.setParent(rootPack);

		Element elePack = EaobjectmodelFactory.eINSTANCE.createElement();
		elePack.setName("package");
		elePack.setElementGUID("elementPackageGUID");
		elePack.setPackage(rootPack);
		// ID of corresponding Package
		elePack.setPDATA1("2");
		elePack.setType("Package");

		Element ele = EaobjectmodelFactory.eINSTANCE.createElement();
		ele.setName("element1");
		ele.setElementGUID("element1GUID");
		ele.setPackage(pack);
		ele.setType("Class");

		Element ele2 = EaobjectmodelFactory.eINSTANCE.createElement();
		ele2.setName("element2");
		ele2.setElementGUID("element2GUID");
		ele2.setPackage(pack);
		ele2.setType("Class");

		Attribute att = EaobjectmodelFactory.eINSTANCE.createAttribute();
		att.setParent(ele);
		att.setAllowDuplicates(true);
		att.setAttributeGUID("attributeGUID");
		att.setClassifier("0");
		att.setContainer(null);
		att.setNotes("attNotes");
		att.setName("attName");

		AttributeConstraint attConst = EaobjectmodelFactory.eINSTANCE.createAttributeConstraint();
		attConst.setConstraint("testconstraint");
		attConst.setAttribute(att);
		attConst.setElementOfAttribute(ele);

		// composite ID check
		// should fail if not commented
		// AttributeConstraint attConst2 =
		// EaobjectmodelFactory.eINSTANCE.createAttributeConstraint();
		// attConst2.setConstraint("testconstraint");
		// attConst2.setAttribute(att);

		AttributeTag attTag = EaobjectmodelFactory.eINSTANCE.createAttributeTag();
		attTag.setAttribute(att);
		attTag.setName("attTagName");
		attTag.setNotes("attTagNotes");
		attTag.setTagGUID("attTagGuid");

		Method method = EaobjectmodelFactory.eINSTANCE.createMethod();
		method.setName("method");
		method.setMethodGUID("methodGUID");
		method.setParent(ele2);

		Connector connect = EaobjectmodelFactory.eINSTANCE.createConnector();
		connect.setType(ConnectorType.CONNECTOR_TYPE.ASSOCIATION);
		connect.setName("connector");
		connect.setConnectorGUID("connectorGUID");
		connect.setSource(ele);
		connect.setSourceCard("1...*");
		connect.setDest(ele2);
		connect.setDestCard("4");

		Diagram diagram = EaobjectmodelFactory.eINSTANCE.createDiagram();
		diagram.setPackage(pack);
		diagram.setType("Logical");
		diagram.setName("diagram");
		diagram.setDiagramGUID("diagramGUID");

		DiagramLink diaLink = EaobjectmodelFactory.eINSTANCE.createDiagramLink();
		diaLink.setDiagram(diagram);
		diaLink.setConnector(connect);

		DiagramObject diaObj1 = EaobjectmodelFactory.eINSTANCE.createDiagramObject();
		diaObj1.setDiagram(diagram);
		diaObj1.setElement(ele);

		DiagramObject diaObj2 = EaobjectmodelFactory.eINSTANCE.createDiagramObject();
		diaObj2.setDiagram(diagram);
		diaObj2.setElement(ele2);

		final SessionFactory sessionFac = hbds.getSessionFactory();

		Session session = sessionFac.openSession();
		Transaction trans = session.getTransaction();

//		trans.begin();
//		session.save(rootPack);
//		trans.commit();

		// For setting the right PDATA1 in the element of the second package
		// Query query = session.createQuery("SELECT element FROM Element
		// element WHERE element.Name='package'");
		// List<Element> elements = query.list();
		// System.out.println(""+
		// elements.get(0).getCorrespondingPackage().getName());
		// System.out.println(""+ elements.get(0).getPackage().getName());
		
		try {
			EAObjectModelHelper.saveModel(rootPack, "resources/Bootstrap.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Package loadedPackage = null;
		try {
			loadedPackage = EAObjectModelHelper.loadModel("resources/Bootstrap.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		trans.begin();
		session.save(loadedPackage);
		trans.commit();
		
	}

}
