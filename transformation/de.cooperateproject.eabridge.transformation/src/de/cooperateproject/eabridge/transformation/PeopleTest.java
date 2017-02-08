package de.cooperateproject.eabridge.transformation;


import org.junit.Test;

public class PeopleTest extends TransformationTestBase {

	@Test
	public void test() throws Exception {
		runTransformation("EAtoUML.qvto", "People/People.xmi", "People/PeopleTransformed.uml");
	}

}
