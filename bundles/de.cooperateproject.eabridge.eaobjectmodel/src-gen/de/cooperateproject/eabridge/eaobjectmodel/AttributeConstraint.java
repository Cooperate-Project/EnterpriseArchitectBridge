/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getElementOfAttribute <em>Element Of Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttName <em>Att Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint()
 * @model
 * @generated
 */
public interface AttributeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Of Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Of Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Of Attribute</em>' reference.
	 * @see #setElementOfAttribute(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint_ElementOfAttribute()
	 * @model
	 * @generated
	 */
	Element getElementOfAttribute();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getElementOfAttribute <em>Element Of Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Of Attribute</em>' reference.
	 * @see #getElementOfAttribute()
	 * @generated
	 */
	void setElementOfAttribute(Element value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' container reference.
	 * @see #setAttribute(Attribute)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint_Attribute()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getConstraints
	 * @model opposite="Constraints" transient="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttribute <em>Attribute</em>}' container reference.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint_Constraint()
	 * @model unique="false"
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getConstraint <em>Constraint</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint_AttName()
	 * @model unique="false"
	 * @generated
	 */
	String getAttName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttName <em>Att Name</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getNotes <em>Notes</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttributeConstraint_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AttributeConstraint
