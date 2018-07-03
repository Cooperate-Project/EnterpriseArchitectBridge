package de.cooperateproject.eabridge.services;

import java.util.Optional;

public interface TransformationTraceHandlerRegistry {
	
	Optional<TransformationTraceHandler> getSuitableTraceHandler(Transformation transformation);

}
