package de.cooperateproject.eabridge.transformation.ea2uml;

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

//	@Test
//	public void testImplementation() throws Exception {
//		runTransformation(transformationPath, makeXMIPath(testName), makeUMLPath(testName));
//		ModelExtent uml = new BasicModelExtent(
//				getResourceSet().getResource(createResourceModelURI(makeUMLPath(testName)), true).getContents());
//		List<EObject> content = uml.getContents();
//
//		// Base Model
//		Assert.assertEquals(1, content.size());
//
//		ModelImpl model = (ModelImpl) content.get(0);
//		PackageImpl portable = (PackageImpl) model.getPackagedElements().get(0);
//
//		// Class and Interface
//		Assert.assertEquals(portable.getPackagedElements().size(), 2);
//
//		ClassImpl box = (ClassImpl) portable.getPackagedElement("Box");
//		List<Interface> implementedInterfaces = box.getImplementedInterfaces();
//
//		// Interface implementation
//		Assert.assertEquals(implementedInterfaces.size(), 1);
//		Assert.assertSame(implementedInterfaces.get(0), portable.getPackagedElement("Portable"));
//	}

}
