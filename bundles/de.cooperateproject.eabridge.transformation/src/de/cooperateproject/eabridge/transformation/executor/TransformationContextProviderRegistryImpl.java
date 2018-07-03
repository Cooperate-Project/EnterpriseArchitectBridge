package de.cooperateproject.eabridge.transformation.executor;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.eabridge.services.TransformationContextProviderRegistry;

@Component
public class TransformationContextProviderRegistryImpl implements TransformationContextProviderRegistry {

    @Reference(
            cardinality=ReferenceCardinality.AT_LEAST_ONE,
            policyOption=ReferencePolicyOption.GREEDY,
            policy=ReferencePolicy.DYNAMIC
            )
	private final Collection<TransformationContextProvider> providers = new CopyOnWriteArrayList<>();    
    
	@Override
	public Optional<TransformationContextProvider> getCompatibleProvider(final Transformation transformation) {
		return providers.stream().filter(t -> t.isCompatibleWith(transformation))
			.sorted(Comparator.comparingInt((TransformationContextProvider p) -> p.getPriority(transformation)))
			.findFirst();
	}

}
