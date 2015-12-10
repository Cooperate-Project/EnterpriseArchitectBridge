/**
 */
package de.cooperate.plantumlpp.xcore;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getDateReported <em>Date Reported</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getDateResolved <em>Date Resolved</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getReporter <em>Reporter</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getResolver <em>Resolver</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getResolverNotes <em>Resolver Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Issue#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Reported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Reported</em>' attribute.
	 * @see #setDateReported(Date)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_DateReported()
	 * @model unique="false"
	 * @generated
	 */
	Date getDateReported();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getDateReported <em>Date Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Reported</em>' attribute.
	 * @see #getDateReported()
	 * @generated
	 */
	void setDateReported(Date value);

	/**
	 * Returns the value of the '<em><b>Date Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Resolved</em>' attribute.
	 * @see #setDateResolved(Date)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_DateResolved()
	 * @model unique="false"
	 * @generated
	 */
	Date getDateResolved();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getDateResolved <em>Date Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Resolved</em>' attribute.
	 * @see #getDateResolved()
	 * @generated
	 */
	void setDateResolved(Date value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_ElementID()
	 * @model unique="false"
	 * @generated
	 */
	Long getElementID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(Long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Priority()
	 * @model unique="false"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporter</em>' attribute.
	 * @see #setReporter(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Reporter()
	 * @model unique="false"
	 * @generated
	 */
	String getReporter();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getReporter <em>Reporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' attribute.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(String value);

	/**
	 * Returns the value of the '<em><b>Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver</em>' attribute.
	 * @see #setResolver(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Resolver()
	 * @model unique="false"
	 * @generated
	 */
	String getResolver();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getResolver <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver</em>' attribute.
	 * @see #getResolver()
	 * @generated
	 */
	void setResolver(String value);

	/**
	 * Returns the value of the '<em><b>Resolver Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Notes</em>' attribute.
	 * @see #setResolverNotes(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_ResolverNotes()
	 * @model unique="false"
	 * @generated
	 */
	String getResolverNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getResolverNotes <em>Resolver Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Notes</em>' attribute.
	 * @see #getResolverNotes()
	 * @generated
	 */
	void setResolverNotes(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Severity()
	 * @model unique="false"
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getIssue_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Issue#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Issue
