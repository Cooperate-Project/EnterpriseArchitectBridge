package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Collection;
import java.util.Optional;
import java.util.regex.Pattern;

import org.eclipse.emf.compare.match.eobject.EcoreWeightProvider;
import org.eclipse.emf.compare.match.eobject.WeightProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CombiningWeightProvider extends EcoreWeightProvider {

	private static class DescriptorBase implements WeightProvider.Descriptor {

		private final Collection<IWeightProvider> weightProviders;
		private final Pattern pattern;

		private DescriptorBase(String pattern, Collection<IWeightProvider> weightProviders) {
			this.pattern = Pattern.compile(pattern);
			this.weightProviders = weightProviders;
		}

		@Override
		public WeightProvider getWeightProvider() {
			return new CombiningWeightProvider(weightProviders);
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

	private final Collection<IWeightProvider> weightProviders;
	
	public CombiningWeightProvider(Collection<IWeightProvider> weightProviders) {
		this.weightProviders = weightProviders;
	}
	
	public static WeightProvider.Descriptor getDescriptorDatatypes(Collection<IWeightProvider> weightProviders) {
		return getDescriptor("http://www.eclipse.org/emf/2002/Ecore", weightProviders);
	}

	public static WeightProvider.Descriptor getDescriptor(String regexPattern, Collection<IWeightProvider> weightProviders) {
		return new DescriptorBase(regexPattern, weightProviders);
	}
	
	@Override
	public int getWeight(EStructuralFeature feature) {
		Optional<Integer> customWeight = weightProviders.stream().map(wp -> wp.getWeight(feature)).filter(Optional::isPresent).map(Optional::get).findFirst();
		return customWeight.orElse(super.getWeight(feature));
	}

	@Override
	public int getContainingFeatureWeight(EObject a) {
		Optional<Integer> customWeight = weightProviders.stream().map(wp -> wp.getContainingFeatureWeight(a)).filter(Optional::isPresent).map(Optional::get).findFirst();
		return customWeight.orElse(super.getContainingFeatureWeight(a));
	}
	
}
