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
		runTransformation("EAtoUML.qvto", "People/People.xmi", "People/PeopleTransformed.uml");
	}

}
