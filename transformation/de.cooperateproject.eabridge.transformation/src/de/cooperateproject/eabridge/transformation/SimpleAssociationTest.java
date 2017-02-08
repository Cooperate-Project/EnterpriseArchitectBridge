package de.cooperateproject.eabridge.transformation;


import org.junit.Test;

public class SimpleAssociationTest extends TransformationTestBase {

	@Test
	public void test() throws Exception {
		runTransformation("EAtoUML.qvto", "SimpleAssociation/SimpleAssociation.xmi", "SimpleAssociation/SimpleAssociationTransformed.uml");
	}

}
