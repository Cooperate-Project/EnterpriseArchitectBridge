/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeGUID <em>Attribute GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainment <em>Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLength <em>Length</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPos <em>Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPrecision <em>Precision</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScope <em>Scope</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getGenOption <em>Gen Option</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #setAllowDuplicates(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_AllowDuplicates()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAllowDuplicates();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #getAllowDuplicates()
	 * @generated
	 */
	void setAllowDuplicates(Boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute GUID</em>' attribute.
	 * @see #setAttributeGUID(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_AttributeGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getAttributeGUID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeGUID <em>Attribute GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute GUID</em>' attribute.
	 * @see #getAttributeGUID()
	 * @generated
	 */
	void setAttributeGUID(String value);

	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_AttributeID()
	 * @model unique="false"
	 * @generated
	 */
	Long getAttributeID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(Long value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference.
	 * @see #setAttributeType(TypeReference)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_AttributeType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getAttributeType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeType <em>Attribute Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' containment reference.
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Container()
	 * @model unique="false"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Containment()
	 * @model unique="false"
	 * @generated
	 */
	String getContainment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Constraints()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttribute
	 * @model opposite="Attribute" containment="true"
	 * @generated
	 */
	EList<AttributeConstraint> getConstraints();

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Default()
	 * @model unique="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_IsCollection()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsCollection();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #getIsCollection()
	 * @generated
	 */
	void setIsCollection(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_IsConst()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsConst();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #getIsConst()
	 * @generated
	 */
	void setIsConst(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_IsDerived()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_IsOrdered()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_IsStatic()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Length()
	 * @model unique="false"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Parent()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getAttributes
	 * @model opposite="Attributes" transient="false"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Element value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Pos()
	 * @model unique="false"
	 * @generated
	 */
	Long getPos();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Long value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Precision()
	 * @model unique="false"
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Scale()
	 * @model unique="false"
	 * @generated
	 */
	String getScale();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Ex</em>' attribute.
	 * @see #setStyleEx(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_TaggedValues()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getAttribute
	 * @model opposite="Attribute" containment="true"
	 * @generated
	 */
	EList<AttributeTag> getTaggedValues();

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see #setScope(Scope)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_Scope()
	 * @model unique="false"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Gen Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Option</em>' attribute.
	 * @see #setGenOption(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getAttribute_GenOption()
	 * @model unique="false"
	 * @generated
	 */
	String getGenOption();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getGenOption <em>Gen Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Option</em>' attribute.
	 * @see #getGenOption()
	 * @generated
	 */
	void setGenOption(String value);

} // Attribute
