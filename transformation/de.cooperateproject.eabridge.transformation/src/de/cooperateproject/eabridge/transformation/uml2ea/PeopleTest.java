package de.cooperateproject.eabridge.transformation.uml2ea;

import org.junit.Test;

import de.cooperateproject.eabridge.transformation.TransformationTestBase;

public class PeopleTest extends TransformationTestBase {

	private static String transformationPath = "UMLtoEA.qvto";
	private static String testName = "People";

	@Test
	public void testTransformation() throws Exception {
		runUMLtoEATransformation(transformationPath, makeUMLPath(testName), makeXMITransformedPath(testName));
	}

}
