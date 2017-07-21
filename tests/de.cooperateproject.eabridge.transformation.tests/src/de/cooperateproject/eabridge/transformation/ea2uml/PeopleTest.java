package de.cooperateproject.eabridge.transformation.ea2uml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.eabridge.tests.common.util.TestResource;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

@SuppressWarnings("restriction")
public class PeopleTest extends TransformationTestBase {

	private static String transformationPath = "EAtoUML.qvto";
	private static String testName = "People";
	private static TestResource changelog = TestResource.PeopleChangelog;

	@BeforeClass
	public static void initXMI() throws Exception {
		generateXMI(changelog, makeXMIPath(testName));
	}

	@Test
	public void testTransformation() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName) , makeNotationTransformedPath(testName));
	}

	private ClassImpl getPersonClass() throws Exception {
		runEAtoUMLTransformation(transformationPath, makeXMIPath(testName), makeUMLTransformedPath(testName) , makeNotationTransformedPath(testName));
		ModelExtent uml = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(makeUMLTransformedPath(testName)), true).getContents());
		List<EObject> content = uml.getContents();

		// Base Model
		Assert.assertEquals(1, content.size());

		ModelImpl model = (ModelImpl) content.get(0);
		PackageImpl people = (PackageImpl) model.getPackagedElements().get(0);

		// Person class
		Assert.assertEquals(1, people.getPackagedElements().size());

		ClassImpl person = (ClassImpl) people.getPackagedElements().get(0);

		return person;
	}

	@Test
	public void testAttributes() throws Exception {
		ClassImpl person = getPersonClass();

		List<Property> attributes = person.getOwnedAttributes();

		// Attributes
		Assert.assertEquals(2, attributes.size());

		for (Property prop : attributes) {
			if (prop.getName().equals("age"))
				Assert.assertEquals("EInt", prop.getType().getName());
			else if (prop.getName().equals("name"))
				Assert.assertEquals("EString", prop.getType().getName());
			else
				Assert.fail();
		}

	}

	@Test
	public void testOperations() throws Exception {
		ClassImpl person = getPersonClass();

		List<Operation> operations = person.getOwnedOperations();

		// Operations
		Assert.assertEquals(3, operations.size());

		for (Operation op : operations) {
			if (op.getName().equals("isAdult")) {
				Parameter returnParam = op.getOwnedParameters().get(0);
				Assert.assertEquals("EBoolean", returnParam.getType().getName());
				Assert.assertEquals(ParameterDirectionKind.RETURN_LITERAL, returnParam.getDirection());
			} else if (op.getName().equals("sayHiTo")) {
				Parameter name = op.getOwnedParameters().get(0);
				Assert.assertEquals("EString", name.getType().getName());
				Assert.assertEquals(ParameterDirectionKind.IN_LITERAL, name.getDirection());
			} else if (op.getName().equals("tellAJoke")) {
				Assert.assertEquals(5, op.getOwnedParameters().size());

				// Check a "real" type
				for (Parameter param : op.getOwnedParameters()) {
					if (param.getName() != null && param.getName().equals("about")) {
						Assert.assertSame(person, param.getType());
					}
				}

			}
		}

	}

}
