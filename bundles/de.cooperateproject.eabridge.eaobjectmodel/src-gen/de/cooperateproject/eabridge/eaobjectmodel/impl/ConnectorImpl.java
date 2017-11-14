/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.DirectionType;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.IsAggregate;

import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Optional;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getConnectorGUID <em>Connector GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPtEndX <em>Pt End X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPtEndY <em>Pt End Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSeqNo <em>Seq No</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPtStartX <em>Pt Start X</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPtStartY <em>Pt Start Y</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getActionFlags <em>Action Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceCard <em>Source Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceAccess <em>Source Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceRoleType <em>Source Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceRoleNote <em>Source Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceContainment <em>Source Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceIsAggregate <em>Source Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#isSourceIsOrdered <em>Source Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceQualifier <em>Source Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceChangeable <em>Source Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceConstraint <em>Source Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#isSourceIsNavigable <em>Source Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceStereotype <em>Source Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceStyle <em>Source Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getSourceTS <em>Source TS</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestCard <em>Dest Card</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestAccess <em>Dest Access</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestElement <em>Dest Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestRole <em>Dest Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestRoleType <em>Dest Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestRoleNote <em>Dest Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestContainment <em>Dest Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestIsAggregate <em>Dest Is Aggregate</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#isDestIsOrdered <em>Dest Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestQualifier <em>Dest Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestChangeable <em>Dest Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestConstraint <em>Dest Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#isDestIsNavigable <em>Dest Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestStereotype <em>Dest Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestStyle <em>Dest Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDestTS <em>Dest TS</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getTop_Start_Label <em>Top Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getTop_Mid_Label <em>Top Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getTop_End_Label <em>Top End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getBtm_Start_Label <em>Btm Start Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getBtm_Mid_Label <em>Btm Mid Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getBtm_End_Label <em>Btm End Label</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getStart_Edge <em>Start Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getEnd_Edge <em>End Edge</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getHeadStyle <em>Head Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getDispatchAction <em>Dispatch Action</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPDATA1 <em>PDATA1</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPDATA2 <em>PDATA2</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPDATA3 <em>PDATA3</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPDATA4 <em>PDATA4</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl#getPDATA5 <em>PDATA5</em>}</li>
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
     * The default value of the '{@link #getConnectorGUID() <em>Connector GUID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectorGUID()
     * @generated
     * @ordered
     */
	protected static final String CONNECTOR_GUID_EDEFAULT = null;
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
     * The default value of the '{@link #getPtEndX() <em>Pt End X</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPtEndX()
     * @generated
     * @ordered
     */
	protected static final Long PT_END_X_EDEFAULT = null;
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
     * The default value of the '{@link #getEventFlags() <em>Event Flags</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEventFlags()
     * @generated
     * @ordered
     */
	protected static final String EVENT_FLAGS_EDEFAULT = null;
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
     * The default value of the '{@link #getIsRoot() <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIsRoot()
     * @generated
     * @ordered
     */
	protected static final Boolean IS_ROOT_EDEFAULT = null;
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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;
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
     * The default value of the '{@link #getRouteStyle() <em>Route Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRouteStyle()
     * @generated
     * @ordered
     */
	protected static final Long ROUTE_STYLE_EDEFAULT = null;
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
     * The default value of the '{@link #getPtStartX() <em>Pt Start X</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPtStartX()
     * @generated
     * @ordered
     */
	protected static final Long PT_START_X_EDEFAULT = null;
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
     * The default value of the '{@link #getActionFlags() <em>Action Flags</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getActionFlags()
     * @generated
     * @ordered
     */
	protected static final String ACTION_FLAGS_EDEFAULT = null;
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
     * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
	protected static final String STEREOTYPE_EDEFAULT = null;
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
     * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubType()
     * @generated
     * @ordered
     */
	protected static final String SUB_TYPE_EDEFAULT = null;
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
     * The default value of the '{@link #getVirtualInheritance() <em>Virtual Inheritance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVirtualInheritance()
     * @generated
     * @ordered
     */
	protected static final String VIRTUAL_INHERITANCE_EDEFAULT = null;
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
     * The default value of the '{@link #getSourceAccess() <em>Source Access</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceAccess()
     * @generated
     * @ordered
     */
	protected static final Scope SOURCE_ACCESS_EDEFAULT = Scope.PUBLIC;
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
     * The default value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceRole()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_ROLE_EDEFAULT = null;
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
     * The default value of the '{@link #getSourceRoleNote() <em>Source Role Note</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceRoleNote()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_ROLE_NOTE_EDEFAULT = null;
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
     * The default value of the '{@link #getSourceIsAggregate() <em>Source Is Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceIsAggregate()
     * @generated
     * @ordered
     */
	protected static final IsAggregate SOURCE_IS_AGGREGATE_EDEFAULT = IsAggregate.FALSE;
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
     * The default value of the '{@link #getSourceQualifier() <em>Source Qualifier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceQualifier()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_QUALIFIER_EDEFAULT = null;
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
     * The default value of the '{@link #getSourceConstraint() <em>Source Constraint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceConstraint()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_CONSTRAINT_EDEFAULT = null;
	/**
     * The default value of the '{@link #isSourceIsNavigable() <em>Source Is Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSourceIsNavigable()
     * @generated
     * @ordered
     */
	protected static final boolean SOURCE_IS_NAVIGABLE_EDEFAULT = false;
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
     * The default value of the '{@link #getSourceStyle() <em>Source Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceStyle()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_STYLE_EDEFAULT = null;
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
     * The default value of the '{@link #getDestCard() <em>Dest Card</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestCard()
     * @generated
     * @ordered
     */
	protected static final String DEST_CARD_EDEFAULT = null;
	/**
     * The default value of the '{@link #getDestAccess() <em>Dest Access</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestAccess()
     * @generated
     * @ordered
     */
	protected static final Scope DEST_ACCESS_EDEFAULT = Scope.PUBLIC;
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
     * The default value of the '{@link #getDestRole() <em>Dest Role</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestRole()
     * @generated
     * @ordered
     */
	protected static final String DEST_ROLE_EDEFAULT = null;
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
     * The default value of the '{@link #getDestRoleNote() <em>Dest Role Note</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestRoleNote()
     * @generated
     * @ordered
     */
	protected static final String DEST_ROLE_NOTE_EDEFAULT = null;
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
     * The default value of the '{@link #getDestIsAggregate() <em>Dest Is Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestIsAggregate()
     * @generated
     * @ordered
     */
	protected static final IsAggregate DEST_IS_AGGREGATE_EDEFAULT = IsAggregate.FALSE;
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
     * The default value of the '{@link #getDestQualifier() <em>Dest Qualifier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestQualifier()
     * @generated
     * @ordered
     */
	protected static final String DEST_QUALIFIER_EDEFAULT = null;
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
     * The default value of the '{@link #getDestConstraint() <em>Dest Constraint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestConstraint()
     * @generated
     * @ordered
     */
	protected static final String DEST_CONSTRAINT_EDEFAULT = null;
	/**
     * The default value of the '{@link #isDestIsNavigable() <em>Dest Is Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDestIsNavigable()
     * @generated
     * @ordered
     */
	protected static final boolean DEST_IS_NAVIGABLE_EDEFAULT = false;
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
     * The default value of the '{@link #getDestStyle() <em>Dest Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestStyle()
     * @generated
     * @ordered
     */
	protected static final String DEST_STYLE_EDEFAULT = null;
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
     * The default value of the '{@link #getTop_Start_Label() <em>Top Start Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTop_Start_Label()
     * @generated
     * @ordered
     */
	protected static final String TOP_START_LABEL_EDEFAULT = null;
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
     * The default value of the '{@link #getTop_End_Label() <em>Top End Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTop_End_Label()
     * @generated
     * @ordered
     */
	protected static final String TOP_END_LABEL_EDEFAULT = null;
	/**
     * The default value of the '{@link #getBtm_Start_Label() <em>Btm Start Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBtm_Start_Label()
     * @generated
     * @ordered
     */
	protected static final String BTM_START_LABEL_EDEFAULT = null;
	/**
     * The default value of the '{@link #getBtm_Mid_Label() <em>Btm Mid Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBtm_Mid_Label()
     * @generated
     * @ordered
     */
	protected static final String BTM_MID_LABEL_EDEFAULT = null;
	/**
     * The default value of the '{@link #getBtm_End_Label() <em>Btm End Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBtm_End_Label()
     * @generated
     * @ordered
     */
	protected static final String BTM_END_LABEL_EDEFAULT = null;
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
     * The default value of the '{@link #getEnd_Edge() <em>End Edge</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEnd_Edge()
     * @generated
     * @ordered
     */
	protected static final int END_EDGE_EDEFAULT = 0;
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
     * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLineStyle()
     * @generated
     * @ordered
     */
	protected static final int LINE_STYLE_EDEFAULT = 0;
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
     * The default value of the '{@link #getPDATA1() <em>PDATA1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPDATA1()
     * @generated
     * @ordered
     */
	protected static final String PDATA1_EDEFAULT = null;
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
     * The default value of the '{@link #getPDATA3() <em>PDATA3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPDATA3()
     * @generated
     * @ordered
     */
	protected static final String PDATA3_EDEFAULT = null;
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
     * The default value of the '{@link #getPDATA5() <em>PDATA5</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPDATA5()
     * @generated
     * @ordered
     */
	protected static final String PDATA5_EDEFAULT = null;

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
        return EaobjectmodelPackage.Literals.CONNECTOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected int eStaticFeatureCount() {
        return 0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getConnectorID() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__CONNECTOR_ID, EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_ID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectorID(Long newConnectorID) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__CONNECTOR_ID, EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_ID, newConnectorID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getConnectorGUID() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__CONNECTOR_GUID, EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_GUID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectorGUID(String newConnectorGUID) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__CONNECTOR_GUID, EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_GUID, newConnectorGUID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DirectionType getDirection() {
        return (DirectionType)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DIRECTION, EaobjectmodelPackage.Literals.CONNECTOR__DIRECTION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDirection(DirectionType newDirection) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DIRECTION, EaobjectmodelPackage.Literals.CONNECTOR__DIRECTION, newDirection);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getPtEndX() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PT_END_X, EaobjectmodelPackage.Literals.CONNECTOR__PT_END_X, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPtEndX(Long newPtEndX) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PT_END_X, EaobjectmodelPackage.Literals.CONNECTOR__PT_END_X, newPtEndX);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getPtEndY() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PT_END_Y, EaobjectmodelPackage.Literals.CONNECTOR__PT_END_Y, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPtEndY(Long newPtEndY) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PT_END_Y, EaobjectmodelPackage.Literals.CONNECTOR__PT_END_Y, newPtEndY);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getEventFlags() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__EVENT_FLAGS, EaobjectmodelPackage.Literals.CONNECTOR__EVENT_FLAGS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEventFlags(String newEventFlags) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__EVENT_FLAGS, EaobjectmodelPackage.Literals.CONNECTOR__EVENT_FLAGS, newEventFlags);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsLeaf() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__IS_LEAF, EaobjectmodelPackage.Literals.CONNECTOR__IS_LEAF, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsLeaf(Boolean newIsLeaf) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__IS_LEAF, EaobjectmodelPackage.Literals.CONNECTOR__IS_LEAF, newIsLeaf);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsRoot() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__IS_ROOT, EaobjectmodelPackage.Literals.CONNECTOR__IS_ROOT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsRoot(Boolean newIsRoot) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__IS_ROOT, EaobjectmodelPackage.Literals.CONNECTOR__IS_ROOT, newIsRoot);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsSpec() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__IS_SPEC, EaobjectmodelPackage.Literals.CONNECTOR__IS_SPEC, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsSpec(Boolean newIsSpec) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__IS_SPEC, EaobjectmodelPackage.Literals.CONNECTOR__IS_SPEC, newIsSpec);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__NAME, EaobjectmodelPackage.Literals.CONNECTOR__NAME, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__NAME, EaobjectmodelPackage.Literals.CONNECTOR__NAME, newName);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getNotes() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__NOTES, EaobjectmodelPackage.Literals.CONNECTOR__NOTES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNotes(String newNotes) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__NOTES, EaobjectmodelPackage.Literals.CONNECTOR__NOTES, newNotes);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getRouteStyle() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__ROUTE_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__ROUTE_STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRouteStyle(Long newRouteStyle) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__ROUTE_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__ROUTE_STYLE, newRouteStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getSeqNo() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SEQ_NO, EaobjectmodelPackage.Literals.CONNECTOR__SEQ_NO, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSeqNo(Long newSeqNo) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SEQ_NO, EaobjectmodelPackage.Literals.CONNECTOR__SEQ_NO, newSeqNo);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getPtStartX() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PT_START_X, EaobjectmodelPackage.Literals.CONNECTOR__PT_START_X, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPtStartX(Long newPtStartX) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PT_START_X, EaobjectmodelPackage.Literals.CONNECTOR__PT_START_X, newPtStartX);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getPtStartY() {
        return (Long)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PT_START_Y, EaobjectmodelPackage.Literals.CONNECTOR__PT_START_Y, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPtStartY(Long newPtStartY) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PT_START_Y, EaobjectmodelPackage.Literals.CONNECTOR__PT_START_Y, newPtStartY);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getActionFlags() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__ACTION_FLAGS, EaobjectmodelPackage.Literals.CONNECTOR__ACTION_FLAGS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setActionFlags(String newActionFlags) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__ACTION_FLAGS, EaobjectmodelPackage.Literals.CONNECTOR__ACTION_FLAGS, newActionFlags);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStateFlags() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__STATE_FLAGS, EaobjectmodelPackage.Literals.CONNECTOR__STATE_FLAGS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStateFlags(String newStateFlags) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__STATE_FLAGS, EaobjectmodelPackage.Literals.CONNECTOR__STATE_FLAGS, newStateFlags);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStereotype() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__STEREOTYPE, EaobjectmodelPackage.Literals.CONNECTOR__STEREOTYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStereotype(String newStereotype) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__STEREOTYPE, EaobjectmodelPackage.Literals.CONNECTOR__STEREOTYPE, newStereotype);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStyleEx() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__STYLE_EX, EaobjectmodelPackage.Literals.CONNECTOR__STYLE_EX, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStyleEx(String newStyleEx) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__STYLE_EX, EaobjectmodelPackage.Literals.CONNECTOR__STYLE_EX, newStyleEx);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSubType() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SUB_TYPE, EaobjectmodelPackage.Literals.CONNECTOR__SUB_TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSubType(String newSubType) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SUB_TYPE, EaobjectmodelPackage.Literals.CONNECTOR__SUB_TYPE, newSubType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectorType getType() {
        return (ConnectorType)eDynamicGet(EaobjectmodelPackage.CONNECTOR__TYPE, EaobjectmodelPackage.Literals.CONNECTOR__TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(ConnectorType newType) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__TYPE, EaobjectmodelPackage.Literals.CONNECTOR__TYPE, newType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getVirtualInheritance() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__VIRTUAL_INHERITANCE, EaobjectmodelPackage.Literals.CONNECTOR__VIRTUAL_INHERITANCE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVirtualInheritance(String newVirtualInheritance) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__VIRTUAL_INHERITANCE, EaobjectmodelPackage.Literals.CONNECTOR__VIRTUAL_INHERITANCE, newVirtualInheritance);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element getSource() {
        return (Element)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element basicGetSource() {
        return (Element)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSource(Element newSource, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSource, EaobjectmodelPackage.CONNECTOR__SOURCE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSource(Element newSource) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE, newSource);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element getDest() {
        return (Element)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST, EaobjectmodelPackage.Literals.CONNECTOR__DEST, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element basicGetDest() {
        return (Element)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST, EaobjectmodelPackage.Literals.CONNECTOR__DEST, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDest(Element newDest) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST, EaobjectmodelPackage.Literals.CONNECTOR__DEST, newDest);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceCard() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_CARD, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CARD, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceCard(String newSourceCard) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_CARD, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CARD, newSourceCard);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Scope getSourceAccess() {
        return (Scope)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_ACCESS, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ACCESS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceAccess(Scope newSourceAccess) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_ACCESS, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ACCESS, newSourceAccess);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceElement() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_ELEMENT, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceElement(String newSourceElement) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_ELEMENT, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ELEMENT, newSourceElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceRole() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceRole(String newSourceRole) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE, newSourceRole);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceRoleType() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_TYPE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceRoleType(String newSourceRoleType) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_TYPE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_TYPE, newSourceRoleType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceRoleNote() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_NOTE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_NOTE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceRoleNote(String newSourceRoleNote) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_NOTE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_NOTE, newSourceRoleNote);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceContainment() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_CONTAINMENT, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONTAINMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceContainment(String newSourceContainment) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_CONTAINMENT, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONTAINMENT, newSourceContainment);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IsAggregate getSourceIsAggregate() {
        return (IsAggregate)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_IS_AGGREGATE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_AGGREGATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceIsAggregate(IsAggregate newSourceIsAggregate) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_IS_AGGREGATE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_AGGREGATE, newSourceIsAggregate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSourceIsOrdered() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_IS_ORDERED, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_ORDERED, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceIsOrdered(boolean newSourceIsOrdered) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_IS_ORDERED, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_ORDERED, newSourceIsOrdered);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceQualifier() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_QUALIFIER, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_QUALIFIER, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceQualifier(String newSourceQualifier) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_QUALIFIER, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_QUALIFIER, newSourceQualifier);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceChangeable() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_CHANGEABLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CHANGEABLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceChangeable(String newSourceChangeable) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_CHANGEABLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CHANGEABLE, newSourceChangeable);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceConstraint() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_CONSTRAINT, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONSTRAINT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceConstraint(String newSourceConstraint) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_CONSTRAINT, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONSTRAINT, newSourceConstraint);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSourceIsNavigable() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_IS_NAVIGABLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_NAVIGABLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceIsNavigable(boolean newSourceIsNavigable) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_IS_NAVIGABLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_NAVIGABLE, newSourceIsNavigable);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceStereotype() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_STEREOTYPE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STEREOTYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceStereotype(String newSourceStereotype) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_STEREOTYPE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STEREOTYPE, newSourceStereotype);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceStyle() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceStyle(String newSourceStyle) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STYLE, newSourceStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceTS() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__SOURCE_TS, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_TS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceTS(String newSourceTS) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__SOURCE_TS, EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_TS, newSourceTS);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestCard() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_CARD, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CARD, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestCard(String newDestCard) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_CARD, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CARD, newDestCard);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Scope getDestAccess() {
        return (Scope)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_ACCESS, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ACCESS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestAccess(Scope newDestAccess) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_ACCESS, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ACCESS, newDestAccess);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestElement() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_ELEMENT, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestElement(String newDestElement) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_ELEMENT, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ELEMENT, newDestElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestRole() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_ROLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestRole(String newDestRole) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_ROLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE, newDestRole);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestRoleType() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_ROLE_TYPE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestRoleType(String newDestRoleType) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_ROLE_TYPE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_TYPE, newDestRoleType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestRoleNote() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_ROLE_NOTE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_NOTE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestRoleNote(String newDestRoleNote) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_ROLE_NOTE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_NOTE, newDestRoleNote);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestContainment() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_CONTAINMENT, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONTAINMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestContainment(String newDestContainment) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_CONTAINMENT, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONTAINMENT, newDestContainment);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IsAggregate getDestIsAggregate() {
        return (IsAggregate)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_IS_AGGREGATE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_AGGREGATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestIsAggregate(IsAggregate newDestIsAggregate) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_IS_AGGREGATE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_AGGREGATE, newDestIsAggregate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDestIsOrdered() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_IS_ORDERED, EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_ORDERED, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestIsOrdered(boolean newDestIsOrdered) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_IS_ORDERED, EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_ORDERED, newDestIsOrdered);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestQualifier() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_QUALIFIER, EaobjectmodelPackage.Literals.CONNECTOR__DEST_QUALIFIER, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestQualifier(String newDestQualifier) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_QUALIFIER, EaobjectmodelPackage.Literals.CONNECTOR__DEST_QUALIFIER, newDestQualifier);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestChangeable() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_CHANGEABLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CHANGEABLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestChangeable(String newDestChangeable) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_CHANGEABLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CHANGEABLE, newDestChangeable);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestConstraint() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_CONSTRAINT, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONSTRAINT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestConstraint(String newDestConstraint) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_CONSTRAINT, EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONSTRAINT, newDestConstraint);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDestIsNavigable() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_IS_NAVIGABLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_NAVIGABLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestIsNavigable(boolean newDestIsNavigable) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_IS_NAVIGABLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_NAVIGABLE, newDestIsNavigable);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestStereotype() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_STEREOTYPE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_STEREOTYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestStereotype(String newDestStereotype) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_STEREOTYPE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_STEREOTYPE, newDestStereotype);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestStyle() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestStyle(String newDestStyle) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__DEST_STYLE, newDestStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestTS() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DEST_TS, EaobjectmodelPackage.Literals.CONNECTOR__DEST_TS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestTS(String newDestTS) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DEST_TS, EaobjectmodelPackage.Literals.CONNECTOR__DEST_TS, newDestTS);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTop_Start_Label() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__TOP_START_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__TOP_START_LABEL, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTop_Start_Label(String newTop_Start_Label) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__TOP_START_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__TOP_START_LABEL, newTop_Start_Label);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTop_Mid_Label() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__TOP_MID_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__TOP_MID_LABEL, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTop_Mid_Label(String newTop_Mid_Label) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__TOP_MID_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__TOP_MID_LABEL, newTop_Mid_Label);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTop_End_Label() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__TOP_END_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__TOP_END_LABEL, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTop_End_Label(String newTop_End_Label) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__TOP_END_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__TOP_END_LABEL, newTop_End_Label);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getBtm_Start_Label() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__BTM_START_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__BTM_START_LABEL, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBtm_Start_Label(String newBtm_Start_Label) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__BTM_START_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__BTM_START_LABEL, newBtm_Start_Label);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getBtm_Mid_Label() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__BTM_MID_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__BTM_MID_LABEL, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBtm_Mid_Label(String newBtm_Mid_Label) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__BTM_MID_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__BTM_MID_LABEL, newBtm_Mid_Label);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getBtm_End_Label() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__BTM_END_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__BTM_END_LABEL, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBtm_End_Label(String newBtm_End_Label) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__BTM_END_LABEL, EaobjectmodelPackage.Literals.CONNECTOR__BTM_END_LABEL, newBtm_End_Label);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getStart_Edge() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.CONNECTOR__START_EDGE, EaobjectmodelPackage.Literals.CONNECTOR__START_EDGE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStart_Edge(int newStart_Edge) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__START_EDGE, EaobjectmodelPackage.Literals.CONNECTOR__START_EDGE, newStart_Edge);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getEnd_Edge() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.CONNECTOR__END_EDGE, EaobjectmodelPackage.Literals.CONNECTOR__END_EDGE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEnd_Edge(int newEnd_Edge) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__END_EDGE, EaobjectmodelPackage.Literals.CONNECTOR__END_EDGE, newEnd_Edge);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getHeadStyle() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.CONNECTOR__HEAD_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__HEAD_STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHeadStyle(int newHeadStyle) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__HEAD_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__HEAD_STYLE, newHeadStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getLineStyle() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.CONNECTOR__LINE_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__LINE_STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLineStyle(int newLineStyle) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__LINE_STYLE, EaobjectmodelPackage.Literals.CONNECTOR__LINE_STYLE, newLineStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDispatchAction() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__DISPATCH_ACTION, EaobjectmodelPackage.Literals.CONNECTOR__DISPATCH_ACTION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDispatchAction(String newDispatchAction) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__DISPATCH_ACTION, EaobjectmodelPackage.Literals.CONNECTOR__DISPATCH_ACTION, newDispatchAction);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPDATA1() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PDATA1, EaobjectmodelPackage.Literals.CONNECTOR__PDATA1, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPDATA1(String newPDATA1) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PDATA1, EaobjectmodelPackage.Literals.CONNECTOR__PDATA1, newPDATA1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPDATA2() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PDATA2, EaobjectmodelPackage.Literals.CONNECTOR__PDATA2, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPDATA2(String newPDATA2) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PDATA2, EaobjectmodelPackage.Literals.CONNECTOR__PDATA2, newPDATA2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPDATA3() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PDATA3, EaobjectmodelPackage.Literals.CONNECTOR__PDATA3, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPDATA3(String newPDATA3) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PDATA3, EaobjectmodelPackage.Literals.CONNECTOR__PDATA3, newPDATA3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPDATA4() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PDATA4, EaobjectmodelPackage.Literals.CONNECTOR__PDATA4, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPDATA4(String newPDATA4) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PDATA4, EaobjectmodelPackage.Literals.CONNECTOR__PDATA4, newPDATA4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPDATA5() {
        return (String)eDynamicGet(EaobjectmodelPackage.CONNECTOR__PDATA5, EaobjectmodelPackage.Literals.CONNECTOR__PDATA5, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPDATA5(String newPDATA5) {
        eDynamicSet(EaobjectmodelPackage.CONNECTOR__PDATA5, EaobjectmodelPackage.Literals.CONNECTOR__PDATA5, newPDATA5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSourceLower() {
        String sourceCard = getSourceCard();
        if (sourceCard != null) {
        String[] cards = sourceCard.split("\\.\\.");
            return Integer.parseInt(cards[0]);
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSourceUpper() {
        String sourceCard = getSourceCard();
        if (sourceCard != null) {
            String[] cards = sourceCard.split("\\.\\.");
            int relevantIndex = Math.max(0, cards.length -1);
            return Integer.parseInt(cards[relevantIndex]);
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDestLower() {
        String destCard = getDestCard();
        if (destCard != null) {
        String[] cards = destCard.split("\\.\\.");
            return Integer.parseInt(cards[0]);
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDestUpper() {
        String destCard = getDestCard();
        if (destCard != null) {
            String[] cards = destCard.split("\\.\\.");
            int relevantIndex = Math.max(0, cards.length -1);
            return Integer.parseInt(cards[relevantIndex]);
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSourceAlias() {
        String sourceStyle = getSourceStyle();
        Optional<String> alias = Arrays.asList(sourceStyle.split(";")).stream()
            .filter(att -> att.startsWith("alias"))
            .findAny();
                
        if (alias.isPresent() && alias.get().split("=").length == 2) {
            return alias.get().split("=")[1];
        } else {
            return "";
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDestAlias() {
        String destStyle = getDestStyle();
        Optional<String> alias = Arrays.asList(destStyle.split(";")).stream()
            .filter(att -> att.startsWith("alias"))
            .findAny();
                
        if (alias.isPresent() && alias.get().split("=").length == 2) {
            return alias.get().split("=")[1];
        } else {
            return "";
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSource((Element)otherEnd, msgs);
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
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                return basicSetSource(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS, Element.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_ID:
                return getConnectorID();
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_GUID:
                return getConnectorGUID();
            case EaobjectmodelPackage.CONNECTOR__DIRECTION:
                return getDirection();
            case EaobjectmodelPackage.CONNECTOR__PT_END_X:
                return getPtEndX();
            case EaobjectmodelPackage.CONNECTOR__PT_END_Y:
                return getPtEndY();
            case EaobjectmodelPackage.CONNECTOR__EVENT_FLAGS:
                return getEventFlags();
            case EaobjectmodelPackage.CONNECTOR__IS_LEAF:
                return getIsLeaf();
            case EaobjectmodelPackage.CONNECTOR__IS_ROOT:
                return getIsRoot();
            case EaobjectmodelPackage.CONNECTOR__IS_SPEC:
                return getIsSpec();
            case EaobjectmodelPackage.CONNECTOR__NAME:
                return getName();
            case EaobjectmodelPackage.CONNECTOR__NOTES:
                return getNotes();
            case EaobjectmodelPackage.CONNECTOR__ROUTE_STYLE:
                return getRouteStyle();
            case EaobjectmodelPackage.CONNECTOR__SEQ_NO:
                return getSeqNo();
            case EaobjectmodelPackage.CONNECTOR__PT_START_X:
                return getPtStartX();
            case EaobjectmodelPackage.CONNECTOR__PT_START_Y:
                return getPtStartY();
            case EaobjectmodelPackage.CONNECTOR__ACTION_FLAGS:
                return getActionFlags();
            case EaobjectmodelPackage.CONNECTOR__STATE_FLAGS:
                return getStateFlags();
            case EaobjectmodelPackage.CONNECTOR__STEREOTYPE:
                return getStereotype();
            case EaobjectmodelPackage.CONNECTOR__STYLE_EX:
                return getStyleEx();
            case EaobjectmodelPackage.CONNECTOR__SUB_TYPE:
                return getSubType();
            case EaobjectmodelPackage.CONNECTOR__TYPE:
                return getType();
            case EaobjectmodelPackage.CONNECTOR__VIRTUAL_INHERITANCE:
                return getVirtualInheritance();
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case EaobjectmodelPackage.CONNECTOR__DEST:
                if (resolve) return getDest();
                return basicGetDest();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CARD:
                return getSourceCard();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ACCESS:
                return getSourceAccess();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ELEMENT:
                return getSourceElement();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE:
                return getSourceRole();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_TYPE:
                return getSourceRoleType();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_NOTE:
                return getSourceRoleNote();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONTAINMENT:
                return getSourceContainment();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_AGGREGATE:
                return getSourceIsAggregate();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_ORDERED:
                return isSourceIsOrdered();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_QUALIFIER:
                return getSourceQualifier();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CHANGEABLE:
                return getSourceChangeable();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONSTRAINT:
                return getSourceConstraint();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
                return isSourceIsNavigable();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STEREOTYPE:
                return getSourceStereotype();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STYLE:
                return getSourceStyle();
            case EaobjectmodelPackage.CONNECTOR__SOURCE_TS:
                return getSourceTS();
            case EaobjectmodelPackage.CONNECTOR__DEST_CARD:
                return getDestCard();
            case EaobjectmodelPackage.CONNECTOR__DEST_ACCESS:
                return getDestAccess();
            case EaobjectmodelPackage.CONNECTOR__DEST_ELEMENT:
                return getDestElement();
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE:
                return getDestRole();
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_TYPE:
                return getDestRoleType();
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_NOTE:
                return getDestRoleNote();
            case EaobjectmodelPackage.CONNECTOR__DEST_CONTAINMENT:
                return getDestContainment();
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_AGGREGATE:
                return getDestIsAggregate();
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_ORDERED:
                return isDestIsOrdered();
            case EaobjectmodelPackage.CONNECTOR__DEST_QUALIFIER:
                return getDestQualifier();
            case EaobjectmodelPackage.CONNECTOR__DEST_CHANGEABLE:
                return getDestChangeable();
            case EaobjectmodelPackage.CONNECTOR__DEST_CONSTRAINT:
                return getDestConstraint();
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_NAVIGABLE:
                return isDestIsNavigable();
            case EaobjectmodelPackage.CONNECTOR__DEST_STEREOTYPE:
                return getDestStereotype();
            case EaobjectmodelPackage.CONNECTOR__DEST_STYLE:
                return getDestStyle();
            case EaobjectmodelPackage.CONNECTOR__DEST_TS:
                return getDestTS();
            case EaobjectmodelPackage.CONNECTOR__TOP_START_LABEL:
                return getTop_Start_Label();
            case EaobjectmodelPackage.CONNECTOR__TOP_MID_LABEL:
                return getTop_Mid_Label();
            case EaobjectmodelPackage.CONNECTOR__TOP_END_LABEL:
                return getTop_End_Label();
            case EaobjectmodelPackage.CONNECTOR__BTM_START_LABEL:
                return getBtm_Start_Label();
            case EaobjectmodelPackage.CONNECTOR__BTM_MID_LABEL:
                return getBtm_Mid_Label();
            case EaobjectmodelPackage.CONNECTOR__BTM_END_LABEL:
                return getBtm_End_Label();
            case EaobjectmodelPackage.CONNECTOR__START_EDGE:
                return getStart_Edge();
            case EaobjectmodelPackage.CONNECTOR__END_EDGE:
                return getEnd_Edge();
            case EaobjectmodelPackage.CONNECTOR__HEAD_STYLE:
                return getHeadStyle();
            case EaobjectmodelPackage.CONNECTOR__LINE_STYLE:
                return getLineStyle();
            case EaobjectmodelPackage.CONNECTOR__DISPATCH_ACTION:
                return getDispatchAction();
            case EaobjectmodelPackage.CONNECTOR__PDATA1:
                return getPDATA1();
            case EaobjectmodelPackage.CONNECTOR__PDATA2:
                return getPDATA2();
            case EaobjectmodelPackage.CONNECTOR__PDATA3:
                return getPDATA3();
            case EaobjectmodelPackage.CONNECTOR__PDATA4:
                return getPDATA4();
            case EaobjectmodelPackage.CONNECTOR__PDATA5:
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
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_ID:
                setConnectorID((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_GUID:
                setConnectorGUID((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DIRECTION:
                setDirection((DirectionType)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_END_X:
                setPtEndX((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_END_Y:
                setPtEndY((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__EVENT_FLAGS:
                setEventFlags((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__IS_ROOT:
                setIsRoot((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__IS_SPEC:
                setIsSpec((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__NAME:
                setName((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__NOTES:
                setNotes((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__ROUTE_STYLE:
                setRouteStyle((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SEQ_NO:
                setSeqNo((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_START_X:
                setPtStartX((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_START_Y:
                setPtStartY((Long)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__ACTION_FLAGS:
                setActionFlags((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__STATE_FLAGS:
                setStateFlags((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__STEREOTYPE:
                setStereotype((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__STYLE_EX:
                setStyleEx((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SUB_TYPE:
                setSubType((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__TYPE:
                setType((ConnectorType)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__VIRTUAL_INHERITANCE:
                setVirtualInheritance((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                setSource((Element)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST:
                setDest((Element)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CARD:
                setSourceCard((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ACCESS:
                setSourceAccess((Scope)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ELEMENT:
                setSourceElement((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE:
                setSourceRole((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_TYPE:
                setSourceRoleType((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_NOTE:
                setSourceRoleNote((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONTAINMENT:
                setSourceContainment((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_AGGREGATE:
                setSourceIsAggregate((IsAggregate)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_ORDERED:
                setSourceIsOrdered((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_QUALIFIER:
                setSourceQualifier((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CHANGEABLE:
                setSourceChangeable((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONSTRAINT:
                setSourceConstraint((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
                setSourceIsNavigable((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STEREOTYPE:
                setSourceStereotype((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STYLE:
                setSourceStyle((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_TS:
                setSourceTS((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CARD:
                setDestCard((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ACCESS:
                setDestAccess((Scope)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ELEMENT:
                setDestElement((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE:
                setDestRole((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_TYPE:
                setDestRoleType((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_NOTE:
                setDestRoleNote((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CONTAINMENT:
                setDestContainment((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_AGGREGATE:
                setDestIsAggregate((IsAggregate)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_ORDERED:
                setDestIsOrdered((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_QUALIFIER:
                setDestQualifier((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CHANGEABLE:
                setDestChangeable((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CONSTRAINT:
                setDestConstraint((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_NAVIGABLE:
                setDestIsNavigable((Boolean)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_STEREOTYPE:
                setDestStereotype((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_STYLE:
                setDestStyle((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_TS:
                setDestTS((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__TOP_START_LABEL:
                setTop_Start_Label((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__TOP_MID_LABEL:
                setTop_Mid_Label((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__TOP_END_LABEL:
                setTop_End_Label((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__BTM_START_LABEL:
                setBtm_Start_Label((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__BTM_MID_LABEL:
                setBtm_Mid_Label((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__BTM_END_LABEL:
                setBtm_End_Label((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__START_EDGE:
                setStart_Edge((Integer)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__END_EDGE:
                setEnd_Edge((Integer)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__HEAD_STYLE:
                setHeadStyle((Integer)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__LINE_STYLE:
                setLineStyle((Integer)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__DISPATCH_ACTION:
                setDispatchAction((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA1:
                setPDATA1((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA2:
                setPDATA2((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA3:
                setPDATA3((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA4:
                setPDATA4((String)newValue);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA5:
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
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_ID:
                setConnectorID(CONNECTOR_ID_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_GUID:
                setConnectorGUID(CONNECTOR_GUID_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DIRECTION:
                setDirection(DIRECTION_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_END_X:
                setPtEndX(PT_END_X_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_END_Y:
                setPtEndY(PT_END_Y_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__EVENT_FLAGS:
                setEventFlags(EVENT_FLAGS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__IS_ROOT:
                setIsRoot(IS_ROOT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__IS_SPEC:
                setIsSpec(IS_SPEC_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__ROUTE_STYLE:
                setRouteStyle(ROUTE_STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SEQ_NO:
                setSeqNo(SEQ_NO_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_START_X:
                setPtStartX(PT_START_X_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PT_START_Y:
                setPtStartY(PT_START_Y_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__ACTION_FLAGS:
                setActionFlags(ACTION_FLAGS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__STATE_FLAGS:
                setStateFlags(STATE_FLAGS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__STEREOTYPE:
                setStereotype(STEREOTYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__STYLE_EX:
                setStyleEx(STYLE_EX_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SUB_TYPE:
                setSubType(SUB_TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__VIRTUAL_INHERITANCE:
                setVirtualInheritance(VIRTUAL_INHERITANCE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                setSource((Element)null);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST:
                setDest((Element)null);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CARD:
                setSourceCard(SOURCE_CARD_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ACCESS:
                setSourceAccess(SOURCE_ACCESS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ELEMENT:
                setSourceElement(SOURCE_ELEMENT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE:
                setSourceRole(SOURCE_ROLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_TYPE:
                setSourceRoleType(SOURCE_ROLE_TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_NOTE:
                setSourceRoleNote(SOURCE_ROLE_NOTE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONTAINMENT:
                setSourceContainment(SOURCE_CONTAINMENT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_AGGREGATE:
                setSourceIsAggregate(SOURCE_IS_AGGREGATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_ORDERED:
                setSourceIsOrdered(SOURCE_IS_ORDERED_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_QUALIFIER:
                setSourceQualifier(SOURCE_QUALIFIER_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CHANGEABLE:
                setSourceChangeable(SOURCE_CHANGEABLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONSTRAINT:
                setSourceConstraint(SOURCE_CONSTRAINT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
                setSourceIsNavigable(SOURCE_IS_NAVIGABLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STEREOTYPE:
                setSourceStereotype(SOURCE_STEREOTYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STYLE:
                setSourceStyle(SOURCE_STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_TS:
                setSourceTS(SOURCE_TS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CARD:
                setDestCard(DEST_CARD_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ACCESS:
                setDestAccess(DEST_ACCESS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ELEMENT:
                setDestElement(DEST_ELEMENT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE:
                setDestRole(DEST_ROLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_TYPE:
                setDestRoleType(DEST_ROLE_TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_NOTE:
                setDestRoleNote(DEST_ROLE_NOTE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CONTAINMENT:
                setDestContainment(DEST_CONTAINMENT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_AGGREGATE:
                setDestIsAggregate(DEST_IS_AGGREGATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_ORDERED:
                setDestIsOrdered(DEST_IS_ORDERED_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_QUALIFIER:
                setDestQualifier(DEST_QUALIFIER_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CHANGEABLE:
                setDestChangeable(DEST_CHANGEABLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_CONSTRAINT:
                setDestConstraint(DEST_CONSTRAINT_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_NAVIGABLE:
                setDestIsNavigable(DEST_IS_NAVIGABLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_STEREOTYPE:
                setDestStereotype(DEST_STEREOTYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_STYLE:
                setDestStyle(DEST_STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DEST_TS:
                setDestTS(DEST_TS_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__TOP_START_LABEL:
                setTop_Start_Label(TOP_START_LABEL_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__TOP_MID_LABEL:
                setTop_Mid_Label(TOP_MID_LABEL_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__TOP_END_LABEL:
                setTop_End_Label(TOP_END_LABEL_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__BTM_START_LABEL:
                setBtm_Start_Label(BTM_START_LABEL_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__BTM_MID_LABEL:
                setBtm_Mid_Label(BTM_MID_LABEL_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__BTM_END_LABEL:
                setBtm_End_Label(BTM_END_LABEL_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__START_EDGE:
                setStart_Edge(START_EDGE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__END_EDGE:
                setEnd_Edge(END_EDGE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__HEAD_STYLE:
                setHeadStyle(HEAD_STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__LINE_STYLE:
                setLineStyle(LINE_STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__DISPATCH_ACTION:
                setDispatchAction(DISPATCH_ACTION_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA1:
                setPDATA1(PDATA1_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA2:
                setPDATA2(PDATA2_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA3:
                setPDATA3(PDATA3_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA4:
                setPDATA4(PDATA4_EDEFAULT);
                return;
            case EaobjectmodelPackage.CONNECTOR__PDATA5:
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
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_ID:
                return CONNECTOR_ID_EDEFAULT == null ? getConnectorID() != null : !CONNECTOR_ID_EDEFAULT.equals(getConnectorID());
            case EaobjectmodelPackage.CONNECTOR__CONNECTOR_GUID:
                return CONNECTOR_GUID_EDEFAULT == null ? getConnectorGUID() != null : !CONNECTOR_GUID_EDEFAULT.equals(getConnectorGUID());
            case EaobjectmodelPackage.CONNECTOR__DIRECTION:
                return getDirection() != DIRECTION_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__PT_END_X:
                return PT_END_X_EDEFAULT == null ? getPtEndX() != null : !PT_END_X_EDEFAULT.equals(getPtEndX());
            case EaobjectmodelPackage.CONNECTOR__PT_END_Y:
                return PT_END_Y_EDEFAULT == null ? getPtEndY() != null : !PT_END_Y_EDEFAULT.equals(getPtEndY());
            case EaobjectmodelPackage.CONNECTOR__EVENT_FLAGS:
                return EVENT_FLAGS_EDEFAULT == null ? getEventFlags() != null : !EVENT_FLAGS_EDEFAULT.equals(getEventFlags());
            case EaobjectmodelPackage.CONNECTOR__IS_LEAF:
                return IS_LEAF_EDEFAULT == null ? getIsLeaf() != null : !IS_LEAF_EDEFAULT.equals(getIsLeaf());
            case EaobjectmodelPackage.CONNECTOR__IS_ROOT:
                return IS_ROOT_EDEFAULT == null ? getIsRoot() != null : !IS_ROOT_EDEFAULT.equals(getIsRoot());
            case EaobjectmodelPackage.CONNECTOR__IS_SPEC:
                return IS_SPEC_EDEFAULT == null ? getIsSpec() != null : !IS_SPEC_EDEFAULT.equals(getIsSpec());
            case EaobjectmodelPackage.CONNECTOR__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case EaobjectmodelPackage.CONNECTOR__NOTES:
                return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
            case EaobjectmodelPackage.CONNECTOR__ROUTE_STYLE:
                return ROUTE_STYLE_EDEFAULT == null ? getRouteStyle() != null : !ROUTE_STYLE_EDEFAULT.equals(getRouteStyle());
            case EaobjectmodelPackage.CONNECTOR__SEQ_NO:
                return SEQ_NO_EDEFAULT == null ? getSeqNo() != null : !SEQ_NO_EDEFAULT.equals(getSeqNo());
            case EaobjectmodelPackage.CONNECTOR__PT_START_X:
                return PT_START_X_EDEFAULT == null ? getPtStartX() != null : !PT_START_X_EDEFAULT.equals(getPtStartX());
            case EaobjectmodelPackage.CONNECTOR__PT_START_Y:
                return PT_START_Y_EDEFAULT == null ? getPtStartY() != null : !PT_START_Y_EDEFAULT.equals(getPtStartY());
            case EaobjectmodelPackage.CONNECTOR__ACTION_FLAGS:
                return ACTION_FLAGS_EDEFAULT == null ? getActionFlags() != null : !ACTION_FLAGS_EDEFAULT.equals(getActionFlags());
            case EaobjectmodelPackage.CONNECTOR__STATE_FLAGS:
                return STATE_FLAGS_EDEFAULT == null ? getStateFlags() != null : !STATE_FLAGS_EDEFAULT.equals(getStateFlags());
            case EaobjectmodelPackage.CONNECTOR__STEREOTYPE:
                return STEREOTYPE_EDEFAULT == null ? getStereotype() != null : !STEREOTYPE_EDEFAULT.equals(getStereotype());
            case EaobjectmodelPackage.CONNECTOR__STYLE_EX:
                return STYLE_EX_EDEFAULT == null ? getStyleEx() != null : !STYLE_EX_EDEFAULT.equals(getStyleEx());
            case EaobjectmodelPackage.CONNECTOR__SUB_TYPE:
                return SUB_TYPE_EDEFAULT == null ? getSubType() != null : !SUB_TYPE_EDEFAULT.equals(getSubType());
            case EaobjectmodelPackage.CONNECTOR__TYPE:
                return getType() != TYPE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__VIRTUAL_INHERITANCE:
                return VIRTUAL_INHERITANCE_EDEFAULT == null ? getVirtualInheritance() != null : !VIRTUAL_INHERITANCE_EDEFAULT.equals(getVirtualInheritance());
            case EaobjectmodelPackage.CONNECTOR__SOURCE:
                return basicGetSource() != null;
            case EaobjectmodelPackage.CONNECTOR__DEST:
                return basicGetDest() != null;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CARD:
                return SOURCE_CARD_EDEFAULT == null ? getSourceCard() != null : !SOURCE_CARD_EDEFAULT.equals(getSourceCard());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ACCESS:
                return getSourceAccess() != SOURCE_ACCESS_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ELEMENT:
                return SOURCE_ELEMENT_EDEFAULT == null ? getSourceElement() != null : !SOURCE_ELEMENT_EDEFAULT.equals(getSourceElement());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE:
                return SOURCE_ROLE_EDEFAULT == null ? getSourceRole() != null : !SOURCE_ROLE_EDEFAULT.equals(getSourceRole());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_TYPE:
                return SOURCE_ROLE_TYPE_EDEFAULT == null ? getSourceRoleType() != null : !SOURCE_ROLE_TYPE_EDEFAULT.equals(getSourceRoleType());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_ROLE_NOTE:
                return SOURCE_ROLE_NOTE_EDEFAULT == null ? getSourceRoleNote() != null : !SOURCE_ROLE_NOTE_EDEFAULT.equals(getSourceRoleNote());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONTAINMENT:
                return SOURCE_CONTAINMENT_EDEFAULT == null ? getSourceContainment() != null : !SOURCE_CONTAINMENT_EDEFAULT.equals(getSourceContainment());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_AGGREGATE:
                return getSourceIsAggregate() != SOURCE_IS_AGGREGATE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_ORDERED:
                return isSourceIsOrdered() != SOURCE_IS_ORDERED_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_QUALIFIER:
                return SOURCE_QUALIFIER_EDEFAULT == null ? getSourceQualifier() != null : !SOURCE_QUALIFIER_EDEFAULT.equals(getSourceQualifier());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CHANGEABLE:
                return SOURCE_CHANGEABLE_EDEFAULT == null ? getSourceChangeable() != null : !SOURCE_CHANGEABLE_EDEFAULT.equals(getSourceChangeable());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_CONSTRAINT:
                return SOURCE_CONSTRAINT_EDEFAULT == null ? getSourceConstraint() != null : !SOURCE_CONSTRAINT_EDEFAULT.equals(getSourceConstraint());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_IS_NAVIGABLE:
                return isSourceIsNavigable() != SOURCE_IS_NAVIGABLE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STEREOTYPE:
                return SOURCE_STEREOTYPE_EDEFAULT == null ? getSourceStereotype() != null : !SOURCE_STEREOTYPE_EDEFAULT.equals(getSourceStereotype());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_STYLE:
                return SOURCE_STYLE_EDEFAULT == null ? getSourceStyle() != null : !SOURCE_STYLE_EDEFAULT.equals(getSourceStyle());
            case EaobjectmodelPackage.CONNECTOR__SOURCE_TS:
                return SOURCE_TS_EDEFAULT == null ? getSourceTS() != null : !SOURCE_TS_EDEFAULT.equals(getSourceTS());
            case EaobjectmodelPackage.CONNECTOR__DEST_CARD:
                return DEST_CARD_EDEFAULT == null ? getDestCard() != null : !DEST_CARD_EDEFAULT.equals(getDestCard());
            case EaobjectmodelPackage.CONNECTOR__DEST_ACCESS:
                return getDestAccess() != DEST_ACCESS_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__DEST_ELEMENT:
                return DEST_ELEMENT_EDEFAULT == null ? getDestElement() != null : !DEST_ELEMENT_EDEFAULT.equals(getDestElement());
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE:
                return DEST_ROLE_EDEFAULT == null ? getDestRole() != null : !DEST_ROLE_EDEFAULT.equals(getDestRole());
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_TYPE:
                return DEST_ROLE_TYPE_EDEFAULT == null ? getDestRoleType() != null : !DEST_ROLE_TYPE_EDEFAULT.equals(getDestRoleType());
            case EaobjectmodelPackage.CONNECTOR__DEST_ROLE_NOTE:
                return DEST_ROLE_NOTE_EDEFAULT == null ? getDestRoleNote() != null : !DEST_ROLE_NOTE_EDEFAULT.equals(getDestRoleNote());
            case EaobjectmodelPackage.CONNECTOR__DEST_CONTAINMENT:
                return DEST_CONTAINMENT_EDEFAULT == null ? getDestContainment() != null : !DEST_CONTAINMENT_EDEFAULT.equals(getDestContainment());
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_AGGREGATE:
                return getDestIsAggregate() != DEST_IS_AGGREGATE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_ORDERED:
                return isDestIsOrdered() != DEST_IS_ORDERED_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__DEST_QUALIFIER:
                return DEST_QUALIFIER_EDEFAULT == null ? getDestQualifier() != null : !DEST_QUALIFIER_EDEFAULT.equals(getDestQualifier());
            case EaobjectmodelPackage.CONNECTOR__DEST_CHANGEABLE:
                return DEST_CHANGEABLE_EDEFAULT == null ? getDestChangeable() != null : !DEST_CHANGEABLE_EDEFAULT.equals(getDestChangeable());
            case EaobjectmodelPackage.CONNECTOR__DEST_CONSTRAINT:
                return DEST_CONSTRAINT_EDEFAULT == null ? getDestConstraint() != null : !DEST_CONSTRAINT_EDEFAULT.equals(getDestConstraint());
            case EaobjectmodelPackage.CONNECTOR__DEST_IS_NAVIGABLE:
                return isDestIsNavigable() != DEST_IS_NAVIGABLE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__DEST_STEREOTYPE:
                return DEST_STEREOTYPE_EDEFAULT == null ? getDestStereotype() != null : !DEST_STEREOTYPE_EDEFAULT.equals(getDestStereotype());
            case EaobjectmodelPackage.CONNECTOR__DEST_STYLE:
                return DEST_STYLE_EDEFAULT == null ? getDestStyle() != null : !DEST_STYLE_EDEFAULT.equals(getDestStyle());
            case EaobjectmodelPackage.CONNECTOR__DEST_TS:
                return DEST_TS_EDEFAULT == null ? getDestTS() != null : !DEST_TS_EDEFAULT.equals(getDestTS());
            case EaobjectmodelPackage.CONNECTOR__TOP_START_LABEL:
                return TOP_START_LABEL_EDEFAULT == null ? getTop_Start_Label() != null : !TOP_START_LABEL_EDEFAULT.equals(getTop_Start_Label());
            case EaobjectmodelPackage.CONNECTOR__TOP_MID_LABEL:
                return TOP_MID_LABEL_EDEFAULT == null ? getTop_Mid_Label() != null : !TOP_MID_LABEL_EDEFAULT.equals(getTop_Mid_Label());
            case EaobjectmodelPackage.CONNECTOR__TOP_END_LABEL:
                return TOP_END_LABEL_EDEFAULT == null ? getTop_End_Label() != null : !TOP_END_LABEL_EDEFAULT.equals(getTop_End_Label());
            case EaobjectmodelPackage.CONNECTOR__BTM_START_LABEL:
                return BTM_START_LABEL_EDEFAULT == null ? getBtm_Start_Label() != null : !BTM_START_LABEL_EDEFAULT.equals(getBtm_Start_Label());
            case EaobjectmodelPackage.CONNECTOR__BTM_MID_LABEL:
                return BTM_MID_LABEL_EDEFAULT == null ? getBtm_Mid_Label() != null : !BTM_MID_LABEL_EDEFAULT.equals(getBtm_Mid_Label());
            case EaobjectmodelPackage.CONNECTOR__BTM_END_LABEL:
                return BTM_END_LABEL_EDEFAULT == null ? getBtm_End_Label() != null : !BTM_END_LABEL_EDEFAULT.equals(getBtm_End_Label());
            case EaobjectmodelPackage.CONNECTOR__START_EDGE:
                return getStart_Edge() != START_EDGE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__END_EDGE:
                return getEnd_Edge() != END_EDGE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__HEAD_STYLE:
                return getHeadStyle() != HEAD_STYLE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__LINE_STYLE:
                return getLineStyle() != LINE_STYLE_EDEFAULT;
            case EaobjectmodelPackage.CONNECTOR__DISPATCH_ACTION:
                return DISPATCH_ACTION_EDEFAULT == null ? getDispatchAction() != null : !DISPATCH_ACTION_EDEFAULT.equals(getDispatchAction());
            case EaobjectmodelPackage.CONNECTOR__PDATA1:
                return PDATA1_EDEFAULT == null ? getPDATA1() != null : !PDATA1_EDEFAULT.equals(getPDATA1());
            case EaobjectmodelPackage.CONNECTOR__PDATA2:
                return PDATA2_EDEFAULT == null ? getPDATA2() != null : !PDATA2_EDEFAULT.equals(getPDATA2());
            case EaobjectmodelPackage.CONNECTOR__PDATA3:
                return PDATA3_EDEFAULT == null ? getPDATA3() != null : !PDATA3_EDEFAULT.equals(getPDATA3());
            case EaobjectmodelPackage.CONNECTOR__PDATA4:
                return PDATA4_EDEFAULT == null ? getPDATA4() != null : !PDATA4_EDEFAULT.equals(getPDATA4());
            case EaobjectmodelPackage.CONNECTOR__PDATA5:
                return PDATA5_EDEFAULT == null ? getPDATA5() != null : !PDATA5_EDEFAULT.equals(getPDATA5());
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case EaobjectmodelPackage.CONNECTOR___GET_SOURCE_LOWER:
                return getSourceLower();
            case EaobjectmodelPackage.CONNECTOR___GET_SOURCE_UPPER:
                return getSourceUpper();
            case EaobjectmodelPackage.CONNECTOR___GET_DEST_LOWER:
                return getDestLower();
            case EaobjectmodelPackage.CONNECTOR___GET_DEST_UPPER:
                return getDestUpper();
            case EaobjectmodelPackage.CONNECTOR___GET_SOURCE_ALIAS:
                return getSourceAlias();
            case EaobjectmodelPackage.CONNECTOR___GET_DEST_ALIAS:
                return getDestAlias();
        }
        return super.eInvoke(operationID, arguments);
    }

} //ConnectorImpl
