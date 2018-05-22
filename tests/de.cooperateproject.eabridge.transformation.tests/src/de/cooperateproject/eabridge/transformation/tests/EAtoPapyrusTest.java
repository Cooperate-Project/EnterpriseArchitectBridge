package de.cooperateproject.eabridge.transformation.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Test;

import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.modeling.transformation.tests.commons.AuxiliaryModelsAddingTransformationRunning;

public class EAtoPapyrusTest extends EAPlainTransformationTestBase implements AuxiliaryModelsAddingTransformationRunning {
	
	public EAtoPapyrusTest() {
		super(createTransformationURI(Activator.PLUGIN_ID, "EAtoUML.qvto"), Arrays.asList("eaom"), Arrays.asList("uml", "notation"), 
		        TestEnvironmentConstants.TEST_PLUGIN_ID);
	}

	@Test
	public void testAdvancedAssociation() throws IOException {
		testTransformationRegular("AdvancedAssociation");
	}
	
	@Test
	public void testAdvancedAssociationIncremental() throws IOException {
		testTransformationIncremental("AdvancedAssociation");
	}
	
	@Test
	public void testNested() throws IOException {
		testTransformationRegular("Nested");
	}
	
	@Test
	public void testNestedIncremental() throws IOException {
		testTransformationIncremental("Nested");
	}

	@Override
	public List<ModelExtent> addAuxiliaryModels(URI transformationURI, List<ModelExtent> parameters) {
	    ArrayList<ModelExtent> result = new ArrayList<>(parameters);
	    result.add(1, new BasicModelExtent(getResourceSet()
            .getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));
	    return result;
	}

}
