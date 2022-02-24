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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BayImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BayImpl extends EquipmentContainerImpl implements Bay {
    /**
     * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevel()
     * @generated
     * @ordered
     */
    protected VoltageLevel voltageLevel;

    /**
     * This is true if the Voltage Level reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageLevelESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageLevel( VoltageLevel newVoltageLevel, NotificationChain msgs ) {
        VoltageLevel oldVoltageLevel = voltageLevel;
        voltageLevel = newVoltageLevel;
        boolean oldVoltageLevelESet = voltageLevelESet;
        voltageLevelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BAY__VOLTAGE_LEVEL, oldVoltageLevel, newVoltageLevel, !oldVoltageLevelESet );
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
    public void setVoltageLevel( VoltageLevel newVoltageLevel ) {
        if( newVoltageLevel != voltageLevel ) {
            NotificationChain msgs = null;
            if( voltageLevel != null )
                msgs = ( ( InternalEObject ) voltageLevel ).eInverseRemove( this, CimPackage.VOLTAGE_LEVEL__BAYS,
                        VoltageLevel.class, msgs );
            if( newVoltageLevel != null )
                msgs = ( ( InternalEObject ) newVoltageLevel ).eInverseAdd( this, CimPackage.VOLTAGE_LEVEL__BAYS,
                        VoltageLevel.class, msgs );
            msgs = basicSetVoltageLevel( newVoltageLevel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageLevelESet = voltageLevelESet;
            voltageLevelESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BAY__VOLTAGE_LEVEL, newVoltageLevel,
                        newVoltageLevel, !oldVoltageLevelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageLevel( NotificationChain msgs ) {
        VoltageLevel oldVoltageLevel = voltageLevel;
        voltageLevel = null;
        boolean oldVoltageLevelESet = voltageLevelESet;
        voltageLevelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BAY__VOLTAGE_LEVEL, oldVoltageLevel, null, oldVoltageLevelESet );
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
    public void unsetVoltageLevel() {
        if( voltageLevel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltageLevel ).eInverseRemove( this, CimPackage.VOLTAGE_LEVEL__BAYS,
                    VoltageLevel.class, msgs );
            msgs = basicUnsetVoltageLevel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageLevelESet = voltageLevelESet;
            voltageLevelESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BAY__VOLTAGE_LEVEL, null, null,
                        oldVoltageLevelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageLevel() {
        return voltageLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.BAY__VOLTAGE_LEVEL:
            if( voltageLevel != null )
                msgs = ( ( InternalEObject ) voltageLevel ).eInverseRemove( this, CimPackage.VOLTAGE_LEVEL__BAYS,
                        VoltageLevel.class, msgs );
            return basicSetVoltageLevel( ( VoltageLevel ) otherEnd, msgs );
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
        case CimPackage.BAY__VOLTAGE_LEVEL:
            return basicUnsetVoltageLevel( msgs );
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
        case CimPackage.BAY__VOLTAGE_LEVEL:
            return getVoltageLevel();
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
        case CimPackage.BAY__VOLTAGE_LEVEL:
            setVoltageLevel( ( VoltageLevel ) newValue );
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
        case CimPackage.BAY__VOLTAGE_LEVEL:
            unsetVoltageLevel();
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
        case CimPackage.BAY__VOLTAGE_LEVEL:
            return isSetVoltageLevel();
        }
        return super.eIsSet( featureID );
    }

} //BayImpl
