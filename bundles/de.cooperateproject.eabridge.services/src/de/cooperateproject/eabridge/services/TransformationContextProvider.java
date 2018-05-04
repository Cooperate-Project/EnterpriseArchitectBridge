package de.cooperateproject.eabridge.services;

import org.eclipse.m2m.qvt.oml.ExecutionContext;

public interface TransformationContextProvider{
    
    ExecutionContext getTransformationContext(Transformation trans);

}
