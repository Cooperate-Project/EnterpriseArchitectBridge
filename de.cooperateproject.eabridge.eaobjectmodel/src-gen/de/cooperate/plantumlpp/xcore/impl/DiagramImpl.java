/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Diagram;
import de.cooperate.plantumlpp.xcore.DiagramLink;
import de.cooperate.plantumlpp.xcore.DiagrammObject;
import de.cooperate.plantumlpp.xcore.XcorePackage;

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
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getDiagramID <em>Diagram ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getDiagramLinks <em>Diagram Links</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getExtendedStyle <em>Extended Style</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getHighlightImports <em>Highlight Imports</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getShowDetails <em>Show Details</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getShowPackageContents <em>Show Package Contents</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getShowPrivate <em>Show Private</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getShowProtected <em>Show Protected</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getShowPublic <em>Show Public</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
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
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final Long CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected Long cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final Long CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected Long cy = CY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramID() <em>Diagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramID()
	 * @generated
	 * @ordered
	 */
	protected static final Long DIAGRAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramID() <em>Diagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramID()
	 * @generated
	 * @ordered
	 */
	protected Long diagramID = DIAGRAM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiagramLinks() <em>Diagram Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramLink> diagramLinks;

	/**
	 * The cached value of the '{@link #getDiagramObjects() <em>Diagram Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagrammObject> diagramObjects;

	/**
	 * The default value of the '{@link #getExtendedStyle() <em>Extended Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedStyle() <em>Extended Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStyle()
	 * @generated
	 * @ordered
	 */
	protected String extendedStyle = EXTENDED_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighlightImports() <em>Highlight Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlightImports()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HIGHLIGHT_IMPORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighlightImports() <em>Highlight Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlightImports()
	 * @generated
	 * @ordered
	 */
	protected Boolean highlightImports = HIGHLIGHT_IMPORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLocked = IS_LOCKED_EDEFAULT;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long PAGE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected Long pageHeight = PAGE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long PAGE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected Long pageWidth = PAGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected static final Long PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected Long parentID = PARENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Long scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowDetails() <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowDetails()
	 * @generated
	 * @ordered
	 */
	protected static final Long SHOW_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowDetails() <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowDetails()
	 * @generated
	 * @ordered
	 */
	protected Long showDetails = SHOW_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowPackageContents() <em>Show Package Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowPackageContents()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_PACKAGE_CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowPackageContents() <em>Show Package Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowPackageContents()
	 * @generated
	 * @ordered
	 */
	protected Boolean showPackageContents = SHOW_PACKAGE_CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowPrivate() <em>Show Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_PRIVATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowPrivate() <em>Show Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowPrivate()
	 * @generated
	 * @ordered
	 */
	protected Boolean showPrivate = SHOW_PRIVATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowProtected() <em>Show Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowProtected() <em>Show Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowProtected()
	 * @generated
	 * @ordered
	 */
	protected Boolean showProtected = SHOW_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowPublic() <em>Show Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowPublic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_PUBLIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowPublic() <em>Show Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowPublic()
	 * @generated
	 * @ordered
	 */
	protected Boolean showPublic = SHOW_PUBLIC_EDEFAULT;

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
	 * The default value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlanes()
	 * @generated
	 * @ordered
	 */
	protected static final String SWIMLANES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlanes()
	 * @generated
	 * @ordered
	 */
	protected String swimlanes = SWIMLANES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(Long newCx) {
		Long oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(Long newCy) {
		Long oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDiagramID() {
		return diagramID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramID(Long newDiagramID) {
		Long oldDiagramID = diagramID;
		diagramID = newDiagramID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__DIAGRAM_ID, oldDiagramID, diagramID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramLink> getDiagramLinks() {
		if (diagramLinks == null) {
			diagramLinks = new EObjectContainmentWithInverseEList<DiagramLink>(DiagramLink.class, this, XcorePackage.DIAGRAM__DIAGRAM_LINKS, XcorePackage.DIAGRAM_LINK__DIAGRAM);
		}
		return diagramLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagrammObject> getDiagramObjects() {
		if (diagramObjects == null) {
			diagramObjects = new EObjectContainmentWithInverseEList<DiagrammObject>(DiagrammObject.class, this, XcorePackage.DIAGRAM__DIAGRAM_OBJECTS, XcorePackage.DIAGRAMM_OBJECT__DIAGRAM);
		}
		return diagramObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedStyle() {
		return extendedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStyle(String newExtendedStyle) {
		String oldExtendedStyle = extendedStyle;
		extendedStyle = newExtendedStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__EXTENDED_STYLE, oldExtendedStyle, extendedStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHighlightImports() {
		return highlightImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighlightImports(Boolean newHighlightImports) {
		Boolean oldHighlightImports = highlightImports;
		highlightImports = newHighlightImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__HIGHLIGHT_IMPORTS, oldHighlightImports, highlightImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocked(Boolean newIsLocked) {
		Boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__IS_LOCKED, oldIsLocked, isLocked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__META_TYPE, oldMetaType, metaType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperate.plantumlpp.xcore.Package getPackage() {
		if (eContainerFeatureID() != XcorePackage.DIAGRAM__PACKAGE) return null;
		return (de.cooperate.plantumlpp.xcore.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperate.plantumlpp.xcore.Package basicGetPackage() {
		if (eContainerFeatureID() != XcorePackage.DIAGRAM__PACKAGE) return null;
		return (de.cooperate.plantumlpp.xcore.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(de.cooperate.plantumlpp.xcore.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, XcorePackage.DIAGRAM__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(de.cooperate.plantumlpp.xcore.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != XcorePackage.DIAGRAM__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, XcorePackage.PACKAGE__DIAGRAMS, de.cooperate.plantumlpp.xcore.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPageHeight() {
		return pageHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageHeight(Long newPageHeight) {
		Long oldPageHeight = pageHeight;
		pageHeight = newPageHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__PAGE_HEIGHT, oldPageHeight, pageHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPageWidth() {
		return pageWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageWidth(Long newPageWidth) {
		Long oldPageWidth = pageWidth;
		pageWidth = newPageWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__PAGE_WIDTH, oldPageWidth, pageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getParentID() {
		return parentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentID(Long newParentID) {
		Long oldParentID = parentID;
		parentID = newParentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__PARENT_ID, oldParentID, parentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Long newScale) {
		Long oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getShowDetails() {
		return showDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowDetails(Long newShowDetails) {
		Long oldShowDetails = showDetails;
		showDetails = newShowDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SHOW_DETAILS, oldShowDetails, showDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowPackageContents() {
		return showPackageContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowPackageContents(Boolean newShowPackageContents) {
		Boolean oldShowPackageContents = showPackageContents;
		showPackageContents = newShowPackageContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SHOW_PACKAGE_CONTENTS, oldShowPackageContents, showPackageContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowPrivate() {
		return showPrivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowPrivate(Boolean newShowPrivate) {
		Boolean oldShowPrivate = showPrivate;
		showPrivate = newShowPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SHOW_PRIVATE, oldShowPrivate, showPrivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowProtected() {
		return showProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowProtected(Boolean newShowProtected) {
		Boolean oldShowProtected = showProtected;
		showProtected = newShowProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SHOW_PROTECTED, oldShowProtected, showProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowPublic() {
		return showPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowPublic(Boolean newShowPublic) {
		Boolean oldShowPublic = showPublic;
		showPublic = newShowPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SHOW_PUBLIC, oldShowPublic, showPublic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__STYLE_EX, oldStyleEx, styleEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwimlanes() {
		return swimlanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwimlanes(String newSwimlanes) {
		String oldSwimlanes = swimlanes;
		swimlanes = newSwimlanes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__SWIMLANES, oldSwimlanes, swimlanes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM__VERSION, oldVersion, version));
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
			case XcorePackage.DIAGRAM__DIAGRAM_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramLinks()).basicAdd(otherEnd, msgs);
			case XcorePackage.DIAGRAM__DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjects()).basicAdd(otherEnd, msgs);
			case XcorePackage.DIAGRAM__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((de.cooperate.plantumlpp.xcore.Package)otherEnd, msgs);
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
			case XcorePackage.DIAGRAM__DIAGRAM_LINKS:
				return ((InternalEList<?>)getDiagramLinks()).basicRemove(otherEnd, msgs);
			case XcorePackage.DIAGRAM__DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getDiagramObjects()).basicRemove(otherEnd, msgs);
			case XcorePackage.DIAGRAM__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case XcorePackage.DIAGRAM__PACKAGE:
				return eInternalContainer().eInverseRemove(this, XcorePackage.PACKAGE__DIAGRAMS, de.cooperate.plantumlpp.xcore.Package.class, msgs);
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
			case XcorePackage.DIAGRAM__AUTHOR:
				return getAuthor();
			case XcorePackage.DIAGRAM__CREATED_DATE:
				return getCreatedDate();
			case XcorePackage.DIAGRAM__CX:
				return getCx();
			case XcorePackage.DIAGRAM__CY:
				return getCy();
			case XcorePackage.DIAGRAM__DIAGRAM_ID:
				return getDiagramID();
			case XcorePackage.DIAGRAM__DIAGRAM_LINKS:
				return getDiagramLinks();
			case XcorePackage.DIAGRAM__DIAGRAM_OBJECTS:
				return getDiagramObjects();
			case XcorePackage.DIAGRAM__EXTENDED_STYLE:
				return getExtendedStyle();
			case XcorePackage.DIAGRAM__HIGHLIGHT_IMPORTS:
				return getHighlightImports();
			case XcorePackage.DIAGRAM__IS_LOCKED:
				return getIsLocked();
			case XcorePackage.DIAGRAM__META_TYPE:
				return getMetaType();
			case XcorePackage.DIAGRAM__NAME:
				return getName();
			case XcorePackage.DIAGRAM__NOTES:
				return getNotes();
			case XcorePackage.DIAGRAM__ORIENTATION:
				return getOrientation();
			case XcorePackage.DIAGRAM__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case XcorePackage.DIAGRAM__PAGE_HEIGHT:
				return getPageHeight();
			case XcorePackage.DIAGRAM__PAGE_WIDTH:
				return getPageWidth();
			case XcorePackage.DIAGRAM__PARENT_ID:
				return getParentID();
			case XcorePackage.DIAGRAM__SCALE:
				return getScale();
			case XcorePackage.DIAGRAM__SHOW_DETAILS:
				return getShowDetails();
			case XcorePackage.DIAGRAM__SHOW_PACKAGE_CONTENTS:
				return getShowPackageContents();
			case XcorePackage.DIAGRAM__SHOW_PRIVATE:
				return getShowPrivate();
			case XcorePackage.DIAGRAM__SHOW_PROTECTED:
				return getShowProtected();
			case XcorePackage.DIAGRAM__SHOW_PUBLIC:
				return getShowPublic();
			case XcorePackage.DIAGRAM__STEREOTYPE:
				return getStereotype();
			case XcorePackage.DIAGRAM__STYLE_EX:
				return getStyleEx();
			case XcorePackage.DIAGRAM__SWIMLANES:
				return getSwimlanes();
			case XcorePackage.DIAGRAM__TYPE:
				return getType();
			case XcorePackage.DIAGRAM__VERSION:
				return getVersion();
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
			case XcorePackage.DIAGRAM__AUTHOR:
				setAuthor((String)newValue);
				return;
			case XcorePackage.DIAGRAM__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case XcorePackage.DIAGRAM__CX:
				setCx((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__CY:
				setCy((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__DIAGRAM_ID:
				setDiagramID((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				getDiagramLinks().addAll((Collection<? extends DiagramLink>)newValue);
				return;
			case XcorePackage.DIAGRAM__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				getDiagramObjects().addAll((Collection<? extends DiagrammObject>)newValue);
				return;
			case XcorePackage.DIAGRAM__EXTENDED_STYLE:
				setExtendedStyle((String)newValue);
				return;
			case XcorePackage.DIAGRAM__HIGHLIGHT_IMPORTS:
				setHighlightImports((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM__IS_LOCKED:
				setIsLocked((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM__META_TYPE:
				setMetaType((String)newValue);
				return;
			case XcorePackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case XcorePackage.DIAGRAM__NOTES:
				setNotes((String)newValue);
				return;
			case XcorePackage.DIAGRAM__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case XcorePackage.DIAGRAM__PACKAGE:
				setPackage((de.cooperate.plantumlpp.xcore.Package)newValue);
				return;
			case XcorePackage.DIAGRAM__PAGE_HEIGHT:
				setPageHeight((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__PAGE_WIDTH:
				setPageWidth((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__PARENT_ID:
				setParentID((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__SCALE:
				setScale((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__SHOW_DETAILS:
				setShowDetails((Long)newValue);
				return;
			case XcorePackage.DIAGRAM__SHOW_PACKAGE_CONTENTS:
				setShowPackageContents((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM__SHOW_PRIVATE:
				setShowPrivate((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM__SHOW_PROTECTED:
				setShowProtected((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM__SHOW_PUBLIC:
				setShowPublic((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XcorePackage.DIAGRAM__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case XcorePackage.DIAGRAM__SWIMLANES:
				setSwimlanes((String)newValue);
				return;
			case XcorePackage.DIAGRAM__TYPE:
				setType((String)newValue);
				return;
			case XcorePackage.DIAGRAM__VERSION:
				setVersion((String)newValue);
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
			case XcorePackage.DIAGRAM__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__CX:
				setCx(CX_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__CY:
				setCy(CY_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__DIAGRAM_ID:
				setDiagramID(DIAGRAM_ID_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				return;
			case XcorePackage.DIAGRAM__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				return;
			case XcorePackage.DIAGRAM__EXTENDED_STYLE:
				setExtendedStyle(EXTENDED_STYLE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__HIGHLIGHT_IMPORTS:
				setHighlightImports(HIGHLIGHT_IMPORTS_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__META_TYPE:
				setMetaType(META_TYPE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__PACKAGE:
				setPackage((de.cooperate.plantumlpp.xcore.Package)null);
				return;
			case XcorePackage.DIAGRAM__PAGE_HEIGHT:
				setPageHeight(PAGE_HEIGHT_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__PAGE_WIDTH:
				setPageWidth(PAGE_WIDTH_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__PARENT_ID:
				setParentID(PARENT_ID_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SHOW_DETAILS:
				setShowDetails(SHOW_DETAILS_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SHOW_PACKAGE_CONTENTS:
				setShowPackageContents(SHOW_PACKAGE_CONTENTS_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SHOW_PRIVATE:
				setShowPrivate(SHOW_PRIVATE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SHOW_PROTECTED:
				setShowProtected(SHOW_PROTECTED_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SHOW_PUBLIC:
				setShowPublic(SHOW_PUBLIC_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__SWIMLANES:
				setSwimlanes(SWIMLANES_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case XcorePackage.DIAGRAM__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case XcorePackage.DIAGRAM__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case XcorePackage.DIAGRAM__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case XcorePackage.DIAGRAM__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case XcorePackage.DIAGRAM__DIAGRAM_ID:
				return DIAGRAM_ID_EDEFAULT == null ? diagramID != null : !DIAGRAM_ID_EDEFAULT.equals(diagramID);
			case XcorePackage.DIAGRAM__DIAGRAM_LINKS:
				return diagramLinks != null && !diagramLinks.isEmpty();
			case XcorePackage.DIAGRAM__DIAGRAM_OBJECTS:
				return diagramObjects != null && !diagramObjects.isEmpty();
			case XcorePackage.DIAGRAM__EXTENDED_STYLE:
				return EXTENDED_STYLE_EDEFAULT == null ? extendedStyle != null : !EXTENDED_STYLE_EDEFAULT.equals(extendedStyle);
			case XcorePackage.DIAGRAM__HIGHLIGHT_IMPORTS:
				return HIGHLIGHT_IMPORTS_EDEFAULT == null ? highlightImports != null : !HIGHLIGHT_IMPORTS_EDEFAULT.equals(highlightImports);
			case XcorePackage.DIAGRAM__IS_LOCKED:
				return IS_LOCKED_EDEFAULT == null ? isLocked != null : !IS_LOCKED_EDEFAULT.equals(isLocked);
			case XcorePackage.DIAGRAM__META_TYPE:
				return META_TYPE_EDEFAULT == null ? metaType != null : !META_TYPE_EDEFAULT.equals(metaType);
			case XcorePackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcorePackage.DIAGRAM__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case XcorePackage.DIAGRAM__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case XcorePackage.DIAGRAM__PACKAGE:
				return basicGetPackage() != null;
			case XcorePackage.DIAGRAM__PAGE_HEIGHT:
				return PAGE_HEIGHT_EDEFAULT == null ? pageHeight != null : !PAGE_HEIGHT_EDEFAULT.equals(pageHeight);
			case XcorePackage.DIAGRAM__PAGE_WIDTH:
				return PAGE_WIDTH_EDEFAULT == null ? pageWidth != null : !PAGE_WIDTH_EDEFAULT.equals(pageWidth);
			case XcorePackage.DIAGRAM__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentID != null : !PARENT_ID_EDEFAULT.equals(parentID);
			case XcorePackage.DIAGRAM__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case XcorePackage.DIAGRAM__SHOW_DETAILS:
				return SHOW_DETAILS_EDEFAULT == null ? showDetails != null : !SHOW_DETAILS_EDEFAULT.equals(showDetails);
			case XcorePackage.DIAGRAM__SHOW_PACKAGE_CONTENTS:
				return SHOW_PACKAGE_CONTENTS_EDEFAULT == null ? showPackageContents != null : !SHOW_PACKAGE_CONTENTS_EDEFAULT.equals(showPackageContents);
			case XcorePackage.DIAGRAM__SHOW_PRIVATE:
				return SHOW_PRIVATE_EDEFAULT == null ? showPrivate != null : !SHOW_PRIVATE_EDEFAULT.equals(showPrivate);
			case XcorePackage.DIAGRAM__SHOW_PROTECTED:
				return SHOW_PROTECTED_EDEFAULT == null ? showProtected != null : !SHOW_PROTECTED_EDEFAULT.equals(showProtected);
			case XcorePackage.DIAGRAM__SHOW_PUBLIC:
				return SHOW_PUBLIC_EDEFAULT == null ? showPublic != null : !SHOW_PUBLIC_EDEFAULT.equals(showPublic);
			case XcorePackage.DIAGRAM__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XcorePackage.DIAGRAM__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case XcorePackage.DIAGRAM__SWIMLANES:
				return SWIMLANES_EDEFAULT == null ? swimlanes != null : !SWIMLANES_EDEFAULT.equals(swimlanes);
			case XcorePackage.DIAGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XcorePackage.DIAGRAM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (Author: ");
		result.append(author);
		result.append(", CreatedDate: ");
		result.append(createdDate);
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", DiagramID: ");
		result.append(diagramID);
		result.append(", ExtendedStyle: ");
		result.append(extendedStyle);
		result.append(", HighlightImports: ");
		result.append(highlightImports);
		result.append(", IsLocked: ");
		result.append(isLocked);
		result.append(", MetaType: ");
		result.append(metaType);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Orientation: ");
		result.append(orientation);
		result.append(", PageHeight: ");
		result.append(pageHeight);
		result.append(", PageWidth: ");
		result.append(pageWidth);
		result.append(", ParentID: ");
		result.append(parentID);
		result.append(", Scale: ");
		result.append(scale);
		result.append(", ShowDetails: ");
		result.append(showDetails);
		result.append(", ShowPackageContents: ");
		result.append(showPackageContents);
		result.append(", ShowPrivate: ");
		result.append(showPrivate);
		result.append(", ShowProtected: ");
		result.append(showProtected);
		result.append(", ShowPublic: ");
		result.append(showPublic);
		result.append(", Stereotype: ");
		result.append(stereotype);
		result.append(", StyleEx: ");
		result.append(styleEx);
		result.append(", Swimlanes: ");
		result.append(swimlanes);
		result.append(", Type: ");
		result.append(type);
		result.append(", Version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
