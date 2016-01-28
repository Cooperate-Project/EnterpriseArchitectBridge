/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Method;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getActionFlags <em>Action Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAssociationClassConnectorID <em>Association Class Connector ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getBaseClasses <em>Base Classes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getClassifierType <em>Classifier Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getElementGUID <em>Element GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getEmbeddedElements <em>Embedded Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getGenFile <em>Gen File</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getGenType <em>Gen Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsNew <em>Is New</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getMiscData <em>Misc Data</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPropertyTypeName <em>Property Type Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getRunState <em>Run State</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getTablespace <em>Tablespace</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getTreePos <em>Tree Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionFlags() <em>Action Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionFlags() <em>Action Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFlags()
	 * @generated
	 * @ordered
	 */
	protected String actionFlags = ACTION_FLAGS_EDEFAULT;

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
	 * The default value of the '{@link #getAssociationClassConnectorID() <em>Association Class Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationClassConnectorID()
	 * @generated
	 * @ordered
	 */
	protected static final Long ASSOCIATION_CLASS_CONNECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationClassConnectorID() <em>Association Class Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationClassConnectorID()
	 * @generated
	 * @ordered
	 */
	protected Long associationClassConnectorID = ASSOCIATION_CLASS_CONNECTOR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseClasses() <em>Base Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> baseClasses;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Element classifier;

	/**
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected String classifierName = CLASSIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierType() <em>Classifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierType() <em>Classifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierType()
	 * @generated
	 * @ordered
	 */
	protected String classifierType = CLASSIFIER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEXITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected String complexity = COMPLEXITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected String difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementGUID() <em>Element GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementGUID() <em>Element GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementGUID()
	 * @generated
	 * @ordered
	 */
	protected String elementGUID = ELEMENT_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final Long ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected Long elementID = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getEmbeddedElements() <em>Embedded Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> embeddedElements;

	/**
	 * The default value of the '{@link #getEventFlags() <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventFlags() <em>Event Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventFlags()
	 * @generated
	 * @ordered
	 */
	protected String eventFlags = EVENT_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected String extensionPoints = EXTENSION_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenFile() <em>Gen File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFile()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenFile() <em>Gen File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFile()
	 * @generated
	 * @ordered
	 */
	protected String genFile = GEN_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenlinks() <em>Genlinks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenlinks()
	 * @generated
	 * @ordered
	 */
	protected static final String GENLINKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenlinks() <em>Genlinks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenlinks()
	 * @generated
	 * @ordered
	 */
	protected String genlinks = GENLINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenType() <em>Gen Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenType()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenType() <em>Gen Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenType()
	 * @generated
	 * @ordered
	 */
	protected String genType = GEN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COMPOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected Boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LEAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNew() <em>Is New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNew()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNew() <em>Is New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNew()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNew = IS_NEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSpec() <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSpec() <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpec()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSpec = IS_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaType()
	 * @generated
	 * @ordered
	 */
	protected static final String META_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaType()
	 * @generated
	 * @ordered
	 */
	protected String metaType = META_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The default value of the '{@link #getMiscData() <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscData()
	 * @generated
	 * @ordered
	 */
	protected static final String MISC_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiscData() <em>Misc Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscData()
	 * @generated
	 * @ordered
	 */
	protected String miscData = MISC_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected String persistence = PERSISTENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected String phase = PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROPERTY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected Long propertyType = PROPERTY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyTypeName() <em>Property Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyTypeName() <em>Property Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyTypeName()
	 * @generated
	 * @ordered
	 */
	protected String propertyTypeName = PROPERTY_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunState() <em>Run State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunState()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunState() <em>Run State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunState()
	 * @generated
	 * @ordered
	 */
	protected String runState = RUN_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getStyleEx() <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleEx()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleEx() <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleEx()
	 * @generated
	 * @ordered
	 */
	protected String styleEx = STYLE_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Long subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTablespace() <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTablespace() <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablespace()
	 * @generated
	 * @ordered
	 */
	protected String tablespace = TABLESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TaggedValue> taggedValues;

	/**
	 * The default value of the '{@link #getTreePos() <em>Tree Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreePos()
	 * @generated
	 * @ordered
	 */
	protected static final Long TREE_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreePos() <em>Tree Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreePos()
	 * @generated
	 * @ordered
	 */
	protected Long treePos = TREE_POS_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFlags() {
		return actionFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFlags(String newActionFlags) {
		String oldActionFlags = actionFlags;
		actionFlags = newActionFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__ACTION_FLAGS, oldActionFlags, actionFlags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAssociationClassConnectorID() {
		return associationClassConnectorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationClassConnectorID(Long newAssociationClassConnectorID) {
		Long oldAssociationClassConnectorID = associationClassConnectorID;
		associationClassConnectorID = newAssociationClassConnectorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID, oldAssociationClassConnectorID, associationClassConnectorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, XcorePackage.ELEMENT__ATTRIBUTES, XcorePackage.ATTRIBUTE__PARENT);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getBaseClasses() {
		if (baseClasses == null) {
			baseClasses = new EObjectContainmentEList<Element>(Element.class, this, XcorePackage.ELEMENT__BASE_CLASSES);
		}
		return baseClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (Element)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.ELEMENT__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Element newClassifier) {
		Element oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierName() {
		return classifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierName(String newClassifierName) {
		String oldClassifierName = classifierName;
		classifierName = newClassifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CLASSIFIER_NAME, oldClassifierName, classifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierType() {
		return classifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierType(String newClassifierType) {
		String oldClassifierType = classifierType;
		classifierType = newClassifierType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CLASSIFIER_TYPE, oldClassifierType, classifierType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplexity() {
		return complexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexity(String newComplexity) {
		String oldComplexity = complexity;
		complexity = newComplexity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__COMPLEXITY, oldComplexity, complexity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(String newDifficulty) {
		String oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementGUID() {
		return elementGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementGUID(String newElementGUID) {
		String oldElementGUID = elementGUID;
		elementGUID = newElementGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__ELEMENT_GUID, oldElementGUID, elementGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(Long newElementID) {
		Long oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, XcorePackage.ELEMENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getEmbeddedElements() {
		if (embeddedElements == null) {
			embeddedElements = new EObjectContainmentEList<Element>(Element.class, this, XcorePackage.ELEMENT__EMBEDDED_ELEMENTS);
		}
		return embeddedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventFlags() {
		return eventFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFlags(String newEventFlags) {
		String oldEventFlags = eventFlags;
		eventFlags = newEventFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__EVENT_FLAGS, oldEventFlags, eventFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionPoints() {
		return extensionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPoints(String newExtensionPoints) {
		String oldExtensionPoints = extensionPoints;
		extensionPoints = newExtensionPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__EXTENSION_POINTS, oldExtensionPoints, extensionPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenFile() {
		return genFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFile(String newGenFile) {
		String oldGenFile = genFile;
		genFile = newGenFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__GEN_FILE, oldGenFile, genFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenlinks() {
		return genlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenlinks(String newGenlinks) {
		String oldGenlinks = genlinks;
		genlinks = newGenlinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__GENLINKS, oldGenlinks, genlinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenType() {
		return genType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenType(String newGenType) {
		String oldGenType = genType;
		genType = newGenType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__GEN_TYPE, oldGenType, genType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(Boolean newIsActive) {
		Boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(Boolean newIsComposite) {
		Boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		Boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNew() {
		return isNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNew(Boolean newIsNew) {
		Boolean oldIsNew = isNew;
		isNew = newIsNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__IS_NEW, oldIsNew, isNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSpec() {
		return isSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpec(Boolean newIsSpec) {
		Boolean oldIsSpec = isSpec;
		isSpec = newIsSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__IS_SPEC, oldIsSpec, isSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(Boolean newLocked) {
		Boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaType() {
		return metaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaType(String newMetaType) {
		String oldMetaType = metaType;
		metaType = newMetaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__META_TYPE, oldMetaType, metaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, XcorePackage.ELEMENT__METHODS, XcorePackage.METHOD__PARENT);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiscData() {
		return miscData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiscData(String newMiscData) {
		String oldMiscData = miscData;
		miscData = newMiscData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__MISC_DATA, oldMiscData, miscData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__MULTIPLICITY, oldMultiplicity, multiplicity));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.xcore.Package getPackage() {
		if (eContainerFeatureID() != XcorePackage.ELEMENT__PACKAGE) return null;
		return (de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.xcore.Package basicGetPackage() {
		if (eContainerFeatureID() != XcorePackage.ELEMENT__PACKAGE) return null;
		return (de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, XcorePackage.ELEMENT__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != XcorePackage.ELEMENT__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, XcorePackage.PACKAGE__ELEMENTS, de.cooperateproject.eabridge.eaobjectmodel.xcore.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		Element parent = basicGetParent();
		return parent != null && parent.eIsProxy() ? (Element)eResolveProxy((InternalEObject)parent) : parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		EObject _eContainer = this.eContainer();
		return ((Element) _eContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(String newPersistence) {
		String oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PERSISTENCE, oldPersistence, persistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(String newPhase) {
		String oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPropertyType() {
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyType(Long newPropertyType) {
		Long oldPropertyType = propertyType;
		propertyType = newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PROPERTY_TYPE, oldPropertyType, propertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyTypeName() {
		return propertyTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyTypeName(String newPropertyTypeName) {
		String oldPropertyTypeName = propertyTypeName;
		propertyTypeName = newPropertyTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PROPERTY_TYPE_NAME, oldPropertyTypeName, propertyTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRunState() {
		return runState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunState(String newRunState) {
		String oldRunState = runState;
		runState = newRunState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__RUN_STATE, oldRunState, runState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return styleEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		String oldStyleEx = styleEx;
		styleEx = newStyleEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(Long newSubtype) {
		Long oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTablespace() {
		return tablespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablespace(String newTablespace) {
		String oldTablespace = tablespace;
		tablespace = newTablespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__TABLESPACE, oldTablespace, tablespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedValue> getTaggedValues() {
		if (taggedValues == null) {
			taggedValues = new EObjectContainmentEList<TaggedValue>(TaggedValue.class, this, XcorePackage.ELEMENT__TAGGED_VALUES);
		}
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTreePos() {
		return treePos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreePos(Long newTreePos) {
		Long oldTreePos = treePos;
		treePos = newTreePos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__TREE_POS, oldTreePos, treePos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.ELEMENT__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case XcorePackage.ELEMENT__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case XcorePackage.ELEMENT__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__BASE_CLASSES:
				return ((InternalEList<?>)getBaseClasses()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__EMBEDDED_ELEMENTS:
				return ((InternalEList<?>)getEmbeddedElements()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__PACKAGE:
				return basicSetPackage(null, msgs);
			case XcorePackage.ELEMENT__TAGGED_VALUES:
				return ((InternalEList<?>)getTaggedValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XcorePackage.ELEMENT__PACKAGE:
				return eInternalContainer().eInverseRemove(this, XcorePackage.PACKAGE__ELEMENTS, de.cooperateproject.eabridge.eaobjectmodel.xcore.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.ELEMENT__ABSTRACT:
				return getAbstract();
			case XcorePackage.ELEMENT__ACTION_FLAGS:
				return getActionFlags();
			case XcorePackage.ELEMENT__ALIAS:
				return getAlias();
			case XcorePackage.ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID:
				return getAssociationClassConnectorID();
			case XcorePackage.ELEMENT__ATTRIBUTES:
				return getAttributes();
			case XcorePackage.ELEMENT__AUTHOR:
				return getAuthor();
			case XcorePackage.ELEMENT__BASE_CLASSES:
				return getBaseClasses();
			case XcorePackage.ELEMENT__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case XcorePackage.ELEMENT__CLASSIFIER_NAME:
				return getClassifierName();
			case XcorePackage.ELEMENT__CLASSIFIER_TYPE:
				return getClassifierType();
			case XcorePackage.ELEMENT__COMPLEXITY:
				return getComplexity();
			case XcorePackage.ELEMENT__CREATED:
				return getCreated();
			case XcorePackage.ELEMENT__DIFFICULTY:
				return getDifficulty();
			case XcorePackage.ELEMENT__ELEMENT_GUID:
				return getElementGUID();
			case XcorePackage.ELEMENT__ELEMENT_ID:
				return getElementID();
			case XcorePackage.ELEMENT__ELEMENTS:
				return getElements();
			case XcorePackage.ELEMENT__EMBEDDED_ELEMENTS:
				return getEmbeddedElements();
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				return getEventFlags();
			case XcorePackage.ELEMENT__EXTENSION_POINTS:
				return getExtensionPoints();
			case XcorePackage.ELEMENT__GEN_FILE:
				return getGenFile();
			case XcorePackage.ELEMENT__GENLINKS:
				return getGenlinks();
			case XcorePackage.ELEMENT__GEN_TYPE:
				return getGenType();
			case XcorePackage.ELEMENT__IS_ACTIVE:
				return getIsActive();
			case XcorePackage.ELEMENT__IS_COMPOSITE:
				return getIsComposite();
			case XcorePackage.ELEMENT__IS_LEAF:
				return getIsLeaf();
			case XcorePackage.ELEMENT__IS_NEW:
				return getIsNew();
			case XcorePackage.ELEMENT__IS_SPEC:
				return getIsSpec();
			case XcorePackage.ELEMENT__LOCKED:
				return getLocked();
			case XcorePackage.ELEMENT__META_TYPE:
				return getMetaType();
			case XcorePackage.ELEMENT__METHODS:
				return getMethods();
			case XcorePackage.ELEMENT__MISC_DATA:
				return getMiscData();
			case XcorePackage.ELEMENT__MODIFIED:
				return getModified();
			case XcorePackage.ELEMENT__MULTIPLICITY:
				return getMultiplicity();
			case XcorePackage.ELEMENT__NAME:
				return getName();
			case XcorePackage.ELEMENT__NOTES:
				return getNotes();
			case XcorePackage.ELEMENT__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case XcorePackage.ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case XcorePackage.ELEMENT__PERSISTENCE:
				return getPersistence();
			case XcorePackage.ELEMENT__PHASE:
				return getPhase();
			case XcorePackage.ELEMENT__PRIORITY:
				return getPriority();
			case XcorePackage.ELEMENT__PROPERTY_TYPE:
				return getPropertyType();
			case XcorePackage.ELEMENT__PROPERTY_TYPE_NAME:
				return getPropertyTypeName();
			case XcorePackage.ELEMENT__RUN_STATE:
				return getRunState();
			case XcorePackage.ELEMENT__STATUS:
				return getStatus();
			case XcorePackage.ELEMENT__STEREOTYPE:
				return getStereotype();
			case XcorePackage.ELEMENT__STYLE_EX:
				return getStyleEx();
			case XcorePackage.ELEMENT__SUBTYPE:
				return getSubtype();
			case XcorePackage.ELEMENT__TABLESPACE:
				return getTablespace();
			case XcorePackage.ELEMENT__TAG:
				return getTag();
			case XcorePackage.ELEMENT__TAGGED_VALUES:
				return getTaggedValues();
			case XcorePackage.ELEMENT__TREE_POS:
				return getTreePos();
			case XcorePackage.ELEMENT__TYPE:
				return getType();
			case XcorePackage.ELEMENT__VERSION:
				return getVersion();
			case XcorePackage.ELEMENT__VISIBILITY:
				return getVisibility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcorePackage.ELEMENT__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case XcorePackage.ELEMENT__ACTION_FLAGS:
				setActionFlags((String)newValue);
				return;
			case XcorePackage.ELEMENT__ALIAS:
				setAlias((String)newValue);
				return;
			case XcorePackage.ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID:
				setAssociationClassConnectorID((Long)newValue);
				return;
			case XcorePackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case XcorePackage.ELEMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case XcorePackage.ELEMENT__BASE_CLASSES:
				getBaseClasses().clear();
				getBaseClasses().addAll((Collection<? extends Element>)newValue);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER:
				setClassifier((Element)newValue);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER_TYPE:
				setClassifierType((String)newValue);
				return;
			case XcorePackage.ELEMENT__COMPLEXITY:
				setComplexity((String)newValue);
				return;
			case XcorePackage.ELEMENT__CREATED:
				setCreated((Date)newValue);
				return;
			case XcorePackage.ELEMENT__DIFFICULTY:
				setDifficulty((String)newValue);
				return;
			case XcorePackage.ELEMENT__ELEMENT_GUID:
				setElementGUID((String)newValue);
				return;
			case XcorePackage.ELEMENT__ELEMENT_ID:
				setElementID((Long)newValue);
				return;
			case XcorePackage.ELEMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case XcorePackage.ELEMENT__EMBEDDED_ELEMENTS:
				getEmbeddedElements().clear();
				getEmbeddedElements().addAll((Collection<? extends Element>)newValue);
				return;
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				setEventFlags((String)newValue);
				return;
			case XcorePackage.ELEMENT__EXTENSION_POINTS:
				setExtensionPoints((String)newValue);
				return;
			case XcorePackage.ELEMENT__GEN_FILE:
				setGenFile((String)newValue);
				return;
			case XcorePackage.ELEMENT__GENLINKS:
				setGenlinks((String)newValue);
				return;
			case XcorePackage.ELEMENT__GEN_TYPE:
				setGenType((String)newValue);
				return;
			case XcorePackage.ELEMENT__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__IS_NEW:
				setIsNew((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__IS_SPEC:
				setIsSpec((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__META_TYPE:
				setMetaType((String)newValue);
				return;
			case XcorePackage.ELEMENT__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case XcorePackage.ELEMENT__MISC_DATA:
				setMiscData((String)newValue);
				return;
			case XcorePackage.ELEMENT__MODIFIED:
				setModified((Date)newValue);
				return;
			case XcorePackage.ELEMENT__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case XcorePackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.ELEMENT__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.ELEMENT__PACKAGE:
				setPackage((de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)newValue);
				return;
			case XcorePackage.ELEMENT__PERSISTENCE:
				setPersistence((String)newValue);
				return;
			case XcorePackage.ELEMENT__PHASE:
				setPhase((String)newValue);
				return;
			case XcorePackage.ELEMENT__PRIORITY:
				setPriority((String)newValue);
				return;
			case XcorePackage.ELEMENT__PROPERTY_TYPE:
				setPropertyType((Long)newValue);
				return;
			case XcorePackage.ELEMENT__PROPERTY_TYPE_NAME:
				setPropertyTypeName((String)newValue);
				return;
			case XcorePackage.ELEMENT__RUN_STATE:
				setRunState((String)newValue);
				return;
			case XcorePackage.ELEMENT__STATUS:
				setStatus((String)newValue);
				return;
			case XcorePackage.ELEMENT__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XcorePackage.ELEMENT__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case XcorePackage.ELEMENT__SUBTYPE:
				setSubtype((Long)newValue);
				return;
			case XcorePackage.ELEMENT__TABLESPACE:
				setTablespace((String)newValue);
				return;
			case XcorePackage.ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case XcorePackage.ELEMENT__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case XcorePackage.ELEMENT__TREE_POS:
				setTreePos((Long)newValue);
				return;
			case XcorePackage.ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case XcorePackage.ELEMENT__VERSION:
				setVersion((String)newValue);
				return;
			case XcorePackage.ELEMENT__VISIBILITY:
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
			case XcorePackage.ELEMENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ACTION_FLAGS:
				setActionFlags(ACTION_FLAGS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID:
				setAssociationClassConnectorID(ASSOCIATION_CLASS_CONNECTOR_ID_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case XcorePackage.ELEMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__BASE_CLASSES:
				getBaseClasses().clear();
				return;
			case XcorePackage.ELEMENT__CLASSIFIER:
				setClassifier((Element)null);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER_TYPE:
				setClassifierType(CLASSIFIER_TYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__COMPLEXITY:
				setComplexity(COMPLEXITY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ELEMENT_GUID:
				setElementGUID(ELEMENT_GUID_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__ELEMENTS:
				getElements().clear();
				return;
			case XcorePackage.ELEMENT__EMBEDDED_ELEMENTS:
				getEmbeddedElements().clear();
				return;
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				setEventFlags(EVENT_FLAGS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__EXTENSION_POINTS:
				setExtensionPoints(EXTENSION_POINTS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__GEN_FILE:
				setGenFile(GEN_FILE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__GENLINKS:
				setGenlinks(GENLINKS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__GEN_TYPE:
				setGenType(GEN_TYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__IS_NEW:
				setIsNew(IS_NEW_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__IS_SPEC:
				setIsSpec(IS_SPEC_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__META_TYPE:
				setMetaType(META_TYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__METHODS:
				getMethods().clear();
				return;
			case XcorePackage.ELEMENT__MISC_DATA:
				setMiscData(MISC_DATA_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__PACKAGE:
				setPackage((de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)null);
				return;
			case XcorePackage.ELEMENT__PERSISTENCE:
				setPersistence(PERSISTENCE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__PROPERTY_TYPE:
				setPropertyType(PROPERTY_TYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__PROPERTY_TYPE_NAME:
				setPropertyTypeName(PROPERTY_TYPE_NAME_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__RUN_STATE:
				setRunState(RUN_STATE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__TABLESPACE:
				setTablespace(TABLESPACE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__TAGGED_VALUES:
				getTaggedValues().clear();
				return;
			case XcorePackage.ELEMENT__TREE_POS:
				setTreePos(TREE_POS_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__VISIBILITY:
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
			case XcorePackage.ELEMENT__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case XcorePackage.ELEMENT__ACTION_FLAGS:
				return ACTION_FLAGS_EDEFAULT == null ? actionFlags != null : !ACTION_FLAGS_EDEFAULT.equals(actionFlags);
			case XcorePackage.ELEMENT__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case XcorePackage.ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID:
				return ASSOCIATION_CLASS_CONNECTOR_ID_EDEFAULT == null ? associationClassConnectorID != null : !ASSOCIATION_CLASS_CONNECTOR_ID_EDEFAULT.equals(associationClassConnectorID);
			case XcorePackage.ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case XcorePackage.ELEMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case XcorePackage.ELEMENT__BASE_CLASSES:
				return baseClasses != null && !baseClasses.isEmpty();
			case XcorePackage.ELEMENT__CLASSIFIER:
				return classifier != null;
			case XcorePackage.ELEMENT__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? classifierName != null : !CLASSIFIER_NAME_EDEFAULT.equals(classifierName);
			case XcorePackage.ELEMENT__CLASSIFIER_TYPE:
				return CLASSIFIER_TYPE_EDEFAULT == null ? classifierType != null : !CLASSIFIER_TYPE_EDEFAULT.equals(classifierType);
			case XcorePackage.ELEMENT__COMPLEXITY:
				return COMPLEXITY_EDEFAULT == null ? complexity != null : !COMPLEXITY_EDEFAULT.equals(complexity);
			case XcorePackage.ELEMENT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case XcorePackage.ELEMENT__DIFFICULTY:
				return DIFFICULTY_EDEFAULT == null ? difficulty != null : !DIFFICULTY_EDEFAULT.equals(difficulty);
			case XcorePackage.ELEMENT__ELEMENT_GUID:
				return ELEMENT_GUID_EDEFAULT == null ? elementGUID != null : !ELEMENT_GUID_EDEFAULT.equals(elementGUID);
			case XcorePackage.ELEMENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case XcorePackage.ELEMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case XcorePackage.ELEMENT__EMBEDDED_ELEMENTS:
				return embeddedElements != null && !embeddedElements.isEmpty();
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				return EVENT_FLAGS_EDEFAULT == null ? eventFlags != null : !EVENT_FLAGS_EDEFAULT.equals(eventFlags);
			case XcorePackage.ELEMENT__EXTENSION_POINTS:
				return EXTENSION_POINTS_EDEFAULT == null ? extensionPoints != null : !EXTENSION_POINTS_EDEFAULT.equals(extensionPoints);
			case XcorePackage.ELEMENT__GEN_FILE:
				return GEN_FILE_EDEFAULT == null ? genFile != null : !GEN_FILE_EDEFAULT.equals(genFile);
			case XcorePackage.ELEMENT__GENLINKS:
				return GENLINKS_EDEFAULT == null ? genlinks != null : !GENLINKS_EDEFAULT.equals(genlinks);
			case XcorePackage.ELEMENT__GEN_TYPE:
				return GEN_TYPE_EDEFAULT == null ? genType != null : !GEN_TYPE_EDEFAULT.equals(genType);
			case XcorePackage.ELEMENT__IS_ACTIVE:
				return IS_ACTIVE_EDEFAULT == null ? isActive != null : !IS_ACTIVE_EDEFAULT.equals(isActive);
			case XcorePackage.ELEMENT__IS_COMPOSITE:
				return IS_COMPOSITE_EDEFAULT == null ? isComposite != null : !IS_COMPOSITE_EDEFAULT.equals(isComposite);
			case XcorePackage.ELEMENT__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case XcorePackage.ELEMENT__IS_NEW:
				return IS_NEW_EDEFAULT == null ? isNew != null : !IS_NEW_EDEFAULT.equals(isNew);
			case XcorePackage.ELEMENT__IS_SPEC:
				return IS_SPEC_EDEFAULT == null ? isSpec != null : !IS_SPEC_EDEFAULT.equals(isSpec);
			case XcorePackage.ELEMENT__LOCKED:
				return LOCKED_EDEFAULT == null ? locked != null : !LOCKED_EDEFAULT.equals(locked);
			case XcorePackage.ELEMENT__META_TYPE:
				return META_TYPE_EDEFAULT == null ? metaType != null : !META_TYPE_EDEFAULT.equals(metaType);
			case XcorePackage.ELEMENT__METHODS:
				return methods != null && !methods.isEmpty();
			case XcorePackage.ELEMENT__MISC_DATA:
				return MISC_DATA_EDEFAULT == null ? miscData != null : !MISC_DATA_EDEFAULT.equals(miscData);
			case XcorePackage.ELEMENT__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case XcorePackage.ELEMENT__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case XcorePackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.ELEMENT__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.ELEMENT__PACKAGE:
				return basicGetPackage() != null;
			case XcorePackage.ELEMENT__PARENT:
				return basicGetParent() != null;
			case XcorePackage.ELEMENT__PERSISTENCE:
				return PERSISTENCE_EDEFAULT == null ? persistence != null : !PERSISTENCE_EDEFAULT.equals(persistence);
			case XcorePackage.ELEMENT__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
			case XcorePackage.ELEMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case XcorePackage.ELEMENT__PROPERTY_TYPE:
				return PROPERTY_TYPE_EDEFAULT == null ? propertyType != null : !PROPERTY_TYPE_EDEFAULT.equals(propertyType);
			case XcorePackage.ELEMENT__PROPERTY_TYPE_NAME:
				return PROPERTY_TYPE_NAME_EDEFAULT == null ? propertyTypeName != null : !PROPERTY_TYPE_NAME_EDEFAULT.equals(propertyTypeName);
			case XcorePackage.ELEMENT__RUN_STATE:
				return RUN_STATE_EDEFAULT == null ? runState != null : !RUN_STATE_EDEFAULT.equals(runState);
			case XcorePackage.ELEMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case XcorePackage.ELEMENT__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.ELEMENT__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.ELEMENT__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case XcorePackage.ELEMENT__TABLESPACE:
				return TABLESPACE_EDEFAULT == null ? tablespace != null : !TABLESPACE_EDEFAULT.equals(tablespace);
			case XcorePackage.ELEMENT__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case XcorePackage.ELEMENT__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
			case XcorePackage.ELEMENT__TREE_POS:
				return TREE_POS_EDEFAULT == null ? treePos != null : !TREE_POS_EDEFAULT.equals(treePos);
			case XcorePackage.ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XcorePackage.ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case XcorePackage.ELEMENT__VISIBILITY:
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
		result.append(" (Abstract: ");
		result.append(abstract_);
		result.append(", ActionFlags: ");
		result.append(actionFlags);
		result.append(", Alias: ");
		result.append(alias);
		result.append(", AssociationClassConnectorID: ");
		result.append(associationClassConnectorID);
		result.append(", Author: ");
		result.append(author);
		result.append(", ClassifierName: ");
		result.append(classifierName);
		result.append(", ClassifierType: ");
		result.append(classifierType);
		result.append(", Complexity: ");
		result.append(complexity);
		result.append(", Created: ");
		result.append(created);
		result.append(", Difficulty: ");
		result.append(difficulty);
		result.append(", ElementGUID: ");
		result.append(elementGUID);
		result.append(", ElementID: ");
		result.append(elementID);
		result.append(", EventFlags: ");
		result.append(eventFlags);
		result.append(", ExtensionPoints: ");
		result.append(extensionPoints);
		result.append(", GenFile: ");
		result.append(genFile);
		result.append(", Genlinks: ");
		result.append(genlinks);
		result.append(", GenType: ");
		result.append(genType);
		result.append(", IsActive: ");
		result.append(isActive);
		result.append(", IsComposite: ");
		result.append(isComposite);
		result.append(", IsLeaf: ");
		result.append(isLeaf);
		result.append(", IsNew: ");
		result.append(isNew);
		result.append(", IsSpec: ");
		result.append(isSpec);
		result.append(", Locked: ");
		result.append(locked);
		result.append(", MetaType: ");
		result.append(metaType);
		result.append(", MiscData: ");
		result.append(miscData);
		result.append(", Modified: ");
		result.append(modified);
		result.append(", Multiplicity: ");
		result.append(multiplicity);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Persistence: ");
		result.append(persistence);
		result.append(", Phase: ");
		result.append(phase);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", PropertyType: ");
		result.append(propertyType);
		result.append(", PropertyTypeName: ");
		result.append(propertyTypeName);
		result.append(", RunState: ");
		result.append(runState);
		result.append(", Status: ");
		result.append(status);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", Subtype: ");
		result.append(subtype);
		result.append(", Tablespace: ");
		result.append(tablespace);
		result.append(", Tag: ");
		result.append(tag);
		result.append(", TreePos: ");
		result.append(treePos);
		result.append(", Type: ");
		result.append(type);
		result.append(", Version: ");
		result.append(version);
		result.append(", Visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
