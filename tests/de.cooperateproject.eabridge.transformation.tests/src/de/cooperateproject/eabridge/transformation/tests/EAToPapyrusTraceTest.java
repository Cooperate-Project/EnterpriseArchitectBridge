package de.cooperateproject.eabridge.transformation.tests;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.eabridge.transformation.Activator;

public class EAToPapyrusTraceTest extends EATraceTransformationTestBase {

    protected EAToPapyrusTraceTest(URI sourceToTargetTransformationUri, URI targetToSourceTransformationUri,
            URI sourceToTargetTraceTransformationUri, List<String> sourceFileExtensions,
            List<String> targetFileExtensions, String resourcePluginId) {
            super(createTransformationURI(Activator.PLUGIN_ID, "EAtoUML.qvto"),
                    createTransformationURI(Activator.PLUGIN_ID, "UMLtoEA.qvto"),
                    createTransformationURI(Activator.PLUGIN_ID, "EAtoUML_Trace.qvto"),
                    Arrays.asList("eaom"), Arrays.asList("uml", "notation"), 
                    TestEnvironmentConstants.TEST_PLUGIN_ID);
        }

}
