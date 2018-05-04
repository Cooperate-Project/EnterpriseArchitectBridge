package de.cooperateproject.eabridge.transformation.executor;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.eabridge.services.TransformationTraceHandler;
import de.cooperateproject.eabridge.services.TransformationTraceHandlerProvider;
import de.cooperateproject.eabridge.transformation.executor.impl.Slf4JLogger;

@Component
public class QVTOTransformationContextProvider implements TransformationContextProvider {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(QVTOTransformationContextProvider.class);
    
    @Reference (
            policy = ReferencePolicy.DYNAMIC,
            cardinality = ReferenceCardinality.MULTIPLE,
            policyOption = ReferencePolicyOption.GREEDY
            )
    List<TransformationTraceHandlerProvider> traceProviders = new CopyOnWriteArrayList<>();
    

    @Override
    public ExecutionContext getTransformationContext(Transformation trans) {
        final ExecutionContextImpl result = new ExecutionContextImpl();
        
        List<TransformationTraceHandler> handlers = traceProviders.stream().map(p -> p.getTransformationTraceHandler(trans))
            .filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
        
        if (handlers.size() > 1) {
            LOGGER.error("Ambiguous transformation trace handler registration for {}", trans.toString());
            for (TransformationTraceHandler h : handlers) {
                LOGGER.error("Ambiguous option: ", h.toString());
            }
            
        } else if (handlers.size() == 1) {
            handlers.get(0).getTrace().ifPresent(h -> 
                result.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, h));
        }
        
        result.setLog(new Slf4JLogger(LoggerFactory.getLogger(trans.getClass())));
        
        return result;
    }


}
