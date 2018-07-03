package de.cooperateproject.eabridge.services;

import org.eclipse.core.runtime.IStatus;

import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;

public interface Transformation {
    
    IStatus transform();
    
    GeneralizedTransformationCharacteristic getTransformationCharacteristic();
    
    ModelSetConfiguration getInputModels();
    
    ModelSetConfiguration getTargetModels();

	String getName();
}
