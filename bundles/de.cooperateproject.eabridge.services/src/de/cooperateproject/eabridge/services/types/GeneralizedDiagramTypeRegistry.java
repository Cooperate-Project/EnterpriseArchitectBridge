package de.cooperateproject.eabridge.services.types;

import java.util.Optional;

public interface GeneralizedDiagramTypeRegistry {
    Optional<GeneralizedDiagramType> getDiagramTypeByName(String name);
}
