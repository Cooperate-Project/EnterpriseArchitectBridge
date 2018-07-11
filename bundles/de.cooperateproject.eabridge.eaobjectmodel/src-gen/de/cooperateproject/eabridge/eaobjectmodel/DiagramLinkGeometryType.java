/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diagram Link Geometry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLinkGeometryType()
 * @model
 * @generated
 */
public enum DiagramLinkGeometryType implements Enumerator {
    /**
     * The '<em><b>Label Left Top</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LABEL_LEFT_TOP_VALUE
     * @generated
     * @ordered
     */
    LABEL_LEFT_TOP(0, "LabelLeftTop", "LabelLeftTop"),

    /**
     * The '<em><b>Label Middle Top</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LABEL_MIDDLE_TOP_VALUE
     * @generated
     * @ordered
     */
    LABEL_MIDDLE_TOP(1, "LabelMiddleTop", "LabelMiddleTop"),

    /**
     * The '<em><b>Label Right Top</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LABEL_RIGHT_TOP_VALUE
     * @generated
     * @ordered
     */
    LABEL_RIGHT_TOP(2, "LabelRightTop", "LabelRightTop"),

    /**
     * The '<em><b>Label Left Bottom</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LABEL_LEFT_BOTTOM_VALUE
     * @generated
     * @ordered
     */
    LABEL_LEFT_BOTTOM(3, "LabelLeftBottom", "LabelLeftBottom"),

    /**
     * The '<em><b>Label Middle Bottom</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LABEL_MIDDLE_BOTTOM_VALUE
     * @generated
     * @ordered
     */
    LABEL_MIDDLE_BOTTOM(5, "LabelMiddleBottom", "LabelMiddleBottom"),

    /**
     * The '<em><b>Label Right Bottom</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LABEL_RIGHT_BOTTOM_VALUE
     * @generated
     * @ordered
     */
    LABEL_RIGHT_BOTTOM(6, "LabelRightBottom", "LabelRightBottom");

    /**
     * The '<em><b>Label Left Top</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Label Left Top</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LABEL_LEFT_TOP
     * @model name="LabelLeftTop"
     * @generated
     * @ordered
     */
    public static final int LABEL_LEFT_TOP_VALUE = 0;

    /**
     * The '<em><b>Label Middle Top</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Label Middle Top</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LABEL_MIDDLE_TOP
     * @model name="LabelMiddleTop"
     * @generated
     * @ordered
     */
    public static final int LABEL_MIDDLE_TOP_VALUE = 1;

    /**
     * The '<em><b>Label Right Top</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Label Right Top</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LABEL_RIGHT_TOP
     * @model name="LabelRightTop"
     * @generated
     * @ordered
     */
    public static final int LABEL_RIGHT_TOP_VALUE = 2;

    /**
     * The '<em><b>Label Left Bottom</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Label Left Bottom</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LABEL_LEFT_BOTTOM
     * @model name="LabelLeftBottom"
     * @generated
     * @ordered
     */
    public static final int LABEL_LEFT_BOTTOM_VALUE = 3;

    /**
     * The '<em><b>Label Middle Bottom</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Label Middle Bottom</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LABEL_MIDDLE_BOTTOM
     * @model name="LabelMiddleBottom"
     * @generated
     * @ordered
     */
    public static final int LABEL_MIDDLE_BOTTOM_VALUE = 5;

    /**
     * The '<em><b>Label Right Bottom</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Label Right Bottom</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LABEL_RIGHT_BOTTOM
     * @model name="LabelRightBottom"
     * @generated
     * @ordered
     */
    public static final int LABEL_RIGHT_BOTTOM_VALUE = 6;

    /**
     * An array of all the '<em><b>Diagram Link Geometry Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DiagramLinkGeometryType[] VALUES_ARRAY =
        new DiagramLinkGeometryType[] {
            LABEL_LEFT_TOP,
            LABEL_MIDDLE_TOP,
            LABEL_RIGHT_TOP,
            LABEL_LEFT_BOTTOM,
            LABEL_MIDDLE_BOTTOM,
            LABEL_RIGHT_BOTTOM,
        };

    /**
     * A public read-only list of all the '<em><b>Diagram Link Geometry Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DiagramLinkGeometryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Diagram Link Geometry Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DiagramLinkGeometryType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DiagramLinkGeometryType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Diagram Link Geometry Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DiagramLinkGeometryType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DiagramLinkGeometryType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Diagram Link Geometry Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DiagramLinkGeometryType get(int value) {
        switch (value) {
            case LABEL_LEFT_TOP_VALUE: return LABEL_LEFT_TOP;
            case LABEL_MIDDLE_TOP_VALUE: return LABEL_MIDDLE_TOP;
            case LABEL_RIGHT_TOP_VALUE: return LABEL_RIGHT_TOP;
            case LABEL_LEFT_BOTTOM_VALUE: return LABEL_LEFT_BOTTOM;
            case LABEL_MIDDLE_BOTTOM_VALUE: return LABEL_MIDDLE_BOTTOM;
            case LABEL_RIGHT_BOTTOM_VALUE: return LABEL_RIGHT_BOTTOM;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private DiagramLinkGeometryType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
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
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //DiagramLinkGeometryType
