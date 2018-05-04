package de.cooperateproject.eabridge.services.types;

import java.util.Optional;

public interface GeneralizedConcreteSyntaxTypeRegistry {
    Optional<GeneralizedConcreteSyntaxType> getConcreteSyntaxTypeByName(String name);
}
