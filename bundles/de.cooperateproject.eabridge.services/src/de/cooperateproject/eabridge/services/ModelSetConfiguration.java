package de.cooperateproject.eabridge.services;

import java.util.Optional;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;

public interface ModelSetConfiguration extends Iterable<QualifiedModel>, IAbstractObservable<ModelSetConfigurationObserver>{
    public static class QualifiedModel {
        protected ModelSetSpecification.QualifiedModelNamespace modelNamespace;
        protected Resource model;

        public ModelSetSpecification.QualifiedModelNamespace getModelNamespace() {
            return modelNamespace;
        }

        public Resource getModel() {
            return model;
        }
    }

    public ModelSetSpecification getSpecification();

    default public Resource getModel(EPackage forPackage) {
        return this.getModel(forPackage.getNsURI());
    }

    default public Resource getModel(EPackage forPackage, String identifier) {
        return this.getModel(forPackage.getNsURI(), Optional.of(identifier));
    }

    default public Resource getModel(String forNamespace) {
        return this.getModel(forNamespace, Optional.empty());
    }

    public Resource getModel(String forNamespace, Optional<String> indentifier);
    
    boolean isDirty();
    

    public static QualifiedModel createQualifiedModel(ModelSetSpecification.QualifiedModelNamespace namespace,
    		Resource value) {
        QualifiedModel qm = new QualifiedModel();
        qm.model = value;
        qm.modelNamespace = namespace;
        return qm;
    }
}
