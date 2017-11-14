/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getParameterDirection()
 * @model
 * @generated
 */
public enum ParameterDirection implements Enumerator {
	/**
     * The '<em><b>In</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #IN_VALUE
     * @generated
     * @ordered
     */
	IN(0, "in", "in"),

	/**
     * The '<em><b>Inout</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #INOUT_VALUE
     * @generated
     * @ordered
     */
	INOUT(0, "inout", "inout"),

	/**
     * The '<em><b>Out</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OUT_VALUE
     * @generated
     * @ordered
     */
	OUT(0, "out", "out"),

	/**
     * The '<em><b>Return</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #RETURN_VALUE
     * @generated
     * @ordered
     */
	RETURN(0, "return", "return");

	/**
     * The '<em><b>In</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #IN
     * @model name="in"
     * @generated
     * @ordered
     */
	public static final int IN_VALUE = 0;

	/**
     * The '<em><b>Inout</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #INOUT
     * @model name="inout"
     * @generated
     * @ordered
     */
	public static final int INOUT_VALUE = 0;

	/**
     * The '<em><b>Out</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OUT
     * @model name="out"
     * @generated
     * @ordered
     */
	public static final int OUT_VALUE = 0;

	/**
     * The '<em><b>Return</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Return</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #RETURN
     * @model name="return"
     * @generated
     * @ordered
     */
	public static final int RETURN_VALUE = 0;

	/**
     * An array of all the '<em><b>Parameter Direction</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ParameterDirection[] VALUES_ARRAY =
		new ParameterDirection[] {
            IN,
            INOUT,
            OUT,
            RETURN,
        };

	/**
     * A public read-only list of all the '<em><b>Parameter Direction</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ParameterDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Parameter Direction</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ParameterDirection get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterDirection result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Parameter Direction</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ParameterDirection getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterDirection result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Parameter Direction</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ParameterDirection get(int value) {
        switch (value) {
            case IN_VALUE: return IN;
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
	private ParameterDirection(int value, String name, String literal) {
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
	
} //ParameterDirection
