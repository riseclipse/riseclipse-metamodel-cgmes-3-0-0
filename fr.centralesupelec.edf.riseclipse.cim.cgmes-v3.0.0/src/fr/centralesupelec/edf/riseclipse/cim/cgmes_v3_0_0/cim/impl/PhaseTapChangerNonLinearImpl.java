/**
 *   Copyright (c) 2016-2022 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
 *
 *  This file is part of the RiseClipse tool
 *
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Tap Changer Non Linear</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PhaseTapChangerNonLinearImpl#getVoltageStepIncrement <em>Voltage Step Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PhaseTapChangerNonLinearImpl#getXMax <em>XMax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PhaseTapChangerNonLinearImpl#getXMin <em>XMin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTapChangerNonLinearImpl extends PhaseTapChangerImpl implements PhaseTapChangerNonLinear {
    /**
     * The default value of the '{@link #getVoltageStepIncrement() <em>Voltage Step Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageStepIncrement()
     * @generated
     * @ordered
     */
    protected static final Double VOLTAGE_STEP_INCREMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageStepIncrement() <em>Voltage Step Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageStepIncrement()
     * @generated
     * @ordered
     */
    protected Double voltageStepIncrement = VOLTAGE_STEP_INCREMENT_EDEFAULT;

    /**
     * This is true if the Voltage Step Increment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageStepIncrementESet;

    /**
     * The default value of the '{@link #getXMax() <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMax()
     * @generated
     * @ordered
     */
    protected static final Double XMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXMax() <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMax()
     * @generated
     * @ordered
     */
    protected Double xMax = XMAX_EDEFAULT;

    /**
     * This is true if the XMax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xMaxESet;

    /**
     * The default value of the '{@link #getXMin() <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMin()
     * @generated
     * @ordered
     */
    protected static final Double XMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXMin() <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMin()
     * @generated
     * @ordered
     */
    protected Double xMin = XMIN_EDEFAULT;

    /**
     * This is true if the XMin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xMinESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhaseTapChangerNonLinearImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPhaseTapChangerNonLinear();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoltageStepIncrement() {
        return voltageStepIncrement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageStepIncrement( Double newVoltageStepIncrement ) {
        Double oldVoltageStepIncrement = voltageStepIncrement;
        voltageStepIncrement = newVoltageStepIncrement;
        boolean oldVoltageStepIncrementESet = voltageStepIncrementESet;
        voltageStepIncrementESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT, oldVoltageStepIncrement,
                    voltageStepIncrement, !oldVoltageStepIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageStepIncrement() {
        Double oldVoltageStepIncrement = voltageStepIncrement;
        boolean oldVoltageStepIncrementESet = voltageStepIncrementESet;
        voltageStepIncrement = VOLTAGE_STEP_INCREMENT_EDEFAULT;
        voltageStepIncrementESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT, oldVoltageStepIncrement,
                    VOLTAGE_STEP_INCREMENT_EDEFAULT, oldVoltageStepIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageStepIncrement() {
        return voltageStepIncrementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXMax() {
        return xMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXMax( Double newXMax ) {
        Double oldXMax = xMax;
        xMax = newXMax;
        boolean oldXMaxESet = xMaxESet;
        xMaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX,
                    oldXMax, xMax, !oldXMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXMax() {
        Double oldXMax = xMax;
        boolean oldXMaxESet = xMaxESet;
        xMax = XMAX_EDEFAULT;
        xMaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX,
                    oldXMax, XMAX_EDEFAULT, oldXMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXMax() {
        return xMaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXMin() {
        return xMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXMin( Double newXMin ) {
        Double oldXMin = xMin;
        xMin = newXMin;
        boolean oldXMinESet = xMinESet;
        xMinESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMIN,
                    oldXMin, xMin, !oldXMinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXMin() {
        Double oldXMin = xMin;
        boolean oldXMinESet = xMinESet;
        xMin = XMIN_EDEFAULT;
        xMinESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMIN,
                    oldXMin, XMIN_EDEFAULT, oldXMinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXMin() {
        return xMinESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
            return getVoltageStepIncrement();
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
            return getXMax();
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMIN:
            return getXMin();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
            setVoltageStepIncrement( ( Double ) newValue );
            return;
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
            setXMax( ( Double ) newValue );
            return;
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMIN:
            setXMin( ( Double ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
            unsetVoltageStepIncrement();
            return;
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
            unsetXMax();
            return;
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMIN:
            unsetXMin();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
            return isSetVoltageStepIncrement();
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
            return isSetXMax();
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMIN:
            return isSetXMin();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (voltageStepIncrement: " );
        if( voltageStepIncrementESet )
            result.append( voltageStepIncrement );
        else
            result.append( "<unset>" );
        result.append( ", xMax: " );
        if( xMaxESet )
            result.append( xMax );
        else
            result.append( "<unset>" );
        result.append( ", xMin: " );
        if( xMinESet )
            result.append( xMin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PhaseTapChangerNonLinearImpl
