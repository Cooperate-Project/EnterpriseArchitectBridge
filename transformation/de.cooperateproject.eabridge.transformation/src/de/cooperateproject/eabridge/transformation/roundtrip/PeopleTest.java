package de.cooperateproject.eabridge.transformation.roundtrip;

import org.junit.Test;

import de.cooperateproject.eabridge.transformation.TransformationTestBase;

public class PeopleTest extends TransformationTestBase {

	private static String testName = "People";

	@Test
	public void testTransformation() throws Exception {
		runUMLtoEATransformation("UMLtoEA.qvto", makeUMLPath(testName), makeXMITransformedPath(testName));
		runEAtoUMLTransformation("EAtoUML.qvto", makeXMITransformedPath(testName), makeUMLTransformedPath(testName));
	}

}
