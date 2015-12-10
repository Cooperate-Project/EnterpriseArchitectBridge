/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Element;
import de.cooperate.plantumlpp.xcore.Method;
import de.cooperate.plantumlpp.xcore.MethodConstraint;
import de.cooperate.plantumlpp.xcore.MethodTag;
import de.cooperate.plantumlpp.xcore.Parameter;
import de.cooperate.plantumlpp.xcore.VisibilityType;
import de.cooperate.plantumlpp.xcore.XcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getCode <em>Code</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsPure <em>Is Pure</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getMethodGUID <em>Method GUID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getReturnIsArray <em>Return Is Array</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getStateFlags <em>State Flags</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.MethodImpl#getVisibility <em>Visibility</em>}</li>
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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Element classifier;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getPostConditions() <em>Post Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConstraint> postConditions;

	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConstraint> preConditions;

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
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodTag> taggedValues;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityType VISIBILITY_EDEFAULT = VisibilityType.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityType visibility = VISIBILITY_EDEFAULT;

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
		return XcorePackage.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier(Element newClassifier, NotificationChain msgs) {
		Element oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__CLASSIFIER, oldClassifier, newClassifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Element newClassifier) {
		if (newClassifier != classifier) {
			NotificationChain msgs = null;
			if (classifier != null)
				msgs = ((InternalEObject)classifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.METHOD__CLASSIFIER, null, msgs);
			if (newClassifier != null)
				msgs = ((InternalEObject)newClassifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.METHOD__CLASSIFIER, null, msgs);
			msgs = basicSetClassifier(newClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__CLASSIFIER, newClassifier, newClassifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_CONST, oldIsConst, isConst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_LEAF, oldIsLeaf, isLeaf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_PURE, oldIsPure, isPure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_QUERY, oldIsQuery, isQuery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_ROOT, oldIsRoot, isRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_STATIC, oldIsStatic, isStatic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__IS_SYNCHRONIZED, oldIsSynchronized, isSynchronized));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__METHOD_GUID, oldMethodGUID, methodGUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__METHOD_ID, oldMethodID, methodID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, XcorePackage.METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		if (eContainerFeatureID() != XcorePackage.METHOD__PARENT) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		if (eContainerFeatureID() != XcorePackage.METHOD__PARENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, XcorePackage.METHOD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != XcorePackage.METHOD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, XcorePackage.ELEMENT__METHODS, Element.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConstraint> getPostConditions() {
		if (postConditions == null) {
			postConditions = new EObjectResolvingEList<MethodConstraint>(MethodConstraint.class, this, XcorePackage.METHOD__POST_CONDITIONS);
		}
		return postConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConstraint> getPreConditions() {
		if (preConditions == null) {
			preConditions = new EObjectResolvingEList<MethodConstraint>(MethodConstraint.class, this, XcorePackage.METHOD__PRE_CONDITIONS);
		}
		return preConditions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__RETURN_IS_ARRAY, oldReturnIsArray, returnIsArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__STATE_FLAGS, oldStateFlags, stateFlags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodTag> getTaggedValues() {
		if (taggedValues == null) {
			taggedValues = new EObjectContainmentEList<MethodTag>(MethodTag.class, this, XcorePackage.METHOD__TAGGED_VALUES);
		}
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityType newVisibility) {
		VisibilityType oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.METHOD__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.METHOD__PARENT:
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
			case XcorePackage.METHOD__CLASSIFIER:
				return basicSetClassifier(null, msgs);
			case XcorePackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case XcorePackage.METHOD__PARENT:
				return basicSetParent(null, msgs);
			case XcorePackage.METHOD__TAGGED_VALUES:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XcorePackage.METHOD__PARENT:
				return eInternalContainer().eInverseRemove(this, XcorePackage.ELEMENT__METHODS, Element.class, msgs);
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
			case XcorePackage.METHOD__ABSTRACT:
				return getAbstract();
			case XcorePackage.METHOD__BEHAVIOR:
				return getBehavior();
			case XcorePackage.METHOD__CLASSIFIER:
				return getClassifier();
			case XcorePackage.METHOD__CODE:
				return getCode();
			case XcorePackage.METHOD__IS_CONST:
				return getIsConst();
			case XcorePackage.METHOD__IS_LEAF:
				return getIsLeaf();
			case XcorePackage.METHOD__IS_PURE:
				return getIsPure();
			case XcorePackage.METHOD__IS_QUERY:
				return getIsQuery();
			case XcorePackage.METHOD__IS_ROOT:
				return getIsRoot();
			case XcorePackage.METHOD__IS_STATIC:
				return getIsStatic();
			case XcorePackage.METHOD__IS_SYNCHRONIZED:
				return getIsSynchronized();
			case XcorePackage.METHOD__METHOD_GUID:
				return getMethodGUID();
			case XcorePackage.METHOD__METHOD_ID:
				return getMethodID();
			case XcorePackage.METHOD__NAME:
				return getName();
			case XcorePackage.METHOD__NOTES:
				return getNotes();
			case XcorePackage.METHOD__PARAMETERS:
				return getParameters();
			case XcorePackage.METHOD__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case XcorePackage.METHOD__POS:
				return getPos();
			case XcorePackage.METHOD__POST_CONDITIONS:
				return getPostConditions();
			case XcorePackage.METHOD__PRE_CONDITIONS:
				return getPreConditions();
			case XcorePackage.METHOD__RETURN_IS_ARRAY:
				return getReturnIsArray();
			case XcorePackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case XcorePackage.METHOD__STATE_FLAGS:
				return getStateFlags();
			case XcorePackage.METHOD__STEREOTYPE:
				return getStereotype();
			case XcorePackage.METHOD__STYLE:
				return getStyle();
			case XcorePackage.METHOD__STYLE_EX:
				return getStyleEx();
			case XcorePackage.METHOD__TAGGED_VALUES:
				return getTaggedValues();
			case XcorePackage.METHOD__VISIBILITY:
				return getVisibility();
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
			case XcorePackage.METHOD__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case XcorePackage.METHOD__BEHAVIOR:
				setBehavior((String)newValue);
				return;
			case XcorePackage.METHOD__CLASSIFIER:
				setClassifier((Element)newValue);
				return;
			case XcorePackage.METHOD__CODE:
				setCode((String)newValue);
				return;
			case XcorePackage.METHOD__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case XcorePackage.METHOD__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case XcorePackage.METHOD__IS_PURE:
				setIsPure((Boolean)newValue);
				return;
			case XcorePackage.METHOD__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case XcorePackage.METHOD__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case XcorePackage.METHOD__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case XcorePackage.METHOD__IS_SYNCHRONIZED:
				setIsSynchronized((Boolean)newValue);
				return;
			case XcorePackage.METHOD__METHOD_GUID:
				setMethodGUID((String)newValue);
				return;
			case XcorePackage.METHOD__METHOD_ID:
				setMethodID((Long)newValue);
				return;
			case XcorePackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.METHOD__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case XcorePackage.METHOD__PARENT:
				setParent((Element)newValue);
				return;
			case XcorePackage.METHOD__POS:
				setPos((Long)newValue);
				return;
			case XcorePackage.METHOD__POST_CONDITIONS:
				getPostConditions().clear();
				getPostConditions().addAll((Collection<? extends MethodConstraint>)newValue);
				return;
			case XcorePackage.METHOD__PRE_CONDITIONS:
				getPreConditions().clear();
				getPreConditions().addAll((Collection<? extends MethodConstraint>)newValue);
				return;
			case XcorePackage.METHOD__RETURN_IS_ARRAY:
				setReturnIsArray((Boolean)newValue);
				return;
			case XcorePackage.METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case XcorePackage.METHOD__STATE_FLAGS:
				setStateFlags((String)newValue);
				return;
			case XcorePackage.METHOD__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XcorePackage.METHOD__STYLE:
				setStyle((String)newValue);
				return;
			case XcorePackage.METHOD__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case XcorePackage.METHOD__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((Collection<? extends MethodTag>)newValue);
				return;
			case XcorePackage.METHOD__VISIBILITY:
				setVisibility((VisibilityType)newValue);
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
			case XcorePackage.METHOD__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case XcorePackage.METHOD__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case XcorePackage.METHOD__CLASSIFIER:
				setClassifier((Element)null);
				return;
			case XcorePackage.METHOD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_PURE:
				setIsPure(IS_PURE_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case XcorePackage.METHOD__IS_SYNCHRONIZED:
				setIsSynchronized(IS_SYNCHRONIZED_EDEFAULT);
				return;
			case XcorePackage.METHOD__METHOD_GUID:
				setMethodGUID(METHOD_GUID_EDEFAULT);
				return;
			case XcorePackage.METHOD__METHOD_ID:
				setMethodID(METHOD_ID_EDEFAULT);
				return;
			case XcorePackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.METHOD__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case XcorePackage.METHOD__PARENT:
				setParent((Element)null);
				return;
			case XcorePackage.METHOD__POS:
				setPos(POS_EDEFAULT);
				return;
			case XcorePackage.METHOD__POST_CONDITIONS:
				getPostConditions().clear();
				return;
			case XcorePackage.METHOD__PRE_CONDITIONS:
				getPreConditions().clear();
				return;
			case XcorePackage.METHOD__RETURN_IS_ARRAY:
				setReturnIsArray(RETURN_IS_ARRAY_EDEFAULT);
				return;
			case XcorePackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case XcorePackage.METHOD__STATE_FLAGS:
				setStateFlags(STATE_FLAGS_EDEFAULT);
				return;
			case XcorePackage.METHOD__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.METHOD__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XcorePackage.METHOD__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case XcorePackage.METHOD__TAGGED_VALUES:
				getTaggedValues().clear();
				return;
			case XcorePackage.METHOD__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
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
			case XcorePackage.METHOD__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case XcorePackage.METHOD__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
			case XcorePackage.METHOD__CLASSIFIER:
				return classifier != null;
			case XcorePackage.METHOD__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XcorePackage.METHOD__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
			case XcorePackage.METHOD__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case XcorePackage.METHOD__IS_PURE:
				return IS_PURE_EDEFAULT == null ? isPure != null : !IS_PURE_EDEFAULT.equals(isPure);
			case XcorePackage.METHOD__IS_QUERY:
				return IS_QUERY_EDEFAULT == null ? isQuery != null : !IS_QUERY_EDEFAULT.equals(isQuery);
			case XcorePackage.METHOD__IS_ROOT:
				return IS_ROOT_EDEFAULT == null ? isRoot != null : !IS_ROOT_EDEFAULT.equals(isRoot);
			case XcorePackage.METHOD__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case XcorePackage.METHOD__IS_SYNCHRONIZED:
				return IS_SYNCHRONIZED_EDEFAULT == null ? isSynchronized != null : !IS_SYNCHRONIZED_EDEFAULT.equals(isSynchronized);
			case XcorePackage.METHOD__METHOD_GUID:
				return METHOD_GUID_EDEFAULT == null ? methodGUID != null : !METHOD_GUID_EDEFAULT.equals(methodGUID);
			case XcorePackage.METHOD__METHOD_ID:
				return METHOD_ID_EDEFAULT == null ? methodID != null : !METHOD_ID_EDEFAULT.equals(methodID);
			case XcorePackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.METHOD__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case XcorePackage.METHOD__PARENT:
				return basicGetParent() != null;
			case XcorePackage.METHOD__POS:
				return POS_EDEFAULT == null ? pos != null : !POS_EDEFAULT.equals(pos);
			case XcorePackage.METHOD__POST_CONDITIONS:
				return postConditions != null && !postConditions.isEmpty();
			case XcorePackage.METHOD__PRE_CONDITIONS:
				return preConditions != null && !preConditions.isEmpty();
			case XcorePackage.METHOD__RETURN_IS_ARRAY:
				return RETURN_IS_ARRAY_EDEFAULT == null ? returnIsArray != null : !RETURN_IS_ARRAY_EDEFAULT.equals(returnIsArray);
			case XcorePackage.METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case XcorePackage.METHOD__STATE_FLAGS:
				return STATE_FLAGS_EDEFAULT == null ? stateFlags != null : !STATE_FLAGS_EDEFAULT.equals(stateFlags);
			case XcorePackage.METHOD__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.METHOD__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XcorePackage.METHOD__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.METHOD__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
			case XcorePackage.METHOD__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
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
		result.append(", Behavior: ");
		result.append(behavior);
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
		result.append(", ReturnType: ");
		result.append(returnType);
		result.append(", StateFlags: ");
		result.append(stateFlags);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", Style: ");
		result.append(style);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", Visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
