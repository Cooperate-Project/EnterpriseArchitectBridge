/**
 */
package de.cooperate.plantumlpp.xcore.impl;

import de.cooperate.plantumlpp.xcore.Diagram;
import de.cooperate.plantumlpp.xcore.DiagrammObject;
import de.cooperate.plantumlpp.xcore.Element;
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
 * An implementation of the model object '<em><b>Diagramm Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link de.cooperate.plantumlpp.xcore.impl.DiagrammObjectImpl#getTop <em>Top</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagrammObjectImpl extends MinimalEObjectImpl.Container implements DiagrammObject {
	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final Long BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected Long bottom = BOTTOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

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
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final Long LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Long left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final Long RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Long right = RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Long sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Long top = TOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagrammObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.DIAGRAMM_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(Long newBottom) {
		Long oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		if (eContainerFeatureID() != XcorePackage.DIAGRAMM_OBJECT__DIAGRAM) return null;
		return (Diagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		if (eContainerFeatureID() != XcorePackage.DIAGRAMM_OBJECT__DIAGRAM) return null;
		return (Diagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, XcorePackage.DIAGRAMM_OBJECT__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != XcorePackage.DIAGRAMM_OBJECT__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, XcorePackage.DIAGRAM__DIAGRAM_OBJECTS, Diagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.DIAGRAMM_OBJECT__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.DIAGRAMM_OBJECT__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__ELEMENT, newElement, newElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Long newLeft) {
		Long oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Long newRight) {
		Long oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Long newSequence) {
		Long oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Long newTop) {
		Long oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DIAGRAMM_OBJECT__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
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
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case XcorePackage.DIAGRAMM_OBJECT__ELEMENT:
				return basicSetElement(null, msgs);
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
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, XcorePackage.DIAGRAM__DIAGRAM_OBJECTS, Diagram.class, msgs);
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
			case XcorePackage.DIAGRAMM_OBJECT__BOTTOM:
				return getBottom();
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case XcorePackage.DIAGRAMM_OBJECT__ELEMENT:
				return getElement();
			case XcorePackage.DIAGRAMM_OBJECT__INSTANCE_ID:
				return getInstanceID();
			case XcorePackage.DIAGRAMM_OBJECT__LEFT:
				return getLeft();
			case XcorePackage.DIAGRAMM_OBJECT__RIGHT:
				return getRight();
			case XcorePackage.DIAGRAMM_OBJECT__SEQUENCE:
				return getSequence();
			case XcorePackage.DIAGRAMM_OBJECT__TOP:
				return getTop();
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
			case XcorePackage.DIAGRAMM_OBJECT__BOTTOM:
				setBottom((Long)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__ELEMENT:
				setElement((Element)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__INSTANCE_ID:
				setInstanceID((Long)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__LEFT:
				setLeft((Long)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__RIGHT:
				setRight((Long)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__SEQUENCE:
				setSequence((Long)newValue);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__TOP:
				setTop((Long)newValue);
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
			case XcorePackage.DIAGRAMM_OBJECT__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__ELEMENT:
				setElement((Element)null);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case XcorePackage.DIAGRAMM_OBJECT__TOP:
				setTop(TOP_EDEFAULT);
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
			case XcorePackage.DIAGRAMM_OBJECT__BOTTOM:
				return BOTTOM_EDEFAULT == null ? bottom != null : !BOTTOM_EDEFAULT.equals(bottom);
			case XcorePackage.DIAGRAMM_OBJECT__DIAGRAM:
				return basicGetDiagram() != null;
			case XcorePackage.DIAGRAMM_OBJECT__ELEMENT:
				return element != null;
			case XcorePackage.DIAGRAMM_OBJECT__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case XcorePackage.DIAGRAMM_OBJECT__LEFT:
				return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
			case XcorePackage.DIAGRAMM_OBJECT__RIGHT:
				return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
			case XcorePackage.DIAGRAMM_OBJECT__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
			case XcorePackage.DIAGRAMM_OBJECT__TOP:
				return TOP_EDEFAULT == null ? top != null : !TOP_EDEFAULT.equals(top);
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
		result.append(" (Bottom: ");
		result.append(bottom);
		result.append(", InstanceID: ");
		result.append(instanceID);
		result.append(", Left: ");
		result.append(left);
		result.append(", Right: ");
		result.append(right);
		result.append(", Sequence: ");
		result.append(sequence);
		result.append(", Top: ");
		result.append(top);
		result.append(')');
		return result.toString();
	}

} //DiagrammObjectImpl
