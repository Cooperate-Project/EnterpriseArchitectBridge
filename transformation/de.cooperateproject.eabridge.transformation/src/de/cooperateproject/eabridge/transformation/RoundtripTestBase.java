package de.cooperateproject.eabridge.transformation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl;
import de.cooperateproject.eabridge.transformation.util.EAObjectModelComparer;

public abstract class RoundtripTestBase extends TransformationTestBase {

	private static String testModelName = "";
	private static String transformationPathEAtoUML = "EAtoUML.qvto";
	private static String transformationPathUMLtoEA = "UMLtoEA.qvto";

	protected static void setTestModelName(String name) {
		testModelName = name;
	}

	protected static void setTransformationPathEAtoUML(String transformationPathEAtoUML) {
		RoundtripTestBase.transformationPathEAtoUML = transformationPathEAtoUML;
	}

	protected static void setTransformationPathUMLtoEA(String transformationPathUMLtoEA) {
		RoundtripTestBase.transformationPathUMLtoEA = transformationPathUMLtoEA;
	}

	protected void runTransformation() throws Exception {
		runEAtoUMLTransformation(transformationPathEAtoUML, makeXMIPath(testModelName),
				makeUMLTransformedPath(testModelName));
		runUMLtoEATransformation(transformationPathUMLtoEA, makeUMLTransformedPath(testModelName),
				makeXMITransformedPath(testModelName));
	}

	protected void compareResults() throws Exception {
		ModelExtent xmiDest = new BasicModelExtent(getResourceSet()
				.getResource(createResourceModelURI(makeXMITransformedPath(testModelName)), true).getContents());
		List<EObject> modelsDest = xmiDest.getContents();

		ModelExtent xmiSource = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeXMIPath(testModelName)), true).getContents());
		List<EObject> modelsSource = xmiSource.getContents();

		// Main Package
		PackageImpl mainPackageDest = (PackageImpl) ((PackageImpl) modelsDest.get(0)).getPackages().get(0);
		PackageImpl mainPackageSource = (PackageImpl) ((PackageImpl) modelsSource.get(0)).getPackages().get(0);

		// Using Comparer
		EAObjectModelComparer comp = new EAObjectModelComparer();
		comp.comparePackage(mainPackageSource, mainPackageDest);
	}
}
