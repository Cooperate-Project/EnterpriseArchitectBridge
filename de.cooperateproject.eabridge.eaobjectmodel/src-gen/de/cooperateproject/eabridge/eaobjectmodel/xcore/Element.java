/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getActionFlags <em>Action Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAssociationClassConnectorID <em>Association Class Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getBaseClasses <em>Base Classes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierType <em>Classifier Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCompositeDiagram <em>Composite Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCreated <em>Created</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementGUID <em>Element GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEmbeddedElements <em>Embedded Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getFiles <em>Files</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenFile <em>Gen File</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenType <em>Gen Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsNew <em>Is New</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getLocked <em>Locked</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMiscData <em>Misc Data</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getModified <em>Modified</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyTypeName <em>Property Type Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getResources <em>Resources</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRisks <em>Risks</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRunState <em>Run State</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTablespace <em>Tablespace</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTag <em>Tag</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTemplateParameters <em>Template Parameters</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTests <em>Tests</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTreePos <em>Tree Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Action Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Flags</em>' attribute.
	 * @see #setActionFlags(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_ActionFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getActionFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getActionFlags <em>Action Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Flags</em>' attribute.
	 * @see #getActionFlags()
	 * @generated
	 */
	void setActionFlags(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Association Class Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Class Connector ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Class Connector ID</em>' attribute.
	 * @see #setAssociationClassConnectorID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_AssociationClassConnectorID()
	 * @model unique="false"
	 * @generated
	 */
	Long getAssociationClassConnectorID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAssociationClassConnectorID <em>Association Class Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Class Connector ID</em>' attribute.
	 * @see #getAssociationClassConnectorID()
	 * @generated
	 */
	void setAssociationClassConnectorID(Long value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Attributes()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getParent
	 * @model opposite="Parent" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Base Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classes</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_BaseClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getBaseClasses();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference.
	 * @see #setClassifier(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	Element getClassifier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifier <em>Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' containment reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Element value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_ClassifierName()
	 * @model unique="false"
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Type</em>' attribute.
	 * @see #setClassifierType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_ClassifierType()
	 * @model unique="false"
	 * @generated
	 */
	String getClassifierType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierType <em>Classifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Type</em>' attribute.
	 * @see #getClassifierType()
	 * @generated
	 */
	void setClassifierType(String value);

	/**
	 * Returns the value of the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complexity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complexity</em>' attribute.
	 * @see #setComplexity(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Complexity()
	 * @model unique="false"
	 * @generated
	 */
	String getComplexity();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getComplexity <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complexity</em>' attribute.
	 * @see #getComplexity()
	 * @generated
	 */
	void setComplexity(String value);

	/**
	 * Returns the value of the '<em><b>Composite Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Diagram</em>' containment reference.
	 * @see #setCompositeDiagram(Diagram)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_CompositeDiagram()
	 * @model containment="true"
	 * @generated
	 */
	Diagram getCompositeDiagram();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCompositeDiagram <em>Composite Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Diagram</em>' containment reference.
	 * @see #getCompositeDiagram()
	 * @generated
	 */
	void setCompositeDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Created()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Difficulty()
	 * @model unique="false"
	 * @generated
	 */
	String getDifficulty();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(String value);

	/**
	 * Returns the value of the '<em><b>Efforts</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efforts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efforts</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Efforts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effort> getEfforts();

	/**
	 * Returns the value of the '<em><b>Element GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element GUID</em>' attribute.
	 * @see #setElementGUID(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_ElementGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getElementGUID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementGUID <em>Element GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element GUID</em>' attribute.
	 * @see #getElementGUID()
	 * @generated
	 */
	void setElementGUID(String value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_ElementID()
	 * @model unique="false"
	 * @generated
	 */
	Long getElementID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(Long value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Embedded Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Elements</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_EmbeddedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getEmbeddedElements();

	/**
	 * Returns the value of the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Flags</em>' attribute.
	 * @see #setEventFlags(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_EventFlags()
	 * @model unique="false"
	 * @generated
	 */
	String getEventFlags();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEventFlags <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Flags</em>' attribute.
	 * @see #getEventFlags()
	 * @generated
	 */
	void setEventFlags(String value);

	/**
	 * Returns the value of the '<em><b>Extension Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Points</em>' attribute.
	 * @see #setExtensionPoints(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_ExtensionPoints()
	 * @model unique="false"
	 * @generated
	 */
	String getExtensionPoints();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getExtensionPoints <em>Extension Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Points</em>' attribute.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	void setExtensionPoints(String value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Gen File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen File</em>' attribute.
	 * @see #setGenFile(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_GenFile()
	 * @model unique="false"
	 * @generated
	 */
	String getGenFile();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenFile <em>Gen File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen File</em>' attribute.
	 * @see #getGenFile()
	 * @generated
	 */
	void setGenFile(String value);

	/**
	 * Returns the value of the '<em><b>Genlinks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genlinks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genlinks</em>' attribute.
	 * @see #setGenlinks(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Genlinks()
	 * @model unique="false"
	 * @generated
	 */
	String getGenlinks();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenlinks <em>Genlinks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genlinks</em>' attribute.
	 * @see #getGenlinks()
	 * @generated
	 */
	void setGenlinks(String value);

	/**
	 * Returns the value of the '<em><b>Gen Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Type</em>' attribute.
	 * @see #setGenType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_GenType()
	 * @model unique="false"
	 * @generated
	 */
	String getGenType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenType <em>Gen Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Type</em>' attribute.
	 * @see #getGenType()
	 * @generated
	 */
	void setGenType(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_IsActive()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_IsComposite()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_IsLeaf()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is New</em>' attribute.
	 * @see #setIsNew(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_IsNew()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsNew();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsNew <em>Is New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is New</em>' attribute.
	 * @see #getIsNew()
	 * @generated
	 */
	void setIsNew(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Spec</em>' attribute.
	 * @see #setIsSpec(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_IsSpec()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsSpec();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsSpec <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Spec</em>' attribute.
	 * @see #getIsSpec()
	 * @generated
	 */
	void setIsSpec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Locked()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getLocked();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #getLocked()
	 * @generated
	 */
	void setLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_MetaType()
	 * @model unique="false"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Methods()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParent
	 * @model opposite="Parent" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Data</em>' attribute.
	 * @see #setMiscData(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_MiscData()
	 * @model unique="false"
	 * @generated
	 */
	String getMiscData();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMiscData <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Misc Data</em>' attribute.
	 * @see #getMiscData()
	 * @generated
	 */
	void setMiscData(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Modified()
	 * @model unique="false"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Multiplicity()
	 * @model unique="false"
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Package()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElements
	 * @model opposite="Elements" transient="false"
	 * @generated
	 */
	de.cooperateproject.eabridge.eaobjectmodel.xcore.Package getPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Parent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\nreturn ((<%de.cooperateproject.eabridge.eaobjectmodel.xcore.Element%>) _eContainer);'"
	 * @generated
	 */
	Element getParent();

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' attribute.
	 * @see #setPersistence(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Persistence()
	 * @model unique="false"
	 * @generated
	 */
	String getPersistence();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPersistence <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' attribute.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(String value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Phase()
	 * @model unique="false"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Priority()
	 * @model unique="false"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' attribute.
	 * @see #setPropertyType(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_PropertyType()
	 * @model unique="false"
	 * @generated
	 */
	Long getPropertyType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyType <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type</em>' attribute.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(Long value);

	/**
	 * Returns the value of the '<em><b>Property Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type Name</em>' attribute.
	 * @see #setPropertyTypeName(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_PropertyTypeName()
	 * @model unique="false"
	 * @generated
	 */
	String getPropertyTypeName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyTypeName <em>Property Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type Name</em>' attribute.
	 * @see #getPropertyTypeName()
	 * @generated
	 */
	void setPropertyTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Risks</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risks</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Risks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Risk> getRisks();

	/**
	 * Returns the value of the '<em><b>Run State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run State</em>' attribute.
	 * @see #setRunState(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_RunState()
	 * @model unique="false"
	 * @generated
	 */
	String getRunState();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRunState <em>Run State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run State</em>' attribute.
	 * @see #getRunState()
	 * @generated
	 */
	void setRunState(String value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Ex</em>' attribute.
	 * @see #setStyleEx(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Subtype()
	 * @model unique="false"
	 * @generated
	 */
	Long getSubtype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Long value);

	/**
	 * Returns the value of the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablespace</em>' attribute.
	 * @see #setTablespace(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Tablespace()
	 * @model unique="false"
	 * @generated
	 */
	String getTablespace();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTablespace <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tablespace</em>' attribute.
	 * @see #getTablespace()
	 * @generated
	 */
	void setTablespace(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Tag()
	 * @model unique="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_TaggedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaggedValue> getTaggedValues();

	/**
	 * Returns the value of the '<em><b>Template Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameters</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_TemplateParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateParameter> getTemplateParameters();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * Returns the value of the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Pos</em>' attribute.
	 * @see #setTreePos(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_TreePos()
	 * @model unique="false"
	 * @generated
	 */
	Long getTreePos();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTreePos <em>Tree Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Pos</em>' attribute.
	 * @see #getTreePos()
	 * @generated
	 */
	void setTreePos(Long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType
	 * @see #setVisibility(VisibilityType)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getElement_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	VisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityType value);

} // Element
