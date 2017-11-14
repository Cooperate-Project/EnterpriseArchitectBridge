/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.util;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint;
import de.cooperateproject.eabridge.eaobjectmodel.AttributeTag;
import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage
 * @generated
 */
public class EaobjectmodelAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static EaobjectmodelPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EaobjectmodelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EaobjectmodelPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EaobjectmodelSwitch<Adapter> modelSwitch =
		new EaobjectmodelSwitch<Adapter>() {
            @Override
            public Adapter caseTypeReference(TypeReference object) {
                return createTypeReferenceAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseAttributeConstraint(AttributeConstraint object) {
                return createAttributeConstraintAdapter();
            }
            @Override
            public Adapter caseAttributeTag(AttributeTag object) {
                return createAttributeTagAdapter();
            }
            @Override
            public Adapter caseConnector(Connector object) {
                return createConnectorAdapter();
            }
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseDiagramLink(DiagramLink object) {
                return createDiagramLinkAdapter();
            }
            @Override
            public Adapter caseDiagramObject(DiagramObject object) {
                return createDiagramObjectAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseMethod(Method object) {
                return createMethodAdapter();
            }
            @Override
            public Adapter caseMethodparameter(Methodparameter object) {
                return createMethodparameterAdapter();
            }
            @Override
            public Adapter casePackage(de.cooperateproject.eabridge.eaobjectmodel.Package object) {
                return createPackageAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference <em>Type Reference</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.TypeReference
     * @generated
     */
	public Adapter createTypeReferenceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Attribute
     * @generated
     */
	public Adapter createAttributeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint <em>Attribute Constraint</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeConstraint
     * @generated
     */
	public Adapter createAttributeConstraintAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.AttributeTag <em>Attribute Tag</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.AttributeTag
     * @generated
     */
	public Adapter createAttributeTagAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Connector
     * @generated
     */
	public Adapter createConnectorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram
     * @generated
     */
	public Adapter createDiagramAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink <em>Diagram Link</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramLink
     * @generated
     */
	public Adapter createDiagramLinkAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramObject <em>Diagram Object</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.DiagramObject
     * @generated
     */
	public Adapter createDiagramObjectAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Element
     * @generated
     */
	public Adapter createElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Method
     * @generated
     */
	public Adapter createMethodAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Methodparameter <em>Methodparameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Methodparameter
     * @generated
     */
	public Adapter createMethodparameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.eabridge.eaobjectmodel.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.eabridge.eaobjectmodel.Package
     * @generated
     */
	public Adapter createPackageAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //EaobjectmodelAdapterFactory
