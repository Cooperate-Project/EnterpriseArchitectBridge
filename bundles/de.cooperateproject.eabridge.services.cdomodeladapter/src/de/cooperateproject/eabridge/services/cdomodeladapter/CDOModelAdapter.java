package de.cooperateproject.eabridge.services.cdomodeladapter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.util.io.IOUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.merger.NilFixingCDOMerger;
import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.ModelSetConfigurationBuilder;
import de.cooperateproject.eabridge.services.cdoconnectionfactory.CDOConnectionFactory;
import de.cooperateproject.eabridge.services.common.AbstractModelAdapter;
import de.cooperateproject.eabridge.services.common.AbstractObservableModelSetConfiguration;
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
    protected CDOBranch editableBranch;
    protected CDOTransaction editableView;
    protected CDOView mainView;
    
    
    protected AbstractObservableModelSetConfiguration currentModelSet;
    protected CDOViewUpdateListener updateListener;
    
    private long lastMergeTimeBranch;
    private long lastMergeTimeMain;
    
    @Activate
    protected void activate(Map<String, Object> properties) {
        this.properties = properties;
        
        currentSession = cdoFactory.getSession();
        mainView = currentSession.openView(currentSession.getBranchManager().getMainBranch());
        
        startWritableMode();
        
        this.updateListener = new CDOViewUpdateListener(
                StreamSupport.stream(this.currentModelSet.spliterator(), false)
                .map(QualifiedModel::getModel)
                .map(Resource::getURI).map(Object::toString).collect(Collectors.toList()),
                this::refreshModelSet);
        this.updateListener.startWatchingOfView(this.mainView);
        
    }
    
    @Deactivate
    protected void deactivate() {
    	if (!editableView.isClosed()) {
    		editableView.close();
    	}
        if (!mainView.isClosed()) {
        	mainView.close();
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
        this.updateListener.stopWatchingOfView(this.mainView);
        this.mainView = currentSession.openView(currentSession.getBranchManager().getMainBranch());
        
        AbstractObservableModelSetConfiguration newConfig = calculateModelSetConfiguration();
        this.currentModelSet.getEventDispatcher().notifyModelSetConfigurationUpdatedExternally(this.currentModelSet, newConfig);
        this.currentModelSet.removeAllObserver();
        this.currentModelSet = newConfig;
        
        this.updateListener.startWatchingOfView(this.mainView);
        
        this.getEventDispatcher().notifyChange(this);
    }
    
    private String buildResourcePath(List<String> modelConfig) {
        return buildResourcePath(String.join(".", modelConfig)); 
    }
    
    private String buildResourcePath(String resourceNameParam) {
        return properties.get(CDOMODELADAPTER_BASE_PATH).toString() + '/' + properties.get(resourceNameParam); 
    }
    
    protected AbstractObservableModelSetConfiguration calculateModelSetConfiguration() {
        final ModelSetConfigurationBuilder<AbstractObservableModelSetConfiguration> builder = new ListBasedModelSetConfigurationBuilder();
        properties.keySet().stream().filter(k -> k.startsWith(CDOMODELADAPTER_MODEL_PREFIX))
            .map(s -> s.split("\\.")).map(Arrays::asList).sorted((o1, o2) -> o1.get(1).compareTo(o2.get(1)))
            .forEach(splitKey -> {
                Resource rootElement = this.editableView.getResource(buildResourcePath(splitKey), true);
                LOGGER.info("Updated resource {} ({})", rootElement.getURI().toString(), rootElement.getContents().get(0).eClass().getEPackage().getNsURI());
                builder.appendRootElement(rootElement, splitKey.size() > 2 ? Optional.of(splitKey.get(2)): Optional.empty());
            });
            
        return builder.build();
    }

    @Override
    public void startWritableMode() {
        if (this.editableBranch == null) {
        	this.editableBranch = this.currentSession.getBranchManager().getMainBranch().createBranch(createRandomBranchName());
        	this.editableView = this.currentSession.openTransaction(this.editableBranch);
        	this.currentModelSet = calculateModelSetConfiguration();
        }

        if (this.currentModelSet.isDirty()) {
        	throw new IllegalStateException("The model set is already dirty. Writable mode could not be activated");
        }
        
        lastMergeTimeBranch = getTimestampOfBranch(this.editableView, this.editableBranch.getID());
        lastMergeTimeMain = getTimestampOfBranch(this.mainView, CDOBranch.MAIN_BRANCH_ID);
    }
    
    private static String createRandomBranchName() {
        return String.format("z_cooperate_ea_%s_%s", System.currentTimeMillis(), RandomStringUtils.randomAlphanumeric(2));
    }
    
    private static long getTimestampOfBranch(CDOView cdoView, int branchId) {
        if (cdoView.getBranch().getID() == branchId) {
            CDOView view = cdoView;
            return view.getLastUpdateTime();
        } else {
            CDOView view = cdoView.getSession().openView(branchId);
            try {
                return view.getLastUpdateTime();
            } finally {
                IOUtil.closeSilent(view);
            }
        }
    }

    @Override
    public void commitChanges() {
    	try {
			this.editableView.commit();
		} catch (CommitException e1) {
			e1.printStackTrace();
		}
    	
    	this.currentModelSet.getEventDispatcher().notifyModelSetConfigurationCommitChanges(currentModelSet);
    	
    	CDOTransaction mainTransaction = (this.mainView instanceof CDOTransaction) ? (CDOTransaction) this.mainView:
    		this.currentSession.openTransaction(this.mainView.getBranch());
        
        CDOBranch editorBranch = this.editableBranch;
        CDOBranch mainBranch = editorBranch.getBranchManager().getMainBranch();

        CDOBranchPoint sourceFromRevision = editorBranch.getPoint(lastMergeTimeBranch);
        CDOBranchPoint sourceToRevision = editorBranch.getHead();
        CDOBranchPoint targetFromRevision = mainBranch.getPoint(lastMergeTimeMain);
        
        
        mainTransaction.merge(sourceToRevision, sourceFromRevision, targetFromRevision, new NilFixingCDOMerger());
        mainTransaction.setCommitComment("Merged changes from synchronized adapters");
        
		try {
			mainTransaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		this.currentModelSet = calculateModelSetConfiguration();
        
        lastMergeTimeBranch = getTimestampOfBranch(this.editableView, editorBranch.getID());
        lastMergeTimeMain = getTimestampOfBranch(mainTransaction, mainBranch.getID());
    }

    @Override
    public void discardChanges() {

    }
}
