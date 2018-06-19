package de.cooperateproject.eabridge.transformation.tests;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.junit.Before;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.transformation.tests.util.EAModelComparisonFactory;
import de.cooperateproject.modeling.transformation.tests.commons.DirectedTraceTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparator;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactory;

public class EATraceTransformationTestBase extends DirectedTraceTransformationTestBase {

	protected EATraceTransformationTestBase(final URI sourceToTargetTransformationUri,
			final URI targetToSourceTransformationUri, final URI sourceToTargetTraceTransformationUri,
			List<String> sourceFileExtensions, List<String> targetFileExtensions, String resourcePluginId) {
		super(sourceFileExtensions, targetFileExtensions, Collections.emptyList(), sourceToTargetTransformationUri,
				targetToSourceTransformationUri, sourceToTargetTraceTransformationUri, resourcePluginId);
	}

	@BeforeClass
	public static void initTestSpecificMappings() throws Exception {
		EAPlainTransformationTestBase.initialize();
	}
	
	@Override
	protected ModelComparisonFactory getModelComparisonFactory() {
	    return new EAModelComparisonFactory();
	}

}
