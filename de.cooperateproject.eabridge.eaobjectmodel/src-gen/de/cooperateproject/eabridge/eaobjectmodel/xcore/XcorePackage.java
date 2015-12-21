/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ALLOW_DUPLICATES = 1;

	/**
	 * The feature id for the '<em><b>Attribute GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_GUID = 2;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
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
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PARENT = 18;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__POS = 19;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRECISION = 20;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REDEFINED_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCALE = 22;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE = 24;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STYLE_EX = 25;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED_VALUES = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 27;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = 28;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = 29;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 30;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__FQ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__TAG_GUID = 4;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__TAG_ID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Client End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CLIENT_END = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_ID = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DIRECTION = 4;

	/**
	 * The feature id for the '<em><b>End Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_POINT_X = 5;

	/**
	 * The feature id for the '<em><b>End Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_POINT_Y = 6;

	/**
	 * The feature id for the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EVENT_FLAGS = 7;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_LEAF = 8;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_SPEC = 10;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__META_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MISC_DATA = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 13;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NOTES = 14;

	/**
	 * The feature id for the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROUTE_STYLE = 15;

	/**
	 * The feature id for the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SEQUENCE_NO = 16;

	/**
	 * The feature id for the '<em><b>Start Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__START_POINT_X = 17;

	/**
	 * The feature id for the '<em><b>Start Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__START_POINT_Y = 18;

	/**
	 * The feature id for the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STATE_FLAGS = 19;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STEREOTYPE = 20;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STYLE_EX = 21;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUBTYPE = 22;

	/**
	 * The feature id for the '<em><b>Supplier End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUPPLIER_END = 23;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TAGGED_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Transition Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TRANSITION_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Transition Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TRANSITION_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Transition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TRANSITION_GUARD = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = 28;

	/**
	 * The feature id for the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VIRTUAL_INHERITANCE = 29;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__WIDTH = 30;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl <em>Connector Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorConstraint()
	 * @generated
	 */
	int CONNECTOR_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Connector Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl <em>Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorEnd()
	 * @generated
	 */
	int CONNECTOR_END = 5;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__AGGREGATION = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ALLOW_DUPLICATES = 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__CARDINALITY = 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__CONTAINMENT = 5;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__DERIVED = 6;

	/**
	 * The feature id for the '<em><b>Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__DERIVED_UNION = 7;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__END = 8;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Is Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__IS_CHANGEABLE = 10;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__IS_NAVIGABLE = 11;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__NAVIGABLE = 12;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ORDERING = 13;

	/**
	 * The feature id for the '<em><b>Owned By Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__OWNED_BY_CLASSIFIER = 14;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__QUALIFIER = 15;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ROLE = 16;

	/**
	 * The feature id for the '<em><b>Role Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ROLE_NOTE = 17;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ROLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__STEREOTYPE = 19;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__VISIBILITY = 20;

	/**
	 * The number of structural features of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl <em>Connector Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorTag()
	 * @generated
	 */
	int CONNECTOR_TAG = 6;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__FQ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__TAG_GUID = 4;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__TAG_ID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Connector Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connector Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 7;

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
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CX = 2;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CY = 3;

	/**
	 * The feature id for the '<em><b>Diagram ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_ID = 4;

	/**
	 * The feature id for the '<em><b>Diagram Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_LINKS = 5;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM_OBJECTS = 6;

	/**
	 * The feature id for the '<em><b>Extended Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__EXTENDED_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Highlight Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__HIGHLIGHT_IMPORTS = 8;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__IS_LOCKED = 9;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__META_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 11;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NOTES = 12;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ORIENTATION = 13;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PAGE_HEIGHT = 15;

	/**
	 * The feature id for the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PAGE_WIDTH = 16;

	/**
	 * The feature id for the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PARENT_ID = 17;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SCALE = 18;

	/**
	 * The feature id for the '<em><b>Show Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHOW_DETAILS = 19;

	/**
	 * The feature id for the '<em><b>Show Package Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHOW_PACKAGE_CONTENTS = 20;

	/**
	 * The feature id for the '<em><b>Show Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHOW_PRIVATE = 21;

	/**
	 * The feature id for the '<em><b>Show Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHOW_PROTECTED = 22;

	/**
	 * The feature id for the '<em><b>Show Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHOW_PUBLIC = 23;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STEREOTYPE = 24;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STYLE_EX = 25;

	/**
	 * The feature id for the '<em><b>Swimlanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SWIMLANES = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TYPE = 27;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__VERSION = 28;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramLinkImpl <em>Diagram Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramLinkImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDiagramLink()
	 * @generated
	 */
	int DIAGRAM_LINK = 8;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK__IS_HIDDEN = 4;

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
	 * The number of structural features of the '<em>Diagram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diagram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagrammObjectImpl <em>Diagramm Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagrammObjectImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDiagrammObject()
	 * @generated
	 */
	int DIAGRAMM_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__BOTTOM = 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__INSTANCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__LEFT = 4;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT__TOP = 7;

	/**
	 * The number of structural features of the '<em>Diagramm Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Diagramm Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMM_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 10;

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
	 * The feature id for the '<em><b>Association Class Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Base Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BASE_CLASSES = 6;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER = 7;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER_NAME = 8;

	/**
	 * The feature id for the '<em><b>Classifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPLEXITY = 10;

	/**
	 * The feature id for the '<em><b>Composite Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPOSITE_DIAGRAM = 11;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONNECTORS = 12;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONSTRAINTS = 13;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CREATED = 14;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DIAGRAMS = 15;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DIFFICULTY = 16;

	/**
	 * The feature id for the '<em><b>Efforts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EFFORTS = 17;

	/**
	 * The feature id for the '<em><b>Element GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_GUID = 18;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_ID = 19;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENTS = 20;

	/**
	 * The feature id for the '<em><b>Embedded Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EMBEDDED_ELEMENTS = 21;

	/**
	 * The feature id for the '<em><b>Event Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EVENT_FLAGS = 22;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION_POINTS = 23;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FILES = 24;

	/**
	 * The feature id for the '<em><b>Gen File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GEN_FILE = 25;

	/**
	 * The feature id for the '<em><b>Genlinks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GENLINKS = 26;

	/**
	 * The feature id for the '<em><b>Gen Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GEN_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_ACTIVE = 28;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_COMPOSITE = 29;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_LEAF = 30;

	/**
	 * The feature id for the '<em><b>Is New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_NEW = 31;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_SPEC = 32;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ISSUES = 33;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LOCKED = 34;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__META_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METHODS = 36;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METRICS = 37;

	/**
	 * The feature id for the '<em><b>Misc Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MISC_DATA = 38;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODIFIED = 39;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MULTIPLICITY = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 41;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOTES = 42;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PACKAGE = 43;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = 44;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PERSISTENCE = 45;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PHASE = 46;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PRIORITY = 47;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTY_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Property Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTY_TYPE_NAME = 49;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REQUIREMENTS = 50;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RESOURCES = 51;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RISKS = 52;

	/**
	 * The feature id for the '<em><b>Run State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RUN_STATE = 53;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SCENARIOS = 54;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STATUS = 55;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STEREOTYPE = 56;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE_EX = 57;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUBTYPE = 58;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TABLESPACE = 59;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAG = 60;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAGGED_VALUES = 61;

	/**
	 * The feature id for the '<em><b>Template Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TEMPLATE_PARAMETERS = 62;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TESTS = 63;

	/**
	 * The feature id for the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TREE_POS = 64;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 65;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VERSION = 66;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISIBILITY = 67;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 68;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 11;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CODE = 3;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_CONST = 4;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_LEAF = 5;

	/**
	 * The feature id for the '<em><b>Is Pure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_PURE = 6;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STATIC = 9;

	/**
	 * The feature id for the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_SYNCHRONIZED = 10;

	/**
	 * The feature id for the '<em><b>Method GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_GUID = 11;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_ID = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 13;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NOTES = 14;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 15;

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
	 * The feature id for the '<em><b>Post Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__POST_CONDITIONS = 18;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PRE_CONDITIONS = 19;

	/**
	 * The feature id for the '<em><b>Return Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_IS_ARRAY = 20;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 21;

	/**
	 * The feature id for the '<em><b>State Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATE_FLAGS = 22;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STEREOTYPE = 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STYLE = 24;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STYLE_EX = 25;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TAGGED_VALUES = 26;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 27;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl <em>Method Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodConstraint()
	 * @generated
	 */
	int METHOD_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Method Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Method Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl <em>Method Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodTag()
	 * @generated
	 */
	int METHOD_TAG = 13;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__FQ_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__METHOD_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Tag GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__TAG_GUID = 4;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__TAG_ID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Method Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Method Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALIAS = 0;

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
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONNECTORS = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DIAGRAMS = 6;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FLAGS = 9;

	/**
	 * The feature id for the '<em><b>Is Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_CONTROLLED = 10;

	/**
	 * The feature id for the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Is Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_NAMESPACE = 12;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_PROTECTED = 13;

	/**
	 * The feature id for the '<em><b>Is Version Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_VERSION_CONTROLLED = 14;

	/**
	 * The feature id for the '<em><b>Last Load Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_LOAD_DATE = 15;

	/**
	 * The feature id for the '<em><b>Last Save Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAST_SAVE_DATE = 16;

	/**
	 * The feature id for the '<em><b>Log XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LOG_XML = 17;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODIFIED = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NOTES = 20;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = 21;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_ID = 22;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = 23;

	/**
	 * The feature id for the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT_ID = 24;

	/**
	 * The feature id for the '<em><b>Tree Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TREE_POS = 25;

	/**
	 * The feature id for the '<em><b>UML Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__UML_VERSION = 26;

	/**
	 * The feature id for the '<em><b>Use DTD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USE_DTD = 27;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = 28;

	/**
	 * The feature id for the '<em><b>XML Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__XML_PATH = 29;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 30;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASSIFIER_ID = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_CONST = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KIND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 5;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NOTES = 6;

	/**
	 * The feature id for the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION_ID = 7;

	/**
	 * The feature id for the '<em><b>Parameter GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_GUID = 8;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__POSITION = 9;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STEREOTYPE = 10;

	/**
	 * The feature id for the '<em><b>Stereotype Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STEREOTYPE_EX = 11;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STYLE = 12;

	/**
	 * The feature id for the '<em><b>Style Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STYLE_EX = 13;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TAGGED_VALUES = 14;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl <em>Param Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParamTag()
	 * @generated
	 */
	int PARAM_TAG = 16;

	/**
	 * The feature id for the '<em><b>Element GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__ELEMENT_GUID = 0;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__FQ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Property GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__PROPERTY_GUID = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__TAG = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Param Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Param Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__ELEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__FQ_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Property GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__PROPERTY_GUID = 4;

	/**
	 * The feature id for the '<em><b>Property ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__PROPERTY_ID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConstraintImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PARENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__WEIGHT = 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.EffortImpl <em>Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.EffortImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getEffort()
	 * @generated
	 */
	int EFFORT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Weight2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__WEIGHT2 = 4;

	/**
	 * The number of structural features of the '<em>Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.FileImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 20;

	/**
	 * The feature id for the '<em><b>File Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.IssueImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 21;

	/**
	 * The feature id for the '<em><b>Date Reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DATE_REPORTED = 0;

	/**
	 * The feature id for the '<em><b>Date Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DATE_RESOLVED = 1;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ELEMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NOTES = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Reporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REPORTER = 6;

	/**
	 * The feature id for the '<em><b>Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLVER = 7;

	/**
	 * The feature id for the '<em><b>Resolver Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLVER_NOTES = 8;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SEVERITY = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = 10;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__VERSION = 11;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MetricImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RequirementImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 23;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DIFFICULTY = 0;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LAST_UPDATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT_ID = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Requirement ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_ID = 6;

	/**
	 * The feature id for the '<em><b>Stability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STABILITY = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATUS = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Actual Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ACTUAL_HOURS = 0;

	/**
	 * The feature id for the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DATE_END = 1;

	/**
	 * The feature id for the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DATE_START = 2;

	/**
	 * The feature id for the '<em><b>Expected Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXPECTED_HOURS = 3;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NOTES = 6;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PERCENT_COMPLETE = 7;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ROLE = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TIME = 9;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RiskImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Scenario GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_GUID = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WEIGHT = 4;

	/**
	 * The feature id for the '<em><b>XML Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__XML_CONTENT = 5;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTemplateParameter()
	 * @generated
	 */
	int TEMPLATE_PARAMETER = 27;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Template Parameter ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTest()
	 * @generated
	 */
	int TEST = 28;

	/**
	 * The feature id for the '<em><b>Acceptance Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ACCEPTANCE_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Checked By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CHECKED_BY = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Date Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DATE_RUN = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__INPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 5;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NOTES = 6;

	/**
	 * The feature id for the '<em><b>Run By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__RUN_BY = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__STATUS = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AuthorImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NOTES = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ROLES = 2;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 30;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__FAX = 1;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MOBILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOTES = 4;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ORGANIZATION = 5;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PHONE1 = 6;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PHONE2 = 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ROLES = 8;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ContainmentType <em>Containment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ContainmentType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getContainmentType()
	 * @generated
	 */
	int CONTAINMENT_TYPE = 31;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType <em>Visibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 32;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 33;

	/**
	 * The meta object id for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType <em>End Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getEndType()
	 * @generated
	 */
	int END_TYPE = 34;


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
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getAlias()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Alias();

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
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getClassifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Classifier();

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
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute#getParent()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Parent();

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
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeConstraint#getName()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Name();

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
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.AttributeTag#getFQName()
	 * @see #getAttributeTag()
	 * @generated
	 */
	EAttribute getAttributeTag_FQName();

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
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getAlias()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getClientEnd <em>Client End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client End</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getClientEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ClientEnd();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getColor()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Color();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getConnectorID()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ConnectorID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getDirection()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Direction();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointX <em>End Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point X</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_EndPointX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointY <em>End Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point Y</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEndPointY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_EndPointY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEventFlags <em>Event Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getEventFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_EventFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsLeaf()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsRoot()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getIsSpec()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMetaType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_MetaType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMiscData <em>Misc Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Misc Data</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getMiscData()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_MiscData();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getNotes()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getRouteStyle <em>Route Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getRouteStyle()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_RouteStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSequenceNo <em>Sequence No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence No</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSequenceNo()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SequenceNo();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointX <em>Start Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point X</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StartPointX();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointY <em>Start Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point Y</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStartPointY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StartPointY();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStateFlags <em>State Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStateFlags()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StateFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStereotype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getStyleEx()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSubtype()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Subtype();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSupplierEnd <em>Supplier End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier End</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getSupplierEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SupplierEnd();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTaggedValues()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Action</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionAction()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TransitionAction();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Event</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionEvent()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TransitionEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionGuard <em>Transition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Guard</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getTransitionGuard()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TransitionGuard();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getVirtualInheritance <em>Virtual Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Inheritance</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getVirtualInheritance()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_VirtualInheritance();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Connector#getWidth()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Width();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint <em>Connector Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint
	 * @generated
	 */
	EClass getConnectorConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getConnectorID()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_ConnectorID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getName()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getNotes()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorConstraint#getType()
	 * @see #getConnectorConstraint()
	 * @generated
	 */
	EAttribute getConnectorConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector End</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd
	 * @generated
	 */
	EClass getConnectorEnd();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAggregation()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAlias()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getAllowDuplicates()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getCardinality()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getConstraint()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getContainment()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Containment();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerived()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Derived();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerivedUnion <em>Derived Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Union</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getDerivedUnion()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_DerivedUnion();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getEnd()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_End();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getElement()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Element();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsChangeable <em>Is Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Changeable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsChangeable()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_IsChangeable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getIsNavigable()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_IsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getNavigable()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Navigable();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOrdering()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOwnedByClassifier <em>Owned By Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owned By Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getOwnedByClassifier()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_OwnedByClassifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getQualifier()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRole()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Role();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleNote <em>Role Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Note</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleNote()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_RoleNote();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getRoleType()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getStereotype()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorEnd#getVisibility()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EAttribute getConnectorEnd_Visibility();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag <em>Connector Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag
	 * @generated
	 */
	EClass getConnectorTag();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getConnector()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EReference getConnectorTag_Connector();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getFQName()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getName()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getNotes()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagGUID()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getTagID()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ConnectorTag#getValue()
	 * @see #getConnectorTag()
	 * @generated
	 */
	EAttribute getConnectorTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getAuthor()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCreatedDate()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCx()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Cx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getCy()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Cy();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramID <em>Diagram ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramID()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_DiagramID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramLinks <em>Diagram Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Links</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramLinks()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_DiagramLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramObjects <em>Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Objects</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getDiagramObjects()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_DiagramObjects();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getExtendedStyle <em>Extended Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getExtendedStyle()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ExtendedStyle();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getHighlightImports <em>Highlight Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highlight Imports</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getHighlightImports()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_HighlightImports();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getIsLocked <em>Is Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Locked</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getIsLocked()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_IsLocked();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getMetaType()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_MetaType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getNotes()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getOrientation()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Orientation();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPackage()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Package();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageHeight <em>Page Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Height</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageHeight()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_PageHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageWidth <em>Page Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Width</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getPageWidth()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_PageWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getParentID <em>Parent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getParentID()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ParentID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getScale()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Scale();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowDetails <em>Show Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Details</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowDetails()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ShowDetails();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPackageContents <em>Show Package Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Package Contents</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPackageContents()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ShowPackageContents();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPrivate <em>Show Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Private</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPrivate()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ShowPrivate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowProtected <em>Show Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Protected</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowProtected()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ShowProtected();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPublic <em>Show Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Public</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getShowPublic()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ShowPublic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStereotype()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getStyleEx()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getSwimlanes <em>Swimlanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swimlanes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getSwimlanes()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Swimlanes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getType()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Diagram#getVersion()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Version();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Link</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink
	 * @generated
	 */
	EClass getDiagramLink();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getConnector()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EReference getDiagramLink_Connector();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getDiagram()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EReference getDiagramLink_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getGeometry()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getInstanceID()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_InstanceID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getIsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hidden</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getIsHidden()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_IsHidden();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getPath()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagramLink#getStyle()
	 * @see #getDiagramLink()
	 * @generated
	 */
	EAttribute getDiagramLink_Style();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject <em>Diagramm Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagramm Object</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject
	 * @generated
	 */
	EClass getDiagrammObject();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getBottom()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EAttribute getDiagrammObject_Bottom();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getDiagram()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EReference getDiagrammObject_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getElement()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EReference getDiagrammObject_Element();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getInstanceID()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EAttribute getDiagrammObject_InstanceID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getLeft()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EAttribute getDiagrammObject_Left();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getRight()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EAttribute getDiagrammObject_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getSequence()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EAttribute getDiagrammObject_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DiagrammObject#getTop()
	 * @see #getDiagrammObject()
	 * @generated
	 */
	EAttribute getDiagrammObject_Top();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAbstract()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getActionFlags <em>Action Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getActionFlags()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ActionFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAlias()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAssociationClassConnectorID <em>Association Class Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Class Connector ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAssociationClassConnectorID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_AssociationClassConnectorID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getAuthor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getBaseClasses <em>Base Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Classes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getBaseClasses()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_BaseClasses();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifier()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ClassifierName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierType <em>Classifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getClassifierType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ClassifierType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getComplexity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Complexity();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCompositeDiagram <em>Composite Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Diagram</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCompositeDiagram()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_CompositeDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getConnectors()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getConstraints()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getCreated()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Created();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDiagrams()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Diagrams();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getDifficulty()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Difficulty();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEfforts <em>Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Efforts</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEfforts()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Efforts();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementGUID <em>Element GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementGUID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElementID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEmbeddedElements <em>Embedded Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEmbeddedElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_EmbeddedElements();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEventFlags <em>Event Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getEventFlags()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_EventFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Points</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getExtensionPoints()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ExtensionPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getFiles()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Files();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenFile <em>Gen File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen File</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenFile()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_GenFile();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenlinks <em>Genlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genlinks</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenlinks()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Genlinks();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenType <em>Gen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getGenType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_GenType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsActive()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsComposite()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsLeaf()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsNew <em>Is New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is New</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsNew()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsNew();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIsSpec()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getIssues()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Issues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getLocked()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Locked();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetaType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MetaType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMethods()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMetrics()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Metrics();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMiscData <em>Misc Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Misc Data</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMiscData()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MiscData();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getModified()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getMultiplicity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getNotes()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Notes();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPackage()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Package();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getParent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPersistence()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Persistence();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPhase()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Phase();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPriority()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PropertyType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyTypeName <em>Property Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getPropertyTypeName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PropertyTypeName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRequirements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getResources()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risks</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRisks()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Risks();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRunState <em>Run State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run State</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getRunState()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_RunState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getScenarios()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Scenarios();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStatus()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStereotype()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getStyleEx()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_StyleEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getSubtype()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTablespace()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Tablespace();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTag()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTaggedValues()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_TaggedValues();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTemplateParameters <em>Template Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Parameters</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTemplateParameters()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_TemplateParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTests()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Tests();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTreePos <em>Tree Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getTreePos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_TreePos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVersion()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Element#getVisibility()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Visibility();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getBehavior()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Behavior();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifier</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getClassifier()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getCode()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsConst()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsLeaf()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsPure <em>Is Pure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pure</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsPure()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsPure();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsQuery()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsQuery();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsRoot()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsSynchronized <em>Is Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronized</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getIsSynchronized()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodGUID <em>Method GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodGUID()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getMethodID()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getNotes()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getParent()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPos()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Pos();

	/**
	 * Returns the meta object for the reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPostConditions <em>Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Post Conditions</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPostConditions()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_PostConditions();

	/**
	 * Returns the meta object for the reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre Conditions</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getPreConditions()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_PreConditions();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnIsArray <em>Return Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Is Array</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnIsArray()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnIsArray();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStateFlags <em>State Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStateFlags()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_StateFlags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStereotype()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyle()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getStyleEx()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getTaggedValues()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint <em>Method Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint
	 * @generated
	 */
	EClass getMethodConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getMethod()
	 * @see #getMethodConstraint()
	 * @generated
	 */
	EReference getMethodConstraint_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getName()
	 * @see #getMethodConstraint()
	 * @generated
	 */
	EAttribute getMethodConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getNotes()
	 * @see #getMethodConstraint()
	 * @generated
	 */
	EAttribute getMethodConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodConstraint#getType()
	 * @see #getMethodConstraint()
	 * @generated
	 */
	EAttribute getMethodConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag <em>Method Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag
	 * @generated
	 */
	EClass getMethodTag();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getFQName()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getMethodID()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_MethodID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getName()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getNotes()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagGUID <em>Tag GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagGUID()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_TagGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getTagID()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_TagID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.MethodTag#getValue()
	 * @see #getMethodTag()
	 * @generated
	 */
	EAttribute getMethodTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getAlias()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchLoad <em>Batch Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Load</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchLoad()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_BatchLoad();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchSave <em>Batch Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Save</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getBatchSave()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_BatchSave();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCodePath <em>Code Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCodePath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_CodePath();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getConnectors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getCreated()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Created();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getDiagrams()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Diagrams();

	/**
	 * Returns the meta object for the containment reference '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Elements();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getFlags()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Flags();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsControlled <em>Is Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Controlled</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsControlled()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsControlled();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsModel <em>Is Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Model</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsModel()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsModel();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsNamespace <em>Is Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Namespace</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsNamespace();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsProtected <em>Is Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Protected</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsProtected()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsProtected();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsVersionControlled <em>Is Version Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Version Controlled</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getIsVersionControlled()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsVersionControlled();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastLoadDate <em>Last Load Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Load Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastLoadDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LastLoadDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastSaveDate <em>Last Save Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Save Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLastSaveDate()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LastSaveDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLogXML <em>Log XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log XML</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getLogXML()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LogXML();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getModified()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getNotes()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getOwner()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Owner();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackageID <em>Package ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackageID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackageID();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getParentID <em>Parent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getParentID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ParentID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getTreePos <em>Tree Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Pos</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getTreePos()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_TreePos();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUMLVersion <em>UML Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UML Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUMLVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_UMLVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUseDTD <em>Use DTD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use DTD</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getUseDTD()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_UseDTD();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getXMLPath <em>XML Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XML Path</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Package#getXMLPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_XMLPath();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getAlias()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getClassifierID <em>Classifier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getClassifierID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ClassifierID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getIsConst()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getKind()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Kind();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getNotes()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getOperationID <em>Operation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getOperationID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_OperationID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getParameterGUID <em>Parameter GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getParameterGUID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getPosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Position();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotype()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotypeEx <em>Stereotype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStereotypeEx()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_StereotypeEx();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyle()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyleEx <em>Style Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ex</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getStyleEx()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_StyleEx();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Parameter#getTaggedValues()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_TaggedValues();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag <em>Param Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag
	 * @generated
	 */
	EClass getParamTag();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getElementGUID <em>Element GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getElementGUID()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_ElementGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getFQName()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getPropertyGUID <em>Property GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getPropertyGUID()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_PropertyGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getTag()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_Tag();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ParamTag#getValue()
	 * @see #getParamTag()
	 * @generated
	 */
	EAttribute getParamTag_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getElementID()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_ElementID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getFQName <em>FQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FQ Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getFQName()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_FQName();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getName()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getNotes()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyGUID <em>Property GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyGUID()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_PropertyGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getPropertyID()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_PropertyID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getNotes()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getParentID <em>Parent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getParentID()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ParentID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getStatus()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Constraint#getWeight()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Weight();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effort</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort
	 * @generated
	 */
	EClass getEffort();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getName()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getNotes()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getType()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getWeight()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Weight();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getWeight2 <em>Weight2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight2</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Effort#getWeight2()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Weight2();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getFileDate <em>File Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Date</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getFileDate()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileDate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getNotes()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.File#getType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getDateReported <em>Date Reported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Reported</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getDateReported()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DateReported();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getDateResolved <em>Date Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Resolved</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getDateResolved()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DateResolved();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getElementID()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_ElementID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getName()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getNotes()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getPriority()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getReporter <em>Reporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reporter</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getReporter()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Reporter();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getResolver <em>Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getResolver()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Resolver();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getResolverNotes <em>Resolver Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getResolverNotes()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_ResolverNotes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getSeverity()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Severity();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Issue#getVersion()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Version();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getNotes()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getType()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Metric#getWeight()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Weight();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getDifficulty()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getLastUpdate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_LastUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getNotes()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getParentID <em>Parent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getParentID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ParentID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getRequirementID <em>Requirement ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getRequirementID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RequirementID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getStability <em>Stability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stability</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getStability()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Stability();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getActualHours <em>Actual Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Hours</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getActualHours()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ActualHours();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getDateEnd <em>Date End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date End</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getDateEnd()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_DateEnd();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getDateStart <em>Date Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Start</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getDateStart()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_DateStart();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getExpectedHours <em>Expected Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Hours</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getExpectedHours()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ExpectedHours();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getHistory()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_History();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getNotes()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Complete</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getPercentComplete()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_PercentComplete();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getRole()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Role();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Resource#getTime()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Time();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getName()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getNotes()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getType()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Risk#getWeight()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Weight();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getNotes()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getScenarioGUID <em>Scenario GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario GUID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getScenarioGUID()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenarioGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getType()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getWeight()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Weight();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getXMLContent <em>XML Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XML Content</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Scenario#getXMLContent()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_XMLContent();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter
	 * @generated
	 */
	EClass getTemplateParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getConstraint()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EAttribute getTemplateParameter_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getDefault()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EAttribute getTemplateParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getName()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EAttribute getTemplateParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getTemplateParameterID <em>Template Parameter ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Parameter ID</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getTemplateParameterID()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EAttribute getTemplateParameter_TemplateParameterID();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.TemplateParameter#getType()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EAttribute getTemplateParameter_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getAcceptanceCriteria <em>Acceptance Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Criteria</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getAcceptanceCriteria()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_AcceptanceCriteria();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getCheckedBy <em>Checked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked By</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getCheckedBy()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_CheckedBy();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getClass_()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Class();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getDateRun <em>Date Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Run</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getDateRun()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_DateRun();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getInput()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Input();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getNotes()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getRunBy <em>Run By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run By</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getRunBy()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_RunBy();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getStatus()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Test#getType()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Type();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Author#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Author#getNotes()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Author#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Author#getRoles()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Roles();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getEmail()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getFax()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Fax();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getMobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getMobile()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Mobile();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getNotes()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Notes();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getOrganization()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Organization();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getPhone1 <em>Phone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone1</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getPhone1()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Phone1();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getPhone2 <em>Phone2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone2</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getPhone2()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Phone2();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.Client#getRoles()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Roles();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ContainmentType <em>Containment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Containment Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ContainmentType
	 * @generated
	 */
	EEnum getContainmentType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType
	 * @generated
	 */
	EEnum getVisibilityType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Type</em>'.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType
	 * @generated
	 */
	EEnum getEndType();

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
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ALIAS = eINSTANCE.getAttribute_Alias();

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
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CLASSIFIER = eINSTANCE.getAttribute_Classifier();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__NAME = eINSTANCE.getAttributeConstraint_Name();

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
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TAG__FQ_NAME = eINSTANCE.getAttributeTag_FQName();

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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ALIAS = eINSTANCE.getConnector_Alias();

		/**
		 * The meta object literal for the '<em><b>Client End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CLIENT_END = eINSTANCE.getConnector_ClientEnd();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__COLOR = eINSTANCE.getConnector_Color();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__CONNECTOR_ID = eINSTANCE.getConnector_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DIRECTION = eINSTANCE.getConnector_Direction();

		/**
		 * The meta object literal for the '<em><b>End Point X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__END_POINT_X = eINSTANCE.getConnector_EndPointX();

		/**
		 * The meta object literal for the '<em><b>End Point Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__END_POINT_Y = eINSTANCE.getConnector_EndPointY();

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
		 * The meta object literal for the '<em><b>Meta Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__META_TYPE = eINSTANCE.getConnector_MetaType();

		/**
		 * The meta object literal for the '<em><b>Misc Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__MISC_DATA = eINSTANCE.getConnector_MiscData();

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
		 * The meta object literal for the '<em><b>Sequence No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SEQUENCE_NO = eINSTANCE.getConnector_SequenceNo();

		/**
		 * The meta object literal for the '<em><b>Start Point X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__START_POINT_X = eINSTANCE.getConnector_StartPointX();

		/**
		 * The meta object literal for the '<em><b>Start Point Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__START_POINT_Y = eINSTANCE.getConnector_StartPointY();

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
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SUBTYPE = eINSTANCE.getConnector_Subtype();

		/**
		 * The meta object literal for the '<em><b>Supplier End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SUPPLIER_END = eINSTANCE.getConnector_SupplierEnd();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TAGGED_VALUES = eINSTANCE.getConnector_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Transition Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TRANSITION_ACTION = eINSTANCE.getConnector_TransitionAction();

		/**
		 * The meta object literal for the '<em><b>Transition Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TRANSITION_EVENT = eINSTANCE.getConnector_TransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Transition Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TRANSITION_GUARD = eINSTANCE.getConnector_TransitionGuard();

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
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__WIDTH = eINSTANCE.getConnector_Width();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl <em>Connector Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorConstraint()
		 * @generated
		 */
		EClass CONNECTOR_CONSTRAINT = eINSTANCE.getConnectorConstraint();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__CONNECTOR_ID = eINSTANCE.getConnectorConstraint_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__NAME = eINSTANCE.getConnectorConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__NOTES = eINSTANCE.getConnectorConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_CONSTRAINT__TYPE = eINSTANCE.getConnectorConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl <em>Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorEndImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorEnd()
		 * @generated
		 */
		EClass CONNECTOR_END = eINSTANCE.getConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__AGGREGATION = eINSTANCE.getConnectorEnd_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__ALIAS = eINSTANCE.getConnectorEnd_Alias();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__ALLOW_DUPLICATES = eINSTANCE.getConnectorEnd_AllowDuplicates();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__CARDINALITY = eINSTANCE.getConnectorEnd_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__CONSTRAINT = eINSTANCE.getConnectorEnd_Constraint();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__CONTAINMENT = eINSTANCE.getConnectorEnd_Containment();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__DERIVED = eINSTANCE.getConnectorEnd_Derived();

		/**
		 * The meta object literal for the '<em><b>Derived Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__DERIVED_UNION = eINSTANCE.getConnectorEnd_DerivedUnion();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__END = eINSTANCE.getConnectorEnd_End();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__ELEMENT = eINSTANCE.getConnectorEnd_Element();

		/**
		 * The meta object literal for the '<em><b>Is Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__IS_CHANGEABLE = eINSTANCE.getConnectorEnd_IsChangeable();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__IS_NAVIGABLE = eINSTANCE.getConnectorEnd_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__NAVIGABLE = eINSTANCE.getConnectorEnd_Navigable();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__ORDERING = eINSTANCE.getConnectorEnd_Ordering();

		/**
		 * The meta object literal for the '<em><b>Owned By Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__OWNED_BY_CLASSIFIER = eINSTANCE.getConnectorEnd_OwnedByClassifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__QUALIFIER = eINSTANCE.getConnectorEnd_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__ROLE = eINSTANCE.getConnectorEnd_Role();

		/**
		 * The meta object literal for the '<em><b>Role Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__ROLE_NOTE = eINSTANCE.getConnectorEnd_RoleNote();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__ROLE_TYPE = eINSTANCE.getConnectorEnd_RoleType();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__STEREOTYPE = eINSTANCE.getConnectorEnd_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_END__VISIBILITY = eINSTANCE.getConnectorEnd_Visibility();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl <em>Connector Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConnectorTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConnectorTag()
		 * @generated
		 */
		EClass CONNECTOR_TAG = eINSTANCE.getConnectorTag();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TAG__CONNECTOR = eINSTANCE.getConnectorTag_Connector();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__FQ_NAME = eINSTANCE.getConnectorTag_FQName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__NAME = eINSTANCE.getConnectorTag_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__NOTES = eINSTANCE.getConnectorTag_Notes();

		/**
		 * The meta object literal for the '<em><b>Tag GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__TAG_GUID = eINSTANCE.getConnectorTag_TagGUID();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__TAG_ID = eINSTANCE.getConnectorTag_TagID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TAG__VALUE = eINSTANCE.getConnectorTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDiagram()
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
		 * The meta object literal for the '<em><b>Extended Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__EXTENDED_STYLE = eINSTANCE.getDiagram_ExtendedStyle();

		/**
		 * The meta object literal for the '<em><b>Highlight Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__HIGHLIGHT_IMPORTS = eINSTANCE.getDiagram_HighlightImports();

		/**
		 * The meta object literal for the '<em><b>Is Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__IS_LOCKED = eINSTANCE.getDiagram_IsLocked();

		/**
		 * The meta object literal for the '<em><b>Meta Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__META_TYPE = eINSTANCE.getDiagram_MetaType();

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
		 * The meta object literal for the '<em><b>Page Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__PAGE_HEIGHT = eINSTANCE.getDiagram_PageHeight();

		/**
		 * The meta object literal for the '<em><b>Page Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__PAGE_WIDTH = eINSTANCE.getDiagram_PageWidth();

		/**
		 * The meta object literal for the '<em><b>Parent ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__PARENT_ID = eINSTANCE.getDiagram_ParentID();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SCALE = eINSTANCE.getDiagram_Scale();

		/**
		 * The meta object literal for the '<em><b>Show Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SHOW_DETAILS = eINSTANCE.getDiagram_ShowDetails();

		/**
		 * The meta object literal for the '<em><b>Show Package Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SHOW_PACKAGE_CONTENTS = eINSTANCE.getDiagram_ShowPackageContents();

		/**
		 * The meta object literal for the '<em><b>Show Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SHOW_PRIVATE = eINSTANCE.getDiagram_ShowPrivate();

		/**
		 * The meta object literal for the '<em><b>Show Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SHOW_PROTECTED = eINSTANCE.getDiagram_ShowProtected();

		/**
		 * The meta object literal for the '<em><b>Show Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__SHOW_PUBLIC = eINSTANCE.getDiagram_ShowPublic();

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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramLinkImpl <em>Diagram Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagramLinkImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDiagramLink()
		 * @generated
		 */
		EClass DIAGRAM_LINK = eINSTANCE.getDiagramLink();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_LINK__IS_HIDDEN = eINSTANCE.getDiagramLink_IsHidden();

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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagrammObjectImpl <em>Diagramm Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.DiagrammObjectImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDiagrammObject()
		 * @generated
		 */
		EClass DIAGRAMM_OBJECT = eINSTANCE.getDiagrammObject();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMM_OBJECT__BOTTOM = eINSTANCE.getDiagrammObject_Bottom();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMM_OBJECT__DIAGRAM = eINSTANCE.getDiagrammObject_Diagram();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMM_OBJECT__ELEMENT = eINSTANCE.getDiagrammObject_Element();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMM_OBJECT__INSTANCE_ID = eINSTANCE.getDiagrammObject_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMM_OBJECT__LEFT = eINSTANCE.getDiagrammObject_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMM_OBJECT__RIGHT = eINSTANCE.getDiagrammObject_Right();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMM_OBJECT__SEQUENCE = eINSTANCE.getDiagrammObject_Sequence();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMM_OBJECT__TOP = eINSTANCE.getDiagrammObject_Top();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ElementImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getElement()
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
		 * The meta object literal for the '<em><b>Association Class Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ASSOCIATION_CLASS_CONNECTOR_ID = eINSTANCE.getElement_AssociationClassConnectorID();

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
		 * The meta object literal for the '<em><b>Base Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__BASE_CLASSES = eINSTANCE.getElement_BaseClasses();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CLASSIFIER = eINSTANCE.getElement_Classifier();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSIFIER_NAME = eINSTANCE.getElement_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Classifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSIFIER_TYPE = eINSTANCE.getElement_ClassifierType();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMPLEXITY = eINSTANCE.getElement_Complexity();

		/**
		 * The meta object literal for the '<em><b>Composite Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__COMPOSITE_DIAGRAM = eINSTANCE.getElement_CompositeDiagram();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONNECTORS = eINSTANCE.getElement_Connectors();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONSTRAINTS = eINSTANCE.getElement_Constraints();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CREATED = eINSTANCE.getElement_Created();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__DIAGRAMS = eINSTANCE.getElement_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DIFFICULTY = eINSTANCE.getElement_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Efforts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EFFORTS = eINSTANCE.getElement_Efforts();

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
		 * The meta object literal for the '<em><b>Embedded Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EMBEDDED_ELEMENTS = eINSTANCE.getElement_EmbeddedElements();

		/**
		 * The meta object literal for the '<em><b>Event Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EVENT_FLAGS = eINSTANCE.getElement_EventFlags();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EXTENSION_POINTS = eINSTANCE.getElement_ExtensionPoints();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__FILES = eINSTANCE.getElement_Files();

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
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_COMPOSITE = eINSTANCE.getElement_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_LEAF = eINSTANCE.getElement_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_NEW = eINSTANCE.getElement_IsNew();

		/**
		 * The meta object literal for the '<em><b>Is Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_SPEC = eINSTANCE.getElement_IsSpec();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ISSUES = eINSTANCE.getElement_Issues();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LOCKED = eINSTANCE.getElement_Locked();

		/**
		 * The meta object literal for the '<em><b>Meta Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__META_TYPE = eINSTANCE.getElement_MetaType();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__METHODS = eINSTANCE.getElement_Methods();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__METRICS = eINSTANCE.getElement_Metrics();

		/**
		 * The meta object literal for the '<em><b>Misc Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MISC_DATA = eINSTANCE.getElement_MiscData();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MODIFIED = eINSTANCE.getElement_Modified();

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
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PRIORITY = eINSTANCE.getElement_Priority();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PROPERTY_TYPE = eINSTANCE.getElement_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Property Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PROPERTY_TYPE_NAME = eINSTANCE.getElement_PropertyTypeName();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__REQUIREMENTS = eINSTANCE.getElement_Requirements();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RESOURCES = eINSTANCE.getElement_Resources();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RISKS = eINSTANCE.getElement_Risks();

		/**
		 * The meta object literal for the '<em><b>Run State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RUN_STATE = eINSTANCE.getElement_RunState();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SCENARIOS = eINSTANCE.getElement_Scenarios();

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
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SUBTYPE = eINSTANCE.getElement_Subtype();

		/**
		 * The meta object literal for the '<em><b>Tablespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TABLESPACE = eINSTANCE.getElement_Tablespace();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TAG = eINSTANCE.getElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TAGGED_VALUES = eINSTANCE.getElement_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Template Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TEMPLATE_PARAMETERS = eINSTANCE.getElement_TemplateParameters();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TESTS = eINSTANCE.getElement_Tests();

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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BEHAVIOR = eINSTANCE.getMethod_Behavior();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CLASSIFIER = eINSTANCE.getMethod_Classifier();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

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
		 * The meta object literal for the '<em><b>Post Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__POST_CONDITIONS = eINSTANCE.getMethod_PostConditions();

		/**
		 * The meta object literal for the '<em><b>Pre Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PRE_CONDITIONS = eINSTANCE.getMethod_PreConditions();

		/**
		 * The meta object literal for the '<em><b>Return Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_IS_ARRAY = eINSTANCE.getMethod_ReturnIsArray();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

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
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TAGGED_VALUES = eINSTANCE.getMethod_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl <em>Method Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodConstraint()
		 * @generated
		 */
		EClass METHOD_CONSTRAINT = eINSTANCE.getMethodConstraint();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CONSTRAINT__METHOD = eINSTANCE.getMethodConstraint_Method();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONSTRAINT__NAME = eINSTANCE.getMethodConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONSTRAINT__NOTES = eINSTANCE.getMethodConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CONSTRAINT__TYPE = eINSTANCE.getMethodConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl <em>Method Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MethodTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMethodTag()
		 * @generated
		 */
		EClass METHOD_TAG = eINSTANCE.getMethodTag();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__FQ_NAME = eINSTANCE.getMethodTag_FQName();

		/**
		 * The meta object literal for the '<em><b>Method ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__METHOD_ID = eINSTANCE.getMethodTag_MethodID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__NAME = eINSTANCE.getMethodTag_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__NOTES = eINSTANCE.getMethodTag_Notes();

		/**
		 * The meta object literal for the '<em><b>Tag GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__TAG_GUID = eINSTANCE.getMethodTag_TagGUID();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__TAG_ID = eINSTANCE.getMethodTag_TagID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TAG__VALUE = eINSTANCE.getMethodTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.PackageImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ALIAS = eINSTANCE.getPackage_Alias();

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
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONNECTORS = eINSTANCE.getPackage_Connectors();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CREATED = eINSTANCE.getPackage_Created();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DIAGRAMS = eINSTANCE.getPackage_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENT = eINSTANCE.getPackage_Element();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

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
		 * The meta object literal for the '<em><b>Is Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_MODEL = eINSTANCE.getPackage_IsModel();

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
		 * The meta object literal for the '<em><b>Is Version Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__IS_VERSION_CONTROLLED = eINSTANCE.getPackage_IsVersionControlled();

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
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__MODIFIED = eINSTANCE.getPackage_Modified();

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
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Parent ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PARENT_ID = eINSTANCE.getPackage_ParentID();

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
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParameterImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ALIAS = eINSTANCE.getParameter_Alias();

		/**
		 * The meta object literal for the '<em><b>Classifier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CLASSIFIER_ID = eINSTANCE.getParameter_ClassifierID();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__IS_CONST = eINSTANCE.getParameter_IsConst();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KIND = eINSTANCE.getParameter_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NOTES = eINSTANCE.getParameter_Notes();

		/**
		 * The meta object literal for the '<em><b>Operation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPERATION_ID = eINSTANCE.getParameter_OperationID();

		/**
		 * The meta object literal for the '<em><b>Parameter GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_GUID = eINSTANCE.getParameter_ParameterGUID();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__POSITION = eINSTANCE.getParameter_Position();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STEREOTYPE = eINSTANCE.getParameter_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Stereotype Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STEREOTYPE_EX = eINSTANCE.getParameter_StereotypeEx();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STYLE = eINSTANCE.getParameter_Style();

		/**
		 * The meta object literal for the '<em><b>Style Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STYLE_EX = eINSTANCE.getParameter_StyleEx();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TAGGED_VALUES = eINSTANCE.getParameter_TaggedValues();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl <em>Param Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ParamTagImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getParamTag()
		 * @generated
		 */
		EClass PARAM_TAG = eINSTANCE.getParamTag();

		/**
		 * The meta object literal for the '<em><b>Element GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__ELEMENT_GUID = eINSTANCE.getParamTag_ElementGUID();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__FQ_NAME = eINSTANCE.getParamTag_FQName();

		/**
		 * The meta object literal for the '<em><b>Property GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__PROPERTY_GUID = eINSTANCE.getParamTag_PropertyGUID();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__TAG = eINSTANCE.getParamTag_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TAG__VALUE = eINSTANCE.getParamTag_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TaggedValueImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__ELEMENT_ID = eINSTANCE.getTaggedValue_ElementID();

		/**
		 * The meta object literal for the '<em><b>FQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__FQ_NAME = eINSTANCE.getTaggedValue_FQName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__NAME = eINSTANCE.getTaggedValue_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__NOTES = eINSTANCE.getTaggedValue_Notes();

		/**
		 * The meta object literal for the '<em><b>Property GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__PROPERTY_GUID = eINSTANCE.getTaggedValue_PropertyGUID();

		/**
		 * The meta object literal for the '<em><b>Property ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__PROPERTY_ID = eINSTANCE.getTaggedValue_PropertyID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ConstraintImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NOTES = eINSTANCE.getConstraint_Notes();

		/**
		 * The meta object literal for the '<em><b>Parent ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__PARENT_ID = eINSTANCE.getConstraint_ParentID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__STATUS = eINSTANCE.getConstraint_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__WEIGHT = eINSTANCE.getConstraint_Weight();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.EffortImpl <em>Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.EffortImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getEffort()
		 * @generated
		 */
		EClass EFFORT = eINSTANCE.getEffort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__NAME = eINSTANCE.getEffort_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__NOTES = eINSTANCE.getEffort_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__TYPE = eINSTANCE.getEffort_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__WEIGHT = eINSTANCE.getEffort_Weight();

		/**
		 * The meta object literal for the '<em><b>Weight2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__WEIGHT2 = eINSTANCE.getEffort_Weight2();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.FileImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>File Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_DATE = eINSTANCE.getFile_FileDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NOTES = eINSTANCE.getFile_Notes();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SIZE = eINSTANCE.getFile_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TYPE = eINSTANCE.getFile_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.IssueImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Date Reported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DATE_REPORTED = eINSTANCE.getIssue_DateReported();

		/**
		 * The meta object literal for the '<em><b>Date Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DATE_RESOLVED = eINSTANCE.getIssue_DateResolved();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ELEMENT_ID = eINSTANCE.getIssue_ElementID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__NAME = eINSTANCE.getIssue_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__NOTES = eINSTANCE.getIssue_Notes();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__PRIORITY = eINSTANCE.getIssue_Priority();

		/**
		 * The meta object literal for the '<em><b>Reporter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__REPORTER = eINSTANCE.getIssue_Reporter();

		/**
		 * The meta object literal for the '<em><b>Resolver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__RESOLVER = eINSTANCE.getIssue_Resolver();

		/**
		 * The meta object literal for the '<em><b>Resolver Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__RESOLVER_NOTES = eINSTANCE.getIssue_ResolverNotes();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SEVERITY = eINSTANCE.getIssue_Severity();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__VERSION = eINSTANCE.getIssue_Version();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.MetricImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NOTES = eINSTANCE.getMetric_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TYPE = eINSTANCE.getMetric_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__WEIGHT = eINSTANCE.getMetric_Weight();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RequirementImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DIFFICULTY = eINSTANCE.getRequirement_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LAST_UPDATE = eINSTANCE.getRequirement_LastUpdate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NOTES = eINSTANCE.getRequirement_Notes();

		/**
		 * The meta object literal for the '<em><b>Parent ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PARENT_ID = eINSTANCE.getRequirement_ParentID();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Requirement ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIREMENT_ID = eINSTANCE.getRequirement_RequirementID();

		/**
		 * The meta object literal for the '<em><b>Stability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STABILITY = eINSTANCE.getRequirement_Stability();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATUS = eINSTANCE.getRequirement_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ResourceImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Actual Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ACTUAL_HOURS = eINSTANCE.getResource_ActualHours();

		/**
		 * The meta object literal for the '<em><b>Date End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DATE_END = eINSTANCE.getResource_DateEnd();

		/**
		 * The meta object literal for the '<em><b>Date Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DATE_START = eINSTANCE.getResource_DateStart();

		/**
		 * The meta object literal for the '<em><b>Expected Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__EXPECTED_HOURS = eINSTANCE.getResource_ExpectedHours();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__HISTORY = eINSTANCE.getResource_History();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NOTES = eINSTANCE.getResource_Notes();

		/**
		 * The meta object literal for the '<em><b>Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PERCENT_COMPLETE = eINSTANCE.getResource_PercentComplete();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ROLE = eINSTANCE.getResource_Role();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TIME = eINSTANCE.getResource_Time();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RiskImpl <em>Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.RiskImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getRisk()
		 * @generated
		 */
		EClass RISK = eINSTANCE.getRisk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__NAME = eINSTANCE.getRisk_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__NOTES = eINSTANCE.getRisk_Notes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__TYPE = eINSTANCE.getRisk_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__WEIGHT = eINSTANCE.getRisk_Weight();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ScenarioImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NOTES = eINSTANCE.getScenario_Notes();

		/**
		 * The meta object literal for the '<em><b>Scenario GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIO_GUID = eINSTANCE.getScenario_ScenarioGUID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TYPE = eINSTANCE.getScenario_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__WEIGHT = eINSTANCE.getScenario_Weight();

		/**
		 * The meta object literal for the '<em><b>XML Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__XML_CONTENT = eINSTANCE.getScenario_XMLContent();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TemplateParameterImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTemplateParameter()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER__CONSTRAINT = eINSTANCE.getTemplateParameter_Constraint();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER__DEFAULT = eINSTANCE.getTemplateParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER__NAME = eINSTANCE.getTemplateParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Template Parameter ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER__TEMPLATE_PARAMETER_ID = eINSTANCE.getTemplateParameter_TemplateParameterID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER__TYPE = eINSTANCE.getTemplateParameter_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.TestImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Acceptance Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ACCEPTANCE_CRITERIA = eINSTANCE.getTest_AcceptanceCriteria();

		/**
		 * The meta object literal for the '<em><b>Checked By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__CHECKED_BY = eINSTANCE.getTest_CheckedBy();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__CLASS = eINSTANCE.getTest_Class();

		/**
		 * The meta object literal for the '<em><b>Date Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__DATE_RUN = eINSTANCE.getTest_DateRun();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__INPUT = eINSTANCE.getTest_Input();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NOTES = eINSTANCE.getTest_Notes();

		/**
		 * The meta object literal for the '<em><b>Run By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__RUN_BY = eINSTANCE.getTest_RunBy();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__STATUS = eINSTANCE.getTest_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__TYPE = eINSTANCE.getTest_Type();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.AuthorImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NOTES = eINSTANCE.getAuthor_Notes();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ROLES = eINSTANCE.getAuthor_Roles();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.ClientImpl
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__EMAIL = eINSTANCE.getClient_Email();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__FAX = eINSTANCE.getClient_Fax();

		/**
		 * The meta object literal for the '<em><b>Mobile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__MOBILE = eINSTANCE.getClient_Mobile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NOTES = eINSTANCE.getClient_Notes();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ORGANIZATION = eINSTANCE.getClient_Organization();

		/**
		 * The meta object literal for the '<em><b>Phone1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__PHONE1 = eINSTANCE.getClient_Phone1();

		/**
		 * The meta object literal for the '<em><b>Phone2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__PHONE2 = eINSTANCE.getClient_Phone2();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ROLES = eINSTANCE.getClient_Roles();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.ContainmentType <em>Containment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.ContainmentType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getContainmentType()
		 * @generated
		 */
		EEnum CONTAINMENT_TYPE = eINSTANCE.getContainmentType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType <em>Visibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.VisibilityType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getVisibilityType()
		 * @generated
		 */
		EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.DirectionType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType <em>End Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.EndType
		 * @see de.cooperateproject.eabridge.eaobjectmodel.xcore.impl.XcorePackageImpl#getEndType()
		 * @generated
		 */
		EEnum END_TYPE = eINSTANCE.getEndType();

	}

} //XcorePackage
