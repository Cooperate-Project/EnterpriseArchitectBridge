/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getOperationID <em>Operation ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getParameterGUID <em>Parameter GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getStereotypeEx <em>Stereotype Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl#getTaggedValues <em>Tagged Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
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
	 * The default value of the '{@link #getClassifierID() <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierID()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierID() <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierID()
	 * @generated
	 * @ordered
	 */
	protected String classifierID = CLASSIFIER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConst = IS_CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #getOperationID() <em>Operation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationID()
	 * @generated
	 * @ordered
	 */
	protected static final Long OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationID() <em>Operation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationID()
	 * @generated
	 * @ordered
	 */
	protected Long operationID = OPERATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterGUID() <em>Parameter GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterGUID() <em>Parameter GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGUID()
	 * @generated
	 * @ordered
	 */
	protected String parameterGUID = PARAMETER_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Long position = POSITION_EDEFAULT;

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
	 * The default value of the '{@link #getStereotypeEx() <em>Stereotype Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypeEx()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereotypeEx() <em>Stereotype Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypeEx()
	 * @generated
	 * @ordered
	 */
	protected String stereotypeEx = STEREOTYPE_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

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
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamTag> taggedValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierID() {
		return classifierID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierID(String newClassifierID) {
		String oldClassifierID = classifierID;
		classifierID = newClassifierID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__CLASSIFIER_ID, oldClassifierID, classifierID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		return isConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		Boolean oldIsConst = isConst;
		isConst = newIsConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__IS_CONST, oldIsConst, isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getOperationID() {
		return operationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationID(Long newOperationID) {
		Long oldOperationID = operationID;
		operationID = newOperationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__OPERATION_ID, oldOperationID, operationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterGUID() {
		return parameterGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterGUID(String newParameterGUID) {
		String oldParameterGUID = parameterGUID;
		parameterGUID = newParameterGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__PARAMETER_GUID, oldParameterGUID, parameterGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Long newPosition) {
		Long oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotypeEx() {
		return stereotypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotypeEx(String newStereotypeEx) {
		String oldStereotypeEx = stereotypeEx;
		stereotypeEx = newStereotypeEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__STEREOTYPE_EX, oldStereotypeEx, stereotypeEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.PARAMETER__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamTag> getTaggedValues() {
		if (taggedValues == null) {
			taggedValues = new EObjectContainmentEList<ParamTag>(ParamTag.class, this, XcorePackage.PARAMETER__TAGGED_VALUES);
		}
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.PARAMETER__TAGGED_VALUES:
				return ((InternalEList<?>)getTaggedValues()).basicRemove(otherEnd, msgs);
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
			case XcorePackage.PARAMETER__ALIAS:
				return getAlias();
			case XcorePackage.PARAMETER__CLASSIFIER_ID:
				return getClassifierID();
			case XcorePackage.PARAMETER__DEFAULT:
				return getDefault();
			case XcorePackage.PARAMETER__IS_CONST:
				return getIsConst();
			case XcorePackage.PARAMETER__KIND:
				return getKind();
			case XcorePackage.PARAMETER__NAME:
				return getName();
			case XcorePackage.PARAMETER__NOTES:
				return getNotes();
			case XcorePackage.PARAMETER__OPERATION_ID:
				return getOperationID();
			case XcorePackage.PARAMETER__PARAMETER_GUID:
				return getParameterGUID();
			case XcorePackage.PARAMETER__POSITION:
				return getPosition();
			case XcorePackage.PARAMETER__STEREOTYPE:
				return getStereotype();
			case XcorePackage.PARAMETER__STEREOTYPE_EX:
				return getStereotypeEx();
			case XcorePackage.PARAMETER__STYLE:
				return getStyle();
			case XcorePackage.PARAMETER__STYLE_EX:
				return getStyleEx();
			case XcorePackage.PARAMETER__TAGGED_VALUES:
				return getTaggedValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcorePackage.PARAMETER__ALIAS:
				setAlias((String)newValue);
				return;
			case XcorePackage.PARAMETER__CLASSIFIER_ID:
				setClassifierID((String)newValue);
				return;
			case XcorePackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case XcorePackage.PARAMETER__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case XcorePackage.PARAMETER__KIND:
				setKind((String)newValue);
				return;
			case XcorePackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.PARAMETER__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.PARAMETER__OPERATION_ID:
				setOperationID((Long)newValue);
				return;
			case XcorePackage.PARAMETER__PARAMETER_GUID:
				setParameterGUID((String)newValue);
				return;
			case XcorePackage.PARAMETER__POSITION:
				setPosition((Long)newValue);
				return;
			case XcorePackage.PARAMETER__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XcorePackage.PARAMETER__STEREOTYPE_EX:
				setStereotypeEx((String)newValue);
				return;
			case XcorePackage.PARAMETER__STYLE:
				setStyle((String)newValue);
				return;
			case XcorePackage.PARAMETER__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case XcorePackage.PARAMETER__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((Collection<? extends ParamTag>)newValue);
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
			case XcorePackage.PARAMETER__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__CLASSIFIER_ID:
				setClassifierID(CLASSIFIER_ID_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__OPERATION_ID:
				setOperationID(OPERATION_ID_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__PARAMETER_GUID:
				setParameterGUID(PARAMETER_GUID_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__STEREOTYPE_EX:
				setStereotypeEx(STEREOTYPE_EX_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case XcorePackage.PARAMETER__TAGGED_VALUES:
				getTaggedValues().clear();
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
			case XcorePackage.PARAMETER__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case XcorePackage.PARAMETER__CLASSIFIER_ID:
				return CLASSIFIER_ID_EDEFAULT == null ? classifierID != null : !CLASSIFIER_ID_EDEFAULT.equals(classifierID);
			case XcorePackage.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case XcorePackage.PARAMETER__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
			case XcorePackage.PARAMETER__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case XcorePackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.PARAMETER__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.PARAMETER__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationID != null : !OPERATION_ID_EDEFAULT.equals(operationID);
			case XcorePackage.PARAMETER__PARAMETER_GUID:
				return PARAMETER_GUID_EDEFAULT == null ? parameterGUID != null : !PARAMETER_GUID_EDEFAULT.equals(parameterGUID);
			case XcorePackage.PARAMETER__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case XcorePackage.PARAMETER__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.PARAMETER__STEREOTYPE_EX:
				return STEREOTYPE_EX_EDEFAULT == null ? stereotypeEx != null : !STEREOTYPE_EX_EDEFAULT.equals(stereotypeEx);
			case XcorePackage.PARAMETER__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XcorePackage.PARAMETER__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.PARAMETER__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
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
		result.append(", ClassifierID: ");
		result.append(classifierID);
		result.append(", Default: ");
		result.append(default_);
		result.append(", IsConst: ");
		result.append(isConst);
		result.append(", Kind: ");
		result.append(kind);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", OperationID: ");
		result.append(operationID);
		result.append(", ParameterGUID: ");
		result.append(parameterGUID);
		result.append(", Position: ");
		result.append(position);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", StereotypeEx: ");
		result.append(stereotypeEx);
		result.append(", Style: ");
		result.append(style);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
