package de.cooperateproject.eabridge.services;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public interface ModelSetConfigurationBuilder<ModelSetConfigurationType extends ModelSetConfiguration> {

    default ModelSetConfigurationBuilder<ModelSetConfigurationType> appendRootElement(Resource modelRoot) {
        return this.appendRootElement(modelRoot, Optional.empty());
    }

    ModelSetConfigurationBuilder<ModelSetConfigurationType> appendRootElement(Resource modelRoot,
            Optional<String> identifier);

    ModelSetConfigurationType build();

}
