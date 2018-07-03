package de.cooperateproject.eabridge.transformation.executor;

import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.eabridge.services.TransformationTraceHandlerRegistry;
import de.cooperateproject.eabridge.transformation.executor.impl.QVTOTransformationBase;
import de.cooperateproject.eabridge.transformation.executor.impl.Slf4JLogger;

@SuppressWarnings("restriction")
@Component
public class QVTOTransformationContextProvider implements TransformationContextProvider {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(QVTOTransformationContextProvider.class);
    
    @Reference 
    protected TransformationTraceHandlerRegistry traceProviderRegistry;
    
    @Override
    public boolean isCompatibleWith(Transformation trans) {
    	return trans instanceof QVTOTransformationBase;
    }

    @Override
    public ExecutionContext getTransformationContext(Transformation trans) {
        final ExecutionContextImpl result = new ExecutionContextImpl();
        
        traceProviderRegistry.getSuitableTraceHandler(trans).ifPresent(handler -> 
        	handler.getTrace(trans).ifPresent(h -> 
            	result.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, h)));        
        
        result.setLog(new Slf4JLogger(LoggerFactory.getLogger(trans.getClass())));
        
        return result;
    }
    
    @Override
    public void postProcessTransformationContext(ExecutionContext context, Transformation trans) {
    	
    	traceProviderRegistry.getSuitableTraceHandler(trans).ifPresent(handler -> 
    		handler.storeTrace(trans, context.getSessionData().getValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE)));
    	
    }

	@Override
	public int getPriority(Transformation trans) {
		return TransformationContextProvider.NORMAL_PRIORITY;
	}


}
