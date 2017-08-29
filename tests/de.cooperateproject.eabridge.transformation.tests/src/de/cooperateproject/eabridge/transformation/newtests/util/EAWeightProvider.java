package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

public class EAWeightProvider implements IWeightProvider {

	public static final String EA_PATTERN = EaobjectmodelPackage.eNS_URI;

	private static final IFeatureFilter EA_FEATURE_FILTER = new EAFeatureFilter();
	
	@Override
	public Optional<Integer> getWeight(EStructuralFeature feature) {
		if (EA_FEATURE_FILTER.isIgnoredFeature(feature)) {
			return Optional.of(0);
		}
		return IWeightProvider.super.getWeight(feature);
	}

	@Override
	public Optional<Integer> getContainingFeatureWeight(EObject a) {
		// TODO Auto-generated method stub
		return IWeightProvider.super.getContainingFeatureWeight(a);
	}

}
