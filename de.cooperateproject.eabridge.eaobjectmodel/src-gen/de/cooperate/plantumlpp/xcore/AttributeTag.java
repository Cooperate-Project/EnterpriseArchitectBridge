/**
 */
package de.cooperate.plantumlpp.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getFQName <em>FQ Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getTagGUID <em>Tag GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getTagID <em>Tag ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.AttributeTag#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag()
 * @model
 * @generated
 */
public interface AttributeTag extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperate.plantumlpp.xcore.Attribute#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' container reference.
	 * @see #setAttribute(Attribute)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_Attribute()
	 * @see de.cooperate.plantumlpp.xcore.Attribute#getTaggedValues
	 * @model opposite="TaggedValues" transient="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getAttribute <em>Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' container reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FQ Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FQ Name</em>' attribute.
	 * @see #setFQName(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_FQName()
	 * @model unique="false"
	 * @generated
	 */
	String getFQName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getFQName <em>FQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FQ Name</em>' attribute.
	 * @see #getFQName()
	 * @generated
	 */
	void setFQName(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag GUID</em>' attribute.
	 * @see #setTagGUID(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_TagGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getTagGUID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getTagGUID <em>Tag GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag GUID</em>' attribute.
	 * @see #getTagGUID()
	 * @generated
	 */
	void setTagGUID(String value);

	/**
	 * Returns the value of the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag ID</em>' attribute.
	 * @see #setTagID(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_TagID()
	 * @model unique="false"
	 * @generated
	 */
	Long getTagID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getTagID <em>Tag ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag ID</em>' attribute.
	 * @see #getTagID()
	 * @generated
	 */
	void setTagID(Long value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttributeTag_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AttributeTag
