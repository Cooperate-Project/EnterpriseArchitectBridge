package de.cooperateproject.eabridge.incrementalsync.synchronization;

@FunctionalInterface
public interface IncrementalSyncListener {

	void changeOccured();
}
