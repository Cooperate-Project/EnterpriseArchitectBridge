/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;

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
	 * The cached value of the '{@link #getPackageGUID() <em>Package GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageGUID()
	 * @generated
	 * @ordered
	 */
	protected String packageGUID = PACKAGE_GUID_EDEFAULT;

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
	 * The cached value of the '{@link #getBatchLoad() <em>Batch Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchLoad()
	 * @generated
	 * @ordered
	 */
	protected Long batchLoad = BATCH_LOAD_EDEFAULT;

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
	 * The cached value of the '{@link #getBatchSave() <em>Batch Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSave()
	 * @generated
	 * @ordered
	 */
	protected Long batchSave = BATCH_SAVE_EDEFAULT;

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
	 * The cached value of the '{@link #getCodePath() <em>Code Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePath()
	 * @generated
	 * @ordered
	 */
	protected String codePath = CODE_PATH_EDEFAULT;

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
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected String flags = FLAGS_EDEFAULT;

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
	 * The cached value of the '{@link #getIsControlled() <em>Is Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsControlled()
	 * @generated
	 * @ordered
	 */
	protected Boolean isControlled = IS_CONTROLLED_EDEFAULT;

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
	 * The cached value of the '{@link #getIsNamespace() <em>Is Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNamespace()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNamespace = IS_NAMESPACE_EDEFAULT;

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
	 * The cached value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProtected()
	 * @generated
	 * @ordered
	 */
	protected Boolean isProtected = IS_PROTECTED_EDEFAULT;

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
	 * The cached value of the '{@link #getLastLoadDate() <em>Last Load Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoadDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastLoadDate = LAST_LOAD_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getLastSaveDate() <em>Last Save Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaveDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastSaveDate = LAST_SAVE_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getLogXML() <em>Log XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogXML()
	 * @generated
	 * @ordered
	 */
	protected Boolean logXML = LOG_XML_EDEFAULT;

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
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

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
	 * The cached value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected Long packageID = PACKAGE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getUMLVersion() <em>UML Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String UML_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUMLVersion() <em>UML Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLVersion()
	 * @generated
	 * @ordered
	 */
	protected String umlVersion = UML_VERSION_EDEFAULT;

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
	 * The cached value of the '{@link #getUseDTD() <em>Use DTD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDTD()
	 * @generated
	 * @ordered
	 */
	protected Boolean useDTD = USE_DTD_EDEFAULT;

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
	 * The default value of the '{@link #getXMLPath() <em>XML Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLPath()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXMLPath() <em>XML Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLPath()
	 * @generated
	 * @ordered
	 */
	protected String xmlPath = XML_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cooperateproject.eabridge.eaobjectmodel.Package> packages;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

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
	public String getPackageGUID() {
		return packageGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageGUID(String newPackageGUID) {
		String oldPackageGUID = packageGUID;
		packageGUID = newPackageGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__PACKAGE_GUID, oldPackageGUID, packageGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBatchLoad() {
		return batchLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchLoad(Long newBatchLoad) {
		Long oldBatchLoad = batchLoad;
		batchLoad = newBatchLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__BATCH_LOAD, oldBatchLoad, batchLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBatchSave() {
		return batchSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchSave(Long newBatchSave) {
		Long oldBatchSave = batchSave;
		batchSave = newBatchSave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__BATCH_SAVE, oldBatchSave, batchSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePath() {
		return codePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePath(String newCodePath) {
		String oldCodePath = codePath;
		codePath = newCodePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__CODE_PATH, oldCodePath, codePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(String newFlags) {
		String oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsControlled() {
		return isControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlled(Boolean newIsControlled) {
		Boolean oldIsControlled = isControlled;
		isControlled = newIsControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__IS_CONTROLLED, oldIsControlled, isControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNamespace() {
		return isNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNamespace(Boolean newIsNamespace) {
		Boolean oldIsNamespace = isNamespace;
		isNamespace = newIsNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__IS_NAMESPACE, oldIsNamespace, isNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsProtected() {
		return isProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(Boolean newIsProtected) {
		Boolean oldIsProtected = isProtected;
		isProtected = newIsProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__IS_PROTECTED, oldIsProtected, isProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastLoadDate() {
		return lastLoadDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLoadDate(Date newLastLoadDate) {
		Date oldLastLoadDate = lastLoadDate;
		lastLoadDate = newLastLoadDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE, oldLastLoadDate, lastLoadDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastSaveDate() {
		return lastSaveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSaveDate(Date newLastSaveDate) {
		Date oldLastSaveDate = lastSaveDate;
		lastSaveDate = newLastSaveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE, oldLastSaveDate, lastSaveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLogXML() {
		return logXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogXML(Boolean newLogXML) {
		Boolean oldLogXML = logXML;
		logXML = newLogXML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__LOG_XML, oldLogXML, logXML));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__MODIFIED_DATE, oldModifiedDate, modifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPackageID() {
		return packageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageID(Long newPackageID) {
		Long oldPackageID = packageID;
		packageID = newPackageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__PACKAGE_ID, oldPackageID, packageID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__TREE_POS, oldTreePos, treePos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUMLVersion() {
		return umlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLVersion(String newUMLVersion) {
		String oldUMLVersion = umlVersion;
		umlVersion = newUMLVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__UML_VERSION, oldUMLVersion, umlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseDTD() {
		return useDTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDTD(Boolean newUseDTD) {
		Boolean oldUseDTD = useDTD;
		useDTD = newUseDTD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__USE_DTD, oldUseDTD, useDTD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXMLPath() {
		return xmlPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLPath(String newXMLPath) {
		String oldXMLPath = xmlPath;
		xmlPath = newXMLPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__XML_PATH, oldXMLPath, xmlPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.cooperateproject.eabridge.eaobjectmodel.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<de.cooperateproject.eabridge.eaobjectmodel.Package>(de.cooperateproject.eabridge.eaobjectmodel.Package.class, this, EaobjectmodelPackage.PACKAGE__PACKAGES, EaobjectmodelPackage.PACKAGE__PARENT);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectContainmentWithInverseEList<Diagram>(Diagram.class, this, EaobjectmodelPackage.PACKAGE__DIAGRAMS, EaobjectmodelPackage.DIAGRAM__PACKAGE);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, EaobjectmodelPackage.PACKAGE__ELEMENTS, EaobjectmodelPackage.ELEMENT__PACKAGE);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getParent() {
		if (eContainerFeatureID() != EaobjectmodelPackage.PACKAGE__PARENT) return null;
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package basicGetParent() {
		if (eContainerFeatureID() != EaobjectmodelPackage.PACKAGE__PARENT) return null;
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eInternalContainer();
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
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EaobjectmodelPackage.PACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EaobjectmodelPackage.PACKAGE__PACKAGES, de.cooperateproject.eabridge.eaobjectmodel.Package.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.PACKAGE__PARENT, newParent, newParent));
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
				return PACKAGE_GUID_EDEFAULT == null ? packageGUID != null : !PACKAGE_GUID_EDEFAULT.equals(packageGUID);
			case EaobjectmodelPackage.PACKAGE__BATCH_LOAD:
				return BATCH_LOAD_EDEFAULT == null ? batchLoad != null : !BATCH_LOAD_EDEFAULT.equals(batchLoad);
			case EaobjectmodelPackage.PACKAGE__BATCH_SAVE:
				return BATCH_SAVE_EDEFAULT == null ? batchSave != null : !BATCH_SAVE_EDEFAULT.equals(batchSave);
			case EaobjectmodelPackage.PACKAGE__CODE_PATH:
				return CODE_PATH_EDEFAULT == null ? codePath != null : !CODE_PATH_EDEFAULT.equals(codePath);
			case EaobjectmodelPackage.PACKAGE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case EaobjectmodelPackage.PACKAGE__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case EaobjectmodelPackage.PACKAGE__IS_CONTROLLED:
				return IS_CONTROLLED_EDEFAULT == null ? isControlled != null : !IS_CONTROLLED_EDEFAULT.equals(isControlled);
			case EaobjectmodelPackage.PACKAGE__IS_NAMESPACE:
				return IS_NAMESPACE_EDEFAULT == null ? isNamespace != null : !IS_NAMESPACE_EDEFAULT.equals(isNamespace);
			case EaobjectmodelPackage.PACKAGE__IS_PROTECTED:
				return IS_PROTECTED_EDEFAULT == null ? isProtected != null : !IS_PROTECTED_EDEFAULT.equals(isProtected);
			case EaobjectmodelPackage.PACKAGE__LAST_LOAD_DATE:
				return LAST_LOAD_DATE_EDEFAULT == null ? lastLoadDate != null : !LAST_LOAD_DATE_EDEFAULT.equals(lastLoadDate);
			case EaobjectmodelPackage.PACKAGE__LAST_SAVE_DATE:
				return LAST_SAVE_DATE_EDEFAULT == null ? lastSaveDate != null : !LAST_SAVE_DATE_EDEFAULT.equals(lastSaveDate);
			case EaobjectmodelPackage.PACKAGE__LOG_XML:
				return LOG_XML_EDEFAULT == null ? logXML != null : !LOG_XML_EDEFAULT.equals(logXML);
			case EaobjectmodelPackage.PACKAGE__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
			case EaobjectmodelPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaobjectmodelPackage.PACKAGE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EaobjectmodelPackage.PACKAGE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case EaobjectmodelPackage.PACKAGE__PACKAGE_ID:
				return PACKAGE_ID_EDEFAULT == null ? packageID != null : !PACKAGE_ID_EDEFAULT.equals(packageID);
			case EaobjectmodelPackage.PACKAGE__TREE_POS:
				return TREE_POS_EDEFAULT == null ? treePos != null : !TREE_POS_EDEFAULT.equals(treePos);
			case EaobjectmodelPackage.PACKAGE__UML_VERSION:
				return UML_VERSION_EDEFAULT == null ? umlVersion != null : !UML_VERSION_EDEFAULT.equals(umlVersion);
			case EaobjectmodelPackage.PACKAGE__USE_DTD:
				return USE_DTD_EDEFAULT == null ? useDTD != null : !USE_DTD_EDEFAULT.equals(useDTD);
			case EaobjectmodelPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EaobjectmodelPackage.PACKAGE__XML_PATH:
				return XML_PATH_EDEFAULT == null ? xmlPath != null : !XML_PATH_EDEFAULT.equals(xmlPath);
			case EaobjectmodelPackage.PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case EaobjectmodelPackage.PACKAGE__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case EaobjectmodelPackage.PACKAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EaobjectmodelPackage.PACKAGE__PARENT:
				return basicGetParent() != null;
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
		result.append(" (PackageGUID: ");
		result.append(packageGUID);
		result.append(", BatchLoad: ");
		result.append(batchLoad);
		result.append(", BatchSave: ");
		result.append(batchSave);
		result.append(", CodePath: ");
		result.append(codePath);
		result.append(", CreatedDate: ");
		result.append(createdDate);
		result.append(", Flags: ");
		result.append(flags);
		result.append(", IsControlled: ");
		result.append(isControlled);
		result.append(", IsNamespace: ");
		result.append(isNamespace);
		result.append(", IsProtected: ");
		result.append(isProtected);
		result.append(", LastLoadDate: ");
		result.append(lastLoadDate);
		result.append(", LastSaveDate: ");
		result.append(lastSaveDate);
		result.append(", LogXML: ");
		result.append(logXML);
		result.append(", ModifiedDate: ");
		result.append(modifiedDate);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Owner: ");
		result.append(owner);
		result.append(", PackageID: ");
		result.append(packageID);
		result.append(", TreePos: ");
		result.append(treePos);
		result.append(", UMLVersion: ");
		result.append(umlVersion);
		result.append(", UseDTD: ");
		result.append(useDTD);
		result.append(", Version: ");
		result.append(version);
		result.append(", XMLPath: ");
		result.append(xmlPath);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
