/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methodparameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getEa_guid <em>Ea guid</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethodparameter()
 * @model
 * @generated
 */
public interface Methodparameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Ea guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea guid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea guid</em>' attribute.
	 * @see #setEa_guid(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethodparameter_Ea_guid()
	 * @model unique="false"
	 * @generated
	 */
	String getEa_guid();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getEa_guid <em>Ea guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea guid</em>' attribute.
	 * @see #getEa_guid()
	 * @generated
	 */
	void setEa_guid(String value);

	/**
	 * Returns the value of the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method ID</em>' attribute.
	 * @see #setMethodID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethodparameter_MethodID()
	 * @model unique="false"
	 * @generated
	 */
	Long getMethodID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getMethodID <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method ID</em>' attribute.
	 * @see #getMethodID()
	 * @generated
	 */
	void setMethodID(Long value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' containment reference.
	 * @see #setParameterType(TypeReference)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethodparameter_ParameterType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getParameterType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' containment reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(TypeReference value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethodparameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Methodparameter
