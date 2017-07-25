/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorGUID <em>Connector GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndX <em>Pt End X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndY <em>Pt End Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSeqNo <em>Seq No</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartX <em>Pt Start X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartY <em>Pt Start Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getActionFlags <em>Action Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDest <em>Dest</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceCard <em>Source Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceAccess <em>Source Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleType <em>Source Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleNote <em>Source Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceContainment <em>Source Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceIsAggregate <em>Source Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsOrdered <em>Source Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceQualifier <em>Source Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceChangeable <em>Source Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceConstraint <em>Source Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsNavigable <em>Source Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStereotype <em>Source Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStyle <em>Source Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceTS <em>Source TS</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestCard <em>Dest Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestAccess <em>Dest Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestElement <em>Dest Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRole <em>Dest Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleType <em>Dest Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleNote <em>Dest Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestContainment <em>Dest Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestIsAggregate <em>Dest Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsOrdered <em>Dest Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestQualifier <em>Dest Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestChangeable <em>Dest Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestConstraint <em>Dest Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsNavigable <em>Dest Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStereotype <em>Dest Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStyle <em>Dest Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestTS <em>Dest TS</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Start_Label <em>Top Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Mid_Label <em>Top Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_End_Label <em>Top End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Start_Label <em>Btm Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Mid_Label <em>Btm Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_End_Label <em>Btm End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStart_Edge <em>Start Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getEnd_Edge <em>End Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getHeadStyle <em>Head Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDispatchAction <em>Dispatch Action</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA1 <em>PDATA1</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA2 <em>PDATA2</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA3 <em>PDATA3</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA4 <em>PDATA4</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA5 <em>PDATA5</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_ConnectorID()
	 * @model unique="false"
	 * @generated
	 */
	Long getConnectorID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorID <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector ID</em>' attribute.
	 * @see #getConnectorID()
	 * @generated
	 */
	void setConnectorID(Long value);

	/**
	 * Returns the value of the '<em><b>Connector GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector GUID</em>' attribute.
	 * @see #setConnectorGUID(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_ConnectorGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getConnectorGUID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorGUID <em>Connector GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector GUID</em>' attribute.
	 * @see #getConnectorGUID()
	 * @generated
	 */
	void setConnectorGUID(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Direction()
	 * @model unique="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Pt End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt End X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt End X</em>' attribute.
	 * @see #setPtEndX(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PtEndX()
	 * @model unique="false"
	 * @generated
	 */
	Long getPtEndX();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndX <em>Pt End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt End X</em>' attribute.
	 * @see #getPtEndX()
	 * @generated
	 */
	void setPtEndX(Long value);

	/**
	 * Returns the value of the '<em><b>Pt End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt End Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt End Y</em>' attribute.
	 * @see #setPtEndY(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PtEndY()
	 * @model unique="false"
	 * @generated
	 */
	Long getPtEndY();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndY <em>Pt End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt End Y</em>' attribute.
	 * @see #getPtEndY()
	 * @generated
	 */
	void setPtEndY(Long value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_EventFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getEventFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getEventFlags <em>Event Flags</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_IsLeaf()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsLeaf <em>Is Leaf</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_IsRoot()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsRoot();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsRoot <em>Is Root</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_IsSpec()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsSpec();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsSpec <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Spec</em>' attribute.
	 * @see #getIsSpec()
	 * @generated
	 */
	void setIsSpec(Boolean value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getNotes <em>Notes</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_RouteStyle()
	 * @model unique="false"
	 * @generated
	 */
	Long getRouteStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getRouteStyle <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Style</em>' attribute.
	 * @see #getRouteStyle()
	 * @generated
	 */
	void setRouteStyle(Long value);

	/**
	 * Returns the value of the '<em><b>Seq No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq No</em>' attribute.
	 * @see #setSeqNo(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SeqNo()
	 * @model unique="false"
	 * @generated
	 */
	Long getSeqNo();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSeqNo <em>Seq No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq No</em>' attribute.
	 * @see #getSeqNo()
	 * @generated
	 */
	void setSeqNo(Long value);

	/**
	 * Returns the value of the '<em><b>Pt Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Start X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Start X</em>' attribute.
	 * @see #setPtStartX(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PtStartX()
	 * @model unique="false"
	 * @generated
	 */
	Long getPtStartX();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartX <em>Pt Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Start X</em>' attribute.
	 * @see #getPtStartX()
	 * @generated
	 */
	void setPtStartX(Long value);

	/**
	 * Returns the value of the '<em><b>Pt Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Start Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Start Y</em>' attribute.
	 * @see #setPtStartY(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PtStartY()
	 * @model unique="false"
	 * @generated
	 */
	Long getPtStartY();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartY <em>Pt Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Start Y</em>' attribute.
	 * @see #getPtStartY()
	 * @generated
	 */
	void setPtStartY(Long value);

	/**
	 * Returns the value of the '<em><b>Action Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Flags</em>' attribute.
	 * @see #setActionFlags(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_ActionFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getActionFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getActionFlags <em>Action Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Flags</em>' attribute.
	 * @see #getActionFlags()
	 * @generated
	 */
	void setActionFlags(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_StateFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getStateFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStateFlags <em>State Flags</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStereotype <em>Stereotype</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' attribute.
	 * @see #setSubType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SubType()
	 * @model unique="false"
	 * @generated
	 */
	String getSubType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSubType <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' attribute.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ConnectorType
	 * @see #setType(ConnectorType)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Type()
	 * @model unique="false"
	 * @generated
	 */
	ConnectorType getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ConnectorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectorType value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_VirtualInheritance()
	 * @model unique="false"
	 * @generated
	 */
	String getVirtualInheritance();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #getVirtualInheritance()
	 * @generated
	 */
	void setVirtualInheritance(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getSourceRelations <em>Source Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Source()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getSourceRelations
	 * @model opposite="SourceRelations" transient="false"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Dest()
	 * @model
	 * @generated
	 */
	Element getDest();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(Element value);

	/**
	 * Returns the value of the '<em><b>Source Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Card</em>' attribute.
	 * @see #setSourceCard(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceCard()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceCard();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceCard <em>Source Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Card</em>' attribute.
	 * @see #getSourceCard()
	 * @generated
	 */
	void setSourceCard(String value);

	/**
	 * Returns the value of the '<em><b>Source Access</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Access</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see #setSourceAccess(Scope)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceAccess()
	 * @model unique="false"
	 * @generated
	 */
	Scope getSourceAccess();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceAccess <em>Source Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Access</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see #getSourceAccess()
	 * @generated
	 */
	void setSourceAccess(Scope value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' attribute.
	 * @see #setSourceElement(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceElement()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceElement <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' attribute.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(String value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' attribute.
	 * @see #setSourceRole(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceRole()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceRole();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRole <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' attribute.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Source Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Type</em>' attribute.
	 * @see #setSourceRoleType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceRoleType()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceRoleType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleType <em>Source Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Type</em>' attribute.
	 * @see #getSourceRoleType()
	 * @generated
	 */
	void setSourceRoleType(String value);

	/**
	 * Returns the value of the '<em><b>Source Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Note</em>' attribute.
	 * @see #setSourceRoleNote(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceRoleNote()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceRoleNote();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleNote <em>Source Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Note</em>' attribute.
	 * @see #getSourceRoleNote()
	 * @generated
	 */
	void setSourceRoleNote(String value);

	/**
	 * Returns the value of the '<em><b>Source Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Containment</em>' attribute.
	 * @see #setSourceContainment(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceContainment()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceContainment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceContainment <em>Source Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Containment</em>' attribute.
	 * @see #getSourceContainment()
	 * @generated
	 */
	void setSourceContainment(String value);

	/**
	 * Returns the value of the '<em><b>Source Is Aggregate</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.IsAggregate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Is Aggregate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Is Aggregate</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
	 * @see #setSourceIsAggregate(IsAggregate)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceIsAggregate()
	 * @model default="False" unique="false"
	 * @generated
	 */
	IsAggregate getSourceIsAggregate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceIsAggregate <em>Source Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Is Aggregate</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
	 * @see #getSourceIsAggregate()
	 * @generated
	 */
	void setSourceIsAggregate(IsAggregate value);

	/**
	 * Returns the value of the '<em><b>Source Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Is Ordered</em>' attribute.
	 * @see #setSourceIsOrdered(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceIsOrdered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSourceIsOrdered();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsOrdered <em>Source Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Is Ordered</em>' attribute.
	 * @see #isSourceIsOrdered()
	 * @generated
	 */
	void setSourceIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Qualifier</em>' attribute.
	 * @see #setSourceQualifier(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceQualifier()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceQualifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceQualifier <em>Source Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Qualifier</em>' attribute.
	 * @see #getSourceQualifier()
	 * @generated
	 */
	void setSourceQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Source Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Changeable</em>' attribute.
	 * @see #setSourceChangeable(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceChangeable()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceChangeable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceChangeable <em>Source Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Changeable</em>' attribute.
	 * @see #getSourceChangeable()
	 * @generated
	 */
	void setSourceChangeable(String value);

	/**
	 * Returns the value of the '<em><b>Source Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Constraint</em>' attribute.
	 * @see #setSourceConstraint(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceConstraint()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceConstraint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceConstraint <em>Source Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Constraint</em>' attribute.
	 * @see #getSourceConstraint()
	 * @generated
	 */
	void setSourceConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Source Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Is Navigable</em>' attribute.
	 * @see #setSourceIsNavigable(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceIsNavigable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSourceIsNavigable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsNavigable <em>Source Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Is Navigable</em>' attribute.
	 * @see #isSourceIsNavigable()
	 * @generated
	 */
	void setSourceIsNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Stereotype</em>' attribute.
	 * @see #setSourceStereotype(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceStereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStereotype <em>Source Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Stereotype</em>' attribute.
	 * @see #getSourceStereotype()
	 * @generated
	 */
	void setSourceStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Source Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Style</em>' attribute.
	 * @see #setSourceStyle(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceStyle()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStyle <em>Source Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Style</em>' attribute.
	 * @see #getSourceStyle()
	 * @generated
	 */
	void setSourceStyle(String value);

	/**
	 * Returns the value of the '<em><b>Source TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source TS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source TS</em>' attribute.
	 * @see #setSourceTS(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_SourceTS()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceTS();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceTS <em>Source TS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source TS</em>' attribute.
	 * @see #getSourceTS()
	 * @generated
	 */
	void setSourceTS(String value);

	/**
	 * Returns the value of the '<em><b>Dest Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Card</em>' attribute.
	 * @see #setDestCard(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestCard()
	 * @model unique="false"
	 * @generated
	 */
	String getDestCard();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestCard <em>Dest Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Card</em>' attribute.
	 * @see #getDestCard()
	 * @generated
	 */
	void setDestCard(String value);

	/**
	 * Returns the value of the '<em><b>Dest Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Access</em>' attribute.
	 * @see #setDestAccess(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestAccess()
	 * @model unique="false"
	 * @generated
	 */
	String getDestAccess();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestAccess <em>Dest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Access</em>' attribute.
	 * @see #getDestAccess()
	 * @generated
	 */
	void setDestAccess(String value);

	/**
	 * Returns the value of the '<em><b>Dest Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Element</em>' attribute.
	 * @see #setDestElement(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestElement()
	 * @model unique="false"
	 * @generated
	 */
	String getDestElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestElement <em>Dest Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Element</em>' attribute.
	 * @see #getDestElement()
	 * @generated
	 */
	void setDestElement(String value);

	/**
	 * Returns the value of the '<em><b>Dest Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Role</em>' attribute.
	 * @see #setDestRole(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestRole()
	 * @model unique="false"
	 * @generated
	 */
	String getDestRole();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRole <em>Dest Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Role</em>' attribute.
	 * @see #getDestRole()
	 * @generated
	 */
	void setDestRole(String value);

	/**
	 * Returns the value of the '<em><b>Dest Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Role Type</em>' attribute.
	 * @see #setDestRoleType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestRoleType()
	 * @model unique="false"
	 * @generated
	 */
	String getDestRoleType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleType <em>Dest Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Role Type</em>' attribute.
	 * @see #getDestRoleType()
	 * @generated
	 */
	void setDestRoleType(String value);

	/**
	 * Returns the value of the '<em><b>Dest Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Role Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Role Note</em>' attribute.
	 * @see #setDestRoleNote(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestRoleNote()
	 * @model unique="false"
	 * @generated
	 */
	String getDestRoleNote();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleNote <em>Dest Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Role Note</em>' attribute.
	 * @see #getDestRoleNote()
	 * @generated
	 */
	void setDestRoleNote(String value);

	/**
	 * Returns the value of the '<em><b>Dest Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Containment</em>' attribute.
	 * @see #setDestContainment(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestContainment()
	 * @model unique="false"
	 * @generated
	 */
	String getDestContainment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestContainment <em>Dest Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Containment</em>' attribute.
	 * @see #getDestContainment()
	 * @generated
	 */
	void setDestContainment(String value);

	/**
	 * Returns the value of the '<em><b>Dest Is Aggregate</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.IsAggregate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Is Aggregate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Is Aggregate</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
	 * @see #setDestIsAggregate(IsAggregate)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestIsAggregate()
	 * @model unique="false"
	 * @generated
	 */
	IsAggregate getDestIsAggregate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestIsAggregate <em>Dest Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Is Aggregate</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
	 * @see #getDestIsAggregate()
	 * @generated
	 */
	void setDestIsAggregate(IsAggregate value);

	/**
	 * Returns the value of the '<em><b>Dest Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Is Ordered</em>' attribute.
	 * @see #setDestIsOrdered(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestIsOrdered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDestIsOrdered();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsOrdered <em>Dest Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Is Ordered</em>' attribute.
	 * @see #isDestIsOrdered()
	 * @generated
	 */
	void setDestIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Dest Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Qualifier</em>' attribute.
	 * @see #setDestQualifier(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestQualifier()
	 * @model unique="false"
	 * @generated
	 */
	String getDestQualifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestQualifier <em>Dest Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Qualifier</em>' attribute.
	 * @see #getDestQualifier()
	 * @generated
	 */
	void setDestQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Dest Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Changeable</em>' attribute.
	 * @see #setDestChangeable(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestChangeable()
	 * @model unique="false"
	 * @generated
	 */
	String getDestChangeable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestChangeable <em>Dest Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Changeable</em>' attribute.
	 * @see #getDestChangeable()
	 * @generated
	 */
	void setDestChangeable(String value);

	/**
	 * Returns the value of the '<em><b>Dest Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Constraint</em>' attribute.
	 * @see #setDestConstraint(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestConstraint()
	 * @model unique="false"
	 * @generated
	 */
	String getDestConstraint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestConstraint <em>Dest Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Constraint</em>' attribute.
	 * @see #getDestConstraint()
	 * @generated
	 */
	void setDestConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Dest Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Is Navigable</em>' attribute.
	 * @see #setDestIsNavigable(boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestIsNavigable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDestIsNavigable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsNavigable <em>Dest Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Is Navigable</em>' attribute.
	 * @see #isDestIsNavigable()
	 * @generated
	 */
	void setDestIsNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Dest Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Stereotype</em>' attribute.
	 * @see #setDestStereotype(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestStereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getDestStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStereotype <em>Dest Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Stereotype</em>' attribute.
	 * @see #getDestStereotype()
	 * @generated
	 */
	void setDestStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Dest Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Style</em>' attribute.
	 * @see #setDestStyle(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestStyle()
	 * @model unique="false"
	 * @generated
	 */
	String getDestStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStyle <em>Dest Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Style</em>' attribute.
	 * @see #getDestStyle()
	 * @generated
	 */
	void setDestStyle(String value);

	/**
	 * Returns the value of the '<em><b>Dest TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest TS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest TS</em>' attribute.
	 * @see #setDestTS(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DestTS()
	 * @model unique="false"
	 * @generated
	 */
	String getDestTS();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestTS <em>Dest TS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest TS</em>' attribute.
	 * @see #getDestTS()
	 * @generated
	 */
	void setDestTS(String value);

	/**
	 * Returns the value of the '<em><b>Top Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Start Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Start Label</em>' attribute.
	 * @see #setTop_Start_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Top_Start_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getTop_Start_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Start_Label <em>Top Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Start Label</em>' attribute.
	 * @see #getTop_Start_Label()
	 * @generated
	 */
	void setTop_Start_Label(String value);

	/**
	 * Returns the value of the '<em><b>Top Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Mid Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Mid Label</em>' attribute.
	 * @see #setTop_Mid_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Top_Mid_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getTop_Mid_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Mid_Label <em>Top Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Mid Label</em>' attribute.
	 * @see #getTop_Mid_Label()
	 * @generated
	 */
	void setTop_Mid_Label(String value);

	/**
	 * Returns the value of the '<em><b>Top End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top End Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top End Label</em>' attribute.
	 * @see #setTop_End_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Top_End_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getTop_End_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_End_Label <em>Top End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top End Label</em>' attribute.
	 * @see #getTop_End_Label()
	 * @generated
	 */
	void setTop_End_Label(String value);

	/**
	 * Returns the value of the '<em><b>Btm Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btm Start Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btm Start Label</em>' attribute.
	 * @see #setBtm_Start_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Btm_Start_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getBtm_Start_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Start_Label <em>Btm Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btm Start Label</em>' attribute.
	 * @see #getBtm_Start_Label()
	 * @generated
	 */
	void setBtm_Start_Label(String value);

	/**
	 * Returns the value of the '<em><b>Btm Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btm Mid Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btm Mid Label</em>' attribute.
	 * @see #setBtm_Mid_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Btm_Mid_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getBtm_Mid_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Mid_Label <em>Btm Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btm Mid Label</em>' attribute.
	 * @see #getBtm_Mid_Label()
	 * @generated
	 */
	void setBtm_Mid_Label(String value);

	/**
	 * Returns the value of the '<em><b>Btm End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btm End Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btm End Label</em>' attribute.
	 * @see #setBtm_End_Label(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Btm_End_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getBtm_End_Label();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_End_Label <em>Btm End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btm End Label</em>' attribute.
	 * @see #getBtm_End_Label()
	 * @generated
	 */
	void setBtm_End_Label(String value);

	/**
	 * Returns the value of the '<em><b>Start Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Edge</em>' attribute.
	 * @see #setStart_Edge(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_Start_Edge()
	 * @model unique="false"
	 * @generated
	 */
	int getStart_Edge();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStart_Edge <em>Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Edge</em>' attribute.
	 * @see #getStart_Edge()
	 * @generated
	 */
	void setStart_Edge(int value);

	/**
	 * Returns the value of the '<em><b>End Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Edge</em>' attribute.
	 * @see #setEnd_Edge(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_End_Edge()
	 * @model unique="false"
	 * @generated
	 */
	int getEnd_Edge();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getEnd_Edge <em>End Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Edge</em>' attribute.
	 * @see #getEnd_Edge()
	 * @generated
	 */
	void setEnd_Edge(int value);

	/**
	 * Returns the value of the '<em><b>Head Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Style</em>' attribute.
	 * @see #setHeadStyle(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_HeadStyle()
	 * @model unique="false"
	 * @generated
	 */
	int getHeadStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getHeadStyle <em>Head Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Style</em>' attribute.
	 * @see #getHeadStyle()
	 * @generated
	 */
	void setHeadStyle(int value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #setLineStyle(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_LineStyle()
	 * @model unique="false"
	 * @generated
	 */
	int getLineStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(int value);

	/**
	 * Returns the value of the '<em><b>Dispatch Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatch Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch Action</em>' attribute.
	 * @see #setDispatchAction(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_DispatchAction()
	 * @model unique="false"
	 * @generated
	 */
	String getDispatchAction();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDispatchAction <em>Dispatch Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch Action</em>' attribute.
	 * @see #getDispatchAction()
	 * @generated
	 */
	void setDispatchAction(String value);

	/**
	 * Returns the value of the '<em><b>PDATA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDATA1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDATA1</em>' attribute.
	 * @see #setPDATA1(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PDATA1()
	 * @model unique="false"
	 * @generated
	 */
	String getPDATA1();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA1 <em>PDATA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDATA1</em>' attribute.
	 * @see #getPDATA1()
	 * @generated
	 */
	void setPDATA1(String value);

	/**
	 * Returns the value of the '<em><b>PDATA2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDATA2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDATA2</em>' attribute.
	 * @see #setPDATA2(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PDATA2()
	 * @model unique="false"
	 * @generated
	 */
	String getPDATA2();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA2 <em>PDATA2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDATA2</em>' attribute.
	 * @see #getPDATA2()
	 * @generated
	 */
	void setPDATA2(String value);

	/**
	 * Returns the value of the '<em><b>PDATA3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDATA3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDATA3</em>' attribute.
	 * @see #setPDATA3(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PDATA3()
	 * @model unique="false"
	 * @generated
	 */
	String getPDATA3();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA3 <em>PDATA3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDATA3</em>' attribute.
	 * @see #getPDATA3()
	 * @generated
	 */
	void setPDATA3(String value);

	/**
	 * Returns the value of the '<em><b>PDATA4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDATA4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDATA4</em>' attribute.
	 * @see #setPDATA4(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PDATA4()
	 * @model unique="false"
	 * @generated
	 */
	String getPDATA4();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA4 <em>PDATA4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDATA4</em>' attribute.
	 * @see #getPDATA4()
	 * @generated
	 */
	void setPDATA4(String value);

	/**
	 * Returns the value of the '<em><b>PDATA5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDATA5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDATA5</em>' attribute.
	 * @see #setPDATA5(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getConnector_PDATA5()
	 * @model unique="false"
	 * @generated
	 */
	String getPDATA5();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA5 <em>PDATA5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDATA5</em>' attribute.
	 * @see #getPDATA5()
	 * @generated
	 */
	void setPDATA5(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String sourceCard = getSourceCard();\r\nif (sourceCard != null) {\r\nString[] cards = sourceCard.split(\"\\\\.\\\\.\");\r\n\treturn Integer.parseInt(cards[0]);\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Integer getSourceLower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String sourceCard = getSourceCard();\r\nif (sourceCard != null) {\r\n\tString[] cards = sourceCard.split(\"\\\\.\\\\.\");\r\n\tint relevantIndex = Math.max(0, cards.length -1);\r\n\treturn Integer.parseInt(cards[relevantIndex]);\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Integer getSourceUpper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String destCard = getDestCard();\r\nif (destCard != null) {\r\nString[] cards = destCard.split(\"\\\\.\\\\.\");\r\n\treturn Integer.parseInt(cards[0]);\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Integer getDestLower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String destCard = getDestCard();\r\nif (destCard != null) {\r\n\tString[] cards = destCard.split(\"\\\\.\\\\.\");\r\n\tint relevantIndex = Math.max(0, cards.length -1);\r\n\treturn Integer.parseInt(cards[relevantIndex]);\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Integer getDestUpper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String sourceStyle = getSourceStyle();\r\nOptional&lt;String&gt; alias = Arrays.asList(sourceStyle.split(\";\")).stream()\r\n\t.filter(att -&gt; att.startsWith(\"alias\"))\r\n\t.findAny();\r\n\t\t\r\nif (alias.isPresent() &amp;&amp; alias.get().split(\"=\").length == 2) {\r\n\treturn alias.get().split(\"=\")[1];\r\n} else {\r\n\treturn \"\";\r\n}'"
	 * @generated
	 */
	String getSourceAlias();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String destStyle = getDestStyle();\r\nOptional&lt;String&gt; alias = Arrays.asList(destStyle.split(\";\")).stream()\r\n\t.filter(att -&gt; att.startsWith(\"alias\"))\r\n\t.findAny();\r\n\t\t\r\nif (alias.isPresent() &amp;&amp; alias.get().split(\"=\").length == 2) {\r\n\treturn alias.get().split(\"=\")[1];\r\n} else {\r\n\treturn \"\";\r\n}'"
	 * @generated
	 */
	String getDestAlias();

} // Connector
