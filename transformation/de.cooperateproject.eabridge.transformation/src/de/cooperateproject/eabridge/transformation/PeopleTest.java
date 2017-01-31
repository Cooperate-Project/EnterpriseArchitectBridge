package de.cooperateproject.eabridge.transformation;


import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Test;

public class PeopleTest extends TransformationTestBase {

	@Test
	public void test() throws Exception {
		ModelExtent xmi = new BasicModelExtent(getResourceSet().getResource(createResourceModelURI("People/People.xmi"), true).getContents());
		ModelExtent primitives = new BasicModelExtent(getResourceSet().getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents());
		ModelExtent uml = new BasicModelExtent(getResourceSet().getResource(createResourceModelURI("People/PeopleTransformed.uml"), true).getContents());
		runTransformation(createTransformationURI("EAtoUML.qvto"), Arrays.asList(xmi, primitives, uml), new Trace(Collections.emptyList()));
	}

}
