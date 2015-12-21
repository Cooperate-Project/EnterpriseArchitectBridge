/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getContainment <em>Containment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerived <em>Derived</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerivedUnion <em>Derived Union</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getEnd <em>End</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getElement <em>Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsChangeable <em>Is Changeable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getNavigable <em>Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOwnedByClassifier <em>Owned By Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleNote <em>Role Note</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Aggregation()
	 * @model unique="false"
	 * @generated
	 */
	Long getAggregation();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Long value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #setAllowDuplicates(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_AllowDuplicates()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAllowDuplicates();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAllowDuplicates <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #getAllowDuplicates()
	 * @generated
	 */
	void setAllowDuplicates(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Cardinality()
	 * @model unique="false"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Constraint()
	 * @model unique="false"
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Containment()
	 * @model unique="false"
	 * @generated
	 */
	String getContainment();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(String value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Derived()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getDerived();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #getDerived()
	 * @generated
	 */
	void setDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Union</em>' attribute.
	 * @see #setDerivedUnion(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_DerivedUnion()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getDerivedUnion();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerivedUnion <em>Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Union</em>' attribute.
	 * @see #getDerivedUnion()
	 * @generated
	 */
	void setDerivedUnion(Boolean value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType
	 * @see #setEnd(EndType)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_End()
	 * @model unique="false"
	 * @generated
	 */
	EndType getEnd();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(EndType value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Element()
	 * @model containment="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Is Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Changeable</em>' attribute.
	 * @see #setIsChangeable(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_IsChangeable()
	 * @model unique="false"
	 * @generated
	 */
	String getIsChangeable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsChangeable <em>Is Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Changeable</em>' attribute.
	 * @see #getIsChangeable()
	 * @generated
	 */
	void setIsChangeable(String value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #setIsNavigable(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_IsNavigable()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsNavigable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigable</em>' attribute.
	 * @see #getIsNavigable()
	 * @generated
	 */
	void setIsNavigable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Navigable()
	 * @model unique="false"
	 * @generated
	 */
	String getNavigable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #getNavigable()
	 * @generated
	 */
	void setNavigable(String value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Ordering()
	 * @model unique="false"
	 * @generated
	 */
	Long getOrdering();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(Long value);

	/**
	 * Returns the value of the '<em><b>Owned By Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Classifier</em>' attribute.
	 * @see #setOwnedByClassifier(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_OwnedByClassifier()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getOwnedByClassifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOwnedByClassifier <em>Owned By Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Classifier</em>' attribute.
	 * @see #getOwnedByClassifier()
	 * @generated
	 */
	void setOwnedByClassifier(Boolean value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Qualifier()
	 * @model unique="false"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Note</em>' attribute.
	 * @see #setRoleNote(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_RoleNote()
	 * @model unique="false"
	 * @generated
	 */
	String getRoleNote();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleNote <em>Role Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Note</em>' attribute.
	 * @see #getRoleNote()
	 * @generated
	 */
	void setRoleNote(String value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' attribute.
	 * @see #setRoleType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_RoleType()
	 * @model unique="false"
	 * @generated
	 */
	String getRoleType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleType <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' attribute.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorEnd_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

} // ConnectorEnd
