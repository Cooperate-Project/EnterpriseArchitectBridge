package de.cooperateproject.eabridge.transformation.ea2uml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

@SuppressWarnings("restriction")
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
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName));
	}

	private PackageImpl getVehiclePackage() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName));
		ModelExtent uml = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeUMLTransformedPath(testName)), true).getContents());
		List<EObject> content = uml.getContents();

		// Base Model
		Assert.assertEquals(1, content.size());

		ModelImpl model = (ModelImpl) content.get(0);
		PackageImpl vehicles = (PackageImpl) model.getPackagedElements().get(0);

		return vehicles;
	}

	@Test
	public void testAbstract() throws Exception {
		PackageImpl vehicles = getVehiclePackage();

		// Abstract class
		ClassImpl vehicle = (ClassImpl) vehicles.getPackagedElement("Vehicle");
		Assert.assertTrue(vehicle.isAbstract());

	}

	@Test
	public void testGeneralization() throws Exception {
		PackageImpl vehicles = getVehiclePackage();

		// Class Count
		Assert.assertEquals(5, vehicles.getPackagedElements().size());

		ClassImpl bicycle = (ClassImpl) vehicles.getPackagedElement("Bicycle");
		List<Generalization> bicycleGeneralzations = bicycle.getGeneralizations();

		// First generalization
		Assert.assertEquals(1, bicycleGeneralzations.size());
		Assert.assertSame(vehicles.getPackagedElement("Vehicle"), bicycleGeneralzations.get(0).getGeneral());

		ClassImpl cab = (ClassImpl) vehicles.getPackagedElement("Cab");
		List<Generalization> cabGeneralizations = cab.getGeneralizations();

		// Second generalization
		Assert.assertEquals(1, cabGeneralizations.size());
		Assert.assertSame(vehicles.getPackagedElement("Car"), cabGeneralizations.get(0).getGeneral());
	}

	@Test
	public void testInheritance() throws Exception {
		PackageImpl vehicles = getVehiclePackage();

		ClassImpl bicycle = (ClassImpl) vehicles.getPackagedElement("Bicycle");
		ClassImpl vehicle = (ClassImpl) vehicles.getPackagedElement("Vehicle");
		List<NamedElement> inheritedMembers = bicycle.getInheritedMembers();

		// Inheritance
		Assert.assertEquals(1, inheritedMembers.size());
		Assert.assertSame(vehicle.getOwnedOperations().get(0), inheritedMembers.get(0));
	}

}
