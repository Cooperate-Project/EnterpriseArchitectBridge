/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getElement <em>Element</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getRight <em>Right</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getSequence <em>Sequence</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getObjectStyle <em>Object Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getTop <em>Top</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject()
 * @model
 * @generated
 */
public interface DiagramObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' attribute.
	 * @see #setBottom(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Bottom()
	 * @model unique="false"
	 * @generated
	 */
	Long getBottom();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getBottom <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' attribute.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(Long value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramObjects <em>Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Diagram()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramObjects
	 * @model opposite="DiagramObjects" transient="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Element()
	 * @model
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_InstanceID()
	 * @model unique="false"
	 * @generated
	 */
	Long getInstanceID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(Long value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Left()
	 * @model unique="false"
	 * @generated
	 */
	Long getLeft();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Long value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Right()
	 * @model unique="false"
	 * @generated
	 */
	Long getRight();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Long value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Sequence()
	 * @model unique="false"
	 * @generated
	 */
	Long getSequence();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Long value);

	/**
	 * Returns the value of the '<em><b>Object Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Style</em>' attribute.
	 * @see #setObjectStyle(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_ObjectStyle()
	 * @model unique="false"
	 * @generated
	 */
	String getObjectStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getObjectStyle <em>Object Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Style</em>' attribute.
	 * @see #getObjectStyle()
	 * @generated
	 */
	void setObjectStyle(String value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' attribute.
	 * @see #setTop(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramObject_Top()
	 * @model unique="false"
	 * @generated
	 */
	Long getTop();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getTop <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' attribute.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Long value);

} // DiagramObject
