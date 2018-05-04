package de.cooperateproject.eabridge.services.common;

import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelChangeListener;

public abstract class AbstractModelAdapter extends AbstractObservable<ModelChangeListener> implements ModelAdapter {

    @Override
    public void registerChangeListener(ModelChangeListener listener) {
        if (!this.getObservers().contains(listener)) {
            this.addObserver(listener);
        }
    }
    
    @Override
    public void removeChangeListener(ModelChangeListener listener) {    
        this.removeObserver(listener);
    }

}
