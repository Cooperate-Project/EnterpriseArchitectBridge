package de.cooperateproject.eabridge.transformation.tests.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

public class EAFeatureFilter implements IFeatureFilter {

	public static final Collection<EStructuralFeature> IGNORED_FEATURES = new HashSet<>(Arrays.asList(
			EaobjectmodelPackage.Literals.CONNECTOR__ACTION_FLAGS,
			EaobjectmodelPackage.Literals.CONNECTOR__BTM_END_LABEL,
			EaobjectmodelPackage.Literals.CONNECTOR__BTM_MID_LABEL,
			EaobjectmodelPackage.Literals.CONNECTOR__BTM_START_LABEL,
			EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_GUID,
			EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_ID,
			EaobjectmodelPackage.Literals.CONNECTOR__DEST_CHANGEABLE,
			EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONSTRAINT,
			EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONTAINMENT,
			EaobjectmodelPackage.Literals.CONNECTOR__DEST_STYLE,
			EaobjectmodelPackage.Literals.CONNECTOR__DEST_TS,
			EaobjectmodelPackage.Literals.CONNECTOR__DISPATCH_ACTION,
			EaobjectmodelPackage.Literals.CONNECTOR__END_EDGE,
			EaobjectmodelPackage.Literals.CONNECTOR__EVENT_FLAGS,
			EaobjectmodelPackage.Literals.CONNECTOR__HEAD_STYLE,
			EaobjectmodelPackage.Literals.CONNECTOR__IS_LEAF,
			EaobjectmodelPackage.Literals.CONNECTOR__IS_ROOT,
			EaobjectmodelPackage.Literals.CONNECTOR__IS_SPEC,
			EaobjectmodelPackage.Literals.CONNECTOR__LINE_STYLE,
			EaobjectmodelPackage.Literals.CONNECTOR__NOTES,
			EaobjectmodelPackage.Literals.CONNECTOR__PDATA5,
			EaobjectmodelPackage.Literals.CONNECTOR__PT_END_X,
			EaobjectmodelPackage.Literals.CONNECTOR__PT_END_Y,
			EaobjectmodelPackage.Literals.CONNECTOR__PT_START_X,
			EaobjectmodelPackage.Literals.CONNECTOR__PT_START_Y,
			EaobjectmodelPackage.Literals.CONNECTOR__ROUTE_STYLE,
			EaobjectmodelPackage.Literals.CONNECTOR__SEQ_NO,
			EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CHANGEABLE,
			EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONTAINMENT,
			EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STYLE,
			EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_TS,
			EaobjectmodelPackage.Literals.CONNECTOR__START_EDGE,
			EaobjectmodelPackage.Literals.CONNECTOR__STATE_FLAGS,
			EaobjectmodelPackage.Literals.CONNECTOR__STYLE_EX,
			EaobjectmodelPackage.Literals.CONNECTOR__SUB_TYPE,
			EaobjectmodelPackage.Literals.CONNECTOR__VIRTUAL_INHERITANCE,
			EaobjectmodelPackage.Literals.DIAGRAM__AUTHOR,
			EaobjectmodelPackage.Literals.DIAGRAM__CREATED_DATE,
			EaobjectmodelPackage.Literals.DIAGRAM__MODIFIED_DATE,
			EaobjectmodelPackage.Literals.DIAGRAM__CX,
			EaobjectmodelPackage.Literals.DIAGRAM__CY,
			EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_GUID,
			EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_ID,
			EaobjectmodelPackage.Literals.DIAGRAM__SCALE,
			EaobjectmodelPackage.Literals.DIAGRAM__STYLE_EX,
			EaobjectmodelPackage.Literals.DIAGRAM__SWIMLANES,
			EaobjectmodelPackage.Literals.DIAGRAM__VERSION,
			EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__INSTANCE_ID,
			EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__OBJECT_STYLE,
			EaobjectmodelPackage.Literals.DIAGRAM_LINK__INSTANCE_ID,
			EaobjectmodelPackage.Literals.DIAGRAM_LINK__HIDDEN,
			EaobjectmodelPackage.Literals.DIAGRAM_LINK__STYLE,
			EaobjectmodelPackage.Literals.DIAGRAM_LINK__GEOMETRY, //TODO we should not ignore this completely
			EaobjectmodelPackage.Literals.ELEMENT__ACTION_FLAGS,
			EaobjectmodelPackage.Literals.ELEMENT__AUTHOR,
			EaobjectmodelPackage.Literals.ELEMENT__BACKCOLOR,
			EaobjectmodelPackage.Literals.ELEMENT__BORDERCOLOR,
			EaobjectmodelPackage.Literals.ELEMENT__BORDER_STYLE,
			EaobjectmodelPackage.Literals.ELEMENT__BORDER_WIDTH,
			EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER_GUID,
			EaobjectmodelPackage.Literals.ELEMENT__COMPLEXITY,
			EaobjectmodelPackage.Literals.ELEMENT__CONCURRENCY,
			EaobjectmodelPackage.Literals.ELEMENT__CREATED_DATE,
			EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_GUID,
			EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_ID,
			EaobjectmodelPackage.Literals.ELEMENT__EVENT_FLAGS,
			EaobjectmodelPackage.Literals.ELEMENT__FONTCOLOR,
			EaobjectmodelPackage.Literals.ELEMENT__GEN_FILE,
			EaobjectmodelPackage.Literals.ELEMENT__GENLINKS,
			EaobjectmodelPackage.Literals.ELEMENT__GEN_TYPE,
			EaobjectmodelPackage.Literals.ELEMENT__IS_ACTIVE,
			EaobjectmodelPackage.Literals.ELEMENT__IS_LEAF,
			EaobjectmodelPackage.Literals.ELEMENT__IS_SPEC,
			EaobjectmodelPackage.Literals.ELEMENT__MODIFIED_DATE,
			EaobjectmodelPackage.Literals.ELEMENT__PERSISTENCE,
			EaobjectmodelPackage.Literals.ELEMENT__PHASE,
			EaobjectmodelPackage.Literals.ELEMENT__RUN_STATE,
			EaobjectmodelPackage.Literals.ELEMENT__STATUS,
			EaobjectmodelPackage.Literals.ELEMENT__STYLE,
			EaobjectmodelPackage.Literals.ELEMENT__STYLE_EX,
			EaobjectmodelPackage.Literals.ELEMENT__VERSION,
			EaobjectmodelPackage.Literals.PACKAGE__BATCH_LOAD,
			EaobjectmodelPackage.Literals.PACKAGE__BATCH_SAVE,
			EaobjectmodelPackage.Literals.PACKAGE__CODE_PATH,
			EaobjectmodelPackage.Literals.PACKAGE__CREATED_DATE,
			EaobjectmodelPackage.Literals.PACKAGE__FLAGS,
			EaobjectmodelPackage.Literals.PACKAGE__IS_CONTROLLED,
			EaobjectmodelPackage.Literals.PACKAGE__IS_NAMESPACE,
			EaobjectmodelPackage.Literals.PACKAGE__IS_PROTECTED,
			EaobjectmodelPackage.Literals.PACKAGE__LAST_LOAD_DATE,
			EaobjectmodelPackage.Literals.PACKAGE__LAST_SAVE_DATE,
			EaobjectmodelPackage.Literals.PACKAGE__LOG_XML,
			EaobjectmodelPackage.Literals.PACKAGE__MODIFIED_DATE,
			EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_GUID,
			EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_ID,
			EaobjectmodelPackage.Literals.PACKAGE__UML_VERSION,
			EaobjectmodelPackage.Literals.PACKAGE__USE_DTD,
			EaobjectmodelPackage.Literals.PACKAGE__VERSION,
			EaobjectmodelPackage.Literals.PACKAGE__XML_PATH
			));
	
	public static final Collection<EStructuralFeature> IGNORE_ORDERING = new HashSet<>(Arrays.asList(
			EaobjectmodelPackage.Literals.PACKAGE__ELEMENTS
			));
	

	@Override
	public boolean isIgnoredReference(Match match, EReference reference) {
		return IGNORED_FEATURES.contains(reference);
	}

	@Override
	public boolean isIgnoredAttribute(EAttribute attribute) {
		return IGNORED_FEATURES.contains(attribute);
	}

	@Override
	public Optional<Boolean> checkForOrderingChanges(EStructuralFeature feature) {
		return IGNORE_ORDERING.contains(feature) ? Optional.of(false) : Optional.empty();
	}

}
