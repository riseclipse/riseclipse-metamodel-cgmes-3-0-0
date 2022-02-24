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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanical Load Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MechanicalLoadDynamicsImpl#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MechanicalLoadDynamicsImpl#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MechanicalLoadDynamicsImpl extends DynamicsFunctionBlockImpl implements MechanicalLoadDynamics {
    /**
     * The cached value of the '{@link #getSynchronousMachineDynamics() <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics synchronousMachineDynamics;

    /**
     * This is true if the Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineDynamicsESet;

    /**
     * The cached value of the '{@link #getAsynchronousMachineDynamics() <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineDynamics asynchronousMachineDynamics;

    /**
     * This is true if the Asynchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MechanicalLoadDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMechanicalLoadDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachineDynamics(
            SynchronousMachineDynamics newSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = newSynchronousMachineDynamics;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet );
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
    public void setSynchronousMachineDynamics( SynchronousMachineDynamics newSynchronousMachineDynamics ) {
        if( newSynchronousMachineDynamics != synchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            if( newSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            msgs = basicSetSynchronousMachineDynamics( newSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        newSynchronousMachineDynamics, newSynchronousMachineDynamics,
                        !oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = null;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    null, oldSynchronousMachineDynamicsESet );
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
    public void unsetSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, SynchronousMachineDynamics.class,
                    msgs );
            msgs = basicUnsetSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                        oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineDynamics() {
        return synchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsynchronousMachineDynamics(
            AsynchronousMachineDynamics newAsynchronousMachineDynamics, NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = newAsynchronousMachineDynamics;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet );
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
    public void setAsynchronousMachineDynamics( AsynchronousMachineDynamics newAsynchronousMachineDynamics ) {
        if( newAsynchronousMachineDynamics != asynchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            if( newAsynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            msgs = basicSetAsynchronousMachineDynamics( newAsynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS,
                        newAsynchronousMachineDynamics, newAsynchronousMachineDynamics,
                        !oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsynchronousMachineDynamics( NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = null;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    null, oldAsynchronousMachineDynamicsESet );
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
    public void unsetAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                    AsynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetAsynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                        oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                        SynchronousMachineDynamics.class, msgs );
            return basicSetSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                        AsynchronousMachineDynamics.class, msgs );
            return basicSetAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetSynchronousMachineDynamics( msgs );
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetAsynchronousMachineDynamics( msgs );
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
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return getSynchronousMachineDynamics();
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return getAsynchronousMachineDynamics();
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
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            setSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            setAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) newValue );
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
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetSynchronousMachineDynamics();
            return;
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            unsetAsynchronousMachineDynamics();
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
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetSynchronousMachineDynamics();
        case CimPackage.MECHANICAL_LOAD_DYNAMICS__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetAsynchronousMachineDynamics();
        }
        return super.eIsSet( featureID );
    }

} //MechanicalLoadDynamicsImpl
