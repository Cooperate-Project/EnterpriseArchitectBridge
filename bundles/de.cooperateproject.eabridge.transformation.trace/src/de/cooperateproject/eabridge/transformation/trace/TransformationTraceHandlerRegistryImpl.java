package de.cooperateproject.eabridge.transformation.trace;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationTraceHandler;
import de.cooperateproject.eabridge.services.TransformationTraceHandlerRegistry;

@Component
public class TransformationTraceHandlerRegistryImpl implements TransformationTraceHandlerRegistry {
	
    @Reference (
            policy = ReferencePolicy.DYNAMIC,
            cardinality = ReferenceCardinality.MULTIPLE,
            policyOption = ReferencePolicyOption.GREEDY
            )
    protected volatile List<TransformationTraceHandler> traceProviders = new CopyOnWriteArrayList<>();

	@Override
	public Optional<TransformationTraceHandler> getSuitableTraceHandler(Transformation transformation) {
		return traceProviders.stream().filter(t -> t.isHandlerFor(transformation)).findAny();		
	}

}
