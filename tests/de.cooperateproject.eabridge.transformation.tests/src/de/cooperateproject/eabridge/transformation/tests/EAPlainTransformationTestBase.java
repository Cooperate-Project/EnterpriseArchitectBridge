package de.cooperateproject.eabridge.transformation.tests;

import static de.cooperateproject.modeling.transformation.tests.commons.TestModelsHandling.prettyPrint;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.After;
import org.junit.Before;

public class EAPlainTransformationTestBase extends EATransformationTestBase {
    private ResourceSet expectedResourceSet;
    private final URI transformationUri;
    
    protected EAPlainTransformationTestBase(URI transformationUri, final List<String> sourceFileExtensions,
            final List<String> targetFileExtensions, String resourcePluginId) {
        super(sourceFileExtensions, targetFileExtensions, resourcePluginId);
        this.transformationUri = transformationUri;
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

}
