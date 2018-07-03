package de.cooperateproject.eabridge.transformation.executor.impl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.services.ModelSetConfiguration;
import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationContextProviderRegistry;
import de.cooperateproject.eabridge.services.TransformationFactory;
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationCharacteristic;
import de.cooperateproject.eabridge.services.types.GeneralizedTransformationType;
import de.cooperateproject.eabridge.services.types.ModelSetSpecification;
import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;

@Component
public class PapyrusToEATransformationFactory implements TransformationFactory {
    protected static final Logger LOGGER = LoggerFactory.getLogger(PapyrusToEATransformationFactory.class);
    protected static final ModelSetSpecification OUT_SPEC = new ModelSetSpecification(
            ModelSetSpecification.createQMN(EaobjectmodelPackage.eINSTANCE.getNsURI()));
    
    protected static final ModelSetSpecification IN_SPEC = new ModelSetSpecification(
            ModelSetSpecification.createQMN(UMLPackage.eINSTANCE.getNsURI()),
            ModelSetSpecification.createQMN(NotationPackage.eINSTANCE.getNsURI()));
    
    @Reference (cardinality=ReferenceCardinality.MANDATORY)
    protected IQVTOResourceProvider qvtoResourceProvider;
    
    @Reference (cardinality=ReferenceCardinality.MANDATORY)
    protected IQVTOTransformationExecutorProvider qvtoTransformationProvider;
    
    @Reference (cardinality=ReferenceCardinality.MANDATORY)
    protected TransformationContextProviderRegistry transformationContextProvider;
    //protected TransformationUnitURIResolver resolver;
    
    @Override
    public Transformation create(ModelSetConfiguration inputModelSet, ModelSetConfiguration targetModelSet) {
        Transformation result = null;
        URL transformationUrl = FileLocator.find(Activator.getInstance().getBundle(), Path.fromOSString("transforms/UMLtoEA.qvto"), null);
        try {
            URI transformationUri = URI.createURI(transformationUrl.toURI().toString());
            result = new PapyrusToEATransformation(
                qvtoResourceProvider.getQVTOResource(transformationUri), 
                qvtoTransformationProvider.getTransformationExecutor(transformationUri), 
                transformationContextProvider,
                inputModelSet, targetModelSet);
        } catch (IOException | URISyntaxException ex) {
            LOGGER.error("Error during resolving of QVTO transformation artifact", ex);
        }
        return result;
    }
    
    private final static Set<GeneralizedTransformationCharacteristic> SUPPORTED_CHARACTERISTIC = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    new GeneralizedTransformationCharacteristic(IN_SPEC, OUT_SPEC, GeneralizedTransformationType.REGULAR)
                    )));
    @Override
    public Collection<GeneralizedTransformationCharacteristic> getSupportedTransformationCharacteristics() {
        return SUPPORTED_CHARACTERISTIC;
    }

}
