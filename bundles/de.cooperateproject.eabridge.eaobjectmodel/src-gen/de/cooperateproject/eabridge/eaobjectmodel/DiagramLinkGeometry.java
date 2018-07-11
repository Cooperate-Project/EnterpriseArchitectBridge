/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Link Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometry#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLinkGeometry()
 * @model
 * @generated
 */
public interface DiagramLinkGeometry extends EObject {
    /**
     * Returns the value of the '<em><b>Descriptors</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Descriptors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Descriptors</em>' containment reference list.
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLinkGeometry_Descriptors()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<GeometryDescriptor> getDescriptors();

} // DiagramLinkGeometry
