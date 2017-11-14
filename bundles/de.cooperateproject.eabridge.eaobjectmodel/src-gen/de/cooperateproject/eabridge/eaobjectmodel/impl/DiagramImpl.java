/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

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
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl#getModifiedDate <em>Modified Date</em>}</li>
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
     * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCreatedDate()
     * @generated
     * @ordered
     */
	protected static final Date CREATED_DATE_EDEFAULT = null;
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
     * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCx()
     * @generated
     * @ordered
     */
	protected static final Long CX_EDEFAULT = null;
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
     * The default value of the '{@link #getDiagramGUID() <em>Diagram GUID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDiagramGUID()
     * @generated
     * @ordered
     */
	protected static final String DIAGRAM_GUID_EDEFAULT = null;
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
     * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOrientation()
     * @generated
     * @ordered
     */
	protected static final String ORIENTATION_EDEFAULT = null;
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
     * The default value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSwimlanes()
     * @generated
     * @ordered
     */
	protected static final String SWIMLANES_EDEFAULT = null;
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
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
	protected static final String VERSION_EDEFAULT = null;
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
     * The default value of the '{@link #getAttPri() <em>Att Pri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAttPri()
     * @generated
     * @ordered
     */
	protected static final int ATT_PRI_EDEFAULT = 1;
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
	@Override
	protected int eStaticFeatureCount() {
        return 0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAuthor() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__AUTHOR, EaobjectmodelPackage.Literals.DIAGRAM__AUTHOR, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAuthor(String newAuthor) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__AUTHOR, EaobjectmodelPackage.Literals.DIAGRAM__AUTHOR, newAuthor);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getCreatedDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.DIAGRAM__CREATED_DATE, EaobjectmodelPackage.Literals.DIAGRAM__CREATED_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCreatedDate(Date newCreatedDate) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__CREATED_DATE, EaobjectmodelPackage.Literals.DIAGRAM__CREATED_DATE, newCreatedDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getModifiedDate() {
        return (Date)eDynamicGet(EaobjectmodelPackage.DIAGRAM__MODIFIED_DATE, EaobjectmodelPackage.Literals.DIAGRAM__MODIFIED_DATE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModifiedDate(Date newModifiedDate) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__MODIFIED_DATE, EaobjectmodelPackage.Literals.DIAGRAM__MODIFIED_DATE, newModifiedDate);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getCx() {
        return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM__CX, EaobjectmodelPackage.Literals.DIAGRAM__CX, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCx(Long newCx) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__CX, EaobjectmodelPackage.Literals.DIAGRAM__CX, newCx);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getCy() {
        return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM__CY, EaobjectmodelPackage.Literals.DIAGRAM__CY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCy(Long newCy) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__CY, EaobjectmodelPackage.Literals.DIAGRAM__CY, newCy);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDiagramGUID() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID, EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_GUID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDiagramGUID(String newDiagramGUID) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID, EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_GUID, newDiagramGUID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getDiagramID() {
        return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID, EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_ID, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDiagramID(Long newDiagramID) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID, EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_ID, newDiagramID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<DiagramLink> getDiagramLinks() {
        return (EList<DiagramLink>)eDynamicGet(EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS, EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_LINKS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<DiagramObject> getDiagramObjects() {
        return (EList<DiagramObject>)eDynamicGet(EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS, EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_OBJECTS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__NAME, EaobjectmodelPackage.Literals.DIAGRAM__NAME, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__NAME, EaobjectmodelPackage.Literals.DIAGRAM__NAME, newName);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getNotes() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__NOTES, EaobjectmodelPackage.Literals.DIAGRAM__NOTES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNotes(String newNotes) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__NOTES, EaobjectmodelPackage.Literals.DIAGRAM__NOTES, newNotes);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOrientation() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__ORIENTATION, EaobjectmodelPackage.Literals.DIAGRAM__ORIENTATION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOrientation(String newOrientation) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__ORIENTATION, EaobjectmodelPackage.Literals.DIAGRAM__ORIENTATION, newOrientation);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getPackage() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.DIAGRAM__PACKAGE, EaobjectmodelPackage.Literals.DIAGRAM__PACKAGE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package basicGetPackage() {
        return (de.cooperateproject.eabridge.eaobjectmodel.Package)eDynamicGet(EaobjectmodelPackage.DIAGRAM__PACKAGE, EaobjectmodelPackage.Literals.DIAGRAM__PACKAGE, false, true);
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
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__PACKAGE, EaobjectmodelPackage.Literals.DIAGRAM__PACKAGE, newPackage);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Long getScale() {
        return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM__SCALE, EaobjectmodelPackage.Literals.DIAGRAM__SCALE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setScale(Long newScale) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__SCALE, EaobjectmodelPackage.Literals.DIAGRAM__SCALE, newScale);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStereotype() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__STEREOTYPE, EaobjectmodelPackage.Literals.DIAGRAM__STEREOTYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStereotype(String newStereotype) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__STEREOTYPE, EaobjectmodelPackage.Literals.DIAGRAM__STEREOTYPE, newStereotype);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getStyleEx() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__STYLE_EX, EaobjectmodelPackage.Literals.DIAGRAM__STYLE_EX, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStyleEx(String newStyleEx) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__STYLE_EX, EaobjectmodelPackage.Literals.DIAGRAM__STYLE_EX, newStyleEx);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSwimlanes() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__SWIMLANES, EaobjectmodelPackage.Literals.DIAGRAM__SWIMLANES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSwimlanes(String newSwimlanes) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__SWIMLANES, EaobjectmodelPackage.Literals.DIAGRAM__SWIMLANES, newSwimlanes);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getType() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__TYPE, EaobjectmodelPackage.Literals.DIAGRAM__TYPE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(String newType) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__TYPE, EaobjectmodelPackage.Literals.DIAGRAM__TYPE, newType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getVersion() {
        return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM__VERSION, EaobjectmodelPackage.Literals.DIAGRAM__VERSION, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVersion(String newVersion) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__VERSION, EaobjectmodelPackage.Literals.DIAGRAM__VERSION, newVersion);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAttPub() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM__ATT_PUB, EaobjectmodelPackage.Literals.DIAGRAM__ATT_PUB, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAttPub(int newAttPub) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__ATT_PUB, EaobjectmodelPackage.Literals.DIAGRAM__ATT_PUB, newAttPub);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAttPri() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM__ATT_PRI, EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRI, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAttPri(int newAttPri) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__ATT_PRI, EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRI, newAttPri);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAttPro() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.DIAGRAM__ATT_PRO, EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRO, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAttPro(int newAttPro) {
        eDynamicSet(EaobjectmodelPackage.DIAGRAM__ATT_PRO, EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRO, newAttPro);
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
            case EaobjectmodelPackage.DIAGRAM__MODIFIED_DATE:
                return getModifiedDate();
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
            case EaobjectmodelPackage.DIAGRAM__MODIFIED_DATE:
                setModifiedDate((Date)newValue);
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
            case EaobjectmodelPackage.DIAGRAM__MODIFIED_DATE:
                setModifiedDate(MODIFIED_DATE_EDEFAULT);
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
                return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
            case EaobjectmodelPackage.DIAGRAM__CREATED_DATE:
                return CREATED_DATE_EDEFAULT == null ? getCreatedDate() != null : !CREATED_DATE_EDEFAULT.equals(getCreatedDate());
            case EaobjectmodelPackage.DIAGRAM__MODIFIED_DATE:
                return MODIFIED_DATE_EDEFAULT == null ? getModifiedDate() != null : !MODIFIED_DATE_EDEFAULT.equals(getModifiedDate());
            case EaobjectmodelPackage.DIAGRAM__CX:
                return CX_EDEFAULT == null ? getCx() != null : !CX_EDEFAULT.equals(getCx());
            case EaobjectmodelPackage.DIAGRAM__CY:
                return CY_EDEFAULT == null ? getCy() != null : !CY_EDEFAULT.equals(getCy());
            case EaobjectmodelPackage.DIAGRAM__DIAGRAM_GUID:
                return DIAGRAM_GUID_EDEFAULT == null ? getDiagramGUID() != null : !DIAGRAM_GUID_EDEFAULT.equals(getDiagramGUID());
            case EaobjectmodelPackage.DIAGRAM__DIAGRAM_ID:
                return DIAGRAM_ID_EDEFAULT == null ? getDiagramID() != null : !DIAGRAM_ID_EDEFAULT.equals(getDiagramID());
            case EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS:
                return !getDiagramLinks().isEmpty();
            case EaobjectmodelPackage.DIAGRAM__DIAGRAM_OBJECTS:
                return !getDiagramObjects().isEmpty();
            case EaobjectmodelPackage.DIAGRAM__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case EaobjectmodelPackage.DIAGRAM__NOTES:
                return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
            case EaobjectmodelPackage.DIAGRAM__ORIENTATION:
                return ORIENTATION_EDEFAULT == null ? getOrientation() != null : !ORIENTATION_EDEFAULT.equals(getOrientation());
            case EaobjectmodelPackage.DIAGRAM__PACKAGE:
                return basicGetPackage() != null;
            case EaobjectmodelPackage.DIAGRAM__SCALE:
                return SCALE_EDEFAULT == null ? getScale() != null : !SCALE_EDEFAULT.equals(getScale());
            case EaobjectmodelPackage.DIAGRAM__STEREOTYPE:
                return STEREOTYPE_EDEFAULT == null ? getStereotype() != null : !STEREOTYPE_EDEFAULT.equals(getStereotype());
            case EaobjectmodelPackage.DIAGRAM__STYLE_EX:
                return STYLE_EX_EDEFAULT == null ? getStyleEx() != null : !STYLE_EX_EDEFAULT.equals(getStyleEx());
            case EaobjectmodelPackage.DIAGRAM__SWIMLANES:
                return SWIMLANES_EDEFAULT == null ? getSwimlanes() != null : !SWIMLANES_EDEFAULT.equals(getSwimlanes());
            case EaobjectmodelPackage.DIAGRAM__TYPE:
                return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
            case EaobjectmodelPackage.DIAGRAM__VERSION:
                return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
            case EaobjectmodelPackage.DIAGRAM__ATT_PUB:
                return getAttPub() != ATT_PUB_EDEFAULT;
            case EaobjectmodelPackage.DIAGRAM__ATT_PRI:
                return getAttPri() != ATT_PRI_EDEFAULT;
            case EaobjectmodelPackage.DIAGRAM__ATT_PRO:
                return getAttPro() != ATT_PRO_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //DiagramImpl
