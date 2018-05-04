package de.cooperateproject.eabridge.transformation.tests.util;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IWeightProvider {
	
	default Optional<Integer> getWeight(EStructuralFeature feature) {
		return Optional.empty();
	}
	
	default Optional<Integer> getContainingFeatureWeight(EObject a) {
		return Optional.empty();
	}
}
