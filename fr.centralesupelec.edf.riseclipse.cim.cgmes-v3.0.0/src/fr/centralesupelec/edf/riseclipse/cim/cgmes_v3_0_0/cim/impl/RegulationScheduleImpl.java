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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulationScheduleImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulationScheduleImpl extends SeasonDayTypeScheduleImpl implements RegulationSchedule {
    /**
     * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulatingControl()
     * @generated
     * @ordered
     */
    protected RegulatingControl regulatingControl;

    /**
     * This is true if the Regulating Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regulatingControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegulationScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRegulationSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingControl getRegulatingControl() {
        return regulatingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegulatingControl( RegulatingControl newRegulatingControl,
            NotificationChain msgs ) {
        RegulatingControl oldRegulatingControl = regulatingControl;
        regulatingControl = newRegulatingControl;
        boolean oldRegulatingControlESet = regulatingControlESet;
        regulatingControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl,
                    !oldRegulatingControlESet );
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
    public void setRegulatingControl( RegulatingControl newRegulatingControl ) {
        if( newRegulatingControl != regulatingControl ) {
            NotificationChain msgs = null;
            if( regulatingControl != null )
                msgs = ( ( InternalEObject ) regulatingControl ).eInverseRemove( this,
                        CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs );
            if( newRegulatingControl != null )
                msgs = ( ( InternalEObject ) newRegulatingControl ).eInverseAdd( this,
                        CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs );
            msgs = basicSetRegulatingControl( newRegulatingControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegulatingControlESet = regulatingControlESet;
            regulatingControlESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, newRegulatingControl, newRegulatingControl,
                        !oldRegulatingControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRegulatingControl( NotificationChain msgs ) {
        RegulatingControl oldRegulatingControl = regulatingControl;
        regulatingControl = null;
        boolean oldRegulatingControlESet = regulatingControlESet;
        regulatingControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, oldRegulatingControl, null,
                    oldRegulatingControlESet );
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
    public void unsetRegulatingControl() {
        if( regulatingControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) regulatingControl ).eInverseRemove( this,
                    CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs );
            msgs = basicUnsetRegulatingControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegulatingControlESet = regulatingControlESet;
            regulatingControlESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, null, null, oldRegulatingControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulatingControl() {
        return regulatingControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
            if( regulatingControl != null )
                msgs = ( ( InternalEObject ) regulatingControl ).eInverseRemove( this,
                        CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs );
            return basicSetRegulatingControl( ( RegulatingControl ) otherEnd, msgs );
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
        case CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
            return basicUnsetRegulatingControl( msgs );
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
        case CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
            return getRegulatingControl();
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
        case CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
            setRegulatingControl( ( RegulatingControl ) newValue );
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
        case CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
            unsetRegulatingControl();
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
        case CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
            return isSetRegulatingControl();
        }
        return super.eIsSet( featureID );
    }

} //RegulationScheduleImpl
