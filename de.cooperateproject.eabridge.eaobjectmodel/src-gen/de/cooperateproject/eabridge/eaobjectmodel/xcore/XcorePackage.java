/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.XcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.cooperateproject.eabridge.eaobjectmodel'"
 * @generated
 */
public interface XcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.cooperateproject.eabridge.eaobjectmodel.xcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcorePackage eINSTANCE = de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ALLOW_DUPLICATES = 0;

	/**
	 * The feature id for the '<em><b>Attribute GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_GUID = 1;

	/**
	 * The feature id for the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_ID = 2;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINMENT = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINTS = 6;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 7;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_CONST = 9;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_DERIVED = 10;

	/**
	 * The feature id for the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ID = 11;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ORDERED = 12;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = 13;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LENGTH = 14;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_BOUND = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 16;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NOTES = 17;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__POS = 18;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRECISION = 19;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REDEFINED_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCALE = 21;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = 22;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE = 23;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE_EX = 24;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED_VALUES = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 26;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = 27;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = 28;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeConstraint()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeTag()
	 * @generated
	 */
	int ATTRIBUTE_TAG = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__TAG_GUID = 3;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__TAG_ID = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAllowDuplicates()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeGUID <em>Attribute GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeGUID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeID <em>Attribute ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAttributeID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getClassifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainer()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Container();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getContainment()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Containment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getConstraints()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsCollection()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsConst()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsDerived()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsID <em>Is ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsOrdered()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getIsStatic()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLength()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getLowerBound()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getNotes()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPos()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Pos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getPrecision()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Precision();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getRedefinedProperty <em>Redefined Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redefined Property</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getRedefinedProperty()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_RedefinedProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getScale()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Scale();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStereotype()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyle()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getStyleEx()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getTaggedValues()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getUpperBound()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint
	 * @generated
	 */
	EClass getAttributeConstraint();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttribute()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getConstraint()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttName <em>Att Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getAttName()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_AttName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getNotes()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getType()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag <em>Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag
	 * @generated
	 */
	EClass getAttributeTag();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getAttribute()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EReference getAttributeTag_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getName()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getNotes()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagGUID()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getTagID()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getValue()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XcoreFactory getXcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ALLOW_DUPLICATES = eINSTANCE.getAttribute_AllowDuplicates();

		/**
		 * The meta object literal for the '<em><b>Attribute GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_GUID = eINSTANCE.getAttribute_AttributeGUID();

		/**
		 * The meta object literal for the '<em><b>Attribute ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_ID = eINSTANCE.getAttribute_AttributeID();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CLASSIFIER = eINSTANCE.getAttribute_Classifier();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONTAINER = eINSTANCE.getAttribute_Container();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONTAINMENT = eINSTANCE.getAttribute_Containment();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONSTRAINTS = eINSTANCE.getAttribute_Constraints();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_COLLECTION = eINSTANCE.getAttribute_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_CONST = eINSTANCE.getAttribute_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_DERIVED = eINSTANCE.getAttribute_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ID = eINSTANCE.getAttribute_IsID();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ORDERED = eINSTANCE.getAttribute_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_STATIC = eINSTANCE.getAttribute_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LENGTH = eINSTANCE.getAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LOWER_BOUND = eINSTANCE.getAttribute_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NOTES = eINSTANCE.getAttribute_Notes();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__POS = eINSTANCE.getAttribute_Pos();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PRECISION = eINSTANCE.getAttribute_Precision();

		/**
		 * The meta object literal for the '<em><b>Redefined Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REDEFINED_PROPERTY = eINSTANCE.getAttribute_RedefinedProperty();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SCALE = eINSTANCE.getAttribute_Scale();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STEREOTYPE = eINSTANCE.getAttribute_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STYLE = eINSTANCE.getAttribute_Style();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STYLE_EX = eINSTANCE.getAttribute_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TAGGED_VALUES = eINSTANCE.getAttribute_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UPPER_BOUND = eINSTANCE.getAttribute_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT = eINSTANCE.getAttributeConstraint();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__ATTRIBUTE = eINSTANCE.getAttributeConstraint_Attribute();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__CONSTRAINT = eINSTANCE.getAttributeConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Att Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__ATT_NAME = eINSTANCE.getAttributeConstraint_AttName();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__NOTES = eINSTANCE.getAttributeConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__TYPE = eINSTANCE.getAttributeConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AttributeTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAttributeTag()
		 * @generated
		 */
		EClass ATTRIBUTE_TAG = eINSTANCE.getAttributeTag();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TAG__ATTRIBUTE = eINSTANCE.getAttributeTag_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__NAME = eINSTANCE.getAttributeTag_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__NOTES = eINSTANCE.getAttributeTag_Notes();

		/**
		 * The meta object literal for the '<em><b>Tag GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__TAG_GUID = eINSTANCE.getAttributeTag_TagGUID();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__TAG_ID = eINSTANCE.getAttributeTag_TagID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__VALUE = eINSTANCE.getAttributeTag_Value();

	}

} //XcorePackage
