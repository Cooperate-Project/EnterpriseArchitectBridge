package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
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
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;
import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;
import de.cooperateproject.qvtoutils.blackbox.CooperateLibrary;

@SuppressWarnings("restriction")
public abstract class QVTOTransformationBase implements Transformation {

    private static final Logger LOGGER = LoggerFactory.getLogger(QVTOTransformationBase.class);
    protected final TransformationExecutor executor;
    protected final TransformationContextProvider contextProvider;
    protected final ModelSetConfiguration inputModels;
    protected final ModelSetConfiguration targetModels;
    protected final QVTOResource transformationResource;

    public QVTOTransformationBase(QVTOResource transformationResource, TransformationExecutor exec, TransformationContextProvider contextProvider,
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
    public IStatus transform() {
        return diagnosticToIStatus(execute(contextProvider.getTransformationContext(this)));
    }

    protected ExecutionDiagnostic execute(ExecutionContext executionContext) {
        ModelExtent[] modelParametersToUse = createModelExtents();
        executionContext.getSessionData().setValue(CooperateLibrary.ADD_FEATURE_REQUESTS, new IdentityHashMap<>());
        ExecutionDiagnostic result = executor.execute(executionContext, modelParametersToUse);
        Map<Collection<Object>, List<Object>> recordedOrderingData = executionContext.getSessionData()
                .getValue(CooperateLibrary.ADD_FEATURE_REQUESTS);
        processRecordedOrderingData(recordedOrderingData);
        return result;
    }

    protected abstract ModelExtent[] createModelExtents();

    protected void processRecordedOrderingData(Map<Collection<Object>, List<Object>> recordedOrderingData) {
        for (Entry<Collection<Object>, List<Object>> entry : recordedOrderingData.entrySet()) {
            if (entry.getKey() instanceof EList) {
                processRecordedOrderingData((EList<Object>) entry.getKey(), entry.getValue());
            }
        }
    }

    protected void processRecordedOrderingData(EList<Object> collection, List<Object> ordering) {
        if (collection.size() < ordering.size()) {
            LOGGER.error(
                    "The reordering of entries cannot take place because the sizes of the collections do not match: {} < {}",
                    collection.size(), ordering.size());
        }
        for (int targetIndex = 0; targetIndex < ordering.size(); ++targetIndex) {
            Object elementToMove = ordering.get(targetIndex);
            int sourceIndex = collection.indexOf(elementToMove);
            if (targetIndex == sourceIndex) {
                continue;
            }
            collection.move(targetIndex, sourceIndex);
        }
    }

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
