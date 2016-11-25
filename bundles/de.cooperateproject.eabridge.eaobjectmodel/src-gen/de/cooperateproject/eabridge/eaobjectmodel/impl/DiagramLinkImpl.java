/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import de.cooperateproject.eabridge.eaobjectmodel.util.GeometryMap;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

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
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected String geometry = GEOMETRY_EDEFAULT;

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
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected Long instanceID = INSTANCE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden()
	 * @generated
	 * @ordered
	 */
	protected Boolean hidden = HIDDEN_EDEFAULT;

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
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSX() <em>SX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSX()
	 * @generated
	 * @ordered
	 */
	protected static final String SX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSY() <em>SY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSY()
	 * @generated
	 * @ordered
	 */
	protected static final String SY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEX() <em>EX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEX()
	 * @generated
	 * @ordered
	 */
	protected static final String EX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEY() <em>EY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEY()
	 * @generated
	 * @ordered
	 */
	protected static final String EY_EDEFAULT = null;

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
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (Connector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		if (eContainerFeatureID() != EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM) return null;
		return (Diagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		if (eContainerFeatureID() != EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM) return null;
		return (Diagram)eInternalContainer();
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
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EaobjectmodelPackage.DIAGRAM__DIAGRAM_LINKS, Diagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		String oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(Long newInstanceID) {
		Long oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(Boolean newHidden) {
		Boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.DIAGRAM_LINK__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSX() {
		String _xblockexpression = null; {
			String _geometry = this.getGeometry();
			final GeometryMap map = new GeometryMap(_geometry);
			Integer _get = map.get("SX");
			_xblockexpression = String.valueOf(_get);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSY() {
		String _xblockexpression = null; {
			String _geometry = this.getGeometry();
			final GeometryMap map = new GeometryMap(_geometry);
			Integer _get = map.get("SY");
			_xblockexpression = String.valueOf(_get);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEX() {
		String _xblockexpression = null; {
			String _geometry = this.getGeometry();
			final GeometryMap map = new GeometryMap(_geometry);
			Integer _get = map.get("EX");
			_xblockexpression = String.valueOf(_get);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEY() {
		String _xblockexpression = null; {
			String _geometry = this.getGeometry();
			final GeometryMap map = new GeometryMap(_geometry);
			Integer _get = map.get("EY");
			_xblockexpression = String.valueOf(_get);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(final int SX, final int SY, final int EX, final int EY) {
		String _geometry = this.getGeometry();
		final GeometryMap map = new GeometryMap(_geometry);
		map.put("SX", Integer.valueOf(SX));
		map.put("SY", Integer.valueOf(SY));
		map.put("EX", Integer.valueOf(EX));
		map.put("EY", Integer.valueOf(EY));
		String _string = map.toString();
		this.setGeometry(_string);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSX(final int input) {
		String _geometry = this.getGeometry();
		final GeometryMap map = new GeometryMap(_geometry);
		map.put("SX", Integer.valueOf(input));
		String _string = map.toString();
		this.setGeometry(_string);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSY(final int input) {
		String _geometry = this.getGeometry();
		final GeometryMap map = new GeometryMap(_geometry);
		map.put("SY", Integer.valueOf(input));
		String _string = map.toString();
		this.setGeometry(_string);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEX(final int input) {
		String _geometry = this.getGeometry();
		final GeometryMap map = new GeometryMap(_geometry);
		map.put("EX", Integer.valueOf(input));
		String _string = map.toString();
		this.setGeometry(_string);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEY(final int input) {
		String _geometry = this.getGeometry();
		final GeometryMap map = new GeometryMap(_geometry);
		map.put("EY", Integer.valueOf(input));
		String _string = map.toString();
		this.setGeometry(_string);
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
				return connector != null;
			case EaobjectmodelPackage.DIAGRAM_LINK__DIAGRAM:
				return basicGetDiagram() != null;
			case EaobjectmodelPackage.DIAGRAM_LINK__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case EaobjectmodelPackage.DIAGRAM_LINK__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case EaobjectmodelPackage.DIAGRAM_LINK__HIDDEN:
				return HIDDEN_EDEFAULT == null ? hidden != null : !HIDDEN_EDEFAULT.equals(hidden);
			case EaobjectmodelPackage.DIAGRAM_LINK__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case EaobjectmodelPackage.DIAGRAM_LINK__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case EaobjectmodelPackage.DIAGRAM_LINK__SX:
				return SX_EDEFAULT == null ? getSX() != null : !SX_EDEFAULT.equals(getSX());
			case EaobjectmodelPackage.DIAGRAM_LINK__SY:
				return SY_EDEFAULT == null ? getSY() != null : !SY_EDEFAULT.equals(getSY());
			case EaobjectmodelPackage.DIAGRAM_LINK__EX:
				return EX_EDEFAULT == null ? getEX() != null : !EX_EDEFAULT.equals(getEX());
			case EaobjectmodelPackage.DIAGRAM_LINK__EY:
				return EY_EDEFAULT == null ? getEY() != null : !EY_EDEFAULT.equals(getEY());
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
			case EaobjectmodelPackage.DIAGRAM_LINK___SET_GEOMETRY__INT_INT_INT_INT:
				setGeometry((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case EaobjectmodelPackage.DIAGRAM_LINK___SET_SX__INT:
				setSX((Integer)arguments.get(0));
				return null;
			case EaobjectmodelPackage.DIAGRAM_LINK___SET_SY__INT:
				setSY((Integer)arguments.get(0));
				return null;
			case EaobjectmodelPackage.DIAGRAM_LINK___SET_EX__INT:
				setEX((Integer)arguments.get(0));
				return null;
			case EaobjectmodelPackage.DIAGRAM_LINK___SET_EY__INT:
				setEY((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Geometry: ");
		result.append(geometry);
		result.append(", InstanceID: ");
		result.append(instanceID);
		result.append(", Hidden: ");
		result.append(hidden);
		result.append(", Path: ");
		result.append(path);
		result.append(", Style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //DiagramLinkImpl
