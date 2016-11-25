/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getDiagramGUID <em>Diagram GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getDiagramID <em>Diagram ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getDiagramLinks <em>Diagram Links</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getAttPub <em>Att Pub</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getAttPri <em>Att Pri</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getAttPro <em>Att Pro</em>}</li>
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
	 * The default value of the '{@link #getDiagramGUID() <em>Diagram GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramGUID() <em>Diagram GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramGUID()
	 * @generated
	 * @ordered
	 */
	protected String diagramGUID = DIAGRAM_GUID_EDEFAULT;

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
	protected EList<DiagramObject> diagramObjects;

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
	 * The default value of the '{@link #getAttPub() <em>Att Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttPub()
	 * @generated
	 * @ordered
	 */
	protected static final int ATT_PUB_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getAttPub() <em>Att Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttPub()
	 * @generated
	 * @ordered
	 */
	protected int attPub = ATT_PUB_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttPri() <em>Att Pri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttPri()
	 * @generated
	 * @ordered
	 */
	protected static final int ATT_PRI_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getAttPri() <em>Att Pri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttPri()
	 * @generated
	 * @ordered
	 */
	protected int attPri = ATT_PRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttPro() <em>Att Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttPro()
	 * @generated
	 * @ordered
	 */
	protected static final int ATT_PRO_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getAttPro() <em>Att Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttPro()
	 * @generated
	 * @ordered
	 */
	protected int attPro = ATT_PRO_EDEFAULT;

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
		return EaobjectmodelPackage.Literals.DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__CREATED_DATE, oldCreatedDate, createdDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__CX, oldCx, cx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramGUID() {
		return diagramGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramGUID(String newDiagramGUID) {
		String oldDiagramGUID = diagramGUID;
		diagramGUID = newDiagramGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID, oldDiagramGUID, diagramGUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID, oldDiagramID, diagramID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramLink> getDiagramLinks() {
		if (diagramLinks == null) {
			diagramLinks = new EObjectContainmentWithInverseEList<DiagramLink>(DiagramLink.class, this, EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS, EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM);
		}
		return diagramLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramObject> getDiagramObjects() {
		if (diagramObjects == null) {
			diagramObjects = new EObjectContainmentWithInverseEList<DiagramObject>(DiagramObject.class, this, EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS, EaobjectmodelPackage.DIAGRAM_OBJECT__DIAGRAM);
		}
		return diagramObjects;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__NOTES, oldNotes, notes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getPackage() {
		if (eContainerFeatureID() != EaobjectmodelPackage.DIAGRAM__PACKAGE) return null;
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package basicGetPackage() {
		if (eContainerFeatureID() != EaobjectmodelPackage.DIAGRAM__PACKAGE) return null;
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(de.cooperateproject.eabridge.eaobjectmodel.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, EaobjectmodelPackage.DIAGRAM__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(de.cooperateproject.eabridge.eaobjectmodel.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != EaobjectmodelPackage.DIAGRAM__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EaobjectmodelPackage.PACKAGE__DIAGRAMS, de.cooperateproject.eabridge.eaobjectmodel.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__PACKAGE, newPackage, newPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__SCALE, oldScale, scale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__STYLE_EX, oldStyleEx, styleEx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__SWIMLANES, oldSwimlanes, swimlanes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttPub() {
		return attPub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttPub(int newAttPub) {
		int oldAttPub = attPub;
		attPub = newAttPub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__ATT_PUB, oldAttPub, attPub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttPri() {
		return attPri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttPri(int newAttPri) {
		int oldAttPri = attPri;
		attPri = newAttPri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__ATT_PRI, oldAttPri, attPri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttPro() {
		return attPro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttPro(int newAttPro) {
		int oldAttPro = attPro;
		attPro = newAttPro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM__ATT_PRO, oldAttPro, attPro));
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
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramLinks()).basicAdd(otherEnd, msgs);
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjects()).basicAdd(otherEnd, msgs);
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((de.cooperateproject.eabridge.eaobjectmodel.Package)otherEnd, msgs);
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
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
				return ((InternalEList<?>)getDiagramLinks()).basicRemove(otherEnd, msgs);
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getDiagramObjects()).basicRemove(otherEnd, msgs);
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
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
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.PACKAGE__DIAGRAMS, de.cooperateproject.eabridge.eaobjectmodel.Package.class, msgs);
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
			case EaobjectmodelPackage.DIAGRAM__AUTHOR:
				return getAuthor();
			case EaobjectmodelPackage.DIAGRAM__CREATED_DATE:
				return getCreatedDate();
			case EaobjectmodelPackage.DIAGRAM__CX:
				return getCx();
			case EaobjectmodelPackage.DIAGRAM__CY:
				return getCy();
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID:
				return getDiagramGUID();
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID:
				return getDiagramID();
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
				return getDiagramLinks();
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
				return getDiagramObjects();
			case EaobjectmodelPackage.DIAGRAM__NAME:
				return getName();
			case EaobjectmodelPackage.DIAGRAM__NOTES:
				return getNotes();
			case EaobjectmodelPackage.DIAGRAM__ORIENTATION:
				return getOrientation();
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case EaobjectmodelPackage.DIAGRAM__SCALE:
				return getScale();
			case EaobjectmodelPackage.DIAGRAM__STEREOTYPE:
				return getStereotype();
			case EaobjectmodelPackage.DIAGRAM__STYLE_EX:
				return getStyleEx();
			case EaobjectmodelPackage.DIAGRAM__SWIMLANES:
				return getSwimlanes();
			case EaobjectmodelPackage.DIAGRAM__TYPE:
				return getType();
			case EaobjectmodelPackage.DIAGRAM__VERSION:
				return getVersion();
			case EaobjectmodelPackage.DIAGRAM__ATT_PUB:
				return getAttPub();
			case EaobjectmodelPackage.DIAGRAM__ATT_PRI:
				return getAttPri();
			case EaobjectmodelPackage.DIAGRAM__ATT_PRO:
				return getAttPro();
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
			case EaobjectmodelPackage.DIAGRAM__AUTHOR:
				setAuthor((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__CX:
				setCx((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__CY:
				setCy((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID:
				setDiagramGUID((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID:
				setDiagramID((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				getDiagramLinks().addAll((Collection<? extends DiagramLink>)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				getDiagramObjects().addAll((Collection<? extends DiagramObject>)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__NOTES:
				setNotes((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
				setPackage((de.cooperateproject.eabridge.eaobjectmodel.Package)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__SCALE:
				setScale((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__STYLE_EX:
				setStyleEx((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__SWIMLANES:
				setSwimlanes((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__TYPE:
				setType((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__VERSION:
				setVersion((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__ATT_PUB:
				setAttPub((Integer)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__ATT_PRI:
				setAttPri((Integer)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM__ATT_PRO:
				setAttPro((Integer)newValue);
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
			case EaobjectmodelPackage.DIAGRAM__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__CX:
				setCx(CX_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__CY:
				setCy(CY_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID:
				setDiagramGUID(DIAGRAM_GUID_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID:
				setDiagramID(DIAGRAM_ID_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				return;
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				return;
			case EaobjectmodelPackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
				setPackage((de.cooperateproject.eabridge.eaobjectmodel.Package)null);
				return;
			case EaobjectmodelPackage.DIAGRAM__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__STYLE_EX:
				setStyleEx(STYLE_EX_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__SWIMLANES:
				setSwimlanes(SWIMLANES_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__ATT_PUB:
				setAttPub(ATT_PUB_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__ATT_PRI:
				setAttPri(ATT_PRI_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM__ATT_PRO:
				setAttPro(ATT_PRO_EDEFAULT);
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
			case EaobjectmodelPackage.DIAGRAM__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case EaobjectmodelPackage.DIAGRAM__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case EaobjectmodelPackage.DIAGRAM__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case EaobjectmodelPackage.DIAGRAM__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID:
				return DIAGRAM_GUID_EDEFAULT == null ? diagramGUID != null : !DIAGRAM_GUID_EDEFAULT.equals(diagramGUID);
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID:
				return DIAGRAM_ID_EDEFAULT == null ? diagramID != null : !DIAGRAM_ID_EDEFAULT.equals(diagramID);
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
				return diagramLinks != null && !diagramLinks.isEmpty();
			case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
				return diagramObjects != null && !diagramObjects.isEmpty();
			case EaobjectmodelPackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaobjectmodelPackage.DIAGRAM__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EaobjectmodelPackage.DIAGRAM__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case EaobjectmodelPackage.DIAGRAM__PACKAGE:
				return basicGetPackage() != null;
			case EaobjectmodelPackage.DIAGRAM__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case EaobjectmodelPackage.DIAGRAM__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EaobjectmodelPackage.DIAGRAM__STYLE_EX:
				return STYLE_EX_EDEFAULT == null ? styleEx != null : !STYLE_EX_EDEFAULT.equals(styleEx);
			case EaobjectmodelPackage.DIAGRAM__SWIMLANES:
				return SWIMLANES_EDEFAULT == null ? swimlanes != null : !SWIMLANES_EDEFAULT.equals(swimlanes);
			case EaobjectmodelPackage.DIAGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EaobjectmodelPackage.DIAGRAM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EaobjectmodelPackage.DIAGRAM__ATT_PUB:
				return attPub != ATT_PUB_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM__ATT_PRI:
				return attPri != ATT_PRI_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM__ATT_PRO:
				return attPro != ATT_PRO_EDEFAULT;
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
		result.append(", DiagramGUID: ");
		result.append(diagramGUID);
		result.append(", DiagramID: ");
		result.append(diagramID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", Orientation: ");
		result.append(orientation);
		result.append(", Scale: ");
		result.append(scale);
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
		result.append(", AttPub: ");
		result.append(attPub);
		result.append(", AttPri: ");
		result.append(attPri);
		result.append(", AttPro: ");
		result.append(attPro);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
