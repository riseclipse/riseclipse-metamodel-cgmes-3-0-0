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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroEnergyConversionKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroTurbineKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroGeneratingUnitImpl#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroGeneratingUnitImpl#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroGeneratingUnitImpl#getDropHeight <em>Drop Height</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroGeneratingUnitImpl#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroGeneratingUnitImpl extends GeneratingUnitImpl implements HydroGeneratingUnit {
    /**
     * The default value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConversionCapability()
     * @generated
     * @ordered
     */
    protected static final HydroEnergyConversionKind ENERGY_CONVERSION_CAPABILITY_EDEFAULT = HydroEnergyConversionKind.GENERATOR;

    /**
     * The cached value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConversionCapability()
     * @generated
     * @ordered
     */
    protected HydroEnergyConversionKind energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;

    /**
     * This is true if the Energy Conversion Capability attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyConversionCapabilityESet;

    /**
     * The default value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineType()
     * @generated
     * @ordered
     */
    protected static final HydroTurbineKind TURBINE_TYPE_EDEFAULT = HydroTurbineKind.FRANCIS;

    /**
     * The cached value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineType()
     * @generated
     * @ordered
     */
    protected HydroTurbineKind turbineType = TURBINE_TYPE_EDEFAULT;

    /**
     * This is true if the Turbine Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineTypeESet;

    /**
     * The default value of the '{@link #getDropHeight() <em>Drop Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDropHeight()
     * @generated
     * @ordered
     */
    protected static final Double DROP_HEIGHT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDropHeight() <em>Drop Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDropHeight()
     * @generated
     * @ordered
     */
    protected Double dropHeight = DROP_HEIGHT_EDEFAULT;

    /**
     * This is true if the Drop Height attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dropHeightESet;

    /**
     * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPowerPlant()
     * @generated
     * @ordered
     */
    protected HydroPowerPlant hydroPowerPlant;

    /**
     * This is true if the Hydro Power Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPowerPlantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroEnergyConversionKind getEnergyConversionCapability() {
        return energyConversionCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyConversionCapability( HydroEnergyConversionKind newEnergyConversionCapability ) {
        HydroEnergyConversionKind oldEnergyConversionCapability = energyConversionCapability;
        energyConversionCapability = newEnergyConversionCapability == null ? ENERGY_CONVERSION_CAPABILITY_EDEFAULT
                : newEnergyConversionCapability;
        boolean oldEnergyConversionCapabilityESet = energyConversionCapabilityESet;
        energyConversionCapabilityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY, oldEnergyConversionCapability,
                    energyConversionCapability, !oldEnergyConversionCapabilityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyConversionCapability() {
        HydroEnergyConversionKind oldEnergyConversionCapability = energyConversionCapability;
        boolean oldEnergyConversionCapabilityESet = energyConversionCapabilityESet;
        energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;
        energyConversionCapabilityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY, oldEnergyConversionCapability,
                    ENERGY_CONVERSION_CAPABILITY_EDEFAULT, oldEnergyConversionCapabilityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyConversionCapability() {
        return energyConversionCapabilityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDropHeight() {
        return dropHeight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDropHeight( Double newDropHeight ) {
        Double oldDropHeight = dropHeight;
        dropHeight = newDropHeight;
        boolean oldDropHeightESet = dropHeightESet;
        dropHeightESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_GENERATING_UNIT__DROP_HEIGHT,
                    oldDropHeight, dropHeight, !oldDropHeightESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDropHeight() {
        Double oldDropHeight = dropHeight;
        boolean oldDropHeightESet = dropHeightESet;
        dropHeight = DROP_HEIGHT_EDEFAULT;
        dropHeightESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_GENERATING_UNIT__DROP_HEIGHT,
                    oldDropHeight, DROP_HEIGHT_EDEFAULT, oldDropHeightESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDropHeight() {
        return dropHeightESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroTurbineKind getTurbineType() {
        return turbineType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTurbineType( HydroTurbineKind newTurbineType ) {
        HydroTurbineKind oldTurbineType = turbineType;
        turbineType = newTurbineType == null ? TURBINE_TYPE_EDEFAULT : newTurbineType;
        boolean oldTurbineTypeESet = turbineTypeESet;
        turbineTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_GENERATING_UNIT__TURBINE_TYPE,
                    oldTurbineType, turbineType, !oldTurbineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTurbineType() {
        HydroTurbineKind oldTurbineType = turbineType;
        boolean oldTurbineTypeESet = turbineTypeESet;
        turbineType = TURBINE_TYPE_EDEFAULT;
        turbineTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_GENERATING_UNIT__TURBINE_TYPE,
                    oldTurbineType, TURBINE_TYPE_EDEFAULT, oldTurbineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineType() {
        return turbineTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPowerPlant getHydroPowerPlant() {
        return hydroPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPowerPlant( HydroPowerPlant newHydroPowerPlant, NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = newHydroPowerPlant;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, oldHydroPowerPlant, newHydroPowerPlant,
                    !oldHydroPowerPlantESet );
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
    public void setHydroPowerPlant( HydroPowerPlant newHydroPowerPlant ) {
        if( newHydroPowerPlant != hydroPowerPlant ) {
            NotificationChain msgs = null;
            if( hydroPowerPlant != null )
                msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                        CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            if( newHydroPowerPlant != null )
                msgs = ( ( InternalEObject ) newHydroPowerPlant ).eInverseAdd( this,
                        CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            msgs = basicSetHydroPowerPlant( newHydroPowerPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, newHydroPowerPlant, newHydroPowerPlant,
                        !oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPowerPlant( NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = null;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, oldHydroPowerPlant, null,
                    oldHydroPowerPlantESet );
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
    public void unsetHydroPowerPlant() {
        if( hydroPowerPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            msgs = basicUnsetHydroPowerPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, null, null, oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPowerPlant() {
        return hydroPowerPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            if( hydroPowerPlant != null )
                msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                        CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            return basicSetHydroPowerPlant( ( HydroPowerPlant ) otherEnd, msgs );
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
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            return basicUnsetHydroPowerPlant( msgs );
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            return getEnergyConversionCapability();
        case CimPackage.HYDRO_GENERATING_UNIT__TURBINE_TYPE:
            return getTurbineType();
        case CimPackage.HYDRO_GENERATING_UNIT__DROP_HEIGHT:
            return getDropHeight();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            return getHydroPowerPlant();
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            setEnergyConversionCapability( ( HydroEnergyConversionKind ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__TURBINE_TYPE:
            setTurbineType( ( HydroTurbineKind ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__DROP_HEIGHT:
            setDropHeight( ( Double ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            setHydroPowerPlant( ( HydroPowerPlant ) newValue );
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            unsetEnergyConversionCapability();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__TURBINE_TYPE:
            unsetTurbineType();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__DROP_HEIGHT:
            unsetDropHeight();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            unsetHydroPowerPlant();
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            return isSetEnergyConversionCapability();
        case CimPackage.HYDRO_GENERATING_UNIT__TURBINE_TYPE:
            return isSetTurbineType();
        case CimPackage.HYDRO_GENERATING_UNIT__DROP_HEIGHT:
            return isSetDropHeight();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            return isSetHydroPowerPlant();
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
        result.append( " (energyConversionCapability: " );
        if( energyConversionCapabilityESet )
            result.append( energyConversionCapability );
        else
            result.append( "<unset>" );
        result.append( ", turbineType: " );
        if( turbineTypeESet )
            result.append( turbineType );
        else
            result.append( "<unset>" );
        result.append( ", dropHeight: " );
        if( dropHeightESet )
            result.append( dropHeight );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HydroGeneratingUnitImpl
