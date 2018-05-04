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

}
