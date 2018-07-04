package de.cooperateproject.eabridge.services;

public interface ModelSetConfigurationObserver {
	
	default void notifyModelSetConfigurationCommitChanges(ModelSetConfiguration msc) {
		
	}
	
	default void notifyModelSetConfigurationDiscardChanges(ModelSetConfiguration msc) {
		
	}
	
	default void notifyModelSetConfigurationUpdatedExternally(ModelSetConfiguration oldConfig, ModelSetConfiguration newConfig) {
		
	}

}
