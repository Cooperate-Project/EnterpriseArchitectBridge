package de.cooperateproject.eabridge.services;

import org.eclipse.m2m.qvt.oml.ExecutionContext;

public interface TransformationContextProvider {
	
	static final int NORMAL_PRIORITY = 50;
	static final int INCREASED_PRIORITY = 20;

	boolean isCompatibleWith(Transformation trans);
	
	int getPriority(Transformation trans);
    
    ExecutionContext getTransformationContext(Transformation trans);

	void postProcessTransformationContext(ExecutionContext context, Transformation trans);

}
