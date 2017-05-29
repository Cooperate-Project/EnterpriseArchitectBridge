/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl#getTagGUID <em>Tag GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl#getTagID <em>Tag ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTagImpl extends MinimalEObjectImpl.Container implements AttributeTag {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
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
	 * The default value of the '{@link #getTagGUID() <em>Tag GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_GUID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTagID() <em>Tag ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagID()
	 * @generated
	 * @ordered
	 */
	protected static final Long TAG_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.ATTRIBUTE_TAG;
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
	public Attribute getAttribute() {
		return (Attribute)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__ATTRIBUTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return (Attribute)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__ATTRIBUTE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAttribute, EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__NAME, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_TAG__NAME, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagGUID() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__TAG_GUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagGUID(String newTagGUID) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__TAG_GUID, newTagGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTagID() {
		return (Long)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__TAG_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagID(Long newTagID) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__TAG_ID, newTagID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE, EaobjectmodelPackage.Literals.ATTRIBUTE_TAG__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
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
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
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
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES, Attribute.class, msgs);
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
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NAME:
				return getName();
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES:
				return getNotes();
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID:
				return getTagGUID();
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID:
				return getTagID();
			case EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE:
				return getValue();
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
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NAME:
				setName((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES:
				setNotes((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID:
				setTagGUID((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID:
				setTagID((Long)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE:
				setValue((String)newValue);
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
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID:
				setTagGUID(TAG_GUID_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID:
				setTagID(TAG_ID_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE:
				return basicGetAttribute() != null;
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID:
				return TAG_GUID_EDEFAULT == null ? getTagGUID() != null : !TAG_GUID_EDEFAULT.equals(getTagGUID());
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID:
				return TAG_ID_EDEFAULT == null ? getTagID() != null : !TAG_ID_EDEFAULT.equals(getTagID());
			case EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

} //AttributeTagImpl
