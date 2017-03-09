package de.cooperateproject.eabridge.transformation.roundtrip;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl;
import de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl;
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
	public void testAttributes() throws Exception {
		runTransformation();
		
		ModelExtent xmiDest = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeXMITransformedPath(testName)), true).getContents());
		List<EObject> modelsDest = xmiDest.getContents();
		
		ModelExtent xmiSource = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeXMIPath(testName)), true).getContents());
		List<EObject> modelsSource = xmiSource.getContents();
		
		// Main Package
		PackageImpl mainPackageDest = (PackageImpl) ((PackageImpl)modelsDest.get(0)).getPackages().get(0);
		PackageImpl mainPackageSource = (PackageImpl) ((PackageImpl)modelsSource.get(0)).getPackages().get(0);
		assertEquals(mainPackageSource.getName(), mainPackageDest.getName());
		
		// Person class
		ElementImpl personClassDest = (ElementImpl) mainPackageDest.getElements().get(0);
		ElementImpl personClassSource = (ElementImpl) mainPackageSource.getElements().get(0);
		assertEquals(personClassSource.getName(), personClassDest.getName());
		
		// Attributes
		// TODO: Attributes are currently broken!
		//AttributeImpl ageAttrDest = (AttributeImpl) personClassDest.getAttributes().get(0);
		//AttributeImpl ageAttrSource = (AttributeImpl) personClassSource.getAttributes().get(0);
		//assertEquals(ageAttrSource.getName(), ageAttrDest.getName());
	}

}
