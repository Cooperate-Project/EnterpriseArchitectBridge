package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.TransformationContextProviderRegistry;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public class EAtoPapyrusTransformation extends QVTOTransformationBase {

	public EAtoPapyrusTransformation(QVTOResource transformationResource, TransformationExecutor exec, TransformationContextProviderRegistry contextProvider,
			ModelAdapter inputModels, ModelAdapter targetModels) {
	    
		super(transformationResource, exec, contextProvider, inputModels, targetModels);
	}

	@Override
	protected ModelExtent[] createModelExtents() {
		ModelExtent[] result = new ModelExtent[4];
		result[0] = QVTOTransformationBase.createModelExtent(this.inputAdapter.getModelSet().iterator().next().getModel().getContents());
		result[1] = UMLPrimitivesLoader.loadUMLPrimitives(result[0].getContents().get(0));
		
		Iterator<QualifiedModel> targetIter = this.targetAdapter.getModelSet().iterator();
		result[2] = QVTOTransformationBase.createModelExtent(targetIter.next().getModel().getContents());
		result[3] = QVTOTransformationBase.createModelExtent(targetIter.next().getModel().getContents());
		
		this.validateTransformationParameters(result);
		
		return result;
	}

	@Override
	protected void storeResultsFromModelExtents(ModelExtent[] modelParametersToUse) {
		Iterator<QualifiedModel> targetIter = this.targetAdapter.getModelSet().iterator();
		
		for (int i = 2; targetIter.hasNext(); i++) {
			Resource model = targetIter.next().getModel();
			model.getContents().clear();
			model.getContents().addAll(modelParametersToUse[i].getContents());
		}
	}
}
