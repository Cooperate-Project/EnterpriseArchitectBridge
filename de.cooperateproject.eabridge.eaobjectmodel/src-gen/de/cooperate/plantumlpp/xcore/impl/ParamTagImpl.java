/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.ParamTag;
import de.cooperate.plantumlpp.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.ParamTagImpl#getElementGUID <em>Element GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.ParamTagImpl#getFQName <em>FQ Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.ParamTagImpl#getPropertyGUID <em>Property GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.ParamTagImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.ParamTagImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamTagImpl extends MinimalEObjectImpl.Container implements ParamTag {
	/**
	 * The default value of the '{@link #getElementGUID() <em>Element GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementGUID() <em>Element GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementGUID()
	 * @generated
	 * @ordered
	 */
	protected String elementGUID = ELEMENT_GUID_EDEFAULT;

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
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

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
	protected ParamTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.PARAM_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementGUID() {
		return elementGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementGUID(String newElementGUID) {
		String oldElementGUID = elementGUID;
		elementGUID = newElementGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAM_TAG__ELEMENT_GUID, oldElementGUID, elementGUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAM_TAG__FQ_NAME, oldFQName, fqName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAM_TAG__PROPERTY_GUID, oldPropertyGUID, propertyGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAM_TAG__TAG, oldTag, tag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAM_TAG__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.PARAM_TAG__ELEMENT_GUID:
				return getElementGUID();
			case XcorePackage.PARAM_TAG__FQ_NAME:
				return getFQName();
			case XcorePackage.PARAM_TAG__PROPERTY_GUID:
				return getPropertyGUID();
			case XcorePackage.PARAM_TAG__TAG:
				return getTag();
			case XcorePackage.PARAM_TAG__VALUE:
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
			case XcorePackage.PARAM_TAG__ELEMENT_GUID:
				setElementGUID((String)newValue);
				return;
			case XcorePackage.PARAM_TAG__FQ_NAME:
				setFQName((String)newValue);
				return;
			case XcorePackage.PARAM_TAG__PROPERTY_GUID:
				setPropertyGUID((String)newValue);
				return;
			case XcorePackage.PARAM_TAG__TAG:
				setTag((String)newValue);
				return;
			case XcorePackage.PARAM_TAG__VALUE:
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
			case XcorePackage.PARAM_TAG__ELEMENT_GUID:
				setElementGUID(ELEMENT_GUID_EDEFAULT);
				return;
			case XcorePackage.PARAM_TAG__FQ_NAME:
				setFQName(FQ_NAME_EDEFAULT);
				return;
			case XcorePackage.PARAM_TAG__PROPERTY_GUID:
				setPropertyGUID(PROPERTY_GUID_EDEFAULT);
				return;
			case XcorePackage.PARAM_TAG__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case XcorePackage.PARAM_TAG__VALUE:
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
			case XcorePackage.PARAM_TAG__ELEMENT_GUID:
				return ELEMENT_GUID_EDEFAULT == null ? elementGUID != null : !ELEMENT_GUID_EDEFAULT.equals(elementGUID);
			case XcorePackage.PARAM_TAG__FQ_NAME:
				return FQ_NAME_EDEFAULT == null ? fqName != null : !FQ_NAME_EDEFAULT.equals(fqName);
			case XcorePackage.PARAM_TAG__PROPERTY_GUID:
				return PROPERTY_GUID_EDEFAULT == null ? propertyGUID != null : !PROPERTY_GUID_EDEFAULT.equals(propertyGUID);
			case XcorePackage.PARAM_TAG__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case XcorePackage.PARAM_TAG__VALUE:
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
		result.append(" (ElementGUID: ");
		result.append(elementGUID);
		result.append(", FQName: ");
		result.append(fqName);
		result.append(", PropertyGUID: ");
		result.append(propertyGUID);
		result.append(", Tag: ");
		result.append(tag);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParamTagImpl
