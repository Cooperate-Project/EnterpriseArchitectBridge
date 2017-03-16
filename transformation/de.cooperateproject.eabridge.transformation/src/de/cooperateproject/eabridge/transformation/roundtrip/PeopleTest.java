package de.cooperateproject.eabridge.transformation.roundtrip;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl;
import de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl;
import de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl;
import de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

public class PeopleTest extends TransformationTestBase {

	private static String testName = "People";

	// XMI -> UML -> XMI
	private void runTransformation() throws Exception {
		runEAtoUMLTransformation("EAtoUML.qvto", makeXMIPath(testName), makeUMLTransformedPath(testName));
		runUMLtoEATransformation("UMLtoEA.qvto", makeUMLTransformedPath(testName), makeXMITransformedPath(testName));
	}

	@Test
	public void testTransformation() throws Exception {
		runTransformation();
	}

	@Test
	public void testResults() throws Exception {
		runTransformation();

		ModelExtent xmiDest = new BasicModelExtent(getResourceSet()
				.getResource(createResourceModelURI(makeXMITransformedPath(testName)), true).getContents());
		List<EObject> modelsDest = xmiDest.getContents();

		ModelExtent xmiSource = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeXMIPath(testName)), true).getContents());
		List<EObject> modelsSource = xmiSource.getContents();

		// TODO: Refactor

		// Main Package
		PackageImpl mainPackageDest = (PackageImpl) ((PackageImpl) modelsDest.get(0)).getPackages().get(0);
		PackageImpl mainPackageSource = (PackageImpl) ((PackageImpl) modelsSource.get(0)).getPackages().get(0);
		assertEquals(mainPackageSource.getName(), mainPackageDest.getName());

		// Person class
		ElementImpl personClassDest = (ElementImpl) mainPackageDest.getElements().get(0);
		ElementImpl personClassSource = (ElementImpl) mainPackageSource.getElements().get(0);
		assertEquals(personClassSource.getName(), personClassDest.getName());

		// Attributes
		assertEquals(personClassSource.getAttributes().size(), personClassDest.getAttributes().size());

		AttributeImpl ageAttrDest = (AttributeImpl) personClassDest.getAttributes().get(0);
		AttributeImpl ageAttrSource = (AttributeImpl) personClassSource.getAttributes().get(0);
		assertEquals(ageAttrSource.getName(), ageAttrDest.getName());
		assertEquals(ageAttrSource.getScope(), ageAttrDest.getScope());
		assertEquals(ageAttrSource.getAttributeType().getPrimitiveType(),
				ageAttrDest.getAttributeType().getPrimitiveType());

		// Simple operations with primitive types
		assertEquals(personClassSource.getMethods().size(), personClassDest.getMethods().size());

		MethodImpl isAdultDest = (MethodImpl) personClassDest.getMethods().get(0);
		MethodImpl isAdultSource = (MethodImpl) personClassSource.getMethods().get(0);
		assertEquals(isAdultDest.getName(), isAdultSource.getName());
		assertEquals(isAdultDest.getReturnType().getPrimitiveType(), isAdultSource.getReturnType().getPrimitiveType());

		MethodImpl sayHiDest = (MethodImpl) personClassDest.getMethods().get(1);
		MethodImpl sayHiSource = (MethodImpl) personClassSource.getMethods().get(1);
		assertEquals(sayHiDest.getName(), sayHiSource.getName());
		assertEquals(sayHiDest.getParameters().get(0).getName(), sayHiSource.getParameters().get(0).getName());
		assertEquals(sayHiDest.getParameters().get(0).getParameterType().getPrimitiveType(),
				sayHiSource.getParameters().get(0).getParameterType().getPrimitiveType());
		assertEquals(sayHiDest.getParameters().get(0).getKind(), sayHiSource.getParameters().get(0).getKind());

		// Complex operation with data type
		MethodImpl tellJokeDest = (MethodImpl) personClassDest.getMethods().get(2);
		MethodImpl tellJokeSource = (MethodImpl) personClassSource.getMethods().get(2);
		assertEquals(tellJokeDest.getName(), tellJokeSource.getName());
		assertEquals(tellJokeDest.getParameters().size(), tellJokeSource.getParameters().size());
		assertEquals(tellJokeDest.getParameters().get(0).getName(), tellJokeSource.getParameters().get(0).getName());
		assertEquals(tellJokeDest.getParameters().get(0).getParameterType().getClassifier().getName(),
				tellJokeSource.getParameters().get(0).getParameterType().getClassifier().getName());

	}

}
