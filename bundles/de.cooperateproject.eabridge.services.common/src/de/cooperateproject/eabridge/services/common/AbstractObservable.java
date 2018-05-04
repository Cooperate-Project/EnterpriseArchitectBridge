package de.cooperateproject.eabridge.services.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * A generic implementation of an Observable object as defined by the <a
 * href="http://en.wikipedia.org/wiki/Observer_pattern">Observer pattern</a>. As a type parameter
 * the interface for the Observer needs to be specified.
 *
 * Taken from http://pastebin.com/YmVhDNzk and adapted
 * 
 * @author Steven Jeuris
 * @param <ObserverInterfaceType>
 *            The interface which should be implemented by the observers.
 */
public abstract class AbstractObservable<ObserverInterfaceType> implements IAbstractObservable<ObserverInterfaceType> {

    /**
     * The ObserverPool is a proxy which allows calls to an interface to be forwarded to a set of
     * listeners.
     *
     * @author Steven Jeuris
     *
     * @param <T>
     *            The interface which defines which calls can be made to the listeners.
     */
    private class ObserverPool<T> implements InvocationHandler {

        /**
         * The list of listeners. Additions and removals greatly outnumber traversals, so a
         * CopyOnWriteArrayList is the most efficient solution.
         */
        private final List<T> m_pool = new CopyOnWriteArrayList<T>();

        List<T> getObservers() {
            return Collections.unmodifiableList(m_pool);
        }

        /**
         * Add an observer to which the calls will be made.
         *
         * @param observer
         *            The observer to add.
         */
        void addObserver(final T observer) {
            m_pool.add(observer);
        }

        /**
         * Remove an observer to which calls where being made.
         *
         * @param observer
         *            The observer to remove.
         *
         * @return True, when the observer was found and removed, false otherwise.
         */
        boolean removeObserver(final T observer) {
            return m_pool.remove(observer);
        }

        void removeAllObserver() {
            m_pool.clear();
        }

        /**
         * Create the proxy which allows to dispatch all calls to the observers.
         *
         * @param observerClass
         *            The interface class of the observers.
         *
         * @return The dispatcher which can be used to make calls to all added observers.
         */
        @SuppressWarnings("unchecked")
        T createEventDispatcher(final Class<?> observerClass) {
            final T dispatcher = (T) Proxy.newProxyInstance(observerClass.getClassLoader(), new Class[] {
                observerClass
            }, this);

            return dispatcher;
        }

        /**
         * invoke() implementation of InvocationHandler. This is called whenever a call is made to
         * an event dispatcher.
         */
        @Override
        public Object invoke(final Object object, final Method method, final Object[] args) throws Throwable {
            // Forward the call to all observers.
            for (final T observer : m_pool) {
                method.invoke(observer, args);
            }

            // No return object available.
            return null;
        }

    }

    private ObserverInterfaceType m_eventDispatcher = null;

    /**
     * The list of observers to which the event dispatcher forwards it calls.
     */
    private final ObserverPool<ObserverInterfaceType> m_observers = new ObserverPool<ObserverInterfaceType>();

    /**
     * Get the event dispatcher through which you can notify the observers.
     *
     * @return The event dispatcher through which you can notify the observers.
     */
    public ObserverInterfaceType getEventDispatcher() {
        // Only create one instance of the dispatcher.
        if (m_eventDispatcher == null) {
            // Use reflection to get the generic parameter type.
            // Find the super class after 'AbstractObservable'.
            Class<?> superClass = this.getClass();
            while (superClass.getSuperclass() != AbstractObservable.class) {
                superClass = superClass.getSuperclass();
            }

            // Get the generic class for AbstractObservable, so that parameter types
            // can be extracted.
            final Type genericClass = superClass.getGenericSuperclass();
            if (genericClass instanceof Class<?>) {
                new RuntimeException("Observable requires a parameter type!");
            } else {
                // Get the parameter type.
                final ParameterizedType genericType = (ParameterizedType) genericClass;
                final Type[] typeArguments = genericType.getActualTypeArguments();

                m_eventDispatcher = m_observers.createEventDispatcher((Class<?>) typeArguments[0]);
            }

        }

        return m_eventDispatcher;
    }

    /*
     * (non-Javadoc)
     * 
     * @see be.hyp3.patterns.observer.IObservable#addObserver(T)
     */
    @Override
    public void addObserver(final ObserverInterfaceType observer) {
        if (observer == null || this.m_observers.getObservers().contains(observer)) {
            throw new IllegalArgumentException("Invalid observer added");
        }
        m_observers.addObserver(observer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see be.hyp3.patterns.observer.IObservable#removeObserver(T)
     */
    @Override
    public void removeObserver(final ObserverInterfaceType observer) {
        if (observer == null || !this.m_observers.getObservers().contains(observer)) {
            throw new IllegalArgumentException("Invalid observer removed");
        }
        m_observers.removeObserver(observer);
    }

    public List<ObserverInterfaceType> getObservers() {
        return m_observers.getObservers();
    }

    public void removeAllObserver() {
        m_observers.removeAllObserver();
    }

}