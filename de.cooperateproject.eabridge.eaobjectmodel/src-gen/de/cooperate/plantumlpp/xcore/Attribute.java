/**
 */
package de.cooperate.plantumlpp.xcore;

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
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getAttributeGUID <em>Attribute GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getContainment <em>Containment</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getIsID <em>Is ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getLength <em>Length</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getPos <em>Pos</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getPrecision <em>Precision</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Attribute#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_AllowDuplicates()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAllowDuplicates();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_AttributeGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getAttributeGUID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getAttributeGUID <em>Attribute GUID</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_AttributeID()
	 * @model unique="false"
	 * @generated
	 */
	Long getAttributeID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(Long value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference.
	 * @see #setClassifier(Element)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	Element getClassifier();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getClassifier <em>Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' containment reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Element value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Container()
	 * @model unique="false"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperate.plantumlpp.xcore.ContainmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see de.cooperate.plantumlpp.xcore.ContainmentType
	 * @see #setContainment(ContainmentType)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Containment()
	 * @model unique="false"
	 * @generated
	 */
	ContainmentType getContainment();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see de.cooperate.plantumlpp.xcore.ContainmentType
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(ContainmentType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperate.plantumlpp.xcore.AttributeConstraint}.
	 * It is bidirectional and its opposite is '{@link de.cooperate.plantumlpp.xcore.AttributeConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Constraints()
	 * @see de.cooperate.plantumlpp.xcore.AttributeConstraint#getAttribute
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Default()
	 * @model unique="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getDefault <em>Default</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_IsCollection()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsCollection();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getIsCollection <em>Is Collection</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_IsConst()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsConst();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getIsConst <em>Is Const</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_IsDerived()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(Boolean)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_IsID()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #getIsID()
	 * @generated
	 */
	void setIsID(Boolean value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_IsOrdered()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getIsOrdered <em>Is Ordered</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_IsStatic()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getIsStatic <em>Is Static</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Length()
	 * @model unique="false"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getLength <em>Length</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getLowerBound <em>Lower Bound</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperate.plantumlpp.xcore.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Element)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Parent()
	 * @see de.cooperate.plantumlpp.xcore.Element#getAttributes
	 * @model opposite="Attributes" transient="false"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getParent <em>Parent</em>}' container reference.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Pos()
	 * @model unique="false"
	 * @generated
	 */
	Long getPos();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getPos <em>Pos</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Precision()
	 * @model unique="false"
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Property</em>' attribute.
	 * @see #setRedefinedProperty(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_RedefinedProperty()
	 * @model unique="false"
	 * @generated
	 */
	String getRedefinedProperty();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getRedefinedProperty <em>Redefined Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Property</em>' attribute.
	 * @see #getRedefinedProperty()
	 * @generated
	 */
	void setRedefinedProperty(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Scale()
	 * @model unique="false"
	 * @generated
	 */
	String getScale();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getScale <em>Scale</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getStereotype <em>Stereotype</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getStyle <em>Style</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperate.plantumlpp.xcore.AttributeTag}.
	 * It is bidirectional and its opposite is '{@link de.cooperate.plantumlpp.xcore.AttributeTag#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_TaggedValues()
	 * @see de.cooperate.plantumlpp.xcore.AttributeTag#getAttribute
	 * @model opposite="Attribute" containment="true"
	 * @generated
	 */
	EList<AttributeTag> getTaggedValues();

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperate.plantumlpp.xcore.VisibilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see de.cooperate.plantumlpp.xcore.VisibilityType
	 * @see #setVisibility(VisibilityType)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getAttribute_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	VisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Attribute#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see de.cooperate.plantumlpp.xcore.VisibilityType
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityType value);

} // Attribute
