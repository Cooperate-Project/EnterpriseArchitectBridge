/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getCode <em>Code</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsPure <em>Is Pure</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getMethodGUID <em>Method GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getReturnIsArray <em>Return Is Array</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl#getGenOption <em>Gen Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.METHOD;
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
	public TypeReference getReturnType() {
		return (TypeReference)eGet(EaobjectmodelPackage.Literals.METHOD__RETURN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eSet(EaobjectmodelPackage.Literals.METHOD__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Methodparameter> getParameters() {
		return (EList<Methodparameter>)eGet(EaobjectmodelPackage.Literals.METHOD__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		eSet(EaobjectmodelPackage.Literals.METHOD__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviour() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__BEHAVIOUR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(String newBehaviour) {
		eSet(EaobjectmodelPackage.Literals.METHOD__BEHAVIOUR, newBehaviour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		eSet(EaobjectmodelPackage.Literals.METHOD__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_CONST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_CONST, newIsConst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_LEAF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_LEAF, newIsLeaf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPure() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_PURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPure(Boolean newIsPure) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_PURE, newIsPure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsQuery() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(Boolean newIsQuery) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_QUERY, newIsQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_ROOT, newIsRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_STATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_STATIC, newIsStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSynchronized() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__IS_SYNCHRONIZED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronized(Boolean newIsSynchronized) {
		eSet(EaobjectmodelPackage.Literals.METHOD__IS_SYNCHRONIZED, newIsSynchronized);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodGUID() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__METHOD_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodGUID(String newMethodGUID) {
		eSet(EaobjectmodelPackage.Literals.METHOD__METHOD_GUID, newMethodGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMethodID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.METHOD__METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodID(Long newMethodID) {
		eSet(EaobjectmodelPackage.Literals.METHOD__METHOD_ID, newMethodID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.METHOD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eSet(EaobjectmodelPackage.Literals.METHOD__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		return (Element)eGet(EaobjectmodelPackage.Literals.METHOD__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		eSet(EaobjectmodelPackage.Literals.METHOD__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPos() {
		return (Long)eGet(EaobjectmodelPackage.Literals.METHOD__POS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Long newPos) {
		eSet(EaobjectmodelPackage.Literals.METHOD__POS, newPos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnIsArray() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.METHOD__RETURN_IS_ARRAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnIsArray(Boolean newReturnIsArray) {
		eSet(EaobjectmodelPackage.Literals.METHOD__RETURN_IS_ARRAY, newReturnIsArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__STATE_FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFlags(String newStateFlags) {
		eSet(EaobjectmodelPackage.Literals.METHOD__STATE_FLAGS, newStateFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eSet(EaobjectmodelPackage.Literals.METHOD__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eSet(EaobjectmodelPackage.Literals.METHOD__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__STYLE_EX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eSet(EaobjectmodelPackage.Literals.METHOD__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThrows() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__THROWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrows(String newThrows) {
		eSet(EaobjectmodelPackage.Literals.METHOD__THROWS, newThrows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getVisibility() {
		return (Scope)eGet(EaobjectmodelPackage.Literals.METHOD__VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Scope newVisibility) {
		eSet(EaobjectmodelPackage.Literals.METHOD__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__CONCURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		eSet(EaobjectmodelPackage.Literals.METHOD__CONCURRENCY, newConcurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenOption() {
		return (String)eGet(EaobjectmodelPackage.Literals.METHOD__GEN_OPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOption(String newGenOption) {
		eSet(EaobjectmodelPackage.Literals.METHOD__GEN_OPTION, newGenOption);
	}

} //MethodImpl
