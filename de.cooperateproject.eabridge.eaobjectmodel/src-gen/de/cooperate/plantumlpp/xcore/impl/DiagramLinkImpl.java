/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Connector;
import de.cooperate.plantumlpp.xcore.Diagram;
import de.cooperate.plantumlpp.xcore.DiagramLink;
import de.cooperate.plantumlpp.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagramLinkImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramLinkImpl extends MinimalEObjectImpl.Container implements DiagramLink {
	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference.
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
	 * The default value of the '{@link #getIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHidden()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_HIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHidden()
	 * @generated
	 * @ordered
	 */
	protected Boolean isHidden = IS_HIDDEN_EDEFAULT;

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
		return XcorePackage.Literals.DIAGRAM_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__CONNECTOR, oldConnector, newConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != connector) {
			NotificationChain msgs = null;
			if (connector != null)
				msgs = ((InternalEObject)connector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.DIAGRAM_LINK__CONNECTOR, null, msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.DIAGRAM_LINK__CONNECTOR, null, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		if (eContainerFeatureID() != XcorePackage.DIAGRAM_LINK__DIAGRAM) return null;
		return (Diagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		if (eContainerFeatureID() != XcorePackage.DIAGRAM_LINK__DIAGRAM) return null;
		return (Diagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, XcorePackage.DIAGRAM_LINK__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != XcorePackage.DIAGRAM_LINK__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, XcorePackage.DIAGRAM__DIAGRAM_LINKS, Diagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__DIAGRAM, newDiagram, newDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__GEOMETRY, oldGeometry, geometry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHidden(Boolean newIsHidden) {
		Boolean oldIsHidden = isHidden;
		isHidden = newIsHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__IS_HIDDEN, oldIsHidden, isHidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAM_LINK__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
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
			case XcorePackage.DIAGRAM_LINK__CONNECTOR:
				return basicSetConnector(null, msgs);
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
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
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, XcorePackage.DIAGRAM__DIAGRAM_LINKS, Diagram.class, msgs);
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
			case XcorePackage.DIAGRAM_LINK__CONNECTOR:
				return getConnector();
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case XcorePackage.DIAGRAM_LINK__GEOMETRY:
				return getGeometry();
			case XcorePackage.DIAGRAM_LINK__INSTANCE_ID:
				return getInstanceID();
			case XcorePackage.DIAGRAM_LINK__IS_HIDDEN:
				return getIsHidden();
			case XcorePackage.DIAGRAM_LINK__PATH:
				return getPath();
			case XcorePackage.DIAGRAM_LINK__STYLE:
				return getStyle();
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
			case XcorePackage.DIAGRAM_LINK__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case XcorePackage.DIAGRAM_LINK__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case XcorePackage.DIAGRAM_LINK__INSTANCE_ID:
				setInstanceID((Long)newValue);
				return;
			case XcorePackage.DIAGRAM_LINK__IS_HIDDEN:
				setIsHidden((Boolean)newValue);
				return;
			case XcorePackage.DIAGRAM_LINK__PATH:
				setPath((String)newValue);
				return;
			case XcorePackage.DIAGRAM_LINK__STYLE:
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
			case XcorePackage.DIAGRAM_LINK__CONNECTOR:
				setConnector((Connector)null);
				return;
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case XcorePackage.DIAGRAM_LINK__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM_LINK__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM_LINK__IS_HIDDEN:
				setIsHidden(IS_HIDDEN_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM_LINK__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case XcorePackage.DIAGRAM_LINK__STYLE:
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
			case XcorePackage.DIAGRAM_LINK__CONNECTOR:
				return connector != null;
			case XcorePackage.DIAGRAM_LINK__DIAGRAM:
				return basicGetDiagram() != null;
			case XcorePackage.DIAGRAM_LINK__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case XcorePackage.DIAGRAM_LINK__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case XcorePackage.DIAGRAM_LINK__IS_HIDDEN:
				return IS_HIDDEN_EDEFAULT == null ? isHidden != null : !IS_HIDDEN_EDEFAULT.equals(isHidden);
			case XcorePackage.DIAGRAM_LINK__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case XcorePackage.DIAGRAM_LINK__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		}
		return super.eIsSet(featureID);
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
		result.append(", IsHidden: ");
		result.append(isHidden);
		result.append(", Path: ");
		result.append(path);
		result.append(", Style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //DiagramLinkImpl
