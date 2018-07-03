package de.cooperateproject.eabridge.transformation.executor;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.eabridge.services.TransformationTraceHandlerRegistry;
import de.cooperateproject.eabridge.transformation.executor.impl.EAtoPapyrusTransformation;
import de.cooperateproject.eabridge.transformation.executor.impl.PapyrusToEATransformation;
import de.cooperateproject.qvtoutils.blackbox.CooperateLibrary;

@Component(service = {TransformationContextProvider.class})
public class EAQVTOTransformationContextProvider extends QVTOTransformationContextProvider {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EAQVTOTransformationContextProvider.class);
	
	@Reference(unbind="unbindTraceHandlerRegistry")
	protected void bindTraceHandlerRegistry(TransformationTraceHandlerRegistry provider) {
		super.traceProviderRegistry = provider;
	}
	
	protected void unbindTraceHandlerRegistry(TransformationTraceHandlerRegistry provider) {
		if (super.traceProviderRegistry == provider) {
			super.traceProviderRegistry = null;
		}
	}
	
	@Override
	public boolean isCompatibleWith(Transformation trans) {
		return trans instanceof PapyrusToEATransformation || trans instanceof EAtoPapyrusTransformation;
	}
	
	@Override
	public int getPriority(Transformation trans) {
		return TransformationContextProvider.INCREASED_PRIORITY;
	}
	
	@Override
	public ExecutionContext getTransformationContext(Transformation trans) {
		ExecutionContext ctx = super.getTransformationContext(trans);
		ctx.getSessionData().setValue(CooperateLibrary.ADD_FEATURE_REQUESTS, new IdentityHashMap<>());
		return ctx;
	}
	
	@Override
	public void postProcessTransformationContext(ExecutionContext context, Transformation trans) {
		Map<Collection<Object>, List<Object>> recordedOrderingData = context.getSessionData()
                .getValue(CooperateLibrary.ADD_FEATURE_REQUESTS);
        processRecordedOrderingData(recordedOrderingData);
		super.postProcessTransformationContext(context, trans);
	}

    protected void processRecordedOrderingData(Map<Collection<Object>, List<Object>> recordedOrderingData) {
        for (Entry<Collection<Object>, List<Object>> entry : recordedOrderingData.entrySet()) {
            if (entry.getKey() instanceof EList) {
                processRecordedOrderingData((EList<Object>) entry.getKey(), entry.getValue());
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
}
