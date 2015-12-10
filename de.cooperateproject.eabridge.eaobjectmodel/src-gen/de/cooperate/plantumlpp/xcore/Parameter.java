/**
 */
package de.cooperate.plantumlpp.xcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getKind <em>Kind</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getOperationID <em>Operation ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getParameterGUID <em>Parameter GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getPosition <em>Position</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getStereotypeEx <em>Stereotype Ex</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Parameter#getTaggedValues <em>Tagged Values</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier ID</em>' attribute.
	 * @see #setClassifierID(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_ClassifierID()
	 * @model unique="false"
	 * @generated
	 */
	String getClassifierID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getClassifierID <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier ID</em>' attribute.
	 * @see #getClassifierID()
	 * @generated
	 */
	void setClassifierID(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Default()
	 * @model unique="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_IsConst()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsConst();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #getIsConst()
	 * @generated
	 */
	void setIsConst(Boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Kind()
	 * @model unique="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation ID</em>' attribute.
	 * @see #setOperationID(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_OperationID()
	 * @model unique="false"
	 * @generated
	 */
	Long getOperationID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getOperationID <em>Operation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation ID</em>' attribute.
	 * @see #getOperationID()
	 * @generated
	 */
	void setOperationID(Long value);

	/**
	 * Returns the value of the '<em><b>Parameter GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter GUID</em>' attribute.
	 * @see #setParameterGUID(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_ParameterGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getParameterGUID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getParameterGUID <em>Parameter GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter GUID</em>' attribute.
	 * @see #getParameterGUID()
	 * @generated
	 */
	void setParameterGUID(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Position()
	 * @model unique="false"
	 * @generated
	 */
	Long getPosition();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Long value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype Ex</em>' attribute.
	 * @see #setStereotypeEx(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_StereotypeEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotypeEx();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getStereotypeEx <em>Stereotype Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype Ex</em>' attribute.
	 * @see #getStereotypeEx()
	 * @generated
	 */
	void setStereotypeEx(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getStyle <em>Style</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Parameter#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperate.plantumlpp.xcore.ParamTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getParameter_TaggedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamTag> getTaggedValues();

} // Parameter
