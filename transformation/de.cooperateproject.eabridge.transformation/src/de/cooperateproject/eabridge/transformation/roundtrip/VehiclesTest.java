package de.cooperateproject.eabridge.transformation.roundtrip;

import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.transformation.RoundtripTestBase;

public class VehiclesTest extends RoundtripTestBase {

	@BeforeClass
	public static void setName() throws Exception {
		setTestModelName("Vehicles");
	}

	@Test
	public void testTransformation() throws Exception {
		runTransformation();

	}

	@Test
	public void testResults() throws Exception {
		runTransformation();
		compareResults();
	}
}
