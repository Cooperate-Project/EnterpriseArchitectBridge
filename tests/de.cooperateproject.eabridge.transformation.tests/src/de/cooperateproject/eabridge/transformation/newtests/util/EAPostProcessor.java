package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

public class EAPostProcessor extends NOPPostProcessor {

	public static IPostProcessor.Descriptor getDescriptor() {
		EAPostProcessor instance = new EAPostProcessor();
		return new BasicPostProcessorDescriptorImpl(instance, Pattern.compile(EaobjectmodelPackage.eNS_URI), null);
	}

//	private static final Collection<Predicate<Diff>> POST_DIFF_REMOVERS = Arrays
//			.asList(EAPostProcessor::isIrrelevantGUIDChange, EAPostProcessor::isIgnoredEStructuralFeature);
//	public static final Collection<EStructuralFeature> IGNORED_FEATURES = new HashSet<>(Arrays.asList(
//			EaobjectmodelPackage.Literals.PACKAGE__BATCH_LOAD, EaobjectmodelPackage.Literals.PACKAGE__BATCH_SAVE,
//			EaobjectmodelPackage.Literals.PACKAGE__CODE_PATH, EaobjectmodelPackage.Literals.PACKAGE__CREATED_DATE,
//			EaobjectmodelPackage.Literals.PACKAGE__FLAGS, EaobjectmodelPackage.Literals.PACKAGE__IS_CONTROLLED,
//			EaobjectmodelPackage.Literals.PACKAGE__IS_NAMESPACE, EaobjectmodelPackage.Literals.PACKAGE__IS_PROTECTED,
//			EaobjectmodelPackage.Literals.PACKAGE__LAST_LOAD_DATE,
//			EaobjectmodelPackage.Literals.PACKAGE__LAST_SAVE_DATE, EaobjectmodelPackage.Literals.PACKAGE__LOG_XML,
//			EaobjectmodelPackage.Literals.PACKAGE__MODIFIED_DATE, EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_GUID,
//			EaobjectmodelPackage.Literals.ELEMENT__CREATED_DATE, EaobjectmodelPackage.Literals.ELEMENT__MODIFIED_DATE,
//			EaobjectmodelPackage.Literals.ELEMENT__AUTHOR, EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_GUID,
//			EaobjectmodelPackage.Literals.ELEMENT__STATUS, EaobjectmodelPackage.Literals.ELEMENT__VERSION,
//			EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__OBJECT_STYLE));

	@Override
	public void postDiff(Comparison comparison, Monitor monitor) {
//		List<Diff> candidates = comparison.getDifferences().stream()
//				.filter(diff -> POST_DIFF_REMOVERS.stream().anyMatch(p -> p.test(diff))).collect(Collectors.toList());
//		candidates.forEach(EcoreUtil::delete);
	}

//	private static boolean isIrrelevantGUIDChange(Diff diff) {
//		if (!(diff instanceof AttributeChange)) {
//			return false;
//		}
//
//		AttributeChange change = (AttributeChange) diff;
//		return change.getAttribute().getName().contains("GUID");
//	}
//
//	private static boolean isIgnoredEStructuralFeature(Diff diff) {
//		return Arrays
//				.asList(Optional.ofNullable(diff).filter(AttributeChange.class::isInstance)
//						.map(AttributeChange.class::cast).map(AttributeChange::getAttribute),
//						Optional.ofNullable(diff).filter(ReferenceChange.class::isInstance)
//								.map(ReferenceChange.class::cast).map(ReferenceChange::getReference))
//				.stream().filter(Optional::isPresent).map(Optional::get).findAny().map(IGNORED_FEATURES::contains)
//				.orElse(false);
//	}
}
