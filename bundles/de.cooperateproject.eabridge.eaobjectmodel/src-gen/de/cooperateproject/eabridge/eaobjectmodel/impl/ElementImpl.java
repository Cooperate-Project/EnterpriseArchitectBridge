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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getAbstract <em>Abstract</em>}</li>
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getPDATA1 <em>PDATA1</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl#getSourceRelations <em>Source Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	public String getAbstract() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__ACTION_FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFlags(String newActionFlags) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__ACTION_FLAGS, newActionFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)eGet(EaobjectmodelPackage.Literals.ELEMENT__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getClassifier() {
		return (Element)eGet(EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Element newClassifier) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER, newClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier_guid() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier_guid(String newClassifier_guid) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__CLASSIFIER_GUID, newClassifier_guid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplexity() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__COMPLEXITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexity(String newComplexity) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__COMPLEXITY, newComplexity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.ELEMENT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementGUID() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementGUID(String newElementGUID) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_GUID, newElementGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getElementID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(Long newElementID) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__ELEMENT_ID, newElementID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getElements() {
		return (EList<Element>)eGet(EaobjectmodelPackage.Literals.ELEMENT__ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__EVENT_FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventFlags(String newEventFlags) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__EVENT_FLAGS, newEventFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenFile() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__GEN_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFile(String newGenFile) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__GEN_FILE, newGenFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenlinks() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__GENLINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenlinks(String newGenlinks) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__GENLINKS, newGenlinks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenType() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__GEN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenType(String newGenType) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__GEN_TYPE, newGenType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsActive() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ELEMENT__IS_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(Boolean newIsActive) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__IS_ACTIVE, newIsActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ELEMENT__IS_LEAF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__IS_LEAF, newIsLeaf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSpec() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.ELEMENT__IS_SPEC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpec(Boolean newIsSpec) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__IS_SPEC, newIsSpec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Method> getMethods() {
		return (EList<Method>)eGet(EaobjectmodelPackage.Literals.ELEMENT__METHODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.ELEMENT__MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(Date newModifiedDate) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__MODIFIED_DATE, newModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__MULTIPLICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__MULTIPLICITY, newMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getPackage() {
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eGet(EaobjectmodelPackage.Literals.ELEMENT__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(de.cooperateproject.eabridge.eaobjectmodel.Package newPackage) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		return (Element)eGet(EaobjectmodelPackage.Literals.ELEMENT__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistence() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__PERSISTENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(String newPersistence) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__PERSISTENCE, newPersistence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__PHASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(String newPhase) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__PHASE, newPhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRunState() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__RUN_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunState(String newRunState) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__RUN_STATE, newRunState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__STYLE_EX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTreePos() {
		return (Long)eGet(EaobjectmodelPackage.Literals.ELEMENT__TREE_POS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreePos(Long newTreePos) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__TREE_POS, newTreePos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getType() {
		return (ElementType)eGet(EaobjectmodelPackage.Literals.ELEMENT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ElementType newType) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getVisibility() {
		return (Scope)eGet(EaobjectmodelPackage.Literals.ELEMENT__VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Scope newVisibility) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackcolor() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.ELEMENT__BACKCOLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackcolor(int newBackcolor) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__BACKCOLOR, newBackcolor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderStyle() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.ELEMENT__BORDER_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderStyle(int newBorderStyle) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__BORDER_STYLE, newBorderStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderWidth() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.ELEMENT__BORDER_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderWidth(int newBorderWidth) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__BORDER_WIDTH, newBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontcolor() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.ELEMENT__FONTCOLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontcolor(int newFontcolor) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__FONTCOLOR, newFontcolor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBordercolor() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.ELEMENT__BORDERCOLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBordercolor(int newBordercolor) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__BORDERCOLOR, newBordercolor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__CONCURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__CONCURRENCY, newConcurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPDATA1() {
		return (String)eGet(EaobjectmodelPackage.Literals.ELEMENT__PDATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDATA1(String newPDATA1) {
		eSet(EaobjectmodelPackage.Literals.ELEMENT__PDATA1, newPDATA1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connector> getSourceRelations() {
		return (EList<Connector>)eGet(EaobjectmodelPackage.Literals.ELEMENT__SOURCE_RELATIONS, true);
	}

} //ElementImpl
