package de.cooperateproject.eabridge.services;

public interface SynchronizationExecutor {
    
    void scheduleSynchronization(Transformation transformation, ModelAdapter... targetAdapters);

}
