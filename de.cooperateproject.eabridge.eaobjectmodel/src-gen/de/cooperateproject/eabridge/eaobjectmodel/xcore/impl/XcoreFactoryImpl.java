/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.xcore.impl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.*;

import org.eclipse.emf.ecore.EClass;
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
public class XcoreFactoryImpl extends EFactoryImpl implements XcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XcoreFactory init() {
		try {
			XcoreFactory theXcoreFactory = (XcoreFactory)EPackage.Registry.INSTANCE.getEFactory(XcorePackage.eNS_URI);
			if (theXcoreFactory != null) {
				return theXcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactoryImpl() {
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
			case XcorePackage.ATTRIBUTE: return createAttribute();
			case XcorePackage.ATTRIBUTE_CONSTRAINT: return createAttributeConstraint();
			case XcorePackage.ATTRIBUTE_TAG: return createAttributeTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public XcorePackage getXcorePackage() {
		return (XcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XcorePackage getPackage() {
		return XcorePackage.eINSTANCE;
	}

} //XcoreFactoryImpl
