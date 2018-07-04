package de.cooperateproject.eabridge.services.common;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;

import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.ModelSetConfigurationBuilder;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification.QualifiedModelNamespace;

public class ListBasedModelSetConfigurationBuilder implements ModelSetConfigurationBuilder<AbstractObservableModelSetConfiguration> {
    protected List<QualifiedModel> values = new LinkedList<>();

    @Override
    public ModelSetConfigurationBuilder<AbstractObservableModelSetConfiguration> appendRootElement(Resource modelRoot,
            Optional<String> identifier) {
        values.add(ModelSetConfiguration.createQualifiedModel(
                identifier.map(id -> ModelSetSpecification.createQMN(modelRoot.getContents().get(0).eClass().getEPackage().getNsURI(), id))
                    .orElseGet(() -> ModelSetSpecification.createQMN(modelRoot.getContents().get(0).eClass().getEPackage().getNsURI())), 
                modelRoot));
        return this;
    }

    @Override
    public AbstractObservableModelSetConfiguration build() {
        final ModelSetSpecification spec = new ModelSetSpecification(
                values.stream().map(qm -> qm.getModelNamespace())
                .collect(Collectors.toList()).toArray(new QualifiedModelNamespace[values.size()]));
        return new AbstractObservableModelSetConfiguration(values, spec);
    }

}
