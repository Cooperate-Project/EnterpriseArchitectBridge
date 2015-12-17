/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Requirement;
import de.cooperate.plantumlpp.xcore.XcorePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getRequirementID <em>Requirement ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getStability <em>Stability</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.RequirementImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected String difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdate = LAST_UPDATE_EDEFAULT;

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
	 * The default value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected Long parentID = PARENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementID() <em>Requirement ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementID()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementID() <em>Requirement ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementID()
	 * @generated
	 * @ordered
	 */
	protected Long requirementID = REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStability() <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStability()
	 * @generated
	 * @ordered
	 */
	protected static final String STABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStability() <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStability()
	 * @generated
	 * @ordered
	 */
	protected String stability = STABILITY_EDEFAULT;

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
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(String newDifficulty) {
		String oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdate(Date newLastUpdate) {
		Date oldLastUpdate = lastUpdate;
		lastUpdate = newLastUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__LAST_UPDATE, oldLastUpdate, lastUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getParentID() {
		return parentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentID(Long newParentID) {
		Long oldParentID = parentID;
		parentID = newParentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__PARENT_ID, oldParentID, parentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getRequirementID() {
		return requirementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementID(Long newRequirementID) {
		Long oldRequirementID = requirementID;
		requirementID = newRequirementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__REQUIREMENT_ID, oldRequirementID, requirementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStability() {
		return stability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStability(String newStability) {
		String oldStability = stability;
		stability = newStability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__STABILITY, oldStability, stability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.REQUIREMENT__DIFFICULTY:
				return getDifficulty();
			case XcorePackage.REQUIREMENT__LAST_UPDATE:
				return getLastUpdate();
			case XcorePackage.REQUIREMENT__NAME:
				return getName();
			case XcorePackage.REQUIREMENT__NOTES:
				return getNotes();
			case XcorePackage.REQUIREMENT__PARENT_ID:
				return getParentID();
			case XcorePackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case XcorePackage.REQUIREMENT__REQUIREMENT_ID:
				return getRequirementID();
			case XcorePackage.REQUIREMENT__STABILITY:
				return getStability();
			case XcorePackage.REQUIREMENT__STATUS:
				return getStatus();
			case XcorePackage.REQUIREMENT__TYPE:
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
			case XcorePackage.REQUIREMENT__DIFFICULTY:
				setDifficulty((String)newValue);
				return;
			case XcorePackage.REQUIREMENT__LAST_UPDATE:
				setLastUpdate((Date)newValue);
				return;
			case XcorePackage.REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.REQUIREMENT__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.REQUIREMENT__PARENT_ID:
				setParentID((Long)newValue);
				return;
			case XcorePackage.REQUIREMENT__PRIORITY:
				setPriority((String)newValue);
				return;
			case XcorePackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementID((Long)newValue);
				return;
			case XcorePackage.REQUIREMENT__STABILITY:
				setStability((String)newValue);
				return;
			case XcorePackage.REQUIREMENT__STATUS:
				setStatus((String)newValue);
				return;
			case XcorePackage.REQUIREMENT__TYPE:
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
			case XcorePackage.REQUIREMENT__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__LAST_UPDATE:
				setLastUpdate(LAST_UPDATE_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__PARENT_ID:
				setParentID(PARENT_ID_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementID(REQUIREMENT_ID_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__STABILITY:
				setStability(STABILITY_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XcorePackage.REQUIREMENT__TYPE:
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
			case XcorePackage.REQUIREMENT__DIFFICULTY:
				return DIFFICULTY_EDEFAULT == null ? difficulty != null : !DIFFICULTY_EDEFAULT.equals(difficulty);
			case XcorePackage.REQUIREMENT__LAST_UPDATE:
				return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
			case XcorePackage.REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.REQUIREMENT__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.REQUIREMENT__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentID != null : !PARENT_ID_EDEFAULT.equals(parentID);
			case XcorePackage.REQUIREMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case XcorePackage.REQUIREMENT__REQUIREMENT_ID:
				return REQUIREMENT_ID_EDEFAULT == null ? requirementID != null : !REQUIREMENT_ID_EDEFAULT.equals(requirementID);
			case XcorePackage.REQUIREMENT__STABILITY:
				return STABILITY_EDEFAULT == null ? stability != null : !STABILITY_EDEFAULT.equals(stability);
			case XcorePackage.REQUIREMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case XcorePackage.REQUIREMENT__TYPE:
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
		result.append(" (Difficulty: ");
		result.append(difficulty);
		result.append(", LastUpdate: ");
		result.append(lastUpdate);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", ParentID: ");
		result.append(parentID);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", RequirementID: ");
		result.append(requirementID);
		result.append(", Stability: ");
		result.append(stability);
		result.append(", Status: ");
		result.append(status);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
