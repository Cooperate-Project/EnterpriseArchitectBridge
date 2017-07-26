package de.cooperateproject.eabridge.transformation.ea2uml;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

@Ignore
public class NestedTest extends TransformationTestBase {

	private static String transformationPath = "EAtoUML.qvto";
	private static String testName = "Nested";
	private static TestResource changelog = TestResource.NestedChangelog;

	@BeforeClass
	public static void initXMI() throws Exception {
		generateXMI(changelog, makeXMIPath(testName));
	}

	@Test
	public void testTransformation() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName) , makeNotationTransformedPath(testName));
	}
}
