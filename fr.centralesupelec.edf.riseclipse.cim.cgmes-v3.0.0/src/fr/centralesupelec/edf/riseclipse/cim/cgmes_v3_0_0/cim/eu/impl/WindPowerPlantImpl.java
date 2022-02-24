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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerSystemResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Power Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.WindPowerPlantImpl#getWindGeneratingUnits <em>Wind Generating Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPowerPlantImpl extends PowerSystemResourceImpl implements WindPowerPlant {
    /**
     * The cached value of the '{@link #getWindGeneratingUnits() <em>Wind Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< WindGeneratingUnit > windGeneratingUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPowerPlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EuPackage.Literals.WIND_POWER_PLANT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindGeneratingUnit > getWindGeneratingUnits() {
        if( windGeneratingUnits == null ) {
            windGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< >(
                    WindGeneratingUnit.class, this, EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS,
                    CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT );
        }
        return windGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindGeneratingUnits() {
        if( windGeneratingUnits != null ) ( ( InternalEList.Unsettable< ? > ) windGeneratingUnits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGeneratingUnits() {
        return windGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) windGeneratingUnits ).isSet();
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
        case EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindGeneratingUnits() )
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
        case EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getWindGeneratingUnits() ).basicRemove( otherEnd, msgs );
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
        case EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS:
            return getWindGeneratingUnits();
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
        case EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS:
            getWindGeneratingUnits().clear();
            getWindGeneratingUnits().addAll( ( Collection< ? extends WindGeneratingUnit > ) newValue );
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
        case EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS:
            unsetWindGeneratingUnits();
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
        case EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS:
            return isSetWindGeneratingUnits();
        }
        return super.eIsSet( featureID );
    }

} //WindPowerPlantImpl
