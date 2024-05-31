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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerSystemResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solar Power Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.SolarPowerPlantImpl#getSolarGeneratingUnits <em>Solar Generating Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolarPowerPlantImpl extends PowerSystemResourceImpl implements SolarPowerPlant {
    /**
     * The cached value of the '{@link #getSolarGeneratingUnits() <em>Solar Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSolarGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< SolarGeneratingUnit > solarGeneratingUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SolarPowerPlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EuPackage.Literals.SOLAR_POWER_PLANT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SolarGeneratingUnit > getSolarGeneratingUnits() {
        if( solarGeneratingUnits == null ) {
            solarGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< >(
                    SolarGeneratingUnit.class, this, EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS,
                    CimPackage.SOLAR_GENERATING_UNIT__SOLAR_POWER_PLANT );
        }
        return solarGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSolarGeneratingUnits() {
        if( solarGeneratingUnits != null ) {
            ( ( InternalEList.Unsettable< ? > ) solarGeneratingUnits ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSolarGeneratingUnits() {
        return solarGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) solarGeneratingUnits ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSolarGeneratingUnits() )
                    .basicAdd( otherEnd, msgs );
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
        case EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getSolarGeneratingUnits() ).basicRemove( otherEnd, msgs );
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
        case EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS:
            return getSolarGeneratingUnits();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS:
            getSolarGeneratingUnits().clear();
            getSolarGeneratingUnits().addAll( ( Collection< ? extends SolarGeneratingUnit > ) newValue );
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
        case EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS:
            unsetSolarGeneratingUnits();
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
        case EuPackage.SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS:
            return isSetSolarGeneratingUnits();
        }
        return super.eIsSet( featureID );
    }

} //SolarPowerPlantImpl
