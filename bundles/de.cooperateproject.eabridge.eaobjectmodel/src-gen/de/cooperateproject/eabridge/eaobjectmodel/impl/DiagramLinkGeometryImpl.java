/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometry;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Link Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkGeometryImpl#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramLinkGeometryImpl extends MinimalEObjectImpl.Container implements DiagramLinkGeometry {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramLinkGeometryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EaobjectmodelPackage.Literals.DIAGRAM_LINK_GEOMETRY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<GeometryDescriptor> getDescriptors() {
        return (EList<GeometryDescriptor>)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS, EaobjectmodelPackage.Literals.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EaobjectmodelPackage.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS:
                return ((InternalEList<?>)getDescriptors()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EaobjectmodelPackage.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS:
                return getDescriptors();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EaobjectmodelPackage.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS:
                getDescriptors().clear();
                getDescriptors().addAll((Collection<? extends GeometryDescriptor>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EaobjectmodelPackage.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS:
                getDescriptors().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EaobjectmodelPackage.DIAGRAM_LINK_GEOMETRY__DESCRIPTORS:
                return !getDescriptors().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DiagramLinkGeometryImpl
