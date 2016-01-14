/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getConnectorType()
 * @model
 * @generated
 */
public enum ConnectorType implements Enumerator {
	/**
	 * The '<em><b>Connector Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR_TYPE(0, "Connector_Type", "Connector_Type"),

	/**
	 * The '<em><b>Abstraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACTION(0, "Abstraction", "Abstraction"),

	/**
	 * The '<em><b>Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(0, "Aggregation", "Aggregation"),

	/**
	 * The '<em><b>Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY_VALUE
	 * @generated
	 * @ordered
	 */
	ASSEMBLY(0, "Assembly", "Assembly"),

	/**
	 * The '<em><b>Association</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION(0, "Association", "Association"),

	/**
	 * The '<em><b>Collaboration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATION(0, "Collaboration", "Collaboration"),

	/**
	 * The '<em><b>Communication Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_PATH(0, "CommunicationPath", "CommunicationPath"),

	/**
	 * The '<em><b>Connector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR(0, "Connector", "Connector"),

	/**
	 * The '<em><b>Control Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_FLOW(0, "ControlFlow", "ControlFlow"),

	/**
	 * The '<em><b>Delegate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATE_VALUE
	 * @generated
	 * @ordered
	 */
	DELEGATE(0, "Delegate", "Delegate"),

	/**
	 * The '<em><b>Dependency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCY(0, "Dependency", "Dependency"),

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(0, "Deployment", "Deployment"),

	/**
	 * The '<em><b>ER Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	ER_LINK(0, "ERLink", "ERLink"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(0, "Extension", "Extension"),

	/**
	 * The '<em><b>Generalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	GENERALIZATION(0, "Generalization", "Generalization"),

	/**
	 * The '<em><b>Information Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_FLOW(0, "InformationFlow", "InformationFlow"),

	/**
	 * The '<em><b>Instantiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANTIATION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANTIATION(0, "Instantiation", "Instantiation"),

	/**
	 * The '<em><b>Interrupt Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPT_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	INTERRUPT_FLOW(0, "InterruptFlow", "InterruptFlow"),

	/**
	 * The '<em><b>Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	MANIFEST(0, "Manifest", "Manifest"),

	/**
	 * The '<em><b>Nesting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NESTING_VALUE
	 * @generated
	 * @ordered
	 */
	NESTING(0, "Nesting", "Nesting"),

	/**
	 * The '<em><b>Note Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE_LINK(0, "NoteLink", "NoteLink"),

	/**
	 * The '<em><b>Object Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_FLOW(0, "ObjectFlow", "ObjectFlow"),

	/**
	 * The '<em><b>Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE(0, "Package", "Package"),

	/**
	 * The '<em><b>Protocol Conformance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_CONFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_CONFORMANCE(0, "ProtocolConformance", "ProtocolConformance"),

	/**
	 * The '<em><b>Protocol Transition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_TRANSITION(0, "ProtocolTransition", "ProtocolTransition"),

	/**
	 * The '<em><b>Realisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALISATION_VALUE
	 * @generated
	 * @ordered
	 */
	REALISATION(0, "Realisation", "Realisation"),

	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(0, "Sequence", "Sequence"),

	/**
	 * The '<em><b>State Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_FLOW(0, "StateFlow", "StateFlow"),

	/**
	 * The '<em><b>Substitution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTION(0, "Substitution", "Substitution"),

	/**
	 * The '<em><b>Usage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE(0, "Usage", "Usage"),

	/**
	 * The '<em><b>Use Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	USE_CASE(0, "UseCase", "UseCase");

	/**
	 * The '<em><b>Connector Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connector Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_TYPE
	 * @model name="Connector_Type"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Abstraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstraction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACTION
	 * @model name="Abstraction"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACTION_VALUE = 0;

	/**
	 * The '<em><b>Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @model name="Aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 0;

	/**
	 * The '<em><b>Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assembly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY
	 * @model name="Assembly"
	 * @generated
	 * @ordered
	 */
	public static final int ASSEMBLY_VALUE = 0;

