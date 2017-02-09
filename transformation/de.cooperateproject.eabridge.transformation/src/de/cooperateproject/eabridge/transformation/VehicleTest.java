package de.cooperateproject.eabridge.transformation;

import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;

public class VehicleTest extends TransformationTestBase {
	
	private static String transformationPath = "EAtoUML.qvto";
	private static String testName = "Vehicles";
	private static TestResource changelog = TestResource.VehicleChangelog;
		
	@BeforeClass
	public static void initXMI() throws Exception {
		generateXMI(changelog, makeXMIPath(testName));
	}
	
	@Test
	public void testTransformation() throws Exception {
		runTransformation(transformationPath, makeXMIPath(testName), makeUMLPath(testName));
	}
	
}
