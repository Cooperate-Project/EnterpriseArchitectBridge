/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEa_guid() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHODPARAMETER__EA_GUID, EaobjectmodelPackage.Literals.METHODPARAMETER__EA_GUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEa_guid(String newEa_guid) {
		eDynamicSet(EaobjectmodelPackage.METHODPARAMETER__EA_GUID, EaobjectmodelPackage.Literals.METHODPARAMETER__EA_GUID, newEa_guid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getParameterType() {
		return (TypeReference)eDynamicGet(EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, EaobjectmodelPackage.Literals.METHODPARAMETER__PARAMETER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterType(TypeReference newParameterType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParameterType, EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(TypeReference newParameterType) {
		eDynamicSet(EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE, EaobjectmodelPackage.Literals.METHODPARAMETER__PARAMETER_TYPE, newParameterType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHODPARAMETER__NAME, EaobjectmodelPackage.Literals.METHODPARAMETER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EaobjectmodelPackage.METHODPARAMETER__NAME, EaobjectmodelPackage.Literals.METHODPARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return (Method)eDynamicGet(EaobjectmodelPackage.METHODPARAMETER__METHOD, EaobjectmodelPackage.Literals.METHODPARAMETER__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethod() {
		return (Method)eDynamicGet(EaobjectmodelPackage.METHODPARAMETER__METHOD, EaobjectmodelPackage.Literals.METHODPARAMETER__METHOD, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMethod, EaobjectmodelPackage.METHODPARAMETER__METHOD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		eDynamicSet(EaobjectmodelPackage.METHODPARAMETER__METHOD, EaobjectmodelPackage.Literals.METHODPARAMETER__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirection getKind() {
		return (ParameterDirection)eDynamicGet(EaobjectmodelPackage.METHODPARAMETER__KIND, EaobjectmodelPackage.Literals.METHODPARAMETER__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ParameterDirection newKind) {
		eDynamicSet(EaobjectmodelPackage.METHODPARAMETER__KIND, EaobjectmodelPackage.Literals.METHODPARAMETER__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMethod((Method)otherEnd, msgs);
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
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				return basicSetParameterType(null, msgs);
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				return basicSetMethod(null, msgs);
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
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.METHOD__PARAMETERS, Method.class, msgs);
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
				return EA_GUID_EDEFAULT == null ? getEa_guid() != null : !EA_GUID_EDEFAULT.equals(getEa_guid());
			case EaobjectmodelPackage.METHODPARAMETER__PARAMETER_TYPE:
				return getParameterType() != null;
			case EaobjectmodelPackage.METHODPARAMETER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EaobjectmodelPackage.METHODPARAMETER__METHOD:
				return basicGetMethod() != null;
			case EaobjectmodelPackage.METHODPARAMETER__KIND:
				return getKind() != KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MethodparameterImpl
