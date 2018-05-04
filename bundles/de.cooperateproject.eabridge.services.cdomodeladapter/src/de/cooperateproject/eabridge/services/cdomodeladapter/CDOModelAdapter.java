package de.cooperateproject.eabridge.services.cdomodeladapter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.ModelSetConfigurationBuilder;
import de.cooperateproject.eabridge.services.cdoconnectionfactory.CDOConnectionFactory;
import de.cooperateproject.eabridge.services.common.AbstractModelAdapter;
import de.cooperateproject.eabridge.services.common.ListBasedModelSetConfigurationBuilder;

@Component(
        name = CDOModelAdapter.SERVICE_PID,
        configurationPolicy=ConfigurationPolicy.REQUIRE
)
public class CDOModelAdapter extends AbstractModelAdapter implements ModelAdapter {
    public static final String SERVICE_PID = "cdoadapter";
    public static final String CDOMODELADAPTER_BASE_PATH = "basepath";
    public static final String CDOMODELADAPTER_MODEL_PREFIX = "model";
    
    public static final Logger LOGGER = LoggerFactory.getLogger(CDOModelAdapter.class);
    
    @Reference
    protected CDOConnectionFactory cdoFactory;
    
    protected Map<String, Object> properties;
    
    protected CDOSession currentSession;
    protected CDOView currentView;
    protected ModelSetConfiguration currentModelSet;
    protected CDOViewUpdateListener updateListener;
    
    @Activate
    protected void activate(Map<String, Object> properties) {
        this.properties = properties;
        
        currentSession = cdoFactory.getSession();
        
        currentView = currentSession.openView();
        
        this.currentModelSet = calculateModelSetConfiguration();
        this.updateListener = new CDOViewUpdateListener(
                StreamSupport.stream(this.currentModelSet.spliterator(), false)
                .map(QualifiedModel::getModel)
                .map(EObject::eResource)
                .map(Resource::getURI).map(Object::toString).collect(Collectors.toList()),
                this::refreshModelSet);
        this.updateListener.startWatchingOfView(this.currentView);
        
    }
    
    @Deactivate
    protected void deactivate() {
        if (!currentView.isClosed()) {
            currentView.close();
        }
    }

    @Override
    public ModelSetConfiguration getModelSet() {
        if (this.currentModelSet == null) {
            this.currentModelSet = calculateModelSetConfiguration();
        }
        return this.currentModelSet;
    }
    
    protected void refreshModelSet() {
        this.updateListener.stopWatchingOfView(this.currentView);
        this.currentView = this.currentSession.openView();
        this.updateListener.startWatchingOfView(this.currentView);
        this.currentModelSet = calculateModelSetConfiguration();
        this.getEventDispatcher().notifyChange(this);
    }
    
    private String buildResourcePath(List<String> modelConfig) {
        return buildResourcePath(String.join(".", modelConfig)); 
    }
    
    private String buildResourcePath(String resourceNameParam) {
        return properties.get(CDOMODELADAPTER_BASE_PATH).toString() + '/' + properties.get(resourceNameParam); 
    }
    
    protected ModelSetConfiguration calculateModelSetConfiguration() {
        final ModelSetConfigurationBuilder<ModelSetConfiguration> builder = new ListBasedModelSetConfigurationBuilder();
        properties.keySet().stream().filter(k -> k.startsWith(CDOMODELADAPTER_MODEL_PREFIX))
            .map(s -> s.split("\\.")).map(Arrays::asList).sorted((o1, o2) -> o1.get(1).compareTo(o2.get(1)))
            .forEach(splitKey -> {
                EObject rootElement = currentView.getResource(buildResourcePath(splitKey), true).getContents().get(0);
                LOGGER.info("Updated resource {} ({})", rootElement.eResource().getURI().toString(), rootElement.eClass().getEPackage().getNsURI());
                builder.appendRootElement(rootElement, splitKey.size() > 2 ? Optional.of(splitKey.get(2)): Optional.empty());
            });
            
        return builder.build();
    }

    @Override
    public void startWritableMode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void commitChanges() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void discardChanges() {
        // TODO Auto-generated method stub
        
    }
}
