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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
	 * The default value of the '{@link #getAttributeGUID() <em>Attribute GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_GUID_EDEFAULT = null;
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
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;
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
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;
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
	 * The default value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONST_EDEFAULT = null;
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
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = null;
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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;
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
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;
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
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = null;
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowDuplicates() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES, EaobjectmodelPackage.Literals.ATTRIBUTE__ALLOW_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDuplicates(Boolean newAllowDuplicates) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__ALLOW_DUPLICATES, EaobjectmodelPackage.Literals.ATTRIBUTE__ALLOW_DUPLICATES, newAllowDuplicates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeGUID() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID, EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_GUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeGUID(String newAttributeGUID) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID, EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_GUID, newAttributeGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAttributeID() {
		return (Long)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID, EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(Long newAttributeID) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID, EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_ID, newAttributeID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getAttributeType() {
		return (TypeReference)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeType(TypeReference newAttributeType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAttributeType, EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(TypeReference newAttributeType) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_TYPE, newAttributeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__CONTAINER, EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__CONTAINER, EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainment() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT, EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(String newContainment) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT, EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINMENT, newContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeConstraint> getConstraints() {
		return (EList<AttributeConstraint>)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS, EaobjectmodelPackage.Literals.ATTRIBUTE__CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__DEFAULT, EaobjectmodelPackage.Literals.ATTRIBUTE__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__DEFAULT, EaobjectmodelPackage.Literals.ATTRIBUTE__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCollection() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_COLLECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(Boolean newIsCollection) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_COLLECTION, newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__IS_CONST, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_CONST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__IS_CONST, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_CONST, newIsConst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDerived() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_DERIVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(Boolean newIsDerived) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_DERIVED, newIsDerived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_ORDERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_ORDERED, newIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__IS_STATIC, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__IS_STATIC, EaobjectmodelPackage.Literals.ATTRIBUTE__IS_STATIC, newIsStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__LENGTH, EaobjectmodelPackage.Literals.ATTRIBUTE__LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__LENGTH, EaobjectmodelPackage.Literals.ATTRIBUTE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND, EaobjectmodelPackage.Literals.ATTRIBUTE__LOWER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND, EaobjectmodelPackage.Literals.ATTRIBUTE__LOWER_BOUND, newLowerBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__NAME, EaobjectmodelPackage.Literals.ATTRIBUTE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__NAME, EaobjectmodelPackage.Literals.ATTRIBUTE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__NOTES, EaobjectmodelPackage.Literals.ATTRIBUTE__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__NOTES, EaobjectmodelPackage.Literals.ATTRIBUTE__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		return (Element)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__PARENT, EaobjectmodelPackage.Literals.ATTRIBUTE__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		return (Element)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__PARENT, EaobjectmodelPackage.Literals.ATTRIBUTE__PARENT, false, true);
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
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__PARENT, EaobjectmodelPackage.Literals.ATTRIBUTE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPos() {
		return (Long)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__POS, EaobjectmodelPackage.Literals.ATTRIBUTE__POS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Long newPos) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__POS, EaobjectmodelPackage.Literals.ATTRIBUTE__POS, newPos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecision() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__PRECISION, EaobjectmodelPackage.Literals.ATTRIBUTE__PRECISION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(String newPrecision) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__PRECISION, EaobjectmodelPackage.Literals.ATTRIBUTE__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__SCALE, EaobjectmodelPackage.Literals.ATTRIBUTE__SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__SCALE, EaobjectmodelPackage.Literals.ATTRIBUTE__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE, EaobjectmodelPackage.Literals.ATTRIBUTE__STEREOTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE, EaobjectmodelPackage.Literals.ATTRIBUTE__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__STYLE, EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__STYLE, EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__STYLE_EX, EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE_EX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__STYLE_EX, EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeTag> getTaggedValues() {
		return (EList<AttributeTag>)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES, EaobjectmodelPackage.Literals.ATTRIBUTE__TAGGED_VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND, EaobjectmodelPackage.Literals.ATTRIBUTE__UPPER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND, EaobjectmodelPackage.Literals.ATTRIBUTE__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return (Scope)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__SCOPE, EaobjectmodelPackage.Literals.ATTRIBUTE__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__SCOPE, EaobjectmodelPackage.Literals.ATTRIBUTE__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenOption() {
		return (String)eDynamicGet(EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION, EaobjectmodelPackage.Literals.ATTRIBUTE__GEN_OPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOption(String newGenOption) {
		eDynamicSet(EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION, EaobjectmodelPackage.Literals.ATTRIBUTE__GEN_OPTION, newGenOption);
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
				return ALLOW_DUPLICATES_EDEFAULT == null ? getAllowDuplicates() != null : !ALLOW_DUPLICATES_EDEFAULT.equals(getAllowDuplicates());
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_GUID:
				return ATTRIBUTE_GUID_EDEFAULT == null ? getAttributeGUID() != null : !ATTRIBUTE_GUID_EDEFAULT.equals(getAttributeGUID());
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? getAttributeID() != null : !ATTRIBUTE_ID_EDEFAULT.equals(getAttributeID());
			case EaobjectmodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return getAttributeType() != null;
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINER:
				return CONTAINER_EDEFAULT == null ? getContainer() != null : !CONTAINER_EDEFAULT.equals(getContainer());
			case EaobjectmodelPackage.ATTRIBUTE__CONTAINMENT:
				return CONTAINMENT_EDEFAULT == null ? getContainment() != null : !CONTAINMENT_EDEFAULT.equals(getContainment());
			case EaobjectmodelPackage.ATTRIBUTE__CONSTRAINTS:
				return !getConstraints().isEmpty();
			case EaobjectmodelPackage.ATTRIBUTE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case EaobjectmodelPackage.ATTRIBUTE__IS_COLLECTION:
				return IS_COLLECTION_EDEFAULT == null ? getIsCollection() != null : !IS_COLLECTION_EDEFAULT.equals(getIsCollection());
			case EaobjectmodelPackage.ATTRIBUTE__IS_CONST:
				return IS_CONST_EDEFAULT == null ? getIsConst() != null : !IS_CONST_EDEFAULT.equals(getIsConst());
			case EaobjectmodelPackage.ATTRIBUTE__IS_DERIVED:
				return IS_DERIVED_EDEFAULT == null ? getIsDerived() != null : !IS_DERIVED_EDEFAULT.equals(getIsDerived());
			case EaobjectmodelPackage.ATTRIBUTE__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? getIsOrdered() != null : !IS_ORDERED_EDEFAULT.equals(getIsOrdered());
			case EaobjectmodelPackage.ATTRIBUTE__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? getIsStatic() != null : !IS_STATIC_EDEFAULT.equals(getIsStatic());
			case EaobjectmodelPackage.ATTRIBUTE__LENGTH:
				return LENGTH_EDEFAULT == null ? getLength() != null : !LENGTH_EDEFAULT.equals(getLength());
			case EaobjectmodelPackage.ATTRIBUTE__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? getLowerBound() != null : !LOWER_BOUND_EDEFAULT.equals(getLowerBound());
			case EaobjectmodelPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EaobjectmodelPackage.ATTRIBUTE__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
			case EaobjectmodelPackage.ATTRIBUTE__PARENT:
				return basicGetParent() != null;
			case EaobjectmodelPackage.ATTRIBUTE__POS:
				return POS_EDEFAULT == null ? getPos() != null : !POS_EDEFAULT.equals(getPos());
			case EaobjectmodelPackage.ATTRIBUTE__PRECISION:
				return PRECISION_EDEFAULT == null ? getPrecision() != null : !PRECISION_EDEFAULT.equals(getPrecision());
			case EaobjectmodelPackage.ATTRIBUTE__SCALE:
				return SCALE_EDEFAULT == null ? getScale() != null : !SCALE_EDEFAULT.equals(getScale());
			case EaobjectmodelPackage.ATTRIBUTE__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? getStereotype() != null : !STEREOTYPE_EDEFAULT.equals(getStereotype());
			case EaobjectmodelPackage.ATTRIBUTE__STYLE:
				return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
			case EaobjectmodelPackage.ATTRIBUTE__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? getStyleEx() != null : !STYLE_EX_EDEFAULT.equals(getStyleEx());
			case EaobjectmodelPackage.ATTRIBUTE__TAGGED_VALUES:
				return !getTaggedValues().isEmpty();
			case EaobjectmodelPackage.ATTRIBUTE__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? getUpperBound() != null : !UPPER_BOUND_EDEFAULT.equals(getUpperBound());
			case EaobjectmodelPackage.ATTRIBUTE__SCOPE:
				return getScope() != SCOPE_EDEFAULT;
			case EaobjectmodelPackage.ATTRIBUTE__GEN_OPTION:
				return GEN_OPTION_EDEFAULT == null ? getGenOption() != null : !GEN_OPTION_EDEFAULT.equals(getGenOption());
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
