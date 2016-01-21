/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttName <em>Att Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getAttributeConstraint()
 * @model
 * @generated
 */
public interface AttributeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' container reference.
	 * @see #setAttribute(Attribute)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getAttributeConstraint_Attribute()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getConstraints
	 * @model opposite="Constraints" transient="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttribute <em>Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' container reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getAttributeConstraint_Constraint()
	 * @model unique="false"
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Att Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Name</em>' attribute.
	 * @see #setAttName(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getAttributeConstraint_AttName()
	 * @model unique="false"
	 * @generated
	 */
	String getAttName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttName <em>Att Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att Name</em>' attribute.
	 * @see #getAttName()
	 * @generated
	 */
	void setAttName(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getAttributeConstraint_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getAttributeConstraint_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AttributeConstraint
