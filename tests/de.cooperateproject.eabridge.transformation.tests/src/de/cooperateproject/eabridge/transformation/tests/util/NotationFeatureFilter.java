package de.cooperateproject.eabridge.transformation.tests.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.NotationPackage;

public class NotationFeatureFilter implements IFeatureFilter {

	private static final Set<EStructuralFeature> IGNORED_FEATURES = new HashSet<>(Arrays.asList(
			NotationPackage.Literals.RELATIVE_BENDPOINTS__POINTS/*, NotationPackage.Literals.IDENTITY_ANCHOR__ID*/));

	@Override
	public boolean isIgnoredReference(Match match, EReference reference) {
		return IGNORED_FEATURES.contains(reference);
	}

	@Override
	public boolean isIgnoredAttribute(EAttribute attribute) {
		return IGNORED_FEATURES.contains(attribute);
	}

	@Override
	public Optional<Boolean> checkForOrderingChanges(EStructuralFeature feature) {
		return Optional.empty();
	}

}
