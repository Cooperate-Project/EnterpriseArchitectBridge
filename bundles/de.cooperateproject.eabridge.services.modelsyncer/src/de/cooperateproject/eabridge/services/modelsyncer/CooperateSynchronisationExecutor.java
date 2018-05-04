package de.cooperateproject.eabridge.services.modelsyncer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.core.runtime.IStatus;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.SynchronizationExecutor;
import de.cooperateproject.eabridge.services.Transformation;

@Component (scope = ServiceScope.SINGLETON)
public class CooperateSynchronisationExecutor implements SynchronizationExecutor {
    
    protected static class SynchronisationAttempt {
        protected final Transformation transformation;
        protected final List<ModelAdapter> targetAdapters;

        SynchronisationAttempt (Transformation transformation, List<ModelAdapter> targetAdapters) {
            this.transformation = transformation;
            this.targetAdapters = targetAdapters;
        }
    }
    
    protected BlockingQueue<SynchronisationAttempt> syncQueue = new LinkedBlockingQueue<SynchronisationAttempt>();
    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateSynchronisationExecutor.class);
    protected static SynchronisationAttempt POISON_PILL = new SynchronisationAttempt(null, null);
    
    @Activate
    private void activate(Map<String, Object> properties) {
        new Thread(() -> {
            try {
                while (processQueue());
            } catch (InterruptedException e) {
                //Intentionally left blank
            }
        }).start();
        
        
    }
    
    @Deactivate
    private void deactivate() {
        syncQueue.add(POISON_PILL);
    }
    
    protected boolean processQueue() throws InterruptedException {
        SynchronisationAttempt attempt = syncQueue.take();
        
        if (attempt == POISON_PILL) return false;
        
        attempt.targetAdapters.forEach(ModelAdapter::startWritableMode);
        
        IStatus status = attempt.transformation.transform();
        
        if (status.isOK()) {
            attempt.targetAdapters.forEach(ModelAdapter::commitChanges);
            LOGGER.info("Change transformation successfully finished and commited for {}", attempt.transformation);
        } else {
            attempt.targetAdapters.forEach(ModelAdapter::discardChanges);
            LOGGER.info("Change transformation failed; changes discarded for {}", attempt.transformation);
        }
        
        return true;
    }
    
    
    @Override
    public void scheduleSynchronization(Transformation transformation, ModelAdapter... targetAdapters) {
        syncQueue.add(new SynchronisationAttempt(transformation, Arrays.asList(targetAdapters)));
    }

}
