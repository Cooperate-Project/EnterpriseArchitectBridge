package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Arrays;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.Model;

import de.cooperateproject.eabridge.eaobjectmodel.Package;

public class EAtoPapyrusTransformationExecutor extends TransformationExecutorBase {

	public EAtoPapyrusTransformationExecutor() {
		super("EAtoUML.qvto", Arrays.asList(Package.class));
	}

	@Override
	protected ModelExtent[] preprocessModelParameters(ModelExtent[] modelParameters) {
		Validate.notNull(modelParameters);
		Validate.isTrue(modelParameters.length == 3);
		
		validateParameter(modelParameters[0], Package.class);	
		if (!modelParameters[1].getContents().isEmpty()) {
			validateParameter(modelParameters[1], Model.class);			
		}
		if (!modelParameters[2].getContents().isEmpty()) {
			validateParameter(modelParameters[2], Diagram.class);			
		}
		
		ModelExtent[] result = new ModelExtent[4];
		result[0] = modelParameters[0];
		result[1] = UMLPrimitivesLoader.loadUMLPrimitives(modelParameters[0].getContents().get(0));
		result[2] = modelParameters[1];
		result[3] = modelParameters[2];
		return result;
	}

	private static void validateParameter(ModelExtent modelParameter, Class<? extends EObject> type) {
		Validate.isTrue(modelParameter.getContents().size() == 1);
		Validate.isInstanceOf(type, modelParameter.getContents().get(0));
	}
	

}
