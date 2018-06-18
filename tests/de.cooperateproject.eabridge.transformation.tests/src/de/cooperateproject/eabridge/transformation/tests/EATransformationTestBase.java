package de.cooperateproject.eabridge.transformation.tests;

import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.CachingDistance;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.WeightProvider.Descriptor.Registry;
import org.eclipse.emf.compare.match.eobject.WeightProviderDescriptorRegistryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.eabridge.transformation.tests.util.CombiningFeatureFilter;
import de.cooperateproject.eabridge.transformation.tests.util.CombiningWeightProvider;
import de.cooperateproject.eabridge.transformation.tests.util.CustomizableDefaultDiffEngine;
import de.cooperateproject.eabridge.transformation.tests.util.EAFeatureFilter;
import de.cooperateproject.eabridge.transformation.tests.util.EAPostProcessor;
import de.cooperateproject.eabridge.transformation.tests.util.EAWeightProvider;
import de.cooperateproject.eabridge.transformation.tests.util.EmptySegmentSupportingURIDistance;
import de.cooperateproject.eabridge.transformation.tests.util.IWeightProvider;
import de.cooperateproject.eabridge.transformation.tests.util.NotationFeatureFilter;
import de.cooperateproject.eabridge.transformation.tests.util.NotationPostProcessor;
import de.cooperateproject.eabridge.transformation.tests.util.PapyrusWeightProvider;
import de.cooperateproject.eabridge.transformation.tests.util.UMLPostProcessor;
import de.cooperateproject.modeling.transformation.tests.commons.PlainTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.QVTOTransformationRunning;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;

public abstract class EATransformationTestBase extends PlainTransformationTestBase implements QVTOTransformationRunning {
	
    protected final String resourcePluginId;
    protected final List<String> sourceFileExtensions;
    protected final List<String> targetFileExtensions;

    protected EATransformationTestBase(final List<String> sourceFileExtensions,
            final List<String> targetFileExtensions, final String resourcePluginId) {
                this.sourceFileExtensions = sourceFileExtensions;
                this.targetFileExtensions = targetFileExtensions;
                this.resourcePluginId = resourcePluginId;   
    }
    
    @BeforeClass
    public static void initialize() throws Exception { 
        EaobjectmodelPackage.eINSTANCE.eClass();
        TransformationTestBase.initialize(delegate -> {
            delegate.registerPlatformUris(Activator.PLUGIN_ID, Activator.class);
            delegate.registerPlatformUris(TestEnvironmentConstants.TEST_PLUGIN_ID, TestEnvironmentConstants.class);
            delegate.registerQVTOResolutionURIs(createPlatformURI(Activator.PLUGIN_ID).appendSegment("transforms"));
            TransformationTestBase.initEnvironment(delegate);
        });
    }
	
	protected static Comparison compareModelsIgnoringIdentifiers(Notifier actual, Notifier expected) {
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
		new MatchEngineFactoryImpl(matcher, comparisonFactory);
		
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);  

		IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = null;
		if (isPluginEnvironment()) {
			postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
		} else {
			postProcessorRegistry = new PostProcessorDescriptorRegistryImpl<>();
		}
		postProcessorRegistry.put(UMLPostProcessor.class.getName(), UMLPostProcessor.getDescriptor());
		postProcessorRegistry.put(NotationPostProcessor.class.getName(), NotationPostProcessor.getDescriptor());
		postProcessorRegistry.put(EAPostProcessor.class.getName(), EAPostProcessor.getDescriptor());

		CombiningFeatureFilter featureFilter = new CombiningFeatureFilter();
		featureFilter.addFilter(new NotationFeatureFilter());
		featureFilter.addFilter(new EAFeatureFilter());
		IDiffEngine diffEngine = new CustomizableDefaultDiffEngine(featureFilter);

		DefaultComparisonScope scope = new DefaultComparisonScope(actual, expected, null);
		return EMFCompare.builder().setDiffEngine(diffEngine).setMatchEngineFactoryRegistry(matchEngineRegistry)
				.setPostProcessorRegistry(postProcessorRegistry).build().compare(scope);
	}
		
    protected static void load(Resource r, String xmi) {
		try (InputStream bais = new ByteArrayInputStream(xmi.getBytes())) {
			r.load(bais, Collections.emptyMap());
		} catch (IOException e) {
            e.printStackTrace();
            fail(e.toString());
        }
	}    
}
