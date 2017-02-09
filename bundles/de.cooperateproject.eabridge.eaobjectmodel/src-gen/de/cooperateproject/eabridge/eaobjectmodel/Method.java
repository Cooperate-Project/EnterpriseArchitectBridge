/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getCode <em>Code</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsPure <em>Is Pure</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodGUID <em>Method GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getPos <em>Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnIsArray <em>Return Is Array</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getThrows <em>Throws</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getGenOption <em>Gen Option</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeReference)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getReturnType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Methodparameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAbstract();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' attribute.
	 * @see #setBehaviour(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Behaviour()
	 * @model unique="false"
	 * @generated
	 */
	String getBehaviour();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getBehaviour <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' attribute.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsConst()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsConst();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #getIsConst()
	 * @generated
	 */
	void setIsConst(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsLeaf()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Pure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pure</em>' attribute.
	 * @see #setIsPure(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsPure()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsPure();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsPure <em>Is Pure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pure</em>' attribute.
	 * @see #getIsPure()
	 * @generated
	 */
	void setIsPure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsQuery()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsQuery();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #getIsQuery()
	 * @generated
	 */
	void setIsQuery(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsRoot()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsRoot();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #getIsRoot()
	 * @generated
	 */
	void setIsRoot(Boolean value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsStatic()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronized</em>' attribute.
	 * @see #setIsSynchronized(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_IsSynchronized()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsSynchronized();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsSynchronized <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronized</em>' attribute.
	 * @see #getIsSynchronized()
	 * @generated
	 */
	void setIsSynchronized(Boolean value);

	/**
	 * Returns the value of the '<em><b>Method GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method GUID</em>' attribute.
	 * @see #setMethodGUID(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_MethodGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getMethodGUID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodGUID <em>Method GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method GUID</em>' attribute.
	 * @see #getMethodGUID()
	 * @generated
	 */
	void setMethodGUID(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_MethodID()
	 * @model unique="false"
	 * @generated
	 */
	Long getMethodID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodID <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method ID</em>' attribute.
	 * @see #getMethodID()
	 * @generated
	 */
	void setMethodID(Long value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Parent()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getMethods
	 * @model opposite="Methods" transient="false"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getParent <em>Parent</em>}' container reference.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Pos()
	 * @model unique="false"
	 * @generated
	 */
	Long getPos();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Long value);

	/**
	 * Returns the value of the '<em><b>Return Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Is Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Is Array</em>' attribute.
	 * @see #setReturnIsArray(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_ReturnIsArray()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getReturnIsArray();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnIsArray <em>Return Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Is Array</em>' attribute.
	 * @see #getReturnIsArray()
	 * @generated
	 */
	void setReturnIsArray(Boolean value);

	/**
	 * Returns the value of the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Flags</em>' attribute.
	 * @see #setStateFlags(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_StateFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getStateFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStateFlags <em>State Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Flags</em>' attribute.
	 * @see #getStateFlags()
	 * @generated
	 */
	void setStateFlags(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStereotype <em>Stereotype</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStyle <em>Style</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Throws()
	 * @model unique="false"
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see #setVisibility(Scope)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	Scope getVisibility();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Scope value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_Concurrency()
	 * @model unique="false"
	 * @generated
	 */
	String getConcurrency();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getMethod_GenOption()
	 * @model unique="false"
	 * @generated
	 */
	String getGenOption();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getGenOption <em>Gen Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Option</em>' attribute.
	 * @see #getGenOption()
	 * @generated
	 */
	void setGenOption(String value);

} // Method
