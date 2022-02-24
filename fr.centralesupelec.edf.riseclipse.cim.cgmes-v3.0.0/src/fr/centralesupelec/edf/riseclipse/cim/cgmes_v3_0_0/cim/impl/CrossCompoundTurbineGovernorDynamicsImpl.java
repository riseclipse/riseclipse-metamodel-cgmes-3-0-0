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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Compound Turbine Governor Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CrossCompoundTurbineGovernorDynamicsImpl#getHighPressureSynchronousMachineDynamics <em>High Pressure Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CrossCompoundTurbineGovernorDynamicsImpl#getLowPressureSynchronousMachineDynamics <em>Low Pressure Synchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossCompoundTurbineGovernorDynamicsImpl extends DynamicsFunctionBlockImpl
        implements CrossCompoundTurbineGovernorDynamics {
    /**
     * The cached value of the '{@link #getHighPressureSynchronousMachineDynamics() <em>High Pressure Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighPressureSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics highPressureSynchronousMachineDynamics;

    /**
     * This is true if the High Pressure Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highPressureSynchronousMachineDynamicsESet;

    /**
     * The cached value of the '{@link #getLowPressureSynchronousMachineDynamics() <em>Low Pressure Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowPressureSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics lowPressureSynchronousMachineDynamics;

    /**
     * This is true if the Low Pressure Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowPressureSynchronousMachineDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrossCompoundTurbineGovernorDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCrossCompoundTurbineGovernorDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getHighPressureSynchronousMachineDynamics() {
        return highPressureSynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHighPressureSynchronousMachineDynamics(
            SynchronousMachineDynamics newHighPressureSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldHighPressureSynchronousMachineDynamics = highPressureSynchronousMachineDynamics;
        highPressureSynchronousMachineDynamics = newHighPressureSynchronousMachineDynamics;
        boolean oldHighPressureSynchronousMachineDynamicsESet = highPressureSynchronousMachineDynamicsESet;
        highPressureSynchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                    oldHighPressureSynchronousMachineDynamics, newHighPressureSynchronousMachineDynamics,
                    !oldHighPressureSynchronousMachineDynamicsESet );
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
    public void setHighPressureSynchronousMachineDynamics(
            SynchronousMachineDynamics newHighPressureSynchronousMachineDynamics ) {
        if( newHighPressureSynchronousMachineDynamics != highPressureSynchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( highPressureSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) highPressureSynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                        SynchronousMachineDynamics.class, msgs );
            if( newHighPressureSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newHighPressureSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                        SynchronousMachineDynamics.class, msgs );
            msgs = basicSetHighPressureSynchronousMachineDynamics( newHighPressureSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHighPressureSynchronousMachineDynamicsESet = highPressureSynchronousMachineDynamicsESet;
            highPressureSynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        newHighPressureSynchronousMachineDynamics, newHighPressureSynchronousMachineDynamics,
                        !oldHighPressureSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHighPressureSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldHighPressureSynchronousMachineDynamics = highPressureSynchronousMachineDynamics;
        highPressureSynchronousMachineDynamics = null;
        boolean oldHighPressureSynchronousMachineDynamicsESet = highPressureSynchronousMachineDynamicsESet;
        highPressureSynchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                    oldHighPressureSynchronousMachineDynamics, null, oldHighPressureSynchronousMachineDynamicsESet );
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
    public void unsetHighPressureSynchronousMachineDynamics() {
        if( highPressureSynchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) highPressureSynchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                    SynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetHighPressureSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHighPressureSynchronousMachineDynamicsESet = highPressureSynchronousMachineDynamicsESet;
            highPressureSynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        null, null, oldHighPressureSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighPressureSynchronousMachineDynamics() {
        return highPressureSynchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getLowPressureSynchronousMachineDynamics() {
        return lowPressureSynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLowPressureSynchronousMachineDynamics(
            SynchronousMachineDynamics newLowPressureSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldLowPressureSynchronousMachineDynamics = lowPressureSynchronousMachineDynamics;
        lowPressureSynchronousMachineDynamics = newLowPressureSynchronousMachineDynamics;
        boolean oldLowPressureSynchronousMachineDynamicsESet = lowPressureSynchronousMachineDynamicsESet;
        lowPressureSynchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                    oldLowPressureSynchronousMachineDynamics, newLowPressureSynchronousMachineDynamics,
                    !oldLowPressureSynchronousMachineDynamicsESet );
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
    public void setLowPressureSynchronousMachineDynamics(
            SynchronousMachineDynamics newLowPressureSynchronousMachineDynamics ) {
        if( newLowPressureSynchronousMachineDynamics != lowPressureSynchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( lowPressureSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) lowPressureSynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            if( newLowPressureSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newLowPressureSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            msgs = basicSetLowPressureSynchronousMachineDynamics( newLowPressureSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLowPressureSynchronousMachineDynamicsESet = lowPressureSynchronousMachineDynamicsESet;
            lowPressureSynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        newLowPressureSynchronousMachineDynamics, newLowPressureSynchronousMachineDynamics,
                        !oldLowPressureSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLowPressureSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldLowPressureSynchronousMachineDynamics = lowPressureSynchronousMachineDynamics;
        lowPressureSynchronousMachineDynamics = null;
        boolean oldLowPressureSynchronousMachineDynamicsESet = lowPressureSynchronousMachineDynamicsESet;
        lowPressureSynchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                    oldLowPressureSynchronousMachineDynamics, null, oldLowPressureSynchronousMachineDynamicsESet );
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
    public void unsetLowPressureSynchronousMachineDynamics() {
        if( lowPressureSynchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lowPressureSynchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                    SynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetLowPressureSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLowPressureSynchronousMachineDynamicsESet = lowPressureSynchronousMachineDynamicsESet;
            lowPressureSynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        null, null, oldLowPressureSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowPressureSynchronousMachineDynamics() {
        return lowPressureSynchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            if( highPressureSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) highPressureSynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                        SynchronousMachineDynamics.class, msgs );
            return basicSetHighPressureSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            if( lowPressureSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) lowPressureSynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            return basicSetLowPressureSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetHighPressureSynchronousMachineDynamics( msgs );
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetLowPressureSynchronousMachineDynamics( msgs );
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
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            return getHighPressureSynchronousMachineDynamics();
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            return getLowPressureSynchronousMachineDynamics();
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
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            setHighPressureSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            setLowPressureSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
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
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetHighPressureSynchronousMachineDynamics();
            return;
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetLowPressureSynchronousMachineDynamics();
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
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetHighPressureSynchronousMachineDynamics();
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetLowPressureSynchronousMachineDynamics();
        }
        return super.eIsSet( featureID );
    }

} //CrossCompoundTurbineGovernorDynamicsImpl
