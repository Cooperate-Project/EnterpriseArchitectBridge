/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.DirectionType;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.ElementType;
import de.cooperateproject.eabridge.eaobjectmodel.IsAggregate;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.ParameterDirection;
import de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import de.cooperateproject.eabridge.eaobjectmodel.util.GeometryMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EaobjectmodelPackageImpl extends EPackageImpl implements EaobjectmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodparameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isAggregateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geometryMapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EaobjectmodelPackageImpl() {
		super(eNS_URI, EaobjectmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EaobjectmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EaobjectmodelPackage init() {
		if (isInited) return (EaobjectmodelPackage)EPackage.Registry.INSTANCE.getEPackage(EaobjectmodelPackage.eNS_URI);

		// Obtain or create and register package
		EaobjectmodelPackageImpl theEaobjectmodelPackage = (EaobjectmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EaobjectmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EaobjectmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEaobjectmodelPackage.createPackageContents();

		// Initialize created meta-data
		theEaobjectmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEaobjectmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EaobjectmodelPackage.eNS_URI, theEaobjectmodelPackage);
		return theEaobjectmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeReference_Classifier() {
		return (EReference)typeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeReference_TypeName() {
		return (EAttribute)typeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__SetType__Element() {
		return typeReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__SetType__PrimitiveType() {
		return typeReferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__SetType__String() {
		return typeReferenceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__GetPrimitiveType() {
		return typeReferenceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AllowDuplicates() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeGUID() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeID() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttributeType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Container() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Containment() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Constraints() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Default() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsCollection() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsConst() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsDerived() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsOrdered() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsStatic() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Length() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_LowerBound() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Notes() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Parent() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Pos() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Precision() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Scale() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Stereotype() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Style() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_StyleEx() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_TaggedValues() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_UpperBound() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Scope() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_GenOption() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConstraint() {
		return attributeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_ElementOfAttribute() {
		return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_Attribute() {
		return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConstraint_Constraint() {
		return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConstraint_AttName() {
		return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConstraint_Notes() {
		return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConstraint_Type() {
		return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTag() {
		return attributeTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTag_Attribute() {
		return (EReference)attributeTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTag_Name() {
		return (EAttribute)attributeTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTag_Notes() {
		return (EAttribute)attributeTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTag_TagGUID() {
		return (EAttribute)attributeTagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTag_TagID() {
		return (EAttribute)attributeTagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeTag_Value() {
		return (EAttribute)attributeTagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_ConnectorID() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_ConnectorGUID() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Direction() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PtEndX() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PtEndY() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_EventFlags() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_IsLeaf() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_IsRoot() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_IsSpec() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Name() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Notes() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_RouteStyle() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SeqNo() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PtStartX() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PtStartY() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_ActionFlags() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_StateFlags() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Stereotype() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_StyleEx() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SubType() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Type() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_VirtualInheritance() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Source() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Dest() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceCard() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceAccess() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceElement() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceRole() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceRoleType() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceRoleNote() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceContainment() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceIsAggregate() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceIsOrdered() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceQualifier() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceChangeable() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceConstraint() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceIsNavigable() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceStereotype() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceStyle() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceTS() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestCard() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestAccess() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestElement() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestRole() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestRoleType() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestRoleNote() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestContainment() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestIsAggregate() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestIsOrdered() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestQualifier() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestChangeable() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestConstraint() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestIsNavigable() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestStereotype() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestStyle() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DestTS() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Top_Start_Label() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Top_Mid_Label() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Top_End_Label() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Btm_Start_Label() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Btm_Mid_Label() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Btm_End_Label() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Start_Edge() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_End_Edge() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_HeadStyle() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_LineStyle() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_DispatchAction() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PDATA1() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PDATA2() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PDATA3() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PDATA4() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_PDATA5() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetSourceLower() {
		return connectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetSourceUpper() {
		return connectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetDestLower() {
		return connectorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetDestUpper() {
		return connectorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetSourceAlias() {
		return connectorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__GetDestAlias() {
		return connectorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Author() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_CreatedDate() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_ModifiedDate() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Cx() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Cy() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_DiagramGUID() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_DiagramID() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_DiagramLinks() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_DiagramObjects() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Notes() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Orientation() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Package() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Scale() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Stereotype() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_StyleEx() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Swimlanes() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Type() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Version() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_AttPub() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_AttPri() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_AttPro() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramLink() {
		return diagramLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramLink_Connector() {
		return (EReference)diagramLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramLink_Diagram() {
		return (EReference)diagramLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_Geometry() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_InstanceID() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_Hidden() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_Path() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_Style() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_SX() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_SY() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_EX() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramLink_EY() {
		return (EAttribute)diagramLinkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramLink__SetGeometry__int_int_int_int() {
		return diagramLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramLink__SetSX__int() {
		return diagramLinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramLink__SetSY__int() {
		return diagramLinkEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramLink__SetEX__int() {
		return diagramLinkEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramLink__SetEY__int() {
		return diagramLinkEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramObject() {
		return diagramObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Bottom() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramObject_Diagram() {
		return (EReference)diagramObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramObject_Element() {
		return (EReference)diagramObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_InstanceID() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Left() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Right() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Sequence() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_ObjectStyle() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Top() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Abstract() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ActionFlags() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Alias() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Attributes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Author() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Classifier() {
		return (EReference)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Classifier_guid() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Complexity() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_CreatedDate() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ElementGUID() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ElementID() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Elements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_EventFlags() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_GenFile() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Genlinks() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_GenType() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_IsActive() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_IsLeaf() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_IsSpec() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Methods() {
		return (EReference)elementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ModifiedDate() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Multiplicity() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Notes() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Package() {
		return (EReference)elementEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Parent() {
		return (EReference)elementEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Persistence() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Phase() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_RunState() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Status() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Stereotype() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_StyleEx() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_TreePos() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Type() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Version() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Visibility() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Style() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Backcolor() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_BorderStyle() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_BorderWidth() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Fontcolor() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Bordercolor() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Cardinality() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Concurrency() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_PDATA1() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_SourceRelations() {
		return (EReference)elementEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_ReturnType() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameters() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Abstract() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Behaviour() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Code() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsConst() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsLeaf() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsPure() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsQuery() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsRoot() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsStatic() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsSynchronized() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_MethodGUID() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_MethodID() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Notes() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parent() {
		return (EReference)methodEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Pos() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnIsArray() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_StateFlags() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Stereotype() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Style() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_StyleEx() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Throws() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Visibility() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Concurrency() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_GenOption() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodparameter() {
		return methodparameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodparameter_Ea_guid() {
		return (EAttribute)methodparameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodparameter_ParameterType() {
		return (EReference)methodparameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodparameter_Name() {
		return (EAttribute)methodparameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodparameter_Method() {
		return (EReference)methodparameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodparameter_Kind() {
		return (EAttribute)methodparameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_PackageGUID() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_BatchLoad() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_BatchSave() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_CodePath() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_CreatedDate() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Flags() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_IsControlled() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_IsNamespace() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_IsProtected() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_LastLoadDate() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_LastSaveDate() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_LogXML() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_ModifiedDate() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Notes() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Owner() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_PackageID() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_TreePos() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_UMLVersion() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_UseDTD() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_XMLPath() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Packages() {
		return (EReference)packageEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Diagrams() {
		return (EReference)packageEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Elements() {
		return (EReference)packageEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Parent() {
		return (EReference)packageEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsAggregate() {
		return isAggregateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorType() {
		return connectorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementType() {
		return elementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirection() {
		return parameterDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScopeObject() {
		return scopeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGeometryMap() {
		return geometryMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaobjectmodelFactory getEaobjectmodelFactory() {
		return (EaobjectmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typeReferenceEClass = createEClass(TYPE_REFERENCE);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__CLASSIFIER);
		createEAttribute(typeReferenceEClass, TYPE_REFERENCE__TYPE_NAME);
		createEOperation(typeReferenceEClass, TYPE_REFERENCE___SET_TYPE__ELEMENT);
		createEOperation(typeReferenceEClass, TYPE_REFERENCE___SET_TYPE__PRIMITIVETYPE);
		createEOperation(typeReferenceEClass, TYPE_REFERENCE___SET_TYPE__STRING);
		createEOperation(typeReferenceEClass, TYPE_REFERENCE___GET_PRIMITIVE_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ALLOW_DUPLICATES);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_GUID);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_ID);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__CONTAINER);
		createEAttribute(attributeEClass, ATTRIBUTE__CONTAINMENT);
		createEReference(attributeEClass, ATTRIBUTE__CONSTRAINTS);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_COLLECTION);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_CONST);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_DERIVED);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_ORDERED);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_STATIC);
		createEAttribute(attributeEClass, ATTRIBUTE__LENGTH);
		createEAttribute(attributeEClass, ATTRIBUTE__LOWER_BOUND);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__NOTES);
		createEReference(attributeEClass, ATTRIBUTE__PARENT);
		createEAttribute(attributeEClass, ATTRIBUTE__POS);
		createEAttribute(attributeEClass, ATTRIBUTE__PRECISION);
		createEAttribute(attributeEClass, ATTRIBUTE__SCALE);
		createEAttribute(attributeEClass, ATTRIBUTE__STEREOTYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__STYLE);
		createEAttribute(attributeEClass, ATTRIBUTE__STYLE_EX);
		createEReference(attributeEClass, ATTRIBUTE__TAGGED_VALUES);
		createEAttribute(attributeEClass, ATTRIBUTE__UPPER_BOUND);
		createEAttribute(attributeEClass, ATTRIBUTE__SCOPE);
		createEAttribute(attributeEClass, ATTRIBUTE__GEN_OPTION);

		attributeConstraintEClass = createEClass(ATTRIBUTE_CONSTRAINT);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__ELEMENT_OF_ATTRIBUTE);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__ATTRIBUTE);
		createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__CONSTRAINT);
		createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__ATT_NAME);
		createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__NOTES);
		createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__TYPE);

		attributeTagEClass = createEClass(ATTRIBUTE_TAG);
		createEReference(attributeTagEClass, ATTRIBUTE_TAG__ATTRIBUTE);
		createEAttribute(attributeTagEClass, ATTRIBUTE_TAG__NAME);
		createEAttribute(attributeTagEClass, ATTRIBUTE_TAG__NOTES);
		createEAttribute(attributeTagEClass, ATTRIBUTE_TAG__TAG_GUID);
		createEAttribute(attributeTagEClass, ATTRIBUTE_TAG__TAG_ID);
		createEAttribute(attributeTagEClass, ATTRIBUTE_TAG__VALUE);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__CONNECTOR_ID);
		createEAttribute(connectorEClass, CONNECTOR__CONNECTOR_GUID);
		createEAttribute(connectorEClass, CONNECTOR__DIRECTION);
		createEAttribute(connectorEClass, CONNECTOR__PT_END_X);
		createEAttribute(connectorEClass, CONNECTOR__PT_END_Y);
		createEAttribute(connectorEClass, CONNECTOR__EVENT_FLAGS);
		createEAttribute(connectorEClass, CONNECTOR__IS_LEAF);
		createEAttribute(connectorEClass, CONNECTOR__IS_ROOT);
		createEAttribute(connectorEClass, CONNECTOR__IS_SPEC);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEAttribute(connectorEClass, CONNECTOR__NOTES);
		createEAttribute(connectorEClass, CONNECTOR__ROUTE_STYLE);
		createEAttribute(connectorEClass, CONNECTOR__SEQ_NO);
		createEAttribute(connectorEClass, CONNECTOR__PT_START_X);
		createEAttribute(connectorEClass, CONNECTOR__PT_START_Y);
		createEAttribute(connectorEClass, CONNECTOR__ACTION_FLAGS);
		createEAttribute(connectorEClass, CONNECTOR__STATE_FLAGS);
		createEAttribute(connectorEClass, CONNECTOR__STEREOTYPE);
		createEAttribute(connectorEClass, CONNECTOR__STYLE_EX);
		createEAttribute(connectorEClass, CONNECTOR__SUB_TYPE);
		createEAttribute(connectorEClass, CONNECTOR__TYPE);
		createEAttribute(connectorEClass, CONNECTOR__VIRTUAL_INHERITANCE);
		createEReference(connectorEClass, CONNECTOR__SOURCE);
		createEReference(connectorEClass, CONNECTOR__DEST);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_CARD);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_ACCESS);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_ELEMENT);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_ROLE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_ROLE_TYPE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_ROLE_NOTE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_CONTAINMENT);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_IS_AGGREGATE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_IS_ORDERED);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_QUALIFIER);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_CHANGEABLE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_CONSTRAINT);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_IS_NAVIGABLE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_STEREOTYPE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_STYLE);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_TS);
		createEAttribute(connectorEClass, CONNECTOR__DEST_CARD);
		createEAttribute(connectorEClass, CONNECTOR__DEST_ACCESS);
		createEAttribute(connectorEClass, CONNECTOR__DEST_ELEMENT);
		createEAttribute(connectorEClass, CONNECTOR__DEST_ROLE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_ROLE_TYPE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_ROLE_NOTE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_CONTAINMENT);
		createEAttribute(connectorEClass, CONNECTOR__DEST_IS_AGGREGATE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_IS_ORDERED);
		createEAttribute(connectorEClass, CONNECTOR__DEST_QUALIFIER);
		createEAttribute(connectorEClass, CONNECTOR__DEST_CHANGEABLE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_CONSTRAINT);
		createEAttribute(connectorEClass, CONNECTOR__DEST_IS_NAVIGABLE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_STEREOTYPE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_STYLE);
		createEAttribute(connectorEClass, CONNECTOR__DEST_TS);
		createEAttribute(connectorEClass, CONNECTOR__TOP_START_LABEL);
		createEAttribute(connectorEClass, CONNECTOR__TOP_MID_LABEL);
		createEAttribute(connectorEClass, CONNECTOR__TOP_END_LABEL);
		createEAttribute(connectorEClass, CONNECTOR__BTM_START_LABEL);
		createEAttribute(connectorEClass, CONNECTOR__BTM_MID_LABEL);
		createEAttribute(connectorEClass, CONNECTOR__BTM_END_LABEL);
		createEAttribute(connectorEClass, CONNECTOR__START_EDGE);
		createEAttribute(connectorEClass, CONNECTOR__END_EDGE);
		createEAttribute(connectorEClass, CONNECTOR__HEAD_STYLE);
		createEAttribute(connectorEClass, CONNECTOR__LINE_STYLE);
		createEAttribute(connectorEClass, CONNECTOR__DISPATCH_ACTION);
		createEAttribute(connectorEClass, CONNECTOR__PDATA1);
		createEAttribute(connectorEClass, CONNECTOR__PDATA2);
		createEAttribute(connectorEClass, CONNECTOR__PDATA3);
		createEAttribute(connectorEClass, CONNECTOR__PDATA4);
		createEAttribute(connectorEClass, CONNECTOR__PDATA5);
		createEOperation(connectorEClass, CONNECTOR___GET_SOURCE_LOWER);
		createEOperation(connectorEClass, CONNECTOR___GET_SOURCE_UPPER);
		createEOperation(connectorEClass, CONNECTOR___GET_DEST_LOWER);
		createEOperation(connectorEClass, CONNECTOR___GET_DEST_UPPER);
		createEOperation(connectorEClass, CONNECTOR___GET_SOURCE_ALIAS);
		createEOperation(connectorEClass, CONNECTOR___GET_DEST_ALIAS);

		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__AUTHOR);
		createEAttribute(diagramEClass, DIAGRAM__CREATED_DATE);
		createEAttribute(diagramEClass, DIAGRAM__MODIFIED_DATE);
		createEAttribute(diagramEClass, DIAGRAM__CX);
		createEAttribute(diagramEClass, DIAGRAM__CY);
		createEAttribute(diagramEClass, DIAGRAM__DIAGRAM_GUID);
		createEAttribute(diagramEClass, DIAGRAM__DIAGRAM_ID);
		createEReference(diagramEClass, DIAGRAM__DIAGRAM_LINKS);
		createEReference(diagramEClass, DIAGRAM__DIAGRAM_OBJECTS);
		createEAttribute(diagramEClass, DIAGRAM__NAME);
		createEAttribute(diagramEClass, DIAGRAM__NOTES);
		createEAttribute(diagramEClass, DIAGRAM__ORIENTATION);
		createEReference(diagramEClass, DIAGRAM__PACKAGE);
		createEAttribute(diagramEClass, DIAGRAM__SCALE);
		createEAttribute(diagramEClass, DIAGRAM__STEREOTYPE);
		createEAttribute(diagramEClass, DIAGRAM__STYLE_EX);
		createEAttribute(diagramEClass, DIAGRAM__SWIMLANES);
		createEAttribute(diagramEClass, DIAGRAM__TYPE);
		createEAttribute(diagramEClass, DIAGRAM__VERSION);
		createEAttribute(diagramEClass, DIAGRAM__ATT_PUB);
		createEAttribute(diagramEClass, DIAGRAM__ATT_PRI);
		createEAttribute(diagramEClass, DIAGRAM__ATT_PRO);

		diagramLinkEClass = createEClass(DIAGRAM_LINK);
		createEReference(diagramLinkEClass, DIAGRAM_LINK__CONNECTOR);
		createEReference(diagramLinkEClass, DIAGRAM_LINK__DIAGRAM);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__GEOMETRY);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__INSTANCE_ID);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__HIDDEN);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__PATH);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__STYLE);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__SX);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__SY);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__EX);
		createEAttribute(diagramLinkEClass, DIAGRAM_LINK__EY);
		createEOperation(diagramLinkEClass, DIAGRAM_LINK___SET_GEOMETRY__INT_INT_INT_INT);
		createEOperation(diagramLinkEClass, DIAGRAM_LINK___SET_SX__INT);
		createEOperation(diagramLinkEClass, DIAGRAM_LINK___SET_SY__INT);
		createEOperation(diagramLinkEClass, DIAGRAM_LINK___SET_EX__INT);
		createEOperation(diagramLinkEClass, DIAGRAM_LINK___SET_EY__INT);

		diagramObjectEClass = createEClass(DIAGRAM_OBJECT);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__BOTTOM);
		createEReference(diagramObjectEClass, DIAGRAM_OBJECT__DIAGRAM);
		createEReference(diagramObjectEClass, DIAGRAM_OBJECT__ELEMENT);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__INSTANCE_ID);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__LEFT);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__RIGHT);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__SEQUENCE);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__OBJECT_STYLE);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__TOP);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ABSTRACT);
		createEAttribute(elementEClass, ELEMENT__ACTION_FLAGS);
		createEAttribute(elementEClass, ELEMENT__ALIAS);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEAttribute(elementEClass, ELEMENT__AUTHOR);
		createEReference(elementEClass, ELEMENT__CLASSIFIER);
		createEAttribute(elementEClass, ELEMENT__CLASSIFIER_GUID);
		createEAttribute(elementEClass, ELEMENT__COMPLEXITY);
		createEAttribute(elementEClass, ELEMENT__CREATED_DATE);
		createEAttribute(elementEClass, ELEMENT__ELEMENT_GUID);
		createEAttribute(elementEClass, ELEMENT__ELEMENT_ID);
		createEReference(elementEClass, ELEMENT__ELEMENTS);
		createEAttribute(elementEClass, ELEMENT__EVENT_FLAGS);
		createEAttribute(elementEClass, ELEMENT__GEN_FILE);
		createEAttribute(elementEClass, ELEMENT__GENLINKS);
		createEAttribute(elementEClass, ELEMENT__GEN_TYPE);
		createEAttribute(elementEClass, ELEMENT__IS_ACTIVE);
		createEAttribute(elementEClass, ELEMENT__IS_LEAF);
		createEAttribute(elementEClass, ELEMENT__IS_SPEC);
		createEReference(elementEClass, ELEMENT__METHODS);
		createEAttribute(elementEClass, ELEMENT__MODIFIED_DATE);
		createEAttribute(elementEClass, ELEMENT__MULTIPLICITY);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__NOTES);
		createEReference(elementEClass, ELEMENT__PACKAGE);
		createEReference(elementEClass, ELEMENT__PARENT);
		createEAttribute(elementEClass, ELEMENT__PERSISTENCE);
		createEAttribute(elementEClass, ELEMENT__PHASE);
		createEAttribute(elementEClass, ELEMENT__RUN_STATE);
		createEAttribute(elementEClass, ELEMENT__STATUS);
		createEAttribute(elementEClass, ELEMENT__STEREOTYPE);
		createEAttribute(elementEClass, ELEMENT__STYLE_EX);
		createEAttribute(elementEClass, ELEMENT__TREE_POS);
		createEAttribute(elementEClass, ELEMENT__TYPE);
		createEAttribute(elementEClass, ELEMENT__VERSION);
		createEAttribute(elementEClass, ELEMENT__VISIBILITY);
		createEAttribute(elementEClass, ELEMENT__STYLE);
		createEAttribute(elementEClass, ELEMENT__BACKCOLOR);
		createEAttribute(elementEClass, ELEMENT__BORDER_STYLE);
		createEAttribute(elementEClass, ELEMENT__BORDER_WIDTH);
		createEAttribute(elementEClass, ELEMENT__FONTCOLOR);
		createEAttribute(elementEClass, ELEMENT__BORDERCOLOR);
		createEAttribute(elementEClass, ELEMENT__CARDINALITY);
		createEAttribute(elementEClass, ELEMENT__CONCURRENCY);
		createEAttribute(elementEClass, ELEMENT__PDATA1);
		createEReference(elementEClass, ELEMENT__SOURCE_RELATIONS);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__RETURN_TYPE);
		createEReference(methodEClass, METHOD__PARAMETERS);
		createEAttribute(methodEClass, METHOD__ABSTRACT);
		createEAttribute(methodEClass, METHOD__BEHAVIOUR);
		createEAttribute(methodEClass, METHOD__CODE);
		createEAttribute(methodEClass, METHOD__IS_CONST);
		createEAttribute(methodEClass, METHOD__IS_LEAF);
		createEAttribute(methodEClass, METHOD__IS_PURE);
		createEAttribute(methodEClass, METHOD__IS_QUERY);
		createEAttribute(methodEClass, METHOD__IS_ROOT);
		createEAttribute(methodEClass, METHOD__IS_STATIC);
		createEAttribute(methodEClass, METHOD__IS_SYNCHRONIZED);
		createEAttribute(methodEClass, METHOD__METHOD_GUID);
		createEAttribute(methodEClass, METHOD__METHOD_ID);
		createEAttribute(methodEClass, METHOD__NAME);
		createEAttribute(methodEClass, METHOD__NOTES);
		createEReference(methodEClass, METHOD__PARENT);
		createEAttribute(methodEClass, METHOD__POS);
		createEAttribute(methodEClass, METHOD__RETURN_IS_ARRAY);
		createEAttribute(methodEClass, METHOD__STATE_FLAGS);
		createEAttribute(methodEClass, METHOD__STEREOTYPE);
		createEAttribute(methodEClass, METHOD__STYLE);
		createEAttribute(methodEClass, METHOD__STYLE_EX);
		createEAttribute(methodEClass, METHOD__THROWS);
		createEAttribute(methodEClass, METHOD__VISIBILITY);
		createEAttribute(methodEClass, METHOD__CONCURRENCY);
		createEAttribute(methodEClass, METHOD__GEN_OPTION);

		methodparameterEClass = createEClass(METHODPARAMETER);
		createEAttribute(methodparameterEClass, METHODPARAMETER__EA_GUID);
		createEReference(methodparameterEClass, METHODPARAMETER__PARAMETER_TYPE);
		createEAttribute(methodparameterEClass, METHODPARAMETER__NAME);
		createEReference(methodparameterEClass, METHODPARAMETER__METHOD);
		createEAttribute(methodparameterEClass, METHODPARAMETER__KIND);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__PACKAGE_GUID);
		createEAttribute(packageEClass, PACKAGE__BATCH_LOAD);
		createEAttribute(packageEClass, PACKAGE__BATCH_SAVE);
		createEAttribute(packageEClass, PACKAGE__CODE_PATH);
		createEAttribute(packageEClass, PACKAGE__CREATED_DATE);
		createEAttribute(packageEClass, PACKAGE__FLAGS);
		createEAttribute(packageEClass, PACKAGE__IS_CONTROLLED);
		createEAttribute(packageEClass, PACKAGE__IS_NAMESPACE);
		createEAttribute(packageEClass, PACKAGE__IS_PROTECTED);
		createEAttribute(packageEClass, PACKAGE__LAST_LOAD_DATE);
		createEAttribute(packageEClass, PACKAGE__LAST_SAVE_DATE);
		createEAttribute(packageEClass, PACKAGE__LOG_XML);
		createEAttribute(packageEClass, PACKAGE__MODIFIED_DATE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEAttribute(packageEClass, PACKAGE__NOTES);
		createEAttribute(packageEClass, PACKAGE__OWNER);
		createEAttribute(packageEClass, PACKAGE__PACKAGE_ID);
		createEAttribute(packageEClass, PACKAGE__TREE_POS);
		createEAttribute(packageEClass, PACKAGE__UML_VERSION);
		createEAttribute(packageEClass, PACKAGE__USE_DTD);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEAttribute(packageEClass, PACKAGE__XML_PATH);
		createEReference(packageEClass, PACKAGE__PACKAGES);
		createEReference(packageEClass, PACKAGE__DIAGRAMS);
		createEReference(packageEClass, PACKAGE__ELEMENTS);
		createEReference(packageEClass, PACKAGE__PARENT);

		// Create enums
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		scopeEEnum = createEEnum(SCOPE);
		isAggregateEEnum = createEEnum(IS_AGGREGATE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		connectorTypeEEnum = createEEnum(CONNECTOR_TYPE);
		elementTypeEEnum = createEEnum(ELEMENT_TYPE);
		parameterDirectionEEnum = createEEnum(PARAMETER_DIRECTION);

		// Create data types
		scopeObjectEDataType = createEDataType(SCOPE_OBJECT);
		geometryMapEDataType = createEDataType(GEOMETRY_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeReference_Classifier(), this.getElement(), null, "classifier", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeReference_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTypeReference__SetType__Element(), null, "setType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "classifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeReference__SetType__PrimitiveType(), null, "setType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPrimitiveType(), "primitiveType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeReference__SetType__String(), null, "setType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "notExistentType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTypeReference__GetPrimitiveType(), this.getPrimitiveType(), "getPrimitiveType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_AllowDuplicates(), ecorePackage.getEBooleanObject(), "AllowDuplicates", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributeGUID(), ecorePackage.getEString(), "AttributeGUID", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributeID(), ecorePackage.getELongObject(), "AttributeID", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_AttributeType(), this.getTypeReference(), null, "AttributeType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Container(), ecorePackage.getEString(), "Container", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Containment(), ecorePackage.getEString(), "Containment", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Constraints(), this.getAttributeConstraint(), null, "Constraints", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Default(), ecorePackage.getEString(), "Default", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsCollection(), ecorePackage.getEBooleanObject(), "IsCollection", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsConst(), ecorePackage.getEBooleanObject(), "IsConst", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsDerived(), ecorePackage.getEBooleanObject(), "IsDerived", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsOrdered(), ecorePackage.getEBooleanObject(), "IsOrdered", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsStatic(), ecorePackage.getEBooleanObject(), "IsStatic", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Length(), ecorePackage.getEString(), "Length", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_LowerBound(), ecorePackage.getEString(), "LowerBound", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Parent(), this.getElement(), this.getElement_Attributes(), "Parent", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Pos(), ecorePackage.getELongObject(), "Pos", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Precision(), ecorePackage.getEString(), "Precision", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Scale(), ecorePackage.getEString(), "Scale", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Stereotype(), ecorePackage.getEString(), "Stereotype", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Style(), ecorePackage.getEString(), "Style", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_StyleEx(), ecorePackage.getEString(), "StyleEx", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_TaggedValues(), this.getAttributeTag(), this.getAttributeTag_Attribute(), "TaggedValues", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_UpperBound(), ecorePackage.getEString(), "UpperBound", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Scope(), this.getScope(), "Scope", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_GenOption(), ecorePackage.getEString(), "GenOption", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeConstraintEClass, AttributeConstraint.class, "AttributeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeConstraint_ElementOfAttribute(), this.getElement(), null, "ElementOfAttribute", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraint_Attribute(), this.getAttribute(), null, "Attribute", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeConstraint_Constraint(), ecorePackage.getEString(), "Constraint", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeConstraint_AttName(), ecorePackage.getEString(), "AttName", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeConstraint_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeConstraint_Type(), ecorePackage.getEString(), "Type", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTagEClass, AttributeTag.class, "AttributeTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeTag_Attribute(), this.getAttribute(), this.getAttribute_TaggedValues(), "Attribute", null, 0, 1, AttributeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeTag_Name(), ecorePackage.getEString(), "Name", null, 0, 1, AttributeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeTag_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, AttributeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeTag_TagGUID(), ecorePackage.getEString(), "TagGUID", null, 0, 1, AttributeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeTag_TagID(), ecorePackage.getELongObject(), "TagID", null, 0, 1, AttributeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeTag_Value(), ecorePackage.getEString(), "Value", null, 0, 1, AttributeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_ConnectorID(), ecorePackage.getELongObject(), "ConnectorID", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_ConnectorGUID(), ecorePackage.getEString(), "ConnectorGUID", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Direction(), this.getDirectionType(), "Direction", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PtEndX(), ecorePackage.getELongObject(), "PtEndX", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PtEndY(), ecorePackage.getELongObject(), "PtEndY", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_EventFlags(), ecorePackage.getEString(), "EventFlags", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_IsLeaf(), ecorePackage.getEBooleanObject(), "IsLeaf", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_IsRoot(), ecorePackage.getEBooleanObject(), "IsRoot", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_IsSpec(), ecorePackage.getEBooleanObject(), "IsSpec", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_RouteStyle(), ecorePackage.getELongObject(), "RouteStyle", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SeqNo(), ecorePackage.getELongObject(), "SeqNo", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PtStartX(), ecorePackage.getELongObject(), "PtStartX", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PtStartY(), ecorePackage.getELongObject(), "PtStartY", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_ActionFlags(), ecorePackage.getEString(), "ActionFlags", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_StateFlags(), ecorePackage.getEString(), "StateFlags", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Stereotype(), ecorePackage.getEString(), "Stereotype", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_StyleEx(), ecorePackage.getEString(), "StyleEx", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SubType(), ecorePackage.getEString(), "SubType", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Type(), this.getConnectorType(), "Type", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_VirtualInheritance(), ecorePackage.getEString(), "VirtualInheritance", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Source(), this.getElement(), this.getElement_SourceRelations(), "Source", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Dest(), this.getElement(), null, "Dest", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceCard(), ecorePackage.getEString(), "SourceCard", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceAccess(), ecorePackage.getEString(), "SourceAccess", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceElement(), ecorePackage.getEString(), "SourceElement", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceRole(), ecorePackage.getEString(), "SourceRole", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceRoleType(), ecorePackage.getEString(), "SourceRoleType", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceRoleNote(), ecorePackage.getEString(), "SourceRoleNote", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceContainment(), ecorePackage.getEString(), "SourceContainment", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceIsAggregate(), this.getIsAggregate(), "SourceIsAggregate", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceIsOrdered(), ecorePackage.getEBoolean(), "SourceIsOrdered", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceQualifier(), ecorePackage.getEString(), "SourceQualifier", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceChangeable(), ecorePackage.getEString(), "SourceChangeable", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceConstraint(), ecorePackage.getEString(), "SourceConstraint", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceIsNavigable(), ecorePackage.getEBoolean(), "SourceIsNavigable", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceStereotype(), ecorePackage.getEString(), "SourceStereotype", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceStyle(), ecorePackage.getEString(), "SourceStyle", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SourceTS(), ecorePackage.getEString(), "SourceTS", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestCard(), ecorePackage.getEString(), "DestCard", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestAccess(), ecorePackage.getEString(), "DestAccess", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestElement(), ecorePackage.getEString(), "DestElement", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestRole(), ecorePackage.getEString(), "DestRole", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestRoleType(), ecorePackage.getEString(), "DestRoleType", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestRoleNote(), ecorePackage.getEString(), "DestRoleNote", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestContainment(), ecorePackage.getEString(), "DestContainment", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestIsAggregate(), this.getIsAggregate(), "DestIsAggregate", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestIsOrdered(), ecorePackage.getEBoolean(), "DestIsOrdered", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestQualifier(), ecorePackage.getEString(), "DestQualifier", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestChangeable(), ecorePackage.getEString(), "DestChangeable", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestConstraint(), ecorePackage.getEString(), "DestConstraint", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestIsNavigable(), ecorePackage.getEBoolean(), "DestIsNavigable", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestStereotype(), ecorePackage.getEString(), "DestStereotype", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestStyle(), ecorePackage.getEString(), "DestStyle", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DestTS(), ecorePackage.getEString(), "DestTS", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Top_Start_Label(), ecorePackage.getEString(), "Top_Start_Label", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Top_Mid_Label(), ecorePackage.getEString(), "Top_Mid_Label", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Top_End_Label(), ecorePackage.getEString(), "Top_End_Label", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Btm_Start_Label(), ecorePackage.getEString(), "Btm_Start_Label", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Btm_Mid_Label(), ecorePackage.getEString(), "Btm_Mid_Label", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Btm_End_Label(), ecorePackage.getEString(), "Btm_End_Label", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Start_Edge(), ecorePackage.getEInt(), "Start_Edge", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_End_Edge(), ecorePackage.getEInt(), "End_Edge", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_HeadStyle(), ecorePackage.getEInt(), "HeadStyle", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_LineStyle(), ecorePackage.getEInt(), "LineStyle", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_DispatchAction(), ecorePackage.getEString(), "DispatchAction", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PDATA1(), ecorePackage.getEString(), "PDATA1", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PDATA2(), ecorePackage.getEString(), "PDATA2", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PDATA3(), ecorePackage.getEString(), "PDATA3", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PDATA4(), ecorePackage.getEString(), "PDATA4", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PDATA5(), ecorePackage.getEString(), "PDATA5", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConnector__GetSourceLower(), ecorePackage.getEIntegerObject(), "getSourceLower", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__GetSourceUpper(), ecorePackage.getEIntegerObject(), "getSourceUpper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__GetDestLower(), ecorePackage.getEIntegerObject(), "getDestLower", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__GetDestUpper(), ecorePackage.getEIntegerObject(), "getDestUpper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__GetSourceAlias(), ecorePackage.getEString(), "getSourceAlias", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__GetDestAlias(), ecorePackage.getEString(), "getDestAlias", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Author(), ecorePackage.getEString(), "Author", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_CreatedDate(), ecorePackage.getEDate(), "CreatedDate", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_ModifiedDate(), ecorePackage.getEDate(), "ModifiedDate", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Cx(), ecorePackage.getELongObject(), "cx", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Cy(), ecorePackage.getELongObject(), "cy", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_DiagramGUID(), ecorePackage.getEString(), "DiagramGUID", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_DiagramID(), ecorePackage.getELongObject(), "DiagramID", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_DiagramLinks(), this.getDiagramLink(), this.getDiagramLink_Diagram(), "DiagramLinks", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_DiagramObjects(), this.getDiagramObject(), this.getDiagramObject_Diagram(), "DiagramObjects", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Orientation(), ecorePackage.getEString(), "Orientation", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Package(), this.getPackage(), this.getPackage_Diagrams(), "Package", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Scale(), ecorePackage.getELongObject(), "Scale", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Stereotype(), ecorePackage.getEString(), "Stereotype", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_StyleEx(), ecorePackage.getEString(), "StyleEx", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Swimlanes(), ecorePackage.getEString(), "Swimlanes", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Type(), ecorePackage.getEString(), "Type", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Version(), ecorePackage.getEString(), "Version", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_AttPub(), ecorePackage.getEInt(), "AttPub", "1", 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_AttPri(), ecorePackage.getEInt(), "AttPri", "1", 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_AttPro(), ecorePackage.getEInt(), "AttPro", "1", 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramLinkEClass, DiagramLink.class, "DiagramLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramLink_Connector(), this.getConnector(), null, "Connector", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramLink_Diagram(), this.getDiagram(), this.getDiagram_DiagramLinks(), "Diagram", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_Geometry(), ecorePackage.getEString(), "Geometry", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_InstanceID(), ecorePackage.getELongObject(), "InstanceID", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_Hidden(), ecorePackage.getEBooleanObject(), "Hidden", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_Path(), ecorePackage.getEString(), "Path", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_Style(), ecorePackage.getEString(), "Style", null, 0, 1, DiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_SX(), ecorePackage.getEString(), "SX", null, 0, 1, DiagramLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_SY(), ecorePackage.getEString(), "SY", null, 0, 1, DiagramLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_EX(), ecorePackage.getEString(), "EX", null, 0, 1, DiagramLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramLink_EY(), ecorePackage.getEString(), "EY", null, 0, 1, DiagramLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiagramLink__SetGeometry__int_int_int_int(), null, "setGeometry", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "SX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "SY", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "EX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "EY", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiagramLink__SetSX__int(), null, "setSX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiagramLink__SetSY__int(), null, "setSY", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiagramLink__SetEX__int(), null, "setEX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiagramLink__SetEY__int(), null, "setEY", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(diagramObjectEClass, DiagramObject.class, "DiagramObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramObject_Bottom(), ecorePackage.getELongObject(), "Bottom", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramObject_Diagram(), this.getDiagram(), this.getDiagram_DiagramObjects(), "Diagram", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramObject_Element(), this.getElement(), null, "Element", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramObject_InstanceID(), ecorePackage.getELongObject(), "InstanceID", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramObject_Left(), ecorePackage.getELongObject(), "Left", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramObject_Right(), ecorePackage.getELongObject(), "Right", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramObject_Sequence(), ecorePackage.getELongObject(), "Sequence", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramObject_ObjectStyle(), ecorePackage.getEString(), "ObjectStyle", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramObject_Top(), ecorePackage.getELongObject(), "Top", null, 0, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Abstract(), ecorePackage.getEString(), "Abstract", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ActionFlags(), ecorePackage.getEString(), "ActionFlags", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Alias(), ecorePackage.getEString(), "Alias", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), this.getAttribute(), this.getAttribute_Parent(), "Attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Author(), ecorePackage.getEString(), "Author", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Classifier(), this.getElement(), null, "Classifier", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Classifier_guid(), ecorePackage.getEString(), "Classifier_guid", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Complexity(), ecorePackage.getEString(), "Complexity", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_CreatedDate(), ecorePackage.getEDate(), "CreatedDate", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ElementGUID(), ecorePackage.getEString(), "ElementGUID", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ElementID(), ecorePackage.getELongObject(), "ElementID", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Elements(), this.getElement(), this.getElement_Parent(), "Elements", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_EventFlags(), ecorePackage.getEString(), "EventFlags", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_GenFile(), ecorePackage.getEString(), "GenFile", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Genlinks(), ecorePackage.getEString(), "Genlinks", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_GenType(), ecorePackage.getEString(), "GenType", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_IsActive(), ecorePackage.getEBooleanObject(), "IsActive", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_IsLeaf(), ecorePackage.getEBooleanObject(), "IsLeaf", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_IsSpec(), ecorePackage.getEBooleanObject(), "IsSpec", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Methods(), this.getMethod(), this.getMethod_Parent(), "Methods", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ModifiedDate(), ecorePackage.getEDate(), "ModifiedDate", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Multiplicity(), ecorePackage.getEString(), "Multiplicity", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Package(), this.getPackage(), this.getPackage_Elements(), "Package", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Parent(), this.getElement(), this.getElement_Elements(), "Parent", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Persistence(), ecorePackage.getEString(), "Persistence", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Phase(), ecorePackage.getEString(), "Phase", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_RunState(), ecorePackage.getEString(), "RunState", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Status(), ecorePackage.getEString(), "Status", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Stereotype(), ecorePackage.getEString(), "Stereotype", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_StyleEx(), ecorePackage.getEString(), "StyleEx", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_TreePos(), ecorePackage.getELongObject(), "TreePos", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Type(), this.getElementType(), "Type", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Version(), ecorePackage.getEString(), "Version", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Visibility(), this.getScopeObject(), "Visibility", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Style(), ecorePackage.getEString(), "Style", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Backcolor(), ecorePackage.getEInt(), "Backcolor", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_BorderStyle(), ecorePackage.getEInt(), "BorderStyle", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_BorderWidth(), ecorePackage.getEInt(), "BorderWidth", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Fontcolor(), ecorePackage.getEInt(), "Fontcolor", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Bordercolor(), ecorePackage.getEInt(), "Bordercolor", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Cardinality(), ecorePackage.getEString(), "Cardinality", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Concurrency(), ecorePackage.getEString(), "Concurrency", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_PDATA1(), ecorePackage.getEString(), "PDATA1", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_SourceRelations(), this.getConnector(), this.getConnector_Source(), "SourceRelations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_ReturnType(), this.getTypeReference(), null, "ReturnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameters(), this.getMethodparameter(), null, "Parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Abstract(), ecorePackage.getEBooleanObject(), "Abstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Behaviour(), ecorePackage.getEString(), "Behaviour", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsConst(), ecorePackage.getEBooleanObject(), "IsConst", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsLeaf(), ecorePackage.getEBooleanObject(), "IsLeaf", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsPure(), ecorePackage.getEBooleanObject(), "IsPure", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsQuery(), ecorePackage.getEBooleanObject(), "IsQuery", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsRoot(), ecorePackage.getEBooleanObject(), "IsRoot", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsStatic(), ecorePackage.getEBooleanObject(), "IsStatic", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_IsSynchronized(), ecorePackage.getEBooleanObject(), "IsSynchronized", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_MethodGUID(), ecorePackage.getEString(), "MethodGUID", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_MethodID(), ecorePackage.getELongObject(), "MethodID", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parent(), this.getElement(), this.getElement_Methods(), "Parent", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Pos(), ecorePackage.getELongObject(), "Pos", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnIsArray(), ecorePackage.getEBooleanObject(), "ReturnIsArray", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_StateFlags(), ecorePackage.getEString(), "StateFlags", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Stereotype(), ecorePackage.getEString(), "Stereotype", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Style(), ecorePackage.getEString(), "Style", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_StyleEx(), ecorePackage.getEString(), "StyleEx", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Throws(), ecorePackage.getEString(), "Throws", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Visibility(), this.getScope(), "Visibility", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Concurrency(), ecorePackage.getEString(), "Concurrency", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_GenOption(), ecorePackage.getEString(), "GenOption", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodparameterEClass, Methodparameter.class, "Methodparameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodparameter_Ea_guid(), ecorePackage.getEString(), "ea_guid", null, 0, 1, Methodparameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodparameter_ParameterType(), this.getTypeReference(), null, "ParameterType", null, 0, 1, Methodparameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodparameter_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Methodparameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodparameter_Method(), this.getMethod(), null, "Method", null, 0, 1, Methodparameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodparameter_Kind(), this.getParameterDirection(), "Kind", null, 0, 1, Methodparameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, de.cooperateproject.eabridge.eaobjectmodel.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_PackageGUID(), ecorePackage.getEString(), "PackageGUID", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_BatchLoad(), ecorePackage.getELongObject(), "BatchLoad", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_BatchSave(), ecorePackage.getELongObject(), "BatchSave", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_CodePath(), ecorePackage.getEString(), "CodePath", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_CreatedDate(), ecorePackage.getEDate(), "CreatedDate", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Flags(), ecorePackage.getEString(), "Flags", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_IsControlled(), ecorePackage.getEBooleanObject(), "IsControlled", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_IsNamespace(), ecorePackage.getEBooleanObject(), "IsNamespace", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_IsProtected(), ecorePackage.getEBooleanObject(), "IsProtected", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_LastLoadDate(), ecorePackage.getEDate(), "LastLoadDate", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_LastSaveDate(), ecorePackage.getEDate(), "LastSaveDate", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_LogXML(), ecorePackage.getEBooleanObject(), "LogXML", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_ModifiedDate(), ecorePackage.getEDate(), "ModifiedDate", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "Name", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Owner(), ecorePackage.getEString(), "Owner", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_PackageID(), ecorePackage.getELongObject(), "PackageID", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_TreePos(), ecorePackage.getELongObject(), "TreePos", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_UMLVersion(), ecorePackage.getEString(), "UMLVersion", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_UseDTD(), ecorePackage.getEBooleanObject(), "UseDTD", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "Version", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_XMLPath(), ecorePackage.getEString(), "XMLPath", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Packages(), this.getPackage(), this.getPackage_Parent(), "Packages", null, 0, -1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Diagrams(), this.getDiagram(), this.getDiagram_Package(), "Diagrams", null, 0, -1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Elements(), this.getElement(), this.getElement_Package(), "Elements", null, 0, -1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Parent(), this.getPackage(), this.getPackage_Packages(), "Parent", null, 0, 1, de.cooperateproject.eabridge.eaobjectmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BYTE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.CHAR);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.FLOAT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.LONG);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.SHORT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.PRIVATE);
		addEEnumLiteral(scopeEEnum, Scope.PUBLIC);
		addEEnumLiteral(scopeEEnum, Scope.PACKAGE);
		addEEnumLiteral(scopeEEnum, Scope.PROTECTED);

		initEEnum(isAggregateEEnum, IsAggregate.class, "IsAggregate");
		addEEnumLiteral(isAggregateEEnum, IsAggregate.FALSE);
		addEEnumLiteral(isAggregateEEnum, IsAggregate.AGGREGATION);
		addEEnumLiteral(isAggregateEEnum, IsAggregate.COMPOSITION);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.UNSPECIFIED);
		addEEnumLiteral(directionTypeEEnum, DirectionType.BI_DIRECTIONAL);
		addEEnumLiteral(directionTypeEEnum, DirectionType.SOURCE_DESTINATION);
		addEEnumLiteral(directionTypeEEnum, DirectionType.DESTINATION_SOURCE);

		initEEnum(connectorTypeEEnum, ConnectorType.class, "ConnectorType");
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.CONNECTOR_TYPE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.ABSTRACTION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.AGGREGATION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.ASSEMBLY);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.ASSOCIATION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.COLLABORATION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.COMMUNICATION_PATH);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.CONNECTOR);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.CONTROL_FLOW);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.DELEGATE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.DEPENDENCY);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.DEPLOYMENT);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.ER_LINK);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.EXTENSION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.GENERALIZATION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.INFORMATION_FLOW);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.INSTANTIATION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.INTERRUPT_FLOW);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.MANIFEST);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.NESTING);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.NOTE_LINK);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.OBJECT_FLOW);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.PACKAGE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.PROTOCOL_CONFORMANCE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.PROTOCOL_TRANSITION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.REALISATION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.SEQUENCE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.STATE_FLOW);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.SUBSTITUTION);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.USAGE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.USE_CASE);

		initEEnum(elementTypeEEnum, ElementType.class, "ElementType");
		addEEnumLiteral(elementTypeEEnum, ElementType.CLASS);
		addEEnumLiteral(elementTypeEEnum, ElementType.PACKAGE);
		addEEnumLiteral(elementTypeEEnum, ElementType.INTERFACE);
		addEEnumLiteral(elementTypeEEnum, ElementType.NOTE);

		initEEnum(parameterDirectionEEnum, ParameterDirection.class, "ParameterDirection");
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.IN);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.INOUT);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.OUT);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.RETURN);

		// Initialize data types
		initEDataType(scopeObjectEDataType, Scope.class, "ScopeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geometryMapEDataType, GeometryMap.class, "GeometryMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (getTypeReference_TypeName(), 
		   source, 
		   new String[] {
			 "constraints", "matchesClassifierName"
		   });
	}

} //EaobjectmodelPackageImpl
