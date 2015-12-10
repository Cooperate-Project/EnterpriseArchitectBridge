/**
 */
package de.cooperate.plantumlpp.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getFQName <em>FQ Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getTagGUID <em>Tag GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getTagID <em>Tag ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag()
 * @model
 * @generated
 */
public interface ConnectorTag extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperate.plantumlpp.xcore.Connector#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(Connector)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_Connector()
	 * @see de.cooperate.plantumlpp.xcore.Connector#getTaggedValues
	 * @model opposite="TaggedValues" transient="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_FQName()
	 * @model unique="false"
	 * @generated
	 */
	String getFQName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getFQName <em>FQ Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getNotes <em>Notes</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_TagGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getTagGUID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getTagGUID <em>Tag GUID</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_TagID()
	 * @model unique="false"
	 * @generated
	 */
	Long getTagID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getTagID <em>Tag ID</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnectorTag_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ConnectorTag
