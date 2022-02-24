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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solar Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SolarGeneratingUnitImpl#getSolarPowerPlant <em>Solar Power Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolarGeneratingUnitImpl extends GeneratingUnitImpl implements SolarGeneratingUnit {
    /**
     * The cached value of the '{@link #getSolarPowerPlant() <em>Solar Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSolarPowerPlant()
     * @generated
     * @ordered
     */
    protected SolarPowerPlant solarPowerPlant;

    /**
     * This is true if the Solar Power Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean solarPowerPlantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SolarGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSolarGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SolarPowerPlant getSolarPowerPlant() {
        return solarPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSolarPowerPlant( SolarPowerPlant newSolarPowerPlant, NotificationChain msgs ) {
        SolarPowerPlant oldSolarPowerPlant = solarPowerPlant;
        solarPowerPlant = newSolarPowerPlant;
        boolean oldSolarPowerPlantESet = solarPowerPlantESet;
        solarPowerPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT, oldSolarPowerPlant, newSolarPowerPlant,
                    !oldSolarPowerPlantESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSolarPowerPlant( SolarPowerPlant newSolarPowerPlant ) {
        if( newSolarPowerPlant != solarPowerPlant ) {
            NotificationChain msgs = null;
            if( solarPowerPlant != null )
                msgs = ( ( InternalEObject ) solarPowerPlant ).eInverseRemove( this,
                        EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS, SolarPowerPlant.class, msgs );
            if( newSolarPowerPlant != null )
                msgs = ( ( InternalEObject ) newSolarPowerPlant ).eInverseAdd( this,
                        EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS, SolarPowerPlant.class, msgs );
            msgs = basicSetSolarPowerPlant( newSolarPowerPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSolarPowerPlantESet = solarPowerPlantESet;
            solarPowerPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT, newSolarPowerPlant, newSolarPowerPlant,
                        !oldSolarPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSolarPowerPlant( NotificationChain msgs ) {
        SolarPowerPlant oldSolarPowerPlant = solarPowerPlant;
        solarPowerPlant = null;
        boolean oldSolarPowerPlantESet = solarPowerPlantESet;
        solarPowerPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT, oldSolarPowerPlant, null,
                    oldSolarPowerPlantESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarPowerPlant() {
        if( solarPowerPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) solarPowerPlant ).eInverseRemove( this,
                    EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS, SolarPowerPlant.class, msgs );
            msgs = basicUnsetSolarPowerPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSolarPowerPlantESet = solarPowerPlantESet;
            solarPowerPlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT, null, null, oldSolarPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarPowerPlant() {
        return solarPowerPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT:
            if( solarPowerPlant != null )
                msgs = ( ( InternalEObject ) solarPowerPlant ).eInverseRemove( this,
                        EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS, SolarPowerPlant.class, msgs );
            return basicSetSolarPowerPlant( ( SolarPowerPlant ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT:
            return basicUnsetSolarPowerPlant( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT:
            return getSolarPowerPlant();
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
        case CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT:
            setSolarPowerPlant( ( SolarPowerPlant ) newValue );
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
        case CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT:
            unsetSolarPowerPlant();
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
        case CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT:
            return isSetSolarPowerPlant();
        }
        return super.eIsSet( featureID );
    }

} //SolarGeneratingUnitImpl
