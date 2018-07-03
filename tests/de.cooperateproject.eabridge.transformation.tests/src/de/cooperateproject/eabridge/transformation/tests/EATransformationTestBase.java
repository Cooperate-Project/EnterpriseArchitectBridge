package de.cooperateproject.eabridge.transformation.tests;

import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.transformation.Activator;
import de.cooperateproject.eabridge.transformation.tests.util.EAModelComparisonFactory;
import de.cooperateproject.modeling.transformation.tests.commons.PlainTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.QVTOTransformationRunning;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactory;

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
        });
    }
    
    @Override
    protected ModelComparisonFactory getModelComparisonFactory() {
        return new EAModelComparisonFactory();
    }
	
	/*protected static Comparison compareModelsIgnoringIdentifiers(Notifier actual, Notifier expected) {
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
	}*/
		
    protected static void load(Resource r, String xmi) {
		try (InputStream bais = new ByteArrayInputStream(xmi.getBytes())) {
			r.load(bais, Collections.emptyMap());
		} catch (IOException e) {
            e.printStackTrace();
            fail(e.toString());
        }
	}    
}
