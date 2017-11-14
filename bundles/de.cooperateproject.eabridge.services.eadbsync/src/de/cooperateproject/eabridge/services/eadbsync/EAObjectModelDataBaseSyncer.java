package de.cooperateproject.eabridge.services.eadbsync;

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
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync;
import de.cooperateproject.eabridge.incrementalsync.synchronization.IncrementalSync.MODE;
import de.cooperateproject.eabridge.services.DatabaseFactory;

@Component(immediate=true, 
           configurationPolicy=ConfigurationPolicy.REQUIRE,
           name=EAObjectModelDataBaseSyncer.SERVICE_PID,
           property= {
                   EAObjectModelDataBaseSyncer.DATABASESYNCER_HQLQUERY_ROOTELEMENTS + "=from Package p where p.Parent.PackageID=0",
                   EAObjectModelDataBaseSyncer.DATABASESYNCER_PROPERTY_ELEMENTS + "=Name"
           })
public class EAObjectModelDataBaseSyncer {
    public static final String DATABASESYNCER_DATASTORE_NAME = "databasesyncer.datastore.name";
    public static final String DATABASESYNCER_HQLQUERY_ROOTELEMENTS = "databasesyncer.hqlquery.rootelements";
    public static final String DATABASESYNCER_PROPERTY_ELEMENTS = "databasesyncer.rootelement.property";
    public static final String DATABASESYNCER_ELEMENTPATH = "databasesyncer.elementpath";
    public static final String SERVICE_PID = "eadbsyncer";
    
    protected static final Logger LOGGER = LoggerFactory.getLogger(EAObjectModelDataBaseSyncer.class);
            
    @Reference
    protected DatabaseFactory dbFactory;
    
    protected SessionFactory sessionFactory;
    protected IncrementalSync syncer;
    protected EObject rootElement;
    
    @Activate
    protected void activate(Map<String, Object> properties) throws IOException {
        HbDataStore dataStore = dbFactory.getDataStore();
        sessionFactory = dataStore.getSessionFactory();
        Session session = sessionFactory.openSession();

        String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + properties.get(DATABASESYNCER_DATASTORE_NAME) + 
                "&query1=" + properties.get(DATABASESYNCER_HQLQUERY_ROOTELEMENTS);
        final URI uri = URI.createURI(uriStr);
        ResourceSet resourceSet = new ResourceSetImpl();
        final Resource res = resourceSet.createResource(uri);
        
        res.load(Collections.EMPTY_MAP);
        
        Optional<EObject> rootElement = lookupRootElement(res, 
                properties.get(DATABASESYNCER_PROPERTY_ELEMENTS).toString(), 
                properties.get(DATABASESYNCER_ELEMENTPATH).toString()); 
        
        
        if (!rootElement.isPresent()) {
            throw new RuntimeException("The specified root element is not present in the database");
        }
        
        Connection c = dbFactory.getConnection();
        
        syncer = new IncrementalSync(c, dataStore, session, properties.getOrDefault("databasesyncer.table.prefix", "").toString(), MODE.LOG_AND_SYNC);
        syncer.enableSaving(rootElement.get());
        syncer.startASync();
    }
    
    @Deactivate
    protected void deactivate() {
        if (syncer != null && rootElement != null) {
            syncer.disableSaving();
        }
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
}
