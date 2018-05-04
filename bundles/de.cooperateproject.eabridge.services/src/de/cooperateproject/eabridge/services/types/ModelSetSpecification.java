package de.cooperateproject.eabridge.services.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ModelSetSpecification {
    public static class QualifiedModelNamespace {
        protected final String namespace;
        protected final Optional<String> qualifier;

        public QualifiedModelNamespace(String namespace, Optional<String> qualifier) {
            this.namespace = namespace;
            this.qualifier = qualifier;
        }

        public String getNamespace() {
            return namespace;
        }

        public Optional<String> getQualifier() {
            return qualifier;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
            result = prime * result + ((qualifier.isPresent()) ? 0 : qualifier.get().hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            QualifiedModelNamespace other = (QualifiedModelNamespace) obj;
            if (namespace == null) {
                if (other.namespace != null)
                    return false;
            } else if (!namespace.equals(other.namespace))
                return false;
            if (!qualifier.isPresent()) {
                if (other.qualifier.isPresent())
                    return false;
            } else if (!qualifier.get().equals(other.qualifier.get()))
                return false;
            return true;
        }

    }

    protected List<QualifiedModelNamespace> modelNamespaces;

    public ModelSetSpecification(List<QualifiedModelNamespace> modelNamespaces) {
        this.modelNamespaces = Collections.unmodifiableList(modelNamespaces);
    }
    
    public ModelSetSpecification(QualifiedModelNamespace... modelNamespaces) {
        this.modelNamespaces = Collections.unmodifiableList(Arrays.asList(modelNamespaces));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelNamespaces == null) ? 0 : modelNamespaces.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ModelSetSpecification other = (ModelSetSpecification) obj;
        if (modelNamespaces == null) {
            if (other.modelNamespaces != null)
                return false;
        } else if (!modelNamespaces.equals(other.modelNamespaces))
            return false;
        return true;
    }

    public static QualifiedModelNamespace createQMN(String namespace) {
        return new QualifiedModelNamespace(namespace, Optional.empty());
    }

    public static QualifiedModelNamespace createQMN(String namespace, String qualifier) {
        return new QualifiedModelNamespace(namespace, Optional.of(qualifier));
    }

}
