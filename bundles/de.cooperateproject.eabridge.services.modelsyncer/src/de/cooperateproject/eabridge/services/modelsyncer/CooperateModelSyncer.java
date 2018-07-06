package de.cooperateproject.eabridge.services.modelsyncer;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelChangeListener;
import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.SynchronizationExecutor;
import de.cooperateproject.eabridge.services.TransformationFactoryRegistry;
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;

@Component(service={}, immediate=true)
public class CooperateModelSyncer implements ModelChangeListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateModelSyncer.class);
    Collection<ModelAdapter> modelAdapters = new CopyOnWriteArrayList<>();
    
    @Reference
    TransformationFactoryRegistry tfRegistry;
    
    @Reference
    SynchronizationExecutor sExecutor;
    
    @Activate
    protected void activate(Map<String, Object> properties) {
        for (ModelAdapter ad : modelAdapters) {
            ad.registerChangeListener(this);
        }
    }
    
    @Deactivate
    protected void deactivate() {
        for (ModelAdapter ad : modelAdapters) {
            ad.removeChangeListener(this);
        }
    }
    
    @Reference(
            cardinality=ReferenceCardinality.AT_LEAST_ONE,
            policyOption=ReferencePolicyOption.GREEDY,
            policy=ReferencePolicy.DYNAMIC
            )
    protected void registerModelAdapter(ModelAdapter ad) {
        LOGGER.info("ModelAdapter registered: {}", ad.toString());
        modelAdapters.add(ad);
        ad.registerChangeListener(this);
    }
    
    protected void unregisterModelAdapter(ModelAdapter ad) {
        LOGGER.info("ModelAdapter unregistered: {}", ad.toString());
        modelAdapters.remove(ad);
        ad.removeChangeListener(this);
    }

    @Override
    public void notifyChange(ModelAdapter adapterWithChange) {
        final ModelSetConfiguration sourceModelSet = adapterWithChange.getModelSet();
        for (ModelAdapter ad : modelAdapters) {
            if (ad != adapterWithChange) {
                
                final ModelSetConfiguration targetModelSet = ad.getModelSet();
                tfRegistry.getSuitableFactories(
                        new GeneralizedTransformationCharacteristic(sourceModelSet.getSpecification(), targetModelSet.getSpecification()))
                    .stream().map(fact -> fact.create(adapterWithChange, ad))
                    .forEach(t -> sExecutor.scheduleSynchronization(t, ad));
            }
        }
    }

}
