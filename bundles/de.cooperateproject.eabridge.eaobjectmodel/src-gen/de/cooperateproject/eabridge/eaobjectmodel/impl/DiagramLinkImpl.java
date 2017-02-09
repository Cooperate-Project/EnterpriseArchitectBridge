/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

import de.cooperateproject.eabridge.eaobjectmodel.util.GeometryMap;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
		return (Connector)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return (Diagram)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__GEOMETRY, newGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getInstanceID() {
		return (Long)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__INSTANCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(Long newInstanceID) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__INSTANCE_ID, newInstanceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHidden() {
		return (Boolean)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__HIDDEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(Boolean newHidden) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__HIDDEN, newHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eGet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eSet(EaobjectmodelPackage.Literals.DIAGRAM_LINK__STYLE, newStyle);
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

} //DiagramLinkImpl
