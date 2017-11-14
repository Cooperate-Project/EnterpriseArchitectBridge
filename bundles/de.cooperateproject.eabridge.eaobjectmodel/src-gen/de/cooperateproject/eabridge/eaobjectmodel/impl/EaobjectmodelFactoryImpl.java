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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EaobjectmodelFactoryImpl extends EFactoryImpl implements EaobjectmodelFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static EaobjectmodelFactory init() {
        try {
            EaobjectmodelFactory theEaobjectmodelFactory = (EaobjectmodelFactory)EPackage.Registry.INSTANCE.getEFactory(EaobjectmodelPackage.eNS_URI);
            if (theEaobjectmodelFactory != null) {
                return theEaobjectmodelFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EaobjectmodelFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EaobjectmodelFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EaobjectmodelPackage.TYPE_REFERENCE: return createTypeReference();
            case EaobjectmodelPackage.ATTRIBUTE: return createAttribute();
            case EaobjectmodelPackage.ATTRIBUTE_CONSTRAINT: return createAttributeConstraint();
            case EaobjectmodelPackage.ATTRIBUTE_TAG: return createAttributeTag();
            case EaobjectmodelPackage.CONNECTOR: return createConnector();
            case EaobjectmodelPackage.DIAGRAM: return createDiagram();
            case EaobjectmodelPackage.DIAGRAM_LINK: return createDiagramLink();
            case EaobjectmodelPackage.DIAGRAM_OBJECT: return createDiagramObject();
            case EaobjectmodelPackage.ELEMENT: return createElement();
            case EaobjectmodelPackage.METHOD: return createMethod();
            case EaobjectmodelPackage.METHODPARAMETER: return createMethodparameter();
            case EaobjectmodelPackage.PACKAGE: return createPackage();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case EaobjectmodelPackage.PRIMITIVE_TYPE:
                return createPrimitiveTypeFromString(eDataType, initialValue);
            case EaobjectmodelPackage.SCOPE:
                return createScopeFromString(eDataType, initialValue);
            case EaobjectmodelPackage.IS_AGGREGATE:
                return createIsAggregateFromString(eDataType, initialValue);
            case EaobjectmodelPackage.DIRECTION_TYPE:
                return createDirectionTypeFromString(eDataType, initialValue);
            case EaobjectmodelPackage.CONNECTOR_TYPE:
                return createConnectorTypeFromString(eDataType, initialValue);
            case EaobjectmodelPackage.ELEMENT_TYPE:
                return createElementTypeFromString(eDataType, initialValue);
            case EaobjectmodelPackage.PARAMETER_DIRECTION:
                return createParameterDirectionFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case EaobjectmodelPackage.PRIMITIVE_TYPE:
                return convertPrimitiveTypeToString(eDataType, instanceValue);
            case EaobjectmodelPackage.SCOPE:
                return convertScopeToString(eDataType, instanceValue);
            case EaobjectmodelPackage.IS_AGGREGATE:
                return convertIsAggregateToString(eDataType, instanceValue);
            case EaobjectmodelPackage.DIRECTION_TYPE:
                return convertDirectionTypeToString(eDataType, instanceValue);
            case EaobjectmodelPackage.CONNECTOR_TYPE:
                return convertConnectorTypeToString(eDataType, instanceValue);
            case EaobjectmodelPackage.ELEMENT_TYPE:
                return convertElementTypeToString(eDataType, instanceValue);
            case EaobjectmodelPackage.PARAMETER_DIRECTION:
                return convertParameterDirectionToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeReference createTypeReference() {
        TypeReferenceImpl typeReference = new TypeReferenceImpl();
        return typeReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AttributeConstraint createAttributeConstraint() {
        AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
        return attributeConstraint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AttributeTag createAttributeTag() {
        AttributeTagImpl attributeTag = new AttributeTagImpl();
        return attributeTag;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DiagramLink createDiagramLink() {
        DiagramLinkImpl diagramLink = new DiagramLinkImpl();
        return diagramLink;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DiagramObject createDiagramObject() {
        DiagramObjectImpl diagramObject = new DiagramObjectImpl();
        return diagramObject;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Method createMethod() {
        MethodImpl method = new MethodImpl();
        return method;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Methodparameter createMethodparameter() {
        MethodparameterImpl methodparameter = new MethodparameterImpl();
        return methodparameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.cooperateproject.eabridge.eaobjectmodel.Package createPackage() {
        PackageImpl package_ = new PackageImpl();
        return package_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
        PrimitiveType result = PrimitiveType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
        Scope result = Scope.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IsAggregate createIsAggregateFromString(EDataType eDataType, String initialValue) {
        IsAggregate result = IsAggregate.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertIsAggregateToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
        DirectionType result = DirectionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectorType createConnectorTypeFromString(EDataType eDataType, String initialValue) {
        ConnectorType result = ConnectorType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertConnectorTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ElementType createElementTypeFromString(EDataType eDataType, String initialValue) {
        ElementType result = ElementType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertElementTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ParameterDirection createParameterDirectionFromString(EDataType eDataType, String initialValue) {
        ParameterDirection result = ParameterDirection.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertParameterDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EaobjectmodelPackage getEaobjectmodelPackage() {
        return (EaobjectmodelPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static EaobjectmodelPackage getPackage() {
        return EaobjectmodelPackage.eINSTANCE;
    }

} //EaobjectmodelFactoryImpl
