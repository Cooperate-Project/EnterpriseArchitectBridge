/**
 */
package de.cooperate.plantumlpp.xcore;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getRequirementID <em>Requirement ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getStability <em>Stability</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Requirement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Difficulty()
	 * @model unique="false"
	 * @generated
	 */
	String getDifficulty();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(String value);

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(Date)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_LastUpdate()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastUpdate();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(Date value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent ID</em>' attribute.
	 * @see #setParentID(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_ParentID()
	 * @model unique="false"
	 * @generated
	 */
	Long getParentID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getParentID <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent ID</em>' attribute.
	 * @see #getParentID()
	 * @generated
	 */
	void setParentID(Long value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Priority()
	 * @model unique="false"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Requirement ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement ID</em>' attribute.
	 * @see #setRequirementID(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_RequirementID()
	 * @model unique="false"
	 * @generated
	 */
	Long getRequirementID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getRequirementID <em>Requirement ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement ID</em>' attribute.
	 * @see #getRequirementID()
	 * @generated
	 */
	void setRequirementID(Long value);

	/**
	 * Returns the value of the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stability</em>' attribute.
	 * @see #setStability(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Stability()
	 * @model unique="false"
	 * @generated
	 */
	String getStability();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getStability <em>Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stability</em>' attribute.
	 * @see #getStability()
	 * @generated
	 */
	void setStability(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getRequirement_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Requirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Requirement
