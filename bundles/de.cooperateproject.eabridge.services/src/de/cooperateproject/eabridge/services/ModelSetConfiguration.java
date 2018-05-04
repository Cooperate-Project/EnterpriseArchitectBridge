package de.cooperateproject.eabridge.services;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;

public interface ModelSetConfiguration extends Iterable<QualifiedModel> {
    public static class QualifiedModel {
        protected ModelSetSpecification.QualifiedModelNamespace modelNamespace;
        protected EObject model;

        public ModelSetSpecification.QualifiedModelNamespace getModelNamespace() {
            return modelNamespace;
        }

        public EObject getModel() {
            return model;
        }
    }

    public ModelSetSpecification getSpecification();

    default public EObject getModel(EPackage forPackage) {
        return this.getModel(forPackage.getNsURI());
    }

    default public EObject getModel(EPackage forPackage, String identifier) {
        return this.getModel(forPackage.getNsURI(), Optional.of(identifier));
    }

    default public EObject getModel(String forNamespace) {
        return this.getModel(forNamespace, Optional.empty());
    }

    public EObject getModel(String forNamespace, Optional<String> indentifier);

    public static QualifiedModel createQualifiedModel(ModelSetSpecification.QualifiedModelNamespace namespace,
            EObject value) {
        QualifiedModel qm = new QualifiedModel();
        qm.model = value;
        qm.modelNamespace = namespace;
        return qm;
    }
}
