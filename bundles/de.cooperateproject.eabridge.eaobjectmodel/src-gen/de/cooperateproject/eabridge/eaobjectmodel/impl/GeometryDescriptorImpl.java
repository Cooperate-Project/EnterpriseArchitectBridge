/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometryType;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.GeometryDescriptor;
import de.cooperateproject.eabridge.eaobjectmodel.Point;
import de.cooperateproject.eabridge.eaobjectmodel.RGBColor;
import de.cooperateproject.eabridge.eaobjectmodel.TextAlignment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.GeometryDescriptorImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometryDescriptorImpl extends MinimalEObjectImpl.Container implements GeometryDescriptor {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final DiagramLinkGeometryType TYPE_EDEFAULT = DiagramLinkGeometryType.LABEL_LEFT_TOP;

    /**
     * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHidden()
     * @generated
     * @ordered
     */
    protected static final boolean HIDDEN_EDEFAULT = false;

    /**
     * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBold()
     * @generated
     * @ordered
     */
    protected static final boolean BOLD_EDEFAULT = false;

    /**
     * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isItalic()
     * @generated
     * @ordered
     */
    protected static final boolean ITALIC_EDEFAULT = false;

    /**
     * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnderline()
     * @generated
     * @ordered
     */
    protected static final boolean UNDERLINE_EDEFAULT = false;

    /**
     * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotation()
     * @generated
     * @ordered
     */
    protected static final int ROTATION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextAlignment()
     * @generated
     * @ordered
     */
    protected static final TextAlignment TEXT_ALIGNMENT_EDEFAULT = TextAlignment.LEFT;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final int DIRECTION_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeometryDescriptorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR;
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
    public DiagramLinkGeometryType getType() {
        return (DiagramLinkGeometryType)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TYPE, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(DiagramLinkGeometryType newType) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TYPE, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isHidden() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__HIDDEN, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__HIDDEN, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHidden(boolean newHidden) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__HIDDEN, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__HIDDEN, newHidden);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBold() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__BOLD, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__BOLD, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBold(boolean newBold) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__BOLD, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__BOLD, newBold);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isItalic() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ITALIC, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ITALIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItalic(boolean newItalic) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ITALIC, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ITALIC, newItalic);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUnderline() {
        return (Boolean)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__UNDERLINE, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__UNDERLINE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnderline(boolean newUnderline) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__UNDERLINE, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__UNDERLINE, newUnderline);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRotation() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ROTATION, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ROTATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRotation(int newRotation) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ROTATION, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ROTATION, newRotation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextAlignment getTextAlignment() {
        return (TextAlignment)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextAlignment(TextAlignment newTextAlignment) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT, newTextAlignment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDirection() {
        return (Integer)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__DIRECTION, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__DIRECTION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(int newDirection) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__DIRECTION, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__DIRECTION, newDirection);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RGBColor getColor() {
        return (RGBColor)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__COLOR, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RGBColor basicGetColor() {
        return (RGBColor)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__COLOR, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetColor(RGBColor newColor, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newColor, EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(RGBColor newColor) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__COLOR, newColor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point getOrigin() {
        return (Point)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ORIGIN, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point basicGetOrigin() {
        return (Point)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ORIGIN, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOrigin(Point newOrigin, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newOrigin, EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrigin(Point newOrigin) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__ORIGIN, newOrigin);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point getC() {
        return (Point)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__C, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point basicGetC() {
        return (Point)eDynamicGet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__C, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetC(Point newC, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newC, EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setC(Point newC) {
        eDynamicSet(EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C, EaobjectmodelPackage.Literals.GEOMETRY_DESCRIPTOR__C, newC);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR:
                return basicSetColor(null, msgs);
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN:
                return basicSetOrigin(null, msgs);
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C:
                return basicSetC(null, msgs);
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
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TYPE:
                return getType();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__HIDDEN:
                return isHidden();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__BOLD:
                return isBold();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ITALIC:
                return isItalic();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__UNDERLINE:
                return isUnderline();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ROTATION:
                return getRotation();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT:
                return getTextAlignment();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__DIRECTION:
                return getDirection();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR:
                if (resolve) return getColor();
                return basicGetColor();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN:
                if (resolve) return getOrigin();
                return basicGetOrigin();
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C:
                if (resolve) return getC();
                return basicGetC();
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
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TYPE:
                setType((DiagramLinkGeometryType)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__HIDDEN:
                setHidden((Boolean)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__BOLD:
                setBold((Boolean)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ITALIC:
                setItalic((Boolean)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__UNDERLINE:
                setUnderline((Boolean)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ROTATION:
                setRotation((Integer)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT:
                setTextAlignment((TextAlignment)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__DIRECTION:
                setDirection((Integer)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR:
                setColor((RGBColor)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN:
                setOrigin((Point)newValue);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C:
                setC((Point)newValue);
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
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__HIDDEN:
                setHidden(HIDDEN_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__BOLD:
                setBold(BOLD_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ITALIC:
                setItalic(ITALIC_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__UNDERLINE:
                setUnderline(UNDERLINE_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ROTATION:
                setRotation(ROTATION_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT:
                setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__DIRECTION:
                setDirection(DIRECTION_EDEFAULT);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR:
                setColor((RGBColor)null);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN:
                setOrigin((Point)null);
                return;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C:
                setC((Point)null);
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
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TYPE:
                return getType() != TYPE_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__HIDDEN:
                return isHidden() != HIDDEN_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__BOLD:
                return isBold() != BOLD_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ITALIC:
                return isItalic() != ITALIC_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__UNDERLINE:
                return isUnderline() != UNDERLINE_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ROTATION:
                return getRotation() != ROTATION_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__TEXT_ALIGNMENT:
                return getTextAlignment() != TEXT_ALIGNMENT_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__DIRECTION:
                return getDirection() != DIRECTION_EDEFAULT;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__COLOR:
                return basicGetColor() != null;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__ORIGIN:
                return basicGetOrigin() != null;
            case EaobjectmodelPackage.GEOMETRY_DESCRIPTOR__C:
                return basicGetC() != null;
        }
        return super.eIsSet(featureID);
    }

} //GeometryDescriptorImpl
