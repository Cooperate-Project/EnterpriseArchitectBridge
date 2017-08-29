package de.cooperateproject.eabridge.transformation.newtests;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.transformation.executor.impl.PapyrusToEATransformationExecutor;
import de.cooperateproject.eabridge.transformation.newtests.util.PlaintTransformationTestBase;
import de.cooperateproject.eabridge.transformation.newtests.util.TransformationTestBase;

public class PapyrusToEATest extends PlaintTransformationTestBase {

	public PapyrusToEATest() {
		super(new PapyrusToEATransformationExecutor());
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
		testTransformationRegular("Nested",
				diff -> diff.getDifferences().stream().filter(AttributeChange.class::isInstance)
						.map(AttributeChange.class::cast)
						.filter(d -> d.getAttribute() == EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__SEQUENCE)
						.forEach(EcoreUtil::delete),
				true);
	}
	
	@Test
	public void testNestedIncremental() throws IOException {
		testTransformationIncremental("Nested");
	}
	
	protected void testTransformationRegular(String modelName) throws IOException {
		testTransformationRegular(modelName, false);
	}
	
	protected void testTransformationRegular(String modelName, boolean debugOutput) throws IOException {
		testTransformationRegular(modelName, comparison -> {}, debugOutput);
	}
	
	protected void testTransformationRegular(String modelName, Consumer<Comparison> diffModifier) throws IOException {
		testTransformationRegular(modelName, diffModifier, false);
	}
	
	protected void testTransformationRegular(String modelName, Consumer<Comparison> diffModifier, boolean debugOutput) throws IOException {
		URI umlURI = TransformationTestBase
				.createLocalPlatformURI(String.format("model/%s/model.uml", modelName));
		Resource umlResource = getResourceSet().getResource(umlURI, true);
		Resource notationResource = getResourceSet().getResource(umlURI.trimFileExtension().appendFileExtension("notation"), true);

		ModelExtent[] modelParameters = new ModelExtent[3];
		modelParameters[0] = new BasicModelExtent(umlResource.getContents());
		modelParameters[1] = new BasicModelExtent(notationResource.getContents());
		modelParameters[2] = new BasicModelExtent();

		ExecutionDiagnostic transformationResult = getSubject().execute(Optional.empty(), modelParameters);
		assertThat(transformationResult.getSeverity(), is(equalTo(Diagnostic.OK)));

		URI eaURI = umlURI.trimFileExtension().appendFileExtension("eaom");
		Resource expectedEAResource = getResourceSet().getResource(eaURI, true);
		
		// create output resource
		Package actualRoot = EcoreUtil.copy((de.cooperateproject.eabridge.eaobjectmodel.Package)expectedEAResource.getContents().get(0));
		actualRoot.getPackages().clear();
		actualRoot.getElements().clear();
		actualRoot.getDiagrams().clear();
		List<EObject> actualResults = modelParameters[2].getContents();
		assertThat(actualResults, hasSize(2));
		actualResults.stream().filter(Package.class::isInstance).map(Package.class::cast).forEach(actualRoot.getPackages()::add);
		actualResults.stream().filter(Element.class::isInstance).map(Element.class::cast).forEach(actualRoot.getElements()::add);
		Resource actualEAResource = assignToActualResource(expectedEAResource, new BasicModelExtent(Arrays.asList(actualRoot)));

		Collection<Resource> resourcesToCheck = Arrays.asList(expectedEAResource);
		List<Resource> resourcesToRemove = getResourceSet().getResources().stream()
				.filter(r -> !resourcesToCheck.contains(r)).collect(Collectors.toList());
		getResourceSet().getResources().removeAll(resourcesToRemove);

		EcoreUtil.resolveAll(getResourceSet());
		EcoreUtil.resolveAll(getActualResourceSet());

		if (debugOutput) {
			printDebug(expectedEAResource, false);
			printDebug(actualEAResource, false);	
		}

		Comparison comparison = compareModelsIgnoringIdentifiers(getActualResourceSet(), getResourceSet());
		diffModifier.accept(comparison);
		assertThat(getReadableDiff(comparison), comparison.getDifferences(), is(empty()));
	}
	
	protected void testTransformationIncremental(String modelName) throws IOException {
		URI umlURI = TransformationTestBase
				.createLocalPlatformURI(String.format("model/%s/model.uml", modelName));
		Resource umlResource = getResourceSet().getResource(umlURI, true);
		Resource notationResource = getResourceSet().getResource(umlURI.trimFileExtension().appendFileExtension("notation"), true);
		
		// create transformation parameters
		ModelExtent modelParameterUml = new BasicModelExtent(umlResource.getContents());
		ModelExtent modelParameterNotation = new BasicModelExtent(notationResource.getContents());
		ModelExtent modelParameterEa = new BasicModelExtent();
		ModelExtent[] modelParameters = new ModelExtent[] {modelParameterUml, modelParameterNotation, modelParameterEa};
		Trace trace = new Trace(Collections.emptyList());
		
		// transform EA model to UML and Notation
		ExecutionDiagnostic result = getSubject().execute(Optional.of(trace), modelParameters);
		assertThat(result.getSeverity(), is(equalTo(Diagnostic.OK)));
		
		// assign transformation results to resources
		File currentDir = new File(VIRTUAL_BASE_DIR, "current");
		Resource eaResource = getResourceSet().createResource(createFileURI(currentDir, "diag", "eaom"));
		eaResource.getContents().addAll(modelParameterEa.getContents());
		Resource traceResource = getResourceSet().createResource(createFileURI(currentDir, "diag", "qvtotrace"));
		traceResource.getContents().addAll(trace.getTraceContent());
		
		// remember old states
		ResourceSet oldRs = new ResourceSetImpl();
		File oldDir = new File(VIRTUAL_BASE_DIR, "old");
		String oldEaXMI = serialize(eaResource);
		Resource oldEaResource = oldRs.createResource(createFileURI(oldDir, "diag", "eaom"));
		load(oldEaResource, oldEaXMI);

		// transform EA model to UML and Notation
		result = getSubject().execute(Optional.of(trace), modelParameters);
		assertThat(result.getSeverity(), is(equalTo(Diagnostic.OK)));
		
		// get new transformation output
		eaResource.getContents().clear();
		eaResource.getContents().addAll(modelParameterEa.getContents());

		// prepare comparison of transformation output
		Collection<String> relevantFileNames = Arrays.asList(eaResource).stream().map(Resource::getURI).map(URI::lastSegment).collect(Collectors.toSet());
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
