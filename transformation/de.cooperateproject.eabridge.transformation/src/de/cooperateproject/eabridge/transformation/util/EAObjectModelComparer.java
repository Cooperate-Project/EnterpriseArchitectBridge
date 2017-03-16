package de.cooperateproject.eabridge.transformation.util;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

public class EAObjectModelComparer {

	public void comparePackage(Package expected, Package actual) {

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Packages
		comparePackages(expected.getPackages(), actual.getPackages());

		// Elements
		compareElements(expected.getElements(), actual.getElements());
	}

	public void comparePackages(EList<Package> expected, EList<Package> actual) {

		// Size
		assertEquals(expected.size(), actual.size());

		// Content
		for (int i = 0; i < expected.size(); i++) {
			comparePackage(expected.get(i), actual.get(i));
		}
	}

	public void compareElements(EList<Element> expected, EList<Element> actual) {

		// Size
		assertEquals(expected.size(), actual.size());

		// Content
		for (int i = 0; i < expected.size(); i++) {
			compareElement(expected.get(i), actual.get(i));
		}
	}

	public void compareElement(Element expected, Element actual) {

		// Abstract
		assertEquals(expected.getAbstract(), actual.getAbstract());

		// Attributes
		compareAttributes(expected.getAttributes(), actual.getAttributes());

		// Methods
		compareMethods(expected.getMethods(), actual.getMethods());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Type
		assertEquals(expected.getType(), actual.getType());

		// Visibility
		// FIXME: Fix transformation first
		// assertEquals(expected.getVisibility(), actual.getVisibility());
	}

	public void compareTypeReference(TypeReference expected, TypeReference actual) {

		if (expected == null) {
			System.out.println("Empty type reference.");
		} else {

			if (expected.getClassifier() == null) {
				assertEquals(expected.getPrimitiveType().getName(), actual.getPrimitiveType().getName());
			} else {
				assertEquals(expected.getClassifier().getName(), actual.getClassifier().getName());
			}
		}
	}

	public void compareAttributes(EList<Attribute> expected, EList<Attribute> actual) {

		// Size
		assertEquals(expected.size(), actual.size());

		// Content
		for (int i = 0; i < expected.size(); i++) {
			compareAttribute(expected.get(i), actual.get(i));
		}
	}

	public void compareMethods(EList<Method> expected, EList<Method> actual) {

		// Size
		assertEquals(expected.size(), actual.size());

		// Content
		for (int i = 0; i < expected.size(); i++) {
			compareMethod(expected.get(i), actual.get(i));
		}
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

		// Return Type
		compareTypeReference(expected.getReturnType(), actual.getReturnType());

		// Parameters
		compareMethodParameters(expected.getParameters(), actual.getParameters());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Scope
		assertEquals(expected.getVisibility(), actual.getVisibility());
	}

	public void compareMethodParameters(EList<Methodparameter> expected, EList<Methodparameter> actual) {

		// Size
		assertEquals(expected.size(), actual.size());

		// Content
		for (int i = 0; i < expected.size(); i++) {
			compareMethodParameter(expected.get(i), actual.get(i));
		}
	}

	public void compareMethodParameter(Methodparameter expected, Methodparameter actual) {

		// ParameterType
		compareTypeReference(expected.getParameterType(), actual.getParameterType());

		// Name
		assertEquals(expected.getName(), actual.getName());

		// Kind
		assertEquals(expected.getKind(), actual.getKind());
	}

}