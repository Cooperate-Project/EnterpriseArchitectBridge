package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.NotationPackage;

public class NotationFeatureFilter extends FeatureFilter {

	private static final Set<EStructuralFeature> IGNORED_FEATURES = new HashSet<>(Arrays.asList(
			NotationPackage.Literals.RELATIVE_BENDPOINTS__POINTS/*, NotationPackage.Literals.IDENTITY_ANCHOR__ID*/));

	@Override
	protected boolean isIgnoredReference(Match match, EReference reference) {
		return super.isIgnoredReference(match, reference) || IGNORED_FEATURES.contains(reference);
	}

	@Override
	protected boolean isIgnoredAttribute(EAttribute attribute) {
		return super.isIgnoredAttribute(attribute) || IGNORED_FEATURES.contains(attribute);
	}

}
