package de.cooperateproject.eabridge.services.teneoadapter;

import java.io.IOException;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync.MODE;
import de.cooperateproject.eabridge.services.DatabaseFactory;
import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.common.AbstractModelAdapter;
import de.cooperateproject.eabridge.services.common.ListBasedModelSetConfigurationBuilder;

@Component(configurationPolicy=ConfigurationPolicy.REQUIRE,
           name=TeneoModelAdapter.SERVICE_PID,
           service= {ModelAdapter.class},
           property= {
                   TeneoModelAdapter.TENEOADAPTER_DATASTORE_NAME + "=datastore1",
                   TeneoModelAdapter.TENEOADAPTER_HQLQUERY_ROOTELEMENTS + "=from Package p where p.Parent.PackageID=0",
                   TeneoModelAdapter.TENEOADAPTER_PROPERTY_ELEMENTS + "=Name"
           })
public class TeneoModelAdapter extends AbstractModelAdapter {
    public static final String TENEOADAPTER_DATASTORE_NAME = "datastore.name";
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
    protected EObject rootElement;
    
    @Activate
    protected void activate(Map<String, Object> properties) throws IOException {
        dbFactory.getDataStore();
        
        String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + properties.get(TENEOADAPTER_DATASTORE_NAME) + 
                "&query1=" + properties.get(TENEOADAPTER_HQLQUERY_ROOTELEMENTS);
        final URI uri = URI.createURI(uriStr);
        ResourceSet resourceSet = new ResourceSetImpl();
        final Resource res = resourceSet.createResource(uri);
        
        res.load(Collections.EMPTY_MAP);
        
        sessionWrapper = ((HibernateResource)res).getSessionWrapper();
        Optional<EObject> rootElement = lookupRootElement(res, 
                properties.get(TENEOADAPTER_PROPERTY_ELEMENTS).toString(), 
                properties.get(TENEOADAPTER_ELEMENTPATH).toString()); 
        
        if (!rootElement.isPresent()) {
            throw new RuntimeException("The specified root element is not present in the database");
        }
        
        Connection c = dbFactory.getConnection();
        
        this.rootElement = rootElement.get();
        syncer = new IncrementalSync(c, sessionWrapper, properties.get(TENEOADAPTER_TABLE_PREFIX).toString(), MODE.LOG_AND_SYNC);
        syncer.startASync();
    }
    
    @Deactivate
    protected void deactivate() {
        
    }

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
    }

    @Override
    public ModelSetConfiguration getModelSet() {
        return (new ListBasedModelSetConfigurationBuilder()).appendRootElement(rootElement).build();
    }

    @Override
    public void startWritableMode() {   
    }

    @Override
    public void commitChanges() {
        syncer.stop();
        try {
            rootElement.eResource().save(Collections.emptyMap());
        } catch(IOException ex) {
            LOGGER.error("Commit failed", ex);
        }
        syncer.startASync();
    }

    @Override
    public void discardChanges() {
        rootElement.eResource().unload();
        try {
            rootElement.eResource().load(Collections.emptyMap());
        } catch(IOException ex) {
            LOGGER.error("Commit failed", ex);
        }
    }
}
