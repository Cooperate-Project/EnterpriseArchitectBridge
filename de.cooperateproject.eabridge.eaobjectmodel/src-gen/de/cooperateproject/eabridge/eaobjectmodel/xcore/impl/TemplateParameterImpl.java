/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl#getTemplateParameterID <em>Template Parameter ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateParameterImpl extends MinimalEObjectImpl.Container implements TemplateParameter {
	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected String constraint = CONSTRAINT_EDEFAULT;

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
	 * The default value of the '{@link #getTemplateParameterID() <em>Template Parameter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameterID()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameterID() <em>Template Parameter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameterID()
	 * @generated
	 * @ordered
	 */
	protected String templateParameterID = TEMPLATE_PARAMETER_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		String oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEMPLATE_PARAMETER__CONSTRAINT, oldConstraint, constraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEMPLATE_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameterID() {
		return templateParameterID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameterID(String newTemplateParameterID) {
		String oldTemplateParameterID = templateParameterID;
		templateParameterID = newTemplateParameterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID, oldTemplateParameterID, templateParameterID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.TEMPLATE_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.TEMPLATE_PARAMETER__CONSTRAINT:
				return getConstraint();
			case XcorePackage.TEMPLATE_PARAMETER__DEFAULT:
				return getDefault();
			case XcorePackage.TEMPLATE_PARAMETER__NAME:
				return getName();
			case XcorePackage.TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID:
				return getTemplateParameterID();
			case XcorePackage.TEMPLATE_PARAMETER__TYPE:
				return getType();
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
			case XcorePackage.TEMPLATE_PARAMETER__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID:
				setTemplateParameterID((String)newValue);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__TYPE:
				setType((String)newValue);
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
			case XcorePackage.TEMPLATE_PARAMETER__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID:
				setTemplateParameterID(TEMPLATE_PARAMETER_ID_EDEFAULT);
				return;
			case XcorePackage.TEMPLATE_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
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
			case XcorePackage.TEMPLATE_PARAMETER__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case XcorePackage.TEMPLATE_PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case XcorePackage.TEMPLATE_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID:
				return TEMPLATE_PARAMETER_ID_EDEFAULT == null ? templateParameterID != null : !TEMPLATE_PARAMETER_ID_EDEFAULT.equals(templateParameterID);
			case XcorePackage.TEMPLATE_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (Constraint: ");
		result.append(constraint);
		result.append(", Default: ");
		result.append(default_);
		result.append(", Name: ");
		result.append(name);
		result.append(", TemplateParameterID: ");
		result.append(templateParameterID);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TemplateParameterImpl
