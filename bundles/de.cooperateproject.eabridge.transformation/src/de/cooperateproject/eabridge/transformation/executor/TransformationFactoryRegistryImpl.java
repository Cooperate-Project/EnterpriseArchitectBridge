package de.cooperateproject.eabridge.transformation.executor;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import de.cooperateproject.eabridge.services.TransformationFactory;
import de.cooperateproject.eabridge.services.TransformationFactoryRegistry;
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;

@Component
public class TransformationFactoryRegistryImpl implements TransformationFactoryRegistry {

    @Reference(
            cardinality=ReferenceCardinality.AT_LEAST_ONE,
            policyOption=ReferencePolicyOption.GREEDY,
            policy=ReferencePolicy.DYNAMIC
            )
	private final Collection<TransformationFactory> factories = new CopyOnWriteArrayList<>();    
    
    @Override
    public Collection<TransformationFactory> getSuitableFactories(
            GeneralizedTransformationCharacteristic characteristic) {
        return Collections.unmodifiableList(factories.stream()
                    .filter(fact -> fact.getSupportedTransformationCharacteristics().contains(characteristic))
                .collect(Collectors.toList()));
    }
	
}
