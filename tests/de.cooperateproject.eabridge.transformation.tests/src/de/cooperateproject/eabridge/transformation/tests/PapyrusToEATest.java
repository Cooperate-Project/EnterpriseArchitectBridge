package de.cooperateproject.eabridge.transformation.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Before;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.modeling.transformation.tests.commons.AuxiliaryModelsAddingTransformationRunning;

public class PapyrusToEATest extends EAPlainTransformationTestBase
        implements AuxiliaryModelsAddingTransformationRunning {

    public PapyrusToEATest() {
        super(createTransformationURI(Activator.PLUGIN_ID, "UMLtoEA.qvto"), Arrays.asList("uml", "notation"),
                Arrays.asList("eaom"), TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Override
    public List<ModelExtent> addAuxiliaryModels(URI transformationURI, List<ModelExtent> parameters) {
        ArrayList<ModelExtent> result = new ArrayList<>(parameters);
        result.add(2, new BasicModelExtent(getResourceSet()
                .getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));

        ModelExtent resultExtent = result.get(3);
        if (resultExtent.getContents().isEmpty()) {
            URI expectedUri = parameters.get(0).getContents().get(0).eResource().getURI().trimFileExtension()
                    .appendFileExtension("eaom");
            getExpectedResourceSet().getResource(expectedUri, true);

            Package rootPackage = (Package) EcoreUtil
                    .copy(getExpectedResourceSet().getResource(expectedUri, true).getContents().get(0));
            getResourceSet().getResource(expectedUri.trimFileExtension().appendFileExtension("output")
                    .appendFileExtension(expectedUri.fileExtension()), false).getContents().add(rootPackage);
            rootPackage.getDiagrams().clear();
            rootPackage.getPackages().clear();

            resultExtent.setContents(Collections.singletonList(rootPackage));
        }
        return result;
    }

    @Before
    public void before() {
        this.setDebugSerializationDir(new File("."));
    }

    @Test
    public void testPrimitive() throws IOException {
        testTransformationRegular("Primitive");
    }

    @Test
    public void testPrimitiveIncremental() throws IOException {
        testTransformationIncremental("Primitive");
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
        testTransformationRegular("Nested",
                diffs -> diffs.stream().filter(AttributeChange.class::isInstance)
                    .map(AttributeChange.class::cast)
                    .filter(change -> change.getAttribute() == EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__SEQUENCE)
                    .collect(Collectors.toList()));
    }

    @Test
    public void testNestedIncremental() throws IOException {
        testTransformationIncremental("Nested");
    }

}
