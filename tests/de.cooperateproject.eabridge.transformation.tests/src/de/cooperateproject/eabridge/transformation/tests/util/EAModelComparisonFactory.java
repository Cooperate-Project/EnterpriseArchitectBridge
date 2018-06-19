package de.cooperateproject.eabridge.transformation.tests.util;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine.Factory;
import org.eclipse.emf.compare.match.eobject.CachingDistance;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.WeightProvider.Descriptor.Registry;
import org.eclipse.emf.compare.match.eobject.WeightProviderDescriptorRegistryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactoryImpl;

public class EAModelComparisonFactory extends ModelComparisonFactoryImpl{

    @Override
    public IDiffEngine createEMFCompareDiffEngine(IDiffProcessor processor) {
        CombiningFeatureFilter featureFilter = new CombiningFeatureFilter();
        featureFilter.addFilter(new NotationFeatureFilter());
        featureFilter.addFilter(new EAFeatureFilter());
        return new CustomizableDefaultDiffEngine(processor, featureFilter);
    }

    @Override
    public void registerPostProcessors(IPostProcessor.Descriptor.Registry<String> registry) {
        registry.put(UMLPostProcessor.class.getName(), UMLPostProcessor.getDescriptor());
        registry.put(NotationPostProcessor.class.getName(), NotationPostProcessor.getDescriptor());
        registry.put(EAPostProcessor.class.getName(), EAPostProcessor.getDescriptor());
    }

    @Override
    public Factory createMatchEngineFactory() {
        Collection<IWeightProvider> weightProviders = new HashSet<>();
        weightProviders.add(new PapyrusWeightProvider());
        weightProviders.add(new EAWeightProvider());
        
        Registry weightProviderRegistry = WeightProviderDescriptorRegistryImpl.createStandaloneInstance();
        weightProviderRegistry.put(CombiningWeightProvider.class.getName(), CombiningWeightProvider.getDescriptorDatatypes(weightProviders));
        weightProviderRegistry.put(CombiningWeightProvider.class.getName() + "2", CombiningWeightProvider.getDescriptor(PapyrusWeightProvider.PAPYRUS_PATTERN, weightProviders));
        weightProviderRegistry.put(CombiningWeightProvider.class.getName() + "3", CombiningWeightProvider.getDescriptor(EAWeightProvider.EA_PATTERN, weightProviders));
        
        final IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
                new DefaultEqualityHelperFactory());
        final EditionDistance editionDistance = new EditionDistance(weightProviderRegistry);
        try {
            Field uriDistanceField = EditionDistance.class.getDeclaredField("uriDistance");
            uriDistanceField.setAccessible(true);
            uriDistanceField.set(editionDistance, new EmptySegmentSupportingURIDistance());         
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        final CachingDistance cachedDistance = new CachingDistance(editionDistance);
        final IEObjectMatcher matcher = new ProximityEObjectMatcher(cachedDistance);
        MatchEngineFactoryImpl matchEngineFactoryImpl = new MatchEngineFactoryImpl(matcher, comparisonFactory);
        matchEngineFactoryImpl.setRanking(20);
        return matchEngineFactoryImpl;
    }

    @Override
    public Collection<EClass> createIgnoredEClasses() {
        return Collections.emptyList();
    }

    @Override
    public Collection<EAttribute> createIgnoredEAttributes() {
        return Collections.emptyList();
    }

}
