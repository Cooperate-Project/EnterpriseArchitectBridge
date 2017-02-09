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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__ALLOW_DUPLICATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDuplicates(Boolean newAllowDuplicates) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__ALLOW_DUPLICATES, newAllowDuplicates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeGUID() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeGUID(String newAttributeGUID) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_GUID, newAttributeGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAttributeID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(Long newAttributeID) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_ID, newAttributeID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getAttributeType() {
		return (TypeReference)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(TypeReference newAttributeType) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__ATTRIBUTE_TYPE, newAttributeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainment() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(String newContainment) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__CONTAINMENT, newContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeConstraint> getConstraints() {
		return (EList<AttributeConstraint>)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCollection() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(Boolean newIsCollection) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_COLLECTION, newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_CONST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_CONST, newIsConst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDerived() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_DERIVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(Boolean newIsDerived) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_DERIVED, newIsDerived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_ORDERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_ORDERED, newIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_STATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__IS_STATIC, newIsStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__LOWER_BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__LOWER_BOUND, newLowerBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		return (Element)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPos() {
		return (Long)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__POS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Long newPos) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__POS, newPos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecision() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(String newPrecision) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE_EX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeTag> getTaggedValues() {
		return (EList<AttributeTag>)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__TAGGED_VALUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__UPPER_BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return (Scope)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenOption() {
		return (String)eGet(EaobjectmodelPackage.Literals.ATTRIBUTE__GEN_OPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOption(String newGenOption) {
		eSet(EaobjectmodelPackage.Literals.ATTRIBUTE__GEN_OPTION, newGenOption);
	}

} //AttributeImpl
