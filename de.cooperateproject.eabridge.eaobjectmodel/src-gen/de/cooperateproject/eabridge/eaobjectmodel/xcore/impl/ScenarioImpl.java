/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl#getScenarioGUID <em>Scenario GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl#getXMLContent <em>XML Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
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
	 * The default value of the '{@link #getScenarioGUID() <em>Scenario GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioGUID() <em>Scenario GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioGUID()
	 * @generated
	 * @ordered
	 */
	protected String scenarioGUID = SCENARIO_GUID_EDEFAULT;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Long weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMLContent() <em>XML Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLContent()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXMLContent() <em>XML Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLContent()
	 * @generated
	 * @ordered
	 */
	protected String xmlContent = XML_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.SCENARIO__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.SCENARIO__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioGUID() {
		return scenarioGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioGUID(String newScenarioGUID) {
		String oldScenarioGUID = scenarioGUID;
		scenarioGUID = newScenarioGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.SCENARIO__SCENARIO_GUID, oldScenarioGUID, scenarioGUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.SCENARIO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Long newWeight) {
		Long oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.SCENARIO__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXMLContent() {
		return xmlContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLContent(String newXMLContent) {
		String oldXMLContent = xmlContent;
		xmlContent = newXMLContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.SCENARIO__XML_CONTENT, oldXMLContent, xmlContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.SCENARIO__NAME:
				return getName();
			case XcorePackage.SCENARIO__NOTES:
				return getNotes();
			case XcorePackage.SCENARIO__SCENARIO_GUID:
				return getScenarioGUID();
			case XcorePackage.SCENARIO__TYPE:
				return getType();
			case XcorePackage.SCENARIO__WEIGHT:
				return getWeight();
			case XcorePackage.SCENARIO__XML_CONTENT:
				return getXMLContent();
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
			case XcorePackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.SCENARIO__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.SCENARIO__SCENARIO_GUID:
				setScenarioGUID((String)newValue);
				return;
			case XcorePackage.SCENARIO__TYPE:
				setType((String)newValue);
				return;
			case XcorePackage.SCENARIO__WEIGHT:
				setWeight((Long)newValue);
				return;
			case XcorePackage.SCENARIO__XML_CONTENT:
				setXMLContent((String)newValue);
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
			case XcorePackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.SCENARIO__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.SCENARIO__SCENARIO_GUID:
				setScenarioGUID(SCENARIO_GUID_EDEFAULT);
				return;
			case XcorePackage.SCENARIO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XcorePackage.SCENARIO__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case XcorePackage.SCENARIO__XML_CONTENT:
				setXMLContent(XML_CONTENT_EDEFAULT);
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
			case XcorePackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.SCENARIO__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.SCENARIO__SCENARIO_GUID:
				return SCENARIO_GUID_EDEFAULT == null ? scenarioGUID != null : !SCENARIO_GUID_EDEFAULT.equals(scenarioGUID);
			case XcorePackage.SCENARIO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XcorePackage.SCENARIO__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case XcorePackage.SCENARIO__XML_CONTENT:
				return XML_CONTENT_EDEFAULT == null ? xmlContent != null : !XML_CONTENT_EDEFAULT.equals(xmlContent);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", ScenarioGUID: ");
		result.append(scenarioGUID);
		result.append(", Type: ");
		result.append(type);
		result.append(", Weight: ");
		result.append(weight);
		result.append(", XMLContent: ");
		result.append(xmlContent);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
