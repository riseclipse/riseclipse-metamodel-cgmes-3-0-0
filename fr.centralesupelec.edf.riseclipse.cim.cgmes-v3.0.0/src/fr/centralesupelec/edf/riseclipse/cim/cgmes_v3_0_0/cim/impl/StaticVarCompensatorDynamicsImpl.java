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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Var Compensator Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorDynamicsImpl#getStaticVarCompensator <em>Static Var Compensator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticVarCompensatorDynamicsImpl extends DynamicsFunctionBlockImpl
        implements StaticVarCompensatorDynamics {
    /**
     * The cached value of the '{@link #getStaticVarCompensator() <em>Static Var Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaticVarCompensator()
     * @generated
     * @ordered
     */
    protected StaticVarCompensator staticVarCompensator;

    /**
     * This is true if the Static Var Compensator reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean staticVarCompensatorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StaticVarCompensatorDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStaticVarCompensatorDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticVarCompensator getStaticVarCompensator() {
        return staticVarCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStaticVarCompensator( StaticVarCompensator newStaticVarCompensator,
            NotificationChain msgs ) {
        StaticVarCompensator oldStaticVarCompensator = staticVarCompensator;
        staticVarCompensator = newStaticVarCompensator;
        boolean oldStaticVarCompensatorESet = staticVarCompensatorESet;
        staticVarCompensatorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR, oldStaticVarCompensator,
                    newStaticVarCompensator, !oldStaticVarCompensatorESet );
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
    public void setStaticVarCompensator( StaticVarCompensator newStaticVarCompensator ) {
        if( newStaticVarCompensator != staticVarCompensator ) {
            NotificationChain msgs = null;
            if( staticVarCompensator != null )
                msgs = ( ( InternalEObject ) staticVarCompensator ).eInverseRemove( this,
                        CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, StaticVarCompensator.class,
                        msgs );
            if( newStaticVarCompensator != null )
                msgs = ( ( InternalEObject ) newStaticVarCompensator ).eInverseAdd( this,
                        CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, StaticVarCompensator.class,
                        msgs );
            msgs = basicSetStaticVarCompensator( newStaticVarCompensator, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStaticVarCompensatorESet = staticVarCompensatorESet;
            staticVarCompensatorESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR, newStaticVarCompensator,
                        newStaticVarCompensator, !oldStaticVarCompensatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStaticVarCompensator( NotificationChain msgs ) {
        StaticVarCompensator oldStaticVarCompensator = staticVarCompensator;
        staticVarCompensator = null;
        boolean oldStaticVarCompensatorESet = staticVarCompensatorESet;
        staticVarCompensatorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR, oldStaticVarCompensator, null,
                    oldStaticVarCompensatorESet );
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
    public void unsetStaticVarCompensator() {
        if( staticVarCompensator != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) staticVarCompensator ).eInverseRemove( this,
                    CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, StaticVarCompensator.class,
                    msgs );
            msgs = basicUnsetStaticVarCompensator( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStaticVarCompensatorESet = staticVarCompensatorESet;
            staticVarCompensatorESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR, null, null,
                        oldStaticVarCompensatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStaticVarCompensator() {
        return staticVarCompensatorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR:
            if( staticVarCompensator != null )
                msgs = ( ( InternalEObject ) staticVarCompensator ).eInverseRemove( this,
                        CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, StaticVarCompensator.class,
                        msgs );
            return basicSetStaticVarCompensator( ( StaticVarCompensator ) otherEnd, msgs );
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
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR:
            return basicUnsetStaticVarCompensator( msgs );
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
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR:
            return getStaticVarCompensator();
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
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR:
            setStaticVarCompensator( ( StaticVarCompensator ) newValue );
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
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR:
            unsetStaticVarCompensator();
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
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR:
            return isSetStaticVarCompensator();
        }
        return super.eIsSet( featureID );
    }

} //StaticVarCompensatorDynamicsImpl
