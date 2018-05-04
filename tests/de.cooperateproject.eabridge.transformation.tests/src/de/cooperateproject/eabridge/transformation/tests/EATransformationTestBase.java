package de.cooperateproject.eabridge.transformation.tests;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.After;
import org.junit.Before;
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
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;

public abstract class EATransformationTestBase extends PlainTransformationTestBase {
	private ResourceSet expectedResourceSet;
	
    protected final URI transformationUri;
    protected final List<String> sourceFileExtensions;
    protected final List<String> targetFileExtensions;
    protected final String resourcePluginId;

    protected EATransformationTestBase(final URI transformationUri, final List<String> sourceFileExtensions,
            final List<String> targetFileExtensions, final String resourcePluginId) {
                this.transformationUri = transformationUri;
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


	@Before
	public void setup() {
		super.setup();
		expectedResourceSet = new ResourceSetImpl();
	}

	@After
	public void teardown() {
	    expectedResourceSet.getResources().forEach(Resource::unload);
	}
	
	protected ResourceSet getExpectedResourceSet() {
		return expectedResourceSet;
	}
		
	protected void testTransformationRegular(String modelName) throws IOException {
	    this.testTransformationRegular(modelName, d -> {});
	}
	
    protected void testTransformationRegular(String modelName, Consumer<Comparison> diffModifier) throws IOException {
	    List<URI> sourceModelURIs = sourceFileExtensions.stream().map(ext ->
            createResourceModelURI(resourcePluginId, modelName + "/model." + ext)).collect(Collectors.toList());
        List<URI> targetModelURIs = targetFileExtensions.stream().map(ext ->
            createResourceModelURI(resourcePluginId, modelName + "/model.output." + ext)).collect(Collectors.toList()); 

        runTransformation(transformationUri, sourceModelURIs, targetModelURIs);

        List<URI> expectedModelURIs = targetFileExtensions.stream().map(ext ->
            createResourceModelURI(resourcePluginId, modelName + "/model." + ext)).collect(Collectors.toList());
        
        List<Resource> expectedResources = expectedModelURIs.stream().map(uri -> getExpectedResourceSet().getResource(uri, true))
                .collect(Collectors.toList());
        List<Resource> actualResources = targetModelURIs.stream().map(uri -> getResourceSet().getResource(uri, false))
                .collect(Collectors.toList());

        List<Resource> resourcesToRemove = getResourceSet().getResources().stream()
                .filter(r -> !(actualResources.contains(r))).collect(Collectors.toList());
        getResourceSet().getResources().removeAll(resourcesToRemove);

        EcoreUtil.resolveAll(getResourceSet());
        EcoreUtil.resolveAll(getExpectedResourceSet());
        
        
        debugSerialize(actualResources.stream().flatMap(r -> r.getContents().stream()).collect(Collectors.toList()), 
                expectedResources.stream().flatMap(r -> r.getContents().stream()).collect(Collectors.toList()));

        Comparison comparison = compareModelsIgnoringIdentifiers(getResourceSet(), getExpectedResourceSet());
        diffModifier.accept(comparison);
        assertThat(prettyPrint(comparison), comparison.getDifferences(), is(empty()));
    }
    
    protected void testTransformationIncremental(String modelName) throws IOException {
        List<URI> sourceModelURIs = sourceFileExtensions.stream().map(ext ->
            createResourceModelURI(resourcePluginId, modelName + "/model." + ext)).collect(Collectors.toList());
        List<URI> targetModelURIs = targetFileExtensions.stream().map(ext ->
            createResourceModelURI(resourcePluginId, modelName + "/model.output." + ext)).collect(Collectors.toList());
        
        Trace trace = new Trace(Collections.emptyList());
    
        runTransformation(transformationUri, sourceModelURIs, targetModelURIs, trace);
    
        List<Resource> actualResources = targetModelURIs.stream().map(uri -> getResourceSet().getResource(uri, false))
                .collect(Collectors.toList());
        Resource traceResource = getResourceSet().createResource(createResourceModelURI(resourcePluginId,  modelName + "/model.output.qvtotrace"));
        traceResource.getContents().addAll(trace.getTraceContent());
        
        Map<URI, String> serializedResources = actualResources.stream().map(r -> new AbstractMap.SimpleEntry<URI, String>(r.getURI(), serialize(r, false)))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        serializedResources.put(traceResource.getURI(), serialize(traceResource, false));
        
        for(Map.Entry<URI, String> entry: serializedResources.entrySet()) {
            if (debugSerializationDir != null) {
                FileUtils.write(new File(debugSerializationDir, String.format("%s.%s", entry.getKey().trimFileExtension().lastSegment(), entry.getKey().fileExtension())),
                        entry.getValue());
            }
            Resource res = getResourceSet().createResource(entry.getKey());
            load(res, entry.getValue());
        }
        
        trace = new Trace(getResourceSet().getResource(createResourceModelURI(resourcePluginId,  modelName + "/model.output.qvtotrace"), false).getContents());
        
        final Map<URI, List<EObject>> references = new HashMap<>();
        targetModelURIs.stream().map(uri -> getResourceSet().getResource(uri, false)).forEach
            (r -> references.put(r.getURI(), r.getContents().stream().map(EcoreUtil::copy).collect(Collectors.toList())));
        
        runTransformation(transformationUri, sourceModelURIs, targetModelURIs, trace);
        
        targetModelURIs.forEach(uri -> {
            // compare transformation output
            Iterator<EObject> actualIterator = getResourceSet().getResource(uri, false).getContents().iterator();
            Iterator<EObject> referenceIterator = references.get(uri).iterator();
            while (actualIterator.hasNext() && referenceIterator.hasNext()) {
                DefaultComparisonScope scope = new DefaultComparisonScope(actualIterator.next(), referenceIterator.next(), null);
                Comparison comparison = EMFCompare.builder().build().compare(scope);
                assertThat(prettyPrint(comparison), comparison.getDifferences(), is(empty()));
            }
            assertTrue("Root elements differ.", !(actualIterator.hasNext() || referenceIterator.hasNext()));
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
		
    protected List<ModelExtent> runTransformation(URI transformationURI, List<URI> sourceModelURIs, List<URI> targetModelURIs)
            throws IOException {
        return runTransformation(transformationURI, sourceModelURIs, targetModelURIs,
                new Trace(Collections.emptyList()));
    }

    protected List<ModelExtent> runTransformation(URI transformationURI, List<URI> sourceModelURIs, List<URI> targetModelURIs,
            Trace traceModel) throws IOException {

        List<ModelExtent> sourceModelExtents = sourceModelURIs.stream().map(uri ->
                createModelExtent(createResource(getResourceSet(), uri))).collect(Collectors.toList());
        List<ModelExtent> targetModelExtents = targetModelURIs.stream().map(uri ->
            createModelExtent(createResource(getResourceSet(), uri))).collect(Collectors.toList());
        List<ModelExtent> parameterExtents = new ArrayList<>(sourceModelExtents.size() + targetModelExtents.size());
        parameterExtents.addAll(sourceModelExtents);
        parameterExtents.addAll(targetModelExtents);
        runTransformation(transformationURI, addAuxiliaryModels(parameterExtents), traceModel);
        
        for (Iterator<?> extentIter = targetModelExtents.iterator(), uriIter = targetModelURIs.iterator(); extentIter.hasNext(); ) {
            getResourceSet().getResource((URI) uriIter.next(), false).getContents().addAll(((ModelExtent)extentIter.next()).getContents());
        }
        
        return targetModelExtents;
    }
    
    protected List<ModelExtent> addAuxiliaryModels(List<ModelExtent> parameters) {
        return parameters;
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
