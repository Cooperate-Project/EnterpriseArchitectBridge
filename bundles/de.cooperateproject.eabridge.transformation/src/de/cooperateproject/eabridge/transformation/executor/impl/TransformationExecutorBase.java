package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.eabridge.transformation.executor.ITransformationExecutor;
import de.cooperateproject.qvtoutils.blackbox.CooperateLibrary;

public abstract class TransformationExecutorBase implements ITransformationExecutor {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransformationExecutorBase.class);
	private final TransformationExecutor executor;
	private final Collection<Class<? extends EObject>> requiredInputParameters;
	
	public TransformationExecutorBase(String transformationFileName, Collection<Class<? extends EObject>> requiredInputParameters) {
		executor = createTransformationExecutor(transformationFileName);
		this.requiredInputParameters = Collections.unmodifiableCollection(requiredInputParameters);
	}
	
	private TransformationExecutor createTransformationExecutor(String transformationFileName) {
		URI transformationURI = createTransformationURI(transformationFileName);
		return new TransformationExecutor(transformationURI);
	}

	private URI createTransformationURI(String transformationFileName) {
		String path = String.format("%s/transforms/%s", Activator.PLUGIN_ID, transformationFileName);
		if (isPluginEnvironment()) {
			return URI.createPlatformPluginURI(path, true);
		}
		return URI.createPlatformResourceURI(path, true);
	}

	protected ExecutionDiagnostic execute(ExecutionContext executionContext, ModelExtent... modelParameters) {
		ModelExtent[] modelParametersToUse = preprocessModelParameters(modelParameters);
		executionContext.getSessionData().setValue(CooperateLibrary.ADD_FEATURE_REQUESTS, new IdentityHashMap<>());
		ExecutionDiagnostic result = executor.execute(executionContext, modelParametersToUse);
		Map<Collection<Object>, List<Object>> recordedOrderingData = executionContext.getSessionData().getValue(CooperateLibrary.ADD_FEATURE_REQUESTS);
		processRecordedOrderingData(recordedOrderingData);
		return result;
	}

    protected abstract ModelExtent[] preprocessModelParameters(ModelExtent[] modelParameters);
    
	@Override
	public ExecutionDiagnostic execute(Optional<Trace> trace, ModelExtent... modelParameters) {
        ExecutionContextImpl context = new ExecutionContextImpl();
        trace.ifPresent(t -> context.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, t));
        context.setLog(new Slf4JLogger(LOGGER));
		return execute(context, modelParameters);
	}

	protected void processRecordedOrderingData(Map<Collection<Object>, List<Object>> recordedOrderingData) {
		for (Entry<Collection<Object>, List<Object>> entry : recordedOrderingData.entrySet()) {
			if (entry.getKey() instanceof EList) {
				processRecordedOrderingData((EList<Object>)entry.getKey(), entry.getValue());				
			}
		}
	}

	protected void processRecordedOrderingData(EList<Object> collection, List<Object> ordering) {
		if (collection.size() < ordering.size()) {
			LOGGER.error(
					"The reordering of entries cannot take place because the sizes of the collections do not match: {} < {}",
					collection.size(), ordering.size());
		}
		for (int targetIndex = 0; targetIndex < ordering.size(); ++targetIndex) {
			Object elementToMove = ordering.get(targetIndex);
			int sourceIndex = collection.indexOf(elementToMove);
			if (targetIndex == sourceIndex) {
				continue;
			}
			collection.move(targetIndex, sourceIndex);
		}
	}

	@Override
	public Collection<Class<? extends EObject>> getRequiredInputParameters() {
		return requiredInputParameters;
	}

	private static boolean isPluginEnvironment() {
        return ResourcesPlugin.getPlugin() != null;
    }
	
	protected static void validateParameter(ModelExtent modelParameter, Class<? extends EObject> type) {
		Validate.isTrue(modelParameter.getContents().size() == 1);
		Validate.isInstanceOf(type, modelParameter.getContents().get(0));
	}
	
	protected static void validateParameter(ModelExtent modelParameter, List<Class<? extends EObject>> types) {
		Validate.isTrue(modelParameter.getContents().size() == types.size());
		for (int i = 0; i < types.size(); ++i) {
			Validate.isInstanceOf(types.get(i), modelParameter.getContents().get(i));
		}
	}
}
