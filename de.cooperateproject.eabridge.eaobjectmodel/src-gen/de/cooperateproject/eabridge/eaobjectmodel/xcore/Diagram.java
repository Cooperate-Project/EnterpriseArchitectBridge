/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCx <em>Cx</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCy <em>Cy</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramID <em>Diagram ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramLinks <em>Diagram Links</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getExtendedStyle <em>Extended Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getHighlightImports <em>Highlight Imports</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getNotes <em>Notes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getScale <em>Scale</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowDetails <em>Show Details</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPackageContents <em>Show Package Contents</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPrivate <em>Show Private</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowProtected <em>Show Protected</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPublic <em>Show Public</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStyleEx <em>Style Ex</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram()
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getAuthor <em>Author</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_CreatedDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCreatedDate <em>Created Date</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Cx()
	 * @model unique="false"
	 * @generated
	 */
	Long getCx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCx <em>Cx</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Cy()
	 * @model unique="false"
	 * @generated
	 */
	Long getCy();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(Long value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_DiagramID()
	 * @model unique="false"
	 * @generated
	 */
	Long getDiagramID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramID <em>Diagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram ID</em>' attribute.
	 * @see #getDiagramID()
	 * @generated
	 */
	void setDiagramID(Long value);

	/**
	 * Returns the value of the '<em><b>Diagram Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Links</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_DiagramLinks()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getDiagram
	 * @model opposite="Diagram" containment="true"
	 * @generated
	 */
	EList<DiagramLink> getDiagramLinks();

	/**
	 * Returns the value of the '<em><b>Diagram Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects</em>' containment reference list.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_DiagramObjects()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getDiagram
	 * @model opposite="Diagram" containment="true"
	 * @generated
	 */
	EList<DiagrammObject> getDiagramObjects();

	/**
	 * Returns the value of the '<em><b>Extended Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Style</em>' attribute.
	 * @see #setExtendedStyle(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ExtendedStyle()
	 * @model unique="false"
	 * @generated
	 */
	String getExtendedStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getExtendedStyle <em>Extended Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Style</em>' attribute.
	 * @see #getExtendedStyle()
	 * @generated
	 */
	void setExtendedStyle(String value);

	/**
	 * Returns the value of the '<em><b>Highlight Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highlight Imports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlight Imports</em>' attribute.
	 * @see #setHighlightImports(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_HighlightImports()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getHighlightImports();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getHighlightImports <em>Highlight Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlight Imports</em>' attribute.
	 * @see #getHighlightImports()
	 * @generated
	 */
	void setHighlightImports(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_IsLocked()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsLocked();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #getIsLocked()
	 * @generated
	 */
	void setIsLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_MetaType()
	 * @model unique="false"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getName <em>Name</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Notes()
	 * @model unique="false"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getNotes <em>Notes</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Orientation()
	 * @model unique="false"
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Package()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getDiagrams
	 * @model opposite="Diagrams" transient="false"
	 * @generated
	 */
	de.cooperateproject.eabridge.eaobjectmodel.xcore.Package getPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(de.cooperateproject.eabridge.eaobjectmodel.xcore.Package value);

	/**
	 * Returns the value of the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Height</em>' attribute.
	 * @see #setPageHeight(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_PageHeight()
	 * @model unique="false"
	 * @generated
	 */
	Long getPageHeight();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageHeight <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Height</em>' attribute.
	 * @see #getPageHeight()
	 * @generated
	 */
	void setPageHeight(Long value);

	/**
	 * Returns the value of the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Width</em>' attribute.
	 * @see #setPageWidth(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_PageWidth()
	 * @model unique="false"
	 * @generated
	 */
	Long getPageWidth();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageWidth <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Width</em>' attribute.
	 * @see #getPageWidth()
	 * @generated
	 */
	void setPageWidth(Long value);

	/**
	 * Returns the value of the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent ID</em>' attribute.
	 * @see #setParentID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ParentID()
	 * @model unique="false"
	 * @generated
	 */
	Long getParentID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getParentID <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent ID</em>' attribute.
	 * @see #getParentID()
	 * @generated
	 */
	void setParentID(Long value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Scale()
	 * @model unique="false"
	 * @generated
	 */
	Long getScale();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Long value);

	/**
	 * Returns the value of the '<em><b>Show Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Details</em>' attribute.
	 * @see #setShowDetails(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ShowDetails()
	 * @model unique="false"
	 * @generated
	 */
	Long getShowDetails();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowDetails <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Details</em>' attribute.
	 * @see #getShowDetails()
	 * @generated
	 */
	void setShowDetails(Long value);

	/**
	 * Returns the value of the '<em><b>Show Package Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Package Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Package Contents</em>' attribute.
	 * @see #setShowPackageContents(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ShowPackageContents()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowPackageContents();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPackageContents <em>Show Package Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Package Contents</em>' attribute.
	 * @see #getShowPackageContents()
	 * @generated
	 */
	void setShowPackageContents(Boolean value);

	/**
	 * Returns the value of the '<em><b>Show Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Private</em>' attribute.
	 * @see #setShowPrivate(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ShowPrivate()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowPrivate();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPrivate <em>Show Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Private</em>' attribute.
	 * @see #getShowPrivate()
	 * @generated
	 */
	void setShowPrivate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Show Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Protected</em>' attribute.
	 * @see #setShowProtected(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ShowProtected()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowProtected();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowProtected <em>Show Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Protected</em>' attribute.
	 * @see #getShowProtected()
	 * @generated
	 */
	void setShowProtected(Boolean value);

	/**
	 * Returns the value of the '<em><b>Show Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Public</em>' attribute.
	 * @see #setShowPublic(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_ShowPublic()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowPublic();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPublic <em>Show Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Public</em>' attribute.
	 * @see #getShowPublic()
	 * @generated
	 */
	void setShowPublic(Boolean value);

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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStereotype <em>Stereotype</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_StyleEx()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleEx();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStyleEx <em>Style Ex</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Swimlanes()
	 * @model unique="false"
	 * @generated
	 */
	String getSwimlanes();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getSwimlanes <em>Swimlanes</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getType <em>Type</em>}' attribute.
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
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage#getDiagram_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Diagram
