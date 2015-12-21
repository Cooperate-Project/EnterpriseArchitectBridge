/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getCheckedBy <em>Checked By</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getDateRun <em>Date Run</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getInput <em>Input</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getRunBy <em>Run By</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Acceptance Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Criteria</em>' attribute.
	 * @see #setAcceptanceCriteria(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_AcceptanceCriteria()
	 * @model unique="false"
	 * @generated
	 */
	String getAcceptanceCriteria();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getAcceptanceCriteria <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Criteria</em>' attribute.
	 * @see #getAcceptanceCriteria()
	 * @generated
	 */
	void setAcceptanceCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Checked By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked By</em>' attribute.
	 * @see #setCheckedBy(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_CheckedBy()
	 * @model unique="false"
	 * @generated
	 */
	String getCheckedBy();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getCheckedBy <em>Checked By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked By</em>' attribute.
	 * @see #getCheckedBy()
	 * @generated
	 */
	void setCheckedBy(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_Class()
	 * @model unique="false"
	 * @generated
	 */
	Long getClass_();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Long value);

	/**
	 * Returns the value of the '<em><b>Date Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Run</em>' attribute.
	 * @see #setDateRun(Date)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_DateRun()
	 * @model unique="false"
	 * @generated
	 */
	Date getDateRun();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getDateRun <em>Date Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Run</em>' attribute.
	 * @see #getDateRun()
	 * @generated
	 */
	void setDateRun(Date value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_Input()
	 * @model unique="false"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Run By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run By</em>' attribute.
	 * @see #setRunBy(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_RunBy()
	 * @model unique="false"
	 * @generated
	 */
	String getRunBy();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getRunBy <em>Run By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run By</em>' attribute.
	 * @see #getRunBy()
	 * @generated
	 */
	void setRunBy(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getStatus <em>Status</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTest_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Test
