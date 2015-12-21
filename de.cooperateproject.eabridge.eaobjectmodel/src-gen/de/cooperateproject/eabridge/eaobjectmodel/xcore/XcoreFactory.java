/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage
 * @generated
 */
public interface XcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcoreFactory eINSTANCE = de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcoreFactoryImpl.init();

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
	 * Returns a new object of class '<em>Connector Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Constraint</em>'.
	 * @generated
	 */
	ConnectorConstraint createConnectorConstraint();

	/**
	 * Returns a new object of class '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector End</em>'.
	 * @generated
	 */
	ConnectorEnd createConnectorEnd();

	/**
	 * Returns a new object of class '<em>Connector Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Tag</em>'.
	 * @generated
	 */
	ConnectorTag createConnectorTag();

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
	 * Returns a new object of class '<em>Diagramm Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagramm Object</em>'.
	 * @generated
	 */
	DiagrammObject createDiagrammObject();

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
	 * Returns a new object of class '<em>Method Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Constraint</em>'.
	 * @generated
	 */
	MethodConstraint createMethodConstraint();

	/**
	 * Returns a new object of class '<em>Method Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Tag</em>'.
	 * @generated
	 */
	MethodTag createMethodTag();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Param Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Tag</em>'.
	 * @generated
	 */
	ParamTag createParamTag();

	/**
	 * Returns a new object of class '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagged Value</em>'.
	 * @generated
	 */
	TaggedValue createTaggedValue();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Effort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effort</em>'.
	 * @generated
	 */
	Effort createEffort();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue</em>'.
	 * @generated
	 */
	Issue createIssue();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk</em>'.
	 * @generated
	 */
	Risk createRisk();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Parameter</em>'.
	 * @generated
	 */
	TemplateParameter createTemplateParameter();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XcorePackage getXcorePackage();

} //XcoreFactory
