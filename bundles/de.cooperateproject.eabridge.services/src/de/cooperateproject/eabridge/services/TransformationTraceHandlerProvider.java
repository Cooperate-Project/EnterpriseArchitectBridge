package de.cooperateproject.eabridge.services;

import java.util.Optional;

public interface TransformationTraceHandlerProvider {
    
    Optional<TransformationTraceHandler> getTransformationTraceHandler(Transformation transformation);

}
