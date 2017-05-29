/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOUR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;
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
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LEAF_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIsPure() <em>Is Pure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PURE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_QUERY_EDEFAULT = null;
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
	 * The default value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATIC_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIsSynchronized() <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYNCHRONIZED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMethodGUID() <em>Method GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_GUID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMethodID() <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected static final Long METHOD_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final Long POS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getReturnIsArray() <em>Return Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnIsArray()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_IS_ARRAY_EDEFAULT = null;
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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;
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
	 * The default value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected static final String THROWS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Scope VISIBILITY_EDEFAULT = Scope.PRIVATE;
	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCURRENCY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getGenOption() <em>Gen Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOption()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_OPTION_EDEFAULT = null;

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
		return (TypeReference)eDynamicGet(EaobjectmodelPackage.METHOD__RETURN_TYPE, EaobjectmodelPackage.Literals.METHOD__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, EaobjectmodelPackage.METHOD__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eDynamicSet(EaobjectmodelPackage.METHOD__RETURN_TYPE, EaobjectmodelPackage.Literals.METHOD__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Methodparameter> getParameters() {
		return (EList<Methodparameter>)eDynamicGet(EaobjectmodelPackage.METHOD__PARAMETERS, EaobjectmodelPackage.Literals.METHOD__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__ABSTRACT, EaobjectmodelPackage.Literals.METHOD__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		eDynamicSet(EaobjectmodelPackage.METHOD__ABSTRACT, EaobjectmodelPackage.Literals.METHOD__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviour() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__BEHAVIOUR, EaobjectmodelPackage.Literals.METHOD__BEHAVIOUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(String newBehaviour) {
		eDynamicSet(EaobjectmodelPackage.METHOD__BEHAVIOUR, EaobjectmodelPackage.Literals.METHOD__BEHAVIOUR, newBehaviour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__CODE, EaobjectmodelPackage.Literals.METHOD__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		eDynamicSet(EaobjectmodelPackage.METHOD__CODE, EaobjectmodelPackage.Literals.METHOD__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_CONST, EaobjectmodelPackage.Literals.METHOD__IS_CONST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_CONST, EaobjectmodelPackage.Literals.METHOD__IS_CONST, newIsConst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_LEAF, EaobjectmodelPackage.Literals.METHOD__IS_LEAF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_LEAF, EaobjectmodelPackage.Literals.METHOD__IS_LEAF, newIsLeaf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPure() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_PURE, EaobjectmodelPackage.Literals.METHOD__IS_PURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPure(Boolean newIsPure) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_PURE, EaobjectmodelPackage.Literals.METHOD__IS_PURE, newIsPure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsQuery() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_QUERY, EaobjectmodelPackage.Literals.METHOD__IS_QUERY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(Boolean newIsQuery) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_QUERY, EaobjectmodelPackage.Literals.METHOD__IS_QUERY, newIsQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_ROOT, EaobjectmodelPackage.Literals.METHOD__IS_ROOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_ROOT, EaobjectmodelPackage.Literals.METHOD__IS_ROOT, newIsRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_STATIC, EaobjectmodelPackage.Literals.METHOD__IS_STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_STATIC, EaobjectmodelPackage.Literals.METHOD__IS_STATIC, newIsStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSynchronized() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED, EaobjectmodelPackage.Literals.METHOD__IS_SYNCHRONIZED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronized(Boolean newIsSynchronized) {
		eDynamicSet(EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED, EaobjectmodelPackage.Literals.METHOD__IS_SYNCHRONIZED, newIsSynchronized);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodGUID() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__METHOD_GUID, EaobjectmodelPackage.Literals.METHOD__METHOD_GUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodGUID(String newMethodGUID) {
		eDynamicSet(EaobjectmodelPackage.METHOD__METHOD_GUID, EaobjectmodelPackage.Literals.METHOD__METHOD_GUID, newMethodGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMethodID() {
		return (Long)eDynamicGet(EaobjectmodelPackage.METHOD__METHOD_ID, EaobjectmodelPackage.Literals.METHOD__METHOD_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodID(Long newMethodID) {
		eDynamicSet(EaobjectmodelPackage.METHOD__METHOD_ID, EaobjectmodelPackage.Literals.METHOD__METHOD_ID, newMethodID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__NAME, EaobjectmodelPackage.Literals.METHOD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EaobjectmodelPackage.METHOD__NAME, EaobjectmodelPackage.Literals.METHOD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__NOTES, EaobjectmodelPackage.Literals.METHOD__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eDynamicSet(EaobjectmodelPackage.METHOD__NOTES, EaobjectmodelPackage.Literals.METHOD__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		return (Element)eDynamicGet(EaobjectmodelPackage.METHOD__PARENT, EaobjectmodelPackage.Literals.METHOD__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		return (Element)eDynamicGet(EaobjectmodelPackage.METHOD__PARENT, EaobjectmodelPackage.Literals.METHOD__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EaobjectmodelPackage.METHOD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		eDynamicSet(EaobjectmodelPackage.METHOD__PARENT, EaobjectmodelPackage.Literals.METHOD__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPos() {
		return (Long)eDynamicGet(EaobjectmodelPackage.METHOD__POS, EaobjectmodelPackage.Literals.METHOD__POS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Long newPos) {
		eDynamicSet(EaobjectmodelPackage.METHOD__POS, EaobjectmodelPackage.Literals.METHOD__POS, newPos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnIsArray() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY, EaobjectmodelPackage.Literals.METHOD__RETURN_IS_ARRAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnIsArray(Boolean newReturnIsArray) {
		eDynamicSet(EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY, EaobjectmodelPackage.Literals.METHOD__RETURN_IS_ARRAY, newReturnIsArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateFlags() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__STATE_FLAGS, EaobjectmodelPackage.Literals.METHOD__STATE_FLAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFlags(String newStateFlags) {
		eDynamicSet(EaobjectmodelPackage.METHOD__STATE_FLAGS, EaobjectmodelPackage.Literals.METHOD__STATE_FLAGS, newStateFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__STEREOTYPE, EaobjectmodelPackage.Literals.METHOD__STEREOTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eDynamicSet(EaobjectmodelPackage.METHOD__STEREOTYPE, EaobjectmodelPackage.Literals.METHOD__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__STYLE, EaobjectmodelPackage.Literals.METHOD__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eDynamicSet(EaobjectmodelPackage.METHOD__STYLE, EaobjectmodelPackage.Literals.METHOD__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__STYLE_EX, EaobjectmodelPackage.Literals.METHOD__STYLE_EX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eDynamicSet(EaobjectmodelPackage.METHOD__STYLE_EX, EaobjectmodelPackage.Literals.METHOD__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThrows() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__THROWS, EaobjectmodelPackage.Literals.METHOD__THROWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrows(String newThrows) {
		eDynamicSet(EaobjectmodelPackage.METHOD__THROWS, EaobjectmodelPackage.Literals.METHOD__THROWS, newThrows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getVisibility() {
		return (Scope)eDynamicGet(EaobjectmodelPackage.METHOD__VISIBILITY, EaobjectmodelPackage.Literals.METHOD__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Scope newVisibility) {
		eDynamicSet(EaobjectmodelPackage.METHOD__VISIBILITY, EaobjectmodelPackage.Literals.METHOD__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__CONCURRENCY, EaobjectmodelPackage.Literals.METHOD__CONCURRENCY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		eDynamicSet(EaobjectmodelPackage.METHOD__CONCURRENCY, EaobjectmodelPackage.Literals.METHOD__CONCURRENCY, newConcurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenOption() {
		return (String)eDynamicGet(EaobjectmodelPackage.METHOD__GEN_OPTION, EaobjectmodelPackage.Literals.METHOD__GEN_OPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOption(String newGenOption) {
		eDynamicSet(EaobjectmodelPackage.METHOD__GEN_OPTION, EaobjectmodelPackage.Literals.METHOD__GEN_OPTION, newGenOption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.METHOD__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Element)otherEnd, msgs);
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
			case EaobjectmodelPackage.METHOD__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case EaobjectmodelPackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case EaobjectmodelPackage.METHOD__PARENT:
				return basicSetParent(null, msgs);
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
			case EaobjectmodelPackage.METHOD__PARENT:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.ELEMENT__METHODS, Element.class, msgs);
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
			case EaobjectmodelPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case EaobjectmodelPackage.METHOD__PARAMETERS:
				return getParameters();
			case EaobjectmodelPackage.METHOD__ABSTRACT:
				return getAbstract();
			case EaobjectmodelPackage.METHOD__BEHAVIOUR:
				return getBehaviour();
			case EaobjectmodelPackage.METHOD__CODE:
				return getCode();
			case EaobjectmodelPackage.METHOD__IS_CONST:
				return getIsConst();
			case EaobjectmodelPackage.METHOD__IS_LEAF:
				return getIsLeaf();
			case EaobjectmodelPackage.METHOD__IS_PURE:
				return getIsPure();
			case EaobjectmodelPackage.METHOD__IS_QUERY:
				return getIsQuery();
			case EaobjectmodelPackage.METHOD__IS_ROOT:
				return getIsRoot();
			case EaobjectmodelPackage.METHOD__IS_STATIC:
				return getIsStatic();
			case EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED:
				return getIsSynchronized();
			case EaobjectmodelPackage.METHOD__METHOD_GUID:
				return getMethodGUID();
			case EaobjectmodelPackage.METHOD__METHOD_ID:
				return getMethodID();
			case EaobjectmodelPackage.METHOD__NAME:
				return getName();
			case EaobjectmodelPackage.METHOD__NOTES:
				return getNotes();
			case EaobjectmodelPackage.METHOD__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case EaobjectmodelPackage.METHOD__POS:
				return getPos();
			case EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY:
				return getReturnIsArray();
			case EaobjectmodelPackage.METHOD__STATE_FLAGS:
				return getStateFlags();
			case EaobjectmodelPackage.METHOD__STEREOTYPE:
				return getStereotype();
			case EaobjectmodelPackage.METHOD__STYLE:
				return getStyle();
			case EaobjectmodelPackage.METHOD__STYLE_EX:
				return getStyleEx();
			case EaobjectmodelPackage.METHOD__THROWS:
				return getThrows();
			case EaobjectmodelPackage.METHOD__VISIBILITY:
				return getVisibility();
			case EaobjectmodelPackage.METHOD__CONCURRENCY:
				return getConcurrency();
			case EaobjectmodelPackage.METHOD__GEN_OPTION:
				return getGenOption();
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
			case EaobjectmodelPackage.METHOD__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case EaobjectmodelPackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Methodparameter>)newValue);
				return;
			case EaobjectmodelPackage.METHOD__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__BEHAVIOUR:
				setBehaviour((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__CODE:
				setCode((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_PURE:
				setIsPure((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED:
				setIsSynchronized((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__METHOD_GUID:
				setMethodGUID((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__METHOD_ID:
				setMethodID((Long)newValue);
				return;
			case EaobjectmodelPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__NOTES:
				setNotes((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__PARENT:
				setParent((Element)newValue);
				return;
			case EaobjectmodelPackage.METHOD__POS:
				setPos((Long)newValue);
				return;
			case EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY:
				setReturnIsArray((Boolean)newValue);
				return;
			case EaobjectmodelPackage.METHOD__STATE_FLAGS:
				setStateFlags((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__STYLE:
				setStyle((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__THROWS:
				setThrows((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__VISIBILITY:
				setVisibility((Scope)newValue);
				return;
			case EaobjectmodelPackage.METHOD__CONCURRENCY:
				setConcurrency((String)newValue);
				return;
			case EaobjectmodelPackage.METHOD__GEN_OPTION:
				setGenOption((String)newValue);
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
			case EaobjectmodelPackage.METHOD__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case EaobjectmodelPackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case EaobjectmodelPackage.METHOD__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__BEHAVIOUR:
				setBehaviour(BEHAVIOUR_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_PURE:
				setIsPure(IS_PURE_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED:
				setIsSynchronized(IS_SYNCHRONIZED_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__METHOD_GUID:
				setMethodGUID(METHOD_GUID_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__METHOD_ID:
				setMethodID(METHOD_ID_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__PARENT:
				setParent((Element)null);
				return;
			case EaobjectmodelPackage.METHOD__POS:
				setPos(POS_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY:
				setReturnIsArray(RETURN_IS_ARRAY_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__STATE_FLAGS:
				setStateFlags(STATE_FLAGS_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__THROWS:
				setThrows(THROWS_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case EaobjectmodelPackage.METHOD__GEN_OPTION:
				setGenOption(GEN_OPTION_EDEFAULT);
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
			case EaobjectmodelPackage.METHOD__RETURN_TYPE:
				return getReturnType() != null;
			case EaobjectmodelPackage.METHOD__PARAMETERS:
				return !getParameters().isEmpty();
			case EaobjectmodelPackage.METHOD__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? getAbstract() != null : !ABSTRACT_EDEFAULT.equals(getAbstract());
			case EaobjectmodelPackage.METHOD__BEHAVIOUR:
				return BEHAVIOUR_EDEFAULT == null ? getBehaviour() != null : !BEHAVIOUR_EDEFAULT.equals(getBehaviour());
			case EaobjectmodelPackage.METHOD__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case EaobjectmodelPackage.METHOD__IS_CONST:
				return IS_CONST_EDEFAULT == null ? getIsConst() != null : !IS_CONST_EDEFAULT.equals(getIsConst());
			case EaobjectmodelPackage.METHOD__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? getIsLeaf() != null : !IS_LEAF_EDEFAULT.equals(getIsLeaf());
			case EaobjectmodelPackage.METHOD__IS_PURE:
				return IS_PURE_EDEFAULT == null ? getIsPure() != null : !IS_PURE_EDEFAULT.equals(getIsPure());
			case EaobjectmodelPackage.METHOD__IS_QUERY:
				return IS_QUERY_EDEFAULT == null ? getIsQuery() != null : !IS_QUERY_EDEFAULT.equals(getIsQuery());
			case EaobjectmodelPackage.METHOD__IS_ROOT:
				return IS_ROOT_EDEFAULT == null ? getIsRoot() != null : !IS_ROOT_EDEFAULT.equals(getIsRoot());
			case EaobjectmodelPackage.METHOD__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? getIsStatic() != null : !IS_STATIC_EDEFAULT.equals(getIsStatic());
			case EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED:
				return IS_SYNCHRONIZED_EDEFAULT == null ? getIsSynchronized() != null : !IS_SYNCHRONIZED_EDEFAULT.equals(getIsSynchronized());
			case EaobjectmodelPackage.METHOD__METHOD_GUID:
				return METHOD_GUID_EDEFAULT == null ? getMethodGUID() != null : !METHOD_GUID_EDEFAULT.equals(getMethodGUID());
			case EaobjectmodelPackage.METHOD__METHOD_ID:
				return METHOD_ID_EDEFAULT == null ? getMethodID() != null : !METHOD_ID_EDEFAULT.equals(getMethodID());
			case EaobjectmodelPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EaobjectmodelPackage.METHOD__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
			case EaobjectmodelPackage.METHOD__PARENT:
				return basicGetParent() != null;
			case EaobjectmodelPackage.METHOD__POS:
				return POS_EDEFAULT == null ? getPos() != null : !POS_EDEFAULT.equals(getPos());
			case EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY:
				return RETURN_IS_ARRAY_EDEFAULT == null ? getReturnIsArray() != null : !RETURN_IS_ARRAY_EDEFAULT.equals(getReturnIsArray());
			case EaobjectmodelPackage.METHOD__STATE_FLAGS:
				return STATE_FLAGS_EDEFAULT == null ? getStateFlags() != null : !STATE_FLAGS_EDEFAULT.equals(getStateFlags());
			case EaobjectmodelPackage.METHOD__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? getStereotype() != null : !STEREOTYPE_EDEFAULT.equals(getStereotype());
			case EaobjectmodelPackage.METHOD__STYLE:
				return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
			case EaobjectmodelPackage.METHOD__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? getStyleEx() != null : !STYLE_EX_EDEFAULT.equals(getStyleEx());
			case EaobjectmodelPackage.METHOD__THROWS:
				return THROWS_EDEFAULT == null ? getThrows() != null : !THROWS_EDEFAULT.equals(getThrows());
			case EaobjectmodelPackage.METHOD__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case EaobjectmodelPackage.METHOD__CONCURRENCY:
				return CONCURRENCY_EDEFAULT == null ? getConcurrency() != null : !CONCURRENCY_EDEFAULT.equals(getConcurrency());
			case EaobjectmodelPackage.METHOD__GEN_OPTION:
				return GEN_OPTION_EDEFAULT == null ? getGenOption() != null : !GEN_OPTION_EDEFAULT.equals(getGenOption());
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
