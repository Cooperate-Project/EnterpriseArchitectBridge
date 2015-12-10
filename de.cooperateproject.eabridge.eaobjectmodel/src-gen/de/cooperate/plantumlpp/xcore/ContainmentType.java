/**
 */
package de.cooperate.plantumlpp.xcore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Containment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cooperate.plantumlpp.xcore.XcorePackage#getContainmentType()
 * @model
 * @generated
 */
public enum ContainmentType implements Enumerator {
	/**
	 * The '<em><b>Not Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SPECIFIED(0, "NotSpecified", "Not Specified"),

	/**
	 * The '<em><b>By Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	BY_REFERENCE(0, "ByReference", "By Reference"),

	/**
	 * The '<em><b>By Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	BY_VALUE(0, "ByValue", "By Value");

	/**
	 * The '<em><b>Not Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Specified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SPECIFIED
	 * @model name="NotSpecified" literal="Not Specified"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>By Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Reference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_REFERENCE
	 * @model name="ByReference" literal="By Reference"
	 * @generated
	 * @ordered
	 */
	public static final int BY_REFERENCE_VALUE = 0;

	/**
	 * The '<em><b>By Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_VALUE
	 * @model name="ByValue" literal="By Value"
	 * @generated
	 * @ordered
	 */
	public static final int BY_VALUE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Containment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContainmentType[] VALUES_ARRAY =
		new ContainmentType[] {
			NOT_SPECIFIED,
			BY_REFERENCE,
			BY_VALUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Containment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContainmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Containment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Containment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Containment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainmentType get(int value) {
		switch (value) {
			case NOT_SPECIFIED_VALUE: return NOT_SPECIFIED;
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
	private ContainmentType(int value, String name, String literal) {
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
	
} //ContainmentType
