package de.cooperateproject.eabridge.services.common;

import java.util.Collections;
import java.util.Iterator;
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

public class ListBasedModelSetConfigurationBuilder implements ModelSetConfigurationBuilder<ModelSetConfiguration> {
    protected List<QualifiedModel> values = new LinkedList<>();

    @Override
    public ModelSetConfigurationBuilder<ModelSetConfiguration> appendRootElement(Resource modelRoot,
            Optional<String> identifier) {
        values.add(ModelSetConfiguration.createQualifiedModel(
                identifier.map(id -> ModelSetSpecification.createQMN(modelRoot.getContents().get(0).eClass().getEPackage().getNsURI(), id))
                    .orElseGet(() -> ModelSetSpecification.createQMN(modelRoot.getContents().get(0).eClass().getEPackage().getNsURI())), 
                modelRoot));
        return this;
    }

    @Override
    public ModelSetConfiguration build() {
        final ModelSetSpecification spec = new ModelSetSpecification(
                values.stream().map(qm -> qm.getModelNamespace())
                .collect(Collectors.toList()).toArray(new QualifiedModelNamespace[values.size()]));
        return new ModelSetConfiguration() {
            @Override
            public Resource getModel(String forNamespace, Optional<String> identifier) {
                return values.stream().filter(qm -> qm.getModelNamespace().getNamespace().equals(forNamespace))
                        .filter(qm -> qm.getModelNamespace().getQualifier().equals(identifier)).findFirst().get().getModel();
            }

            @Override
            public Iterator<QualifiedModel> iterator() {
                return Collections.unmodifiableList(values).iterator();
            }

            @Override
            public ModelSetSpecification getSpecification() {
                return spec;
            }
            
        };
    }

}
