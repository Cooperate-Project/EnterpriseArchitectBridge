/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

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
	 * The cached value of the '{@link #getTagGUID() <em>Tag GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagGUID()
	 * @generated
	 * @ordered
	 */
	protected String tagGUID = TAG_GUID_EDEFAULT;

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
	 * The cached value of the '{@link #getTagID() <em>Tag ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagID()
	 * @generated
	 * @ordered
	 */
	protected Long tagID = TAG_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	public Attribute getAttribute() {
		if (eContainerFeatureID() != EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE) return null;
		return (Attribute)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		if (eContainerFeatureID() != EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE) return null;
		return (Attribute)eInternalContainer();
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
		if (newAttribute != eInternalContainer() || (eContainerFeatureID() != EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE && newAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES, Attribute.class, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE, newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_TAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagGUID() {
		return tagGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagGUID(String newTagGUID) {
		String oldTagGUID = tagGUID;
		tagGUID = newTagGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID, oldTagGUID, tagGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTagID() {
		return tagID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagID(Long newTagID) {
		Long oldTagID = tagID;
		tagID = newTagID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID, oldTagID, tagID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE, oldValue, value));
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
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaobjectmodelPackage.ATTRIBUTE_TAG__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_GUID:
				return TAG_GUID_EDEFAULT == null ? tagGUID != null : !TAG_GUID_EDEFAULT.equals(tagGUID);
			case EaobjectmodelPackage.ATTRIBUTE_TAG__TAG_ID:
				return TAG_ID_EDEFAULT == null ? tagID != null : !TAG_ID_EDEFAULT.equals(tagID);
			case EaobjectmodelPackage.ATTRIBUTE_TAG__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", TagGUID: ");
		result.append(tagGUID);
		result.append(", TagID: ");
		result.append(tagID);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AttributeTagImpl
