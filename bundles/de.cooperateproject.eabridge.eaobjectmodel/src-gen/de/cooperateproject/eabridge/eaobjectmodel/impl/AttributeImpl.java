/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getAttributeGUID <em>Attribute GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl#getGenOption <em>Gen Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_DUPLICATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowDuplicates = ALLOW_DUPLICATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeGUID() <em>Attribute GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeGUID() <em>Attribute GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGUID()
	 * @generated
	 * @ordered
	 */
	protected String attributeGUID = ATTRIBUTE_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final Long ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected Long attributeID = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference attributeType;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected String containment = CONTAINMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeConstraint> constraints;

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
	 * The default value of the '{@link #getIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COLLECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCollection()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCollection = IS_COLLECTION_EDEFAULT;

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
	 * The default value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

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
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected String precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected String scale = SCALE_EDEFAULT;

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
	protected EList<AttributeTag> taggedValues;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.PRIVATE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

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
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowDuplicates() {
		return allowDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDuplicates(Boolean newAllowDuplicates) {
		Boolean oldAllowDuplicates = allowDuplicates;
		allowDuplicates = newAllowDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeGUID() {
		return attributeGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeGUID(String newAttributeGUID) {
		String oldAttributeGUID = attributeGUID;
		attributeGUID = newAttributeGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID, oldAttributeGUID, attributeGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAttributeID() {
		return attributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(Long newAttributeID) {
		Long oldAttributeID = attributeID;
		attributeID = newAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID, oldAttributeID, attributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeType(TypeReference newAttributeType, NotificationChain msgs) {
		TypeReference oldAttributeType = attributeType;
		attributeType = newAttributeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, newAttributeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(TypeReference newAttributeType) {
		if (newAttributeType != attributeType) {
			NotificationChain msgs = null;
			if (attributeType != null)
				msgs = ((InternalEObject)attributeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, null, msgs);
			if (newAttributeType != null)
				msgs = ((InternalEObject)newAttributeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, null, msgs);
			msgs = basicSetAttributeType(newAttributeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, newAttributeType, newAttributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(String newContainment) {
		String oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<AttributeConstraint>(AttributeConstraint.class, this, EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS);
		}
		return constraints;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(Boolean newIsCollection) {
		Boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION, oldIsCollection, isCollection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__IS_CONST, oldIsConst, isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(Boolean newIsDerived) {
		Boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND, oldLowerBound, lowerBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		if (eContainerFeatureID() != EaobjectmodelPackage.ATTRIBUTE__PARENT) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		if (eContainerFeatureID() != EaobjectmodelPackage.ATTRIBUTE__PARENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EaobjectmodelPackage.ATTRIBUTE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EaobjectmodelPackage.ATTRIBUTE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EaobjectmodelPackage.ELEMENT__ATTRIBUTES, Element.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(String newPrecision) {
		String oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		String oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__SCALE, oldScale, scale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeTag> getTaggedValues() {
		if (taggedValues == null) {
			taggedValues = new EObjectContainmentWithInverseEList<AttributeTag>(AttributeTag.class, this, EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES, EaobjectmodelPackage.ATTRIBUTE_TAG__ATTRIBUTE);
		}
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__SCOPE, oldScope, scope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION, oldGenOption, genOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Element)otherEnd, msgs);
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaggedValues()).basicAdd(otherEnd, msgs);
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
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return basicSetAttributeType(null, msgs);
			case EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				return basicSetParent(null, msgs);
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
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
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.ELEMENT__ATTRIBUTES, Element.class, msgs);
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
			case EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES:
				return getAllowDuplicates();
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID:
				return getAttributeGUID();
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID:
				return getAttributeID();
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return getAttributeType();
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINER:
				return getContainer();
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT:
				return getContainment();
			case EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS:
				return getConstraints();
			case EaobjectmodelPackage.ATTRIBUTE__DEFAULT:
				return getDefault();
			case EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION:
				return getIsCollection();
			case EaobjectmodelPackage.ATTRIBUTE__IS_CONST:
				return getIsConst();
			case EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED:
				return getIsDerived();
			case EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED:
				return getIsOrdered();
			case EaobjectmodelPackage.ATTRIBUTE__IS_STATIC:
				return getIsStatic();
			case EaobjectmodelPackage.ATTRIBUTE__LENGTH:
				return getLength();
			case EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND:
				return getLowerBound();
			case EaobjectmodelPackage.ATTRIBUTE__NAME:
				return getName();
			case EaobjectmodelPackage.ATTRIBUTE__NOTES:
				return getNotes();
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case EaobjectmodelPackage.ATTRIBUTE__POS:
				return getPos();
			case EaobjectmodelPackage.ATTRIBUTE__PRECISION:
				return getPrecision();
			case EaobjectmodelPackage.ATTRIBUTE__SCALE:
				return getScale();
			case EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE:
				return getStereotype();
			case EaobjectmodelPackage.ATTRIBUTE__STYLE:
				return getStyle();
			case EaobjectmodelPackage.ATTRIBUTE__STYLE_EX:
				return getStyleEx();
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
				return getTaggedValues();
			case EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND:
				return getUpperBound();
			case EaobjectmodelPackage.ATTRIBUTE__SCOPE:
				return getScope();
			case EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION:
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
			case EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES:
				setAllowDuplicates((Boolean)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID:
				setAttributeGUID((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID((Long)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((TypeReference)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINER:
				setContainer((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT:
				setContainment((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends AttributeConstraint>)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__DEFAULT:
				setDefault((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__LENGTH:
				setLength((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__NOTES:
				setNotes((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				setParent((Element)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__POS:
				setPos((Long)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__PRECISION:
				setPrecision((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__SCALE:
				setScale((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__STYLE:
				setStyle((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((Collection<? extends AttributeTag>)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND:
				setUpperBound((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__SCOPE:
				setScope((Scope)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION:
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
			case EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES:
				setAllowDuplicates(ALLOW_DUPLICATES_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID:
				setAttributeGUID(ATTRIBUTE_GUID_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((TypeReference)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case EaobjectmodelPackage.ATTRIBUTE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				setParent((Element)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__POS:
				setPos(POS_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
				getTaggedValues().clear();
				return;
			case EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION:
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
			case EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES:
				return ALLOW_DUPLICATES_EDEFAULT == null ? allowDuplicates != null : !ALLOW_DUPLICATES_EDEFAULT.equals(allowDuplicates);
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID:
				return ATTRIBUTE_GUID_EDEFAULT == null ? attributeGUID != null : !ATTRIBUTE_GUID_EDEFAULT.equals(attributeGUID);
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return attributeType != null;
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT:
				return CONTAINMENT_EDEFAULT == null ? containment != null : !CONTAINMENT_EDEFAULT.equals(containment);
			case EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case EaobjectmodelPackage.ATTRIBUTE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION:
				return IS_COLLECTION_EDEFAULT == null ? isCollection != null : !IS_COLLECTION_EDEFAULT.equals(isCollection);
			case EaobjectmodelPackage.ATTRIBUTE__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
			case EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED:
				return IS_DERIVED_EDEFAULT == null ? isDerived != null : !IS_DERIVED_EDEFAULT.equals(isDerived);
			case EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case EaobjectmodelPackage.ATTRIBUTE__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case EaobjectmodelPackage.ATTRIBUTE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case EaobjectmodelPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaobjectmodelPackage.ATTRIBUTE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				return basicGetParent() != null;
			case EaobjectmodelPackage.ATTRIBUTE__POS:
				return POS_EDEFAULT == null ? pos != null : !POS_EDEFAULT.equals(pos);
			case EaobjectmodelPackage.ATTRIBUTE__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case EaobjectmodelPackage.ATTRIBUTE__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EaobjectmodelPackage.ATTRIBUTE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case EaobjectmodelPackage.ATTRIBUTE__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
			case EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case EaobjectmodelPackage.ATTRIBUTE__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION:
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
		result.append(" (AllowDuplicates: ");
		result.append(allowDuplicates);
		result.append(", AttributeGUID: ");
		result.append(attributeGUID);
		result.append(", AttributeID: ");
		result.append(attributeID);
		result.append(", Container: ");
		result.append(container);
		result.append(", Containment: ");
		result.append(containment);
		result.append(", Default: ");
		result.append(default_);
		result.append(", IsCollection: ");
		result.append(isCollection);
		result.append(", IsConst: ");
		result.append(isConst);
		result.append(", IsDerived: ");
		result.append(isDerived);
		result.append(", IsOrdered: ");
		result.append(isOrdered);
		result.append(", IsStatic: ");
		result.append(isStatic);
		result.append(", Length: ");
		result.append(length);
		result.append(", LowerBound: ");
		result.append(lowerBound);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Pos: ");
		result.append(pos);
		result.append(", Precision: ");
		result.append(precision);
		result.append(", Scale: ");
		result.append(scale);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", Style: ");
		result.append(style);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", UpperBound: ");
		result.append(upperBound);
		result.append(", Scope: ");
		result.append(scope);
		result.append(", GenOption: ");
		result.append(genOption);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
