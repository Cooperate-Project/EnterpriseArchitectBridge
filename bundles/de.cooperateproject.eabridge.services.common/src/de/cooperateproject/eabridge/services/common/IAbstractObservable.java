package de.cooperateproject.eabridge.services.common;

/**
 * An interface to the abstract Observable class.
 * 
 * @author Steven Jeuris
 * @param <T>
 */
public interface IAbstractObservable<T> {

    /**
     * Add an observer which will listen to the actions of this object.
     * 
     * @param observer
     *            The observer which should listen to this observable.
     */
    public abstract void addObserver(T observer);

    /**
     * Remove an observer which was listening to this object.
     * 
     * @param observer
     *            The observer to remove.
     * 
     * @return True, when observer was found and removed, false otherwise.
     */
    public abstract void removeObserver(T observer);

}