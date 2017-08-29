package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.eclipse.emf.compare.match.eobject.AbstractWeightProvider;
import org.eclipse.emf.compare.match.eobject.EcoreWeightProvider;
import org.eclipse.emf.compare.match.eobject.WeightProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.NotationPackage;

public class PapyrusWeightProvider implements IWeightProvider {

	public static final String PAPYRUS_PATTERN = "http://www.eclipse.org/gmf/runtime/[0-9.]+/notation";
	private static final Collection<EClass> TYPES_WITH_IRRELEVANT_ATTRIBUTES = new HashSet<>(
			Arrays.asList(NotationPackage.Literals.LOCATION, NotationPackage.Literals.RELATIVE_BENDPOINTS,
					NotationPackage.Literals.IDENTITY_ANCHOR));
	private static final WeightProvider DEFAULT_IMPLEMENTATION = new EcoreWeightProvider();
	
	@Override
	public Optional<Integer> getWeight(EStructuralFeature feature) {
		if (TYPES_WITH_IRRELEVANT_ATTRIBUTES.contains(feature.getEContainingClass())) {
			return Optional.of(DEFAULT_IMPLEMENTATION.getWeight(feature) / 2);
		}
		return IWeightProvider.super.getWeight(feature);
	}

	@Override
	public Optional<Integer> getContainingFeatureWeight(EObject a) {
		if (TYPES_WITH_IRRELEVANT_ATTRIBUTES.contains(a.eClass())) {
			return Optional.of(AbstractWeightProvider.MAJOR);
		}
		return IWeightProvider.super.getContainingFeatureWeight(a);
	}

}
