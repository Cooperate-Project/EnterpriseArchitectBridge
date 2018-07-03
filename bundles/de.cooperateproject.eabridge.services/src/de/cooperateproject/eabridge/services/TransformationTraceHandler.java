package de.cooperateproject.eabridge.services;

import java.util.Optional;

import org.eclipse.m2m.qvt.oml.util.Trace;

public interface TransformationTraceHandler {
	
	boolean isHandlerFor(Transformation trans);
    
	Optional<Trace> getTrace(Transformation trans);

	void storeTrace(Transformation trans, Trace value);

}
