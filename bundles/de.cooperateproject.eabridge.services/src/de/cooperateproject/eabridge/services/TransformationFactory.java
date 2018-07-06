package de.cooperateproject.eabridge.services;

import java.util.Collection;

import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;

public interface TransformationFactory {
    
    Collection<GeneralizedTransformationCharacteristic> getSupportedTransformationCharacteristics();

    Transformation create(ModelAdapter inputAdapter, ModelAdapter targetAdapter);

}
