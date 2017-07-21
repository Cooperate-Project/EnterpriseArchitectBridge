package de.cooperateproject.eabridge.transformation.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl;
import de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl;
import de.cooperateproject.eabridge.transformation.TransformationTestBase;

/**
 * This utility class provides a easier and faster possibility to lookup
 * generated XMI-Model-files. The sample reflective editor is quite slow.
 * 
 * @author hahner
 *
 */
public class Model2Console extends TransformationTestBase {

	private static final String testFile = "Portable/Portable.xmi";

	private static final Boolean printNullValues = false;

	private static final Boolean useFeatureFilter = false;
	private static final List<String> featuresToPrint = Arrays.asList(new String[] { "Name" });

	// ------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------------

	@Test
	public void printModel() throws Exception {
		ModelExtent xmi = new BasicModelExtent(
				getResourceSet().getResource(createResourceModelURI(testFile), true).getContents());
		List<EObject> models = xmi.getContents();

		printEObjects(models, 0);

	}

	private void printEObjects(List<EObject> eObjects, int layer) {

		for (EObject eObject : eObjects) {

			// Print object itself
			printWithIndent("# " + eObject + eaobjectModelName(eObject), layer);

			// Print all features
			final List<EStructuralFeature> allFeatures = eObject.eClass().getEAllStructuralFeatures();
			for (EStructuralFeature feature : allFeatures) {
				if (!useFeatureFilter || featuresToPrint.size() == 0 || featuresToPrint.contains(feature.getName())) {

					Object valueObject = eObject.eGet(feature);
					String value = "null";
					if (valueObject != null) {
						value = valueObject.toString();
						value += eaobjectModelName(valueObject);
					}
					
					if (printNullValues || valueObject != null)
						printWithIndent("+ " + feature.getName() + ":\t\t" + value, layer + 1);
				}
			}

			// Recursive print all content
			final List<EObject> contents = eObject.eContents();
			printEObjects(contents, layer + 1);
		}

	}

	private void printWithIndent(String content, int layer) {

		String text = "";

		text += getLineNumberText() + " ";

		for (int i = 0; i < layer; i++) {
			text += "|\t";
		}

		text += content;

		System.out.println(text);
	}

	private int lineNumber = 1;

	private String getLineNumberText() {
		return String.format("%04d", lineNumber++);
	}

	private String eaobjectModelName(Object object) {

		String returnValue = "\t[Name: ";

		if (object instanceof PackageImpl) {
			returnValue += ((PackageImpl) object).getName();
		} else if (object instanceof ElementImpl) {
			returnValue += ((ElementImpl) object).getName();
		} else {
			return "";
		}

		return returnValue + "]";

	}

}
