/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag;
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getTransitionGuard <em>Transition Guard</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl#getWidth <em>Width</em>}</li>
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
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

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
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR__SUBTYPE, oldSubtype, subtype));
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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
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
			case XcorePackage.CONNECTOR__SUBTYPE:
				return getSubtype();
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
			case XcorePackage.CONNECTOR__SUBTYPE:
				setSubtype((String)newValue);
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
				setType((String)newValue);
				return;
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance((String)newValue);
				return;
			case XcorePackage.CONNECTOR__WIDTH:
				setWidth((Long)newValue);
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
			case XcorePackage.CONNECTOR__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
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
			case XcorePackage.CONNECTOR__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
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
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XcorePackage.CONNECTOR__VIRTUAL_INHERITANCE:
				return VIRTUAL_INHERITANCE_EDEFAULT == null ? virtualInheritance != null : !VIRTUAL_INHERITANCE_EDEFAULT.equals(virtualInheritance);
			case XcorePackage.CONNECTOR__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(", Subtype: ");
		result.append(subtype);
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
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
