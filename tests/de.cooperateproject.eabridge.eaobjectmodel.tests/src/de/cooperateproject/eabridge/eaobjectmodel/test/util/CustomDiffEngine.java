package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

public class CustomDiffEngine {

	public static final IDiffProcessor DIFF_PROCESSOR = new DiffBuilder();
	public static final IDiffEngine DIFF_ENGINE = new DefaultDiffEngine(DIFF_PROCESSOR) {
		@Override
		protected FeatureFilter createFeatureFilter() {
			return new FeatureFilter() {
				@Override
				protected boolean isIgnoredAttribute(EAttribute attribute) {
					if ((attribute == EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_ID)
							|| (attribute == EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__TAG_ID)
							|| (attribute == EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_ID)
							|| (attribute == EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_ID)
							|| (attribute == EaobjectmodelPackage.Literals.METHOD__METHOD_ID)
							|| (attribute == EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_ID)
							|| (attribute == EaobjectmodelPackage.Literals.DIAGRAM_LINK__INSTANCE_ID)
							|| (attribute == EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__INSTANCE_ID)
							|| (attribute == EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_ID)
							|| super.isIgnoredAttribute(attribute)) {
						return true;
					} else {
						return false;
					}
				};
			};
		}
	};
}
