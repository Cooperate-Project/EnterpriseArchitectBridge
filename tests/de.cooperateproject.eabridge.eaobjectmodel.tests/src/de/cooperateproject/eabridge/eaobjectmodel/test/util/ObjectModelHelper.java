package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.ElementType;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

public class ObjectModelHelper {

	public static int RandomInteger() {
		// same id for tests
		return 2;
		//return    (int)(Math.random() * ((100000) + 1));
	}

	public Element createElement(int randomInteger, Package pack, String name, ElementType eleType) {
		Element el = EaobjectmodelFactory.eINSTANCE.createElement();
		el.setName(name);
		el.setElementGUID("elementGUID_" + randomInteger);
		el.setPackage(pack);
		el.setType(eleType);
		return el;
	}

	public Attribute createElementAttr(int randomInteger, Element element, String name, Scope scope, String typ, long position) {
		Attribute att = EaobjectmodelFactory.eINSTANCE.createAttribute();
		att.setParent(element);
		att.setAllowDuplicates(false);
		att.setAttributeGUID("attributeGUID_" + randomInteger);
		att.setName(name);
		att.setScope(scope);
		TypeReference t = EaobjectmodelFactory.eINSTANCE.createTypeReference();
		t.setType(typ);
		att.setAttributeType(t);
		att.setPosition(position);
		return att;
	}
	
	public Method createElementMethode(Element el, String name, String typ, Scope visibility, int randomInteger, long position) {
		Method method = EaobjectmodelFactory.eINSTANCE.createMethod();
		method.setParent(el);
		method.setName(name);
		TypeReference t = EaobjectmodelFactory.eINSTANCE.createTypeReference();
		t.setType(typ);
		
		method.setReturnType(t);
		method.setMethodGUID("MethodeGUID_" + randomInteger);
		method.setVisibility(visibility);
		method.setPosition(position);
		Methodparameter firstParam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam.setMethod(method);
		firstParam.setParameterType(t);
		firstParam.setPosition(1);
		return method;
	}
	
	public Connector createConnector(int randomInteger, Element source, Element destination, ConnectorType typ, String destCart, String sourceCard ) {
		Connector connect = EaobjectmodelFactory.eINSTANCE.createConnector();
		connect.setType(typ);
		connect.setConnectorGUID("connectorGUID_" + randomInteger);
		connect.setSource(source);
		connect.setDest(destination);
		if(destCart != null) {
			connect.setDestCard(destCart);	
		}
		if(sourceCard != null) {
			connect.setDestCard(sourceCard);	
		}
		return connect;
	}
	
	public Diagram createDiagram(int randomInteger, Package pack, String type, String name ) {
		Diagram diagram = EaobjectmodelFactory.eINSTANCE.createDiagram();
		diagram.setPackage(pack);
		diagram.setType(type);
		diagram.setName(name);
		diagram.setDiagramGUID("diagramGUID_" + randomInteger);
		return diagram;
	}
	
	public DiagramLink createDiagramLink(int randomInteger, Diagram diagram, Connector connect) {
		DiagramLink diaLink = EaobjectmodelFactory.eINSTANCE.createDiagramLink();
		diaLink.setDiagram(diagram);
		diaLink.setConnector(connect);
		return diaLink;
	}
	
	public DiagramObject createDiagrammObject(Diagram d, Element el, int left, int right, int top, int bottom, long sequence) {
		DiagramObject diaObj = EaobjectmodelFactory.eINSTANCE.createDiagramObject();
		diaObj.setDiagram(d);
		diaObj.setElement(el);
		diaObj.setLeft(left);
		diaObj.setTop(top);
		diaObj.setRight(right);
		diaObj.setBottom(bottom);
		diaObj.setSequence(sequence);
		return diaObj;
	}
	
	public Package createRootPackage(String name) {
		int randomInteger = RandomInteger();
		Package rootPack = EaobjectmodelFactory.eINSTANCE.createPackage();
		rootPack.setName(name);
		rootPack.setPackageGUID("rootPackageGUID_" + randomInteger);
		return rootPack;
	}
	
	public Package createSubPackage(Package rootPack) {
		Package pack = EaobjectmodelFactory.eINSTANCE.createPackage();
		int randomInteger = RandomInteger();
		pack.setName("unterpackage");
		pack.setPackageGUID("packageGUID_" + randomInteger);
		pack.setParent(rootPack);	
		return pack;
	}
	
}
