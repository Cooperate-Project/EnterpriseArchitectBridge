package de.cooperateproject.eabridge.transformation.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;
import de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl;

public class EAObjectModelComparer {

	private void compareEList(EList<? extends EObject> expected, EList<? extends EObject> actual,
			BiConsumer<EObject, EObject> compareFunction) {

		// Size
		assertEquals(expected.size(), actual.size());

		// Compare
		for (int i = 0; i < expected.size(); i++) {
			compareFunction.accept(expected.get(i), actual.get(i));
		}

	}

	private void compareMatchingEObjects(EList<? extends EObject> expected, EList<? extends EObject> actual,
			String uniqueAttributeToMatch, BiConsumer<EObject, EObject> compareFunction) {

		// Size
		assertEquals(expected.size(), actual.size());

		HashMap<Object, EObject> expectedMap = new HashMap<Object, EObject>();
		HashMap<Object, EObject> actualMap = new HashMap<Object, EObject>();

		// Create maps
		for (EObject eObject : expected) {
			Object result = getEAttributeValue(eObject, uniqueAttributeToMatch);
			assertFalse(expectedMap.containsKey(result));
			expectedMap.put(result, eObject);
		}
		for (EObject eObject : actual) {
			Object result = getEAttributeValue(eObject, uniqueAttributeToMatch);
			assertFalse(actualMap.containsKey(result));
			actualMap.put(result, eObject);
		}

		// Size
		assertEquals(expectedMap.size(), actualMap.size());

		// Match
		expectedMap.forEach((key, value) -> {
			Assert.assertTrue(actualMap.containsKey(key));
			compareFunction.accept(value, actualMap.get(key));
		});
	}

	private Object getEAttributeValue(EObject eObject, String attributeName) {
		Object result = null;
		EList<EAttribute> eAllAttributes = eObject.eClass().getEAllAttributes();
		for (EAttribute eAttribute : eAllAttributes) {
			if (eAttribute.getName().equals(attributeName)) {
				result = eObject.eGet(eAttribute);
			}
		}
		assertNotNull(result);
		return result;
	}

	public void compareModels(List<EObject> expected, List<EObject> actual) {

		// Size
		assertEquals(expected.size(), 1);
		assertEquals(actual.size(), 1);

		// Content
		comparePackages(((PackageImpl) expected.get(0)).getPackages(), ((PackageImpl) actual.get(0)).getPackages());

	}

	public void comparePackage(Package expected, Package actual) {

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Packages
		comparePackages(expected.getPackages(), actual.getPackages());

		// Elements
		compareElements(expected.getElements(), actual.getElements());
	}

	public void comparePackages(EList<Package> expected, EList<Package> actual) {

		// FIXME: Should not need Maps, should work as List (correct ordering!)
		compareMatchingEObjects(expected, actual, "Name", (e, a) -> comparePackage((Package) e, (Package) a));

	}

	public void compareElements(EList<Element> expected, EList<Element> actual) {

		// FIXME: Should not need Maps, should work as List (correct ordering!)
		compareMatchingEObjects(expected, actual, "Name", (e, a) -> compareElement((Element) e, (Element) a));

	}

	public void compareElement(Element expected, Element actual) {

		// Abstract
		assertEquals(expected.isAbstract(), actual.isAbstract());

		// Attributes
		compareAttributes(expected.getAttributes(), actual.getAttributes());

		// Methods
		compareMethods(expected.getMethods(), actual.getMethods());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Type
		assertEquals(expected.getType(), actual.getType());

		// Connectors
		compareConnectors(expected.getSourceRelations(), actual.getSourceRelations());

		// Visibility
		// FIXME: Fix transformation first
		// assertEquals(expected.getVisibility(), actual.getVisibility());
	}

	private void compareTypeReference(TypeReference expected, TypeReference actual) {

		if (expected.getClassifier() == null) {
			assertEquals(expected.getPrimitiveType().getName(), actual.getPrimitiveType().getName());
		} else {
			assertEquals(expected.getClassifier().getName(), actual.getClassifier().getName());
		}

	}

	public void compareAttributes(EList<Attribute> expected, EList<Attribute> actual) {

		compareEList(expected, actual, (e, a) -> compareAttribute((Attribute) e, (Attribute) a));

	}

	public void compareMethods(EList<Method> expected, EList<Method> actual) {

		compareEList(expected, actual, (e, a) -> compareMethod((Method) e, (Method) a));

	}

	public void compareAttribute(Attribute expected, Attribute actual) {

		// AttributeType
		compareTypeReference(expected.getAttributeType(), actual.getAttributeType());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Scope
		assertEquals(expected.getScope(), actual.getScope());
	}

	public void compareMethod(Method expected, Method actual) {

		// Return Type (but only, if there is one)
		if (expected.getReturnType() != null && actual.getReturnType() != null)
			compareTypeReference(expected.getReturnType(), actual.getReturnType());

		// Parameters
		compareMethodParameters(expected.getParameters(), actual.getParameters());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Scope
		assertEquals(expected.getVisibility(), actual.getVisibility());
	}

	public void compareMethodParameters(EList<Methodparameter> expected, EList<Methodparameter> actual) {

		compareEList(expected, actual, (e, a) -> compareMethodParameter((Methodparameter) e, (Methodparameter) a));
	}

	public void compareMethodParameter(Methodparameter expected, Methodparameter actual) {

		// ParameterType
		compareTypeReference(expected.getParameterType(), actual.getParameterType());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Kind
		assertEquals(expected.getKind(), actual.getKind());
	}

	public void compareConnectors(EList<Connector> expected, EList<Connector> actual) {

		compareEList(expected, actual, (e, a) -> compareConnector((Connector) e, (Connector) a));

	}

	public void compareConnector(Connector expected, Connector actual) {

		// Direction
		assertEquals(expected.getDirection(), actual.getDirection());

		// Type
		assertEquals(expected.getType(), actual.getType());

		// Source
		assertEquals(expected.getSource().getName(), actual.getSource().getName());

		// Dest
		assertEquals(expected.getDest().getName(), actual.getDest().getName());
	}

}