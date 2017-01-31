/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;
import org.eclipse.emf.ecore.EClass;
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
		return (String)eGet(EaobjectmodelPackage.Literals.METHODPARAMETER__EA_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEa_guid(String newEa_guid) {
		eSet(EaobjectmodelPackage.Literals.METHODPARAMETER__EA_GUID, newEa_guid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getParameterType() {
		return (TypeReference)eGet(EaobjectmodelPackage.Literals.METHODPARAMETER__PARAMETER_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(TypeReference newParameterType) {
		eSet(EaobjectmodelPackage.Literals.METHODPARAMETER__PARAMETER_TYPE, newParameterType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHODPARAMETER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.METHODPARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return (Method)eGet(EaobjectmodelPackage.Literals.METHODPARAMETER__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		eSet(EaobjectmodelPackage.Literals.METHODPARAMETER__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirection getKind() {
		return (ParameterDirection)eGet(EaobjectmodelPackage.Literals.METHODPARAMETER__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ParameterDirection newKind) {
		eSet(EaobjectmodelPackage.Literals.METHODPARAMETER__KIND, newKind);
	}

} //MethodparameterImpl
