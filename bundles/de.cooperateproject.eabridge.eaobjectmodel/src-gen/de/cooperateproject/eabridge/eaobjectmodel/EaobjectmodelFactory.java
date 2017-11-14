/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage
 * @generated
 */
public interface EaobjectmodelFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	EaobjectmodelFactory eINSTANCE = de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Type Reference</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Reference</em>'.
     * @generated
     */
	TypeReference createTypeReference();

	/**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
	Attribute createAttribute();

	/**
     * Returns a new object of class '<em>Attribute Constraint</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Constraint</em>'.
     * @generated
     */
	AttributeConstraint createAttributeConstraint();

	/**
     * Returns a new object of class '<em>Attribute Tag</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Tag</em>'.
     * @generated
     */
	AttributeTag createAttributeTag();

	/**
     * Returns a new object of class '<em>Connector</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector</em>'.
     * @generated
     */
	Connector createConnector();

	/**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
	Diagram createDiagram();

	/**
     * Returns a new object of class '<em>Diagram Link</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Link</em>'.
     * @generated
     */
	DiagramLink createDiagramLink();

	/**
     * Returns a new object of class '<em>Diagram Object</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object</em>'.
     * @generated
     */
	DiagramObject createDiagramObject();

	/**
     * Returns a new object of class '<em>Element</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
	Element createElement();

	/**
     * Returns a new object of class '<em>Method</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Method</em>'.
     * @generated
     */
	Method createMethod();

	/**
     * Returns a new object of class '<em>Methodparameter</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Methodparameter</em>'.
     * @generated
     */
	Methodparameter createMethodparameter();

	/**
     * Returns a new object of class '<em>Package</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Package</em>'.
     * @generated
     */
	Package createPackage();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	EaobjectmodelPackage getEaobjectmodelPackage();

} //EaobjectmodelFactory
