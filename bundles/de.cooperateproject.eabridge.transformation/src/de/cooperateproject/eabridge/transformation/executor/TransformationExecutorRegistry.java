package de.cooperateproject.eabridge.transformation.executor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.eabridge.transformation.executor.impl.EAtoPapyrusTransformationExecutor;
import de.cooperateproject.eabridge.transformation.executor.impl.PapyrusToEATransformationExecutor;

public enum TransformationExecutorRegistry {
	INSTANCE;

	private final Collection<ITransformationExecutor> executors = createTransformationExecutors();
	
	
	public static TransformationExecutorRegistry getInstance() {
		return INSTANCE;
	}
	
	public Optional<ITransformationExecutor> getExecutor(Class<? extends EObject>[] sourceTypes) {
		return getExecutor(Arrays.asList(sourceTypes));
	}
	
	private Optional<ITransformationExecutor> getExecutor(Collection<Class<? extends EObject>> sourceTypes) {
		for (ITransformationExecutor executor : executors) {
			Collection<Class<? extends EObject>> requiredParameters = executor.getRequiredInputParameters();
			if (requiredParameters.size() == sourceTypes.size() && requiredParameters.containsAll(sourceTypes)) {
				return Optional.of(executor);
			}
		}
		return Optional.empty();
	}
	
	private static Collection<ITransformationExecutor> createTransformationExecutors() {
		return Arrays.asList(new EAtoPapyrusTransformationExecutor(), new PapyrusToEATransformationExecutor());
	}
	
}
