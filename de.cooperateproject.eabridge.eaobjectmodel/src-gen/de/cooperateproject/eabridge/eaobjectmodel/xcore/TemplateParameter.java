/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getTemplateParameterID <em>Template Parameter ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTemplateParameter_Constraint()
	 * @model unique="false"
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTemplateParameter_Default()
	 * @model unique="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTemplateParameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Template Parameter ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter ID</em>' attribute.
	 * @see #setTemplateParameterID(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTemplateParameter_TemplateParameterID()
	 * @model unique="false"
	 * @generated
	 */
	String getTemplateParameterID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getTemplateParameterID <em>Template Parameter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter ID</em>' attribute.
	 * @see #getTemplateParameterID()
	 * @generated
	 */
	void setTemplateParameterID(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getTemplateParameter_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TemplateParameter
