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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CombinedCyclePlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Cycle Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CombinedCyclePlantImpl#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedCyclePlantImpl extends PowerSystemResourceImpl implements CombinedCyclePlant {
    /**
     * The cached value of the '{@link #getThermalGeneratingUnits() <em>Thermal Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< ThermalGeneratingUnit > thermalGeneratingUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombinedCyclePlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCombinedCyclePlant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ThermalGeneratingUnit > getThermalGeneratingUnits() {
        if( thermalGeneratingUnits == null ) {
            thermalGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ThermalGeneratingUnit.class, this, CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT );
        }
        return thermalGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalGeneratingUnits() {
        if( thermalGeneratingUnits != null ) {
            ( ( InternalEList.Unsettable< ? > ) thermalGeneratingUnits ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnits() {
        return thermalGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) thermalGeneratingUnits ).isSet();
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getThermalGeneratingUnits() )
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getThermalGeneratingUnits() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return getThermalGeneratingUnits();
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            getThermalGeneratingUnits().clear();
            getThermalGeneratingUnits().addAll( ( Collection< ? extends ThermalGeneratingUnit > ) newValue );
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            unsetThermalGeneratingUnits();
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return isSetThermalGeneratingUnits();
        }
        return super.eIsSet( featureID );
    }

} //CombinedCyclePlantImpl
