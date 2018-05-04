package de.cooperateproject.eabridge.services;

public interface ModelAdapter {
    
    ModelSetConfiguration getModelSet();
    
    void registerChangeListener(ModelChangeListener listener);
    void removeChangeListener(ModelChangeListener listener);
    
    void startWritableMode();
    void commitChanges();
    void discardChanges();
}
