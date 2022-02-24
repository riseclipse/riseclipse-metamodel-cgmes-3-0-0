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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryStateKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BatteryUnitImpl#getRatedE <em>Rated E</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BatteryUnitImpl#getBatteryState <em>Battery State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BatteryUnitImpl#getStoredE <em>Stored E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryUnitImpl extends PowerElectronicsUnitImpl implements BatteryUnit {
    /**
     * The default value of the '{@link #getRatedE() <em>Rated E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedE()
     * @generated
     * @ordered
     */
    protected static final Double RATED_E_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedE() <em>Rated E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedE()
     * @generated
     * @ordered
     */
    protected Double ratedE = RATED_E_EDEFAULT;

    /**
     * This is true if the Rated E attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedEESet;

    /**
     * The default value of the '{@link #getBatteryState() <em>Battery State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatteryState()
     * @generated
     * @ordered
     */
    protected static final BatteryStateKind BATTERY_STATE_EDEFAULT = BatteryStateKind.CHARGING;

    /**
     * The cached value of the '{@link #getBatteryState() <em>Battery State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBatteryState()
     * @generated
     * @ordered
     */
    protected BatteryStateKind batteryState = BATTERY_STATE_EDEFAULT;

    /**
     * This is true if the Battery State attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean batteryStateESet;

    /**
     * The default value of the '{@link #getStoredE() <em>Stored E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoredE()
     * @generated
     * @ordered
     */
    protected static final Double STORED_E_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStoredE() <em>Stored E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoredE()
     * @generated
     * @ordered
     */
    protected Double storedE = STORED_E_EDEFAULT;

    /**
     * This is true if the Stored E attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean storedEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BatteryUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBatteryUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedE() {
        return ratedE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedE( Double newRatedE ) {
        Double oldRatedE = ratedE;
        ratedE = newRatedE;
        boolean oldRatedEESet = ratedEESet;
        ratedEESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BATTERY_UNIT__RATED_E, oldRatedE, ratedE,
                    !oldRatedEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedE() {
        Double oldRatedE = ratedE;
        boolean oldRatedEESet = ratedEESet;
        ratedE = RATED_E_EDEFAULT;
        ratedEESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BATTERY_UNIT__RATED_E, oldRatedE,
                    RATED_E_EDEFAULT, oldRatedEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedE() {
        return ratedEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BatteryStateKind getBatteryState() {
        return batteryState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBatteryState( BatteryStateKind newBatteryState ) {
        BatteryStateKind oldBatteryState = batteryState;
        batteryState = newBatteryState == null ? BATTERY_STATE_EDEFAULT : newBatteryState;
        boolean oldBatteryStateESet = batteryStateESet;
        batteryStateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BATTERY_UNIT__BATTERY_STATE,
                    oldBatteryState, batteryState, !oldBatteryStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBatteryState() {
        BatteryStateKind oldBatteryState = batteryState;
        boolean oldBatteryStateESet = batteryStateESet;
        batteryState = BATTERY_STATE_EDEFAULT;
        batteryStateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BATTERY_UNIT__BATTERY_STATE,
                    oldBatteryState, BATTERY_STATE_EDEFAULT, oldBatteryStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBatteryState() {
        return batteryStateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getStoredE() {
        return storedE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStoredE( Double newStoredE ) {
        Double oldStoredE = storedE;
        storedE = newStoredE;
        boolean oldStoredEESet = storedEESet;
        storedEESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BATTERY_UNIT__STORED_E, oldStoredE,
                    storedE, !oldStoredEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStoredE() {
        Double oldStoredE = storedE;
        boolean oldStoredEESet = storedEESet;
        storedE = STORED_E_EDEFAULT;
        storedEESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BATTERY_UNIT__STORED_E, oldStoredE,
                    STORED_E_EDEFAULT, oldStoredEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStoredE() {
        return storedEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.BATTERY_UNIT__RATED_E:
            return getRatedE();
        case CimPackage.BATTERY_UNIT__BATTERY_STATE:
            return getBatteryState();
        case CimPackage.BATTERY_UNIT__STORED_E:
            return getStoredE();
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
        case CimPackage.BATTERY_UNIT__RATED_E:
            setRatedE( ( Double ) newValue );
            return;
        case CimPackage.BATTERY_UNIT__BATTERY_STATE:
            setBatteryState( ( BatteryStateKind ) newValue );
            return;
        case CimPackage.BATTERY_UNIT__STORED_E:
            setStoredE( ( Double ) newValue );
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
        case CimPackage.BATTERY_UNIT__RATED_E:
            unsetRatedE();
            return;
        case CimPackage.BATTERY_UNIT__BATTERY_STATE:
            unsetBatteryState();
            return;
        case CimPackage.BATTERY_UNIT__STORED_E:
            unsetStoredE();
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
        case CimPackage.BATTERY_UNIT__RATED_E:
            return isSetRatedE();
        case CimPackage.BATTERY_UNIT__BATTERY_STATE:
            return isSetBatteryState();
        case CimPackage.BATTERY_UNIT__STORED_E:
            return isSetStoredE();
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
        result.append( " (ratedE: " );
        if( ratedEESet )
            result.append( ratedE );
        else
            result.append( "<unset>" );
        result.append( ", batteryState: " );
        if( batteryStateESet )
            result.append( batteryState );
        else
            result.append( "<unset>" );
        result.append( ", storedE: " );
        if( storedEESet )
            result.append( storedE );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BatteryUnitImpl
