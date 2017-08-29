package de.cooperateproject.eabridge.transformation.newtests.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.After;
import org.junit.Before;

import com.google.common.collect.Iterables;

import de.cooperateproject.eabridge.transformation.executor.ITransformationExecutor;

public abstract class PlaintTransformationTestBase extends TransformationTestBase {

	protected static final String VIRTUAL_BASE_DIR = FileUtils.getTempDirectory().getAbsolutePath();
	protected static final URI VIRTUAL_BASE_URI = URI.createFileURI(VIRTUAL_BASE_DIR);
	private final ITransformationExecutor subject;
	private ResourceSet actualResourceSet;

	public PlaintTransformationTestBase(ITransformationExecutor subjectInstance) {
		this.subject = subjectInstance;
	}
	
	@Before
	public void setup() {
		super.setup();
		actualResourceSet = new ResourceSetImpl();
	}

	@After
	public void teardown() {
		actualResourceSet.getResources().forEach(Resource::unload);
	}
	
	protected ResourceSet getActualResourceSet() {
		return actualResourceSet;
	}
	
	protected ITransformationExecutor getSubject() {
		return subject;
	}
	
	protected Resource assignToActualResource(Resource expected, ModelExtent actual) {
		URI resourceURI = VIRTUAL_BASE_URI.appendSegment("actual").appendSegment(expected.getURI().lastSegment());
		Resource r = getActualResourceSet().createResource(resourceURI);
		r.getContents().addAll(actual.getContents());
		return r;
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
	
	protected static String getReadableDiff(Comparison comparison) throws IOException {
		try (OutputStream os = new ByteArrayOutputStream()) {
			try (PrintStream ps = new PrintStream(os)) {
				EMFComparePrettyPrinter.printDifferences(comparison, ps);
				return os.toString();
			}
		}
	}
	
	protected static URI createFileURI(File currentDir, String filename, String extension) {
		return URI.createFileURI(new File(currentDir, String.format("%s.%s", filename, extension)).getAbsolutePath());
	}
	
	protected static String serialize(Resource r) throws IOException {
		try (OutputStream baos = new ByteArrayOutputStream()) {
			r.save(baos, Collections.emptyMap());
			return baos.toString();
		}
	}
	
	protected static void load(Resource r, String xmi) throws IOException {
		try (InputStream bais = new ByteArrayInputStream(xmi.getBytes())) {
			r.load(bais, Collections.emptyMap());
		}
	}
	
	protected static void printDebug(Resource r, boolean omitIDs) throws IOException {
		if (omitIDs) {
			printWithoutIds(r);
		} else {
			System.out.println(serialize(r));
		}
	}

	@SuppressWarnings("deprecation")
	private static void printWithoutIds(Resource r) throws IOException {
		XMIResource xmiResource = (XMIResource)r;
		Map<EObject, String> eobjectToIDMap = new HashMap<>(xmiResource.getEObjectToIDMap());
		try {
			xmiResource.getEObjectToIDMap().clear();
			try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
				r.save(baos, Collections.emptyMap());
				System.out.println(baos.toString());
			}			
		} finally {
			xmiResource.getEObjectToIDMap().putAll(eobjectToIDMap);
		}
	}
}
