/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Element;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.Method;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getClassifier_guid <em>Classifier guid</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getElementGUID <em>Element GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getGenFile <em>Gen File</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getGenType <em>Gen Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getRunState <em>Run State</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getTreePos <em>Tree Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getBackcolor <em>Backcolor</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getFontcolor <em>Fontcolor</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getBordercolor <em>Bordercolor</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl#getCorrespondingPackage <em>Corresponding Package</em>}</li>
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
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Element classifier;

	/**
	 * The default value of the '{@link #getClassifier_guid() <em>Classifier guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_guid()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier_guid() <em>Classifier guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_guid()
	 * @generated
	 * @ordered
	 */
	protected String classifier_guid = CLASSIFIER_GUID_EDEFAULT;

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
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The default value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date modifiedDate = MODIFIED_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackcolor() <em>Backcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackcolor()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKCOLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBackcolor() <em>Backcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackcolor()
	 * @generated
	 * @ordered
	 */
	protected int backcolor = BACKCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_STYLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected int borderStyle = BORDER_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected int borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontcolor() <em>Fontcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontcolor()
	 * @generated
	 * @ordered
	 */
	protected static final int FONTCOLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFontcolor() <em>Fontcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontcolor()
	 * @generated
	 * @ordered
	 */
	protected int fontcolor = FONTCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBordercolor() <em>Bordercolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBordercolor()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDERCOLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBordercolor() <em>Bordercolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBordercolor()
	 * @generated
	 * @ordered
	 */
	protected int bordercolor = BORDERCOLOR_EDEFAULT;

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
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected String concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrespondingPackage() <em>Corresponding Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingPackage()
	 * @generated
	 * @ordered
	 */
	protected de.cooperateproject.eabridge.eaobjectmodel.xcore.Package correspondingPackage;

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
	public String getClassifier_guid() {
		return classifier_guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier_guid(String newClassifier_guid) {
		String oldClassifier_guid = classifier_guid;
		classifier_guid = newClassifier_guid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CLASSIFIER_GUID, oldClassifier_guid, classifier_guid));
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
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CREATED_DATE, oldCreatedDate, createdDate));
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
			elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, XcorePackage.ELEMENT__ELEMENTS, XcorePackage.ELEMENT__PARENT);
		}
		return elements;
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
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(Date newModifiedDate) {
		Date oldModifiedDate = modifiedDate;
		modifiedDate = newModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__MODIFIED_DATE, oldModifiedDate, modifiedDate));
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
		if (eContainerFeatureID() != XcorePackage.ELEMENT__PARENT) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetParent() {
		if (eContainerFeatureID() != XcorePackage.ELEMENT__PARENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, XcorePackage.ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != XcorePackage.ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, XcorePackage.ELEMENT__ELEMENTS, Element.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__PARENT, newParent, newParent));
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
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackcolor() {
		return backcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackcolor(int newBackcolor) {
		int oldBackcolor = backcolor;
		backcolor = newBackcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__BACKCOLOR, oldBackcolor, backcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderStyle() {
		return borderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderStyle(int newBorderStyle) {
		int oldBorderStyle = borderStyle;
		borderStyle = newBorderStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__BORDER_STYLE, oldBorderStyle, borderStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderWidth(int newBorderWidth) {
		int oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontcolor() {
		return fontcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontcolor(int newFontcolor) {
		int oldFontcolor = fontcolor;
		fontcolor = newFontcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__FONTCOLOR, oldFontcolor, fontcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBordercolor() {
		return bordercolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBordercolor(int newBordercolor) {
		int oldBordercolor = bordercolor;
		bordercolor = newBordercolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__BORDERCOLOR, oldBordercolor, bordercolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		String oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.xcore.Package getCorrespondingPackage() {
		if (correspondingPackage != null && correspondingPackage.eIsProxy()) {
			InternalEObject oldCorrespondingPackage = (InternalEObject)correspondingPackage;
			correspondingPackage = (de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)eResolveProxy(oldCorrespondingPackage);
			if (correspondingPackage != oldCorrespondingPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.ELEMENT__CORRESPONDING_PACKAGE, oldCorrespondingPackage, correspondingPackage));
			}
		}
		return correspondingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.xcore.Package basicGetCorrespondingPackage() {
		return correspondingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package newCorrespondingPackage) {
		de.cooperateproject.eabridge.eaobjectmodel.xcore.Package oldCorrespondingPackage = correspondingPackage;
		correspondingPackage = newCorrespondingPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ELEMENT__CORRESPONDING_PACKAGE, oldCorrespondingPackage, correspondingPackage));
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
			case XcorePackage.ELEMENT__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case XcorePackage.ELEMENT__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case XcorePackage.ELEMENT__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)otherEnd, msgs);
			case XcorePackage.ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Element)otherEnd, msgs);
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
			case XcorePackage.ELEMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case XcorePackage.ELEMENT__PACKAGE:
				return basicSetPackage(null, msgs);
			case XcorePackage.ELEMENT__PARENT:
				return basicSetParent(null, msgs);
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
			case XcorePackage.ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, XcorePackage.ELEMENT__ELEMENTS, Element.class, msgs);
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
			case XcorePackage.ELEMENT__ATTRIBUTES:
				return getAttributes();
			case XcorePackage.ELEMENT__AUTHOR:
				return getAuthor();
			case XcorePackage.ELEMENT__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case XcorePackage.ELEMENT__CLASSIFIER_GUID:
				return getClassifier_guid();
			case XcorePackage.ELEMENT__COMPLEXITY:
				return getComplexity();
			case XcorePackage.ELEMENT__CREATED_DATE:
				return getCreatedDate();
			case XcorePackage.ELEMENT__ELEMENT_GUID:
				return getElementGUID();
			case XcorePackage.ELEMENT__ELEMENT_ID:
				return getElementID();
			case XcorePackage.ELEMENT__ELEMENTS:
				return getElements();
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				return getEventFlags();
			case XcorePackage.ELEMENT__GEN_FILE:
				return getGenFile();
			case XcorePackage.ELEMENT__GENLINKS:
				return getGenlinks();
			case XcorePackage.ELEMENT__GEN_TYPE:
				return getGenType();
			case XcorePackage.ELEMENT__IS_ACTIVE:
				return getIsActive();
			case XcorePackage.ELEMENT__IS_LEAF:
				return getIsLeaf();
			case XcorePackage.ELEMENT__IS_SPEC:
				return getIsSpec();
			case XcorePackage.ELEMENT__METHODS:
				return getMethods();
			case XcorePackage.ELEMENT__MODIFIED_DATE:
				return getModifiedDate();
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
			case XcorePackage.ELEMENT__RUN_STATE:
				return getRunState();
			case XcorePackage.ELEMENT__STATUS:
				return getStatus();
			case XcorePackage.ELEMENT__STEREOTYPE:
				return getStereotype();
			case XcorePackage.ELEMENT__STYLE_EX:
				return getStyleEx();
			case XcorePackage.ELEMENT__TREE_POS:
				return getTreePos();
			case XcorePackage.ELEMENT__TYPE:
				return getType();
			case XcorePackage.ELEMENT__VERSION:
				return getVersion();
			case XcorePackage.ELEMENT__VISIBILITY:
				return getVisibility();
			case XcorePackage.ELEMENT__STYLE:
				return getStyle();
			case XcorePackage.ELEMENT__BACKCOLOR:
				return getBackcolor();
			case XcorePackage.ELEMENT__BORDER_STYLE:
				return getBorderStyle();
			case XcorePackage.ELEMENT__BORDER_WIDTH:
				return getBorderWidth();
			case XcorePackage.ELEMENT__FONTCOLOR:
				return getFontcolor();
			case XcorePackage.ELEMENT__BORDERCOLOR:
				return getBordercolor();
			case XcorePackage.ELEMENT__CARDINALITY:
				return getCardinality();
			case XcorePackage.ELEMENT__CONCURRENCY:
				return getConcurrency();
			case XcorePackage.ELEMENT__CORRESPONDING_PACKAGE:
				if (resolve) return getCorrespondingPackage();
				return basicGetCorrespondingPackage();
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
			case XcorePackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case XcorePackage.ELEMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER:
				setClassifier((Element)newValue);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER_GUID:
				setClassifier_guid((String)newValue);
				return;
			case XcorePackage.ELEMENT__COMPLEXITY:
				setComplexity((String)newValue);
				return;
			case XcorePackage.ELEMENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
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
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				setEventFlags((String)newValue);
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
			case XcorePackage.ELEMENT__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__IS_SPEC:
				setIsSpec((Boolean)newValue);
				return;
			case XcorePackage.ELEMENT__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case XcorePackage.ELEMENT__MODIFIED_DATE:
				setModifiedDate((Date)newValue);
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
			case XcorePackage.ELEMENT__PARENT:
				setParent((Element)newValue);
				return;
			case XcorePackage.ELEMENT__PERSISTENCE:
				setPersistence((String)newValue);
				return;
			case XcorePackage.ELEMENT__PHASE:
				setPhase((String)newValue);
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
			case XcorePackage.ELEMENT__STYLE:
				setStyle((String)newValue);
				return;
			case XcorePackage.ELEMENT__BACKCOLOR:
				setBackcolor((Integer)newValue);
				return;
			case XcorePackage.ELEMENT__BORDER_STYLE:
				setBorderStyle((Integer)newValue);
				return;
			case XcorePackage.ELEMENT__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case XcorePackage.ELEMENT__FONTCOLOR:
				setFontcolor((Integer)newValue);
				return;
			case XcorePackage.ELEMENT__BORDERCOLOR:
				setBordercolor((Integer)newValue);
				return;
			case XcorePackage.ELEMENT__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case XcorePackage.ELEMENT__CONCURRENCY:
				setConcurrency((String)newValue);
				return;
			case XcorePackage.ELEMENT__CORRESPONDING_PACKAGE:
				setCorrespondingPackage((de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)newValue);
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
			case XcorePackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case XcorePackage.ELEMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER:
				setClassifier((Element)null);
				return;
			case XcorePackage.ELEMENT__CLASSIFIER_GUID:
				setClassifier_guid(CLASSIFIER_GUID_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__COMPLEXITY:
				setComplexity(COMPLEXITY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
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
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				setEventFlags(EVENT_FLAGS_EDEFAULT);
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
			case XcorePackage.ELEMENT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__IS_SPEC:
				setIsSpec(IS_SPEC_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__METHODS:
				getMethods().clear();
				return;
			case XcorePackage.ELEMENT__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
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
			case XcorePackage.ELEMENT__PARENT:
				setParent((Element)null);
				return;
			case XcorePackage.ELEMENT__PERSISTENCE:
				setPersistence(PERSISTENCE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case XcorePackage.ELEMENT__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__BACKCOLOR:
				setBackcolor(BACKCOLOR_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__BORDER_STYLE:
				setBorderStyle(BORDER_STYLE_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__FONTCOLOR:
				setFontcolor(FONTCOLOR_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__BORDERCOLOR:
				setBordercolor(BORDERCOLOR_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case XcorePackage.ELEMENT__CORRESPONDING_PACKAGE:
				setCorrespondingPackage((de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)null);
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
			case XcorePackage.ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case XcorePackage.ELEMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case XcorePackage.ELEMENT__CLASSIFIER:
				return classifier != null;
			case XcorePackage.ELEMENT__CLASSIFIER_GUID:
				return CLASSIFIER_GUID_EDEFAULT == null ? classifier_guid != null : !CLASSIFIER_GUID_EDEFAULT.equals(classifier_guid);
			case XcorePackage.ELEMENT__COMPLEXITY:
				return COMPLEXITY_EDEFAULT == null ? complexity != null : !COMPLEXITY_EDEFAULT.equals(complexity);
			case XcorePackage.ELEMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case XcorePackage.ELEMENT__ELEMENT_GUID:
				return ELEMENT_GUID_EDEFAULT == null ? elementGUID != null : !ELEMENT_GUID_EDEFAULT.equals(elementGUID);
			case XcorePackage.ELEMENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case XcorePackage.ELEMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case XcorePackage.ELEMENT__EVENT_FLAGS:
				return EVENT_FLAGS_EDEFAULT == null ? eventFlags != null : !EVENT_FLAGS_EDEFAULT.equals(eventFlags);
			case XcorePackage.ELEMENT__GEN_FILE:
				return GEN_FILE_EDEFAULT == null ? genFile != null : !GEN_FILE_EDEFAULT.equals(genFile);
			case XcorePackage.ELEMENT__GENLINKS:
				return GENLINKS_EDEFAULT == null ? genlinks != null : !GENLINKS_EDEFAULT.equals(genlinks);
			case XcorePackage.ELEMENT__GEN_TYPE:
				return GEN_TYPE_EDEFAULT == null ? genType != null : !GEN_TYPE_EDEFAULT.equals(genType);
			case XcorePackage.ELEMENT__IS_ACTIVE:
				return IS_ACTIVE_EDEFAULT == null ? isActive != null : !IS_ACTIVE_EDEFAULT.equals(isActive);
			case XcorePackage.ELEMENT__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case XcorePackage.ELEMENT__IS_SPEC:
				return IS_SPEC_EDEFAULT == null ? isSpec != null : !IS_SPEC_EDEFAULT.equals(isSpec);
			case XcorePackage.ELEMENT__METHODS:
				return methods != null && !methods.isEmpty();
			case XcorePackage.ELEMENT__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
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
			case XcorePackage.ELEMENT__RUN_STATE:
				return RUN_STATE_EDEFAULT == null ? runState != null : !RUN_STATE_EDEFAULT.equals(runState);
			case XcorePackage.ELEMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case XcorePackage.ELEMENT__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.ELEMENT__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.ELEMENT__TREE_POS:
				return TREE_POS_EDEFAULT == null ? treePos != null : !TREE_POS_EDEFAULT.equals(treePos);
			case XcorePackage.ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XcorePackage.ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case XcorePackage.ELEMENT__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case XcorePackage.ELEMENT__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XcorePackage.ELEMENT__BACKCOLOR:
				return backcolor != BACKCOLOR_EDEFAULT;
			case XcorePackage.ELEMENT__BORDER_STYLE:
				return borderStyle != BORDER_STYLE_EDEFAULT;
			case XcorePackage.ELEMENT__BORDER_WIDTH:
				return borderWidth != BORDER_WIDTH_EDEFAULT;
			case XcorePackage.ELEMENT__FONTCOLOR:
				return fontcolor != FONTCOLOR_EDEFAULT;
			case XcorePackage.ELEMENT__BORDERCOLOR:
				return bordercolor != BORDERCOLOR_EDEFAULT;
			case XcorePackage.ELEMENT__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case XcorePackage.ELEMENT__CONCURRENCY:
				return CONCURRENCY_EDEFAULT == null ? concurrency != null : !CONCURRENCY_EDEFAULT.equals(concurrency);
			case XcorePackage.ELEMENT__CORRESPONDING_PACKAGE:
				return correspondingPackage != null;
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
		result.append(", Author: ");
		result.append(author);
		result.append(", Classifier_guid: ");
		result.append(classifier_guid);
		result.append(", Complexity: ");
		result.append(complexity);
		result.append(", CreatedDate: ");
		result.append(createdDate);
		result.append(", ElementGUID: ");
		result.append(elementGUID);
		result.append(", ElementID: ");
		result.append(elementID);
		result.append(", EventFlags: ");
		result.append(eventFlags);
		result.append(", GenFile: ");
		result.append(genFile);
		result.append(", Genlinks: ");
		result.append(genlinks);
		result.append(", GenType: ");
		result.append(genType);
		result.append(", IsActive: ");
		result.append(isActive);
		result.append(", IsLeaf: ");
		result.append(isLeaf);
		result.append(", IsSpec: ");
		result.append(isSpec);
		result.append(", ModifiedDate: ");
		result.append(modifiedDate);
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
		result.append(", RunState: ");
		result.append(runState);
		result.append(", Status: ");
		result.append(status);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", TreePos: ");
		result.append(treePos);
		result.append(", Type: ");
		result.append(type);
		result.append(", Version: ");
		result.append(version);
		result.append(", Visibility: ");
		result.append(visibility);
		result.append(", Style: ");
		result.append(style);
		result.append(", Backcolor: ");
		result.append(backcolor);
		result.append(", BorderStyle: ");
		result.append(borderStyle);
		result.append(", BorderWidth: ");
		result.append(borderWidth);
		result.append(", Fontcolor: ");
		result.append(fontcolor);
		result.append(", Bordercolor: ");
		result.append(bordercolor);
		result.append(", Cardinality: ");
		result.append(cardinality);
		result.append(", Concurrency: ");
		result.append(concurrency);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
