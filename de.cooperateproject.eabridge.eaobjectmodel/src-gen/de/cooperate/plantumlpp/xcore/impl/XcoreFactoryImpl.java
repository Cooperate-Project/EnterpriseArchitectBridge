/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Attribute;
import de.cooperate.plantumlpp.xcore.AttributeConstraint;
import de.cooperate.plantumlpp.xcore.AttributeTag;
import de.cooperate.plantumlpp.xcore.Author;
import de.cooperate.plantumlpp.xcore.Client;
import de.cooperate.plantumlpp.xcore.Connector;
import de.cooperate.plantumlpp.xcore.ConnectorConstraint;
import de.cooperate.plantumlpp.xcore.ConnectorEnd;
import de.cooperate.plantumlpp.xcore.ConnectorTag;
import de.cooperate.plantumlpp.xcore.Constraint;
import de.cooperate.plantumlpp.xcore.ContainmentType;
import de.cooperate.plantumlpp.xcore.Diagram;
import de.cooperate.plantumlpp.xcore.DiagramLink;
import de.cooperate.plantumlpp.xcore.DiagrammObject;
import de.cooperate.plantumlpp.xcore.DirectionType;
import de.cooperate.plantumlpp.xcore.Effort;
import de.cooperate.plantumlpp.xcore.Element;
import de.cooperate.plantumlpp.xcore.EndType;
import de.cooperate.plantumlpp.xcore.File;
import de.cooperate.plantumlpp.xcore.Issue;
import de.cooperate.plantumlpp.xcore.Method;
import de.cooperate.plantumlpp.xcore.MethodConstraint;
import de.cooperate.plantumlpp.xcore.MethodTag;
import de.cooperate.plantumlpp.xcore.Metric;
import de.cooperate.plantumlpp.xcore.ParamTag;
import de.cooperate.plantumlpp.xcore.Parameter;
import de.cooperate.plantumlpp.xcore.Requirement;
import de.cooperate.plantumlpp.xcore.Resource;
import de.cooperate.plantumlpp.xcore.Risk;
import de.cooperate.plantumlpp.xcore.Scenario;
import de.cooperate.plantumlpp.xcore.TaggedValue;
import de.cooperate.plantumlpp.xcore.TemplateParameter;
import de.cooperate.plantumlpp.xcore.Test;
import de.cooperate.plantumlpp.xcore.VisibilityType;
import de.cooperate.plantumlpp.xcore.XcoreFactory;
import de.cooperate.plantumlpp.xcore.XcorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcoreFactoryImpl extends EFactoryImpl implements XcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XcoreFactory init() {
		try {
			XcoreFactory theXcoreFactory = (XcoreFactory)EPackage.Registry.INSTANCE.getEFactory(XcorePackage.eNS_URI);
			if (theXcoreFactory != null) {
				return theXcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XcorePackage.ATTRIBUTE: return createAttribute();
			case XcorePackage.ATTRIBUTE_CONSTRAINT: return createAttributeConstraint();
			case XcorePackage.ATTRIBUTE_TAG: return createAttributeTag();
			case XcorePackage.CONNECTOR: return createConnector();
			case XcorePackage.CONNECTOR_CONSTRAINT: return createConnectorConstraint();
			case XcorePackage.CONNECTOR_END: return createConnectorEnd();
			case XcorePackage.CONNECTOR_TAG: return createConnectorTag();
			case XcorePackage.DIAGRAM: return createDiagram();
			case XcorePackage.DIAGRAM_LINK: return createDiagramLink();
			case XcorePackage.DIAGRAMM_OBJECT: return createDiagrammObject();
			case XcorePackage.ELEMENT: return createElement();
			case XcorePackage.METHOD: return createMethod();
			case XcorePackage.METHOD_CONSTRAINT: return createMethodConstraint();
			case XcorePackage.METHOD_TAG: return createMethodTag();
			case XcorePackage.PACKAGE: return createPackage();
			case XcorePackage.PARAMETER: return createParameter();
			case XcorePackage.PARAM_TAG: return createParamTag();
			case XcorePackage.TAGGED_VALUE: return createTaggedValue();
			case XcorePackage.CONSTRAINT: return createConstraint();
			case XcorePackage.EFFORT: return createEffort();
			case XcorePackage.FILE: return createFile();
			case XcorePackage.ISSUE: return createIssue();
			case XcorePackage.METRIC: return createMetric();
			case XcorePackage.REQUIREMENT: return createRequirement();
			case XcorePackage.RESOURCE: return createResource();
			case XcorePackage.RISK: return createRisk();
			case XcorePackage.SCENARIO: return createScenario();
			case XcorePackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case XcorePackage.TEST: return createTest();
			case XcorePackage.AUTHOR: return createAuthor();
			case XcorePackage.CLIENT: return createClient();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XcorePackage.CONTAINMENT_TYPE:
				return createContainmentTypeFromString(eDataType, initialValue);
			case XcorePackage.VISIBILITY_TYPE:
				return createVisibilityTypeFromString(eDataType, initialValue);
			case XcorePackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case XcorePackage.END_TYPE:
				return createEndTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XcorePackage.CONTAINMENT_TYPE:
				return convertContainmentTypeToString(eDataType, instanceValue);
			case XcorePackage.VISIBILITY_TYPE:
				return convertVisibilityTypeToString(eDataType, instanceValue);
			case XcorePackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case XcorePackage.END_TYPE:
				return convertEndTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraint createAttributeConstraint() {
		AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
		return attributeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTag createAttributeTag() {
		AttributeTagImpl attributeTag = new AttributeTagImpl();
		return attributeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorConstraint createConnectorConstraint() {
		ConnectorConstraintImpl connectorConstraint = new ConnectorConstraintImpl();
		return connectorConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd() {
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorTag createConnectorTag() {
		ConnectorTagImpl connectorTag = new ConnectorTagImpl();
		return connectorTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLink createDiagramLink() {
		DiagramLinkImpl diagramLink = new DiagramLinkImpl();
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagrammObject createDiagrammObject() {
		DiagrammObjectImpl diagrammObject = new DiagrammObjectImpl();
		return diagrammObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodConstraint createMethodConstraint() {
		MethodConstraintImpl methodConstraint = new MethodConstraintImpl();
		return methodConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTag createMethodTag() {
		MethodTagImpl methodTag = new MethodTagImpl();
		return methodTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperate.plantumlpp.xcore.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamTag createParamTag() {
		ParamTagImpl paramTag = new ParamTagImpl();
		return paramTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValue createTaggedValue() {
		TaggedValueImpl taggedValue = new TaggedValueImpl();
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effort createEffort() {
		EffortImpl effort = new EffortImpl();
		return effort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk createRisk() {
		RiskImpl risk = new RiskImpl();
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentType createContainmentTypeFromString(EDataType eDataType, String initialValue) {
		ContainmentType result = ContainmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		VisibilityType result = VisibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndType createEndTypeFromString(EDataType eDataType, String initialValue) {
		EndType result = EndType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcorePackage getXcorePackage() {
		return (XcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XcorePackage getPackage() {
		return XcorePackage.eINSTANCE;
	}

} //XcoreFactoryImpl
