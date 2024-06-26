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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Plant Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantDynamicsImpl#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantDynamicsImpl#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPlantDynamicsImpl extends DynamicsFunctionBlockImpl implements WindPlantDynamics {
    /**
     * The cached value of the '{@link #getWindTurbineType3or4Dynamics() <em>Wind Turbine Type3or4 Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     * @ordered
     */
    protected EList< WindTurbineType3or4Dynamics > windTurbineType3or4Dynamics;

    /**
     * The cached value of the '{@link #getRemoteInputSignal() <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteInputSignal()
     * @generated
     * @ordered
     */
    protected RemoteInputSignal remoteInputSignal;

    /**
     * This is true if the Remote Input Signal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteInputSignalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPlantDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPlantDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindTurbineType3or4Dynamics > getWindTurbineType3or4Dynamics() {
        if( windTurbineType3or4Dynamics == null ) {
            windTurbineType3or4Dynamics = new EObjectWithInverseResolvingEList.Unsettable< >(
                    WindTurbineType3or4Dynamics.class, this,
                    CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__WIND_PLANT_DYNAMICS );
        }
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindTurbineType3or4Dynamics() {
        if( windTurbineType3or4Dynamics != null ) {
            ( ( InternalEList.Unsettable< ? > ) windTurbineType3or4Dynamics ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4Dynamics() {
        return windTurbineType3or4Dynamics != null
                && ( ( InternalEList.Unsettable< ? > ) windTurbineType3or4Dynamics ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteInputSignal getRemoteInputSignal() {
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoteInputSignal( RemoteInputSignal newRemoteInputSignal,
            NotificationChain msgs ) {
        RemoteInputSignal oldRemoteInputSignal = remoteInputSignal;
        remoteInputSignal = newRemoteInputSignal;
        boolean oldRemoteInputSignalESet = remoteInputSignalESet;
        remoteInputSignalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal, newRemoteInputSignal,
                    !oldRemoteInputSignalESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemoteInputSignal( RemoteInputSignal newRemoteInputSignal ) {
        if( newRemoteInputSignal != remoteInputSignal ) {
            NotificationChain msgs = null;
            if( remoteInputSignal != null ) {
                msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                        CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, RemoteInputSignal.class, msgs );
            }
            if( newRemoteInputSignal != null ) {
                msgs = ( ( InternalEObject ) newRemoteInputSignal ).eInverseAdd( this,
                        CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, RemoteInputSignal.class, msgs );
            }
            msgs = basicSetRemoteInputSignal( newRemoteInputSignal, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRemoteInputSignalESet = remoteInputSignalESet;
            remoteInputSignalESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, newRemoteInputSignal, newRemoteInputSignal,
                        !oldRemoteInputSignalESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRemoteInputSignal( NotificationChain msgs ) {
        RemoteInputSignal oldRemoteInputSignal = remoteInputSignal;
        remoteInputSignal = null;
        boolean oldRemoteInputSignalESet = remoteInputSignalESet;
        remoteInputSignalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, oldRemoteInputSignal, null,
                    oldRemoteInputSignalESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteInputSignal() {
        if( remoteInputSignal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                    CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, RemoteInputSignal.class, msgs );
            msgs = basicUnsetRemoteInputSignal( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRemoteInputSignalESet = remoteInputSignalESet;
            remoteInputSignalESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL, null, null, oldRemoteInputSignalESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteInputSignal() {
        return remoteInputSignalESet;
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
        case CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindTurbineType3or4Dynamics() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL:
            if( remoteInputSignal != null ) {
                msgs = ( ( InternalEObject ) remoteInputSignal ).eInverseRemove( this,
                        CimPackage.REMOTE_INPUT_SIGNAL__WIND_PLANT_DYNAMICS, RemoteInputSignal.class, msgs );
            }
            return basicSetRemoteInputSignal( ( RemoteInputSignal ) otherEnd, msgs );
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
        case CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return ( ( InternalEList< ? > ) getWindTurbineType3or4Dynamics() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return basicUnsetRemoteInputSignal( msgs );
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
        case CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return getWindTurbineType3or4Dynamics();
        case CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return getRemoteInputSignal();
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
        case CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            getWindTurbineType3or4Dynamics().clear();
            getWindTurbineType3or4Dynamics().addAll( ( Collection< ? extends WindTurbineType3or4Dynamics > ) newValue );
            return;
        case CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL:
            setRemoteInputSignal( ( RemoteInputSignal ) newValue );
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
        case CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            unsetWindTurbineType3or4Dynamics();
            return;
        case CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL:
            unsetRemoteInputSignal();
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
        case CimPackage.WIND_PLANT_DYNAMICS__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return isSetWindTurbineType3or4Dynamics();
        case CimPackage.WIND_PLANT_DYNAMICS__REMOTE_INPUT_SIGNAL:
            return isSetRemoteInputSignal();
        }
        return super.eIsSet( featureID );
    }

} //WindPlantDynamicsImpl
