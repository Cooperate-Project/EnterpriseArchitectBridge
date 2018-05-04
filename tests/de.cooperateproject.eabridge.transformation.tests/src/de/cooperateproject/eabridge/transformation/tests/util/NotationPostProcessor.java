package de.cooperateproject.eabridge.transformation.tests.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.NotationPackage;

public class NotationPostProcessor extends NOPPostProcessor {

	public static IPostProcessor.Descriptor getDescriptor() {
		NotationPostProcessor instance = new NotationPostProcessor();
		return new BasicPostProcessorDescriptorImpl(instance,
				Pattern.compile("http://www.eclipse.org/gmf/runtime/[0-9.]+/notation"), null);
	}

	private static final Collection<Predicate<Diff>> POST_DIFF_REMOVERS = Arrays.asList(NotationPostProcessor::isIrrelevantLocationChange);
	
	@Override
	public void postDiff(Comparison comparison, Monitor monitor) {
		List<Diff> candidates = comparison.getDifferences().stream()
				.filter(diff -> POST_DIFF_REMOVERS.stream().anyMatch(p -> p.test(diff))).collect(Collectors.toList());
		candidates.forEach(EcoreUtil::delete);
	}

	private static boolean isIrrelevantLocationChange(Diff diff) {
		if (!(diff instanceof AttributeChange)) {
			return false;
		}
		AttributeChange change = (AttributeChange)diff;
		
		if (change.getAttribute().getEContainingClass() != NotationPackage.Literals.LOCATION) {
			return false;
		}

		EObject leftLocation = change.getMatch().getLeft();
		EObject rightLocation = change.getMatch().getRight();
		
		return Arrays.asList(leftLocation, rightLocation).stream().map(EObject::eClass).allMatch(NotationPackage.Literals.LOCATION::equals);
	}

}
