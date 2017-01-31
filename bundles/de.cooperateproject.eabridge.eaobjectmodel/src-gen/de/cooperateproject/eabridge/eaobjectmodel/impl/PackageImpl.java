/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageGUID(String newPackageGUID) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_GUID, newPackageGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBatchLoad() {
		return (Long)eGet(EaobjectmodelPackage.Literals.PACKAGE__BATCH_LOAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchLoad(Long newBatchLoad) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__BATCH_LOAD, newBatchLoad);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBatchSave() {
		return (Long)eGet(EaobjectmodelPackage.Literals.PACKAGE__BATCH_SAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchSave(Long newBatchSave) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__BATCH_SAVE, newBatchSave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePath() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__CODE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePath(String newCodePath) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__CODE_PATH, newCodePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.PACKAGE__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlags() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__FLAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(String newFlags) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__FLAGS, newFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsControlled() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.PACKAGE__IS_CONTROLLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlled(Boolean newIsControlled) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__IS_CONTROLLED, newIsControlled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNamespace() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.PACKAGE__IS_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNamespace(Boolean newIsNamespace) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__IS_NAMESPACE, newIsNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsProtected() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.PACKAGE__IS_PROTECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(Boolean newIsProtected) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__IS_PROTECTED, newIsProtected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastLoadDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.PACKAGE__LAST_LOAD_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLoadDate(Date newLastLoadDate) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__LAST_LOAD_DATE, newLastLoadDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastSaveDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.PACKAGE__LAST_SAVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSaveDate(Date newLastSaveDate) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__LAST_SAVE_DATE, newLastSaveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLogXML() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.PACKAGE__LOG_XML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogXML(Boolean newLogXML) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__LOG_XML, newLogXML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.PACKAGE__MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(Date newModifiedDate) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__MODIFIED_DATE, newModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPackageID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageID(Long newPackageID) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__PACKAGE_ID, newPackageID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTreePos() {
		return (Long)eGet(EaobjectmodelPackage.Literals.PACKAGE__TREE_POS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreePos(Long newTreePos) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__TREE_POS, newTreePos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUMLVersion() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__UML_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLVersion(String newUMLVersion) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__UML_VERSION, newUMLVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseDTD() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.PACKAGE__USE_DTD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDTD(Boolean newUseDTD) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__USE_DTD, newUseDTD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXMLPath() {
		return (String)eGet(EaobjectmodelPackage.Literals.PACKAGE__XML_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLPath(String newXMLPath) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__XML_PATH, newXMLPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<de.cooperateproject.eabridge.eaobjectmodel.Package> getPackages() {
		return (EList<de.cooperateproject.eabridge.eaobjectmodel.Package>)eGet(EaobjectmodelPackage.Literals.PACKAGE__PACKAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Diagram> getDiagrams() {
		return (EList<Diagram>)eGet(EaobjectmodelPackage.Literals.PACKAGE__DIAGRAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getElements() {
		return (EList<Element>)eGet(EaobjectmodelPackage.Literals.PACKAGE__ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getParent() {
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eGet(EaobjectmodelPackage.Literals.PACKAGE__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(de.cooperateproject.eabridge.eaobjectmodel.Package newParent) {
		eSet(EaobjectmodelPackage.Literals.PACKAGE__PARENT, newParent);
	}

} //PackageImpl
