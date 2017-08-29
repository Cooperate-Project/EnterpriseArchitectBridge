package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Arrays;

import org.apache.commons.lang3.Validate;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.Model;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;

public class PapyrusToEATransformationExecutor extends TransformationExecutorBase {
	
	public PapyrusToEATransformationExecutor() {
		super("UMLtoEA.qvto", Arrays.asList(Diagram.class, Model.class));
	}

	@Override
	protected ModelExtent[] preprocessModelParameters(ModelExtent[] modelParameters) {		
		Validate.notNull(modelParameters);
		Validate.isTrue(modelParameters.length == 3);
		
		validateParameter(modelParameters[0], Model.class);	
		validateParameter(modelParameters[1], Diagram.class);			
		if (!modelParameters[2].getContents().isEmpty()) {
			validateParameter(modelParameters[2], Arrays.asList(Package.class, Element.class));			
		}
		
		ModelExtent[] result = new ModelExtent[4];
		result[0] = modelParameters[0];
		result[1] = modelParameters[1];
		result[2] = UMLPrimitivesLoader.loadUMLPrimitives(modelParameters[0].getContents().get(0));
		result[3] = modelParameters[2];
		return result;
	}
	
}
