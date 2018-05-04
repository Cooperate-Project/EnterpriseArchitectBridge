package de.cooperateproject.eabridge.services;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

public interface ModelSetConfigurationBuilder<ModelSetConfigurationType extends ModelSetConfiguration> {

    default ModelSetConfigurationBuilder<ModelSetConfigurationType> appendRootElement(EObject modelRoot) {
        return this.appendRootElement(modelRoot, Optional.empty());
    }

    ModelSetConfigurationBuilder<ModelSetConfigurationType> appendRootElement(EObject modelRoot,
            Optional<String> identifier);

    ModelSetConfigurationType build();

}
