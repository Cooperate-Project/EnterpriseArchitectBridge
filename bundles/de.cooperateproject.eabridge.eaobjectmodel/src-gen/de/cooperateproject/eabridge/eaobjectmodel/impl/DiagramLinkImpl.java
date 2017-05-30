/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import de.cooperateproject.eabridge.eaobjectmodel.util.Geometry;
import java.lang.reflect.InvocationTargetException;

import java.util.Arrays;
import java.util.Optional;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getHidden <em>Hidden</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getSX <em>SX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getSY <em>SY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getEX <em>EX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getEY <em>EY</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramLinkImpl extends MinimalEObjectImpl.Container implements DiagramLink {
	/**
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final Long INSTANCE_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HIDDEN_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSX() <em>SX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSX()
	 * @generated
	 * @ordered
	 */
	protected static final int SX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getSY() <em>SY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSY()
	 * @generated
	 * @ordered
	 */
	protected static final int SY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getEX() <em>EX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEX()
	 * @generated
	 * @ordered
	 */
	protected static final int EX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getEY() <em>EY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEY()
	 * @generated
	 * @ordered
	 */
	protected static final int EY_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.DIAGRAM_LINK;
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
	public Connector getConnector() {
		return (Connector)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR, EaobjectmodelPackage.Literals.DIAGRAM_LINK__CONNECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return (Connector)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR, EaobjectmodelPackage.Literals.DIAGRAM_LINK__CONNECTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR, EaobjectmodelPackage.Literals.DIAGRAM_LINK__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return (Diagram)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM, EaobjectmodelPackage.Literals.DIAGRAM_LINK__DIAGRAM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		return (Diagram)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM, EaobjectmodelPackage.Literals.DIAGRAM_LINK__DIAGRAM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM, EaobjectmodelPackage.Literals.DIAGRAM_LINK__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY, EaobjectmodelPackage.Literals.DIAGRAM_LINK__GEOMETRY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY, EaobjectmodelPackage.Literals.DIAGRAM_LINK__GEOMETRY, newGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getInstanceID() {
		return (Long)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID, EaobjectmodelPackage.Literals.DIAGRAM_LINK__INSTANCE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(Long newInstanceID) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID, EaobjectmodelPackage.Literals.DIAGRAM_LINK__INSTANCE_ID, newInstanceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHidden() {
		return (Boolean)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN, EaobjectmodelPackage.Literals.DIAGRAM_LINK__HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(Boolean newHidden) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN, EaobjectmodelPackage.Literals.DIAGRAM_LINK__HIDDEN, newHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__PATH, EaobjectmodelPackage.Literals.DIAGRAM_LINK__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__PATH, EaobjectmodelPackage.Literals.DIAGRAM_LINK__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eDynamicGet(EaobjectmodelPackage.DIAGRAM_LINK__STYLE, EaobjectmodelPackage.Literals.DIAGRAM_LINK__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eDynamicSet(EaobjectmodelPackage.DIAGRAM_LINK__STYLE, EaobjectmodelPackage.Literals.DIAGRAM_LINK__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashInt.get("SX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashInt.get("SY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashInt.get("EX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashInt.get("EY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDestRoleX() {
		String geometry = getGeometry();
		Optional<String> value = Arrays.asList(geometry.split(";")).stream()
			.flatMap(geo -> Arrays.asList(geo.split(":")).stream())
			.filter(geo -> geo.startsWith("$LLB"))
			.flatMap(geo -> Arrays.asList(geo.split("=")).stream())
			.filter(geo -> geo.matches("[0-9]+"))
			.findAny();
						
		if (value.isPresent()) {
			return Integer.parseInt(value.get());
		} else {
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDestRoleY() {
		String geometry = getGeometry();
		Optional<String> value = Arrays.asList(geometry.split(";")).stream()
			.filter(geo -> geo.startsWith("$LLB"))
			.flatMap(geo -> Arrays.asList(geo.split(":")).stream())
			.filter(geo -> geo.startsWith("CY"))
			.flatMap(geo -> Arrays.asList(geo.split("=")).stream())
			.filter(geo -> geo.matches("[0-9]+"))
			.findAny();
						
		if (value.isPresent()) {
			return Integer.parseInt(value.get());
		} else {
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((Diagram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				return basicSetDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS, Diagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY:
				return getGeometry();
			case EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID:
				return getInstanceID();
			case EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN:
				return getHidden();
			case EaobjectmodelPackage.DIAGRAM_LINK__PATH:
				return getPath();
			case EaobjectmodelPackage.DIAGRAM_LINK__STYLE:
				return getStyle();
			case EaobjectmodelPackage.DIAGRAM_LINK__SX:
				return getSX();
			case EaobjectmodelPackage.DIAGRAM_LINK__SY:
				return getSY();
			case EaobjectmodelPackage.DIAGRAM_LINK__EX:
				return getEX();
			case EaobjectmodelPackage.DIAGRAM_LINK__EY:
				return getEY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID:
				setInstanceID((Long)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__PATH:
				setPath((String)newValue);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__STYLE:
				setStyle((String)newValue);
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
			case EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR:
				setConnector((Connector)null);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case EaobjectmodelPackage.DIAGRAM_LINK__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR:
				return basicGetConnector() != null;
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				return basicGetDiagram() != null;
			case EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? getGeometry() != null : !GEOMETRY_EDEFAULT.equals(getGeometry());
			case EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? getInstanceID() != null : !INSTANCE_ID_EDEFAULT.equals(getInstanceID());
			case EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN:
				return HIDDEN_EDEFAULT == null ? getHidden() != null : !HIDDEN_EDEFAULT.equals(getHidden());
			case EaobjectmodelPackage.DIAGRAM_LINK__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case EaobjectmodelPackage.DIAGRAM_LINK__STYLE:
				return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
			case EaobjectmodelPackage.DIAGRAM_LINK__SX:
				return getSX() != SX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__SY:
				return getSY() != SY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__EX:
				return getEX() != EX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__EY:
				return getEY() != EY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EaobjectmodelPackage.DIAGRAM_LINK___GET_DEST_ROLE_X:
				return getDestRoleX();
			case EaobjectmodelPackage.DIAGRAM_LINK___GET_DEST_ROLE_Y:
				return getDestRoleY();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiagramLinkImpl
