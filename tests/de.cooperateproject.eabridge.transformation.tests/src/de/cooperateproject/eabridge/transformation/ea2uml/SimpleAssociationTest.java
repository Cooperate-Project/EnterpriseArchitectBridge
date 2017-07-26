package de.cooperateproject.eabridge.transformation.ea2uml;


import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.AssociationImpl;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

@Ignore
@SuppressWarnings("restriction")
public class SimpleAssociationTest extends TransformationTestBase {

	private static String transformationPath = "EAtoUML.qvto";
	private static String testName = "SimpleAssociation";
	private static TestResource changelog = TestResource.SimpleAssociationChangelog;

	@BeforeClass
	public static void initXMI() throws Exception {
		generateXMI(changelog, makeXMIPath(testName));
	}

	@Test
	public void testTransformation() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName) , makeNotationTransformedPath(testName));
	}
	
	@Test
	public void testAssociations() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName) , makeNotationTransformedPath(testName));
		ModelExtent uml = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeUMLTransformedPath(testName)), true).getContents());
		List<EObject> content = uml.getContents();

		// Base Model
		Assert.assertEquals(1, content.size());

		ModelImpl model = (ModelImpl) content.get(0);
		PackageImpl assoc = (PackageImpl) model.getPackagedElement("SimpleAssociation");
		
		ClassImpl A = (ClassImpl) assoc.getPackagedElement("A");
		ClassImpl B = (ClassImpl) assoc.getPackagedElement("B");
		
		for (PackageableElement elem : model.getPackagedElements()) {
			if (elem instanceof AssociationImpl) {
				AssociationImpl association = (AssociationImpl) elem;
				
				// Check ends
				Assert.assertEquals(2, association.getMemberEnds().size());
				
				// Check types (example: the a-b association)
				if (association.getMemberEnds().get(0).getType().equals(B)) {
					Assert.assertEquals(A, association.getMemberEnds().get(1).getType());
				}
			}
		}
	}


}
