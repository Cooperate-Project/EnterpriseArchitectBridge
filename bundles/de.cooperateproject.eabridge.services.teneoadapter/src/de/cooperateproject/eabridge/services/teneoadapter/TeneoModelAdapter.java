package de.cooperateproject.eabridge.services.teneoadapter;

import java.io.IOException;
import java.sql.Connection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.resource.SessionController;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync.MODE;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSyncListener;
import de.cooperateproject.eabridge.services.DatabaseFactory;
import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.common.AbstractModelAdapter;
import de.cooperateproject.eabridge.services.common.AbstractObservableModelSetConfiguration;
import de.cooperateproject.eabridge.services.common.ListBasedModelSetConfigurationBuilder;
import de.cooperateproject.eabridge.services.teneoadapter.util.CooperateHibernateResource;

@Component(configurationPolicy=ConfigurationPolicy.REQUIRE,
           name=TeneoModelAdapter.SERVICE_PID,
           service= {ModelAdapter.class},
           property= {
                   TeneoModelAdapter.TENEOADAPTER_SESSIONCONTROLLER_NAME + "=sc1",
                   TeneoModelAdapter.TENEOADAPTER_HQLQUERY_ROOTELEMENTS + "=from Package p where p.Parent.PackageID=0",
                   TeneoModelAdapter.TENEOADAPTER_PROPERTY_ELEMENTS + "=Name"
           })
public class TeneoModelAdapter extends AbstractModelAdapter implements IncrementalSyncListener {
    public static final String TENEOADAPTER_SESSIONCONTROLLER_NAME = "sessioncontroller.name";
    public static final String TENEOADAPTER_HQLQUERY_ROOTELEMENTS = "hqlquery.rootelements";
    public static final String TENEOADAPTER_PROPERTY_ELEMENTS = "rootelement.property";
    public static final String TENEOADAPTER_ELEMENTPATH = "elementpath";
    public static final String TENEOADAPTER_TABLE_PREFIX = "table.prefix";
    public static final String SERVICE_PID = "teneoadapter";
    
    protected static final Logger LOGGER = LoggerFactory.getLogger(TeneoModelAdapter.class);
            
    @Reference
    protected DatabaseFactory dbFactory;
    protected SessionWrapper sessionWrapper;
    protected IncrementalSync syncer;
    protected ResourceSetImpl resourceSet;
    protected URI resourceURI;
    
    protected AbstractObservableModelSetConfiguration currentModelSet;
    
	private Map<String, Object> configurationProperties;
	
    
    @Activate
    protected void activate(Map<String, Object> properties) throws IOException {
    	this.configurationProperties = properties;
        Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("cphb", new Resource.Factory() {
			@Override
			public Resource createResource(URI uri) {
				return new CooperateHibernateResource(uri);
			}
        });
        
        String uriStr = "cphb://?" + HibernateResource.SESSION_CONTROLLER_PARAM + "=" + properties.get(TENEOADAPTER_SESSIONCONTROLLER_NAME) + 
                "&query1=" + properties.get(TENEOADAPTER_HQLQUERY_ROOTELEMENTS);
        this.resourceURI = URI.createURI(uriStr);
        this.resourceSet = new ResourceSetImpl();

        
        /*Optional<EObject> rootElement = lookupRootElement(res, 
                properties.get(TENEOADAPTER_PROPERTY_ELEMENTS).toString(), 
                properties.get(TENEOADAPTER_ELEMENTPATH).toString());*/ 
        
        Connection c = dbFactory.getConnection();
        
        syncer = new IncrementalSync(c, this.getSessionWrapper(), properties.get(TENEOADAPTER_TABLE_PREFIX).toString(), MODE.LOG_AND_SYNC);
        syncer.addObserver(this);
        syncer.startASync();
    }
    
    protected SessionWrapper getSessionWrapper() throws IOException {
    	SessionController sc = SessionController.getSessionController(configurationProperties.get(TENEOADAPTER_SESSIONCONTROLLER_NAME).toString());
    	sc.getSessionWrapper().beginTransaction();
    	Resource createResource = resourceSet.createResource(resourceURI);
    	createResource.load(Collections.emptyMap());
    	sc.getSessionWrapper().commitTransaction();
    	return ((HibernateResource)createResource).getSessionWrapper();
    }
    
