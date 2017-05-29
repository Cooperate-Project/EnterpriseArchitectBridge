/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final int BOTTOM_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final Long INSTANCE_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEQUENCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getObjectStyle() <em>Object Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_STYLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_EDEFAULT = 0;

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
		return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__BOTTOM, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__BOTTOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(int newBottom) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__BOTTOM, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__BOTTOM, newBottom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return (Diagram)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__DIAGRAM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		return (Diagram)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__DIAGRAM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return (Element)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return (Element)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getInstanceID() {
		return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__INSTANCE_ID, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__INSTANCE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(Long newInstanceID) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__INSTANCE_ID, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__INSTANCE_ID, newInstanceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeft() {
		return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__LEFT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(int newLeft) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__LEFT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRight() {
		return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__RIGHT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(int newRight) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__RIGHT, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSequence() {
		return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__SEQUENCE, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__SEQUENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Long newSequence) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__SEQUENCE, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__SEQUENCE, newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectStyle() {
		return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__OBJECT_STYLE, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__OBJECT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectStyle(String newObjectStyle) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__OBJECT_STYLE, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__OBJECT_STYLE, newObjectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTop() {
		return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM_OBJECT__TOP, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__TOP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(int newTop) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_OBJECT__TOP, EaobjectmodelPackage.Literals.DIAGRAM_OBJECT__TOP, newTop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((Diagram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				return basicSetDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS, Diagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__BOTTOM:
				return getBottom();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__INSTANCE_ID:
				return getInstanceID();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__LEFT:
				return getLeft();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__RIGHT:
				return getRight();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__SEQUENCE:
				return getSequence();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__OBJECT_STYLE:
				return getObjectStyle();
			case EaobjectmodelPackage.DIAGRAM_OBJECT__TOP:
				return getTop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__BOTTOM:
				setBottom((Integer)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT:
				setElement((Element)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__INSTANCE_ID:
				setInstanceID((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__LEFT:
				setLeft((Integer)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__RIGHT:
				setRight((Integer)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__SEQUENCE:
				setSequence((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__OBJECT_STYLE:
				setObjectStyle((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__TOP:
				setTop((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT:
				setElement((Element)null);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__OBJECT_STYLE:
				setObjectStyle(OBJECT_STYLE_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__TOP:
				setTop(TOP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_OBJECT__BOTTOM:
				return getBottom() != BOTTOM_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM:
				return basicGetDiagram() != null;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__ELEMENT:
				return basicGetElement() != null;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? getInstanceID() != null : !INSTANCE_ID_EDEFAULT.equals(getInstanceID());
			case EaobjectmodelPackage.DIAGRAM_OBJECT__LEFT:
				return getLeft() != LEFT_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__RIGHT:
				return getRight() != RIGHT_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_OBJECT__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? getSequence() != null : !SEQUENCE_EDEFAULT.equals(getSequence());
			case EaobjectmodelPackage.DIAGRAM_OBJECT__OBJECT_STYLE:
				return OBJECT_STYLE_EDEFAULT == null ? getObjectStyle() != null : !OBJECT_STYLE_EDEFAULT.equals(getObjectStyle());
			case EaobjectmodelPackage.DIAGRAM_OBJECT__TOP:
				return getTop() != TOP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DiagramObjectImpl
