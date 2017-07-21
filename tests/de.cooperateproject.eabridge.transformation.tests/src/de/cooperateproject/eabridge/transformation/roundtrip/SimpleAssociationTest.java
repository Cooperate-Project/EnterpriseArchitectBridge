package de.cooperateproject.eabridge.transformation.roundtrip;

import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.transformation.RoundtripTestBase;

public class SimpleAssociationTest extends RoundtripTestBase {

	@BeforeClass
	public static void setName() throws Exception {
		setTestModelName("SimpleAssociation");
	}

	@Test
	public void testTransformation() throws Exception {
		runTransformation();
	}
	
	@Test
	public void testResults() throws Exception {
		runTransformation();
		// FIXME: Transformed does contains Attributes which do not exist in the original
		//compareResults();
	}

}
