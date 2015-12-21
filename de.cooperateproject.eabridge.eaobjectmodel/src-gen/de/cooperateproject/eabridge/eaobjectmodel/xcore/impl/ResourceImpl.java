/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getActualHours <em>Actual Hours</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getExpectedHours <em>Expected Hours</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getHistory <em>History</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The default value of the '{@link #getActualHours() <em>Actual Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualHours()
	 * @generated
	 * @ordered
	 */
	protected static final Long ACTUAL_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualHours() <em>Actual Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualHours()
	 * @generated
	 * @ordered
	 */
	protected Long actualHours = ACTUAL_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected Date dateEnd = DATE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected Date dateStart = DATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedHours() <em>Expected Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedHours()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXPECTED_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedHours() <em>Expected Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedHours()
	 * @generated
	 * @ordered
	 */
	protected Long expectedHours = EXPECTED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected String history = HISTORY_EDEFAULT;

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
	 * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final Long PERCENT_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected Long percentComplete = PERCENT_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Long time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getActualHours() {
		return actualHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualHours(Long newActualHours) {
		Long oldActualHours = actualHours;
		actualHours = newActualHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__ACTUAL_HOURS, oldActualHours, actualHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEnd() {
		return dateEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnd(Date newDateEnd) {
		Date oldDateEnd = dateEnd;
		dateEnd = newDateEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__DATE_END, oldDateEnd, dateEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateStart() {
		return dateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateStart(Date newDateStart) {
		Date oldDateStart = dateStart;
		dateStart = newDateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__DATE_START, oldDateStart, dateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getExpectedHours() {
		return expectedHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedHours(Long newExpectedHours) {
		Long oldExpectedHours = expectedHours;
		expectedHours = newExpectedHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__EXPECTED_HOURS, oldExpectedHours, expectedHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(String newHistory) {
		String oldHistory = history;
		history = newHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__HISTORY, oldHistory, history));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPercentComplete() {
		return percentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentComplete(Long newPercentComplete) {
		Long oldPercentComplete = percentComplete;
		percentComplete = newPercentComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__PERCENT_COMPLETE, oldPercentComplete, percentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Long newTime) {
		Long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.RESOURCE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.RESOURCE__ACTUAL_HOURS:
				return getActualHours();
			case XcorePackage.RESOURCE__DATE_END:
				return getDateEnd();
			case XcorePackage.RESOURCE__DATE_START:
				return getDateStart();
			case XcorePackage.RESOURCE__EXPECTED_HOURS:
				return getExpectedHours();
			case XcorePackage.RESOURCE__HISTORY:
				return getHistory();
			case XcorePackage.RESOURCE__NAME:
				return getName();
			case XcorePackage.RESOURCE__NOTES:
				return getNotes();
			case XcorePackage.RESOURCE__PERCENT_COMPLETE:
				return getPercentComplete();
			case XcorePackage.RESOURCE__ROLE:
				return getRole();
			case XcorePackage.RESOURCE__TIME:
				return getTime();
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
			case XcorePackage.RESOURCE__ACTUAL_HOURS:
				setActualHours((Long)newValue);
				return;
			case XcorePackage.RESOURCE__DATE_END:
				setDateEnd((Date)newValue);
				return;
			case XcorePackage.RESOURCE__DATE_START:
				setDateStart((Date)newValue);
				return;
			case XcorePackage.RESOURCE__EXPECTED_HOURS:
				setExpectedHours((Long)newValue);
				return;
			case XcorePackage.RESOURCE__HISTORY:
				setHistory((String)newValue);
				return;
			case XcorePackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.RESOURCE__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.RESOURCE__PERCENT_COMPLETE:
				setPercentComplete((Long)newValue);
				return;
			case XcorePackage.RESOURCE__ROLE:
				setRole((String)newValue);
				return;
			case XcorePackage.RESOURCE__TIME:
				setTime((Long)newValue);
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
			case XcorePackage.RESOURCE__ACTUAL_HOURS:
				setActualHours(ACTUAL_HOURS_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__DATE_END:
				setDateEnd(DATE_END_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__DATE_START:
				setDateStart(DATE_START_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__EXPECTED_HOURS:
				setExpectedHours(EXPECTED_HOURS_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__PERCENT_COMPLETE:
				setPercentComplete(PERCENT_COMPLETE_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case XcorePackage.RESOURCE__TIME:
				setTime(TIME_EDEFAULT);
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
			case XcorePackage.RESOURCE__ACTUAL_HOURS:
				return ACTUAL_HOURS_EDEFAULT == null ? actualHours != null : !ACTUAL_HOURS_EDEFAULT.equals(actualHours);
			case XcorePackage.RESOURCE__DATE_END:
				return DATE_END_EDEFAULT == null ? dateEnd != null : !DATE_END_EDEFAULT.equals(dateEnd);
			case XcorePackage.RESOURCE__DATE_START:
				return DATE_START_EDEFAULT == null ? dateStart != null : !DATE_START_EDEFAULT.equals(dateStart);
			case XcorePackage.RESOURCE__EXPECTED_HOURS:
				return EXPECTED_HOURS_EDEFAULT == null ? expectedHours != null : !EXPECTED_HOURS_EDEFAULT.equals(expectedHours);
			case XcorePackage.RESOURCE__HISTORY:
				return HISTORY_EDEFAULT == null ? history != null : !HISTORY_EDEFAULT.equals(history);
			case XcorePackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.RESOURCE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.RESOURCE__PERCENT_COMPLETE:
				return PERCENT_COMPLETE_EDEFAULT == null ? percentComplete != null : !PERCENT_COMPLETE_EDEFAULT.equals(percentComplete);
			case XcorePackage.RESOURCE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case XcorePackage.RESOURCE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
		result.append(" (ActualHours: ");
		result.append(actualHours);
		result.append(", DateEnd: ");
		result.append(dateEnd);
		result.append(", DateStart: ");
		result.append(dateStart);
		result.append(", ExpectedHours: ");
		result.append(expectedHours);
		result.append(", History: ");
		result.append(history);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", PercentComplete: ");
		result.append(percentComplete);
		result.append(", Role: ");
		result.append(role);
		result.append(", Time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
