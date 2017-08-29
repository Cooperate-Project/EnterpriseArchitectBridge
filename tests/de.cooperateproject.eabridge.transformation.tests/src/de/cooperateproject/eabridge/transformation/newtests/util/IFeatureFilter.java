package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Optional;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IFeatureFilter {

	default boolean isIgnoredFeature(EStructuralFeature feature) {
		return Optional.of(feature).filter(EAttribute.class::isInstance).map(EAttribute.class::cast)
				.map(this::isIgnoredAttribute).orElseGet(() ->

		Optional.of(feature).filter(EReference.class::isInstance).map(EReference.class::cast)
				.map(r -> isIgnoredReference(null, r)).orElse(false)

		);
	}
	
	public boolean isIgnoredReference(Match match, EReference reference);

	public boolean isIgnoredAttribute(EAttribute attribute);

	public Optional<Boolean> checkForOrderingChanges(EStructuralFeature feature);
	
}
