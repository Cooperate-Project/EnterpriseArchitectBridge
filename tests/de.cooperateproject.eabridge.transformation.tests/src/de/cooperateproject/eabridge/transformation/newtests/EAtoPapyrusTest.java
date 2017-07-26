package de.cooperateproject.eabridge.transformation.newtests;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.WeightProvider.Descriptor.Registry;
import org.eclipse.emf.compare.match.eobject.WeightProviderDescriptorRegistryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.cooperateproject.eabridge.transformation.executor.ITransformationExecutor;
import de.cooperateproject.eabridge.transformation.executor.impl.EAtoPapyrusTransformationExecutor;
import de.cooperateproject.eabridge.transformation.newtests.util.CustomizableDefaultDiffEngine;
import de.cooperateproject.eabridge.transformation.newtests.util.NotationFeatureFilter;
import de.cooperateproject.eabridge.transformation.newtests.util.NotationPostProcessor;
import de.cooperateproject.eabridge.transformation.newtests.util.PapyrusWeightProvider;
import de.cooperateproject.eabridge.transformation.newtests.util.TransformationTestBase;
import de.cooperateproject.eabridge.transformation.newtests.util.UMLPostProcessor;

public class EAtoPapyrusTest extends TransformationTestBase {

	private static final URI VIRTUAL_BASE_URI = URI.createFileURI(FileUtils.getTempDirectory().getAbsolutePath());
	private ITransformationExecutor subject = new EAtoPapyrusTransformationExecutor();
	private ResourceSet actualResourceSet;

	@Before
	public void setup() {
		super.setup();
		actualResourceSet = new ResourceSetImpl();
	}

	@After
	public void teardown() {
		actualResourceSet.getResources().forEach(Resource::unload);
	}

	@Test
	public void testAdvancedAssociation() throws IOException {
		URI inputURI = TransformationTestBase
				.createLocalPlatformURI("model/AdvancedAssociation/AdvancedAssociation.xmi");
		Resource inputResource = getResourceSet().getResource(inputURI, true);

		ModelExtent[] modelParameters = new ModelExtent[3];
		modelParameters[0] = new BasicModelExtent(inputResource.getContents());
		modelParameters[1] = new BasicModelExtent();
		modelParameters[2] = new BasicModelExtent();

		ExecutionDiagnostic transformationResult = subject.execute(Optional.empty(), modelParameters);
		assertThat(transformationResult.getSeverity(), is(equalTo(Diagnostic.OK)));

		URI notationURI = TransformationTestBase
				.createLocalPlatformURI("model/AdvancedAssociation/AdvancedAssociation.notation");
		Resource expectedNotationResource = getResourceSet().getResource(notationURI, true);
		Resource actualNotationResource = assignToActualResource(expectedNotationResource, modelParameters[2]);

		URI umlURI = TransformationTestBase.createLocalPlatformURI("model/AdvancedAssociation/AdvancedAssociation.uml");
		Resource expectedUMLResource = getResourceSet().getResource(umlURI, true);
		Resource actualUMLResource = assignToActualResource(expectedUMLResource, modelParameters[1]);

		Collection<Resource> resourcesToCheck = Arrays.asList(expectedNotationResource, expectedUMLResource);
		List<Resource> resourcesToRemove = getResourceSet().getResources().stream()
				.filter(r -> !resourcesToCheck.contains(r)).collect(Collectors.toList());
		getResourceSet().getResources().removeAll(resourcesToRemove);

		EcoreUtil.resolveAll(getResourceSet());
		EcoreUtil.resolveAll(actualResourceSet);

//		print(expectedUMLResource);
//		print(actualUMLResource);
//		print(expectedNotationResource);
//		print(actualNotationResource);

		Comparison comparison = compareModels(actualResourceSet, getResourceSet());
		assertThat(getDiff(comparison), comparison.getDifferences(), is(empty()));

	}

	private Resource assignToActualResource(Resource expected, ModelExtent actual) {
		URI resourceURI = VIRTUAL_BASE_URI.appendSegment("actual").appendSegment(expected.getURI().lastSegment());
		Resource r = actualResourceSet.createResource(resourceURI);
		r.getContents().addAll(actual.getContents());
		return r;
	}

	private static Comparison compareModels(Notifier actual, Notifier expected) {
		Registry weightProviderRegistry = WeightProviderDescriptorRegistryImpl.createStandaloneInstance();
		weightProviderRegistry.put(PapyrusWeightProvider.class.getName(), PapyrusWeightProvider.getDescriptorDatatypes());
		weightProviderRegistry.put(PapyrusWeightProvider.class.getName(), PapyrusWeightProvider.getDescriptorPapyrus());
		
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER, weightProviderRegistry);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);

		IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = null;
		if (isPluginEnvironment()) {
			postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
		} else {
			postProcessorRegistry = new PostProcessorDescriptorRegistryImpl<String>();
		}
		postProcessorRegistry.put(UMLPostProcessor.class.getName(), UMLPostProcessor.getDescriptor());
		postProcessorRegistry.put(NotationPostProcessor.class.getName(), NotationPostProcessor.getDescriptor());

		IDiffEngine diffEngine = new CustomizableDefaultDiffEngine(new NotationFeatureFilter());

		DefaultComparisonScope scope = new DefaultComparisonScope(actual, expected, null);
		return EMFCompare.builder().setDiffEngine(diffEngine).setMatchEngineFactoryRegistry(matchEngineRegistry)
				.setPostProcessorRegistry(postProcessorRegistry).build().compare(scope);
	}

	@SuppressWarnings("deprecation")
	private static void print(Resource r) throws IOException {
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

	private static String getDiff(Comparison comparison) throws IOException {
		try (OutputStream os = new ByteArrayOutputStream()) {
			try (PrintStream ps = new PrintStream(os)) {
				EMFComparePrettyPrinter.printDifferences(comparison, ps);
				return os.toString();
			}
		}
	}

}
