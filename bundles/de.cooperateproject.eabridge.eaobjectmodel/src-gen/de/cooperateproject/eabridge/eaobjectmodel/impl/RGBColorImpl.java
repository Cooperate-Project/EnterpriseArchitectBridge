/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.RGBColor;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGB Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.RGBColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.RGBColorImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.RGBColorImpl#getGreen <em>Green</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RGBColorImpl extends MinimalEObjectImpl.Container implements RGBColor {
    /**
     * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRed()
     * @generated
     * @ordered
     */
    protected static final byte RED_EDEFAULT = 0x00;

    /**
     * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlue()
     * @generated
     * @ordered
     */
    protected static final byte BLUE_EDEFAULT = 0x00;

    /**
     * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGreen()
     * @generated
     * @ordered
     */
    protected static final byte GREEN_EDEFAULT = 0x00;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RGBColorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EaobjectmodelPackage.Literals.RGB_COLOR;
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
    public byte getRed() {
        return (Byte)eDynamicGet(EaobjectmodelPackage.RGB_COLOR__RED, EaobjectmodelPackage.Literals.RGB_COLOR__RED, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRed(byte newRed) {
        eDynamicSet(EaobjectmodelPackage.RGB_COLOR__RED, EaobjectmodelPackage.Literals.RGB_COLOR__RED, newRed);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte getBlue() {
        return (Byte)eDynamicGet(EaobjectmodelPackage.RGB_COLOR__BLUE, EaobjectmodelPackage.Literals.RGB_COLOR__BLUE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlue(byte newBlue) {
        eDynamicSet(EaobjectmodelPackage.RGB_COLOR__BLUE, EaobjectmodelPackage.Literals.RGB_COLOR__BLUE, newBlue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte getGreen() {
        return (Byte)eDynamicGet(EaobjectmodelPackage.RGB_COLOR__GREEN, EaobjectmodelPackage.Literals.RGB_COLOR__GREEN, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGreen(byte newGreen) {
        eDynamicSet(EaobjectmodelPackage.RGB_COLOR__GREEN, EaobjectmodelPackage.Literals.RGB_COLOR__GREEN, newGreen);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EaobjectmodelPackage.RGB_COLOR__RED:
                return getRed();
            case EaobjectmodelPackage.RGB_COLOR__BLUE:
                return getBlue();
            case EaobjectmodelPackage.RGB_COLOR__GREEN:
                return getGreen();
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
            case EaobjectmodelPackage.RGB_COLOR__RED:
                setRed((Byte)newValue);
                return;
            case EaobjectmodelPackage.RGB_COLOR__BLUE:
                setBlue((Byte)newValue);
                return;
            case EaobjectmodelPackage.RGB_COLOR__GREEN:
                setGreen((Byte)newValue);
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
            case EaobjectmodelPackage.RGB_COLOR__RED:
                setRed(RED_EDEFAULT);
                return;
            case EaobjectmodelPackage.RGB_COLOR__BLUE:
                setBlue(BLUE_EDEFAULT);
                return;
            case EaobjectmodelPackage.RGB_COLOR__GREEN:
                setGreen(GREEN_EDEFAULT);
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
            case EaobjectmodelPackage.RGB_COLOR__RED:
                return getRed() != RED_EDEFAULT;
            case EaobjectmodelPackage.RGB_COLOR__BLUE:
                return getBlue() != BLUE_EDEFAULT;
            case EaobjectmodelPackage.RGB_COLOR__GREEN:
                return getGreen() != GREEN_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //RGBColorImpl
