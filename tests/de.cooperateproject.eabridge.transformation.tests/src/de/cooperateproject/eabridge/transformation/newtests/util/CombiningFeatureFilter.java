package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CombiningFeatureFilter extends FeatureFilter {

	private final Collection<IFeatureFilter> filters = new HashSet<>();

	public void addFilter(IFeatureFilter filter) {
		filters.add(filter);
	}

	@Override
	protected boolean isIgnoredReference(Match match, EReference reference) {
		return filters.stream().anyMatch(f -> f.isIgnoredReference(match, reference));
	}

	@Override
	protected boolean isIgnoredAttribute(EAttribute attribute) {
		return filters.stream().anyMatch(f -> f.isIgnoredAttribute(attribute));
	}

	@Override
	public boolean checkForOrderingChanges(EStructuralFeature feature) {
		return filters.stream().map(f -> f.checkForOrderingChanges(feature)).filter(Optional::isPresent)
				.map(Optional::get).anyMatch(b -> b);
	}

}
