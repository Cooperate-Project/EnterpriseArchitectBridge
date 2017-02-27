package de.cooperateproject.eabridge.transformation.ea2uml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

@SuppressWarnings("restriction")
public class PortableTest extends TransformationTestBase {

	private static String transformationPath = "EAtoUML.qvto";
	private static String testName = "Portable";
	private static TestResource changelog = TestResource.PortableChangelog;

	@BeforeClass
	public static void initXMI() throws Exception {
		generateXMI(changelog, makeXMIPath(testName));
	}

	@Test
	public void testTransformation() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName));
	}

	@Test
	public void testImplementation() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName));
		ModelExtent uml = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeUMLTransformedPath(testName)), true).getContents());
		List<EObject> content = uml.getContents();

		// Base Model
		Assert.assertEquals(1, content.size());

		ModelImpl model = (ModelImpl) content.get(0);
		PackageImpl portable = (PackageImpl) model.getPackagedElements().get(0);

		// Class and Interface
		Assert.assertEquals(portable.getPackagedElements().size(), 2);

		ClassImpl box = (ClassImpl) portable.getPackagedElement("Box");
		List<Interface> implementedInterfaces = box.getImplementedInterfaces();

		// Interface implementation
		Assert.assertEquals(implementedInterfaces.size(), 1);
		Assert.assertSame(implementedInterfaces.get(0), portable.getPackagedElement("Portable"));
	}

}
