package de.cooperateproject.eabridge.services;

import java.util.Optional;

import org.eclipse.m2m.qvt.oml.util.Trace;

public interface TransformationTraceHandler {
    
    Optional<Trace> getTrace();
    
    void storeTrace(Trace trace);

}
