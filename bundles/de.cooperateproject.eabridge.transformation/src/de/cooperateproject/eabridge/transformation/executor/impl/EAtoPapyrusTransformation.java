package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Iterator;

import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public class EAtoPapyrusTransformation extends QVTOTransformationBase {

	public EAtoPapyrusTransformation(QVTOResource transformationResource, TransformationExecutor exec, TransformationContextProvider contextProvider,
	        ModelSetConfiguration inputModels, ModelSetConfiguration targetModels) {
	    
		super(transformationResource, exec, contextProvider, inputModels, targetModels);
	}

	@Override
	protected ModelExtent[] createModelExtents() {
		ModelExtent[] result = new ModelExtent[4];
		result[0] = QVTOTransformationBase.createModelExtent(this.inputModels.iterator().next().getModel());
		result[1] = UMLPrimitivesLoader.loadUMLPrimitives(result[0].getContents().get(0));
		
		Iterator<QualifiedModel> targetIter = this.targetModels.iterator();
		result[2] = QVTOTransformationBase.createModelExtent(targetIter.next().getModel());
		result[3] = QVTOTransformationBase.createModelExtent(targetIter.next().getModel());
		
		this.validateTransformationParameters(result);
		
		return result;
	}
}
