package de.cooperateproject.eabridge.transformation.testing;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

@Ignore
@SuppressWarnings("restriction")
public class AdvancedAssociationTest extends TransformationTestBase {

	private static String transformationPath = "EAtoUML.qvto";
	private static String testName = "AdvancedAssociation";
	private static TestResource changelog = TestResource.AdvancedAssociationChangelog;
		
	@BeforeClass
	public static void initXMI() throws Exception {
		generateXMI(changelog, makeXMIPath(testName));
	}
	
	@Test
	public void testTransformation() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName) , makeNotationTransformedPath(testName));
	}

}
