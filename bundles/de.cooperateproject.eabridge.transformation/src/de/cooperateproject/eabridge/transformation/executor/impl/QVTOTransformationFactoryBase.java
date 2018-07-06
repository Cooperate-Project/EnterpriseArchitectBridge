package de.cooperateproject.eabridge.transformation.executor.impl;

import java.util.Collection;

import org.osgi.service.component.annotations.Reference;

import de.cooperateproject.eabridge.services.ModelAdapter;
import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationFactory;
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;
import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;

public class QVTOTransformationFactoryBase implements TransformationFactory {

    @Reference
    protected IQVTOResourceProvider qvtoResourceProvider;
    
    @Reference
    protected IQVTOTransformationExecutorProvider qvtoTransformationProvider;
    
    @Override
    public Collection<GeneralizedTransformationCharacteristic> getSupportedTransformationCharacteristics() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Transformation create(ModelAdapter inputAdapter, ModelAdapter targetAdapter) {
        // TODO Auto-generated method stub
        return null;
    }

}
