package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Pattern;

import org.eclipse.emf.compare.match.eobject.EcoreWeightProvider;
import org.eclipse.emf.compare.match.eobject.WeightProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.NotationPackage;

public class PapyrusWeightProvider extends EcoreWeightProvider {

	private static class DescriptorBase implements WeightProvider.Descriptor {

		private final Pattern pattern;

		private DescriptorBase(String pattern) {
			this.pattern = Pattern.compile(pattern);
		}

		@Override
		public WeightProvider getWeightProvider() {
			return new PapyrusWeightProvider();
		}

		@Override
		public int getRanking() {
			return 120;
		}

		@Override
		public Pattern getNsURI() {
			return pattern;
		}

	}

	private static final Collection<EClass> TYPES_WITH_IRRELEVANT_ATTRIBUTES = new HashSet<>(
			Arrays.asList(NotationPackage.Literals.LOCATION, NotationPackage.Literals.RELATIVE_BENDPOINTS,
					NotationPackage.Literals.IDENTITY_ANCHOR));

	public static WeightProvider.Descriptor getDescriptorDatatypes() {
		return new DescriptorBase("http://www.eclipse.org/emf/2002/Ecore");
	}

	public static WeightProvider.Descriptor getDescriptorPapyrus() {
		return new DescriptorBase("http://www.eclipse.org/gmf/runtime/[0-9.]+/notation");
	}

	@Override
	public int getWeight(EStructuralFeature feature) {
		if (TYPES_WITH_IRRELEVANT_ATTRIBUTES.contains(feature.getEContainingClass())) {
			return super.getWeight(feature) / 2;
		}
		return super.getWeight(feature);
	}

	@Override
	public int getContainingFeatureWeight(EObject a) {
		if (TYPES_WITH_IRRELEVANT_ATTRIBUTES.contains(a.eClass())) {
			return MAJOR;
		}
		return super.getContainingFeatureWeight(a);
	}

}
