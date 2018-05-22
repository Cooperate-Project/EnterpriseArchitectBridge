package de.cooperateproject.eabridge.transformation.tests;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.transformation.tests.commons.DirectedTraceTransformationTestBase;

public class EATraceTransformationTestBase extends DirectedTraceTransformationTestBase {

    protected EATraceTransformationTestBase(final URI sourceToTargetTransformationUri, final URI targetToSourceTransformationUri,
            final URI sourceToTargetTraceTransformationUri, List<String> sourceFileExtensions,
            List<String> targetFileExtensions, String resourcePluginId) {
        super(sourceFileExtensions, targetFileExtensions, Collections.emptyList(), sourceToTargetTransformationUri, 
                targetToSourceTransformationUri, sourceToTargetTraceTransformationUri, resourcePluginId); 
    }
    
}
