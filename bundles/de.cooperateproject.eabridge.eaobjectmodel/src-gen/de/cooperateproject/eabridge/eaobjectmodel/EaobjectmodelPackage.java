/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='EAObjectModel' modelDirectory='/de.cooperateproject.eabridge.eaobjectmodel/src-gen' complianceLevel='8.0' basePackage='de.cooperateproject.eabridge'"
 * @generated
 */
public interface EaobjectmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eaobjectmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.cooperateproject.eabridge.eaobjectmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eaobjectmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EaobjectmodelPackage eINSTANCE = de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.TypeReferenceImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___SET_TYPE__ELEMENT = 0;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___SET_TYPE__PRIMITIVETYPE = 1;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___SET_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Get Primitive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___GET_PRIMITIVE_TYPE = 3;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

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
	 * The feature id for the '<em><b>Attribute Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_TYPE = 3;

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
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ORDERED = 11;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = 12;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LENGTH = 13;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_BOUND = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 15;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NOTES = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PARENT = 17;

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
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCALE = 20;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = 21;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE = 22;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE_EX = 23;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = 25;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCOPE = 26;

	/**
	 * The feature id for the '<em><b>Gen Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__GEN_OPTION = 27;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getAttributeConstraint()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Element Of Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Att Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__NOTES = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getAttributeTag()
	 * @generated
	 */
	int ATTRIBUTE_TAG = 3;

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
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Connector GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_GUID = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Pt End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_END_X = 3;

	/**
	 * The feature id for the '<em><b>Pt End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_END_Y = 4;

	/**
	 * The feature id for the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EVENT_FLAGS = 5;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_LEAF = 6;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_SPEC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 9;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NOTES = 10;

	/**
	 * The feature id for the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROUTE_STYLE = 11;

	/**
	 * The feature id for the '<em><b>Seq No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SEQ_NO = 12;

	/**
	 * The feature id for the '<em><b>Pt Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_START_X = 13;

	/**
	 * The feature id for the '<em><b>Pt Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PT_START_Y = 14;

	/**
	 * The feature id for the '<em><b>Action Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ACTION_FLAGS = 15;

	/**
	 * The feature id for the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STATE_FLAGS = 16;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STEREOTYPE = 17;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STYLE_EX = 18;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUB_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = 20;

	/**
	 * The feature id for the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VIRTUAL_INHERITANCE = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 22;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST = 23;

	/**
	 * The feature id for the '<em><b>Source Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CARD = 24;

	/**
	 * The feature id for the '<em><b>Source Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ACCESS = 25;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ROLE = 27;

	/**
	 * The feature id for the '<em><b>Source Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ROLE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Source Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_ROLE_NOTE = 29;

	/**
	 * The feature id for the '<em><b>Source Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CONTAINMENT = 30;

	/**
	 * The feature id for the '<em><b>Source Is Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_IS_AGGREGATE = 31;

	/**
	 * The feature id for the '<em><b>Source Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_IS_ORDERED = 32;

	/**
	 * The feature id for the '<em><b>Source Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_QUALIFIER = 33;

	/**
	 * The feature id for the '<em><b>Source Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CHANGEABLE = 34;

	/**
	 * The feature id for the '<em><b>Source Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_CONSTRAINT = 35;

	/**
	 * The feature id for the '<em><b>Source Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_IS_NAVIGABLE = 36;

	/**
	 * The feature id for the '<em><b>Source Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_STEREOTYPE = 37;

	/**
	 * The feature id for the '<em><b>Source Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_STYLE = 38;

	/**
	 * The feature id for the '<em><b>Source TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_TS = 39;

	/**
	 * The feature id for the '<em><b>Dest Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CARD = 40;

	/**
	 * The feature id for the '<em><b>Dest Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ACCESS = 41;

	/**
	 * The feature id for the '<em><b>Dest Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ELEMENT = 42;

	/**
	 * The feature id for the '<em><b>Dest Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ROLE = 43;

	/**
	 * The feature id for the '<em><b>Dest Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ROLE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Dest Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_ROLE_NOTE = 45;

	/**
	 * The feature id for the '<em><b>Dest Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CONTAINMENT = 46;

	/**
	 * The feature id for the '<em><b>Dest Is Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_IS_AGGREGATE = 47;

	/**
	 * The feature id for the '<em><b>Dest Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_IS_ORDERED = 48;

	/**
	 * The feature id for the '<em><b>Dest Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_QUALIFIER = 49;

	/**
	 * The feature id for the '<em><b>Dest Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CHANGEABLE = 50;

	/**
	 * The feature id for the '<em><b>Dest Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_CONSTRAINT = 51;

	/**
	 * The feature id for the '<em><b>Dest Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_IS_NAVIGABLE = 52;

	/**
	 * The feature id for the '<em><b>Dest Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_STEREOTYPE = 53;

	/**
	 * The feature id for the '<em><b>Dest Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_STYLE = 54;

	/**
	 * The feature id for the '<em><b>Dest TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEST_TS = 55;

	/**
	 * The feature id for the '<em><b>Top Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TOP_START_LABEL = 56;

	/**
	 * The feature id for the '<em><b>Top Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TOP_MID_LABEL = 57;

	/**
	 * The feature id for the '<em><b>Top End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TOP_END_LABEL = 58;

	/**
	 * The feature id for the '<em><b>Btm Start Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BTM_START_LABEL = 59;

	/**
	 * The feature id for the '<em><b>Btm Mid Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BTM_MID_LABEL = 60;

	/**
	 * The feature id for the '<em><b>Btm End Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BTM_END_LABEL = 61;

	/**
	 * The feature id for the '<em><b>Start Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__START_EDGE = 62;

	/**
	 * The feature id for the '<em><b>End Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_EDGE = 63;

	/**
	 * The feature id for the '<em><b>Head Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HEAD_STYLE = 64;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LINE_STYLE = 65;

	/**
	 * The feature id for the '<em><b>Dispatch Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DISPATCH_ACTION = 66;

	/**
	 * The feature id for the '<em><b>PDATA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA1 = 67;

	/**
	 * The feature id for the '<em><b>PDATA2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA2 = 68;

	/**
	 * The feature id for the '<em><b>PDATA3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA3 = 69;

	/**
	 * The feature id for the '<em><b>PDATA4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA4 = 70;

	/**
	 * The feature id for the '<em><b>PDATA5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PDATA5 = 71;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 72;

	/**
	 * The operation id for the '<em>Get Source Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_SOURCE_LOWER = 0;

	/**
	 * The operation id for the '<em>Get Source Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_SOURCE_UPPER = 1;

	/**
	 * The operation id for the '<em>Get Dest Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_DEST_LOWER = 2;

	/**
	 * The operation id for the '<em>Get Dest Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_DEST_UPPER = 3;

	/**
	 * The operation id for the '<em>Get Source Alias</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_SOURCE_ALIAS = 4;

	/**
	 * The operation id for the '<em>Get Dest Alias</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_DEST_ALIAS = 5;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CREATED_DATE = 1;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MODIFIED_DATE = 2;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CX = 3;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CY = 4;

	/**
	 * The feature id for the '<em><b>Diagram GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_GUID = 5;

	/**
	 * The feature id for the '<em><b>Diagram ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_ID = 6;

	/**
	 * The feature id for the '<em><b>Diagram Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_LINKS = 7;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_OBJECTS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 9;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NOTES = 10;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ORIENTATION = 11;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SCALE = 13;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STEREOTYPE = 14;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STYLE_EX = 15;

	/**
	 * The feature id for the '<em><b>Swimlanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SWIMLANES = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TYPE = 17;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__VERSION = 18;

	/**
	 * The feature id for the '<em><b>Att Pub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ATT_PUB = 19;

	/**
	 * The feature id for the '<em><b>Att Pri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ATT_PRI = 20;

	/**
	 * The feature id for the '<em><b>Att Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ATT_PRO = 21;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl <em>Diagram Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDiagramLink()
	 * @generated
	 */
	int DIAGRAM_LINK = 6;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__GEOMETRY = 2;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__INSTANCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__HIDDEN = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__PATH = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__STYLE = 6;

	/**
	 * The feature id for the '<em><b>SX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__SX = 7;

	/**
	 * The feature id for the '<em><b>SY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__SY = 8;

	/**
	 * The feature id for the '<em><b>EX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__EX = 9;

	/**
	 * The feature id for the '<em><b>EY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__EY = 10;

	/**
	 * The number of structural features of the '<em>Diagram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Get Dest Role X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK___GET_DEST_ROLE_X = 0;

	/**
	 * The operation id for the '<em>Get Dest Role Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK___GET_DEST_ROLE_Y = 1;

	/**
	 * The number of operations of the '<em>Diagram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl <em>Diagram Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDiagramObject()
	 * @generated
	 */
	int DIAGRAM_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__BOTTOM = 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__INSTANCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__LEFT = 4;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Object Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__OBJECT_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__TOP = 8;

	/**
	 * The number of structural features of the '<em>Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Action Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ACTION_FLAGS = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER = 5;

	/**
	 * The feature id for the '<em><b>Classifier guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER_GUID = 6;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPLEXITY = 7;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CREATED_DATE = 8;

	/**
	 * The feature id for the '<em><b>Element GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_GUID = 9;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_ID = 10;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENTS = 11;

	/**
	 * The feature id for the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EVENT_FLAGS = 12;

	/**
	 * The feature id for the '<em><b>Gen File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GEN_FILE = 13;

	/**
	 * The feature id for the '<em><b>Genlinks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GENLINKS = 14;

	/**
	 * The feature id for the '<em><b>Gen Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GEN_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_ACTIVE = 16;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_LEAF = 17;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_SPEC = 18;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METHODS = 19;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODIFIED_DATE = 20;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MULTIPLICITY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 22;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOTES = 23;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PACKAGE = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = 25;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PERSISTENCE = 26;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PHASE = 27;

	/**
	 * The feature id for the '<em><b>Run State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RUN_STATE = 28;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STATUS = 29;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STEREOTYPE = 30;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE_EX = 31;

	/**
	 * The feature id for the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TREE_POS = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 33;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VERSION = 34;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISIBILITY = 35;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE = 36;

	/**
	 * The feature id for the '<em><b>Backcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BACKCOLOR = 37;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BORDER_STYLE = 38;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BORDER_WIDTH = 39;

	/**
	 * The feature id for the '<em><b>Fontcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FONTCOLOR = 40;

	/**
	 * The feature id for the '<em><b>Bordercolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BORDERCOLOR = 41;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CARDINALITY = 42;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONCURRENCY = 43;

	/**
	 * The feature id for the '<em><b>Source Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SOURCE_RELATIONS = 44;

	/**
	 * The feature id for the '<em><b>PDATA1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PDATA1 = 45;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 46;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 9;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BEHAVIOUR = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CODE = 4;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_CONST = 5;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_LEAF = 6;

	/**
	 * The feature id for the '<em><b>Is Pure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_PURE = 7;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STATIC = 10;

	/**
	 * The feature id for the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_SYNCHRONIZED = 11;

	/**
	 * The feature id for the '<em><b>Method GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_GUID = 12;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_ID = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 14;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NOTES = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARENT = 16;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__POS = 17;

	/**
	 * The feature id for the '<em><b>Return Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_IS_ARRAY = 18;

	/**
	 * The feature id for the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATE_FLAGS = 19;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STEREOTYPE = 20;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STYLE = 21;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STYLE_EX = 22;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWS = 23;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 24;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONCURRENCY = 25;

	/**
	 * The feature id for the '<em><b>Gen Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__GEN_OPTION = 26;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 27;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl <em>Methodparameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getMethodparameter()
	 * @generated
	 */
	int METHODPARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Ea guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER__EA_GUID = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER__KIND = 4;

	/**
	 * The number of structural features of the '<em>Methodparameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Methodparameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Package GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_GUID = 0;

	/**
	 * The feature id for the '<em><b>Batch Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BATCH_LOAD = 1;

	/**
	 * The feature id for the '<em><b>Batch Save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BATCH_SAVE = 2;

	/**
	 * The feature id for the '<em><b>Code Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CREATED_DATE = 4;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FLAGS = 5;

	/**
	 * The feature id for the '<em><b>Is Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_CONTROLLED = 6;

	/**
	 * The feature id for the '<em><b>Is Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_NAMESPACE = 7;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_PROTECTED = 8;

	/**
	 * The feature id for the '<em><b>Last Load Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_LOAD_DATE = 9;

	/**
	 * The feature id for the '<em><b>Last Save Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_SAVE_DATE = 10;

	/**
	 * The feature id for the '<em><b>Log XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LOG_XML = 11;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODIFIED_DATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 13;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NOTES = 14;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = 15;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_ID = 16;

	/**
	 * The feature id for the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TREE_POS = 17;

	/**
	 * The feature id for the '<em><b>UML Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__UML_VERSION = 18;

	/**
	 * The feature id for the '<em><b>Use DTD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USE_DTD = 19;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = 20;

	/**
	 * The feature id for the '<em><b>XML Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__XML_PATH = 21;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = 22;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DIAGRAMS = 23;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT = 25;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 12;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 13;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.IsAggregate <em>Is Aggregate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getIsAggregate()
	 * @generated
	 */
	int IS_AGGREGATE = 14;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DirectionType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 15;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.ConnectorType <em>Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ConnectorType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ElementType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 17;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection <em>Parameter Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getParameterDirection()
	 * @generated
	 */
	int PARAMETER_DIRECTION = 18;

	/**
	 * The meta object id for the '<em>Scope Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getScopeObject()
	 * @generated
	 */
	int SCOPE_OBJECT = 19;

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getClassifier()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getTypeName()
	 * @see #getTypeReference()
	 * @generated
	 */
	EAttribute getTypeReference_TypeName();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#setType(de.cooperateproject.eabridge.eaobjectmodel.Element) <em>Set Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Type</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference#setType(de.cooperateproject.eabridge.eaobjectmodel.Element)
	 * @generated
	 */
	EOperation getTypeReference__SetType__Element();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#setType(de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType) <em>Set Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Type</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference#setType(de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType)
	 * @generated
	 */
	EOperation getTypeReference__SetType__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#setType(java.lang.String) <em>Set Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Type</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference#setType(java.lang.String)
	 * @generated
	 */
	EOperation getTypeReference__SetType__String();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getPrimitiveType() <em>Get Primitive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Primitive Type</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getPrimitiveType()
	 * @generated
	 */
	EOperation getTypeReference__GetPrimitiveType();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAllowDuplicates()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeGUID <em>Attribute GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeGUID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeID <em>Attribute ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeID()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeID();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttributeType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainer()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Container();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getContainment()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Containment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getConstraints()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsCollection()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsConst()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsDerived()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsOrdered()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getIsStatic()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLength()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getLowerBound()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getNotes()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Notes();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getParent()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPos()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Pos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getPrecision()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Precision();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScale()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Scale();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStereotype()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyle()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getStyleEx()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getTaggedValues()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getUpperBound()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getScope()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Scope();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute#getGenOption <em>Gen Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Option</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute#getGenOption()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_GenOption();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint
	 * @generated
	 */
	EClass getAttributeConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getElementOfAttribute <em>Element Of Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Of Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getElementOfAttribute()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_ElementOfAttribute();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttribute()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getConstraint()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttName <em>Att Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getAttName()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_AttName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getNotes()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint#getType()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag <em>Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag
	 * @generated
	 */
	EClass getAttributeTag();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getAttribute()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EReference getAttributeTag_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getName()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getNotes()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getTagGUID()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getTagID()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag#getValue()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorID()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ConnectorID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorGUID <em>Connector GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getConnectorGUID()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ConnectorGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDirection()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Direction();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndX <em>Pt End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt End X</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtEndX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndY <em>Pt End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt End Y</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtEndY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtEndY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getEventFlags <em>Event Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getEventFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_EventFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsLeaf()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsRoot()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getIsSpec()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getNotes()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getRouteStyle <em>Route Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getRouteStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_RouteStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSeqNo <em>Seq No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq No</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSeqNo()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SeqNo();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartX <em>Pt Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Start X</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtStartX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartY <em>Pt Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Start Y</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPtStartY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PtStartY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getActionFlags <em>Action Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getActionFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ActionFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStateFlags <em>State Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getStateFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StateFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getStyleEx()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSubType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SubType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Inheritance</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getVirtualInheritance()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_VirtualInheritance();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDest()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Dest();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceCard <em>Source Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Card</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceCard()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceCard();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceAccess <em>Source Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Access</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceAccess()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceAccess();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceElement()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRole()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleType <em>Source Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceRoleType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleNote <em>Source Role Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role Note</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceRoleNote()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceRoleNote();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceContainment <em>Source Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceContainment()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceContainment();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceIsAggregate <em>Source Is Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Is Aggregate</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceIsAggregate()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceIsAggregate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsOrdered <em>Source Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsOrdered()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceIsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceQualifier <em>Source Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Qualifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceQualifier()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceQualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceChangeable <em>Source Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Changeable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceChangeable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceChangeable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceConstraint <em>Source Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceConstraint()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsNavigable <em>Source Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Is Navigable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#isSourceIsNavigable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceIsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStereotype <em>Source Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceStereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStyle <em>Source Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceTS <em>Source TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source TS</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceTS()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceTS();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestCard <em>Dest Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Card</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestCard()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestCard();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestAccess <em>Dest Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Access</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestAccess()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestAccess();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestElement <em>Dest Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestElement()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRole <em>Dest Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Role</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRole()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestRole();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleType <em>Dest Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Role Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestRoleType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleNote <em>Dest Role Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Role Note</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestRoleNote()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestRoleNote();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestContainment <em>Dest Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestContainment()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestContainment();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestIsAggregate <em>Dest Is Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Is Aggregate</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestIsAggregate()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestIsAggregate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsOrdered <em>Dest Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Is Ordered</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsOrdered()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestIsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestQualifier <em>Dest Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Qualifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestQualifier()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestQualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestChangeable <em>Dest Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Changeable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestChangeable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestChangeable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestConstraint <em>Dest Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestConstraint()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsNavigable <em>Dest Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Is Navigable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#isDestIsNavigable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestIsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStereotype <em>Dest Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestStereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStyle <em>Dest Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestTS <em>Dest TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest TS</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestTS()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DestTS();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Start_Label <em>Top Start Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Start Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Start_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Top_Start_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Mid_Label <em>Top Mid Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Mid Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_Mid_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Top_Mid_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_End_Label <em>Top End Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top End Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getTop_End_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Top_End_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Start_Label <em>Btm Start Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btm Start Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Start_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Btm_Start_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Mid_Label <em>Btm Mid Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btm Mid Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_Mid_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Btm_Mid_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_End_Label <em>Btm End Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btm End Label</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getBtm_End_Label()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Btm_End_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getStart_Edge <em>Start Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Edge</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getStart_Edge()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Start_Edge();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getEnd_Edge <em>End Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Edge</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getEnd_Edge()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_End_Edge();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getHeadStyle <em>Head Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getHeadStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_HeadStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getLineStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDispatchAction <em>Dispatch Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatch Action</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDispatchAction()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_DispatchAction();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA1 <em>PDATA1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA1</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA1()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA1();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA2 <em>PDATA2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA2</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA2()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA2();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA3 <em>PDATA3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA3</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA3()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA3();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA4 <em>PDATA4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA4</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA4()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA4();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA5 <em>PDATA5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDATA5</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getPDATA5()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PDATA5();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceLower() <em>Get Source Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Lower</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceLower()
	 * @generated
	 */
	EOperation getConnector__GetSourceLower();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceUpper() <em>Get Source Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Upper</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceUpper()
	 * @generated
	 */
	EOperation getConnector__GetSourceUpper();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestLower() <em>Get Dest Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dest Lower</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestLower()
	 * @generated
	 */
	EOperation getConnector__GetDestLower();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestUpper() <em>Get Dest Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dest Upper</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestUpper()
	 * @generated
	 */
	EOperation getConnector__GetDestUpper();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceAlias() <em>Get Source Alias</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Alias</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getSourceAlias()
	 * @generated
	 */
	EOperation getConnector__GetSourceAlias();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestAlias() <em>Get Dest Alias</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dest Alias</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Connector#getDestAlias()
	 * @generated
	 */
	EOperation getConnector__GetDestAlias();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAuthor()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCreatedDate()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getModifiedDate()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCx()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Cx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getCy()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Cy();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramGUID <em>Diagram GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramGUID()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_DiagramGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramID <em>Diagram ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramID()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_DiagramID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramLinks <em>Diagram Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Links</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramLinks()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_DiagramLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramObjects <em>Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Objects</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramObjects()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_DiagramObjects();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getNotes()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getOrientation()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Orientation();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getPackage()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Package();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getScale()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Scale();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStereotype()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getStyleEx()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getSwimlanes <em>Swimlanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swimlanes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getSwimlanes()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Swimlanes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getType()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getVersion()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPub <em>Att Pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att Pub</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPub()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_AttPub();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPri <em>Att Pri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att Pri</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPri()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_AttPri();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPro <em>Att Pro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att Pro</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getAttPro()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_AttPro();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Link</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink
	 * @generated
	 */
	EClass getDiagramLink();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getConnector()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EReference getDiagramLink_Connector();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDiagram()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EReference getDiagramLink_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getGeometry()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getInstanceID()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_InstanceID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getHidden()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getPath()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getStyle()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getSX <em>SX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SX</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getSX()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_SX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getSY <em>SY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SY</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getSY()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_SY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getEX <em>EX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EX</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getEX()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_EX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getEY <em>EY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EY</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getEY()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_EY();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDestRoleX() <em>Get Dest Role X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dest Role X</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDestRoleX()
	 * @generated
	 */
	EOperation getDiagramLink__GetDestRoleX();

	/**
	 * Returns the meta object for the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDestRoleY() <em>Get Dest Role Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dest Role Y</em>' operation.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDestRoleY()
	 * @generated
	 */
	EOperation getDiagramLink__GetDestRoleY();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject <em>Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Object</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject
	 * @generated
	 */
	EClass getDiagramObject();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getBottom()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Bottom();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getDiagram()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EReference getDiagramObject_Diagram();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getElement()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EReference getDiagramObject_Element();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getInstanceID()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_InstanceID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getLeft()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Left();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getRight()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getSequence()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getObjectStyle <em>Object Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getObjectStyle()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_ObjectStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject#getTop()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Top();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getAbstract()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getActionFlags <em>Action Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getActionFlags()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ActionFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getAlias()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getAuthor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Author();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getClassifier()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getClassifier_guid <em>Classifier guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier guid</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getClassifier_guid()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Classifier_guid();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getComplexity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Complexity();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getCreatedDate()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getElementGUID <em>Element GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getElementGUID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getElementID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Elements();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getEventFlags <em>Event Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getEventFlags()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_EventFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getGenFile <em>Gen File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen File</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getGenFile()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_GenFile();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getGenlinks <em>Genlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genlinks</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getGenlinks()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Genlinks();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getGenType <em>Gen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getGenType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_GenType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getIsActive()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getIsLeaf()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getIsSpec()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getMethods()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Methods();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getModifiedDate()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getMultiplicity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getNotes()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Notes();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getPackage()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Package();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getParent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getPersistence()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Persistence();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getPhase()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Phase();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getRunState <em>Run State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run State</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getRunState()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_RunState();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getStatus()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getStereotype()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getStyleEx()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getTreePos <em>Tree Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getTreePos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_TreePos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getVersion()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getVisibility()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getStyle()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getBackcolor <em>Backcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backcolor</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getBackcolor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Backcolor();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getBorderStyle()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_BorderStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getBorderWidth()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getFontcolor <em>Fontcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fontcolor</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getFontcolor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Fontcolor();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getBordercolor <em>Bordercolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bordercolor</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getBordercolor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Bordercolor();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getCardinality()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getConcurrency()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Concurrency();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getPDATA1 <em>PDATA1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PDATA1</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getPDATA1()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_PDATA1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Element#getSourceRelations <em>Source Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Relations</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Element#getSourceRelations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SourceRelations();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getBehaviour()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Behaviour();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getCode()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsConst()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsLeaf()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsPure <em>Is Pure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pure</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsPure()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsPure();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsQuery()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsQuery();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsRoot()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getIsSynchronized <em>Is Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronized</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getIsSynchronized()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodGUID <em>Method GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodGUID()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getMethodID()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getNotes()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Notes();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getParent()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getPos()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Pos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnIsArray <em>Return Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Is Array</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getReturnIsArray()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnIsArray();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStateFlags <em>State Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getStateFlags()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_StateFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getStereotype()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getStyle()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getStyleEx()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getThrows()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Throws();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getConcurrency()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Concurrency();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Method#getGenOption <em>Gen Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Option</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Method#getGenOption()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_GenOption();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter <em>Methodparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methodparameter</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter
	 * @generated
	 */
	EClass getMethodparameter();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getEa_guid <em>Ea guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea guid</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getEa_guid()
	 * @see #getMethodparameter()
	 * @generated
	 */
	EAttribute getMethodparameter_Ea_guid();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getParameterType()
	 * @see #getMethodparameter()
	 * @generated
	 */
	EReference getMethodparameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getName()
	 * @see #getMethodparameter()
	 * @generated
	 */
	EAttribute getMethodparameter_Name();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getMethod()
	 * @see #getMethodparameter()
	 * @generated
	 */
	EReference getMethodparameter_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter#getKind()
	 * @see #getMethodparameter()
	 * @generated
	 */
	EAttribute getMethodparameter_Kind();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getPackageGUID <em>Package GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getPackageGUID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackageGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getBatchLoad <em>Batch Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Load</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getBatchLoad()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_BatchLoad();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getBatchSave <em>Batch Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Save</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getBatchSave()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_BatchSave();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getCodePath <em>Code Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getCodePath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_CodePath();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getCreatedDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getFlags()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Flags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getIsControlled <em>Is Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Controlled</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getIsControlled()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsControlled();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getIsNamespace <em>Is Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Namespace</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getIsNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsNamespace();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getIsProtected <em>Is Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Protected</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getIsProtected()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsProtected();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getLastLoadDate <em>Last Load Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Load Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getLastLoadDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LastLoadDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getLastSaveDate <em>Last Save Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Save Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getLastSaveDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LastSaveDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getLogXML <em>Log XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log XML</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getLogXML()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LogXML();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getModifiedDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getNotes()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getOwner()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Owner();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getPackageID <em>Package ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getPackageID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackageID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getTreePos <em>Tree Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getTreePos()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_TreePos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getUMLVersion <em>UML Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UML Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getUMLVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_UMLVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getUseDTD <em>Use DTD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use DTD</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getUseDTD()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_UseDTD();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getXMLPath <em>XML Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XML Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getXMLPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_XMLPath();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getDiagrams()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Diagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Elements();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Package#getParent()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Parent();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.IsAggregate <em>Is Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Is Aggregate</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
	 * @generated
	 */
	EEnum getIsAggregate();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connector Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ConnectorType
	 * @generated
	 */
	EEnum getConnectorType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ElementType
	 * @generated
	 */
	EEnum getElementType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection <em>Parameter Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection
	 * @generated
	 */
	EEnum getParameterDirection();

	/**
	 * Returns the meta object for data type '{@link de.cooperateproject.eabridge.eaobjectmodel.Scope <em>Scope Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Object</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
	 * @model instanceClass="de.cooperateproject.eabridge.eaobjectmodel.Scope"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='boolean _equals = <%com.google.common.base.Objects%>.equal(it, null);\nif (_equals)\n{\n\treturn null;\n}\n<%de.cooperateproject.eabridge.eaobjectmodel.Scope%>[] _enumConstants = <%de.cooperateproject.eabridge.eaobjectmodel.Scope%>.class.getEnumConstants();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%de.cooperateproject.eabridge.eaobjectmodel.Scope%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%de.cooperateproject.eabridge.eaobjectmodel.Scope%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%de.cooperateproject.eabridge.eaobjectmodel.Scope%> c)\n\t{\n\t\t<%java.lang.String%> _name = c.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(it.equals(_name));\n\t}\n};\nfinal <%de.cooperateproject.eabridge.eaobjectmodel.Scope%> result = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%de.cooperateproject.eabridge.eaobjectmodel.Scope%>>findFirst(((<%java.lang.Iterable%><<%de.cooperateproject.eabridge.eaobjectmodel.Scope%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_enumConstants)), _function);\nboolean _equals_1 = <%com.google.common.base.Objects%>.equal(result, null);\nif (_equals_1)\n{\n\tthrow new <%java.lang.IllegalArgumentException%>(((\"The value \\\'\" + it) + \"\\\' is not a valid enumerator of \\\'Scope\\\'\"));\n}\nreturn result;' convert='boolean _equals = <%com.google.common.base.Objects%>.equal(it, null);\nif (_equals)\n{\n\treturn null;\n}\nreturn it.getLiteral();'"
	 * @generated
	 */
	EDataType getScopeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EaobjectmodelFactory getEaobjectmodelFactory();

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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.TypeReferenceImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__CLASSIFIER = eINSTANCE.getTypeReference_Classifier();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REFERENCE__TYPE_NAME = eINSTANCE.getTypeReference_TypeName();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___SET_TYPE__ELEMENT = eINSTANCE.getTypeReference__SetType__Element();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___SET_TYPE__PRIMITIVETYPE = eINSTANCE.getTypeReference__SetType__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___SET_TYPE__STRING = eINSTANCE.getTypeReference__SetType__String();

		/**
		 * The meta object literal for the '<em><b>Get Primitive Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_REFERENCE___GET_PRIMITIVE_TYPE = eINSTANCE.getTypeReference__GetPrimitiveType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getAttribute()
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
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AttributeType();

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
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__PARENT = eINSTANCE.getAttribute_Parent();

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
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UPPER_BOUND = eINSTANCE.getAttribute_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SCOPE = eINSTANCE.getAttribute_Scope();

		/**
		 * The meta object literal for the '<em><b>Gen Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__GEN_OPTION = eINSTANCE.getAttribute_GenOption();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getAttributeConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT = eINSTANCE.getAttributeConstraint();

		/**
		 * The meta object literal for the '<em><b>Element Of Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE = eINSTANCE.getAttributeConstraint_ElementOfAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.AttributeTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getAttributeTag()
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

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.ConnectorImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__CONNECTOR_ID = eINSTANCE.getConnector_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Connector GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__CONNECTOR_GUID = eINSTANCE.getConnector_ConnectorGUID();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DIRECTION = eINSTANCE.getConnector_Direction();

		/**
		 * The meta object literal for the '<em><b>Pt End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_END_X = eINSTANCE.getConnector_PtEndX();

		/**
		 * The meta object literal for the '<em><b>Pt End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_END_Y = eINSTANCE.getConnector_PtEndY();

		/**
		 * The meta object literal for the '<em><b>Event Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__EVENT_FLAGS = eINSTANCE.getConnector_EventFlags();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_LEAF = eINSTANCE.getConnector_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_ROOT = eINSTANCE.getConnector_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_SPEC = eINSTANCE.getConnector_IsSpec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NOTES = eINSTANCE.getConnector_Notes();

		/**
		 * The meta object literal for the '<em><b>Route Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ROUTE_STYLE = eINSTANCE.getConnector_RouteStyle();

		/**
		 * The meta object literal for the '<em><b>Seq No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SEQ_NO = eINSTANCE.getConnector_SeqNo();

		/**
		 * The meta object literal for the '<em><b>Pt Start X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_START_X = eINSTANCE.getConnector_PtStartX();

		/**
		 * The meta object literal for the '<em><b>Pt Start Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PT_START_Y = eINSTANCE.getConnector_PtStartY();

		/**
		 * The meta object literal for the '<em><b>Action Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ACTION_FLAGS = eINSTANCE.getConnector_ActionFlags();

		/**
		 * The meta object literal for the '<em><b>State Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__STATE_FLAGS = eINSTANCE.getConnector_StateFlags();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__STEREOTYPE = eINSTANCE.getConnector_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__STYLE_EX = eINSTANCE.getConnector_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SUB_TYPE = eINSTANCE.getConnector_SubType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Virtual Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__VIRTUAL_INHERITANCE = eINSTANCE.getConnector_VirtualInheritance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DEST = eINSTANCE.getConnector_Dest();

		/**
		 * The meta object literal for the '<em><b>Source Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CARD = eINSTANCE.getConnector_SourceCard();

		/**
		 * The meta object literal for the '<em><b>Source Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ACCESS = eINSTANCE.getConnector_SourceAccess();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ELEMENT = eINSTANCE.getConnector_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ROLE = eINSTANCE.getConnector_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Source Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ROLE_TYPE = eINSTANCE.getConnector_SourceRoleType();

		/**
		 * The meta object literal for the '<em><b>Source Role Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_ROLE_NOTE = eINSTANCE.getConnector_SourceRoleNote();

		/**
		 * The meta object literal for the '<em><b>Source Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CONTAINMENT = eINSTANCE.getConnector_SourceContainment();

		/**
		 * The meta object literal for the '<em><b>Source Is Aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_IS_AGGREGATE = eINSTANCE.getConnector_SourceIsAggregate();

		/**
		 * The meta object literal for the '<em><b>Source Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_IS_ORDERED = eINSTANCE.getConnector_SourceIsOrdered();

		/**
		 * The meta object literal for the '<em><b>Source Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_QUALIFIER = eINSTANCE.getConnector_SourceQualifier();

		/**
		 * The meta object literal for the '<em><b>Source Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CHANGEABLE = eINSTANCE.getConnector_SourceChangeable();

		/**
		 * The meta object literal for the '<em><b>Source Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_CONSTRAINT = eINSTANCE.getConnector_SourceConstraint();

		/**
		 * The meta object literal for the '<em><b>Source Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_IS_NAVIGABLE = eINSTANCE.getConnector_SourceIsNavigable();

		/**
		 * The meta object literal for the '<em><b>Source Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_STEREOTYPE = eINSTANCE.getConnector_SourceStereotype();

		/**
		 * The meta object literal for the '<em><b>Source Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_STYLE = eINSTANCE.getConnector_SourceStyle();

		/**
		 * The meta object literal for the '<em><b>Source TS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_TS = eINSTANCE.getConnector_SourceTS();

		/**
		 * The meta object literal for the '<em><b>Dest Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CARD = eINSTANCE.getConnector_DestCard();

		/**
		 * The meta object literal for the '<em><b>Dest Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ACCESS = eINSTANCE.getConnector_DestAccess();

		/**
		 * The meta object literal for the '<em><b>Dest Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ELEMENT = eINSTANCE.getConnector_DestElement();

		/**
		 * The meta object literal for the '<em><b>Dest Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ROLE = eINSTANCE.getConnector_DestRole();

		/**
		 * The meta object literal for the '<em><b>Dest Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ROLE_TYPE = eINSTANCE.getConnector_DestRoleType();

		/**
		 * The meta object literal for the '<em><b>Dest Role Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_ROLE_NOTE = eINSTANCE.getConnector_DestRoleNote();

		/**
		 * The meta object literal for the '<em><b>Dest Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CONTAINMENT = eINSTANCE.getConnector_DestContainment();

		/**
		 * The meta object literal for the '<em><b>Dest Is Aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_IS_AGGREGATE = eINSTANCE.getConnector_DestIsAggregate();

		/**
		 * The meta object literal for the '<em><b>Dest Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_IS_ORDERED = eINSTANCE.getConnector_DestIsOrdered();

		/**
		 * The meta object literal for the '<em><b>Dest Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_QUALIFIER = eINSTANCE.getConnector_DestQualifier();

		/**
		 * The meta object literal for the '<em><b>Dest Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CHANGEABLE = eINSTANCE.getConnector_DestChangeable();

		/**
		 * The meta object literal for the '<em><b>Dest Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_CONSTRAINT = eINSTANCE.getConnector_DestConstraint();

		/**
		 * The meta object literal for the '<em><b>Dest Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_IS_NAVIGABLE = eINSTANCE.getConnector_DestIsNavigable();

		/**
		 * The meta object literal for the '<em><b>Dest Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_STEREOTYPE = eINSTANCE.getConnector_DestStereotype();

		/**
		 * The meta object literal for the '<em><b>Dest Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_STYLE = eINSTANCE.getConnector_DestStyle();

		/**
		 * The meta object literal for the '<em><b>Dest TS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DEST_TS = eINSTANCE.getConnector_DestTS();

		/**
		 * The meta object literal for the '<em><b>Top Start Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TOP_START_LABEL = eINSTANCE.getConnector_Top_Start_Label();

		/**
		 * The meta object literal for the '<em><b>Top Mid Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TOP_MID_LABEL = eINSTANCE.getConnector_Top_Mid_Label();

		/**
		 * The meta object literal for the '<em><b>Top End Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TOP_END_LABEL = eINSTANCE.getConnector_Top_End_Label();

		/**
		 * The meta object literal for the '<em><b>Btm Start Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BTM_START_LABEL = eINSTANCE.getConnector_Btm_Start_Label();

		/**
		 * The meta object literal for the '<em><b>Btm Mid Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BTM_MID_LABEL = eINSTANCE.getConnector_Btm_Mid_Label();

		/**
		 * The meta object literal for the '<em><b>Btm End Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BTM_END_LABEL = eINSTANCE.getConnector_Btm_End_Label();

		/**
		 * The meta object literal for the '<em><b>Start Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__START_EDGE = eINSTANCE.getConnector_Start_Edge();

		/**
		 * The meta object literal for the '<em><b>End Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__END_EDGE = eINSTANCE.getConnector_End_Edge();

		/**
		 * The meta object literal for the '<em><b>Head Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__HEAD_STYLE = eINSTANCE.getConnector_HeadStyle();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__LINE_STYLE = eINSTANCE.getConnector_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Dispatch Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DISPATCH_ACTION = eINSTANCE.getConnector_DispatchAction();

		/**
		 * The meta object literal for the '<em><b>PDATA1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA1 = eINSTANCE.getConnector_PDATA1();

		/**
		 * The meta object literal for the '<em><b>PDATA2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA2 = eINSTANCE.getConnector_PDATA2();

		/**
		 * The meta object literal for the '<em><b>PDATA3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA3 = eINSTANCE.getConnector_PDATA3();

		/**
		 * The meta object literal for the '<em><b>PDATA4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA4 = eINSTANCE.getConnector_PDATA4();

		/**
		 * The meta object literal for the '<em><b>PDATA5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PDATA5 = eINSTANCE.getConnector_PDATA5();

		/**
		 * The meta object literal for the '<em><b>Get Source Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_SOURCE_LOWER = eINSTANCE.getConnector__GetSourceLower();

		/**
		 * The meta object literal for the '<em><b>Get Source Upper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_SOURCE_UPPER = eINSTANCE.getConnector__GetSourceUpper();

		/**
		 * The meta object literal for the '<em><b>Get Dest Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_DEST_LOWER = eINSTANCE.getConnector__GetDestLower();

		/**
		 * The meta object literal for the '<em><b>Get Dest Upper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_DEST_UPPER = eINSTANCE.getConnector__GetDestUpper();

		/**
		 * The meta object literal for the '<em><b>Get Source Alias</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_SOURCE_ALIAS = eINSTANCE.getConnector__GetSourceAlias();

		/**
		 * The meta object literal for the '<em><b>Get Dest Alias</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTOR___GET_DEST_ALIAS = eINSTANCE.getConnector__GetDestAlias();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__AUTHOR = eINSTANCE.getDiagram_Author();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__CREATED_DATE = eINSTANCE.getDiagram_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__MODIFIED_DATE = eINSTANCE.getDiagram_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__CX = eINSTANCE.getDiagram_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__CY = eINSTANCE.getDiagram_Cy();

		/**
		 * The meta object literal for the '<em><b>Diagram GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DIAGRAM_GUID = eINSTANCE.getDiagram_DiagramGUID();

		/**
		 * The meta object literal for the '<em><b>Diagram ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DIAGRAM_ID = eINSTANCE.getDiagram_DiagramID();

		/**
		 * The meta object literal for the '<em><b>Diagram Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__DIAGRAM_LINKS = eINSTANCE.getDiagram_DiagramLinks();

		/**
		 * The meta object literal for the '<em><b>Diagram Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__DIAGRAM_OBJECTS = eINSTANCE.getDiagram_DiagramObjects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NOTES = eINSTANCE.getDiagram_Notes();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__ORIENTATION = eINSTANCE.getDiagram_Orientation();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__PACKAGE = eINSTANCE.getDiagram_Package();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SCALE = eINSTANCE.getDiagram_Scale();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__STEREOTYPE = eINSTANCE.getDiagram_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__STYLE_EX = eINSTANCE.getDiagram_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Swimlanes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SWIMLANES = eINSTANCE.getDiagram_Swimlanes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__TYPE = eINSTANCE.getDiagram_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__VERSION = eINSTANCE.getDiagram_Version();

		/**
		 * The meta object literal for the '<em><b>Att Pub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__ATT_PUB = eINSTANCE.getDiagram_AttPub();

		/**
		 * The meta object literal for the '<em><b>Att Pri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__ATT_PRI = eINSTANCE.getDiagram_AttPri();

		/**
		 * The meta object literal for the '<em><b>Att Pro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__ATT_PRO = eINSTANCE.getDiagram_AttPro();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl <em>Diagram Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDiagramLink()
		 * @generated
		 */
		EClass DIAGRAM_LINK = eINSTANCE.getDiagramLink();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_LINK__CONNECTOR = eINSTANCE.getDiagramLink_Connector();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_LINK__DIAGRAM = eINSTANCE.getDiagramLink_Diagram();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__GEOMETRY = eINSTANCE.getDiagramLink_Geometry();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__INSTANCE_ID = eINSTANCE.getDiagramLink_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__HIDDEN = eINSTANCE.getDiagramLink_Hidden();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__PATH = eINSTANCE.getDiagramLink_Path();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__STYLE = eINSTANCE.getDiagramLink_Style();

		/**
		 * The meta object literal for the '<em><b>SX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__SX = eINSTANCE.getDiagramLink_SX();

		/**
		 * The meta object literal for the '<em><b>SY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__SY = eINSTANCE.getDiagramLink_SY();

		/**
		 * The meta object literal for the '<em><b>EX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__EX = eINSTANCE.getDiagramLink_EX();

		/**
		 * The meta object literal for the '<em><b>EY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__EY = eINSTANCE.getDiagramLink_EY();

		/**
		 * The meta object literal for the '<em><b>Get Dest Role X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_LINK___GET_DEST_ROLE_X = eINSTANCE.getDiagramLink__GetDestRoleX();

		/**
		 * The meta object literal for the '<em><b>Get Dest Role Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_LINK___GET_DEST_ROLE_Y = eINSTANCE.getDiagramLink__GetDestRoleY();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl <em>Diagram Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramObjectImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDiagramObject()
		 * @generated
		 */
		EClass DIAGRAM_OBJECT = eINSTANCE.getDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__BOTTOM = eINSTANCE.getDiagramObject_Bottom();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_OBJECT__DIAGRAM = eINSTANCE.getDiagramObject_Diagram();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_OBJECT__ELEMENT = eINSTANCE.getDiagramObject_Element();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__INSTANCE_ID = eINSTANCE.getDiagramObject_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__LEFT = eINSTANCE.getDiagramObject_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__RIGHT = eINSTANCE.getDiagramObject_Right();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__SEQUENCE = eINSTANCE.getDiagramObject_Sequence();

		/**
		 * The meta object literal for the '<em><b>Object Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__OBJECT_STYLE = eINSTANCE.getDiagramObject_ObjectStyle();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__TOP = eINSTANCE.getDiagramObject_Top();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.ElementImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ABSTRACT = eINSTANCE.getElement_Abstract();

		/**
		 * The meta object literal for the '<em><b>Action Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ACTION_FLAGS = eINSTANCE.getElement_ActionFlags();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ALIAS = eINSTANCE.getElement_Alias();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__AUTHOR = eINSTANCE.getElement_Author();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CLASSIFIER = eINSTANCE.getElement_Classifier();

		/**
		 * The meta object literal for the '<em><b>Classifier guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSIFIER_GUID = eINSTANCE.getElement_Classifier_guid();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMPLEXITY = eINSTANCE.getElement_Complexity();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CREATED_DATE = eINSTANCE.getElement_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Element GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ELEMENT_GUID = eINSTANCE.getElement_ElementGUID();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ELEMENT_ID = eINSTANCE.getElement_ElementID();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENTS = eINSTANCE.getElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Event Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EVENT_FLAGS = eINSTANCE.getElement_EventFlags();

		/**
		 * The meta object literal for the '<em><b>Gen File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GEN_FILE = eINSTANCE.getElement_GenFile();

		/**
		 * The meta object literal for the '<em><b>Genlinks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GENLINKS = eINSTANCE.getElement_Genlinks();

		/**
		 * The meta object literal for the '<em><b>Gen Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GEN_TYPE = eINSTANCE.getElement_GenType();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_ACTIVE = eINSTANCE.getElement_IsActive();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_LEAF = eINSTANCE.getElement_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_SPEC = eINSTANCE.getElement_IsSpec();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__METHODS = eINSTANCE.getElement_Methods();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MODIFIED_DATE = eINSTANCE.getElement_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MULTIPLICITY = eINSTANCE.getElement_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NOTES = eINSTANCE.getElement_Notes();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PACKAGE = eINSTANCE.getElement_Package();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARENT = eINSTANCE.getElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PERSISTENCE = eINSTANCE.getElement_Persistence();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PHASE = eINSTANCE.getElement_Phase();

		/**
		 * The meta object literal for the '<em><b>Run State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RUN_STATE = eINSTANCE.getElement_RunState();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STATUS = eINSTANCE.getElement_Status();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STEREOTYPE = eINSTANCE.getElement_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STYLE_EX = eINSTANCE.getElement_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Tree Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TREE_POS = eINSTANCE.getElement_TreePos();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VERSION = eINSTANCE.getElement_Version();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VISIBILITY = eINSTANCE.getElement_Visibility();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STYLE = eINSTANCE.getElement_Style();

		/**
		 * The meta object literal for the '<em><b>Backcolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BACKCOLOR = eINSTANCE.getElement_Backcolor();

		/**
		 * The meta object literal for the '<em><b>Border Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BORDER_STYLE = eINSTANCE.getElement_BorderStyle();

		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BORDER_WIDTH = eINSTANCE.getElement_BorderWidth();

		/**
		 * The meta object literal for the '<em><b>Fontcolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__FONTCOLOR = eINSTANCE.getElement_Fontcolor();

		/**
		 * The meta object literal for the '<em><b>Bordercolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BORDERCOLOR = eINSTANCE.getElement_Bordercolor();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CARDINALITY = eINSTANCE.getElement_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CONCURRENCY = eINSTANCE.getElement_Concurrency();

		/**
		 * The meta object literal for the '<em><b>PDATA1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PDATA1 = eINSTANCE.getElement_PDATA1();

		/**
		 * The meta object literal for the '<em><b>Source Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SOURCE_RELATIONS = eINSTANCE.getElement_SourceRelations();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.MethodImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BEHAVIOUR = eINSTANCE.getMethod_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CODE = eINSTANCE.getMethod_Code();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_CONST = eINSTANCE.getMethod_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_LEAF = eINSTANCE.getMethod_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Pure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_PURE = eINSTANCE.getMethod_IsPure();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_QUERY = eINSTANCE.getMethod_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_ROOT = eINSTANCE.getMethod_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_STATIC = eINSTANCE.getMethod_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_SYNCHRONIZED = eINSTANCE.getMethod_IsSynchronized();

		/**
		 * The meta object literal for the '<em><b>Method GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_GUID = eINSTANCE.getMethod_MethodGUID();

		/**
		 * The meta object literal for the '<em><b>Method ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_ID = eINSTANCE.getMethod_MethodID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NOTES = eINSTANCE.getMethod_Notes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARENT = eINSTANCE.getMethod_Parent();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__POS = eINSTANCE.getMethod_Pos();

		/**
		 * The meta object literal for the '<em><b>Return Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_IS_ARRAY = eINSTANCE.getMethod_ReturnIsArray();

		/**
		 * The meta object literal for the '<em><b>State Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STATE_FLAGS = eINSTANCE.getMethod_StateFlags();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STEREOTYPE = eINSTANCE.getMethod_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STYLE = eINSTANCE.getMethod_Style();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STYLE_EX = eINSTANCE.getMethod_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__THROWS = eINSTANCE.getMethod_Throws();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CONCURRENCY = eINSTANCE.getMethod_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Gen Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__GEN_OPTION = eINSTANCE.getMethod_GenOption();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl <em>Methodparameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.MethodparameterImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getMethodparameter()
		 * @generated
		 */
		EClass METHODPARAMETER = eINSTANCE.getMethodparameter();

		/**
		 * The meta object literal for the '<em><b>Ea guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODPARAMETER__EA_GUID = eINSTANCE.getMethodparameter_Ea_guid();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODPARAMETER__PARAMETER_TYPE = eINSTANCE.getMethodparameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODPARAMETER__NAME = eINSTANCE.getMethodparameter_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODPARAMETER__METHOD = eINSTANCE.getMethodparameter_Method();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODPARAMETER__KIND = eINSTANCE.getMethodparameter_Kind();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.PackageImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Package GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_GUID = eINSTANCE.getPackage_PackageGUID();

		/**
		 * The meta object literal for the '<em><b>Batch Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__BATCH_LOAD = eINSTANCE.getPackage_BatchLoad();

		/**
		 * The meta object literal for the '<em><b>Batch Save</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__BATCH_SAVE = eINSTANCE.getPackage_BatchSave();

		/**
		 * The meta object literal for the '<em><b>Code Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CODE_PATH = eINSTANCE.getPackage_CodePath();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CREATED_DATE = eINSTANCE.getPackage_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__FLAGS = eINSTANCE.getPackage_Flags();

		/**
		 * The meta object literal for the '<em><b>Is Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_CONTROLLED = eINSTANCE.getPackage_IsControlled();

		/**
		 * The meta object literal for the '<em><b>Is Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_NAMESPACE = eINSTANCE.getPackage_IsNamespace();

		/**
		 * The meta object literal for the '<em><b>Is Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_PROTECTED = eINSTANCE.getPackage_IsProtected();

		/**
		 * The meta object literal for the '<em><b>Last Load Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LAST_LOAD_DATE = eINSTANCE.getPackage_LastLoadDate();

		/**
		 * The meta object literal for the '<em><b>Last Save Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LAST_SAVE_DATE = eINSTANCE.getPackage_LastSaveDate();

		/**
		 * The meta object literal for the '<em><b>Log XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LOG_XML = eINSTANCE.getPackage_LogXML();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__MODIFIED_DATE = eINSTANCE.getPackage_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NOTES = eINSTANCE.getPackage_Notes();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__OWNER = eINSTANCE.getPackage_Owner();

		/**
		 * The meta object literal for the '<em><b>Package ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_ID = eINSTANCE.getPackage_PackageID();

		/**
		 * The meta object literal for the '<em><b>Tree Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__TREE_POS = eINSTANCE.getPackage_TreePos();

		/**
		 * The meta object literal for the '<em><b>UML Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__UML_VERSION = eINSTANCE.getPackage_UMLVersion();

		/**
		 * The meta object literal for the '<em><b>Use DTD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__USE_DTD = eINSTANCE.getPackage_UseDTD();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>XML Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__XML_PATH = eINSTANCE.getPackage_XMLPath();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DIAGRAMS = eINSTANCE.getPackage_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PARENT = eINSTANCE.getPackage_Parent();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.IsAggregate <em>Is Aggregate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.IsAggregate
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getIsAggregate()
		 * @generated
		 */
		EEnum IS_AGGREGATE = eINSTANCE.getIsAggregate();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.DirectionType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.ConnectorType <em>Connector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.ConnectorType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getConnectorType()
		 * @generated
		 */
		EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.ElementType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection <em>Parameter Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getParameterDirection()
		 * @generated
		 */
		EEnum PARAMETER_DIRECTION = eINSTANCE.getParameterDirection();

		/**
		 * The meta object literal for the '<em>Scope Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.Scope
		 * @see de.cooperateproject.eabridge.eaobjectmodel.impl.EaobjectmodelPackageImpl#getScopeObject()
		 * @generated
		 */
		EDataType SCOPE_OBJECT = eINSTANCE.getScopeObject();

	}

} //EaobjectmodelPackage
