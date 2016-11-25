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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference returnType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Methodparameter> parameters;

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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

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
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected String behaviour = BEHAVIOUR_EDEFAULT;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLeaf = IS_LEAF_EDEFAULT;

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
	 * The cached value of the '{@link #getIsPure() <em>Is Pure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPure()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPure = IS_PURE_EDEFAULT;

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
	 * The cached value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected Boolean isQuery = IS_QUERY_EDEFAULT;

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
	 * The cached value of the '{@link #getIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoot()
	 * @generated
	 * @ordered
	 */
	protected Boolean isRoot = IS_ROOT_EDEFAULT;

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
	 * The cached value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStatic = IS_STATIC_EDEFAULT;

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
	 * The cached value of the '{@link #getIsSynchronized() <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronized()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSynchronized = IS_SYNCHRONIZED_EDEFAULT;

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
	 * The cached value of the '{@link #getMethodGUID() <em>Method GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodGUID()
	 * @generated
	 * @ordered
	 */
	protected String methodGUID = METHOD_GUID_EDEFAULT;

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
	 * The cached value of the '{@link #getMethodID() <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected Long methodID = METHOD_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final Long POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected Long pos = POS_EDEFAULT;

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
	 * The cached value of the '{@link #getReturnIsArray() <em>Return Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnIsArray()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnIsArray = RETURN_IS_ARRAY_EDEFAULT;

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
	 * The cached value of the '{@link #getStateFlags() <em>State Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFlags()
	 * @generated
	 * @ordered
	 */
	protected String stateFlags = STATE_FLAGS_EDEFAULT;

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
	 * The default value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected static final String THROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected String throws_ = THROWS_EDEFAULT;

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
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Scope visibility = VISIBILITY_EDEFAULT;

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
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected String concurrency = CONCURRENCY_EDEFAULT;

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
	 * The cached value of the '{@link #getGenOption() <em>Gen Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOption()
	 * @generated
	 * @ordered
	 */
	protected String genOption = GEN_OPTION_EDEFAULT;

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
	public TypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		TypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaobjectmodelPackage.METHOD__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaobjectmodelPackage.METHOD__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Methodparameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Methodparameter>(Methodparameter.class, this, EaobjectmodelPackage.METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviour() {
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(String newBehaviour) {
		String oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__BEHAVIOUR, oldBehaviour, behaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_CONST, oldIsConst, isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		Boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPure() {
		return isPure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPure(Boolean newIsPure) {
		Boolean oldIsPure = isPure;
		isPure = newIsPure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_PURE, oldIsPure, isPure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(Boolean newIsQuery) {
		Boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		Boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		Boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSynchronized() {
		return isSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronized(Boolean newIsSynchronized) {
		Boolean oldIsSynchronized = isSynchronized;
		isSynchronized = newIsSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED, oldIsSynchronized, isSynchronized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodGUID() {
		return methodGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodGUID(String newMethodGUID) {
		String oldMethodGUID = methodGUID;
		methodGUID = newMethodGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__METHOD_GUID, oldMethodGUID, methodGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMethodID() {
		return methodID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodID(Long newMethodID) {
		Long oldMethodID = methodID;
		methodID = newMethodID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__METHOD_ID, oldMethodID, methodID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		if (eContainerFeatureID() != EaobjectmodelPackage.METHOD__PARENT) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		if (eContainerFeatureID() != EaobjectmodelPackage.METHOD__PARENT) return null;
		return (Element)eInternalContainer();
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
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EaobjectmodelPackage.METHOD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EaobjectmodelPackage.ELEMENT__METHODS, Element.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Long newPos) {
		Long oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnIsArray() {
		return returnIsArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnIsArray(Boolean newReturnIsArray) {
		Boolean oldReturnIsArray = returnIsArray;
		returnIsArray = newReturnIsArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY, oldReturnIsArray, returnIsArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateFlags() {
		return stateFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFlags(String newStateFlags) {
		String oldStateFlags = stateFlags;
		stateFlags = newStateFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__STATE_FLAGS, oldStateFlags, stateFlags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThrows() {
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrows(String newThrows) {
		String oldThrows = throws_;
		throws_ = newThrows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__THROWS, oldThrows, throws_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Scope newVisibility) {
		Scope oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		String oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenOption() {
		return genOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOption(String newGenOption) {
		String oldGenOption = genOption;
		genOption = newGenOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.METHOD__GEN_OPTION, oldGenOption, genOption));
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
				return returnType != null;
			case EaobjectmodelPackage.METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case EaobjectmodelPackage.METHOD__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case EaobjectmodelPackage.METHOD__BEHAVIOUR:
				return BEHAVIOUR_EDEFAULT == null ? behaviour != null : !BEHAVIOUR_EDEFAULT.equals(behaviour);
			case EaobjectmodelPackage.METHOD__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case EaobjectmodelPackage.METHOD__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
			case EaobjectmodelPackage.METHOD__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case EaobjectmodelPackage.METHOD__IS_PURE:
				return IS_PURE_EDEFAULT == null ? isPure != null : !IS_PURE_EDEFAULT.equals(isPure);
			case EaobjectmodelPackage.METHOD__IS_QUERY:
				return IS_QUERY_EDEFAULT == null ? isQuery != null : !IS_QUERY_EDEFAULT.equals(isQuery);
			case EaobjectmodelPackage.METHOD__IS_ROOT:
				return IS_ROOT_EDEFAULT == null ? isRoot != null : !IS_ROOT_EDEFAULT.equals(isRoot);
			case EaobjectmodelPackage.METHOD__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case EaobjectmodelPackage.METHOD__IS_SYNCHRONIZED:
				return IS_SYNCHRONIZED_EDEFAULT == null ? isSynchronized != null : !IS_SYNCHRONIZED_EDEFAULT.equals(isSynchronized);
			case EaobjectmodelPackage.METHOD__METHOD_GUID:
				return METHOD_GUID_EDEFAULT == null ? methodGUID != null : !METHOD_GUID_EDEFAULT.equals(methodGUID);
			case EaobjectmodelPackage.METHOD__METHOD_ID:
				return METHOD_ID_EDEFAULT == null ? methodID != null : !METHOD_ID_EDEFAULT.equals(methodID);
			case EaobjectmodelPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaobjectmodelPackage.METHOD__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EaobjectmodelPackage.METHOD__PARENT:
				return basicGetParent() != null;
			case EaobjectmodelPackage.METHOD__POS:
				return POS_EDEFAULT == null ? pos != null : !POS_EDEFAULT.equals(pos);
			case EaobjectmodelPackage.METHOD__RETURN_IS_ARRAY:
				return RETURN_IS_ARRAY_EDEFAULT == null ? returnIsArray != null : !RETURN_IS_ARRAY_EDEFAULT.equals(returnIsArray);
			case EaobjectmodelPackage.METHOD__STATE_FLAGS:
				return STATE_FLAGS_EDEFAULT == null ? stateFlags != null : !STATE_FLAGS_EDEFAULT.equals(stateFlags);
			case EaobjectmodelPackage.METHOD__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EaobjectmodelPackage.METHOD__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case EaobjectmodelPackage.METHOD__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case EaobjectmodelPackage.METHOD__THROWS:
				return THROWS_EDEFAULT == null ? throws_ != null : !THROWS_EDEFAULT.equals(throws_);
			case EaobjectmodelPackage.METHOD__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case EaobjectmodelPackage.METHOD__CONCURRENCY:
				return CONCURRENCY_EDEFAULT == null ? concurrency != null : !CONCURRENCY_EDEFAULT.equals(concurrency);
			case EaobjectmodelPackage.METHOD__GEN_OPTION:
				return GEN_OPTION_EDEFAULT == null ? genOption != null : !GEN_OPTION_EDEFAULT.equals(genOption);
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
		result.append(" (Abstract: ");
		result.append(abstract_);
		result.append(", Behaviour: ");
		result.append(behaviour);
		result.append(", Code: ");
		result.append(code);
		result.append(", IsConst: ");
		result.append(isConst);
		result.append(", IsLeaf: ");
		result.append(isLeaf);
		result.append(", IsPure: ");
		result.append(isPure);
		result.append(", IsQuery: ");
		result.append(isQuery);
		result.append(", IsRoot: ");
		result.append(isRoot);
		result.append(", IsStatic: ");
		result.append(isStatic);
		result.append(", IsSynchronized: ");
		result.append(isSynchronized);
		result.append(", MethodGUID: ");
		result.append(methodGUID);
		result.append(", MethodID: ");
		result.append(methodID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Pos: ");
		result.append(pos);
		result.append(", ReturnIsArray: ");
		result.append(returnIsArray);
		result.append(", StateFlags: ");
		result.append(stateFlags);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", Style: ");
		result.append(style);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", Throws: ");
		result.append(throws_);
		result.append(", Visibility: ");
		result.append(visibility);
		result.append(", Concurrency: ");
		result.append(concurrency);
		result.append(", GenOption: ");
		result.append(genOption);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
