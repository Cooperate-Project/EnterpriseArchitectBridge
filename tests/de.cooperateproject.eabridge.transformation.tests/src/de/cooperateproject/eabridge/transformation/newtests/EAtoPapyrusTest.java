package de.cooperateproject.eabridge.transformation.newtests;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.transformation.executor.impl.EAtoPapyrusTransformationExecutor;
import de.cooperateproject.eabridge.transformation.newtests.util.PlaintTransformationTestBase;
import de.cooperateproject.eabridge.transformation.newtests.util.TransformationTestBase;

public class EAtoPapyrusTest extends PlaintTransformationTestBase {
	
	public EAtoPapyrusTest() {
		super(new EAtoPapyrusTransformationExecutor());
	}

	@Test
	public void testAdvancedAssociation() throws IOException {
		testTransformationRegular("AdvancedAssociation");
	}
	
	@Test
	public void testAdvancedAssociationIncremental() throws IOException {
		testTransformationIncremental("AdvancedAssociation");
	}
	
	@Test
	public void testNested() throws IOException {
		testTransformationRegular("Nested");
	}
	
	@Test
	public void testNestedIncremental() throws IOException {
		testTransformationIncremental("Nested");
	}

	protected void testTransformationRegular(String modelName) throws IOException {
		testTransformationRegular(modelName, false);
	}
	
	protected void testTransformationRegular(String modelName, boolean debugOutput) throws IOException {
		URI inputURI = TransformationTestBase
				.createLocalPlatformURI(String.format("model/%s/model.eaom", modelName));
		Resource inputResource = getResourceSet().getResource(inputURI, true);
		List<Package> relevantPackages = inputResource.getContents().stream().filter(Package.class::isInstance)
				.map(Package.class::cast).map(Package::getPackages).flatMap(Collection::stream)
				.collect(Collectors.toList());
		assertThat(relevantPackages, hasSize(1));

		ModelExtent[] modelParameters = new ModelExtent[3];
		modelParameters[0] = new BasicModelExtent(relevantPackages);
		modelParameters[1] = new BasicModelExtent();
		modelParameters[2] = new BasicModelExtent();

		ExecutionDiagnostic transformationResult = getSubject().execute(Optional.empty(), modelParameters);
		assertThat(transformationResult.getSeverity(), is(equalTo(Diagnostic.OK)));

		URI notationURI = TransformationTestBase
				.createLocalPlatformURI(String.format("model/%s/model.notation", modelName));
		Resource expectedNotationResource = getResourceSet().getResource(notationURI, true);
		Resource actualNotationResource = assignToActualResource(expectedNotationResource, modelParameters[2]);

		URI umlURI = TransformationTestBase.createLocalPlatformURI(String.format("model/%s/model.uml", modelName));
		Resource expectedUMLResource = getResourceSet().getResource(umlURI, true);
		Resource actualUMLResource = assignToActualResource(expectedUMLResource, modelParameters[1]);

		Collection<Resource> resourcesToCheck = Arrays.asList(expectedNotationResource, expectedUMLResource);
		List<Resource> resourcesToRemove = getResourceSet().getResources().stream()
				.filter(r -> !resourcesToCheck.contains(r)).collect(Collectors.toList());
		getResourceSet().getResources().removeAll(resourcesToRemove);

		EcoreUtil.resolveAll(getResourceSet());
		EcoreUtil.resolveAll(getActualResourceSet());

		if (debugOutput) {
			printDebug(expectedUMLResource, false);
			printDebug(actualUMLResource, false);
			printDebug(expectedNotationResource, true);
			printDebug(actualNotationResource, true);			
		}

		Comparison comparison = compareModelsIgnoringIdentifiers(getActualResourceSet(), getResourceSet());
		assertThat(getReadableDiff(comparison), comparison.getDifferences(), is(empty()));
	}
	
	public void testTransformationIncremental(String modelName) throws IOException {
		// load test model
		Resource eaResource = getResourceSet().getResource(URI.createURI(String.format("model/%s/model.eaom", modelName)), true);
		
		// create transformation parameters
		ModelExtent modelParameterEa = new BasicModelExtent(eaResource.getContents());
		ModelExtent modelParameterUml = new BasicModelExtent();
		ModelExtent modelParameterNotation = new BasicModelExtent();
		ModelExtent[] modelParameters = new ModelExtent[] {modelParameterEa, modelParameterUml, modelParameterNotation};
		Trace trace = new Trace(Collections.emptyList());
		
		// transform EA model to UML and Notation
		ExecutionDiagnostic result = getSubject().execute(Optional.of(trace), modelParameters);
		assertThat(result.getSeverity(), is(equalTo(Diagnostic.OK)));
		
		// assign transformation results to resources
		File currentDir = new File(VIRTUAL_BASE_DIR, "current");
		Resource notationResource = getResourceSet().createResource(createFileURI(currentDir, "diag", "notation"));
		notationResource.getContents().addAll(modelParameterNotation.getContents());
		Resource umlResource = getResourceSet().createResource(createFileURI(currentDir, "diag", "uml"));
		umlResource.getContents().addAll(modelParameterUml.getContents());
		Resource traceResource = getResourceSet().createResource(createFileURI(currentDir, "diag", "qvtotrace"));
		traceResource.getContents().addAll(trace.getTraceContent());
		
		// remember old states
		ResourceSet oldRs = new ResourceSetImpl();
		File oldDir = new File(VIRTUAL_BASE_DIR, "old");
		String oldNotationXMI = serialize(notationResource);
		String oldUMLXMI = serialize(umlResource);
		Resource oldNotationResource = oldRs.createResource(createFileURI(oldDir, "diag", "notation"));
		Resource oldUMLResource = oldRs.createResource(createFileURI(oldDir, "diag", "uml"));
		load(oldNotationResource, oldNotationXMI);
		load(oldUMLResource, oldUMLXMI);

		// transform EA model to UML and Notation
		result = getSubject().execute(Optional.of(trace), modelParameters);
		assertThat(result.getSeverity(), is(equalTo(Diagnostic.OK)));
		
		// get new transformation output
		notationResource.getContents().clear();
		notationResource.getContents().addAll(modelParameterNotation.getContents());
		umlResource.getContents().clear();
		umlResource.getContents().addAll(modelParameterUml.getContents());

		// prepare comparison of transformation output
		Collection<String> relevantFileNames = Arrays.asList(notationResource, umlResource).stream().map(Resource::getURI).map(URI::lastSegment).collect(Collectors.toSet());
		Collection<Resource> resourcesToRemove = getResourceSet().getResources().stream().filter(r -> !relevantFileNames.contains(r.getURI().lastSegment())).collect(Collectors.toSet());
		getResourceSet().getResources().removeAll(resourcesToRemove);
		EcoreUtil.resolveAll(getResourceSet());
		EcoreUtil.resolveAll(oldRs);
		
		// compare transformation output
        DefaultComparisonScope scope = new DefaultComparisonScope(getResourceSet(), oldRs, null);
        Comparison comparison = EMFCompare.builder().build().compare(scope);
        assertThat(getReadableDiff(comparison), comparison.getDifferences(), is(empty()));
	}

}
