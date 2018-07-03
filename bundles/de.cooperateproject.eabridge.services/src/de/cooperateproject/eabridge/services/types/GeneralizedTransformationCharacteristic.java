package de.cooperateproject.eabridge.services.types;

import org.eclipse.m2m.internal.qvt.oml.trace.TracePackage;

/**
 * Identifies a transformation by its source and target diagram type as well as the type of the transformation
 * without the assumptions of the XText <-> Papyrus conversion of the Cooperate Modeling Environment.
 * 
 * @see TransformationCharacteristic
 * 
 */
public class GeneralizedTransformationCharacteristic {
    private ModelSetSpecification from;
    private ModelSetSpecification to;
    private GeneralizedTransformationType type;

    public GeneralizedTransformationCharacteristic(ModelSetSpecification from, ModelSetSpecification to) {
        this(from, to, (isTraceModelSetSpecification(from) && isTraceModelSetSpecification(to)) ? 
                GeneralizedTransformationType.TRACE : GeneralizedTransformationType.REGULAR);
    }
    
    public GeneralizedTransformationCharacteristic(ModelSetSpecification from, ModelSetSpecification to, GeneralizedTransformationType type) {
        this.from = from;
        this.to = to;
        this.type = type;
    }
    
    ModelSetSpecification getFrom() {
        return from;
    }
    
    ModelSetSpecification getTo() {
        return to;
    }
    
    GeneralizedTransformationType getType() {
        return type;
    }
    
    public static boolean isTraceModelSetSpecification(ModelSetSpecification specification) {
        return specification.modelNamespaces.stream().anyMatch(qmn -> qmn.getNamespace().equals(TracePackage.eINSTANCE.getNsURI()));
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		GeneralizedTransformationCharacteristic other = (GeneralizedTransformationCharacteristic) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
