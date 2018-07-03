package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationContextProvider;
import de.cooperateproject.eabridge.services.TransformationContextProviderRegistry;
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;
import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

@SuppressWarnings("restriction")
public abstract class QVTOTransformationBase implements Transformation {

    private static final Logger LOGGER = LoggerFactory.getLogger(QVTOTransformationBase.class);
    protected final TransformationExecutor executor;
    protected final TransformationContextProviderRegistry contextProvider;
    protected final ModelSetConfiguration inputModels;
    protected final ModelSetConfiguration targetModels;
    protected final QVTOResource transformationResource;

    public QVTOTransformationBase(QVTOResource transformationResource, TransformationExecutor exec, TransformationContextProviderRegistry contextProvider,
            ModelSetConfiguration inputModels, ModelSetConfiguration targetModels) {
        this.transformationResource = transformationResource;
        this.inputModels = inputModels;
        this.targetModels = targetModels;
        this.executor = exec;
        this.contextProvider = contextProvider;
    }
    
    @Override
    public ModelSetConfiguration getInputModels() {        
        return this.inputModels;
    }
    
    @Override
    public ModelSetConfiguration getTargetModels() {
        return targetModels;
    }
    
    @Override
    public String getName() {
    	return transformationResource.getURI().lastSegment();
    }

    @Override
    public IStatus transform() {
    	Optional<TransformationContextProvider> compatibleProvider = contextProvider.getCompatibleProvider(this);
    	TransformationContextProvider provider = compatibleProvider.orElseThrow(() -> new IllegalStateException("No compatible context provider registered"));
    	ExecutionContext executionContext = provider.getTransformationContext(this);
    	
    	ModelExtent[] modelParametersToUse = createModelExtents();
    	
    	IStatus result = diagnosticToIStatus(execute(executionContext, modelParametersToUse));
    	
    	storeResultsFromModelExtents(modelParametersToUse);
    	
    	provider.postProcessTransformationContext(executionContext, this);
    	
    	return result;
    }

	protected abstract void storeResultsFromModelExtents(ModelExtent[] modelParametersToUse);

	protected ExecutionDiagnostic execute(ExecutionContext executionContext, ModelExtent[] modelParametersToUse) {
		
        ExecutionDiagnostic result = executor.execute(executionContext, modelParametersToUse);
        
        
        return result;
	}

    protected abstract ModelExtent[] createModelExtents();


    protected void validateTransformationParameters(ModelExtent[] extents) {
        OperationalTransformation t = this.transformationResource.getFirstTransformation();
        Validate.notNull(t);
        Validate.isTrue(extents.length == t.getModelParameter().size());
        for (int i = 0; i < extents.length; i++) {
            ModelParameter mp = t.getModelParameter().get(i);
            //Validate.isTrue(extents[i].getContents().size() == 1, "The extent should only contain one element");
            EObject e = extents[i].getContents().get(0);
            
            
//            Validate.isTrue(mp.getEType().getEPackage().getNsURI().equals(extents[i].getContents().get(0).eClass().getEPackage().getNsURI()),
//                    "The parameter %s should be of package %s but is %s", mp.getName(), mp.getEType().getEPackage().getNsURI(),
//                    e.eClass().getEPackage().getNsURI());
        }
    }

    protected static ModelExtent createModelExtent(EObject object) {
        return new BasicModelExtent(Collections.singletonList(object));
    }
    
    protected static ModelExtent createModelExtent(List<EObject> objects) {
        return new BasicModelExtent(objects);
    }

    protected static IStatus diagnosticToIStatus(ExecutionDiagnostic diag) {
        // Code of Diagnostic and IStatus appears to be compatible
        if (diag.getCode() == IStatus.OK) {
            return new Status(diag.getCode(), Activator.PLUGIN_ID, "");
        } else {
            return new Status(diag.getCode(), Activator.PLUGIN_ID, diag.getMessage());
        }
    }
    
    @Override
    public GeneralizedTransformationCharacteristic getTransformationCharacteristic() {
        ModelSetSpecification inspec = new ModelSetSpecification(
                this.getSourceModelParameters().stream().map(p -> p.getType().getEPackage().getNsURI())
                .map(ModelSetSpecification::createQMN).collect(Collectors.toList()));
        ModelSetSpecification outspec = new ModelSetSpecification(
                this.getTargetModelParameters().stream().map(p -> p.getType().getEPackage().getNsURI())
                .map(ModelSetSpecification::createQMN).collect(Collectors.toList()));
        
        return new GeneralizedTransformationCharacteristic(inspec, outspec);
    }
    
    protected List<ModelParameter> getSourceModelParameters() {
        return this.transformationResource.getFirstTransformation().getModelParameter()
            .stream().filter(p -> p.getKind() == DirectionKind.IN).collect(Collectors.toList());
    }
    
    protected List<ModelParameter> getTargetModelParameters() {
        return this.transformationResource.getFirstTransformation().getModelParameter()
            .stream().filter(p -> p.getKind() == DirectionKind.INOUT || p.getKind() == DirectionKind.OUT).collect(Collectors.toList());
    }
}
