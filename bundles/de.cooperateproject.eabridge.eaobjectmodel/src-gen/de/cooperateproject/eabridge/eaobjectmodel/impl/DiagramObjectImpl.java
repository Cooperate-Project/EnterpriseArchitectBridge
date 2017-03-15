/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getObjectStyle <em>Object Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl#getTop <em>Top</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramObjectImpl extends MinimalEObjectImpl.Container implements DiagramObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.DIAGRAM_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBottom() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__BOTTOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(int newBottom) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__BOTTOM, newBottom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return (Diagram)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return (Element)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getInstanceID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__INSTANCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(Long newInstanceID) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__INSTANCE_ID, newInstanceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeft() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(int newLeft) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRight() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(int newRight) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSequence() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__SEQUENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Long newSequence) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__SEQUENCE, newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__OBJECT_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectStyle(String newObjectStyle) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__OBJECT_STYLE, newObjectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTop() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__TOP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(int newTop) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__TOP, newTop);
	}

} //DiagramObjectImpl
