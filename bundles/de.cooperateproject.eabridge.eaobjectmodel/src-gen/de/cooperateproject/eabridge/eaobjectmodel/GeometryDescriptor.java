/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isHidden <em>Hidden</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isBold <em>Bold</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isItalic <em>Italic</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isUnderline <em>Underline</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getRotation <em>Rotation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getColor <em>Color</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getC <em>C</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor()
 * @model
 * @generated
 */
public interface GeometryDescriptor extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometryType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometryType
     * @see #setType(DiagramLinkGeometryType)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Type()
     * @model required="true"
     * @generated
     */
    DiagramLinkGeometryType getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometryType
     * @see #getType()
     * @generated
     */
    void setType(DiagramLinkGeometryType value);

    /**
     * Returns the value of the '<em><b>Hidden</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hidden</em>' attribute.
     * @see #setHidden(boolean)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Hidden()
     * @model
     * @generated
     */
    boolean isHidden();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isHidden <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hidden</em>' attribute.
     * @see #isHidden()
     * @generated
     */
    void setHidden(boolean value);

    /**
     * Returns the value of the '<em><b>Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bold</em>' attribute.
     * @see #setBold(boolean)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Bold()
     * @model
     * @generated
     */
    boolean isBold();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isBold <em>Bold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bold</em>' attribute.
     * @see #isBold()
     * @generated
     */
    void setBold(boolean value);

    /**
     * Returns the value of the '<em><b>Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Italic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Italic</em>' attribute.
     * @see #setItalic(boolean)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Italic()
     * @model
     * @generated
     */
    boolean isItalic();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isItalic <em>Italic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Italic</em>' attribute.
     * @see #isItalic()
     * @generated
     */
    void setItalic(boolean value);

    /**
     * Returns the value of the '<em><b>Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Underline</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Underline</em>' attribute.
     * @see #setUnderline(boolean)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Underline()
     * @model
     * @generated
     */
    boolean isUnderline();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#isUnderline <em>Underline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underline</em>' attribute.
     * @see #isUnderline()
     * @generated
     */
    void setUnderline(boolean value);

    /**
     * Returns the value of the '<em><b>Rotation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rotation</em>' attribute.
     * @see #setRotation(int)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Rotation()
     * @model
     * @generated
     */
    int getRotation();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getRotation <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotation</em>' attribute.
     * @see #getRotation()
     * @generated
     */
    void setRotation(int value);

    /**
     * Returns the value of the '<em><b>Text Alignment</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.eabridge.eaobjectmodel.TextAlignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Alignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Alignment</em>' attribute.
     * @see de.cooperateproject.eabridge.eaobjectmodel.TextAlignment
     * @see #setTextAlignment(TextAlignment)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_TextAlignment()
     * @model
     * @generated
     */
    TextAlignment getTextAlignment();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getTextAlignment <em>Text Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Alignment</em>' attribute.
     * @see de.cooperateproject.eabridge.eaobjectmodel.TextAlignment
     * @see #getTextAlignment()
     * @generated
     */
    void setTextAlignment(TextAlignment value);

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see #setDirection(int)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Direction()
     * @model
     * @generated
     */
    int getDirection();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see #getDirection()
     * @generated
     */
    void setDirection(int value);

    /**
     * Returns the value of the '<em><b>Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' containment reference.
     * @see #setColor(RGBColor)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Color()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
    RGBColor getColor();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getColor <em>Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' containment reference.
     * @see #getColor()
     * @generated
     */
    void setColor(RGBColor value);

    /**
     * Returns the value of the '<em><b>Origin</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin</em>' containment reference.
     * @see #setOrigin(Point)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_Origin()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
    Point getOrigin();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getOrigin <em>Origin</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin</em>' containment reference.
     * @see #getOrigin()
     * @generated
     */
    void setOrigin(Point value);

    /**
     * Returns the value of the '<em><b>C</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>C</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>C</em>' containment reference.
     * @see #setC(Point)
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getGeometryDescriptor_C()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
    Point getC();

    /**
     * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor#getC <em>C</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>C</em>' containment reference.
     * @see #getC()
     * @generated
     */
    void setC(Point value);

} // GeometryDescriptor
