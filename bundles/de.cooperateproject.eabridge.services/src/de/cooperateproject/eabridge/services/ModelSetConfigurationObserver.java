package de.cooperateproject.eabridge.services;

public interface ModelSetConfigurationObserver {
	
	default void notifyModelSetConfigurationCommitChanges(ModelSetConfiguration msc, ModelAdapter commiter) {
		
	}
	
	default void notifyModelSetConfigurationDiscardChanges(ModelSetConfiguration msc, ModelAdapter adapter) {
		
	}
}
