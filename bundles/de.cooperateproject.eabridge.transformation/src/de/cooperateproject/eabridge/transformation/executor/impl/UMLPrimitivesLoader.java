package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;

public class UMLPrimitivesLoader {

    private static final URI UML_PRIMITIVE_TYPES = URI
            .createURI("pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
	
	public static ModelExtent loadUMLPrimitives(EObject someEObject) {
		List<EObject> rootElements = loadUMLPrimitives(someEObject.eResource().getResourceSet());
		return new BasicModelExtent(rootElements);
	}
	
	public static List<EObject> loadUMLPrimitives(ResourceSet rs) {
		Resource r = rs.getResource(UML_PRIMITIVE_TYPES, true);
		return r.getContents();
	}
    
}
