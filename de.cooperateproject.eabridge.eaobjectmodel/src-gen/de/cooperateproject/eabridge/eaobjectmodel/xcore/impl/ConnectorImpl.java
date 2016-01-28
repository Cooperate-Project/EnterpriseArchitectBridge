/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorType;
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPtEndX <em>Pt End X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPtEndY <em>Pt End Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getMiscData <em>Misc Data</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSeqNo <em>Seq No</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPtStartX <em>Pt Start X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPtStartY <em>Pt Start Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getActionFlags <em>Action Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceChangeable <em>Source Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceConstraint <em>Source Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceIsNavigable <em>Source Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceStereotype <em>Source Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceStyle <em>Source Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSourceTS <em>Source TS</em>}</li>
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestChangeable <em>Dest Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestConstraint <em>Dest Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestIsNavigable <em>Dest Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestStereotype <em>Dest Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestStyle <em>Dest Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDestTS <em>Dest TS</em>}</li>
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getDispatchAction <em>Dispatch Action</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPDATA1 <em>PDATA1</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPDATA2 <em>PDATA2</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPDATA3 <em>PDATA3</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPDATA4 <em>PDATA4</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getPDATA5 <em>PDATA5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
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
	 * The default value of the '{@link #getPtEndX() <em>Pt End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtEndX()
	 * @generated
	 * @ordered
	 */
	protected static final Long PT_END_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPtEndX() <em>Pt End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtEndX()
	 * @generated
	 * @ordered
	 */
	protected Long ptEndX = PT_END_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPtEndY() <em>Pt End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtEndY()
	 * @generated
	 * @ordered
	 */
	protected static final Long PT_END_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPtEndY() <em>Pt End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtEndY()
	 * @generated
	 * @ordered
	 */
	protected Long ptEndY = PT_END_Y_EDEFAULT;

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
	 * The default value of the '{@link #getSeqNo() <em>Seq No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNo()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEQ_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeqNo() <em>Seq No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNo()
	 * @generated
	 * @ordered
	 */
	protected Long seqNo = SEQ_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPtStartX() <em>Pt Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtStartX()
	 * @generated
	 * @ordered
	 */
	protected static final Long PT_START_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPtStartX() <em>Pt Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtStartX()
	 * @generated
	 * @ordered
	 */
	protected Long ptStartX = PT_START_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPtStartY() <em>Pt Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtStartY()
	 * @generated
	 * @ordered
	 */
	protected static final Long PT_START_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPtStartY() <em>Pt Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtStartY()
	 * @generated
	 * @ordered
	 */
	protected Long ptStartY = PT_START_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionFlags() <em>Action Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionFlags() <em>Action Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFlags()
	 * @generated
	 * @ordered
	 */
	protected String actionFlags = ACTION_FLAGS_EDEFAULT;

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
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected ConnectorTag taggedValues;

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
	 * The default value of the '{@link #getSourceChangeable() <em>Source Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CHANGEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceChangeable() <em>Source Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceChangeable()
	 * @generated
	 * @ordered
	 */
	protected String sourceChangeable = SOURCE_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceConstraint() <em>Source Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceConstraint() <em>Source Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConstraint()
	 * @generated
	 * @ordered
	 */
	protected String sourceConstraint = SOURCE_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceIsNavigable() <em>Source Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_IS_NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceIsNavigable() <em>Source Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected String sourceIsNavigable = SOURCE_IS_NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceStereotype() <em>Source Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceStereotype() <em>Source Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStereotype()
	 * @generated
	 * @ordered
	 */
	protected String sourceStereotype = SOURCE_STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceStyle() <em>Source Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceStyle() <em>Source Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStyle()
	 * @generated
	 * @ordered
	 */
	protected String sourceStyle = SOURCE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceTS() <em>Source TS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTS()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceTS() <em>Source TS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTS()
	 * @generated
	 * @ordered
	 */
	protected String sourceTS = SOURCE_TS_EDEFAULT;

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
	 * The default value of the '{@link #getDestChangeable() <em>Dest Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_CHANGEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestChangeable() <em>Dest Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestChangeable()
	 * @generated
	 * @ordered
	 */
	protected String destChangeable = DEST_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestConstraint() <em>Dest Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestConstraint() <em>Dest Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestConstraint()
	 * @generated
	 * @ordered
	 */
	protected String destConstraint = DEST_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestIsNavigable() <em>Dest Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_IS_NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestIsNavigable() <em>Dest Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected String destIsNavigable = DEST_IS_NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestStereotype() <em>Dest Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestStereotype() <em>Dest Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestStereotype()
	 * @generated
	 * @ordered
	 */
	protected String destStereotype = DEST_STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestStyle() <em>Dest Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestStyle() <em>Dest Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestStyle()
	 * @generated
	 * @ordered
	 */
	protected String destStyle = DEST_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestTS() <em>Dest TS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestTS()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_TS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestTS() <em>Dest TS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestTS()
	 * @generated
	 * @ordered
	 */
	protected String destTS = DEST_TS_EDEFAULT;

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
	 * The default value of the '{@link #getDispatchAction() <em>Dispatch Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchAction()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPATCH_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDispatchAction() <em>Dispatch Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchAction()
	 * @generated
	 * @ordered
	 */
	protected String dispatchAction = DISPATCH_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPDATA1() <em>PDATA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA1()
	 * @generated
	 * @ordered
	 */
	protected static final String PDATA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDATA1() <em>PDATA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA1()
	 * @generated
	 * @ordered
	 */
	protected String pdata1 = PDATA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPDATA2() <em>PDATA2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA2()
	 * @generated
	 * @ordered
	 */
	protected static final String PDATA2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDATA2() <em>PDATA2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA2()
	 * @generated
	 * @ordered
	 */
	protected String pdata2 = PDATA2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPDATA3() <em>PDATA3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA3()
	 * @generated
	 * @ordered
	 */
	protected static final String PDATA3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDATA3() <em>PDATA3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA3()
	 * @generated
	 * @ordered
	 */
	protected String pdata3 = PDATA3_EDEFAULT;

	/**
	 * The default value of the '{@link #getPDATA4() <em>PDATA4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA4()
	 * @generated
	 * @ordered
	 */
	protected static final String PDATA4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDATA4() <em>PDATA4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA4()
	 * @generated
	 * @ordered
	 */
	protected String pdata4 = PDATA4_EDEFAULT;

	/**
	 * The default value of the '{@link #getPDATA5() <em>PDATA5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA5()
	 * @generated
	 * @ordered
	 */
	protected static final String PDATA5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDATA5() <em>PDATA5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDATA5()
	 * @generated
	 * @ordered
	 */
	protected String pdata5 = PDATA5_EDEFAULT;

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
	public Long getPtEndX() {
		return ptEndX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtEndX(Long newPtEndX) {
		Long oldPtEndX = ptEndX;
		ptEndX = newPtEndX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PT_END_X, oldPtEndX, ptEndX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtEndY() {
		return ptEndY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtEndY(Long newPtEndY) {
		Long oldPtEndY = ptEndY;
		ptEndY = newPtEndY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PT_END_Y, oldPtEndY, ptEndY));
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
	public Long getSeqNo() {
		return seqNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqNo(Long newSeqNo) {
		Long oldSeqNo = seqNo;
		seqNo = newSeqNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SEQ_NO, oldSeqNo, seqNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtStartX() {
		return ptStartX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtStartX(Long newPtStartX) {
		Long oldPtStartX = ptStartX;
		ptStartX = newPtStartX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PT_START_X, oldPtStartX, ptStartX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtStartY() {
		return ptStartY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtStartY(Long newPtStartY) {
		Long oldPtStartY = ptStartY;
		ptStartY = newPtStartY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PT_START_Y, oldPtStartY, ptStartY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFlags() {
		return actionFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFlags(String newActionFlags) {
		String oldActionFlags = actionFlags;
		actionFlags = newActionFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__ACTION_FLAGS, oldActionFlags, actionFlags));
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
	public String getSourceChangeable() {
		return sourceChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceChangeable(String newSourceChangeable) {
		String oldSourceChangeable = sourceChangeable;
		sourceChangeable = newSourceChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_CHANGEABLE, oldSourceChangeable, sourceChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceConstraint() {
		return sourceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConstraint(String newSourceConstraint) {
		String oldSourceConstraint = sourceConstraint;
		sourceConstraint = newSourceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_CONSTRAINT, oldSourceConstraint, sourceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceIsNavigable() {
		return sourceIsNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsNavigable(String newSourceIsNavigable) {
		String oldSourceIsNavigable = sourceIsNavigable;
		sourceIsNavigable = newSourceIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_IS_NAVIGABLE, oldSourceIsNavigable, sourceIsNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceStereotype() {
		return sourceStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceStereotype(String newSourceStereotype) {
		String oldSourceStereotype = sourceStereotype;
		sourceStereotype = newSourceStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_STEREOTYPE, oldSourceStereotype, sourceStereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceStyle() {
		return sourceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceStyle(String newSourceStyle) {
		String oldSourceStyle = sourceStyle;
		sourceStyle = newSourceStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_STYLE, oldSourceStyle, sourceStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceTS() {
		return sourceTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTS(String newSourceTS) {
		String oldSourceTS = sourceTS;
		sourceTS = newSourceTS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SOURCE_TS, oldSourceTS, sourceTS));
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
	public String getDestChangeable() {
		return destChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestChangeable(String newDestChangeable) {
		String oldDestChangeable = destChangeable;
		destChangeable = newDestChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_CHANGEABLE, oldDestChangeable, destChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestConstraint() {
		return destConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestConstraint(String newDestConstraint) {
		String oldDestConstraint = destConstraint;
		destConstraint = newDestConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_CONSTRAINT, oldDestConstraint, destConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestIsNavigable() {
		return destIsNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestIsNavigable(String newDestIsNavigable) {
		String oldDestIsNavigable = destIsNavigable;
		destIsNavigable = newDestIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_IS_NAVIGABLE, oldDestIsNavigable, destIsNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestStereotype() {
		return destStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestStereotype(String newDestStereotype) {
		String oldDestStereotype = destStereotype;
		destStereotype = newDestStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_STEREOTYPE, oldDestStereotype, destStereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestStyle() {
		return destStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestStyle(String newDestStyle) {
		String oldDestStyle = destStyle;
		destStyle = newDestStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_STYLE, oldDestStyle, destStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestTS() {
		return destTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestTS(String newDestTS) {
		String oldDestTS = destTS;
		destTS = newDestTS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DEST_TS, oldDestTS, destTS));
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
	public String getDispatchAction() {
		return dispatchAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatchAction(String newDispatchAction) {
		String oldDispatchAction = dispatchAction;
		dispatchAction = newDispatchAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__DISPATCH_ACTION, oldDispatchAction, dispatchAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA1() {
		return pdata1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA1(String newPDATA1) {
		String oldPDATA1 = pdata1;
		pdata1 = newPDATA1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PDATA1, oldPDATA1, pdata1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA2() {
		return pdata2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA2(String newPDATA2) {
		String oldPDATA2 = pdata2;
		pdata2 = newPDATA2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PDATA2, oldPDATA2, pdata2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA3() {
		return pdata3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA3(String newPDATA3) {
		String oldPDATA3 = pdata3;
		pdata3 = newPDATA3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PDATA3, oldPDATA3, pdata3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA4() {
		return pdata4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA4(String newPDATA4) {
		String oldPDATA4 = pdata4;
		pdata4 = newPDATA4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PDATA4, oldPDATA4, pdata4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA5() {
		return pdata5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA5(String newPDATA5) {
		String oldPDATA5 = pdata5;
		pdata5 = newPDATA5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__PDATA5, oldPDATA5, pdata5));
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
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				return getConnectorID();
			case XcorePackage.CONNECTOR__DIRECTION:
				return getDirection();
			case XcorePackage.CONNECTOR__PT_END_X:
				return getPtEndX();
			case XcorePackage.CONNECTOR__PT_END_Y:
				return getPtEndY();
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
			case XcorePackage.CONNECTOR__SEQ_NO:
				return getSeqNo();
			case XcorePackage.CONNECTOR__PT_START_X:
				return getPtStartX();
			case XcorePackage.CONNECTOR__PT_START_Y:
				return getPtStartY();
			case XcorePackage.CONNECTOR__ACTION_FLAGS:
				return getActionFlags();
			case XcorePackage.CONNECTOR__STATE_FLAGS:
				return getStateFlags();
			case XcorePackage.CONNECTOR__STEREOTYPE:
				return getStereotype();
			case XcorePackage.CONNECTOR__STYLE_EX:
				return getStyleEx();
			case XcorePackage.CONNECTOR__SUB_TYPE:
				return getSubType();
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				return getTaggedValues();
			case XcorePackage.CONNECTOR__TYPE:
				return getType();
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				return getVirtualInheritance();
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
			case XcorePackage.CONNECTOR__SOURCE_CHANGEABLE:
				return getSourceChangeable();
			case XcorePackage.CONNECTOR__SOURCE_CONSTRAINT:
				return getSourceConstraint();
			case XcorePackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
				return getSourceIsNavigable();
			case XcorePackage.CONNECTOR__SOURCE_STEREOTYPE:
				return getSourceStereotype();
			case XcorePackage.CONNECTOR__SOURCE_STYLE:
				return getSourceStyle();
			case XcorePackage.CONNECTOR__SOURCE_TS:
				return getSourceTS();
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
			case XcorePackage.CONNECTOR__DEST_CHANGEABLE:
				return getDestChangeable();
			case XcorePackage.CONNECTOR__DEST_CONSTRAINT:
				return getDestConstraint();
			case XcorePackage.CONNECTOR__DEST_IS_NAVIGABLE:
				return getDestIsNavigable();
			case XcorePackage.CONNECTOR__DEST_STEREOTYPE:
				return getDestStereotype();
			case XcorePackage.CONNECTOR__DEST_STYLE:
				return getDestStyle();
			case XcorePackage.CONNECTOR__DEST_TS:
				return getDestTS();
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
			case XcorePackage.CONNECTOR__DISPATCH_ACTION:
				return getDispatchAction();
			case XcorePackage.CONNECTOR__PDATA1:
				return getPDATA1();
			case XcorePackage.CONNECTOR__PDATA2:
				return getPDATA2();
			case XcorePackage.CONNECTOR__PDATA3:
				return getPDATA3();
			case XcorePackage.CONNECTOR__PDATA4:
				return getPDATA4();
			case XcorePackage.CONNECTOR__PDATA5:
				return getPDATA5();
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
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				setConnectorID((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case XcorePackage.CONNECTOR__PT_END_X:
				setPtEndX((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__PT_END_Y:
				setPtEndY((Long)newValue);
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
			case XcorePackage.CONNECTOR__SEQ_NO:
				setSeqNo((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__PT_START_X:
				setPtStartX((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__PT_START_Y:
				setPtStartY((Long)newValue);
				return;
			case XcorePackage.CONNECTOR__ACTION_FLAGS:
				setActionFlags((String)newValue);
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
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				setTaggedValues((ConnectorTag)newValue);
				return;
			case XcorePackage.CONNECTOR__TYPE:
				setType((ConnectorType)newValue);
				return;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance((String)newValue);
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
			case XcorePackage.CONNECTOR__SOURCE_CHANGEABLE:
				setSourceChangeable((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_CONSTRAINT:
				setSourceConstraint((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
				setSourceIsNavigable((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_STEREOTYPE:
				setSourceStereotype((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_STYLE:
				setSourceStyle((String)newValue);
				return;
			case XcorePackage.CONNECTOR__SOURCE_TS:
				setSourceTS((String)newValue);
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
			case XcorePackage.CONNECTOR__DEST_CHANGEABLE:
				setDestChangeable((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_CONSTRAINT:
				setDestConstraint((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_IS_NAVIGABLE:
				setDestIsNavigable((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_STEREOTYPE:
				setDestStereotype((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_STYLE:
				setDestStyle((String)newValue);
				return;
			case XcorePackage.CONNECTOR__DEST_TS:
				setDestTS((String)newValue);
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
			case XcorePackage.CONNECTOR__DISPATCH_ACTION:
				setDispatchAction((String)newValue);
				return;
			case XcorePackage.CONNECTOR__PDATA1:
				setPDATA1((String)newValue);
				return;
			case XcorePackage.CONNECTOR__PDATA2:
				setPDATA2((String)newValue);
				return;
			case XcorePackage.CONNECTOR__PDATA3:
				setPDATA3((String)newValue);
				return;
			case XcorePackage.CONNECTOR__PDATA4:
				setPDATA4((String)newValue);
				return;
			case XcorePackage.CONNECTOR__PDATA5:
				setPDATA5((String)newValue);
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
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				setConnectorID(CONNECTOR_ID_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PT_END_X:
				setPtEndX(PT_END_X_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PT_END_Y:
				setPtEndY(PT_END_Y_EDEFAULT);
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
			case XcorePackage.CONNECTOR__SEQ_NO:
				setSeqNo(SEQ_NO_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PT_START_X:
				setPtStartX(PT_START_X_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PT_START_Y:
				setPtStartY(PT_START_Y_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__ACTION_FLAGS:
				setActionFlags(ACTION_FLAGS_EDEFAULT);
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
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				setTaggedValues((ConnectorTag)null);
				return;
			case XcorePackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance(VIRTUAL_INHERITANCE_EDEFAULT);
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
			case XcorePackage.CONNECTOR__SOURCE_CHANGEABLE:
				setSourceChangeable(SOURCE_CHANGEABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_CONSTRAINT:
				setSourceConstraint(SOURCE_CONSTRAINT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
				setSourceIsNavigable(SOURCE_IS_NAVIGABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_STEREOTYPE:
				setSourceStereotype(SOURCE_STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_STYLE:
				setSourceStyle(SOURCE_STYLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__SOURCE_TS:
				setSourceTS(SOURCE_TS_EDEFAULT);
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
			case XcorePackage.CONNECTOR__DEST_CHANGEABLE:
				setDestChangeable(DEST_CHANGEABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_CONSTRAINT:
				setDestConstraint(DEST_CONSTRAINT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_IS_NAVIGABLE:
				setDestIsNavigable(DEST_IS_NAVIGABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_STEREOTYPE:
				setDestStereotype(DEST_STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_STYLE:
				setDestStyle(DEST_STYLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__DEST_TS:
				setDestTS(DEST_TS_EDEFAULT);
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
			case XcorePackage.CONNECTOR__DISPATCH_ACTION:
				setDispatchAction(DISPATCH_ACTION_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PDATA1:
				setPDATA1(PDATA1_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PDATA2:
				setPDATA2(PDATA2_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PDATA3:
				setPDATA3(PDATA3_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PDATA4:
				setPDATA4(PDATA4_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR__PDATA5:
				setPDATA5(PDATA5_EDEFAULT);
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
			case XcorePackage.CONNECTOR__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorID != null : !CONNECTOR_ID_EDEFAULT.equals(connectorID);
			case XcorePackage.CONNECTOR__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case XcorePackage.CONNECTOR__PT_END_X:
				return PT_END_X_EDEFAULT == null ? ptEndX != null : !PT_END_X_EDEFAULT.equals(ptEndX);
			case XcorePackage.CONNECTOR__PT_END_Y:
				return PT_END_Y_EDEFAULT == null ? ptEndY != null : !PT_END_Y_EDEFAULT.equals(ptEndY);
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
			case XcorePackage.CONNECTOR__SEQ_NO:
				return SEQ_NO_EDEFAULT == null ? seqNo != null : !SEQ_NO_EDEFAULT.equals(seqNo);
			case XcorePackage.CONNECTOR__PT_START_X:
				return PT_START_X_EDEFAULT == null ? ptStartX != null : !PT_START_X_EDEFAULT.equals(ptStartX);
			case XcorePackage.CONNECTOR__PT_START_Y:
				return PT_START_Y_EDEFAULT == null ? ptStartY != null : !PT_START_Y_EDEFAULT.equals(ptStartY);
			case XcorePackage.CONNECTOR__ACTION_FLAGS:
				return ACTION_FLAGS_EDEFAULT == null ? actionFlags != null : !ACTION_FLAGS_EDEFAULT.equals(actionFlags);
			case XcorePackage.CONNECTOR__STATE_FLAGS:
				return STATE_FLAGS_EDEFAULT == null ? stateFlags != null : !STATE_FLAGS_EDEFAULT.equals(stateFlags);
			case XcorePackage.CONNECTOR__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.CONNECTOR__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.CONNECTOR__SUB_TYPE:
				return SUB_TYPE_EDEFAULT == null ? subType != null : !SUB_TYPE_EDEFAULT.equals(subType);
			case XcorePackage.CONNECTOR__TAGGED_VALUES:
				return taggedValues != null;
			case XcorePackage.CONNECTOR__TYPE:
				return type != TYPE_EDEFAULT;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				return VIRTUAL_INHERITANCE_EDEFAULT == null ? virtualInheritance != null : !VIRTUAL_INHERITANCE_EDEFAULT.equals(virtualInheritance);
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
			case XcorePackage.CONNECTOR__SOURCE_CHANGEABLE:
				return SOURCE_CHANGEABLE_EDEFAULT == null ? sourceChangeable != null : !SOURCE_CHANGEABLE_EDEFAULT.equals(sourceChangeable);
			case XcorePackage.CONNECTOR__SOURCE_CONSTRAINT:
				return SOURCE_CONSTRAINT_EDEFAULT == null ? sourceConstraint != null : !SOURCE_CONSTRAINT_EDEFAULT.equals(sourceConstraint);
			case XcorePackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
				return SOURCE_IS_NAVIGABLE_EDEFAULT == null ? sourceIsNavigable != null : !SOURCE_IS_NAVIGABLE_EDEFAULT.equals(sourceIsNavigable);
			case XcorePackage.CONNECTOR__SOURCE_STEREOTYPE:
				return SOURCE_STEREOTYPE_EDEFAULT == null ? sourceStereotype != null : !SOURCE_STEREOTYPE_EDEFAULT.equals(sourceStereotype);
			case XcorePackage.CONNECTOR__SOURCE_STYLE:
				return SOURCE_STYLE_EDEFAULT == null ? sourceStyle != null : !SOURCE_STYLE_EDEFAULT.equals(sourceStyle);
			case XcorePackage.CONNECTOR__SOURCE_TS:
				return SOURCE_TS_EDEFAULT == null ? sourceTS != null : !SOURCE_TS_EDEFAULT.equals(sourceTS);
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
			case XcorePackage.CONNECTOR__DEST_CHANGEABLE:
				return DEST_CHANGEABLE_EDEFAULT == null ? destChangeable != null : !DEST_CHANGEABLE_EDEFAULT.equals(destChangeable);
			case XcorePackage.CONNECTOR__DEST_CONSTRAINT:
				return DEST_CONSTRAINT_EDEFAULT == null ? destConstraint != null : !DEST_CONSTRAINT_EDEFAULT.equals(destConstraint);
			case XcorePackage.CONNECTOR__DEST_IS_NAVIGABLE:
				return DEST_IS_NAVIGABLE_EDEFAULT == null ? destIsNavigable != null : !DEST_IS_NAVIGABLE_EDEFAULT.equals(destIsNavigable);
			case XcorePackage.CONNECTOR__DEST_STEREOTYPE:
				return DEST_STEREOTYPE_EDEFAULT == null ? destStereotype != null : !DEST_STEREOTYPE_EDEFAULT.equals(destStereotype);
			case XcorePackage.CONNECTOR__DEST_STYLE:
				return DEST_STYLE_EDEFAULT == null ? destStyle != null : !DEST_STYLE_EDEFAULT.equals(destStyle);
			case XcorePackage.CONNECTOR__DEST_TS:
				return DEST_TS_EDEFAULT == null ? destTS != null : !DEST_TS_EDEFAULT.equals(destTS);
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
			case XcorePackage.CONNECTOR__DISPATCH_ACTION:
				return DISPATCH_ACTION_EDEFAULT == null ? dispatchAction != null : !DISPATCH_ACTION_EDEFAULT.equals(dispatchAction);
			case XcorePackage.CONNECTOR__PDATA1:
				return PDATA1_EDEFAULT == null ? pdata1 != null : !PDATA1_EDEFAULT.equals(pdata1);
			case XcorePackage.CONNECTOR__PDATA2:
				return PDATA2_EDEFAULT == null ? pdata2 != null : !PDATA2_EDEFAULT.equals(pdata2);
			case XcorePackage.CONNECTOR__PDATA3:
				return PDATA3_EDEFAULT == null ? pdata3 != null : !PDATA3_EDEFAULT.equals(pdata3);
			case XcorePackage.CONNECTOR__PDATA4:
				return PDATA4_EDEFAULT == null ? pdata4 != null : !PDATA4_EDEFAULT.equals(pdata4);
			case XcorePackage.CONNECTOR__PDATA5:
				return PDATA5_EDEFAULT == null ? pdata5 != null : !PDATA5_EDEFAULT.equals(pdata5);
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
		result.append(" (ConnectorID: ");
		result.append(connectorID);
		result.append(", Direction: ");
		result.append(direction);
		result.append(", PtEndX: ");
		result.append(ptEndX);
		result.append(", PtEndY: ");
		result.append(ptEndY);
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
		result.append(", SeqNo: ");
		result.append(seqNo);
		result.append(", PtStartX: ");
		result.append(ptStartX);
		result.append(", PtStartY: ");
		result.append(ptStartY);
		result.append(", ActionFlags: ");
		result.append(actionFlags);
		result.append(", StateFlags: ");
		result.append(stateFlags);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", SubType: ");
		result.append(subType);
		result.append(", Type: ");
		result.append(type);
		result.append(", VirtualInheritance: ");
		result.append(virtualInheritance);
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
		result.append(", SourceChangeable: ");
		result.append(sourceChangeable);
		result.append(", SourceConstraint: ");
		result.append(sourceConstraint);
		result.append(", SourceIsNavigable: ");
		result.append(sourceIsNavigable);
		result.append(", SourceStereotype: ");
		result.append(sourceStereotype);
		result.append(", SourceStyle: ");
		result.append(sourceStyle);
		result.append(", SourceTS: ");
		result.append(sourceTS);
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
		result.append(", DestChangeable: ");
		result.append(destChangeable);
		result.append(", DestConstraint: ");
		result.append(destConstraint);
		result.append(", DestIsNavigable: ");
		result.append(destIsNavigable);
		result.append(", DestStereotype: ");
		result.append(destStereotype);
		result.append(", DestStyle: ");
		result.append(destStyle);
		result.append(", DestTS: ");
		result.append(destTS);
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
		result.append(", DispatchAction: ");
		result.append(dispatchAction);
		result.append(", PDATA1: ");
		result.append(pdata1);
		result.append(", PDATA2: ");
		result.append(pdata2);
		result.append(", PDATA3: ");
		result.append(pdata3);
		result.append(", PDATA4: ");
		result.append(pdata4);
		result.append(", PDATA5: ");
		result.append(pdata5);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
