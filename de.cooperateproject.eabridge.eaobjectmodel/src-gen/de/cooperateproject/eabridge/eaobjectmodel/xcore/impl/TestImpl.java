/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Test;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getCheckedBy <em>Checked By</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getDateRun <em>Date Run</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getRunBy <em>Run By</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
	/**
	 * The default value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTANCE_CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected String acceptanceCriteria = ACCEPTANCE_CRITERIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckedBy() <em>Checked By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckedBy() <em>Checked By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedBy()
	 * @generated
	 * @ordered
	 */
	protected String checkedBy = CHECKED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Long class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateRun() <em>Date Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRun()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_RUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateRun() <em>Date Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRun()
	 * @generated
	 * @ordered
	 */
	protected Date dateRun = DATE_RUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

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
	 * The default value of the '{@link #getRunBy() <em>Run By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunBy()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunBy() <em>Run By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunBy()
	 * @generated
	 * @ordered
	 */
	protected String runBy = RUN_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceCriteria(String newAcceptanceCriteria) {
		String oldAcceptanceCriteria = acceptanceCriteria;
		acceptanceCriteria = newAcceptanceCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__ACCEPTANCE_CRITERIA, oldAcceptanceCriteria, acceptanceCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckedBy() {
		return checkedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedBy(String newCheckedBy) {
		String oldCheckedBy = checkedBy;
		checkedBy = newCheckedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__CHECKED_BY, oldCheckedBy, checkedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Long newClass) {
		Long oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateRun() {
		return dateRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRun(Date newDateRun) {
		Date oldDateRun = dateRun;
		dateRun = newDateRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__DATE_RUN, oldDateRun, dateRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRunBy() {
		return runBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunBy(String newRunBy) {
		String oldRunBy = runBy;
		runBy = newRunBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__RUN_BY, oldRunBy, runBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.TEST__ACCEPTANCE_CRITERIA:
				return getAcceptanceCriteria();
			case XcorePackage.TEST__CHECKED_BY:
				return getCheckedBy();
			case XcorePackage.TEST__CLASS:
				return getClass_();
			case XcorePackage.TEST__DATE_RUN:
				return getDateRun();
			case XcorePackage.TEST__INPUT:
				return getInput();
			case XcorePackage.TEST__NAME:
				return getName();
			case XcorePackage.TEST__NOTES:
				return getNotes();
			case XcorePackage.TEST__RUN_BY:
				return getRunBy();
			case XcorePackage.TEST__STATUS:
				return getStatus();
			case XcorePackage.TEST__TYPE:
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
			case XcorePackage.TEST__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria((String)newValue);
				return;
			case XcorePackage.TEST__CHECKED_BY:
				setCheckedBy((String)newValue);
				return;
			case XcorePackage.TEST__CLASS:
				setClass((Long)newValue);
				return;
			case XcorePackage.TEST__DATE_RUN:
				setDateRun((Date)newValue);
				return;
			case XcorePackage.TEST__INPUT:
				setInput((String)newValue);
				return;
			case XcorePackage.TEST__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.TEST__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.TEST__RUN_BY:
				setRunBy((String)newValue);
				return;
			case XcorePackage.TEST__STATUS:
				setStatus((String)newValue);
				return;
			case XcorePackage.TEST__TYPE:
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
			case XcorePackage.TEST__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria(ACCEPTANCE_CRITERIA_EDEFAULT);
				return;
			case XcorePackage.TEST__CHECKED_BY:
				setCheckedBy(CHECKED_BY_EDEFAULT);
				return;
			case XcorePackage.TEST__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XcorePackage.TEST__DATE_RUN:
				setDateRun(DATE_RUN_EDEFAULT);
				return;
			case XcorePackage.TEST__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case XcorePackage.TEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.TEST__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.TEST__RUN_BY:
				setRunBy(RUN_BY_EDEFAULT);
				return;
			case XcorePackage.TEST__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XcorePackage.TEST__TYPE:
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
			case XcorePackage.TEST__ACCEPTANCE_CRITERIA:
				return ACCEPTANCE_CRITERIA_EDEFAULT == null ? acceptanceCriteria != null : !ACCEPTANCE_CRITERIA_EDEFAULT.equals(acceptanceCriteria);
			case XcorePackage.TEST__CHECKED_BY:
				return CHECKED_BY_EDEFAULT == null ? checkedBy != null : !CHECKED_BY_EDEFAULT.equals(checkedBy);
			case XcorePackage.TEST__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XcorePackage.TEST__DATE_RUN:
				return DATE_RUN_EDEFAULT == null ? dateRun != null : !DATE_RUN_EDEFAULT.equals(dateRun);
			case XcorePackage.TEST__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case XcorePackage.TEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.TEST__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.TEST__RUN_BY:
				return RUN_BY_EDEFAULT == null ? runBy != null : !RUN_BY_EDEFAULT.equals(runBy);
			case XcorePackage.TEST__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case XcorePackage.TEST__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (AcceptanceCriteria: ");
		result.append(acceptanceCriteria);
		result.append(", CheckedBy: ");
		result.append(checkedBy);
		result.append(", Class: ");
		result.append(class_);
		result.append(", DateRun: ");
		result.append(dateRun);
		result.append(", Input: ");
		result.append(input);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", RunBy: ");
		result.append(runBy);
		result.append(", Status: ");
		result.append(status);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TestImpl
