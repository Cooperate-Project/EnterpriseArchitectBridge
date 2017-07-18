/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getElementOfAttribute <em>Element Of Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getAttName <em>Att Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeConstraintImpl extends MinimalEObjectImpl.Container implements AttributeConstraint {
	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT_NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT;
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
	public Element getElementOfAttribute() {
		return (Element)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElementOfAttribute() {
		return (Element)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementOfAttribute(Element newElementOfAttribute) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, newElementOfAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		return (Attribute)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return (Attribute)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAttribute, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttName() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ATT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttName(String newAttName) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__ATT_NAME, newAttName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE, EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAttribute((Attribute)otherEnd, msgs);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS, Attribute.class, msgs);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				if (resolve) return getElementOfAttribute();
				return basicGetElementOfAttribute();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				return getConstraint();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				return getAttName();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				return getNotes();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				return getType();
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				setElementOfAttribute((Element)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				setAttName((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				setNotes((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				setType((String)newValue);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				setElementOfAttribute((Element)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				setAttName(ATT_NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				return basicGetElementOfAttribute() != null;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				return basicGetAttribute() != null;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				return ATT_NAME_EDEFAULT == null ? getAttName() != null : !ATT_NAME_EDEFAULT.equals(getAttName());
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //AttributeConstraintImpl
