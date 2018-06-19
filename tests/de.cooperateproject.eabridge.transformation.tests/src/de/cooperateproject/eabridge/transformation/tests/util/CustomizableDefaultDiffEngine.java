package de.cooperateproject.eabridge.transformation.tests.util;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffProcessor;

public class CustomizableDefaultDiffEngine extends DefaultDiffEngine {

	private final FeatureFilter featureFilter;

	public CustomizableDefaultDiffEngine(FeatureFilter featureFilter) {
		this.featureFilter = featureFilter;
	}
	
	public CustomizableDefaultDiffEngine(IDiffProcessor processor, FeatureFilter featureFilter) {
	    super(processor);
        this.featureFilter = featureFilter;
    }
	
	@Override
	protected FeatureFilter createFeatureFilter() {
		return featureFilter;
	}

}
