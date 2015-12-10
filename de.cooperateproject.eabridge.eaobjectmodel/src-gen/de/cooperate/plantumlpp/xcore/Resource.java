/**
 */
package de.cooperate.plantumlpp.xcore;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getActualHours <em>Actual Hours</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getExpectedHours <em>Expected Hours</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getHistory <em>History</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getRole <em>Role</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Resource#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Hours</em>' attribute.
	 * @see #setActualHours(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_ActualHours()
	 * @model unique="false"
	 * @generated
	 */
	Long getActualHours();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getActualHours <em>Actual Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Hours</em>' attribute.
	 * @see #getActualHours()
	 * @generated
	 */
	void setActualHours(Long value);

	/**
	 * Returns the value of the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date End</em>' attribute.
	 * @see #setDateEnd(Date)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_DateEnd()
	 * @model unique="false"
	 * @generated
	 */
	Date getDateEnd();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getDateEnd <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date End</em>' attribute.
	 * @see #getDateEnd()
	 * @generated
	 */
	void setDateEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Start</em>' attribute.
	 * @see #setDateStart(Date)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_DateStart()
	 * @model unique="false"
	 * @generated
	 */
	Date getDateStart();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getDateStart <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Start</em>' attribute.
	 * @see #getDateStart()
	 * @generated
	 */
	void setDateStart(Date value);

	/**
	 * Returns the value of the '<em><b>Expected Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Hours</em>' attribute.
	 * @see #setExpectedHours(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_ExpectedHours()
	 * @model unique="false"
	 * @generated
	 */
	Long getExpectedHours();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getExpectedHours <em>Expected Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Hours</em>' attribute.
	 * @see #getExpectedHours()
	 * @generated
	 */
	void setExpectedHours(Long value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute.
	 * @see #setHistory(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_History()
	 * @model unique="false"
	 * @generated
	 */
	String getHistory();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getHistory <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' attribute.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_PercentComplete()
	 * @model unique="false"
	 * @generated
	 */
	Long getPercentComplete();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(Long value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getResource_Time()
	 * @model unique="false"
	 * @generated
	 */
	Long getTime();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Resource#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Long value);

} // Resource
