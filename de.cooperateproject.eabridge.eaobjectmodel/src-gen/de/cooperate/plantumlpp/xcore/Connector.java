/**
 */
package de.cooperate.plantumlpp.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getClientEnd <em>Client End</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getColor <em>Color</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getEndPointX <em>End Point X</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getEndPointY <em>End Point Y</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getMiscData <em>Misc Data</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getSequenceNo <em>Sequence No</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getStartPointX <em>Start Point X</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getStartPointY <em>Start Point Y</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getSupplierEnd <em>Supplier End</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getTransitionGuard <em>Transition Guard</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.Connector#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Client End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client End</em>' containment reference.
	 * @see #setClientEnd(ConnectorEnd)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_ClientEnd()
	 * @model containment="true"
	 * @generated
	 */
	ConnectorEnd getClientEnd();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getClientEnd <em>Client End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client End</em>' containment reference.
	 * @see #getClientEnd()
	 * @generated
	 */
	void setClientEnd(ConnectorEnd value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Color()
	 * @model unique="false"
	 * @generated
	 */
	Long getColor();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Long value);

	/**
	 * Returns the value of the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector ID</em>' attribute.
	 * @see #setConnectorID(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_ConnectorID()
	 * @model unique="false"
	 * @generated
	 */
	Long getConnectorID();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getConnectorID <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector ID</em>' attribute.
	 * @see #getConnectorID()
	 * @generated
	 */
	void setConnectorID(Long value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperate.plantumlpp.xcore.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.cooperate.plantumlpp.xcore.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Direction()
	 * @model unique="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.cooperate.plantumlpp.xcore.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>End Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point X</em>' attribute.
	 * @see #setEndPointX(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_EndPointX()
	 * @model unique="false"
	 * @generated
	 */
	Long getEndPointX();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getEndPointX <em>End Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point X</em>' attribute.
	 * @see #getEndPointX()
	 * @generated
	 */
	void setEndPointX(Long value);

	/**
	 * Returns the value of the '<em><b>End Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Y</em>' attribute.
	 * @see #setEndPointY(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_EndPointY()
	 * @model unique="false"
	 * @generated
	 */
	Long getEndPointY();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getEndPointY <em>End Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Y</em>' attribute.
	 * @see #getEndPointY()
	 * @generated
	 */
	void setEndPointY(Long value);

	/**
	 * Returns the value of the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Flags</em>' attribute.
	 * @see #setEventFlags(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_EventFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getEventFlags();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getEventFlags <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Flags</em>' attribute.
	 * @see #getEventFlags()
	 * @generated
	 */
	void setEventFlags(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_IsLeaf()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(Boolean value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_IsRoot()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsRoot();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #getIsRoot()
	 * @generated
	 */
	void setIsRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Spec</em>' attribute.
	 * @see #setIsSpec(Boolean)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_IsSpec()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsSpec();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getIsSpec <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Spec</em>' attribute.
	 * @see #getIsSpec()
	 * @generated
	 */
	void setIsSpec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_MetaType()
	 * @model unique="false"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

	/**
	 * Returns the value of the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Data</em>' attribute.
	 * @see #setMiscData(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_MiscData()
	 * @model unique="false"
	 * @generated
	 */
	String getMiscData();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getMiscData <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Misc Data</em>' attribute.
	 * @see #getMiscData()
	 * @generated
	 */
	void setMiscData(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Style</em>' attribute.
	 * @see #setRouteStyle(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_RouteStyle()
	 * @model unique="false"
	 * @generated
	 */
	Long getRouteStyle();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getRouteStyle <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Style</em>' attribute.
	 * @see #getRouteStyle()
	 * @generated
	 */
	void setRouteStyle(Long value);

	/**
	 * Returns the value of the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence No</em>' attribute.
	 * @see #setSequenceNo(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_SequenceNo()
	 * @model unique="false"
	 * @generated
	 */
	Long getSequenceNo();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getSequenceNo <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence No</em>' attribute.
	 * @see #getSequenceNo()
	 * @generated
	 */
	void setSequenceNo(Long value);

	/**
	 * Returns the value of the '<em><b>Start Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point X</em>' attribute.
	 * @see #setStartPointX(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_StartPointX()
	 * @model unique="false"
	 * @generated
	 */
	Long getStartPointX();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getStartPointX <em>Start Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point X</em>' attribute.
	 * @see #getStartPointX()
	 * @generated
	 */
	void setStartPointX(Long value);

	/**
	 * Returns the value of the '<em><b>Start Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point Y</em>' attribute.
	 * @see #setStartPointY(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_StartPointY()
	 * @model unique="false"
	 * @generated
	 */
	Long getStartPointY();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getStartPointY <em>Start Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point Y</em>' attribute.
	 * @see #getStartPointY()
	 * @generated
	 */
	void setStartPointY(Long value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_StateFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getStateFlags();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getStateFlags <em>State Flags</em>}' attribute.
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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Subtype()
	 * @model unique="false"
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

	/**
	 * Returns the value of the '<em><b>Supplier End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier End</em>' containment reference.
	 * @see #setSupplierEnd(ConnectorEnd)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_SupplierEnd()
	 * @model containment="true"
	 * @generated
	 */
	ConnectorEnd getSupplierEnd();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getSupplierEnd <em>Supplier End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier End</em>' containment reference.
	 * @see #getSupplierEnd()
	 * @generated
	 */
	void setSupplierEnd(ConnectorEnd value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.cooperate.plantumlpp.xcore.ConnectorTag#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference.
	 * @see #setTaggedValues(ConnectorTag)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_TaggedValues()
	 * @see de.cooperate.plantumlpp.xcore.ConnectorTag#getConnector
	 * @model opposite="Connector" containment="true"
	 * @generated
	 */
	ConnectorTag getTaggedValues();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getTaggedValues <em>Tagged Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagged Values</em>' containment reference.
	 * @see #getTaggedValues()
	 * @generated
	 */
	void setTaggedValues(ConnectorTag value);

	/**
	 * Returns the value of the '<em><b>Transition Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Action</em>' attribute.
	 * @see #setTransitionAction(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_TransitionAction()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionAction();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getTransitionAction <em>Transition Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Action</em>' attribute.
	 * @see #getTransitionAction()
	 * @generated
	 */
	void setTransitionAction(String value);

	/**
	 * Returns the value of the '<em><b>Transition Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Event</em>' attribute.
	 * @see #setTransitionEvent(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_TransitionEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionEvent();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getTransitionEvent <em>Transition Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Event</em>' attribute.
	 * @see #getTransitionEvent()
	 * @generated
	 */
	void setTransitionEvent(String value);

	/**
	 * Returns the value of the '<em><b>Transition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Guard</em>' attribute.
	 * @see #setTransitionGuard(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_TransitionGuard()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionGuard();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getTransitionGuard <em>Transition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Guard</em>' attribute.
	 * @see #getTransitionGuard()
	 * @generated
	 */
	void setTransitionGuard(String value);

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
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #setVirtualInheritance(String)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_VirtualInheritance()
	 * @model unique="false"
	 * @generated
	 */
	String getVirtualInheritance();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #getVirtualInheritance()
	 * @generated
	 */
	void setVirtualInheritance(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Long)
	 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getConnector_Width()
	 * @model unique="false"
	 * @generated
	 */
	Long getWidth();

	/**
	 * Sets the value of the '{@link de.cooperate.plantumlpp.xcore.Connector#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Long value);

} // Connector
