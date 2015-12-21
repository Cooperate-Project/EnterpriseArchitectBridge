/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getDerived <em>Derived</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getDerivedUnion <em>Derived Union</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getIsChangeable <em>Is Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getNavigable <em>Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getOwnedByClassifier <em>Owned By Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getRoleNote <em>Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndImpl extends MinimalEObjectImpl.Container implements ConnectorEnd {
	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final Long AGGREGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected Long aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

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
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

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
	 * The default value of the '{@link #getDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerived()
	 * @generated
	 * @ordered
	 */
	protected Boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedUnion() <em>Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DERIVED_UNION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedUnion() <em>Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected Boolean derivedUnion = DERIVED_UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final EndType END_EDEFAULT = EndType.CLIENT;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EndType end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The default value of the '{@link #getIsChangeable() <em>Is Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_CHANGEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsChangeable() <em>Is Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsChangeable()
	 * @generated
	 * @ordered
	 */
	protected String isChangeable = IS_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigable()
	 * @generated
	 * @ordered
	 */
	protected String navigable = NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final Long ORDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected Long ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwnedByClassifier() <em>Owned By Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OWNED_BY_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnedByClassifier() <em>Owned By Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedByClassifier()
	 * @generated
	 * @ordered
	 */
	protected Boolean ownedByClassifier = OWNED_BY_CLASSIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleNote() <em>Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleNote()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleNote() <em>Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleNote()
	 * @generated
	 * @ordered
	 */
	protected String roleNote = ROLE_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected String roleType = ROLE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.CONNECTOR_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(Long newAggregation) {
		Long oldAggregation = aggregation;
		aggregation = newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ALIAS, oldAlias, alias));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__CARDINALITY, oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__CONSTRAINT, oldConstraint, constraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(Boolean newDerived) {
		Boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDerivedUnion() {
		return derivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedUnion(Boolean newDerivedUnion) {
		Boolean oldDerivedUnion = derivedUnion;
		derivedUnion = newDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__DERIVED_UNION, oldDerivedUnion, derivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndType getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(EndType newEnd) {
		EndType oldEnd = end;
		end = newEnd == null ? END_EDEFAULT : newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.CONNECTOR_END__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.CONNECTOR_END__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsChangeable() {
		return isChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsChangeable(String newIsChangeable) {
		String oldIsChangeable = isChangeable;
		isChangeable = newIsChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__IS_CHANGEABLE, oldIsChangeable, isChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNavigable() {
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(Boolean newIsNavigable) {
		Boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavigable() {
		return navigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigable(String newNavigable) {
		String oldNavigable = navigable;
		navigable = newNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__NAVIGABLE, oldNavigable, navigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(Long newOrdering) {
		Long oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOwnedByClassifier() {
		return ownedByClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByClassifier(Boolean newOwnedByClassifier) {
		Boolean oldOwnedByClassifier = ownedByClassifier;
		ownedByClassifier = newOwnedByClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__OWNED_BY_CLASSIFIER, oldOwnedByClassifier, ownedByClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleNote() {
		return roleNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleNote(String newRoleNote) {
		String oldRoleNote = roleNote;
		roleNote = newRoleNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ROLE_NOTE, oldRoleNote, roleNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleType() {
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleType(String newRoleType) {
		String oldRoleType = roleType;
		roleType = newRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__ROLE_TYPE, oldRoleType, roleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.CONNECTOR_END__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.CONNECTOR_END__ELEMENT:
				return basicSetElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.CONNECTOR_END__AGGREGATION:
				return getAggregation();
			case XcorePackage.CONNECTOR_END__ALIAS:
				return getAlias();
			case XcorePackage.CONNECTOR_END__ALLOW_DUPLICATES:
				return getAllowDuplicates();
			case XcorePackage.CONNECTOR_END__CARDINALITY:
				return getCardinality();
			case XcorePackage.CONNECTOR_END__CONSTRAINT:
				return getConstraint();
			case XcorePackage.CONNECTOR_END__CONTAINMENT:
				return getContainment();
			case XcorePackage.CONNECTOR_END__DERIVED:
				return getDerived();
			case XcorePackage.CONNECTOR_END__DERIVED_UNION:
				return getDerivedUnion();
			case XcorePackage.CONNECTOR_END__END:
				return getEnd();
			case XcorePackage.CONNECTOR_END__ELEMENT:
				return getElement();
			case XcorePackage.CONNECTOR_END__IS_CHANGEABLE:
				return getIsChangeable();
			case XcorePackage.CONNECTOR_END__IS_NAVIGABLE:
				return getIsNavigable();
			case XcorePackage.CONNECTOR_END__NAVIGABLE:
				return getNavigable();
			case XcorePackage.CONNECTOR_END__ORDERING:
				return getOrdering();
			case XcorePackage.CONNECTOR_END__OWNED_BY_CLASSIFIER:
				return getOwnedByClassifier();
			case XcorePackage.CONNECTOR_END__QUALIFIER:
				return getQualifier();
			case XcorePackage.CONNECTOR_END__ROLE:
				return getRole();
			case XcorePackage.CONNECTOR_END__ROLE_NOTE:
				return getRoleNote();
			case XcorePackage.CONNECTOR_END__ROLE_TYPE:
				return getRoleType();
			case XcorePackage.CONNECTOR_END__STEREOTYPE:
				return getStereotype();
			case XcorePackage.CONNECTOR_END__VISIBILITY:
				return getVisibility();
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
			case XcorePackage.CONNECTOR_END__AGGREGATION:
				setAggregation((Long)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ALIAS:
				setAlias((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ALLOW_DUPLICATES:
				setAllowDuplicates((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR_END__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__CONTAINMENT:
				setContainment((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR_END__DERIVED_UNION:
				setDerivedUnion((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR_END__END:
				setEnd((EndType)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ELEMENT:
				setElement((Element)newValue);
				return;
			case XcorePackage.CONNECTOR_END__IS_CHANGEABLE:
				setIsChangeable((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__IS_NAVIGABLE:
				setIsNavigable((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR_END__NAVIGABLE:
				setNavigable((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ORDERING:
				setOrdering((Long)newValue);
				return;
			case XcorePackage.CONNECTOR_END__OWNED_BY_CLASSIFIER:
				setOwnedByClassifier((Boolean)newValue);
				return;
			case XcorePackage.CONNECTOR_END__QUALIFIER:
				setQualifier((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ROLE:
				setRole((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ROLE_NOTE:
				setRoleNote((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__ROLE_TYPE:
				setRoleType((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XcorePackage.CONNECTOR_END__VISIBILITY:
				setVisibility((String)newValue);
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
			case XcorePackage.CONNECTOR_END__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ALLOW_DUPLICATES:
				setAllowDuplicates(ALLOW_DUPLICATES_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__DERIVED_UNION:
				setDerivedUnion(DERIVED_UNION_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__END:
				setEnd(END_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ELEMENT:
				setElement((Element)null);
				return;
			case XcorePackage.CONNECTOR_END__IS_CHANGEABLE:
				setIsChangeable(IS_CHANGEABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__NAVIGABLE:
				setNavigable(NAVIGABLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__OWNED_BY_CLASSIFIER:
				setOwnedByClassifier(OWNED_BY_CLASSIFIER_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ROLE_NOTE:
				setRoleNote(ROLE_NOTE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__ROLE_TYPE:
				setRoleType(ROLE_TYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.CONNECTOR_END__VISIBILITY:
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
			case XcorePackage.CONNECTOR_END__AGGREGATION:
				return AGGREGATION_EDEFAULT == null ? aggregation != null : !AGGREGATION_EDEFAULT.equals(aggregation);
			case XcorePackage.CONNECTOR_END__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case XcorePackage.CONNECTOR_END__ALLOW_DUPLICATES:
				return ALLOW_DUPLICATES_EDEFAULT == null ? allowDuplicates != null : !ALLOW_DUPLICATES_EDEFAULT.equals(allowDuplicates);
			case XcorePackage.CONNECTOR_END__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case XcorePackage.CONNECTOR_END__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case XcorePackage.CONNECTOR_END__CONTAINMENT:
				return CONTAINMENT_EDEFAULT == null ? containment != null : !CONTAINMENT_EDEFAULT.equals(containment);
			case XcorePackage.CONNECTOR_END__DERIVED:
				return DERIVED_EDEFAULT == null ? derived != null : !DERIVED_EDEFAULT.equals(derived);
			case XcorePackage.CONNECTOR_END__DERIVED_UNION:
				return DERIVED_UNION_EDEFAULT == null ? derivedUnion != null : !DERIVED_UNION_EDEFAULT.equals(derivedUnion);
			case XcorePackage.CONNECTOR_END__END:
				return end != END_EDEFAULT;
			case XcorePackage.CONNECTOR_END__ELEMENT:
				return element != null;
			case XcorePackage.CONNECTOR_END__IS_CHANGEABLE:
				return IS_CHANGEABLE_EDEFAULT == null ? isChangeable != null : !IS_CHANGEABLE_EDEFAULT.equals(isChangeable);
			case XcorePackage.CONNECTOR_END__IS_NAVIGABLE:
				return IS_NAVIGABLE_EDEFAULT == null ? isNavigable != null : !IS_NAVIGABLE_EDEFAULT.equals(isNavigable);
			case XcorePackage.CONNECTOR_END__NAVIGABLE:
				return NAVIGABLE_EDEFAULT == null ? navigable != null : !NAVIGABLE_EDEFAULT.equals(navigable);
			case XcorePackage.CONNECTOR_END__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
			case XcorePackage.CONNECTOR_END__OWNED_BY_CLASSIFIER:
				return OWNED_BY_CLASSIFIER_EDEFAULT == null ? ownedByClassifier != null : !OWNED_BY_CLASSIFIER_EDEFAULT.equals(ownedByClassifier);
			case XcorePackage.CONNECTOR_END__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
			case XcorePackage.CONNECTOR_END__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case XcorePackage.CONNECTOR_END__ROLE_NOTE:
				return ROLE_NOTE_EDEFAULT == null ? roleNote != null : !ROLE_NOTE_EDEFAULT.equals(roleNote);
			case XcorePackage.CONNECTOR_END__ROLE_TYPE:
				return ROLE_TYPE_EDEFAULT == null ? roleType != null : !ROLE_TYPE_EDEFAULT.equals(roleType);
			case XcorePackage.CONNECTOR_END__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.CONNECTOR_END__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
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
		result.append(" (Aggregation: ");
		result.append(aggregation);
		result.append(", Alias: ");
		result.append(alias);
		result.append(", AllowDuplicates: ");
		result.append(allowDuplicates);
		result.append(", Cardinality: ");
		result.append(cardinality);
		result.append(", Constraint: ");
		result.append(constraint);
		result.append(", Containment: ");
		result.append(containment);
		result.append(", Derived: ");
		result.append(derived);
		result.append(", DerivedUnion: ");
		result.append(derivedUnion);
		result.append(", End: ");
		result.append(end);
		result.append(", IsChangeable: ");
		result.append(isChangeable);
		result.append(", IsNavigable: ");
		result.append(isNavigable);
		result.append(", Navigable: ");
		result.append(navigable);
		result.append(", Ordering: ");
		result.append(ordering);
		result.append(", OwnedByClassifier: ");
		result.append(ownedByClassifier);
		result.append(", Qualifier: ");
		result.append(qualifier);
		result.append(", Role: ");
		result.append(role);
		result.append(", RoleNote: ");
		result.append(roleNote);
		result.append(", RoleType: ");
		result.append(roleType);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", Visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //ConnectorEndImpl
