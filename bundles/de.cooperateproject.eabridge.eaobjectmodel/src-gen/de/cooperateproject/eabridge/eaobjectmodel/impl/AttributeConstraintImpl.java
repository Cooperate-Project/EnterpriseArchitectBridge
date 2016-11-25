/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getElementOfAttribute <em>Element Of Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getAttName <em>Att Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeConstraintImpl extends MinimalEObjectImpl.Container implements AttributeConstraint {
	/**
	 * The cached value of the '{@link #getElementOfAttribute() <em>Element Of Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementOfAttribute()
	 * @generated
	 * @ordered
	 */
	protected Element elementOfAttribute;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected String constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttName()
	 * @generated
	 * @ordered
	 */
	protected String attName = ATT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.ATTRIBUTE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElementOfAttribute() {
		if (elementOfAttribute != null && elementOfAttribute.eIsProxy()) {
			InternalEObject oldElementOfAttribute = (InternalEObject)elementOfAttribute;
			elementOfAttribute = (Element)eResolveProxy(oldElementOfAttribute);
			if (elementOfAttribute != oldElementOfAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, oldElementOfAttribute, elementOfAttribute));
			}
		}
		return elementOfAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElementOfAttribute() {
		return elementOfAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementOfAttribute(Element newElementOfAttribute) {
		Element oldElementOfAttribute = elementOfAttribute;
		elementOfAttribute = newElementOfAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE, oldElementOfAttribute, elementOfAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		String oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttName() {
		return attName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttName(String newAttName) {
		String oldAttName = attName;
		attName = newAttName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME, oldAttName, attName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				if (resolve) return getElementOfAttribute();
				return basicGetElementOfAttribute();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				return getConstraint();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				return getAttName();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				return getNotes();
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				return getType();
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				setElementOfAttribute((Element)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				setAttName((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				setNotes((String)newValue);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				setType((String)newValue);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				setElementOfAttribute((Element)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				setAttName(ATT_NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE:
				return elementOfAttribute != null;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE:
				return attribute != null;
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__ATT_NAME:
				return ATT_NAME_EDEFAULT == null ? attName != null : !ATT_NAME_EDEFAULT.equals(attName);
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (Constraint: ");
		result.append(constraint);
		result.append(", AttName: ");
		result.append(attName);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AttributeConstraintImpl
