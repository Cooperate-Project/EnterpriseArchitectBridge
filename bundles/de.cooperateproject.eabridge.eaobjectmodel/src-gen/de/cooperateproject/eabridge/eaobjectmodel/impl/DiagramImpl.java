/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__AUTHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.DIAGRAM__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedDate() {
		return (Date)eGet(EaobjectmodelPackage.Literals.DIAGRAM__MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(Date newModifiedDate) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__MODIFIED_DATE, newModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCx() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM__CX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(Long newCx) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__CX, newCx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCy() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM__CY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(Long newCy) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__CY, newCy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramGUID() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_GUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramGUID(String newDiagramGUID) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_GUID, newDiagramGUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDiagramID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramID(Long newDiagramID) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_ID, newDiagramID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DiagramLink> getDiagramLinks() {
		return (EList<DiagramLink>)eGet(EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DiagramObject> getDiagramObjects() {
		return (EList<DiagramObject>)eGet(EaobjectmodelPackage.Literals.DIAGRAM__DIAGRAM_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__ORIENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__ORIENTATION, newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.eabridge.eaobjectmodel.Package getPackage() {
		return (de.cooperateproject.eabridge.eaobjectmodel.Package)eGet(EaobjectmodelPackage.Literals.DIAGRAM__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(de.cooperateproject.eabridge.eaobjectmodel.Package newPackage) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getScale() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Long newScale) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__STEREOTYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__STEREOTYPE, newStereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleEx() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__STYLE_EX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleEx(String newStyleEx) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__STYLE_EX, newStyleEx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwimlanes() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__SWIMLANES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwimlanes(String newSwimlanes) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__SWIMLANES, newSwimlanes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttPub() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM__ATT_PUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttPub(int newAttPub) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__ATT_PUB, newAttPub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttPri() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttPri(int newAttPri) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRI, newAttPri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttPro() {
		return (Integer)eGet(EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttPro(int newAttPro) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM__ATT_PRO, newAttPro);
	}

} //DiagramImpl
