/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Client;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected String mobile = MOBILE_EDEFAULT;

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
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone1() <em>Phone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected String phone1 = PHONE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone2() <em>Phone2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected String phone2 = PHONE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoles() <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected String roles = ROLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile(String newMobile) {
		String oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__MOBILE, oldMobile, mobile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone1() {
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone1(String newPhone1) {
		String oldPhone1 = phone1;
		phone1 = newPhone1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__PHONE1, oldPhone1, phone1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone2() {
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone2(String newPhone2) {
		String oldPhone2 = phone2;
		phone2 = newPhone2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__PHONE2, oldPhone2, phone2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(String newRoles) {
		String oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CLIENT__ROLES, oldRoles, roles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.CLIENT__EMAIL:
				return getEmail();
			case XcorePackage.CLIENT__FAX:
				return getFax();
			case XcorePackage.CLIENT__MOBILE:
				return getMobile();
			case XcorePackage.CLIENT__NAME:
				return getName();
			case XcorePackage.CLIENT__NOTES:
				return getNotes();
			case XcorePackage.CLIENT__ORGANIZATION:
				return getOrganization();
			case XcorePackage.CLIENT__PHONE1:
				return getPhone1();
			case XcorePackage.CLIENT__PHONE2:
				return getPhone2();
			case XcorePackage.CLIENT__ROLES:
				return getRoles();
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
			case XcorePackage.CLIENT__EMAIL:
				setEmail((String)newValue);
				return;
			case XcorePackage.CLIENT__FAX:
				setFax((String)newValue);
				return;
			case XcorePackage.CLIENT__MOBILE:
				setMobile((String)newValue);
				return;
			case XcorePackage.CLIENT__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.CLIENT__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.CLIENT__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case XcorePackage.CLIENT__PHONE1:
				setPhone1((String)newValue);
				return;
			case XcorePackage.CLIENT__PHONE2:
				setPhone2((String)newValue);
				return;
			case XcorePackage.CLIENT__ROLES:
				setRoles((String)newValue);
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
			case XcorePackage.CLIENT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case XcorePackage.CLIENT__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case XcorePackage.CLIENT__MOBILE:
				setMobile(MOBILE_EDEFAULT);
				return;
			case XcorePackage.CLIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.CLIENT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.CLIENT__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case XcorePackage.CLIENT__PHONE1:
				setPhone1(PHONE1_EDEFAULT);
				return;
			case XcorePackage.CLIENT__PHONE2:
				setPhone2(PHONE2_EDEFAULT);
				return;
			case XcorePackage.CLIENT__ROLES:
				setRoles(ROLES_EDEFAULT);
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
			case XcorePackage.CLIENT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case XcorePackage.CLIENT__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case XcorePackage.CLIENT__MOBILE:
				return MOBILE_EDEFAULT == null ? mobile != null : !MOBILE_EDEFAULT.equals(mobile);
			case XcorePackage.CLIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.CLIENT__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.CLIENT__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case XcorePackage.CLIENT__PHONE1:
				return PHONE1_EDEFAULT == null ? phone1 != null : !PHONE1_EDEFAULT.equals(phone1);
			case XcorePackage.CLIENT__PHONE2:
				return PHONE2_EDEFAULT == null ? phone2 != null : !PHONE2_EDEFAULT.equals(phone2);
			case XcorePackage.CLIENT__ROLES:
				return ROLES_EDEFAULT == null ? roles != null : !ROLES_EDEFAULT.equals(roles);
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
		result.append(" (Email: ");
		result.append(email);
		result.append(", Fax: ");
		result.append(fax);
		result.append(", Mobile: ");
		result.append(mobile);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Organization: ");
		result.append(organization);
		result.append(", Phone1: ");
		result.append(phone1);
		result.append(", Phone2: ");
		result.append(phone2);
		result.append(", Roles: ");
		result.append(roles);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
