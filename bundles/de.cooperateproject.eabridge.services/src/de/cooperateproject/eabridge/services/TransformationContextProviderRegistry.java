package de.cooperateproject.eabridge.services;

import java.util.Optional;

public interface TransformationContextProviderRegistry {
	Optional<TransformationContextProvider> getCompatibleProvider(Transformation transformation);
}
