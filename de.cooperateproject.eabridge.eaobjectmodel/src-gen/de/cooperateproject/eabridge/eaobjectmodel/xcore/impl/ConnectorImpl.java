/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getEndPointX <em>End Point X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getEndPointY <em>End Point Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getMiscData <em>Misc Data</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSequenceNo <em>Sequence No</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStartPointX <em>Start Point X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStartPointY <em>Start Point Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTransitionGuard <em>Transition Guard</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceCard <em>Source Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceAccess <em>Source Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceRoleType <em>Source Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceRoleNote <em>Source Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceContainment <em>Source Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#isSourceIsAggregate <em>Source Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#isSourceIsOrdered <em>Source Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceQualifier <em>Source Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestCard <em>Dest Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestAccess <em>Dest Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestElement <em>Dest Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestRole <em>Dest Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestRoleType <em>Dest Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestRoleNote <em>Dest Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestContainment <em>Dest Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#isDestIsAggregate <em>Dest Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#isDestIsOrdered <em>Dest Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestQualifier <em>Dest Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTop_Start_Label <em>Top Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTop_Mid_Label <em>Top Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTop_End_Label <em>Top End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getBtm_StartLabel <em>Btm Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getBtm_MidLabel <em>Btm Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getBtm_EndLabel <em>Btm End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStart_Edge <em>Start Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getEnd_Edge <em>End Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getHeadStyle <em>Head Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Element client;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Long COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Long color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectorID() <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorID()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONNECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorID() <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorID()
	 * @generated
	 * @ordered
	 */
	protected Long connectorID = CONNECTOR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected Diagram diagram;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPointX() <em>End Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointX()
	 * @generated
	 * @ordered
	 */
	protected static final Long END_POINT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPointX() <em>End Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointX()
	 * @generated
	 * @ordered
	 */
	protected Long endPointX = END_POINT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPointY() <em>End Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointY()
	 * @generated
	 * @ordered
	 */
	protected static final Long END_POINT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPointY() <em>End Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointY()
	 * @generated
	 * @ordered
	 */
	protected Long endPointY = END_POINT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventFlags() <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventFlags() <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventFlags()
	 * @generated
	 * @ordered
	 */
	protected String eventFlags = EVENT_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoot()
	 * @generated
	 * @ordered
	 */
	protected Boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSpec() <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSpec() <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpec()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSpec = IS_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaType()
	 * @generated
	 * @ordered
	 */
	protected static final String META_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaType()
	 * @generated
	 * @ordered
	 */
	protected String metaType = META_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiscData() <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscData()
	 * @generated
	 * @ordered
	 */
	protected static final String MISC_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiscData() <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscData()
	 * @generated
	 * @ordered
	 */
	protected String miscData = MISC_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteStyle() <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Long ROUTE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteStyle() <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteStyle()
	 * @generated
	 * @ordered
	 */
	protected Long routeStyle = ROUTE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNo() <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNo()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEQUENCE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceNo() <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNo()
	 * @generated
	 * @ordered
	 */
	protected Long sequenceNo = SEQUENCE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPointX() <em>Start Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointX()
	 * @generated
	 * @ordered
	 */
	protected static final Long START_POINT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPointX() <em>Start Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointX()
	 * @generated
	 * @ordered
	 */
	protected Long startPointX = START_POINT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPointY() <em>Start Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointY()
	 * @generated
	 * @ordered
	 */
	protected static final Long START_POINT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPointY() <em>Start Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPointY()
	 * @generated
	 * @ordered
	 */
	protected Long startPointY = START_POINT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateFlags() <em>State Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateFlags() <em>State Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFlags()
	 * @generated
	 * @ordered
	 */
	protected String stateFlags = STATE_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected String stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleEx() <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleEx()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleEx() <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleEx()
	 * @generated
	 * @ordered
	 */
	protected String styleEx = STYLE_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected String subType = SUB_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Element supplier;

	/**
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected ConnectorTag taggedValues;

	/**
	 * The default value of the '{@link #getTransitionAction() <em>Transition Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAction()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionAction() <em>Transition Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAction()
	 * @generated
	 * @ordered
	 */
	protected String transitionAction = TRANSITION_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionEvent() <em>Transition Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionEvent() <em>Transition Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected String transitionEvent = TRANSITION_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionGuard() <em>Transition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionGuard() <em>Transition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionGuard()
	 * @generated
	 * @ordered
	 */
	protected String transitionGuard = TRANSITION_GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorType TYPE_EDEFAULT = ConnectorType.CONNECTOR_TYPE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualInheritance() <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_INHERITANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualInheritance() <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualInheritance()
	 * @generated
	 * @ordered
	 */
	protected String virtualInheritance = VIRTUAL_INHERITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Long width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Element source;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected Element dest;

	/**
	 * The default value of the '{@link #getSourceCard() <em>Source Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCard()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCard() <em>Source Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCard()
	 * @generated
	 * @ordered
	 */
	protected String sourceCard = SOURCE_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceAccess() <em>Source Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAccess() <em>Source Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAccess()
	 * @generated
	 * @ordered
	 */
	protected String sourceAccess = SOURCE_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected String sourceElement = SOURCE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected String sourceRole = SOURCE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRoleType() <em>Source Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleType()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRoleType() <em>Source Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleType()
	 * @generated
	 * @ordered
	 */
	protected String sourceRoleType = SOURCE_ROLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRoleNote() <em>Source Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleNote()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRoleNote() <em>Source Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleNote()
	 * @generated
	 * @ordered
	 */
	protected String sourceRoleNote = SOURCE_ROLE_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceContainment() <em>Source Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceContainment()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceContainment() <em>Source Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceContainment()
	 * @generated
	 * @ordered
	 */
	protected String sourceContainment = SOURCE_CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceIsAggregate() <em>Source Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceIsAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_IS_AGGREGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceIsAggregate() <em>Source Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceIsAggregate()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceIsAggregate = SOURCE_IS_AGGREGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceIsOrdered() <em>Source Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceIsOrdered() <em>Source Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceIsOrdered = SOURCE_IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceQualifier() <em>Source Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceQualifier() <em>Source Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceQualifier()
	 * @generated
	 * @ordered
	 */
	protected String sourceQualifier = SOURCE_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestCard() <em>Dest Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestCard()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestCard() <em>Dest Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestCard()
	 * @generated
	 * @ordered
	 */
	protected String destCard = DEST_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestAccess() <em>Dest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestAccess() <em>Dest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestAccess()
	 * @generated
	 * @ordered
	 */
	protected String destAccess = DEST_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestElement() <em>Dest Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestElement()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestElement() <em>Dest Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestElement()
	 * @generated
	 * @ordered
	 */
	protected String destElement = DEST_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestRole() <em>Dest Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestRole()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestRole() <em>Dest Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestRole()
	 * @generated
	 * @ordered
	 */
	protected String destRole = DEST_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestRoleType() <em>Dest Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestRoleType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_ROLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestRoleType() <em>Dest Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestRoleType()
	 * @generated
	 * @ordered
	 */
	protected String destRoleType = DEST_ROLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestRoleNote() <em>Dest Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestRoleNote()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_ROLE_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestRoleNote() <em>Dest Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestRoleNote()
	 * @generated
	 * @ordered
	 */
	protected String destRoleNote = DEST_ROLE_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestContainment() <em>Dest Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestContainment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestContainment() <em>Dest Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestContainment()
	 * @generated
	 * @ordered
	 */
	protected String destContainment = DEST_CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDestIsAggregate() <em>Dest Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestIsAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEST_IS_AGGREGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDestIsAggregate() <em>Dest Is Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestIsAggregate()
	 * @generated
	 * @ordered
	 */
	protected boolean destIsAggregate = DEST_IS_AGGREGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDestIsOrdered() <em>Dest Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEST_IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDestIsOrdered() <em>Dest Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean destIsOrdered = DEST_IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestQualifier() <em>Dest Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestQualifier() <em>Dest Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestQualifier()
	 * @generated
	 * @ordered
	 */
	protected String destQualifier = DEST_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTop_Start_Label() <em>Top Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop_Start_Label()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_START_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTop_Start_Label() <em>Top Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop_Start_Label()
	 * @generated
	 * @ordered
	 */
	protected String top_Start_Label = TOP_START_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTop_Mid_Label() <em>Top Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop_Mid_Label()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_MID_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTop_Mid_Label() <em>Top Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop_Mid_Label()
	 * @generated
	 * @ordered
	 */
	protected String top_Mid_Label = TOP_MID_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTop_End_Label() <em>Top End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop_End_Label()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_END_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTop_End_Label() <em>Top End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop_End_Label()
	 * @generated
	 * @ordered
	 */
	protected String top_End_Label = TOP_END_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBtm_StartLabel() <em>Btm Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtm_StartLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String BTM_START_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtm_StartLabel() <em>Btm Start Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtm_StartLabel()
	 * @generated
	 * @ordered
	 */
	protected String btm_StartLabel = BTM_START_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBtm_MidLabel() <em>Btm Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtm_MidLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String BTM_MID_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtm_MidLabel() <em>Btm Mid Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtm_MidLabel()
	 * @generated
	 * @ordered
	 */
	protected String btm_MidLabel = BTM_MID_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBtm_EndLabel() <em>Btm End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtm_EndLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String BTM_END_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtm_EndLabel() <em>Btm End Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtm_EndLabel()
	 * @generated
	 * @ordered
	 */
	protected String btm_EndLabel = BTM_END_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart_Edge() <em>Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_Edge()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart_Edge() <em>Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_Edge()
	 * @generated
	 * @ordered
	 */
	protected int start_Edge = START_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd_Edge() <em>End Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_Edge()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd_Edge() <em>End Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_Edge()
	 * @generated
	 * @ordered
	 */
	protected int end_Edge = END_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeadStyle() <em>Head Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadStyle()
	 * @generated
	 * @ordered
	 */
	protected static final int HEAD_STYLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeadStyle() <em>Head Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadStyle()
	 * @generated
	 * @ordered
	 */
	protected int headStyle = HEAD_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_STYLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected int lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Element)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.CONNECTOR__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Element newClient) {
		Element oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Long newColor) {
		Long oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getConnectorID() {
		return connectorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorID(Long newConnectorID) {
		Long oldConnectorID = connectorID;
		connectorID = newConnectorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__CONNECTOR_ID, oldConnectorID, connectorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		if (diagram != null && diagram.eIsProxy()) {
			InternalEObject oldDiagram = (InternalEObject)diagram;
			diagram = (Diagram)eResolveProxy(oldDiagram);
			if (diagram != oldDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.CONNECTOR__DIAGRAM, oldDiagram, diagram));
			}
		}
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		Diagram oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DIAGRAM, oldDiagram, diagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getEndPointX() {
		return endPointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointX(Long newEndPointX) {
		Long oldEndPointX = endPointX;
		endPointX = newEndPointX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__END_POINT_X, oldEndPointX, endPointX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getEndPointY() {
		return endPointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointY(Long newEndPointY) {
		Long oldEndPointY = endPointY;
		endPointY = newEndPointY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__END_POINT_Y, oldEndPointY, endPointY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventFlags() {
		return eventFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFlags(String newEventFlags) {
		String oldEventFlags = eventFlags;
		eventFlags = newEventFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__EVENT_FLAGS, oldEventFlags, eventFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		Boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		Boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSpec() {
		return isSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpec(Boolean newIsSpec) {
		Boolean oldIsSpec = isSpec;
		isSpec = newIsSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__IS_SPEC, oldIsSpec, isSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaType() {
		return metaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaType(String newMetaType) {
		String oldMetaType = metaType;
		metaType = newMetaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__META_TYPE, oldMetaType, metaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiscData() {
		return miscData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiscData(String newMiscData) {
		String oldMiscData = miscData;
		miscData = newMiscData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__MISC_DATA, oldMiscData, miscData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getRouteStyle() {
		return routeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteStyle(Long newRouteStyle) {
		Long oldRouteStyle = routeStyle;
		routeStyle = newRouteStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__ROUTE_STYLE, oldRouteStyle, routeStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSequenceNo() {
		return sequenceNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNo(Long newSequenceNo) {
		Long oldSequenceNo = sequenceNo;
		sequenceNo = newSequenceNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SEQUENCE_NO, oldSequenceNo, sequenceNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getStartPointX() {
		return startPointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPointX(Long newStartPointX) {
		Long oldStartPointX = startPointX;
		startPointX = newStartPointX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__START_POINT_X, oldStartPointX, startPointX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getStartPointY() {
		return startPointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPointY(Long newStartPointY) {
		Long oldStartPointY = startPointY;
		startPointY = newStartPointY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__START_POINT_Y, oldStartPointY, startPointY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateFlags() {
		return stateFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFlags(String newStateFlags) {
		String oldStateFlags = stateFlags;
		stateFlags = newStateFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__STATE_FLAGS, oldStateFlags, stateFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return styleEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		String oldStyleEx = styleEx;
		styleEx = newStyleEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(String newSubType) {
		String oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SUB_TYPE, oldSubType, subType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Element)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.CONNECTOR__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Element newSupplier) {
		Element oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorTag getTaggedValues() {
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaggedValues(ConnectorTag newTaggedValues, NotificationChain msgs) {
		ConnectorTag oldTaggedValues = taggedValues;
		taggedValues = newTaggedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TAGGED_VALUES, oldTaggedValues, newTaggedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaggedValues(ConnectorTag newTaggedValues) {
		if (newTaggedValues != taggedValues) {
			NotificationChain msgs = null;
			if (taggedValues != null)
				msgs = ((InternalEObject)taggedValues).eInverseRemove(this, XcorePackage.CONNECTOR_TAG__CONNECTOR, ConnectorTag.class, msgs);
			if (newTaggedValues != null)
				msgs = ((InternalEObject)newTaggedValues).eInverseAdd(this, XcorePackage.CONNECTOR_TAG__CONNECTOR, ConnectorTag.class, msgs);
			msgs = basicSetTaggedValues(newTaggedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TAGGED_VALUES, newTaggedValues, newTaggedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionAction() {
		return transitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionAction(String newTransitionAction) {
		String oldTransitionAction = transitionAction;
		transitionAction = newTransitionAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TRANSITION_ACTION, oldTransitionAction, transitionAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionEvent() {
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionEvent(String newTransitionEvent) {
		String oldTransitionEvent = transitionEvent;
		transitionEvent = newTransitionEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TRANSITION_EVENT, oldTransitionEvent, transitionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionGuard() {
		return transitionGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionGuard(String newTransitionGuard) {
		String oldTransitionGuard = transitionGuard;
		transitionGuard = newTransitionGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TRANSITION_GUARD, oldTransitionGuard, transitionGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectorType newType) {
		ConnectorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualInheritance() {
		return virtualInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualInheritance(String newVirtualInheritance) {
		String oldVirtualInheritance = virtualInheritance;
		virtualInheritance = newVirtualInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE, oldVirtualInheritance, virtualInheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Long newWidth) {
		Long oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Element)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Element newSource) {
		Element oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getDest() {
		if (dest != null && dest.eIsProxy()) {
			InternalEObject oldDest = (InternalEObject)dest;
			dest = (Element)eResolveProxy(oldDest);
			if (dest != oldDest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.CONNECTOR__DEST, oldDest, dest));
			}
		}
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(Element newDest) {
		Element oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST, oldDest, dest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCard() {
		return sourceCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCard(String newSourceCard) {
		String oldSourceCard = sourceCard;
		sourceCard = newSourceCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_CARD, oldSourceCard, sourceCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceAccess() {
		return sourceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAccess(String newSourceAccess) {
		String oldSourceAccess = sourceAccess;
		sourceAccess = newSourceAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_ACCESS, oldSourceAccess, sourceAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(String newSourceElement) {
		String oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRole() {
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRole(String newSourceRole) {
		String oldSourceRole = sourceRole;
		sourceRole = newSourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_ROLE, oldSourceRole, sourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRoleType() {
		return sourceRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRoleType(String newSourceRoleType) {
		String oldSourceRoleType = sourceRoleType;
		sourceRoleType = newSourceRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_ROLE_TYPE, oldSourceRoleType, sourceRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRoleNote() {
		return sourceRoleNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRoleNote(String newSourceRoleNote) {
		String oldSourceRoleNote = sourceRoleNote;
		sourceRoleNote = newSourceRoleNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_ROLE_NOTE, oldSourceRoleNote, sourceRoleNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceContainment() {
		return sourceContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceContainment(String newSourceContainment) {
		String oldSourceContainment = sourceContainment;
		sourceContainment = newSourceContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_CONTAINMENT, oldSourceContainment, sourceContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceIsAggregate() {
		return sourceIsAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsAggregate(boolean newSourceIsAggregate) {
		boolean oldSourceIsAggregate = sourceIsAggregate;
		sourceIsAggregate = newSourceIsAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_IS_AGGREGATE, oldSourceIsAggregate, sourceIsAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceIsOrdered() {
		return sourceIsOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsOrdered(boolean newSourceIsOrdered) {
		boolean oldSourceIsOrdered = sourceIsOrdered;
		sourceIsOrdered = newSourceIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_IS_ORDERED, oldSourceIsOrdered, sourceIsOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceQualifier() {
		return sourceQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceQualifier(String newSourceQualifier) {
		String oldSourceQualifier = sourceQualifier;
		sourceQualifier = newSourceQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_QUALIFIER, oldSourceQualifier, sourceQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestCard() {
		return destCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestCard(String newDestCard) {
		String oldDestCard = destCard;
		destCard = newDestCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_CARD, oldDestCard, destCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestAccess() {
		return destAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestAccess(String newDestAccess) {
		String oldDestAccess = destAccess;
		destAccess = newDestAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_ACCESS, oldDestAccess, destAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestElement() {
		return destElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestElement(String newDestElement) {
		String oldDestElement = destElement;
		destElement = newDestElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_ELEMENT, oldDestElement, destElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestRole() {
		return destRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestRole(String newDestRole) {
		String oldDestRole = destRole;
		destRole = newDestRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_ROLE, oldDestRole, destRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestRoleType() {
		return destRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestRoleType(String newDestRoleType) {
		String oldDestRoleType = destRoleType;
		destRoleType = newDestRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_ROLE_TYPE, oldDestRoleType, destRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestRoleNote() {
		return destRoleNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestRoleNote(String newDestRoleNote) {
		String oldDestRoleNote = destRoleNote;
		destRoleNote = newDestRoleNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_ROLE_NOTE, oldDestRoleNote, destRoleNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestContainment() {
		return destContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestContainment(String newDestContainment) {
		String oldDestContainment = destContainment;
		destContainment = newDestContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_CONTAINMENT, oldDestContainment, destContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestIsAggregate() {
		return destIsAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestIsAggregate(boolean newDestIsAggregate) {
		boolean oldDestIsAggregate = destIsAggregate;
		destIsAggregate = newDestIsAggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_IS_AGGREGATE, oldDestIsAggregate, destIsAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestIsOrdered() {
		return destIsOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestIsOrdered(boolean newDestIsOrdered) {
		boolean oldDestIsOrdered = destIsOrdered;
		destIsOrdered = newDestIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_IS_ORDERED, oldDestIsOrdered, destIsOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestQualifier() {
		return destQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestQualifier(String newDestQualifier) {
		String oldDestQualifier = destQualifier;
		destQualifier = newDestQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_QUALIFIER, oldDestQualifier, destQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop_Start_Label() {
		return top_Start_Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop_Start_Label(String newTop_Start_Label) {
		String oldTop_Start_Label = top_Start_Label;
		top_Start_Label = newTop_Start_Label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TOP_START_LABEL, oldTop_Start_Label, top_Start_Label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop_Mid_Label() {
		return top_Mid_Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop_Mid_Label(String newTop_Mid_Label) {
		String oldTop_Mid_Label = top_Mid_Label;
		top_Mid_Label = newTop_Mid_Label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TOP_MID_LABEL, oldTop_Mid_Label, top_Mid_Label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop_End_Label() {
		return top_End_Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop_End_Label(String newTop_End_Label) {
		String oldTop_End_Label = top_End_Label;
		top_End_Label = newTop_End_Label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__TOP_END_LABEL, oldTop_End_Label, top_End_Label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtm_StartLabel() {
		return btm_StartLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtm_StartLabel(String newBtm_StartLabel) {
		String oldBtm_StartLabel = btm_StartLabel;
		btm_StartLabel = newBtm_StartLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__BTM_START_LABEL, oldBtm_StartLabel, btm_StartLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtm_MidLabel() {
		return btm_MidLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtm_MidLabel(String newBtm_MidLabel) {
		String oldBtm_MidLabel = btm_MidLabel;
		btm_MidLabel = newBtm_MidLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__BTM_MID_LABEL, oldBtm_MidLabel, btm_MidLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtm_EndLabel() {
		return btm_EndLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtm_EndLabel(String newBtm_EndLabel) {
		String oldBtm_EndLabel = btm_EndLabel;
		btm_EndLabel = newBtm_EndLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__BTM_END_LABEL, oldBtm_EndLabel, btm_EndLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart_Edge() {
		return start_Edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_Edge(int newStart_Edge) {
		int oldStart_Edge = start_Edge;
		start_Edge = newStart_Edge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__START_EDGE, oldStart_Edge, start_Edge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd_Edge() {
		return end_Edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_Edge(int newEnd_Edge) {
		int oldEnd_Edge = end_Edge;
		end_Edge = newEnd_Edge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__END_EDGE, oldEnd_Edge, end_Edge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeadStyle() {
		return headStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadStyle(int newHeadStyle) {
		int oldHeadStyle = headStyle;
		headStyle = newHeadStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__HEAD_STYLE, oldHeadStyle, headStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(int newLineStyle) {
		int oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				if (taggedValues != null)
					msgs = ((InternalEObject)taggedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.CONNECTOR__TAGGED_VALUES, null, msgs);
				return basicSetTaggedValues((ConnectorTag)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				return basicSetTaggedValues(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.CONNECTOR__ALIAS:
				return getAlias();
			case XcorePackage.CONNECTOR__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case XcorePackage.CONNECTOR__COLOR:
				return getColor();
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				return getConnectorID();
			case XcorePackage.CONNECTOR__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case XcorePackage.CONNECTOR__DIRECTION:
				return getDirection();
			case XcorePackage.CONNECTOR__END_POINT_X:
				return getEndPointX();
			case XcorePackage.CONNECTOR__END_POINT_Y:
				return getEndPointY();
			case XcorePackage.CONNECTOR__EVENT_FLAGS:
				return getEventFlags();
			case XcorePackage.CONNECTOR__IS_LEAF:
				return getIsLeaf();
			case XcorePackage.CONNECTOR__IS_ROOT:
				return getIsRoot();
			case XcorePackage.CONNECTOR__IS_SPEC:
				return getIsSpec();
			case XcorePackage.CONNECTOR__META_TYPE:
				return getMetaType();
			case XcorePackage.CONNECTOR__MISC_DATA:
				return getMiscData();
			case XcorePackage.CONNECTOR__NAME:
				return getName();
			case XcorePackage.CONNECTOR__NOTES:
				return getNotes();
			case XcorePackage.CONNECTOR__ROUTE_STYLE:
				return getRouteStyle();
			case XcorePackage.CONNECTOR__SEQUENCE_NO:
				return getSequenceNo();
			case XcorePackage.CONNECTOR__START_POINT_X:
				return getStartPointX();
			case XcorePackage.CONNECTOR__START_POINT_Y:
				return getStartPointY();
			case XcorePackage.CONNECTOR__STATE_FLAGS:
				return getStateFlags();
			case XcorePackage.CONNECTOR__STEREOTYPE:
				return getStereotype();
			case XcorePackage.CONNECTOR__STYLE_EX:
				return getStyleEx();
			case XcorePackage.CONNECTOR__SUB_TYPE:
				return getSubType();
			case XcorePackage.CONNECTOR__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				return getTaggedValues();
			case XcorePackage.CONNECTOR__TRANSITION_ACTION:
				return getTransitionAction();
			case XcorePackage.CONNECTOR__TRANSITION_EVENT:
				return getTransitionEvent();
			case XcorePackage.CONNECTOR__TRANSITION_GUARD:
				return getTransitionGuard();
			case XcorePackage.CONNECTOR__TYPE:
				return getType();
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				return getVirtualInheritance();
			case XcorePackage.CONNECTOR__WIDTH:
				return getWidth();
			case XcorePackage.CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case XcorePackage.CONNECTOR__DEST:
				if (resolve) return getDest();
				return basicGetDest();
			case XcorePackage.CONNECTOR__SOURCE_CARD:
				return getSourceCard();
			case XcorePackage.CONNECTOR__SOURCE_ACCESS:
				return getSourceAccess();
			case XcorePackage.CONNECTOR__SOURCE_ELEMENT:
				return getSourceElement();
			case XcorePackage.CONNECTOR__SOURCE_ROLE:
				return getSourceRole();
			case XcorePackage.CONNECTOR__SOURCE_ROLE_TYPE:
				return getSourceRoleType();
			case XcorePackage.CONNECTOR__SOURCE_ROLE_NOTE:
				return getSourceRoleNote();
			case XcorePackage.CONNECTOR__SOURCE_CONTAINMENT:
				return getSourceContainment();
			case XcorePackage.CONNECTOR__SOURCE_IS_AGGREGATE:
				return isSourceIsAggregate();
			case XcorePackage.CONNECTOR__SOURCE_IS_ORDERED:
				return isSourceIsOrdered();
			case XcorePackage.CONNECTOR__SOURCE_QUALIFIER:
				return getSourceQualifier();
			case XcorePackage.CONNECTOR__DEST_CARD:
				return getDestCard();
			case XcorePackage.CONNECTOR__DEST_ACCESS:
				return getDestAccess();
			case XcorePackage.CONNECTOR__DEST_ELEMENT:
				return getDestElement();
			case XcorePackage.CONNECTOR__DEST_ROLE:
				return getDestRole();
			case XcorePackage.CONNECTOR__DEST_ROLE_TYPE:
				return getDestRoleType();
			case XcorePackage.CONNECTOR__DEST_ROLE_NOTE:
				return getDestRoleNote();
			case XcorePackage.CONNECTOR__DEST_CONTAINMENT:
				return getDestContainment();
			case XcorePackage.CONNECTOR__DEST_IS_AGGREGATE:
				return isDestIsAggregate();
			case XcorePackage.CONNECTOR__DEST_IS_ORDERED:
				return isDestIsOrdered();
			case XcorePackage.CONNECTOR__DEST_QUALIFIER:
				return getDestQualifier();
			case XcorePackage.CONNECTOR__TOP_START_LABEL:
				return getTop_Start_Label();
			case XcorePackage.CONNECTOR__TOP_MID_LABEL:
				return getTop_Mid_Label();
			case XcorePackage.CONNECTOR__TOP_END_LABEL:
				return getTop_End_Label();
			case XcorePackage.CONNECTOR__BTM_START_LABEL:
				return getBtm_StartLabel();
			case XcorePackage.CONNECTOR__BTM_MID_LABEL:
				return getBtm_MidLabel();
			case XcorePackage.CONNECTOR__BTM_END_LABEL:
				return getBtm_EndLabel();
			case XcorePackage.CONNECTOR__START_EDGE:
				return getStart_Edge();
			case XcorePackage.CONNECTOR__END_EDGE:
				return getEnd_Edge();
			case XcorePackage.CONNECTOR__HEAD_STYLE:
				return getHeadStyle();
			case XcorePackage.CONNECTOR__LINE_STYLE:
				return getLineStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcorePackage.CONNECTOR__ALIAS:
				setAlias((String)newValue);
				return;
			case XcorePackage.CONNECTOR__CLIENT:
				setClient((Element)newValue);
				return;
			case XcorePackage.CONNECTOR__COLOR:
				setColor((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				setConnectorID((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case XcorePackage.CONNECTOR__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case XcorePackage.CONNECTOR__END_POINT_X:
				setEndPointX((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__END_POINT_Y:
				setEndPointY((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__EVENT_FLAGS:
				setEventFlags((String)newValue);
				return;
			case XcorePackage.CONNECTOR__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__IS_SPEC:
				setIsSpec((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__META_TYPE:
				setMetaType((String)newValue);
				return;
			case XcorePackage.CONNECTOR__MISC_DATA:
				setMiscData((String)newValue);
				return;
			case XcorePackage.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.CONNECTOR__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.CONNECTOR__ROUTE_STYLE:
				setRouteStyle((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__SEQUENCE_NO:
				setSequenceNo((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__START_POINT_X:
				setStartPointX((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__START_POINT_Y:
				setStartPointY((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__STATE_FLAGS:
				setStateFlags((String)newValue);
				return;
			case XcorePackage.CONNECTOR__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XcorePackage.CONNECTOR__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SUB_TYPE:
				setSubType((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SUPPLIER:
				setSupplier((Element)newValue);
				return;
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				setTaggedValues((ConnectorTag)newValue);
				return;
			case XcorePackage.CONNECTOR__TRANSITION_ACTION:
				setTransitionAction((String)newValue);
				return;
			case XcorePackage.CONNECTOR__TRANSITION_EVENT:
				setTransitionEvent((String)newValue);
				return;
			case XcorePackage.CONNECTOR__TRANSITION_GUARD:
				setTransitionGuard((String)newValue);
				return;
			case XcorePackage.CONNECTOR__TYPE:
				setType((ConnectorType)newValue);
				return;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance((String)newValue);
				return;
			case XcorePackage.CONNECTOR__WIDTH:
				setWidth((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE:
				setSource((Element)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST:
				setDest((Element)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_CARD:
				setSourceCard((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ACCESS:
				setSourceAccess((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ELEMENT:
				setSourceElement((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ROLE:
				setSourceRole((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ROLE_TYPE:
				setSourceRoleType((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ROLE_NOTE:
				setSourceRoleNote((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_CONTAINMENT:
				setSourceContainment((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_IS_AGGREGATE:
				setSourceIsAggregate((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_IS_ORDERED:
				setSourceIsOrdered((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_QUALIFIER:
				setSourceQualifier((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_CARD:
				setDestCard((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_ACCESS:
				setDestAccess((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_ELEMENT:
				setDestElement((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_ROLE:
				setDestRole((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_ROLE_TYPE:
				setDestRoleType((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_ROLE_NOTE:
				setDestRoleNote((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_CONTAINMENT:
				setDestContainment((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_IS_AGGREGATE:
				setDestIsAggregate((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_IS_ORDERED:
				setDestIsOrdered((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_QUALIFIER:
				setDestQualifier((String)newValue);
				return;
			case XcorePackage.CONNECTOR__TOP_START_LABEL:
				setTop_Start_Label((String)newValue);
				return;
			case XcorePackage.CONNECTOR__TOP_MID_LABEL:
				setTop_Mid_Label((String)newValue);
				return;
			case XcorePackage.CONNECTOR__TOP_END_LABEL:
				setTop_End_Label((String)newValue);
				return;
			case XcorePackage.CONNECTOR__BTM_START_LABEL:
				setBtm_StartLabel((String)newValue);
				return;
			case XcorePackage.CONNECTOR__BTM_MID_LABEL:
				setBtm_MidLabel((String)newValue);
				return;
			case XcorePackage.CONNECTOR__BTM_END_LABEL:
				setBtm_EndLabel((String)newValue);
				return;
			case XcorePackage.CONNECTOR__START_EDGE:
				setStart_Edge((Integer)newValue);
				return;
			case XcorePackage.CONNECTOR__END_EDGE:
				setEnd_Edge((Integer)newValue);
				return;
			case XcorePackage.CONNECTOR__HEAD_STYLE:
				setHeadStyle((Integer)newValue);
				return;
			case XcorePackage.CONNECTOR__LINE_STYLE:
				setLineStyle((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XcorePackage.CONNECTOR__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__CLIENT:
				setClient((Element)null);
				return;
			case XcorePackage.CONNECTOR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				setConnectorID(CONNECTOR_ID_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case XcorePackage.CONNECTOR__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__END_POINT_X:
				setEndPointX(END_POINT_X_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__END_POINT_Y:
				setEndPointY(END_POINT_Y_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__EVENT_FLAGS:
				setEventFlags(EVENT_FLAGS_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__IS_SPEC:
				setIsSpec(IS_SPEC_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__META_TYPE:
				setMetaType(META_TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__MISC_DATA:
				setMiscData(MISC_DATA_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__ROUTE_STYLE:
				setRouteStyle(ROUTE_STYLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SEQUENCE_NO:
				setSequenceNo(SEQUENCE_NO_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__START_POINT_X:
				setStartPointX(START_POINT_X_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__START_POINT_Y:
				setStartPointY(START_POINT_Y_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__STATE_FLAGS:
				setStateFlags(STATE_FLAGS_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SUB_TYPE:
				setSubType(SUB_TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SUPPLIER:
				setSupplier((Element)null);
				return;
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				setTaggedValues((ConnectorTag)null);
				return;
			case XcorePackage.CONNECTOR__TRANSITION_ACTION:
				setTransitionAction(TRANSITION_ACTION_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__TRANSITION_EVENT:
				setTransitionEvent(TRANSITION_EVENT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__TRANSITION_GUARD:
				setTransitionGuard(TRANSITION_GUARD_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance(VIRTUAL_INHERITANCE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE:
				setSource((Element)null);
				return;
			case XcorePackage.CONNECTOR__DEST:
				setDest((Element)null);
				return;
			case XcorePackage.CONNECTOR__SOURCE_CARD:
				setSourceCard(SOURCE_CARD_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ACCESS:
				setSourceAccess(SOURCE_ACCESS_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ELEMENT:
				setSourceElement(SOURCE_ELEMENT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ROLE:
				setSourceRole(SOURCE_ROLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ROLE_TYPE:
				setSourceRoleType(SOURCE_ROLE_TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_ROLE_NOTE:
				setSourceRoleNote(SOURCE_ROLE_NOTE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_CONTAINMENT:
				setSourceContainment(SOURCE_CONTAINMENT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_IS_AGGREGATE:
				setSourceIsAggregate(SOURCE_IS_AGGREGATE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_IS_ORDERED:
				setSourceIsOrdered(SOURCE_IS_ORDERED_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_QUALIFIER:
				setSourceQualifier(SOURCE_QUALIFIER_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_CARD:
				setDestCard(DEST_CARD_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_ACCESS:
				setDestAccess(DEST_ACCESS_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_ELEMENT:
				setDestElement(DEST_ELEMENT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_ROLE:
				setDestRole(DEST_ROLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_ROLE_TYPE:
				setDestRoleType(DEST_ROLE_TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_ROLE_NOTE:
				setDestRoleNote(DEST_ROLE_NOTE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_CONTAINMENT:
				setDestContainment(DEST_CONTAINMENT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_IS_AGGREGATE:
				setDestIsAggregate(DEST_IS_AGGREGATE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_IS_ORDERED:
				setDestIsOrdered(DEST_IS_ORDERED_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_QUALIFIER:
				setDestQualifier(DEST_QUALIFIER_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__TOP_START_LABEL:
				setTop_Start_Label(TOP_START_LABEL_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__TOP_MID_LABEL:
				setTop_Mid_Label(TOP_MID_LABEL_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__TOP_END_LABEL:
				setTop_End_Label(TOP_END_LABEL_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__BTM_START_LABEL:
				setBtm_StartLabel(BTM_START_LABEL_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__BTM_MID_LABEL:
				setBtm_MidLabel(BTM_MID_LABEL_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__BTM_END_LABEL:
				setBtm_EndLabel(BTM_END_LABEL_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__START_EDGE:
				setStart_Edge(START_EDGE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__END_EDGE:
				setEnd_Edge(END_EDGE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__HEAD_STYLE:
				setHeadStyle(HEAD_STYLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XcorePackage.CONNECTOR__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case XcorePackage.CONNECTOR__CLIENT:
				return client != null;
			case XcorePackage.CONNECTOR__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorID != null : !CONNECTOR_ID_EDEFAULT.equals(connectorID);
			case XcorePackage.CONNECTOR__DIAGRAM:
				return diagram != null;
			case XcorePackage.CONNECTOR__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case XcorePackage.CONNECTOR__END_POINT_X:
				return END_POINT_X_EDEFAULT == null ? endPointX != null : !END_POINT_X_EDEFAULT.equals(endPointX);
			case XcorePackage.CONNECTOR__END_POINT_Y:
				return END_POINT_Y_EDEFAULT == null ? endPointY != null : !END_POINT_Y_EDEFAULT.equals(endPointY);
			case XcorePackage.CONNECTOR__EVENT_FLAGS:
				return EVENT_FLAGS_EDEFAULT == null ? eventFlags != null : !EVENT_FLAGS_EDEFAULT.equals(eventFlags);
			case XcorePackage.CONNECTOR__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case XcorePackage.CONNECTOR__IS_ROOT:
				return IS_ROOT_EDEFAULT == null ? isRoot != null : !IS_ROOT_EDEFAULT.equals(isRoot);
			case XcorePackage.CONNECTOR__IS_SPEC:
				return IS_SPEC_EDEFAULT == null ? isSpec != null : !IS_SPEC_EDEFAULT.equals(isSpec);
			case XcorePackage.CONNECTOR__META_TYPE:
				return META_TYPE_EDEFAULT == null ? metaType != null : !META_TYPE_EDEFAULT.equals(metaType);
			case XcorePackage.CONNECTOR__MISC_DATA:
				return MISC_DATA_EDEFAULT == null ? miscData != null : !MISC_DATA_EDEFAULT.equals(miscData);
			case XcorePackage.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.CONNECTOR__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.CONNECTOR__ROUTE_STYLE:
				return ROUTE_STYLE_EDEFAULT == null ? routeStyle != null : !ROUTE_STYLE_EDEFAULT.equals(routeStyle);
			case XcorePackage.CONNECTOR__SEQUENCE_NO:
				return SEQUENCE_NO_EDEFAULT == null ? sequenceNo != null : !SEQUENCE_NO_EDEFAULT.equals(sequenceNo);
			case XcorePackage.CONNECTOR__START_POINT_X:
				return START_POINT_X_EDEFAULT == null ? startPointX != null : !START_POINT_X_EDEFAULT.equals(startPointX);
			case XcorePackage.CONNECTOR__START_POINT_Y:
				return START_POINT_Y_EDEFAULT == null ? startPointY != null : !START_POINT_Y_EDEFAULT.equals(startPointY);
			case XcorePackage.CONNECTOR__STATE_FLAGS:
				return STATE_FLAGS_EDEFAULT == null ? stateFlags != null : !STATE_FLAGS_EDEFAULT.equals(stateFlags);
			case XcorePackage.CONNECTOR__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.CONNECTOR__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.CONNECTOR__SUB_TYPE:
				return SUB_TYPE_EDEFAULT == null ? subType != null : !SUB_TYPE_EDEFAULT.equals(subType);
			case XcorePackage.CONNECTOR__SUPPLIER:
				return supplier != null;
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				return taggedValues != null;
			case XcorePackage.CONNECTOR__TRANSITION_ACTION:
				return TRANSITION_ACTION_EDEFAULT == null ? transitionAction != null : !TRANSITION_ACTION_EDEFAULT.equals(transitionAction);
			case XcorePackage.CONNECTOR__TRANSITION_EVENT:
				return TRANSITION_EVENT_EDEFAULT == null ? transitionEvent != null : !TRANSITION_EVENT_EDEFAULT.equals(transitionEvent);
			case XcorePackage.CONNECTOR__TRANSITION_GUARD:
				return TRANSITION_GUARD_EDEFAULT == null ? transitionGuard != null : !TRANSITION_GUARD_EDEFAULT.equals(transitionGuard);
			case XcorePackage.CONNECTOR__TYPE:
				return type != TYPE_EDEFAULT;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				return VIRTUAL_INHERITANCE_EDEFAULT == null ? virtualInheritance != null : !VIRTUAL_INHERITANCE_EDEFAULT.equals(virtualInheritance);
			case XcorePackage.CONNECTOR__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case XcorePackage.CONNECTOR__SOURCE:
				return source != null;
			case XcorePackage.CONNECTOR__DEST:
				return dest != null;
			case XcorePackage.CONNECTOR__SOURCE_CARD:
				return SOURCE_CARD_EDEFAULT == null ? sourceCard != null : !SOURCE_CARD_EDEFAULT.equals(sourceCard);
			case XcorePackage.CONNECTOR__SOURCE_ACCESS:
				return SOURCE_ACCESS_EDEFAULT == null ? sourceAccess != null : !SOURCE_ACCESS_EDEFAULT.equals(sourceAccess);
			case XcorePackage.CONNECTOR__SOURCE_ELEMENT:
				return SOURCE_ELEMENT_EDEFAULT == null ? sourceElement != null : !SOURCE_ELEMENT_EDEFAULT.equals(sourceElement);
			case XcorePackage.CONNECTOR__SOURCE_ROLE:
				return SOURCE_ROLE_EDEFAULT == null ? sourceRole != null : !SOURCE_ROLE_EDEFAULT.equals(sourceRole);
			case XcorePackage.CONNECTOR__SOURCE_ROLE_TYPE:
				return SOURCE_ROLE_TYPE_EDEFAULT == null ? sourceRoleType != null : !SOURCE_ROLE_TYPE_EDEFAULT.equals(sourceRoleType);
			case XcorePackage.CONNECTOR__SOURCE_ROLE_NOTE:
				return SOURCE_ROLE_NOTE_EDEFAULT == null ? sourceRoleNote != null : !SOURCE_ROLE_NOTE_EDEFAULT.equals(sourceRoleNote);
			case XcorePackage.CONNECTOR__SOURCE_CONTAINMENT:
				return SOURCE_CONTAINMENT_EDEFAULT == null ? sourceContainment != null : !SOURCE_CONTAINMENT_EDEFAULT.equals(sourceContainment);
			case XcorePackage.CONNECTOR__SOURCE_IS_AGGREGATE:
				return sourceIsAggregate != SOURCE_IS_AGGREGATE_EDEFAULT;
			case XcorePackage.CONNECTOR__SOURCE_IS_ORDERED:
				return sourceIsOrdered != SOURCE_IS_ORDERED_EDEFAULT;
			case XcorePackage.CONNECTOR__SOURCE_QUALIFIER:
				return SOURCE_QUALIFIER_EDEFAULT == null ? sourceQualifier != null : !SOURCE_QUALIFIER_EDEFAULT.equals(sourceQualifier);
			case XcorePackage.CONNECTOR__DEST_CARD:
				return DEST_CARD_EDEFAULT == null ? destCard != null : !DEST_CARD_EDEFAULT.equals(destCard);
			case XcorePackage.CONNECTOR__DEST_ACCESS:
				return DEST_ACCESS_EDEFAULT == null ? destAccess != null : !DEST_ACCESS_EDEFAULT.equals(destAccess);
			case XcorePackage.CONNECTOR__DEST_ELEMENT:
				return DEST_ELEMENT_EDEFAULT == null ? destElement != null : !DEST_ELEMENT_EDEFAULT.equals(destElement);
			case XcorePackage.CONNECTOR__DEST_ROLE:
				return DEST_ROLE_EDEFAULT == null ? destRole != null : !DEST_ROLE_EDEFAULT.equals(destRole);
			case XcorePackage.CONNECTOR__DEST_ROLE_TYPE:
				return DEST_ROLE_TYPE_EDEFAULT == null ? destRoleType != null : !DEST_ROLE_TYPE_EDEFAULT.equals(destRoleType);
			case XcorePackage.CONNECTOR__DEST_ROLE_NOTE:
				return DEST_ROLE_NOTE_EDEFAULT == null ? destRoleNote != null : !DEST_ROLE_NOTE_EDEFAULT.equals(destRoleNote);
			case XcorePackage.CONNECTOR__DEST_CONTAINMENT:
				return DEST_CONTAINMENT_EDEFAULT == null ? destContainment != null : !DEST_CONTAINMENT_EDEFAULT.equals(destContainment);
			case XcorePackage.CONNECTOR__DEST_IS_AGGREGATE:
				return destIsAggregate != DEST_IS_AGGREGATE_EDEFAULT;
			case XcorePackage.CONNECTOR__DEST_IS_ORDERED:
				return destIsOrdered != DEST_IS_ORDERED_EDEFAULT;
			case XcorePackage.CONNECTOR__DEST_QUALIFIER:
				return DEST_QUALIFIER_EDEFAULT == null ? destQualifier != null : !DEST_QUALIFIER_EDEFAULT.equals(destQualifier);
			case XcorePackage.CONNECTOR__TOP_START_LABEL:
				return TOP_START_LABEL_EDEFAULT == null ? top_Start_Label != null : !TOP_START_LABEL_EDEFAULT.equals(top_Start_Label);
			case XcorePackage.CONNECTOR__TOP_MID_LABEL:
				return TOP_MID_LABEL_EDEFAULT == null ? top_Mid_Label != null : !TOP_MID_LABEL_EDEFAULT.equals(top_Mid_Label);
			case XcorePackage.CONNECTOR__TOP_END_LABEL:
				return TOP_END_LABEL_EDEFAULT == null ? top_End_Label != null : !TOP_END_LABEL_EDEFAULT.equals(top_End_Label);
			case XcorePackage.CONNECTOR__BTM_START_LABEL:
				return BTM_START_LABEL_EDEFAULT == null ? btm_StartLabel != null : !BTM_START_LABEL_EDEFAULT.equals(btm_StartLabel);
			case XcorePackage.CONNECTOR__BTM_MID_LABEL:
				return BTM_MID_LABEL_EDEFAULT == null ? btm_MidLabel != null : !BTM_MID_LABEL_EDEFAULT.equals(btm_MidLabel);
			case XcorePackage.CONNECTOR__BTM_END_LABEL:
				return BTM_END_LABEL_EDEFAULT == null ? btm_EndLabel != null : !BTM_END_LABEL_EDEFAULT.equals(btm_EndLabel);
			case XcorePackage.CONNECTOR__START_EDGE:
				return start_Edge != START_EDGE_EDEFAULT;
			case XcorePackage.CONNECTOR__END_EDGE:
				return end_Edge != END_EDGE_EDEFAULT;
			case XcorePackage.CONNECTOR__HEAD_STYLE:
				return headStyle != HEAD_STYLE_EDEFAULT;
			case XcorePackage.CONNECTOR__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Alias: ");
		result.append(alias);
		result.append(", Color: ");
		result.append(color);
		result.append(", ConnectorID: ");
		result.append(connectorID);
		result.append(", Direction: ");
		result.append(direction);
		result.append(", EndPointX: ");
		result.append(endPointX);
		result.append(", EndPointY: ");
		result.append(endPointY);
		result.append(", EventFlags: ");
		result.append(eventFlags);
		result.append(", IsLeaf: ");
		result.append(isLeaf);
		result.append(", IsRoot: ");
		result.append(isRoot);
		result.append(", IsSpec: ");
		result.append(isSpec);
		result.append(", MetaType: ");
		result.append(metaType);
		result.append(", MiscData: ");
		result.append(miscData);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", RouteStyle: ");
		result.append(routeStyle);
		result.append(", SequenceNo: ");
		result.append(sequenceNo);
		result.append(", StartPointX: ");
		result.append(startPointX);
		result.append(", StartPointY: ");
		result.append(startPointY);
		result.append(", StateFlags: ");
		result.append(stateFlags);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", SubType: ");
		result.append(subType);
		result.append(", TransitionAction: ");
		result.append(transitionAction);
		result.append(", TransitionEvent: ");
		result.append(transitionEvent);
		result.append(", TransitionGuard: ");
		result.append(transitionGuard);
		result.append(", Type: ");
		result.append(type);
		result.append(", VirtualInheritance: ");
		result.append(virtualInheritance);
		result.append(", Width: ");
		result.append(width);
		result.append(", SourceCard: ");
		result.append(sourceCard);
		result.append(", SourceAccess: ");
		result.append(sourceAccess);
		result.append(", SourceElement: ");
		result.append(sourceElement);
		result.append(", SourceRole: ");
		result.append(sourceRole);
		result.append(", SourceRoleType: ");
		result.append(sourceRoleType);
		result.append(", SourceRoleNote: ");
		result.append(sourceRoleNote);
		result.append(", SourceContainment: ");
		result.append(sourceContainment);
		result.append(", SourceIsAggregate: ");
		result.append(sourceIsAggregate);
		result.append(", SourceIsOrdered: ");
		result.append(sourceIsOrdered);
		result.append(", SourceQualifier: ");
		result.append(sourceQualifier);
		result.append(", DestCard: ");
		result.append(destCard);
		result.append(", DestAccess: ");
		result.append(destAccess);
		result.append(", DestElement: ");
		result.append(destElement);
		result.append(", DestRole: ");
		result.append(destRole);
		result.append(", DestRoleType: ");
		result.append(destRoleType);
		result.append(", DestRoleNote: ");
		result.append(destRoleNote);
		result.append(", DestContainment: ");
		result.append(destContainment);
		result.append(", DestIsAggregate: ");
		result.append(destIsAggregate);
		result.append(", DestIsOrdered: ");
		result.append(destIsOrdered);
		result.append(", DestQualifier: ");
		result.append(destQualifier);
		result.append(", Top_Start_Label: ");
		result.append(top_Start_Label);
		result.append(", Top_Mid_Label: ");
		result.append(top_Mid_Label);
		result.append(", Top_End_Label: ");
		result.append(top_End_Label);
		result.append(", Btm_StartLabel: ");
		result.append(btm_StartLabel);
		result.append(", Btm_MidLabel: ");
		result.append(btm_MidLabel);
		result.append(", Btm_EndLabel: ");
		result.append(btm_EndLabel);
		result.append(", Start_Edge: ");
		result.append(start_Edge);
		result.append(", End_Edge: ");
		result.append(end_Edge);
		result.append(", HeadStyle: ");
		result.append(headStyle);
		result.append(", LineStyle: ");
		result.append(lineStyle);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
