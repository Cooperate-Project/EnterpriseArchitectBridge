package de.cooperateproject.eabridge.transformation.tests;

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
import de.cooperateproject.modeling.transformation.tests.commons.AuxiliaryModelsAddingTransformationRunning;

public class EAToPapyrusTraceTest extends EATraceTransformationTestBase
        implements AuxiliaryModelsAddingTransformationRunning {

    private static final URI EA2UML = createTransformationURI(Activator.PLUGIN_ID, "EAtoUML.qvto");
    private static final URI UML2EA = createTransformationURI(Activator.PLUGIN_ID, "UMLtoEA.qvto");
    private static final URI EA2UML_TRACE = createTransformationURI(Activator.PLUGIN_ID, "EAtoUML_Trace.qvto");


    public EAToPapyrusTraceTest() {
        super(EA2UML, UML2EA, EA2UML_TRACE, Arrays.asList("eaom"), Arrays.asList("uml", "notation"),
                TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testPrimitive() throws Exception {
        testTraceTransformation("Primitive/model");
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
        if (transformationURI.lastSegment().equals(UML2EA.lastSegment())) {
            result.add(2, new BasicModelExtent(getResourceSet()
                    .getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));

            ModelExtent resultExtent = result.get(3);
            if (resultExtent.getContents().isEmpty()) {
                URI expectedUri = parameters.get(0).getContents().get(0).eResource().getURI().trimFileExtension()
                        .appendFileExtension("eaom");
                getResourceSet().getResource(expectedUri, true);

                Package rootPackage = (Package) EcoreUtil
                        .copy(getResourceSet().getResource(expectedUri, true).getContents().get(0));
                getResourceSet()
                        .getResource(expectedUri.trimFileExtension().appendFileExtension("output")
                                .appendFileExtension(expectedUri.fileExtension()), false)
                        .getContents().add(rootPackage);
                rootPackage.getDiagrams().clear();
                rootPackage.getPackages().clear();

                resultExtent.setContents(Collections.singletonList(rootPackage));
            }
            return result;
        } else if (transformationURI.lastSegment().equals(EA2UML.lastSegment())) {
            result.add(1, new BasicModelExtent(getResourceSet()
                    .getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));
            return result;
        } else {
            return parameters;
        }
    }
}
