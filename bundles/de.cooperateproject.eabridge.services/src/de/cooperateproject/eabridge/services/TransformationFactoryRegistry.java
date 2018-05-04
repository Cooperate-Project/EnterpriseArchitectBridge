package de.cooperateproject.eabridge.services;

import java.util.Collection;

import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;

public interface TransformationFactoryRegistry {
    
    Collection<TransformationFactory> getSuitableFactories(GeneralizedTransformationCharacteristic characteristic);
    
}
