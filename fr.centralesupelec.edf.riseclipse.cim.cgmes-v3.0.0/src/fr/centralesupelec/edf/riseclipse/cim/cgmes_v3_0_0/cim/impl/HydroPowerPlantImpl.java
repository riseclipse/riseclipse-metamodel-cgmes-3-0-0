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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPlantStorageKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroPowerPlantImpl#getHydroPumps <em>Hydro Pumps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroPowerPlantImpl#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroPowerPlantImpl#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPowerPlantImpl extends PowerSystemResourceImpl implements HydroPowerPlant {
    /**
     * The cached value of the '{@link #getHydroPumps() <em>Hydro Pumps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPumps()
     * @generated
     * @ordered
     */
    protected EList< HydroPump > hydroPumps;

    /**
     * The default value of the '{@link #getHydroPlantStorageType() <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPlantStorageType()
     * @generated
     * @ordered
     */
    protected static final HydroPlantStorageKind HYDRO_PLANT_STORAGE_TYPE_EDEFAULT = HydroPlantStorageKind.RUN_OF_RIVER;

    /**
     * The cached value of the '{@link #getHydroPlantStorageType() <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPlantStorageType()
     * @generated
     * @ordered
     */
    protected HydroPlantStorageKind hydroPlantStorageType = HYDRO_PLANT_STORAGE_TYPE_EDEFAULT;

    /**
     * This is true if the Hydro Plant Storage Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPlantStorageTypeESet;

    /**
     * The cached value of the '{@link #getHydroGeneratingUnits() <em>Hydro Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< HydroGeneratingUnit > hydroGeneratingUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroPowerPlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroPowerPlant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroPump > getHydroPumps() {
        if( hydroPumps == null ) {
            hydroPumps = new EObjectWithInverseResolvingEList.Unsettable< >( HydroPump.class, this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT );
        }
        return hydroPumps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroPumps() {
        if( hydroPumps != null ) {
            ( ( InternalEList.Unsettable< ? > ) hydroPumps ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPumps() {
        return hydroPumps != null && ( ( InternalEList.Unsettable< ? > ) hydroPumps ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPlantStorageKind getHydroPlantStorageType() {
        return hydroPlantStorageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHydroPlantStorageType( HydroPlantStorageKind newHydroPlantStorageType ) {
        HydroPlantStorageKind oldHydroPlantStorageType = hydroPlantStorageType;
        hydroPlantStorageType = newHydroPlantStorageType == null ? HYDRO_PLANT_STORAGE_TYPE_EDEFAULT
                : newHydroPlantStorageType;
        boolean oldHydroPlantStorageTypeESet = hydroPlantStorageTypeESet;
        hydroPlantStorageTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE, oldHydroPlantStorageType,
                    hydroPlantStorageType, !oldHydroPlantStorageTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroPlantStorageType() {
        HydroPlantStorageKind oldHydroPlantStorageType = hydroPlantStorageType;
        boolean oldHydroPlantStorageTypeESet = hydroPlantStorageTypeESet;
        hydroPlantStorageType = HYDRO_PLANT_STORAGE_TYPE_EDEFAULT;
        hydroPlantStorageTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE, oldHydroPlantStorageType,
                    HYDRO_PLANT_STORAGE_TYPE_EDEFAULT, oldHydroPlantStorageTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPlantStorageType() {
        return hydroPlantStorageTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroGeneratingUnit > getHydroGeneratingUnits() {
        if( hydroGeneratingUnits == null ) {
            hydroGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< >(
                    HydroGeneratingUnit.class, this, CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT );
        }
        return hydroGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroGeneratingUnits() {
        if( hydroGeneratingUnits != null ) {
            ( ( InternalEList.Unsettable< ? > ) hydroGeneratingUnits ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroGeneratingUnits() {
        return hydroGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) hydroGeneratingUnits ).isSet();
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHydroPumps() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHydroGeneratingUnits() )
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return ( ( InternalEList< ? > ) getHydroPumps() ).basicRemove( otherEnd, msgs );
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getHydroGeneratingUnits() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return getHydroPumps();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            return getHydroPlantStorageType();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return getHydroGeneratingUnits();
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            getHydroPumps().clear();
            getHydroPumps().addAll( ( Collection< ? extends HydroPump > ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            setHydroPlantStorageType( ( HydroPlantStorageKind ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            getHydroGeneratingUnits().clear();
            getHydroGeneratingUnits().addAll( ( Collection< ? extends HydroGeneratingUnit > ) newValue );
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            unsetHydroPumps();
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            unsetHydroPlantStorageType();
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            unsetHydroGeneratingUnits();
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return isSetHydroPumps();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            return isSetHydroPlantStorageType();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return isSetHydroGeneratingUnits();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (hydroPlantStorageType: " );
        if( hydroPlantStorageTypeESet ) {
            result.append( hydroPlantStorageType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //HydroPowerPlantImpl
