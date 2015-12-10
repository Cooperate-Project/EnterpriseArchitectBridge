/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Issue;
import de.cooperate.plantumlpp.xcore.XcorePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getDateReported <em>Date Reported</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getDateResolved <em>Date Resolved</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getResolver <em>Resolver</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getResolverNotes <em>Resolver Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.IssueImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
	/**
	 * The default value of the '{@link #getDateReported() <em>Date Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateReported()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_REPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateReported() <em>Date Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateReported()
	 * @generated
	 * @ordered
	 */
	protected Date dateReported = DATE_REPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateResolved() <em>Date Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateResolved()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_RESOLVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateResolved() <em>Date Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateResolved()
	 * @generated
	 * @ordered
	 */
	protected Date dateResolved = DATE_RESOLVED_EDEFAULT;

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
	 * The default value of the '{@link #getReporter() <em>Reporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReporter() <em>Reporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected String reporter = REPORTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolver() <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolver()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolver() <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolver()
	 * @generated
	 * @ordered
	 */
	protected String resolver = RESOLVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolverNotes() <em>Resolver Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolverNotes() <em>Resolver Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverNotes()
	 * @generated
	 * @ordered
	 */
	protected String resolverNotes = RESOLVER_NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateReported() {
		return dateReported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateReported(Date newDateReported) {
		Date oldDateReported = dateReported;
		dateReported = newDateReported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__DATE_REPORTED, oldDateReported, dateReported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateResolved() {
		return dateResolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateResolved(Date newDateResolved) {
		Date oldDateResolved = dateResolved;
		dateResolved = newDateResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__DATE_RESOLVED, oldDateResolved, dateResolved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__ELEMENT_ID, oldElementID, elementID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__NOTES, oldNotes, notes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReporter() {
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(String newReporter) {
		String oldReporter = reporter;
		reporter = newReporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__REPORTER, oldReporter, reporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolver() {
		return resolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolver(String newResolver) {
		String oldResolver = resolver;
		resolver = newResolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__RESOLVER, oldResolver, resolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolverNotes() {
		return resolverNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolverNotes(String newResolverNotes) {
		String oldResolverNotes = resolverNotes;
		resolverNotes = newResolverNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__RESOLVER_NOTES, oldResolverNotes, resolverNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__SEVERITY, oldSeverity, severity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ISSUE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.ISSUE__DATE_REPORTED:
				return getDateReported();
			case XcorePackage.ISSUE__DATE_RESOLVED:
				return getDateResolved();
			case XcorePackage.ISSUE__ELEMENT_ID:
				return getElementID();
			case XcorePackage.ISSUE__NAME:
				return getName();
			case XcorePackage.ISSUE__NOTES:
				return getNotes();
			case XcorePackage.ISSUE__PRIORITY:
				return getPriority();
			case XcorePackage.ISSUE__REPORTER:
				return getReporter();
			case XcorePackage.ISSUE__RESOLVER:
				return getResolver();
			case XcorePackage.ISSUE__RESOLVER_NOTES:
				return getResolverNotes();
			case XcorePackage.ISSUE__SEVERITY:
				return getSeverity();
			case XcorePackage.ISSUE__STATUS:
				return getStatus();
			case XcorePackage.ISSUE__VERSION:
				return getVersion();
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
			case XcorePackage.ISSUE__DATE_REPORTED:
				setDateReported((Date)newValue);
				return;
			case XcorePackage.ISSUE__DATE_RESOLVED:
				setDateResolved((Date)newValue);
				return;
			case XcorePackage.ISSUE__ELEMENT_ID:
				setElementID((Long)newValue);
				return;
			case XcorePackage.ISSUE__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.ISSUE__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.ISSUE__PRIORITY:
				setPriority((String)newValue);
				return;
			case XcorePackage.ISSUE__REPORTER:
				setReporter((String)newValue);
				return;
			case XcorePackage.ISSUE__RESOLVER:
				setResolver((String)newValue);
				return;
			case XcorePackage.ISSUE__RESOLVER_NOTES:
				setResolverNotes((String)newValue);
				return;
			case XcorePackage.ISSUE__SEVERITY:
				setSeverity((String)newValue);
				return;
			case XcorePackage.ISSUE__STATUS:
				setStatus((String)newValue);
				return;
			case XcorePackage.ISSUE__VERSION:
				setVersion((String)newValue);
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
			case XcorePackage.ISSUE__DATE_REPORTED:
				setDateReported(DATE_REPORTED_EDEFAULT);
				return;
			case XcorePackage.ISSUE__DATE_RESOLVED:
				setDateResolved(DATE_RESOLVED_EDEFAULT);
				return;
			case XcorePackage.ISSUE__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case XcorePackage.ISSUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.ISSUE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.ISSUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case XcorePackage.ISSUE__REPORTER:
				setReporter(REPORTER_EDEFAULT);
				return;
			case XcorePackage.ISSUE__RESOLVER:
				setResolver(RESOLVER_EDEFAULT);
				return;
			case XcorePackage.ISSUE__RESOLVER_NOTES:
				setResolverNotes(RESOLVER_NOTES_EDEFAULT);
				return;
			case XcorePackage.ISSUE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case XcorePackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XcorePackage.ISSUE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case XcorePackage.ISSUE__DATE_REPORTED:
				return DATE_REPORTED_EDEFAULT == null ? dateReported != null : !DATE_REPORTED_EDEFAULT.equals(dateReported);
			case XcorePackage.ISSUE__DATE_RESOLVED:
				return DATE_RESOLVED_EDEFAULT == null ? dateResolved != null : !DATE_RESOLVED_EDEFAULT.equals(dateResolved);
			case XcorePackage.ISSUE__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case XcorePackage.ISSUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.ISSUE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.ISSUE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case XcorePackage.ISSUE__REPORTER:
				return REPORTER_EDEFAULT == null ? reporter != null : !REPORTER_EDEFAULT.equals(reporter);
			case XcorePackage.ISSUE__RESOLVER:
				return RESOLVER_EDEFAULT == null ? resolver != null : !RESOLVER_EDEFAULT.equals(resolver);
			case XcorePackage.ISSUE__RESOLVER_NOTES:
				return RESOLVER_NOTES_EDEFAULT == null ? resolverNotes != null : !RESOLVER_NOTES_EDEFAULT.equals(resolverNotes);
			case XcorePackage.ISSUE__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case XcorePackage.ISSUE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case XcorePackage.ISSUE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (DateReported: ");
		result.append(dateReported);
		result.append(", DateResolved: ");
		result.append(dateResolved);
		result.append(", ElementID: ");
		result.append(elementID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", Reporter: ");
		result.append(reporter);
		result.append(", Resolver: ");
		result.append(resolver);
		result.append(", ResolverNotes: ");
		result.append(resolverNotes);
		result.append(", Severity: ");
		result.append(severity);
		result.append(", Status: ");
		result.append(status);
		result.append(", Version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
