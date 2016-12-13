/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCx <em>Cx</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCy <em>Cy</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramGUID <em>Diagram GUID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramID <em>Diagram ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramLinks <em>Diagram Links</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getVersion <em>Version</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPub <em>Att Pub</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPri <em>Att Pri</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPro <em>Att Pro</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_CreatedDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #setCx(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Cx()
	 * @model unique="false"
	 * @generated
	 */
	Long getCx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' attribute.
	 * @see #getCx()
	 * @generated
	 */
	void setCx(Long value);

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' attribute.
	 * @see #setCy(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Cy()
	 * @model unique="false"
	 * @generated
	 */
	Long getCy();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(Long value);

	/**
	 * Returns the value of the '<em><b>Diagram GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram GUID</em>' attribute.
	 * @see #setDiagramGUID(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_DiagramGUID()
	 * @model unique="false"
	 * @generated
	 */
	String getDiagramGUID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramGUID <em>Diagram GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram GUID</em>' attribute.
	 * @see #getDiagramGUID()
	 * @generated
	 */
	void setDiagramGUID(String value);

	/**
	 * Returns the value of the '<em><b>Diagram ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram ID</em>' attribute.
	 * @see #setDiagramID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_DiagramID()
	 * @model unique="false"
	 * @generated
	 */
	Long getDiagramID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramID <em>Diagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram ID</em>' attribute.
	 * @see #getDiagramID()
	 * @generated
	 */
	void setDiagramID(Long value);

	/**
	 * Returns the value of the '<em><b>Diagram Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Links</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_DiagramLinks()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDiagram
	 * @model opposite="Diagram" containment="true"
	 * @generated
	 */
	EList<DiagramLink> getDiagramLinks();

	/**
	 * Returns the value of the '<em><b>Diagram Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_DiagramObjects()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getDiagram
	 * @model opposite="Diagram" containment="true"
	 * @generated
	 */
	EList<DiagramObject> getDiagramObjects();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Orientation()
	 * @model unique="false"
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(de.cooperateproject.eabridge.eaobjectmodel.Package)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Package()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getDiagrams
	 * @model opposite="Diagrams" transient="false"
	 * @generated
	 */
	de.cooperateproject.eabridge.eaobjectmodel.Package getPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(de.cooperateproject.eabridge.eaobjectmodel.Package value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Scale()
	 * @model unique="false"
	 * @generated
	 */
	Long getScale();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Long value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Ex</em>' attribute.
	 * @see #setStyleEx(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStyleEx <em>Style Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ex</em>' attribute.
	 * @see #getStyleEx()
	 * @generated
	 */
	void setStyleEx(String value);

	/**
	 * Returns the value of the '<em><b>Swimlanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swimlanes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swimlanes</em>' attribute.
	 * @see #setSwimlanes(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Swimlanes()
	 * @model unique="false"
	 * @generated
	 */
	String getSwimlanes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getSwimlanes <em>Swimlanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swimlanes</em>' attribute.
	 * @see #getSwimlanes()
	 * @generated
	 */
	void setSwimlanes(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Att Pub</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Pub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Pub</em>' attribute.
	 * @see #setAttPub(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_AttPub()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getAttPub();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPub <em>Att Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att Pub</em>' attribute.
	 * @see #getAttPub()
	 * @generated
	 */
	void setAttPub(int value);

	/**
	 * Returns the value of the '<em><b>Att Pri</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Pri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Pri</em>' attribute.
	 * @see #setAttPri(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_AttPri()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getAttPri();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPri <em>Att Pri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att Pri</em>' attribute.
	 * @see #getAttPri()
	 * @generated
	 */
	void setAttPri(int value);

	/**
	 * Returns the value of the '<em><b>Att Pro</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Pro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Pro</em>' attribute.
	 * @see #setAttPro(int)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagram_AttPro()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getAttPro();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPro <em>Att Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att Pro</em>' attribute.
	 * @see #getAttPro()
	 * @generated
	 */
	void setAttPro(int value);

} // Diagram
