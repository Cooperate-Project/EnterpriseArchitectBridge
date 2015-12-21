/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getPath <em>Path</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink()
 * @model
 * @generated
 */
public interface DiagramLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(Connector)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_Connector()
	 * @model containment="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramLinks <em>Diagram Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_Diagram()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramLinks
	 * @model opposite="DiagramLinks" transient="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_Geometry()
	 * @model unique="false"
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_InstanceID()
	 * @model unique="false"
	 * @generated
	 */
	Long getInstanceID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(Long value);

	/**
	 * Returns the value of the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hidden</em>' attribute.
	 * @see #setIsHidden(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_IsHidden()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsHidden();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getIsHidden <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hidden</em>' attribute.
	 * @see #getIsHidden()
	 * @generated
	 */
	void setIsHidden(Boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagramLink_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

} // DiagramLink
