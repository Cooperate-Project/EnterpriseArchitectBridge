/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.DirectionType;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.IsAggregate;
import org.eclipse.emf.ecore.EClass;
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
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorID(Long newConnectorID) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_ID, newConnectorID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectorGUID() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorGUID(String newConnectorGUID) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__CONNECTOR_GUID, newConnectorGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return (DirectionType)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtEndX() {
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PT_END_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtEndX(Long newPtEndX) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PT_END_X, newPtEndX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtEndY() {
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PT_END_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtEndY(Long newPtEndY) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PT_END_Y, newPtEndY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__EVENT_FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFlags(String newEventFlags) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__EVENT_FLAGS, newEventFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__IS_LEAF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__IS_LEAF, newIsLeaf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__IS_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__IS_ROOT, newIsRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSpec() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__IS_SPEC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpec(Boolean newIsSpec) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__IS_SPEC, newIsSpec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getRouteStyle() {
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__ROUTE_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteStyle(Long newRouteStyle) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__ROUTE_STYLE, newRouteStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSeqNo() {
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SEQ_NO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqNo(Long newSeqNo) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SEQ_NO, newSeqNo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtStartX() {
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PT_START_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtStartX(Long newPtStartX) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PT_START_X, newPtStartX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPtStartY() {
		return (Long)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PT_START_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtStartY(Long newPtStartY) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PT_START_Y, newPtStartY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__ACTION_FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFlags(String newActionFlags) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__ACTION_FLAGS, newActionFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__STATE_FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFlags(String newStateFlags) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__STATE_FLAGS, newStateFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__STYLE_EX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubType() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SUB_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(String newSubType) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SUB_TYPE, newSubType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getType() {
		return (ConnectorType)eGet(EaobjectmodelPackage.Literals.CONNECTOR__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectorType newType) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualInheritance() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__VIRTUAL_INHERITANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualInheritance(String newVirtualInheritance) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__VIRTUAL_INHERITANCE, newVirtualInheritance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSource() {
		return (Element)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Element newSource) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getDest() {
		return (Element)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(Element newDest) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST, newDest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCard() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCard(String newSourceCard) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CARD, newSourceCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceAccess() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ACCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAccess(String newSourceAccess) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ACCESS, newSourceAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceElement() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(String newSourceElement) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ELEMENT, newSourceElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRole() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRole(String newSourceRole) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE, newSourceRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRoleType() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRoleType(String newSourceRoleType) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_TYPE, newSourceRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRoleNote() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRoleNote(String newSourceRoleNote) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_ROLE_NOTE, newSourceRoleNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceContainment() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONTAINMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceContainment(String newSourceContainment) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONTAINMENT, newSourceContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAggregate getSourceIsAggregate() {
		return (IsAggregate)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_AGGREGATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsAggregate(IsAggregate newSourceIsAggregate) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_AGGREGATE, newSourceIsAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceIsOrdered() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_ORDERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsOrdered(boolean newSourceIsOrdered) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_ORDERED, newSourceIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceQualifier() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceQualifier(String newSourceQualifier) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_QUALIFIER, newSourceQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceChangeable() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CHANGEABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceChangeable(String newSourceChangeable) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CHANGEABLE, newSourceChangeable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceConstraint() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConstraint(String newSourceConstraint) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_CONSTRAINT, newSourceConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceIsNavigable() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_NAVIGABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsNavigable(boolean newSourceIsNavigable) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_IS_NAVIGABLE, newSourceIsNavigable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceStereotype(String newSourceStereotype) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STEREOTYPE, newSourceStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceStyle(String newSourceStyle) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_STYLE, newSourceStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceTS() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_TS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTS(String newSourceTS) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__SOURCE_TS, newSourceTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestCard() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestCard(String newDestCard) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CARD, newDestCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestAccess() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ACCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestAccess(String newDestAccess) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ACCESS, newDestAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestElement() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestElement(String newDestElement) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ELEMENT, newDestElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestRole() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestRole(String newDestRole) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE, newDestRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestRoleType() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestRoleType(String newDestRoleType) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_TYPE, newDestRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestRoleNote() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestRoleNote(String newDestRoleNote) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_ROLE_NOTE, newDestRoleNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestContainment() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONTAINMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestContainment(String newDestContainment) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONTAINMENT, newDestContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAggregate getDestIsAggregate() {
		return (IsAggregate)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_AGGREGATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestIsAggregate(IsAggregate newDestIsAggregate) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_AGGREGATE, newDestIsAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestIsOrdered() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_ORDERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestIsOrdered(boolean newDestIsOrdered) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_ORDERED, newDestIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestQualifier() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestQualifier(String newDestQualifier) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_QUALIFIER, newDestQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestChangeable() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CHANGEABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestChangeable(String newDestChangeable) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CHANGEABLE, newDestChangeable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestConstraint() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestConstraint(String newDestConstraint) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_CONSTRAINT, newDestConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestIsNavigable() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_NAVIGABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestIsNavigable(boolean newDestIsNavigable) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_IS_NAVIGABLE, newDestIsNavigable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestStereotype(String newDestStereotype) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_STEREOTYPE, newDestStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestStyle(String newDestStyle) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_STYLE, newDestStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestTS() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_TS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestTS(String newDestTS) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DEST_TS, newDestTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop_Start_Label() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__TOP_START_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop_Start_Label(String newTop_Start_Label) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__TOP_START_LABEL, newTop_Start_Label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop_Mid_Label() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__TOP_MID_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop_Mid_Label(String newTop_Mid_Label) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__TOP_MID_LABEL, newTop_Mid_Label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop_End_Label() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__TOP_END_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop_End_Label(String newTop_End_Label) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__TOP_END_LABEL, newTop_End_Label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtm_Start_Label() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__BTM_START_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtm_Start_Label(String newBtm_Start_Label) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__BTM_START_LABEL, newBtm_Start_Label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtm_Mid_Label() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__BTM_MID_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtm_Mid_Label(String newBtm_Mid_Label) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__BTM_MID_LABEL, newBtm_Mid_Label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtm_End_Label() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__BTM_END_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtm_End_Label(String newBtm_End_Label) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__BTM_END_LABEL, newBtm_End_Label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart_Edge() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.CONNECTOR__START_EDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_Edge(int newStart_Edge) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__START_EDGE, newStart_Edge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd_Edge() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.CONNECTOR__END_EDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_Edge(int newEnd_Edge) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__END_EDGE, newEnd_Edge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeadStyle() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.CONNECTOR__HEAD_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadStyle(int newHeadStyle) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__HEAD_STYLE, newHeadStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineStyle() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.CONNECTOR__LINE_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(int newLineStyle) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__LINE_STYLE, newLineStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDispatchAction() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__DISPATCH_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatchAction(String newDispatchAction) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__DISPATCH_ACTION, newDispatchAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA1() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA1(String newPDATA1) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA1, newPDATA1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA2() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA2(String newPDATA2) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA2, newPDATA2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA3() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA3, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA3(String newPDATA3) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA3, newPDATA3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA4() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA4, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA4(String newPDATA4) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA4, newPDATA4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA5() {
		return (String)eGet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA5, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA5(String newPDATA5) {
		eSet(EaobjectmodelPackage.Literals.CONNECTOR__PDATA5, newPDATA5);
	}

} //ConnectorImpl
