package de.cooperateproject.eabridge.transformation.executor;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

public interface ITransformationExecutor {

	public ExecutionDiagnostic execute(Optional<Trace> trace, ModelExtent... modelParameters);
	
	public Collection<Class<? extends EObject>> getRequiredInputParameters();
	
}
