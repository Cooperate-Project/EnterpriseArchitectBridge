package de.cooperateproject.eabridge;

import java.util.concurrent.CompletableFuture;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CooperateEABridgeApplication implements IApplication {
    protected Logger LOGGER = LoggerFactory.getLogger(CooperateEABridgeApplication.class);
    
    private CompletableFuture<Object> stopFuture;

    @Override
    public Object start(IApplicationContext context) throws Exception {
        LOGGER.info("Cooperate EA Bridge Application starting...");
        
        context.applicationRunning();
        
        stopFuture = new CompletableFuture<Object>();
        Object result = stopFuture.get();
        stopFuture = null;
        
        LOGGER.info("Cooperate EA Bridge Application terminating...");
        return result;
    }
    
    @Override
    public void stop() {
        if (stopFuture != null) {
            stopFuture.complete(EXIT_OK);
        }
    }

}
