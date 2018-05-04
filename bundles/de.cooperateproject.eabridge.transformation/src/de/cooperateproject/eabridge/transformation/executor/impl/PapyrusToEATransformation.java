package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Iterator;

import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public class PapyrusToEATransformation extends QVTOTransformationBase {
    public PapyrusToEATransformation(QVTOResource transformationResource, TransformationExecutor exec, TransformationContextProvider contextProvider, 
            ModelSetConfiguration inputModels, ModelSetConfiguration targetModels) {

        super(transformationResource, exec, contextProvider, inputModels, targetModels);
    }

    @Override
    protected ModelExtent[] createModelExtents() {
        ModelExtent[] result = new ModelExtent[4];

        Iterator<QualifiedModel> sourceIter = this.inputModels.iterator();
        result[0] = QVTOTransformationBase.createModelExtent(sourceIter.next().getModel());
        result[1] = QVTOTransformationBase.createModelExtent(sourceIter.next().getModel());

        Iterator<QualifiedModel> targetIter = this.targetModels.iterator();
        result[3] = QVTOTransformationBase.createModelExtent(targetIter.next().getModel());
        result[2] = UMLPrimitivesLoader.loadUMLPrimitives(result[3].getContents().get(0));
        

        this.validateTransformationParameters(result);

        return result;
    }

}
