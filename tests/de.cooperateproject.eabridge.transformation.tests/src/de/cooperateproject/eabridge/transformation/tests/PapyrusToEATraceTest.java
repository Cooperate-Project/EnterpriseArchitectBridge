package de.cooperateproject.eabridge.transformation.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.transformation.Activator;

public class PapyrusToEATraceTest extends EATraceTransformationTestBase {

	private int counter;

	public PapyrusToEATraceTest() {
		super(createTransformationURI(Activator.PLUGIN_ID, "UMLtoEA.qvto"),
				createTransformationURI(Activator.PLUGIN_ID, "EAtoUML.qvto"),
				createTransformationURI(Activator.PLUGIN_ID, "UMLtoEA_Trace.qvto"), Arrays.asList("uml", "notation"),
				Arrays.asList("eaom"), TestEnvironmentConstants.TEST_PLUGIN_ID);
		counter = 0;
	}

	@Test
	public void testNested() throws Exception {
		testTraceTransformation("Nested/model");
	}

	@Test
	public void testAdvancedAssociation() throws Exception {
		testTraceTransformation("AdvancedAssociation/model");
	}

	@Override
	public List<ModelExtent> addAuxiliaryModels(URI transformationURI, List<ModelExtent> parameters) {
		ArrayList<ModelExtent> result = new ArrayList<>(parameters);
		switch (counter) {
		case 0:
			result.add(1, new BasicModelExtent(getResourceSet()
					.getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));
			counter = 1;
			return result;
		case 1:
			result.add(2, new BasicModelExtent(getResourceSet()
					.getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));

			ModelExtent resultExtent = result.get(3);
			if (resultExtent.getContents().isEmpty()) {
				URI expectedUri = parameters.get(0).getContents().get(0).eResource().getURI().trimFileExtension()
						.trimFileExtension().appendFileExtension("eaom");
				getResourceSet().getResource(expectedUri, true);

				Package rootPackage = (Package) EcoreUtil
						.copy(getResourceSet().getResource(expectedUri, true).getContents().get(0));

				getResourceSet().getResource(expectedUri, false).getContents().add(rootPackage);
				rootPackage.getDiagrams().clear();
				rootPackage.getPackages().clear();

				resultExtent.setContents(Collections.singletonList(rootPackage));
			}
			counter = 2;
			return result;
		default:
			return parameters;
		}
	}
}
