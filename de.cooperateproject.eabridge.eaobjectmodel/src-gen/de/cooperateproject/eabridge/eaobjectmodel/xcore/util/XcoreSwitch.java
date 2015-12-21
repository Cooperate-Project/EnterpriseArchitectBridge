/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.util;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Author;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Client;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.File;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Method;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Test;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage
 * @generated
 */
public class XcoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XcorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = XcorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XcorePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.ATTRIBUTE_CONSTRAINT: {
				AttributeConstraint attributeConstraint = (AttributeConstraint)theEObject;
				T result = caseAttributeConstraint(attributeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.ATTRIBUTE_TAG: {
				AttributeTag attributeTag = (AttributeTag)theEObject;
				T result = caseAttributeTag(attributeTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.CONNECTOR_CONSTRAINT: {
				ConnectorConstraint connectorConstraint = (ConnectorConstraint)theEObject;
				T result = caseConnectorConstraint(connectorConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.CONNECTOR_END: {
				ConnectorEnd connectorEnd = (ConnectorEnd)theEObject;
				T result = caseConnectorEnd(connectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.CONNECTOR_TAG: {
				ConnectorTag connectorTag = (ConnectorTag)theEObject;
				T result = caseConnectorTag(connectorTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.DIAGRAM_LINK: {
				DiagramLink diagramLink = (DiagramLink)theEObject;
				T result = caseDiagramLink(diagramLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.DIAGRAMM_OBJECT: {
				DiagrammObject diagrammObject = (DiagrammObject)theEObject;
				T result = caseDiagrammObject(diagrammObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.METHOD_CONSTRAINT: {
				MethodConstraint methodConstraint = (MethodConstraint)theEObject;
				T result = caseMethodConstraint(methodConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.METHOD_TAG: {
				MethodTag methodTag = (MethodTag)theEObject;
				T result = caseMethodTag(methodTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.PACKAGE: {
				de.cooperateproject.eabridge.eaobjectmodel.xcore.Package package_ = (de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.PARAM_TAG: {
				ParamTag paramTag = (ParamTag)theEObject;
				T result = caseParamTag(paramTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.TAGGED_VALUE: {
				TaggedValue taggedValue = (TaggedValue)theEObject;
				T result = caseTaggedValue(taggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.EFFORT: {
				Effort effort = (Effort)theEObject;
				T result = caseEffort(effort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.ISSUE: {
				Issue issue = (Issue)theEObject;
				T result = caseIssue(issue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.RISK: {
				Risk risk = (Risk)theEObject;
				T result = caseRisk(risk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.TEMPLATE_PARAMETER: {
				TemplateParameter templateParameter = (TemplateParameter)theEObject;
				T result = caseTemplateParameter(templateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XcorePackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConstraint(AttributeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTag(AttributeTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorConstraint(ConnectorConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorTag(ConnectorTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramLink(DiagramLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagramm Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagramm Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagrammObject(DiagrammObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodConstraint(MethodConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodTag(MethodTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamTag(ParamTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedValue(TaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffort(Effort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisk(Risk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XcoreSwitch
