package de.cooperateproject.eabridge.services.cdomodeladapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;

public class CDOViewUpdateListener implements IListener{
       
    protected final Collection<String> resourceNamesToWatch;
    protected final Runnable callback;
    
    public CDOViewUpdateListener(Collection<String> resourceNamesToWatch, Runnable callback) {
        this.resourceNamesToWatch = Collections.unmodifiableList(new ArrayList<>(resourceNamesToWatch));
        this.callback = callback;
    }
    
    public void startWatchingOfView(CDOView view) {
        view.addListener(this);
        view.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
    }
    
    public void stopWatchingOfView(CDOView view) {
        view.removeListener(this);
    }
    
    @Override
    public void notifyEvent(IEvent arg0) {
        if (arg0 instanceof CDOViewInvalidationEvent) {
            notifyCallbacks((CDOViewInvalidationEvent) arg0);
        }
    }
    
    protected void notifyCallbacks(CDOViewInvalidationEvent event) {
        if (event.getRevisionDeltas().keySet().stream().map(this::toURI)
                .filter(Optional::isPresent).map(Optional::get).map(Object::toString)
                .anyMatch(changedResource -> 
                    resourceNamesToWatch.stream().anyMatch(toWatch -> StringUtils.getCommonPrefix(changedResource, toWatch).equals(toWatch))
                )) {
            this.callback.run();
        }
    }

    private Optional<URI> toURI(CDOObject o) {
        if (!o.cdoInvalid()) {
            URI resourceURI = null;
            if (o.cdoResource() != null) {
                resourceURI = o.cdoResource().getURI();
            }
            if (o instanceof CDOResourceNode) {
                resourceURI = ((CDOResourceNode) o).getURI();
            }
            return Optional.ofNullable(resourceURI);
        }
        return Optional.empty();
    }
}
