package de.cooperateproject.eabridge.transformation.roundtrip;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.eabridge.transformation.RoundtripTestBase;

@Ignore
public class NestedTest extends RoundtripTestBase {

	@BeforeClass
	public static void setName() throws Exception {
		setTestModelName("Nested");
	}

	@Test
	public void testTransformation() throws Exception {
		runTransformation();
	}

	@Test
	public void testResults() throws Exception {
		runTransformation();
		//compareResults();
	}

}