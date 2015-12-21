/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getFQName <em>FQ Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getPropertyGUID <em>Property GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getPropertyID <em>Property ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaggedValueImpl extends MinimalEObjectImpl.Container implements TaggedValue {
	/**
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final Long ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected Long elementID = ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFQName() <em>FQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQName()
	 * @generated
	 * @ordered
	 */
	protected static final String FQ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFQName() <em>FQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQName()
	 * @generated
	 * @ordered
	 */
	protected String fqName = FQ_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPropertyGUID() <em>Property GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyGUID() <em>Property GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGUID()
	 * @generated
	 * @ordered
	 */
	protected String propertyGUID = PROPERTY_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyID() <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROPERTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyID() <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyID()
	 * @generated
	 * @ordered
	 */
	protected Long propertyID = PROPERTY_ID_EDEFAULT;

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
	protected TaggedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.TAGGED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(Long newElementID) {
		Long oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFQName() {
		return fqName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFQName(String newFQName) {
		String oldFQName = fqName;
		fqName = newFQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__FQ_NAME, oldFQName, fqName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyGUID() {
		return propertyGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyGUID(String newPropertyGUID) {
		String oldPropertyGUID = propertyGUID;
		propertyGUID = newPropertyGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__PROPERTY_GUID, oldPropertyGUID, propertyGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPropertyID() {
		return propertyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyID(Long newPropertyID) {
		Long oldPropertyID = propertyID;
		propertyID = newPropertyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__PROPERTY_ID, oldPropertyID, propertyID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TAGGED_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.TAGGED_VALUE__ELEMENT_ID:
				return getElementID();
			case XcorePackage.TAGGED_VALUE__FQ_NAME:
				return getFQName();
			case XcorePackage.TAGGED_VALUE__NAME:
				return getName();
			case XcorePackage.TAGGED_VALUE__NOTES:
				return getNotes();
			case XcorePackage.TAGGED_VALUE__PROPERTY_GUID:
				return getPropertyGUID();
			case XcorePackage.TAGGED_VALUE__PROPERTY_ID:
				return getPropertyID();
			case XcorePackage.TAGGED_VALUE__VALUE:
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
			case XcorePackage.TAGGED_VALUE__ELEMENT_ID:
				setElementID((Long)newValue);
				return;
			case XcorePackage.TAGGED_VALUE__FQ_NAME:
				setFQName((String)newValue);
				return;
			case XcorePackage.TAGGED_VALUE__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.TAGGED_VALUE__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.TAGGED_VALUE__PROPERTY_GUID:
				setPropertyGUID((String)newValue);
				return;
			case XcorePackage.TAGGED_VALUE__PROPERTY_ID:
				setPropertyID((Long)newValue);
				return;
			case XcorePackage.TAGGED_VALUE__VALUE:
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
			case XcorePackage.TAGGED_VALUE__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case XcorePackage.TAGGED_VALUE__FQ_NAME:
				setFQName(FQ_NAME_EDEFAULT);
				return;
			case XcorePackage.TAGGED_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.TAGGED_VALUE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.TAGGED_VALUE__PROPERTY_GUID:
				setPropertyGUID(PROPERTY_GUID_EDEFAULT);
				return;
			case XcorePackage.TAGGED_VALUE__PROPERTY_ID:
				setPropertyID(PROPERTY_ID_EDEFAULT);
				return;
			case XcorePackage.TAGGED_VALUE__VALUE:
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
			case XcorePackage.TAGGED_VALUE__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case XcorePackage.TAGGED_VALUE__FQ_NAME:
				return FQ_NAME_EDEFAULT == null ? fqName != null : !FQ_NAME_EDEFAULT.equals(fqName);
			case XcorePackage.TAGGED_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.TAGGED_VALUE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.TAGGED_VALUE__PROPERTY_GUID:
				return PROPERTY_GUID_EDEFAULT == null ? propertyGUID != null : !PROPERTY_GUID_EDEFAULT.equals(propertyGUID);
			case XcorePackage.TAGGED_VALUE__PROPERTY_ID:
				return PROPERTY_ID_EDEFAULT == null ? propertyID != null : !PROPERTY_ID_EDEFAULT.equals(propertyID);
			case XcorePackage.TAGGED_VALUE__VALUE:
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
		result.append(" (ElementID: ");
		result.append(elementID);
		result.append(", FQName: ");
		result.append(fqName);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", PropertyGUID: ");
		result.append(propertyGUID);
		result.append(", PropertyID: ");
		result.append(propertyID);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TaggedValueImpl
