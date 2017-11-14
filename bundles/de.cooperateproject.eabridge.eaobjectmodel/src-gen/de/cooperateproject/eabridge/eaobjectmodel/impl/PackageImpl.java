/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;

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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getPackageGUID <em>Package GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getBatchLoad <em>Batch Load</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getBatchSave <em>Batch Save</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getCodePath <em>Code Path</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getIsControlled <em>Is Controlled</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getIsNamespace <em>Is Namespace</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getLastLoadDate <em>Last Load Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getLastSaveDate <em>Last Save Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getLogXML <em>Log XML</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getPackageID <em>Package ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getTreePos <em>Tree Pos</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getUMLVersion <em>UML Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getUseDTD <em>Use DTD</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getXMLPath <em>XML Path</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements de.cooperateproject.eabridge.eaobjectmodel.Package {
	/**
     * The default value of the '{@link #getPackageGUID() <em>Package GUID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackageGUID()
     * @generated
     * @ordered
     */
	protected static final String PACKAGE_GUID_EDEFAULT = null;
	/**
     * The default value of the '{@link #getBatchLoad() <em>Batch Load</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchLoad()
     * @generated
     * @ordered
     */
	protected static final Long BATCH_LOAD_EDEFAULT = null;
	/**
     * The default value of the '{@link #getBatchSave() <em>Batch Save</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBatchSave()
     * @generated
     * @ordered
     */
	protected static final Long BATCH_SAVE_EDEFAULT = null;
	/**
     * The default value of the '{@link #getCodePath() <em>Code Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCodePath()
     * @generated
     * @ordered
     */
	protected static final String CODE_PATH_EDEFAULT = null;
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
     * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFlags()
     * @generated
     * @ordered
     */
	protected static final String FLAGS_EDEFAULT = null;
	/**
     * The default value of the '{@link #getIsControlled() <em>Is Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIsControlled()
     * @generated
     * @ordered
     */
	protected static final Boolean IS_CONTROLLED_EDEFAULT = null;
	/**
     * The default value of the '{@link #getIsNamespace() <em>Is Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIsNamespace()
     * @generated
     * @ordered
     */
	protected static final Boolean IS_NAMESPACE_EDEFAULT = null;
	/**
     * The default value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIsProtected()
     * @generated
     * @ordered
     */
	protected static final Boolean IS_PROTECTED_EDEFAULT = null;
	/**
     * The default value of the '{@link #getLastLoadDate() <em>Last Load Date</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLastLoadDate()
     * @generated
     * @ordered
     */
	protected static final Date LAST_LOAD_DATE_EDEFAULT = null;
	/**
     * The default value of the '{@link #getLastSaveDate() <em>Last Save Date</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLastSaveDate()
     * @generated
     * @ordered
     */
	protected static final Date LAST_SAVE_DATE_EDEFAULT = null;
	/**
     * The default value of the '{@link #getLogXML() <em>Log XML</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogXML()
     * @generated
     * @ordered
     */
	protected static final Boolean LOG_XML_EDEFAULT = null;
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
     * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
	protected static final String OWNER_EDEFAULT = null;
	/**
     * The default value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackageID()
     * @generated
     * @ordered
     */
	protected static final Long PACKAGE_ID_EDEFAULT = null;
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
     * The default value of the '{@link #getUMLVersion() <em>UML Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUMLVersion()
     * @generated
     * @ordered
     */
	protected static final String UML_VERSION_EDEFAULT = null;
	/**
     * The default value of the '{@link #getUseDTD() <em>Use DTD</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUseDTD()
     * @generated
     * @ordered
     */
	protected static final Boolean USE_DTD_EDEFAULT = null;
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
     * The default value of the '{@link #getXMLPath() <em>XML Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXMLPath()
     * @generated
     * @ordered
     */
	protected static final String XML_PATH_EDEFAULT = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PackageImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return EaobjectmodelPackage.Literals.PACKAGE;
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
	public String getPackageGUID() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__PACKAGE_GUID, EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_GUID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPackageGUID(String newPackageGUID) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__PACKAGE_GUID, EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_GUID, newPackageGUID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getBatchLoad() {
        return (Long)eDynamicGet(EaobjectmodelPackage.PACKAGE__BATCH_LOAD, EaobjectmodelPackage.Literals.PACKAGE__BATCH_LOAD, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBatchLoad(Long newBatchLoad) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__BATCH_LOAD, EaobjectmodelPackage.Literals.PACKAGE__BATCH_LOAD, newBatchLoad);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getBatchSave() {
        return (Long)eDynamicGet(EaobjectmodelPackage.PACKAGE__BATCH_SAVE, EaobjectmodelPackage.Literals.PACKAGE__BATCH_SAVE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBatchSave(Long newBatchSave) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__BATCH_SAVE, EaobjectmodelPackage.Literals.PACKAGE__BATCH_SAVE, newBatchSave);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCodePath() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__CODE_PATH, EaobjectmodelPackage.Literals.PACKAGE__CODE_PATH, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCodePath(String newCodePath) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__CODE_PATH, EaobjectmodelPackage.Literals.PACKAGE__CODE_PATH, newCodePath);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getCreatedDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.PACKAGE__CREATED_DATE, EaobjectmodelPackage.Literals.PACKAGE__CREATED_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCreatedDate(Date newCreatedDate) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__CREATED_DATE, EaobjectmodelPackage.Literals.PACKAGE__CREATED_DATE, newCreatedDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFlags() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__FLAGS, EaobjectmodelPackage.Literals.PACKAGE__FLAGS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFlags(String newFlags) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__FLAGS, EaobjectmodelPackage.Literals.PACKAGE__FLAGS, newFlags);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsControlled() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.PACKAGE__IS_CONTROLLED, EaobjectmodelPackage.Literals.PACKAGE__IS_CONTROLLED, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsControlled(Boolean newIsControlled) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__IS_CONTROLLED, EaobjectmodelPackage.Literals.PACKAGE__IS_CONTROLLED, newIsControlled);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsNamespace() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.PACKAGE__IS_NAMESPACE, EaobjectmodelPackage.Literals.PACKAGE__IS_NAMESPACE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsNamespace(Boolean newIsNamespace) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__IS_NAMESPACE, EaobjectmodelPackage.Literals.PACKAGE__IS_NAMESPACE, newIsNamespace);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getIsProtected() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.PACKAGE__IS_PROTECTED, EaobjectmodelPackage.Literals.PACKAGE__IS_PROTECTED, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsProtected(Boolean newIsProtected) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__IS_PROTECTED, EaobjectmodelPackage.Literals.PACKAGE__IS_PROTECTED, newIsProtected);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getLastLoadDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE, EaobjectmodelPackage.Literals.PACKAGE__LAST_LOAD_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLastLoadDate(Date newLastLoadDate) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE, EaobjectmodelPackage.Literals.PACKAGE__LAST_LOAD_DATE, newLastLoadDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getLastSaveDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE, EaobjectmodelPackage.Literals.PACKAGE__LAST_SAVE_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLastSaveDate(Date newLastSaveDate) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE, EaobjectmodelPackage.Literals.PACKAGE__LAST_SAVE_DATE, newLastSaveDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getLogXML() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.PACKAGE__LOG_XML, EaobjectmodelPackage.Literals.PACKAGE__LOG_XML, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLogXML(Boolean newLogXML) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__LOG_XML, EaobjectmodelPackage.Literals.PACKAGE__LOG_XML, newLogXML);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getModifiedDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.PACKAGE__MODIFIED_DATE, EaobjectmodelPackage.Literals.PACKAGE__MODIFIED_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModifiedDate(Date newModifiedDate) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__MODIFIED_DATE, EaobjectmodelPackage.Literals.PACKAGE__MODIFIED_DATE, newModifiedDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__NAME, EaobjectmodelPackage.Literals.PACKAGE__NAME, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__NAME, EaobjectmodelPackage.Literals.PACKAGE__NAME, newName);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getNotes() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__NOTES, EaobjectmodelPackage.Literals.PACKAGE__NOTES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNotes(String newNotes) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__NOTES, EaobjectmodelPackage.Literals.PACKAGE__NOTES, newNotes);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOwner() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__OWNER, EaobjectmodelPackage.Literals.PACKAGE__OWNER, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOwner(String newOwner) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__OWNER, EaobjectmodelPackage.Literals.PACKAGE__OWNER, newOwner);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getPackageID() {
        return (Long)eDynamicGet(EaobjectmodelPackage.PACKAGE__PACKAGE_ID, EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_ID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPackageID(Long newPackageID) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__PACKAGE_ID, EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_ID, newPackageID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getTreePos() {
        return (Long)eDynamicGet(EaobjectmodelPackage.PACKAGE__TREE_POS, EaobjectmodelPackage.Literals.PACKAGE__TREE_POS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTreePos(Long newTreePos) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__TREE_POS, EaobjectmodelPackage.Literals.PACKAGE__TREE_POS, newTreePos);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUMLVersion() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__UML_VERSION, EaobjectmodelPackage.Literals.PACKAGE__UML_VERSION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUMLVersion(String newUMLVersion) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__UML_VERSION, EaobjectmodelPackage.Literals.PACKAGE__UML_VERSION, newUMLVersion);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getUseDTD() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.PACKAGE__USE_DTD, EaobjectmodelPackage.Literals.PACKAGE__USE_DTD, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUseDTD(Boolean newUseDTD) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__USE_DTD, EaobjectmodelPackage.Literals.PACKAGE__USE_DTD, newUseDTD);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getVersion() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__VERSION, EaobjectmodelPackage.Literals.PACKAGE__VERSION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVersion(String newVersion) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__VERSION, EaobjectmodelPackage.Literals.PACKAGE__VERSION, newVersion);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getXMLPath() {
        return (String)eDynamicGet(EaobjectmodelPackage.PACKAGE__XML_PATH, EaobjectmodelPackage.Literals.PACKAGE__XML_PATH, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXMLPath(String newXMLPath) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__XML_PATH, EaobjectmodelPackage.Literals.PACKAGE__XML_PATH, newXMLPath);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<de.cooperateproject.eabridge.eaobjectmodel.Package> getPackages() {
        return (EList<de.cooperateproject.eabridge.eaobjectmodel.Package>)eDynamicGet(EaobjectmodelPackage.PACKAGE__PACKAGES, EaobjectmodelPackage.Literals.PACKAGE__PACKAGES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Diagram> getDiagrams() {
        return (EList<Diagram>)eDynamicGet(EaobjectmodelPackage.PACKAGE__DIAGRAMS, EaobjectmodelPackage.Literals.PACKAGE__DIAGRAMS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Element> getElements() {
        return (EList<Element>)eDynamicGet(EaobjectmodelPackage.PACKAGE__ELEMENTS, EaobjectmodelPackage.Literals.PACKAGE__ELEMENTS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getParent() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.PACKAGE__PARENT, EaobjectmodelPackage.Literals.PACKAGE__PARENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package basicGetParent() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.PACKAGE__PARENT, EaobjectmodelPackage.Literals.PACKAGE__PARENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParent(de.cooperateproject.eabridge.eaobjectmodel.Package newParent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParent, EaobjectmodelPackage.PACKAGE__PARENT, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParent(de.cooperateproject.eabridge.eaobjectmodel.Package newParent) {
        eDynamicSet(EaobjectmodelPackage.PACKAGE__PARENT, EaobjectmodelPackage.Literals.PACKAGE__PARENT, newParent);
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
            case EaobjectmodelPackage.PACKAGE__PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
            case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
            case EaobjectmodelPackage.PACKAGE__ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
            case EaobjectmodelPackage.PACKAGE__PARENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParent((de.cooperateproject.eabridge.eaobjectmodel.Package)otherEnd, msgs);
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
            case EaobjectmodelPackage.PACKAGE__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
            case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
                return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
            case EaobjectmodelPackage.PACKAGE__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
            case EaobjectmodelPackage.PACKAGE__PARENT:
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
            case EaobjectmodelPackage.PACKAGE__PARENT:
                return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.PACKAGE__PACKAGES, de.cooperateproject.eabridge.eaobjectmodel.Package.class, msgs);
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
            case EaobjectmodelPackage.PACKAGE__PACKAGE_GUID:
                return getPackageGUID();
            case EaobjectmodelPackage.PACKAGE__BATCH_LOAD:
                return getBatchLoad();
            case EaobjectmodelPackage.PACKAGE__BATCH_SAVE:
                return getBatchSave();
            case EaobjectmodelPackage.PACKAGE__CODE_PATH:
                return getCodePath();
            case EaobjectmodelPackage.PACKAGE__CREATED_DATE:
                return getCreatedDate();
            case EaobjectmodelPackage.PACKAGE__FLAGS:
                return getFlags();
            case EaobjectmodelPackage.PACKAGE__IS_CONTROLLED:
                return getIsControlled();
            case EaobjectmodelPackage.PACKAGE__IS_NAMESPACE:
                return getIsNamespace();
            case EaobjectmodelPackage.PACKAGE__IS_PROTECTED:
                return getIsProtected();
            case EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE:
                return getLastLoadDate();
            case EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE:
                return getLastSaveDate();
            case EaobjectmodelPackage.PACKAGE__LOG_XML:
                return getLogXML();
            case EaobjectmodelPackage.PACKAGE__MODIFIED_DATE:
                return getModifiedDate();
            case EaobjectmodelPackage.PACKAGE__NAME:
                return getName();
            case EaobjectmodelPackage.PACKAGE__NOTES:
                return getNotes();
            case EaobjectmodelPackage.PACKAGE__OWNER:
                return getOwner();
            case EaobjectmodelPackage.PACKAGE__PACKAGE_ID:
                return getPackageID();
            case EaobjectmodelPackage.PACKAGE__TREE_POS:
                return getTreePos();
            case EaobjectmodelPackage.PACKAGE__UML_VERSION:
                return getUMLVersion();
            case EaobjectmodelPackage.PACKAGE__USE_DTD:
                return getUseDTD();
            case EaobjectmodelPackage.PACKAGE__VERSION:
                return getVersion();
            case EaobjectmodelPackage.PACKAGE__XML_PATH:
                return getXMLPath();
            case EaobjectmodelPackage.PACKAGE__PACKAGES:
                return getPackages();
            case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
                return getDiagrams();
            case EaobjectmodelPackage.PACKAGE__ELEMENTS:
                return getElements();
            case EaobjectmodelPackage.PACKAGE__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
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
            case EaobjectmodelPackage.PACKAGE__PACKAGE_GUID:
                setPackageGUID((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__BATCH_LOAD:
                setBatchLoad((Long)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__BATCH_SAVE:
                setBatchSave((Long)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__CODE_PATH:
                setCodePath((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__CREATED_DATE:
                setCreatedDate((Date)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__FLAGS:
                setFlags((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__IS_CONTROLLED:
                setIsControlled((Boolean)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__IS_NAMESPACE:
                setIsNamespace((Boolean)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__IS_PROTECTED:
                setIsProtected((Boolean)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE:
                setLastLoadDate((Date)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE:
                setLastSaveDate((Date)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__LOG_XML:
                setLogXML((Boolean)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__MODIFIED_DATE:
                setModifiedDate((Date)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__NAME:
                setName((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__NOTES:
                setNotes((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__OWNER:
                setOwner((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__PACKAGE_ID:
                setPackageID((Long)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__TREE_POS:
                setTreePos((Long)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__UML_VERSION:
                setUMLVersion((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__USE_DTD:
                setUseDTD((Boolean)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__VERSION:
                setVersion((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__XML_PATH:
                setXMLPath((String)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends de.cooperateproject.eabridge.eaobjectmodel.Package>)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
                getDiagrams().clear();
                getDiagrams().addAll((Collection<? extends Diagram>)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends Element>)newValue);
                return;
            case EaobjectmodelPackage.PACKAGE__PARENT:
                setParent((de.cooperateproject.eabridge.eaobjectmodel.Package)newValue);
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
            case EaobjectmodelPackage.PACKAGE__PACKAGE_GUID:
                setPackageGUID(PACKAGE_GUID_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__BATCH_LOAD:
                setBatchLoad(BATCH_LOAD_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__BATCH_SAVE:
                setBatchSave(BATCH_SAVE_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__CODE_PATH:
                setCodePath(CODE_PATH_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__CREATED_DATE:
                setCreatedDate(CREATED_DATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__FLAGS:
                setFlags(FLAGS_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__IS_CONTROLLED:
                setIsControlled(IS_CONTROLLED_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__IS_NAMESPACE:
                setIsNamespace(IS_NAMESPACE_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__IS_PROTECTED:
                setIsProtected(IS_PROTECTED_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE:
                setLastLoadDate(LAST_LOAD_DATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE:
                setLastSaveDate(LAST_SAVE_DATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__LOG_XML:
                setLogXML(LOG_XML_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__MODIFIED_DATE:
                setModifiedDate(MODIFIED_DATE_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__OWNER:
                setOwner(OWNER_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__PACKAGE_ID:
                setPackageID(PACKAGE_ID_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__TREE_POS:
                setTreePos(TREE_POS_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__UML_VERSION:
                setUMLVersion(UML_VERSION_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__USE_DTD:
                setUseDTD(USE_DTD_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__XML_PATH:
                setXMLPath(XML_PATH_EDEFAULT);
                return;
            case EaobjectmodelPackage.PACKAGE__PACKAGES:
                getPackages().clear();
                return;
            case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
                getDiagrams().clear();
                return;
            case EaobjectmodelPackage.PACKAGE__ELEMENTS:
                getElements().clear();
                return;
            case EaobjectmodelPackage.PACKAGE__PARENT:
                setParent((de.cooperateproject.eabridge.eaobjectmodel.Package)null);
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
            case EaobjectmodelPackage.PACKAGE__PACKAGE_GUID:
                return PACKAGE_GUID_EDEFAULT == null ? getPackageGUID() != null : !PACKAGE_GUID_EDEFAULT.equals(getPackageGUID());
            case EaobjectmodelPackage.PACKAGE__BATCH_LOAD:
                return BATCH_LOAD_EDEFAULT == null ? getBatchLoad() != null : !BATCH_LOAD_EDEFAULT.equals(getBatchLoad());
            case EaobjectmodelPackage.PACKAGE__BATCH_SAVE:
                return BATCH_SAVE_EDEFAULT == null ? getBatchSave() != null : !BATCH_SAVE_EDEFAULT.equals(getBatchSave());
            case EaobjectmodelPackage.PACKAGE__CODE_PATH:
                return CODE_PATH_EDEFAULT == null ? getCodePath() != null : !CODE_PATH_EDEFAULT.equals(getCodePath());
            case EaobjectmodelPackage.PACKAGE__CREATED_DATE:
                return CREATED_DATE_EDEFAULT == null ? getCreatedDate() != null : !CREATED_DATE_EDEFAULT.equals(getCreatedDate());
            case EaobjectmodelPackage.PACKAGE__FLAGS:
                return FLAGS_EDEFAULT == null ? getFlags() != null : !FLAGS_EDEFAULT.equals(getFlags());
            case EaobjectmodelPackage.PACKAGE__IS_CONTROLLED:
                return IS_CONTROLLED_EDEFAULT == null ? getIsControlled() != null : !IS_CONTROLLED_EDEFAULT.equals(getIsControlled());
            case EaobjectmodelPackage.PACKAGE__IS_NAMESPACE:
                return IS_NAMESPACE_EDEFAULT == null ? getIsNamespace() != null : !IS_NAMESPACE_EDEFAULT.equals(getIsNamespace());
            case EaobjectmodelPackage.PACKAGE__IS_PROTECTED:
                return IS_PROTECTED_EDEFAULT == null ? getIsProtected() != null : !IS_PROTECTED_EDEFAULT.equals(getIsProtected());
            case EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE:
                return LAST_LOAD_DATE_EDEFAULT == null ? getLastLoadDate() != null : !LAST_LOAD_DATE_EDEFAULT.equals(getLastLoadDate());
            case EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE:
                return LAST_SAVE_DATE_EDEFAULT == null ? getLastSaveDate() != null : !LAST_SAVE_DATE_EDEFAULT.equals(getLastSaveDate());
            case EaobjectmodelPackage.PACKAGE__LOG_XML:
                return LOG_XML_EDEFAULT == null ? getLogXML() != null : !LOG_XML_EDEFAULT.equals(getLogXML());
            case EaobjectmodelPackage.PACKAGE__MODIFIED_DATE:
                return MODIFIED_DATE_EDEFAULT == null ? getModifiedDate() != null : !MODIFIED_DATE_EDEFAULT.equals(getModifiedDate());
            case EaobjectmodelPackage.PACKAGE__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case EaobjectmodelPackage.PACKAGE__NOTES:
                return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
            case EaobjectmodelPackage.PACKAGE__OWNER:
                return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
            case EaobjectmodelPackage.PACKAGE__PACKAGE_ID:
                return PACKAGE_ID_EDEFAULT == null ? getPackageID() != null : !PACKAGE_ID_EDEFAULT.equals(getPackageID());
            case EaobjectmodelPackage.PACKAGE__TREE_POS:
                return TREE_POS_EDEFAULT == null ? getTreePos() != null : !TREE_POS_EDEFAULT.equals(getTreePos());
            case EaobjectmodelPackage.PACKAGE__UML_VERSION:
                return UML_VERSION_EDEFAULT == null ? getUMLVersion() != null : !UML_VERSION_EDEFAULT.equals(getUMLVersion());
            case EaobjectmodelPackage.PACKAGE__USE_DTD:
                return USE_DTD_EDEFAULT == null ? getUseDTD() != null : !USE_DTD_EDEFAULT.equals(getUseDTD());
            case EaobjectmodelPackage.PACKAGE__VERSION:
                return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
            case EaobjectmodelPackage.PACKAGE__XML_PATH:
                return XML_PATH_EDEFAULT == null ? getXMLPath() != null : !XML_PATH_EDEFAULT.equals(getXMLPath());
            case EaobjectmodelPackage.PACKAGE__PACKAGES:
                return !getPackages().isEmpty();
            case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
                return !getDiagrams().isEmpty();
            case EaobjectmodelPackage.PACKAGE__ELEMENTS:
                return !getElements().isEmpty();
            case EaobjectmodelPackage.PACKAGE__PARENT:
                return basicGetParent() != null;
        }
        return super.eIsSet(featureID);
    }

} //PackageImpl