	/**
	 * The '<em><b>Association</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Association</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION
	 * @model name="Association"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_VALUE = 0;

	/**
	 * The '<em><b>Collaboration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collaboration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION
	 * @model name="Collaboration"
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATION_VALUE = 0;

	/**
	 * The '<em><b>Communication Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Communication Path</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_PATH
	 * @model name="CommunicationPath"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_PATH_VALUE = 0;

	/**
	 * The '<em><b>Connector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR
	 * @model name="Connector"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_VALUE = 0;

	/**
	 * The '<em><b>Control Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Control Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROL_FLOW
	 * @model name="ControlFlow"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_FLOW_VALUE = 0;

	/**
	 * The '<em><b>Delegate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delegate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATE
	 * @model name="Delegate"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATE_VALUE = 0;

	/**
	 * The '<em><b>Dependency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY
	 * @model name="Dependency"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_VALUE = 0;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deployment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @model name="Deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 0;

	/**
	 * The '<em><b>ER Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ER Link</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ER_LINK
	 * @model name="ERLink"
	 * @generated
	 * @ordered
	 */
	public static final int ER_LINK_VALUE = 0;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="Extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 0;

	/**
	 * The '<em><b>Generalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generalization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERALIZATION
	 * @model name="Generalization"
	 * @generated
	 * @ordered
	 */
	public static final int GENERALIZATION_VALUE = 0;

	/**
	 * The '<em><b>Information Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Information Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_FLOW
	 * @model name="InformationFlow"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_FLOW_VALUE = 0;

	/**
	 * The '<em><b>Instantiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instantiation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANTIATION
	 * @model name="Instantiation"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANTIATION_VALUE = 0;

	/**
	 * The '<em><b>Interrupt Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interrupt Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERRUPT_FLOW
	 * @model name="InterruptFlow"
	 * @generated
	 * @ordered
	 */
	public static final int INTERRUPT_FLOW_VALUE = 0;

	/**
	 * The '<em><b>Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manifest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANIFEST
	 * @model name="Manifest"
	 * @generated
	 * @ordered
	 */
	public static final int MANIFEST_VALUE = 0;

	/**
	 * The '<em><b>Nesting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nesting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NESTING
	 * @model name="Nesting"
	 * @generated
	 * @ordered
	 */
	public static final int NESTING_VALUE = 0;

	/**
	 * The '<em><b>Note Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Note Link</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTE_LINK
	 * @model name="NoteLink"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_LINK_VALUE = 0;

	/**
	 * The '<em><b>Object Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_FLOW
	 * @model name="ObjectFlow"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_FLOW_VALUE = 0;

	/**
	 * The '<em><b>Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Package</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @model name="Package"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_VALUE = 0;

	/**
	 * The '<em><b>Protocol Conformance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protocol Conformance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_CONFORMANCE
	 * @model name="ProtocolConformance"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_CONFORMANCE_VALUE = 0;

	/**
	 * The '<em><b>Protocol Transition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protocol Transition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_TRANSITION
	 * @model name="ProtocolTransition"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_TRANSITION_VALUE = 0;

	/**
	 * The '<em><b>Realisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realisation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALISATION
	 * @model name="Realisation"
	 * @generated
	 * @ordered
	 */
	public static final int REALISATION_VALUE = 0;

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model name="Sequence"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>State Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>State Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATE_FLOW
	 * @model name="StateFlow"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FLOW_VALUE = 0;

	/**
	 * The '<em><b>Substitution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substitution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTION
	 * @model name="Substitution"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTION_VALUE = 0;

	/**
	 * The '<em><b>Usage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USAGE
	 * @model name="Usage"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_VALUE = 0;

	/**
	 * The '<em><b>Use Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Use Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USE_CASE
	 * @model name="UseCase"
	 * @generated
	 * @ordered
	 */
	public static final int USE_CASE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectorType[] VALUES_ARRAY =
		new ConnectorType[] {
			CONNECTOR_TYPE,
			ABSTRACTION,
			AGGREGATION,
			ASSEMBLY,
			ASSOCIATION,
			COLLABORATION,
			COMMUNICATION_PATH,
			CONNECTOR,
			CONTROL_FLOW,
			DELEGATE,
			DEPENDENCY,
			DEPLOYMENT,
			ER_LINK,
			EXTENSION,
			GENERALIZATION,
			INFORMATION_FLOW,
			INSTANTIATION,
			INTERRUPT_FLOW,
			MANIFEST,
			NESTING,
			NOTE_LINK,
			OBJECT_FLOW,
			PACKAGE,
			PROTOCOL_CONFORMANCE,
			PROTOCOL_TRANSITION,
			REALISATION,
			SEQUENCE,
			STATE_FLOW,
			SUBSTITUTION,
			USAGE,
			USE_CASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType get(int value) {
		switch (value) {
			case CONNECTOR_TYPE_VALUE: return CONNECTOR_TYPE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConnectorType
