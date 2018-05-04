package de.cooperateproject.eabridge.transformation.tests.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class UMLPostProcessor extends NOPPostProcessor {

    public static IPostProcessor.Descriptor getDescriptor() {
    	UMLPostProcessor instance = new UMLPostProcessor();
        return new BasicPostProcessorDescriptorImpl(instance,
                Pattern.compile("http://www.eclipse.org/uml2/[0-9.]+/UML"), null);
    }
	
	@Override
	public void postDiff(Comparison comparison, Monitor monitor) {
		removePapyrusAnnotationDiffs(comparison);
	}

	private void removePapyrusAnnotationDiffs(Comparison comparison) {
		Collection<ReferenceChange> papyrusAnnotationDiffs = comparison.getDifferences().stream()
				.filter(ReferenceChange.class::isInstance).map(ReferenceChange.class::cast)
				.filter(c -> DifferenceKind.DELETE == c.getKind()).filter(UMLPostProcessor::isPapyrusAnnotation)
				.collect(Collectors.toList());
		Collection<Diff> diffsToRemoveReally = new HashSet<>(papyrusAnnotationDiffs);
		for (ReferenceChange diffToRemove : papyrusAnnotationDiffs) {
			EObject diffValue = diffToRemove.getValue();
			Match match = comparison.getMatch(diffValue);
			diffsToRemoveReally.addAll(match.getDifferences());
			for (TreeIterator<EObject> childIter = diffToRemove.getValue().eAllContents(); childIter.hasNext();) {
				diffsToRemoveReally.addAll(comparison.getDifferences(childIter.next()));
			}
		}
		diffsToRemoveReally.forEach(EcoreUtil::delete);
	}

	private static boolean isPapyrusAnnotation(ReferenceChange rc) {
		return Optional.of(rc.getValue()).filter(EAnnotation.class::isInstance)
				.map(EAnnotation.class::cast)
				.map(annotation -> "org.eclipse.papyrus".equals(annotation.getSource())).orElse(false);
	}

}