    @Deactivate
    protected void deactivate() {
        
    }
/*
    private Optional<EObject> lookupRootElement(Resource rootResource, String elementProperty, String elementPath) {
        Deque<String> splitPath = new LinkedList<>(Arrays.asList(elementPath.split("/")));
        List<EObject> alternatives = new LinkedList<>(rootResource.getContents());
        List<EObject> matching = Collections.emptyList();
        
        while (!(alternatives == null || alternatives.isEmpty())) {
            final String match = splitPath.poll();
            matching = alternatives.stream().filter(e -> {
                EStructuralFeature ft = e.eClass().getEStructuralFeature(elementProperty);
                return ft != null && e.eGet(ft).toString().equals(match);
            }).collect(Collectors.toList());
            if (!splitPath.isEmpty()) {
                alternatives = matching.stream().flatMap(e -> e.eContents().stream()).collect(Collectors.toList());
            } else {
                alternatives = null;
            }
        }
        
        return matching.stream().findAny();
    }*/

    @Override
    public ModelSetConfiguration getModelSet() {
    	if (this.currentModelSet == null) {
    		this.currentModelSet = initReadOnlyModelSet();
    	}
        return this.currentModelSet;
    }

    private AbstractObservableModelSetConfiguration initReadOnlyModelSet() {
    	Resource resource = resourceSet.getResource(resourceURI, false);
    	if (resource == null) {
    		SessionController sc = SessionController.getSessionController(configurationProperties.get(TENEOADAPTER_SESSIONCONTROLLER_NAME).toString());
        	sc.getSessionWrapper().beginTransaction();
    		resource = resourceSet.createResource(resourceURI);
    		try {
				resource.load(Collections.emptyMap());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
    		sc.getSessionWrapper().commitTransaction();
    	}
    	return (new ListBasedModelSetConfigurationBuilder()).appendRootElement(resource).build();
	}

	@Override
    public void startWritableMode() {
    	Resource resource = resourceSet.getResource(resourceURI, false);
    	if (resource != null) {
    		resource.unload();
    		this.resourceSet.getResources().remove(resource);
    	}
    	syncer.stop();
    	
    	SessionController sc = SessionController.getSessionController(configurationProperties.get(TENEOADAPTER_SESSIONCONTROLLER_NAME).toString());
    	sc.getSessionWrapper().beginTransaction();
    	resource = resourceSet.createResource(resourceURI);
    	try {
    		resource.load(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    	
    	this.currentModelSet = (new ListBasedModelSetConfigurationBuilder()).appendRootElement(resource).build();
    }

    @Override
    public void commitChanges() {
    	Resource resource = resourceSet.getResource(resourceURI, false);
        try {
        	resource.save(Collections.emptyMap());
        } catch(IOException ex) {
        	throw new RuntimeException(ex);
        }
        SessionController.getSessionController(configurationProperties.get(TENEOADAPTER_SESSIONCONTROLLER_NAME).toString())
			.getSessionWrapper().commitTransaction();
        
        this.currentModelSet.getEventDispatcher().notifyModelSetConfigurationCommitChanges(currentModelSet, this);
        resourceSet.getResources().remove(resource);
        this.currentModelSet = null;
        syncer.startASync();
    }

    @Override
    public void discardChanges() {
    	Resource resource = resourceSet.getResource(resourceURI, false);
    	SessionController.getSessionController(configurationProperties.get(TENEOADAPTER_SESSIONCONTROLLER_NAME).toString())
			.getSessionWrapper().rollbackTransaction();
    	this.currentModelSet.getEventDispatcher().notifyModelSetConfigurationDiscardChanges(currentModelSet, this);
    	resourceSet.getResources().remove(resource);
    	this.currentModelSet = null;
        syncer.startASync();
        
    }

	@Override
	public void changeOccured() {
		this.getEventDispatcher().notifyChange(this);
	}
}
