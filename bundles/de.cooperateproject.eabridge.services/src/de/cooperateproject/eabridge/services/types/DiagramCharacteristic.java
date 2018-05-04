package de.cooperateproject.eabridge.services.types;

/**
 * This type characterized on kind of diagram manifestation by
 *    1. its diagram type (e.g. class diagram)
 *    2. its concrete syntax type (e.g. papyrus diagram)
 *    3. its model set specification (e.g. notation meta model and uml meta model)
 *    
 * @author Sebastian Krach
 *
 */
public class DiagramCharacteristic {
    
    private GeneralizedDiagramType diagramType;
    private GeneralizedConcreteSyntaxType concreteSyntaxType;
    private ModelSetSpecification modelSetSpecification;

    public DiagramCharacteristic(GeneralizedDiagramType diagramType, GeneralizedConcreteSyntaxType concreteSyntaxType, ModelSetSpecification modelSetSpecification) {
        this.diagramType = diagramType;
        this.concreteSyntaxType = concreteSyntaxType;
        this.modelSetSpecification = modelSetSpecification;
    }

    public GeneralizedDiagramType getDiagramType() {
        return diagramType;
    }

    public GeneralizedConcreteSyntaxType getConcreteSyntaxType() {
        return concreteSyntaxType;
    }

    public ModelSetSpecification getModelSetSpecification() {
        return modelSetSpecification;
    }
}
