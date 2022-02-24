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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FuelType;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fossil Fuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.FossilFuelImpl#getFossilFuelType <em>Fossil Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.FossilFuelImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FossilFuelImpl extends IdentifiedObjectImpl implements FossilFuel {
    /**
     * The default value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuelType()
     * @generated
     * @ordered
     */
    protected static final FuelType FOSSIL_FUEL_TYPE_EDEFAULT = FuelType.OIL_SHALE;

    /**
     * The cached value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuelType()
     * @generated
     * @ordered
     */
    protected FuelType fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;

    /**
     * This is true if the Fossil Fuel Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fossilFuelTypeESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnit()
     * @generated
     * @ordered
     */
    protected ThermalGeneratingUnit thermalGeneratingUnit;

    /**
     * This is true if the Thermal Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thermalGeneratingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FossilFuelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFossilFuel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FuelType getFossilFuelType() {
        return fossilFuelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFossilFuelType( FuelType newFossilFuelType ) {
        FuelType oldFossilFuelType = fossilFuelType;
        fossilFuelType = newFossilFuelType == null ? FOSSIL_FUEL_TYPE_EDEFAULT : newFossilFuelType;
        boolean oldFossilFuelTypeESet = fossilFuelTypeESet;
        fossilFuelTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE,
                    oldFossilFuelType, fossilFuelType, !oldFossilFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFossilFuelType() {
        FuelType oldFossilFuelType = fossilFuelType;
        boolean oldFossilFuelTypeESet = fossilFuelTypeESet;
        fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;
        fossilFuelTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE,
                    oldFossilFuelType, FOSSIL_FUEL_TYPE_EDEFAULT, oldFossilFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFossilFuelType() {
        return fossilFuelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit getThermalGeneratingUnit() {
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit,
            NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = newThermalGeneratingUnit;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit,
                    !oldThermalGeneratingUnitESet );
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
    public void setThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit ) {
        if( newThermalGeneratingUnit != thermalGeneratingUnit ) {
            NotificationChain msgs = null;
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT,
                        newThermalGeneratingUnit, newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetThermalGeneratingUnit( NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = null;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
                    oldThermalGeneratingUnitESet );
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
    public void unsetThermalGeneratingUnit() {
        if( thermalGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                    CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, null, null, oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnit() {
        return thermalGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            return basicSetThermalGeneratingUnit( ( ThermalGeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            return basicUnsetThermalGeneratingUnit( msgs );
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            return getFossilFuelType();
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            return getThermalGeneratingUnit();
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            setFossilFuelType( ( FuelType ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            setThermalGeneratingUnit( ( ThermalGeneratingUnit ) newValue );
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            unsetFossilFuelType();
            return;
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            unsetThermalGeneratingUnit();
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            return isSetFossilFuelType();
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            return isSetThermalGeneratingUnit();
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
        result.append( " (fossilFuelType: " );
        if( fossilFuelTypeESet )
            result.append( fossilFuelType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FossilFuelImpl
