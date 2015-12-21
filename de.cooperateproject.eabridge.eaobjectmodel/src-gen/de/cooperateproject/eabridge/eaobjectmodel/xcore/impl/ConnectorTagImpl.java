/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getFQName <em>FQ Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getTagGUID <em>Tag GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getTagID <em>Tag ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorTagImpl extends MinimalEObjectImpl.Container implements ConnectorTag {
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
	protected ConnectorTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.CONNECTOR_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (eContainerFeatureID() != XcorePackage.CONNECTOR_TAG__CONNECTOR) return null;
		return (Connector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		if (eContainerFeatureID() != XcorePackage.CONNECTOR_TAG__CONNECTOR) return null;
		return (Connector)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnector, XcorePackage.CONNECTOR_TAG__CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != eInternalContainer() || (eContainerFeatureID() != XcorePackage.CONNECTOR_TAG__CONNECTOR && newConnector != null)) {
			if (EcoreUtil.isAncestor(this, newConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, XcorePackage.CONNECTOR__TAGGED_VALUES, Connector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__CONNECTOR, newConnector, newConnector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__FQ_NAME, oldFQName, fqName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__NOTES, oldNotes, notes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__TAG_GUID, oldTagGUID, tagGUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__TAG_ID, oldTagID, tagID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_TAG__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnector((Connector)otherEnd, msgs);
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
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				return basicSetConnector(null, msgs);
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
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				return eInternalContainer().eInverseRemove(this, XcorePackage.CONNECTOR__TAGGED_VALUES, Connector.class, msgs);
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
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case XcorePackage.CONNECTOR_TAG__FQ_NAME:
				return getFQName();
			case XcorePackage.CONNECTOR_TAG__NAME:
				return getName();
			case XcorePackage.CONNECTOR_TAG__NOTES:
				return getNotes();
			case XcorePackage.CONNECTOR_TAG__TAG_GUID:
				return getTagGUID();
			case XcorePackage.CONNECTOR_TAG__TAG_ID:
				return getTagID();
			case XcorePackage.CONNECTOR_TAG__VALUE:
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
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case XcorePackage.CONNECTOR_TAG__FQ_NAME:
				setFQName((String)newValue);
				return;
			case XcorePackage.CONNECTOR_TAG__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.CONNECTOR_TAG__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.CONNECTOR_TAG__TAG_GUID:
				setTagGUID((String)newValue);
				return;
			case XcorePackage.CONNECTOR_TAG__TAG_ID:
				setTagID((Long)newValue);
				return;
			case XcorePackage.CONNECTOR_TAG__VALUE:
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
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				setConnector((Connector)null);
				return;
			case XcorePackage.CONNECTOR_TAG__FQ_NAME:
				setFQName(FQ_NAME_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_TAG__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_TAG__TAG_GUID:
				setTagGUID(TAG_GUID_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_TAG__TAG_ID:
				setTagID(TAG_ID_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_TAG__VALUE:
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
			case XcorePackage.CONNECTOR_TAG__CONNECTOR:
				return basicGetConnector() != null;
			case XcorePackage.CONNECTOR_TAG__FQ_NAME:
				return FQ_NAME_EDEFAULT == null ? fqName != null : !FQ_NAME_EDEFAULT.equals(fqName);
			case XcorePackage.CONNECTOR_TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.CONNECTOR_TAG__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.CONNECTOR_TAG__TAG_GUID:
				return TAG_GUID_EDEFAULT == null ? tagGUID != null : !TAG_GUID_EDEFAULT.equals(tagGUID);
			case XcorePackage.CONNECTOR_TAG__TAG_ID:
				return TAG_ID_EDEFAULT == null ? tagID != null : !TAG_ID_EDEFAULT.equals(tagID);
			case XcorePackage.CONNECTOR_TAG__VALUE:
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
		result.append(" (FQName: ");
		result.append(fqName);
		result.append(", Name: ");
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

} //ConnectorTagImpl
