/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.ElementType;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getActionFlags <em>Action Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getClassifier_guid <em>Classifier guid</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getElementGUID <em>Element GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getEventFlags <em>Event Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getGenFile <em>Gen File</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getGenType <em>Gen Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getRunState <em>Run State</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getTreePos <em>Tree Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getBackcolor <em>Backcolor</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getFontcolor <em>Fontcolor</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getBordercolor <em>Bordercolor</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getSourceRelations <em>Source Relations</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getPDATA1 <em>PDATA1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
	protected static final boolean ABSTRACT_EDEFAULT = false;
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
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
	protected static final String ALIAS_EDEFAULT = null;
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
     * The default value of the '{@link #getClassifier_guid() <em>Classifier guid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClassifier_guid()
     * @generated
     * @ordered
     */
	protected static final String CLASSIFIER_GUID_EDEFAULT = null;
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
     * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCreatedDate()
     * @generated
     * @ordered
     */
	protected static final Date CREATED_DATE_EDEFAULT = null;
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
     * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElementID()
     * @generated
     * @ordered
     */
	protected static final Long ELEMENT_ID_EDEFAULT = null;
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
     * The default value of the '{@link #getGenFile() <em>Gen File</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGenFile()
     * @generated
     * @ordered
     */
	protected static final String GEN_FILE_EDEFAULT = null;
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
     * The default value of the '{@link #getGenType() <em>Gen Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGenType()
     * @generated
     * @ordered
     */
	protected static final String GEN_TYPE_EDEFAULT = null;
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
     * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIsLeaf()
     * @generated
     * @ordered
     */
	protected static final Boolean IS_LEAF_EDEFAULT = null;
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
     * The default value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModifiedDate()
     * @generated
     * @ordered
     */
	protected static final Date MODIFIED_DATE_EDEFAULT = null;
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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;
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
     * The default value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPersistence()
     * @generated
     * @ordered
     */
	protected static final String PERSISTENCE_EDEFAULT = null;
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
     * The default value of the '{@link #getRunState() <em>Run State</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRunState()
     * @generated
     * @ordered
     */
	protected static final String RUN_STATE_EDEFAULT = null;
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
     * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
	protected static final String STEREOTYPE_EDEFAULT = null;
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
     * The default value of the '{@link #getTreePos() <em>Tree Pos</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTreePos()
     * @generated
     * @ordered
     */
	protected static final Long TREE_POS_EDEFAULT = null;
	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final ElementType TYPE_EDEFAULT = ElementType.CLASS;
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
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
	protected static final Scope VISIBILITY_EDEFAULT = Scope.PUBLIC;
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
     * The default value of the '{@link #getBackcolor() <em>Backcolor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBackcolor()
     * @generated
     * @ordered
     */
	protected static final int BACKCOLOR_EDEFAULT = 0;
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
     * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBorderWidth()
     * @generated
     * @ordered
     */
	protected static final int BORDER_WIDTH_EDEFAULT = 0;
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
     * The default value of the '{@link #getBordercolor() <em>Bordercolor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBordercolor()
     * @generated
     * @ordered
     */
	protected static final int BORDERCOLOR_EDEFAULT = 0;
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
     * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
	protected static final String CONCURRENCY_EDEFAULT = null;

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
        return EaobjectmodelPackage.Literals.ELEMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected int eStaticFeatureCount() {
        return 0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isAbstract() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.ELEMENT__ABSTRACT, EaobjectmodelPackage.Literals.ELEMENT__ABSTRACT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAbstract(boolean newAbstract) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__ABSTRACT, EaobjectmodelPackage.Literals.ELEMENT__ABSTRACT, newAbstract);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getActionFlags() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__ACTION_FLAGS, EaobjectmodelPackage.Literals.ELEMENT__ACTION_FLAGS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setActionFlags(String newActionFlags) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__ACTION_FLAGS, EaobjectmodelPackage.Literals.ELEMENT__ACTION_FLAGS, newActionFlags);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAlias() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__ALIAS, EaobjectmodelPackage.Literals.ELEMENT__ALIAS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAlias(String newAlias) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__ALIAS, EaobjectmodelPackage.Literals.ELEMENT__ALIAS, newAlias);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAttributes() {
        return (EList<Attribute>)eDynamicGet(EaobjectmodelPackage.ELEMENT__ATTRIBUTES, EaobjectmodelPackage.Literals.ELEMENT__ATTRIBUTES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAuthor() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__AUTHOR, EaobjectmodelPackage.Literals.ELEMENT__AUTHOR, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAuthor(String newAuthor) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__AUTHOR, EaobjectmodelPackage.Literals.ELEMENT__AUTHOR, newAuthor);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element getClassifier() {
        return (Element)eDynamicGet(EaobjectmodelPackage.ELEMENT__CLASSIFIER, EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element basicGetClassifier() {
        return (Element)eDynamicGet(EaobjectmodelPackage.ELEMENT__CLASSIFIER, EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClassifier(Element newClassifier) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__CLASSIFIER, EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER, newClassifier);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getClassifier_guid() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__CLASSIFIER_GUID, EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER_GUID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClassifier_guid(String newClassifier_guid) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__CLASSIFIER_GUID, EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER_GUID, newClassifier_guid);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getComplexity() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__COMPLEXITY, EaobjectmodelPackage.Literals.ELEMENT__COMPLEXITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComplexity(String newComplexity) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__COMPLEXITY, EaobjectmodelPackage.Literals.ELEMENT__COMPLEXITY, newComplexity);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getCreatedDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.ELEMENT__CREATED_DATE, EaobjectmodelPackage.Literals.ELEMENT__CREATED_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCreatedDate(Date newCreatedDate) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__CREATED_DATE, EaobjectmodelPackage.Literals.ELEMENT__CREATED_DATE, newCreatedDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getElementGUID() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__ELEMENT_GUID, EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_GUID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setElementGUID(String newElementGUID) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__ELEMENT_GUID, EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_GUID, newElementGUID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getElementID() {
        return (Long)eDynamicGet(EaobjectmodelPackage.ELEMENT__ELEMENT_ID, EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_ID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setElementID(Long newElementID) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__ELEMENT_ID, EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_ID, newElementID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Element> getElements() {
        return (EList<Element>)eDynamicGet(EaobjectmodelPackage.ELEMENT__ELEMENTS, EaobjectmodelPackage.Literals.ELEMENT__ELEMENTS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getEventFlags() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__EVENT_FLAGS, EaobjectmodelPackage.Literals.ELEMENT__EVENT_FLAGS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEventFlags(String newEventFlags) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__EVENT_FLAGS, EaobjectmodelPackage.Literals.ELEMENT__EVENT_FLAGS, newEventFlags);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getGenFile() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__GEN_FILE, EaobjectmodelPackage.Literals.ELEMENT__GEN_FILE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGenFile(String newGenFile) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__GEN_FILE, EaobjectmodelPackage.Literals.ELEMENT__GEN_FILE, newGenFile);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getGenlinks() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__GENLINKS, EaobjectmodelPackage.Literals.ELEMENT__GENLINKS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGenlinks(String newGenlinks) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__GENLINKS, EaobjectmodelPackage.Literals.ELEMENT__GENLINKS, newGenlinks);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getGenType() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__GEN_TYPE, EaobjectmodelPackage.Literals.ELEMENT__GEN_TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGenType(String newGenType) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__GEN_TYPE, EaobjectmodelPackage.Literals.ELEMENT__GEN_TYPE, newGenType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsActive() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.ELEMENT__IS_ACTIVE, EaobjectmodelPackage.Literals.ELEMENT__IS_ACTIVE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsActive(Boolean newIsActive) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__IS_ACTIVE, EaobjectmodelPackage.Literals.ELEMENT__IS_ACTIVE, newIsActive);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsLeaf() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.ELEMENT__IS_LEAF, EaobjectmodelPackage.Literals.ELEMENT__IS_LEAF, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsLeaf(Boolean newIsLeaf) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__IS_LEAF, EaobjectmodelPackage.Literals.ELEMENT__IS_LEAF, newIsLeaf);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsSpec() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.ELEMENT__IS_SPEC, EaobjectmodelPackage.Literals.ELEMENT__IS_SPEC, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsSpec(Boolean newIsSpec) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__IS_SPEC, EaobjectmodelPackage.Literals.ELEMENT__IS_SPEC, newIsSpec);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Method> getMethods() {
        return (EList<Method>)eDynamicGet(EaobjectmodelPackage.ELEMENT__METHODS, EaobjectmodelPackage.Literals.ELEMENT__METHODS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getModifiedDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.ELEMENT__MODIFIED_DATE, EaobjectmodelPackage.Literals.ELEMENT__MODIFIED_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModifiedDate(Date newModifiedDate) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__MODIFIED_DATE, EaobjectmodelPackage.Literals.ELEMENT__MODIFIED_DATE, newModifiedDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMultiplicity() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__MULTIPLICITY, EaobjectmodelPackage.Literals.ELEMENT__MULTIPLICITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMultiplicity(String newMultiplicity) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__MULTIPLICITY, EaobjectmodelPackage.Literals.ELEMENT__MULTIPLICITY, newMultiplicity);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__NAME, EaobjectmodelPackage.Literals.ELEMENT__NAME, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__NAME, EaobjectmodelPackage.Literals.ELEMENT__NAME, newName);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getNotes() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__NOTES, EaobjectmodelPackage.Literals.ELEMENT__NOTES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNotes(String newNotes) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__NOTES, EaobjectmodelPackage.Literals.ELEMENT__NOTES, newNotes);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getPackage() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.ELEMENT__PACKAGE, EaobjectmodelPackage.Literals.ELEMENT__PACKAGE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package basicGetPackage() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.ELEMENT__PACKAGE, EaobjectmodelPackage.Literals.ELEMENT__PACKAGE, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPackage(de.cooperateproject.eabridge.eaobjectmodel.Package newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, EaobjectmodelPackage.ELEMENT__PACKAGE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPackage(de.cooperateproject.eabridge.eaobjectmodel.Package newPackage) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__PACKAGE, EaobjectmodelPackage.Literals.ELEMENT__PACKAGE, newPackage);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element getParent() {
        return (Element)eDynamicGet(EaobjectmodelPackage.ELEMENT__PARENT, EaobjectmodelPackage.Literals.ELEMENT__PARENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element basicGetParent() {
        return (Element)eDynamicGet(EaobjectmodelPackage.ELEMENT__PARENT, EaobjectmodelPackage.Literals.ELEMENT__PARENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParent, EaobjectmodelPackage.ELEMENT__PARENT, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParent(Element newParent) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__PARENT, EaobjectmodelPackage.Literals.ELEMENT__PARENT, newParent);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPersistence() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__PERSISTENCE, EaobjectmodelPackage.Literals.ELEMENT__PERSISTENCE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPersistence(String newPersistence) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__PERSISTENCE, EaobjectmodelPackage.Literals.ELEMENT__PERSISTENCE, newPersistence);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPhase() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__PHASE, EaobjectmodelPackage.Literals.ELEMENT__PHASE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPhase(String newPhase) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__PHASE, EaobjectmodelPackage.Literals.ELEMENT__PHASE, newPhase);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRunState() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__RUN_STATE, EaobjectmodelPackage.Literals.ELEMENT__RUN_STATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRunState(String newRunState) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__RUN_STATE, EaobjectmodelPackage.Literals.ELEMENT__RUN_STATE, newRunState);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStatus() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__STATUS, EaobjectmodelPackage.Literals.ELEMENT__STATUS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStatus(String newStatus) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__STATUS, EaobjectmodelPackage.Literals.ELEMENT__STATUS, newStatus);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStereotype() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__STEREOTYPE, EaobjectmodelPackage.Literals.ELEMENT__STEREOTYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStereotype(String newStereotype) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__STEREOTYPE, EaobjectmodelPackage.Literals.ELEMENT__STEREOTYPE, newStereotype);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStyleEx() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__STYLE_EX, EaobjectmodelPackage.Literals.ELEMENT__STYLE_EX, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStyleEx(String newStyleEx) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__STYLE_EX, EaobjectmodelPackage.Literals.ELEMENT__STYLE_EX, newStyleEx);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getTreePos() {
        return (Long)eDynamicGet(EaobjectmodelPackage.ELEMENT__TREE_POS, EaobjectmodelPackage.Literals.ELEMENT__TREE_POS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTreePos(Long newTreePos) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__TREE_POS, EaobjectmodelPackage.Literals.ELEMENT__TREE_POS, newTreePos);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ElementType getType() {
        return (ElementType)eDynamicGet(EaobjectmodelPackage.ELEMENT__TYPE, EaobjectmodelPackage.Literals.ELEMENT__TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(ElementType newType) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__TYPE, EaobjectmodelPackage.Literals.ELEMENT__TYPE, newType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getVersion() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__VERSION, EaobjectmodelPackage.Literals.ELEMENT__VERSION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVersion(String newVersion) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__VERSION, EaobjectmodelPackage.Literals.ELEMENT__VERSION, newVersion);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Scope getVisibility() {
        return (Scope)eDynamicGet(EaobjectmodelPackage.ELEMENT__VISIBILITY, EaobjectmodelPackage.Literals.ELEMENT__VISIBILITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVisibility(Scope newVisibility) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__VISIBILITY, EaobjectmodelPackage.Literals.ELEMENT__VISIBILITY, newVisibility);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStyle() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__STYLE, EaobjectmodelPackage.Literals.ELEMENT__STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStyle(String newStyle) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__STYLE, EaobjectmodelPackage.Literals.ELEMENT__STYLE, newStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBackcolor() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.ELEMENT__BACKCOLOR, EaobjectmodelPackage.Literals.ELEMENT__BACKCOLOR, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBackcolor(int newBackcolor) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__BACKCOLOR, EaobjectmodelPackage.Literals.ELEMENT__BACKCOLOR, newBackcolor);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBorderStyle() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.ELEMENT__BORDER_STYLE, EaobjectmodelPackage.Literals.ELEMENT__BORDER_STYLE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBorderStyle(int newBorderStyle) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__BORDER_STYLE, EaobjectmodelPackage.Literals.ELEMENT__BORDER_STYLE, newBorderStyle);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBorderWidth() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.ELEMENT__BORDER_WIDTH, EaobjectmodelPackage.Literals.ELEMENT__BORDER_WIDTH, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBorderWidth(int newBorderWidth) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__BORDER_WIDTH, EaobjectmodelPackage.Literals.ELEMENT__BORDER_WIDTH, newBorderWidth);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getFontcolor() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.ELEMENT__FONTCOLOR, EaobjectmodelPackage.Literals.ELEMENT__FONTCOLOR, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontcolor(int newFontcolor) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__FONTCOLOR, EaobjectmodelPackage.Literals.ELEMENT__FONTCOLOR, newFontcolor);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBordercolor() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.ELEMENT__BORDERCOLOR, EaobjectmodelPackage.Literals.ELEMENT__BORDERCOLOR, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBordercolor(int newBordercolor) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__BORDERCOLOR, EaobjectmodelPackage.Literals.ELEMENT__BORDERCOLOR, newBordercolor);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCardinality() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__CARDINALITY, EaobjectmodelPackage.Literals.ELEMENT__CARDINALITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCardinality(String newCardinality) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__CARDINALITY, EaobjectmodelPackage.Literals.ELEMENT__CARDINALITY, newCardinality);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getConcurrency() {
        return (String)eDynamicGet(EaobjectmodelPackage.ELEMENT__CONCURRENCY, EaobjectmodelPackage.Literals.ELEMENT__CONCURRENCY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConcurrency(String newConcurrency) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__CONCURRENCY, EaobjectmodelPackage.Literals.ELEMENT__CONCURRENCY, newConcurrency);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getPDATA1() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.ELEMENT__PDATA1, EaobjectmodelPackage.Literals.ELEMENT__PDATA1, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package basicGetPDATA1() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.ELEMENT__PDATA1, EaobjectmodelPackage.Literals.ELEMENT__PDATA1, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPDATA1(de.cooperateproject.eabridge.eaobjectmodel.Package newPDATA1) {
        eDynamicSet(EaobjectmodelPackage.ELEMENT__PDATA1, EaobjectmodelPackage.Literals.ELEMENT__PDATA1, newPDATA1);
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
            case EaobjectmodelPackage.ELEMENT__ATTRIBUTES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__METHODS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((de.cooperateproject.eabridge.eaobjectmodel.Package)otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__PARENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParent((Element)otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceRelations()).basicAdd(otherEnd, msgs);
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
            case EaobjectmodelPackage.ELEMENT__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__METHODS:
                return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                return basicSetPackage(null, msgs);
            case EaobjectmodelPackage.ELEMENT__PARENT:
                return basicSetParent(null, msgs);
            case EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS:
                return ((InternalEList<?>)getSourceRelations()).basicRemove(otherEnd, msgs);
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
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.PACKAGE__ELEMENTS, de.cooperateproject.eabridge.eaobjectmodel.Package.class, msgs);
            case EaobjectmodelPackage.ELEMENT__PARENT:
                return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.ELEMENT__ELEMENTS, Element.class, msgs);
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
            case EaobjectmodelPackage.ELEMENT__ABSTRACT:
                return isAbstract();
            case EaobjectmodelPackage.ELEMENT__ACTION_FLAGS:
                return getActionFlags();
            case EaobjectmodelPackage.ELEMENT__ALIAS:
                return getAlias();
            case EaobjectmodelPackage.ELEMENT__ATTRIBUTES:
                return getAttributes();
            case EaobjectmodelPackage.ELEMENT__AUTHOR:
                return getAuthor();
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER:
                if (resolve) return getClassifier();
                return basicGetClassifier();
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER_GUID:
                return getClassifier_guid();
            case EaobjectmodelPackage.ELEMENT__COMPLEXITY:
                return getComplexity();
            case EaobjectmodelPackage.ELEMENT__CREATED_DATE:
                return getCreatedDate();
            case EaobjectmodelPackage.ELEMENT__ELEMENT_GUID:
                return getElementGUID();
            case EaobjectmodelPackage.ELEMENT__ELEMENT_ID:
                return getElementID();
            case EaobjectmodelPackage.ELEMENT__ELEMENTS:
                return getElements();
            case EaobjectmodelPackage.ELEMENT__EVENT_FLAGS:
                return getEventFlags();
            case EaobjectmodelPackage.ELEMENT__GEN_FILE:
                return getGenFile();
            case EaobjectmodelPackage.ELEMENT__GENLINKS:
                return getGenlinks();
            case EaobjectmodelPackage.ELEMENT__GEN_TYPE:
                return getGenType();
            case EaobjectmodelPackage.ELEMENT__IS_ACTIVE:
                return getIsActive();
            case EaobjectmodelPackage.ELEMENT__IS_LEAF:
                return getIsLeaf();
            case EaobjectmodelPackage.ELEMENT__IS_SPEC:
                return getIsSpec();
            case EaobjectmodelPackage.ELEMENT__METHODS:
                return getMethods();
            case EaobjectmodelPackage.ELEMENT__MODIFIED_DATE:
                return getModifiedDate();
            case EaobjectmodelPackage.ELEMENT__MULTIPLICITY:
                return getMultiplicity();
            case EaobjectmodelPackage.ELEMENT__NAME:
                return getName();
            case EaobjectmodelPackage.ELEMENT__NOTES:
                return getNotes();
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                if (resolve) return getPackage();
                return basicGetPackage();
            case EaobjectmodelPackage.ELEMENT__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case EaobjectmodelPackage.ELEMENT__PERSISTENCE:
                return getPersistence();
            case EaobjectmodelPackage.ELEMENT__PHASE:
                return getPhase();
            case EaobjectmodelPackage.ELEMENT__RUN_STATE:
                return getRunState();
            case EaobjectmodelPackage.ELEMENT__STATUS:
                return getStatus();
            case EaobjectmodelPackage.ELEMENT__STEREOTYPE:
                return getStereotype();
            case EaobjectmodelPackage.ELEMENT__STYLE_EX:
                return getStyleEx();
            case EaobjectmodelPackage.ELEMENT__TREE_POS:
                return getTreePos();
            case EaobjectmodelPackage.ELEMENT__TYPE:
                return getType();
            case EaobjectmodelPackage.ELEMENT__VERSION:
                return getVersion();
            case EaobjectmodelPackage.ELEMENT__VISIBILITY:
                return getVisibility();
            case EaobjectmodelPackage.ELEMENT__STYLE:
                return getStyle();
            case EaobjectmodelPackage.ELEMENT__BACKCOLOR:
                return getBackcolor();
            case EaobjectmodelPackage.ELEMENT__BORDER_STYLE:
                return getBorderStyle();
            case EaobjectmodelPackage.ELEMENT__BORDER_WIDTH:
                return getBorderWidth();
            case EaobjectmodelPackage.ELEMENT__FONTCOLOR:
                return getFontcolor();
            case EaobjectmodelPackage.ELEMENT__BORDERCOLOR:
                return getBordercolor();
            case EaobjectmodelPackage.ELEMENT__CARDINALITY:
                return getCardinality();
            case EaobjectmodelPackage.ELEMENT__CONCURRENCY:
                return getConcurrency();
            case EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS:
                return getSourceRelations();
            case EaobjectmodelPackage.ELEMENT__PDATA1:
                if (resolve) return getPDATA1();
                return basicGetPDATA1();
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
            case EaobjectmodelPackage.ELEMENT__ABSTRACT:
                setAbstract((Boolean)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__ACTION_FLAGS:
                setActionFlags((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__ALIAS:
                setAlias((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__AUTHOR:
                setAuthor((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER:
                setClassifier((Element)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER_GUID:
                setClassifier_guid((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__COMPLEXITY:
                setComplexity((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__CREATED_DATE:
                setCreatedDate((Date)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__ELEMENT_GUID:
                setElementGUID((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__ELEMENT_ID:
                setElementID((Long)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends Element>)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__EVENT_FLAGS:
                setEventFlags((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__GEN_FILE:
                setGenFile((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__GENLINKS:
                setGenlinks((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__GEN_TYPE:
                setGenType((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__IS_ACTIVE:
                setIsActive((Boolean)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__IS_SPEC:
                setIsSpec((Boolean)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__METHODS:
                getMethods().clear();
                getMethods().addAll((Collection<? extends Method>)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__MODIFIED_DATE:
                setModifiedDate((Date)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__MULTIPLICITY:
                setMultiplicity((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__NAME:
                setName((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__NOTES:
                setNotes((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                setPackage((de.cooperateproject.eabridge.eaobjectmodel.Package)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__PARENT:
                setParent((Element)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__PERSISTENCE:
                setPersistence((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__PHASE:
                setPhase((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__RUN_STATE:
                setRunState((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__STATUS:
                setStatus((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__STEREOTYPE:
                setStereotype((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__STYLE_EX:
                setStyleEx((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__TREE_POS:
                setTreePos((Long)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__TYPE:
                setType((ElementType)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__VERSION:
                setVersion((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__VISIBILITY:
                setVisibility((Scope)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__STYLE:
                setStyle((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__BACKCOLOR:
                setBackcolor((Integer)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__BORDER_STYLE:
                setBorderStyle((Integer)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__BORDER_WIDTH:
                setBorderWidth((Integer)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__FONTCOLOR:
                setFontcolor((Integer)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__BORDERCOLOR:
                setBordercolor((Integer)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__CARDINALITY:
                setCardinality((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__CONCURRENCY:
                setConcurrency((String)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS:
                getSourceRelations().clear();
                getSourceRelations().addAll((Collection<? extends Connector>)newValue);
                return;
            case EaobjectmodelPackage.ELEMENT__PDATA1:
                setPDATA1((de.cooperateproject.eabridge.eaobjectmodel.Package)newValue);
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
            case EaobjectmodelPackage.ELEMENT__ABSTRACT:
                setAbstract(ABSTRACT_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__ACTION_FLAGS:
                setActionFlags(ACTION_FLAGS_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__ATTRIBUTES:
                getAttributes().clear();
                return;
            case EaobjectmodelPackage.ELEMENT__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER:
                setClassifier((Element)null);
                return;
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER_GUID:
                setClassifier_guid(CLASSIFIER_GUID_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__COMPLEXITY:
                setComplexity(COMPLEXITY_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__CREATED_DATE:
                setCreatedDate(CREATED_DATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__ELEMENT_GUID:
                setElementGUID(ELEMENT_GUID_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__ELEMENT_ID:
                setElementID(ELEMENT_ID_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__ELEMENTS:
                getElements().clear();
                return;
            case EaobjectmodelPackage.ELEMENT__EVENT_FLAGS:
                setEventFlags(EVENT_FLAGS_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__GEN_FILE:
                setGenFile(GEN_FILE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__GENLINKS:
                setGenlinks(GENLINKS_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__GEN_TYPE:
                setGenType(GEN_TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__IS_ACTIVE:
                setIsActive(IS_ACTIVE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__IS_SPEC:
                setIsSpec(IS_SPEC_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__METHODS:
                getMethods().clear();
                return;
            case EaobjectmodelPackage.ELEMENT__MODIFIED_DATE:
                setModifiedDate(MODIFIED_DATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__MULTIPLICITY:
                setMultiplicity(MULTIPLICITY_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                setPackage((de.cooperateproject.eabridge.eaobjectmodel.Package)null);
                return;
            case EaobjectmodelPackage.ELEMENT__PARENT:
                setParent((Element)null);
                return;
            case EaobjectmodelPackage.ELEMENT__PERSISTENCE:
                setPersistence(PERSISTENCE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__PHASE:
                setPhase(PHASE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__RUN_STATE:
                setRunState(RUN_STATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__STEREOTYPE:
                setStereotype(STEREOTYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__STYLE_EX:
                setStyleEx(STYLE_EX_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__TREE_POS:
                setTreePos(TREE_POS_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__VISIBILITY:
                setVisibility(VISIBILITY_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__BACKCOLOR:
                setBackcolor(BACKCOLOR_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__BORDER_STYLE:
                setBorderStyle(BORDER_STYLE_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__BORDER_WIDTH:
                setBorderWidth(BORDER_WIDTH_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__FONTCOLOR:
                setFontcolor(FONTCOLOR_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__BORDERCOLOR:
                setBordercolor(BORDERCOLOR_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__CARDINALITY:
                setCardinality(CARDINALITY_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__CONCURRENCY:
                setConcurrency(CONCURRENCY_EDEFAULT);
                return;
            case EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS:
                getSourceRelations().clear();
                return;
            case EaobjectmodelPackage.ELEMENT__PDATA1:
                setPDATA1((de.cooperateproject.eabridge.eaobjectmodel.Package)null);
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
            case EaobjectmodelPackage.ELEMENT__ABSTRACT:
                return isAbstract() != ABSTRACT_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__ACTION_FLAGS:
                return ACTION_FLAGS_EDEFAULT == null ? getActionFlags() != null : !ACTION_FLAGS_EDEFAULT.equals(getActionFlags());
            case EaobjectmodelPackage.ELEMENT__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case EaobjectmodelPackage.ELEMENT__ATTRIBUTES:
                return !getAttributes().isEmpty();
            case EaobjectmodelPackage.ELEMENT__AUTHOR:
                return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER:
                return basicGetClassifier() != null;
            case EaobjectmodelPackage.ELEMENT__CLASSIFIER_GUID:
                return CLASSIFIER_GUID_EDEFAULT == null ? getClassifier_guid() != null : !CLASSIFIER_GUID_EDEFAULT.equals(getClassifier_guid());
            case EaobjectmodelPackage.ELEMENT__COMPLEXITY:
                return COMPLEXITY_EDEFAULT == null ? getComplexity() != null : !COMPLEXITY_EDEFAULT.equals(getComplexity());
            case EaobjectmodelPackage.ELEMENT__CREATED_DATE:
                return CREATED_DATE_EDEFAULT == null ? getCreatedDate() != null : !CREATED_DATE_EDEFAULT.equals(getCreatedDate());
            case EaobjectmodelPackage.ELEMENT__ELEMENT_GUID:
                return ELEMENT_GUID_EDEFAULT == null ? getElementGUID() != null : !ELEMENT_GUID_EDEFAULT.equals(getElementGUID());
            case EaobjectmodelPackage.ELEMENT__ELEMENT_ID:
                return ELEMENT_ID_EDEFAULT == null ? getElementID() != null : !ELEMENT_ID_EDEFAULT.equals(getElementID());
            case EaobjectmodelPackage.ELEMENT__ELEMENTS:
                return !getElements().isEmpty();
            case EaobjectmodelPackage.ELEMENT__EVENT_FLAGS:
                return EVENT_FLAGS_EDEFAULT == null ? getEventFlags() != null : !EVENT_FLAGS_EDEFAULT.equals(getEventFlags());
            case EaobjectmodelPackage.ELEMENT__GEN_FILE:
                return GEN_FILE_EDEFAULT == null ? getGenFile() != null : !GEN_FILE_EDEFAULT.equals(getGenFile());
            case EaobjectmodelPackage.ELEMENT__GENLINKS:
                return GENLINKS_EDEFAULT == null ? getGenlinks() != null : !GENLINKS_EDEFAULT.equals(getGenlinks());
            case EaobjectmodelPackage.ELEMENT__GEN_TYPE:
                return GEN_TYPE_EDEFAULT == null ? getGenType() != null : !GEN_TYPE_EDEFAULT.equals(getGenType());
            case EaobjectmodelPackage.ELEMENT__IS_ACTIVE:
                return IS_ACTIVE_EDEFAULT == null ? getIsActive() != null : !IS_ACTIVE_EDEFAULT.equals(getIsActive());
            case EaobjectmodelPackage.ELEMENT__IS_LEAF:
                return IS_LEAF_EDEFAULT == null ? getIsLeaf() != null : !IS_LEAF_EDEFAULT.equals(getIsLeaf());
            case EaobjectmodelPackage.ELEMENT__IS_SPEC:
                return IS_SPEC_EDEFAULT == null ? getIsSpec() != null : !IS_SPEC_EDEFAULT.equals(getIsSpec());
            case EaobjectmodelPackage.ELEMENT__METHODS:
                return !getMethods().isEmpty();
            case EaobjectmodelPackage.ELEMENT__MODIFIED_DATE:
                return MODIFIED_DATE_EDEFAULT == null ? getModifiedDate() != null : !MODIFIED_DATE_EDEFAULT.equals(getModifiedDate());
            case EaobjectmodelPackage.ELEMENT__MULTIPLICITY:
                return MULTIPLICITY_EDEFAULT == null ? getMultiplicity() != null : !MULTIPLICITY_EDEFAULT.equals(getMultiplicity());
            case EaobjectmodelPackage.ELEMENT__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case EaobjectmodelPackage.ELEMENT__NOTES:
                return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
            case EaobjectmodelPackage.ELEMENT__PACKAGE:
                return basicGetPackage() != null;
            case EaobjectmodelPackage.ELEMENT__PARENT:
                return basicGetParent() != null;
            case EaobjectmodelPackage.ELEMENT__PERSISTENCE:
                return PERSISTENCE_EDEFAULT == null ? getPersistence() != null : !PERSISTENCE_EDEFAULT.equals(getPersistence());
            case EaobjectmodelPackage.ELEMENT__PHASE:
                return PHASE_EDEFAULT == null ? getPhase() != null : !PHASE_EDEFAULT.equals(getPhase());
            case EaobjectmodelPackage.ELEMENT__RUN_STATE:
                return RUN_STATE_EDEFAULT == null ? getRunState() != null : !RUN_STATE_EDEFAULT.equals(getRunState());
            case EaobjectmodelPackage.ELEMENT__STATUS:
                return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
            case EaobjectmodelPackage.ELEMENT__STEREOTYPE:
                return STEREOTYPE_EDEFAULT == null ? getStereotype() != null : !STEREOTYPE_EDEFAULT.equals(getStereotype());
            case EaobjectmodelPackage.ELEMENT__STYLE_EX:
                return STYLE_EX_EDEFAULT == null ? getStyleEx() != null : !STYLE_EX_EDEFAULT.equals(getStyleEx());
            case EaobjectmodelPackage.ELEMENT__TREE_POS:
                return TREE_POS_EDEFAULT == null ? getTreePos() != null : !TREE_POS_EDEFAULT.equals(getTreePos());
            case EaobjectmodelPackage.ELEMENT__TYPE:
                return getType() != TYPE_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__VERSION:
                return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
            case EaobjectmodelPackage.ELEMENT__VISIBILITY:
                return getVisibility() != VISIBILITY_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__STYLE:
                return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
            case EaobjectmodelPackage.ELEMENT__BACKCOLOR:
                return getBackcolor() != BACKCOLOR_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__BORDER_STYLE:
                return getBorderStyle() != BORDER_STYLE_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__BORDER_WIDTH:
                return getBorderWidth() != BORDER_WIDTH_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__FONTCOLOR:
                return getFontcolor() != FONTCOLOR_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__BORDERCOLOR:
                return getBordercolor() != BORDERCOLOR_EDEFAULT;
            case EaobjectmodelPackage.ELEMENT__CARDINALITY:
                return CARDINALITY_EDEFAULT == null ? getCardinality() != null : !CARDINALITY_EDEFAULT.equals(getCardinality());
            case EaobjectmodelPackage.ELEMENT__CONCURRENCY:
                return CONCURRENCY_EDEFAULT == null ? getConcurrency() != null : !CONCURRENCY_EDEFAULT.equals(getConcurrency());
            case EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS:
                return !getSourceRelations().isEmpty();
            case EaobjectmodelPackage.ELEMENT__PDATA1:
                return basicGetPDATA1() != null;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Connector> getSourceRelations() {
        return (EList<Connector>)eDynamicGet(EaobjectmodelPackage.ELEMENT__SOURCE_RELATIONS, EaobjectmodelPackage.Literals.ELEMENT__SOURCE_RELATIONS, true, true);
    }

} //ElementImpl
