/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import de.cooperateproject.eabridge.eaobjectmodel.util.Geometry;
import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLBCX <em>LLBCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLBCY <em>LLBCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLBOX <em>LLBOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLBOY <em>LLBOY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLTCX <em>LLTCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLTCY <em>LLTCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLTOX <em>LLTOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLLTOY <em>LLTOY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRBCX <em>LRBCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRBCY <em>LRBCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRBOX <em>LRBOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRBOY <em>LRBOY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRTCX <em>LRTCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRTCY <em>LRTCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRTOX <em>LRTOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.DiagramLinkImpl#getLRTOY <em>LRTOY</em>}</li>
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
	 * The default value of the '{@link #getLLBCX() <em>LLBCX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLBCX()
	 * @generated
	 * @ordered
	 */
	protected static final int LLBCX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLLBCY() <em>LLBCY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLBCY()
	 * @generated
	 * @ordered
	 */
	protected static final int LLBCY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLLBOX() <em>LLBOX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLBOX()
	 * @generated
	 * @ordered
	 */
	protected static final int LLBOX_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLLBOY() <em>LLBOY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLBOY()
	 * @generated
	 * @ordered
	 */
	protected static final int LLBOY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLLTCX() <em>LLTCX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLTCX()
	 * @generated
	 * @ordered
	 */
	protected static final int LLTCX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLLTCY() <em>LLTCY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLTCY()
	 * @generated
	 * @ordered
	 */
	protected static final int LLTCY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLLTOX() <em>LLTOX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLTOX()
	 * @generated
	 * @ordered
	 */
	protected static final int LLTOX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLLTOY() <em>LLTOY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLTOY()
	 * @generated
	 * @ordered
	 */
	protected static final int LLTOY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRBCX() <em>LRBCX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRBCX()
	 * @generated
	 * @ordered
	 */
	protected static final int LRBCX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRBCY() <em>LRBCY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRBCY()
	 * @generated
	 * @ordered
	 */
	protected static final int LRBCY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRBOX() <em>LRBOX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRBOX()
	 * @generated
	 * @ordered
	 */
	protected static final int LRBOX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRBOY() <em>LRBOY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRBOY()
	 * @generated
	 * @ordered
	 */
	protected static final int LRBOY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRTCX() <em>LRTCX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRTCX()
	 * @generated
	 * @ordered
	 */
	protected static final int LRTCX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRTCY() <em>LRTCY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRTCY()
	 * @generated
	 * @ordered
	 */
	protected static final int LRTCY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRTOX() <em>LRTOX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRTOX()
	 * @generated
	 * @ordered
	 */
	protected static final int LRTOX_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getLRTOY() <em>LRTOY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRTOY()
	 * @generated
	 * @ordered
	 */
	protected static final int LRTOY_EDEFAULT = 0;

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
	public int getLLBCX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("$LLB").get("CX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLBCY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("$LLB").get("CY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLBOX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("$LLB").get("OX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLBOY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("$LLB").get("OY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLTCX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LLT").get("CX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLTCY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LLT").get("CY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLTOX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LLT").get("OX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLLTOY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LLT").get("OY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRBCX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRB").get("CX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRBCY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRB").get("CY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRBOX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRB").get("OX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRBOY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRB").get("OY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRTCX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRT").get("CX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRTCY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRT").get("CY");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRTOX() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRT").get("OX");
		return _get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLRTOY() {
		String _geometry = this.getGeometry();
		final Geometry map = new Geometry(_geometry);
		Integer _get = map.hashNode.get("LRT").get("OY");
		return _get;
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
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBCX:
				return getLLBCX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBCY:
				return getLLBCY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBOX:
				return getLLBOX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBOY:
				return getLLBOY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTCX:
				return getLLTCX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTCY:
				return getLLTCY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTOX:
				return getLLTOX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTOY:
				return getLLTOY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBCX:
				return getLRBCX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBCY:
				return getLRBCY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBOX:
				return getLRBOX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBOY:
				return getLRBOY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTCX:
				return getLRTCX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTCY:
				return getLRTCY();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTOX:
				return getLRTOX();
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTOY:
				return getLRTOY();
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
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBCX:
				return getLLBCX() != LLBCX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBCY:
				return getLLBCY() != LLBCY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBOX:
				return getLLBOX() != LLBOX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLBOY:
				return getLLBOY() != LLBOY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTCX:
				return getLLTCX() != LLTCX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTCY:
				return getLLTCY() != LLTCY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTOX:
				return getLLTOX() != LLTOX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LLTOY:
				return getLLTOY() != LLTOY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBCX:
				return getLRBCX() != LRBCX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBCY:
				return getLRBCY() != LRBCY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBOX:
				return getLRBOX() != LRBOX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRBOY:
				return getLRBOY() != LRBOY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTCX:
				return getLRTCX() != LRTCX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTCY:
				return getLRTCY() != LRTCY_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTOX:
				return getLRTOX() != LRTOX_EDEFAULT;
			case EaobjectmodelPackage.DIAGRAM_LINK__LRTOY:
				return getLRTOY() != LRTOY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DiagramLinkImpl
