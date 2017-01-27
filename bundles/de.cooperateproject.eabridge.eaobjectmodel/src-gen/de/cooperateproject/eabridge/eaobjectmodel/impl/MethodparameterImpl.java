/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methodparameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl#getEa_guid <em>Ea guid</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodparameterImpl extends MinimalEObjectImpl.Container implements Methodparameter {
	/**
	 * The default value of the '{@link #getEa_guid() <em>Ea guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_guid()
	 * @generated
	 * @ordered
	 */
	protected static final String EA_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEa_guid() <em>Ea guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_guid()
	 * @generated
	 * @ordered
	 */
	protected String ea_guid = EA_GUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference parameterType;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirection KIND_EDEFAULT = ParameterDirection.IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirection kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodparameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.METHODPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEa_guid() {
		return ea_guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEa_guid(String newEa_guid) {
		String oldEa_guid = ea_guid;
		ea_guid = newEa_guid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHODPARAMETER__EA_GUID, oldEa_guid, ea_guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterType(TypeReference newParameterType, NotificationChain msgs) {
		TypeReference oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, oldParameterType, newParameterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(TypeReference newParameterType) {
		if (newParameterType != parameterType) {
			NotificationChain msgs = null;
			if (parameterType != null)
				msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, null, msgs);
			if (newParameterType != null)
				msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, null, msgs);
			msgs = basicSetParameterType(newParameterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, newParameterType, newParameterType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHODPARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (Method)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaobjectmodelPackage.METHODPARAMETER__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHODPARAMETER__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirection getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ParameterDirection newKind) {
		ParameterDirection oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHODPARAMETER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				return basicSetParameterType(null, msgs);
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
			case EaobjectmodelPackage.METHODPARAMETER__EA_GUID:
				return getEa_guid();
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				return getParameterType();
			case EaobjectmodelPackage.METHODPARAMETER__NAME:
				return getName();
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case EaobjectmodelPackage.METHODPARAMETER__KIND:
				return getKind();
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
			case EaobjectmodelPackage.METHODPARAMETER__EA_GUID:
				setEa_guid((String)newValue);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				setParameterType((TypeReference)newValue);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__NAME:
				setName((String)newValue);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				setMethod((Method)newValue);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__KIND:
				setKind((ParameterDirection)newValue);
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
			case EaobjectmodelPackage.METHODPARAMETER__EA_GUID:
				setEa_guid(EA_GUID_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				setParameterType((TypeReference)null);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				setMethod((Method)null);
				return;
			case EaobjectmodelPackage.METHODPARAMETER__KIND:
				setKind(KIND_EDEFAULT);
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
			case EaobjectmodelPackage.METHODPARAMETER__EA_GUID:
				return EA_GUID_EDEFAULT == null ? ea_guid != null : !EA_GUID_EDEFAULT.equals(ea_guid);
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				return parameterType != null;
			case EaobjectmodelPackage.METHODPARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				return method != null;
			case EaobjectmodelPackage.METHODPARAMETER__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (ea_guid: ");
		result.append(ea_guid);
		result.append(", Name: ");
		result.append(name);
		result.append(", Kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //MethodparameterImpl
