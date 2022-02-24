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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StringMeasurementValueImpl#getStringMeasurement <em>String Measurement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringMeasurementValueImpl extends MeasurementValueImpl implements StringMeasurementValue {
    /**
     * The cached value of the '{@link #getStringMeasurement() <em>String Measurement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringMeasurement()
     * @generated
     * @ordered
     */
    protected StringMeasurement stringMeasurement;

    /**
     * This is true if the String Measurement reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stringMeasurementESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringMeasurementValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStringMeasurementValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringMeasurement getStringMeasurement() {
        return stringMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStringMeasurement( StringMeasurement newStringMeasurement,
            NotificationChain msgs ) {
        StringMeasurement oldStringMeasurement = stringMeasurement;
        stringMeasurement = newStringMeasurement;
        boolean oldStringMeasurementESet = stringMeasurementESet;
        stringMeasurementESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, oldStringMeasurement, newStringMeasurement,
                    !oldStringMeasurementESet );
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
    public void setStringMeasurement( StringMeasurement newStringMeasurement ) {
        if( newStringMeasurement != stringMeasurement ) {
            NotificationChain msgs = null;
            if( stringMeasurement != null )
                msgs = ( ( InternalEObject ) stringMeasurement ).eInverseRemove( this,
                        CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs );
            if( newStringMeasurement != null )
                msgs = ( ( InternalEObject ) newStringMeasurement ).eInverseAdd( this,
                        CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs );
            msgs = basicSetStringMeasurement( newStringMeasurement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStringMeasurementESet = stringMeasurementESet;
            stringMeasurementESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, newStringMeasurement,
                        newStringMeasurement, !oldStringMeasurementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStringMeasurement( NotificationChain msgs ) {
        StringMeasurement oldStringMeasurement = stringMeasurement;
        stringMeasurement = null;
        boolean oldStringMeasurementESet = stringMeasurementESet;
        stringMeasurementESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, oldStringMeasurement, null,
                    oldStringMeasurementESet );
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
    public void unsetStringMeasurement() {
        if( stringMeasurement != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) stringMeasurement ).eInverseRemove( this,
                    CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs );
            msgs = basicUnsetStringMeasurement( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStringMeasurementESet = stringMeasurementESet;
            stringMeasurementESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, null, null,
                        oldStringMeasurementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStringMeasurement() {
        return stringMeasurementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
            if( stringMeasurement != null )
                msgs = ( ( InternalEObject ) stringMeasurement ).eInverseRemove( this,
                        CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs );
            return basicSetStringMeasurement( ( StringMeasurement ) otherEnd, msgs );
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
        case CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
            return basicUnsetStringMeasurement( msgs );
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
        case CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
            return getStringMeasurement();
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
        case CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
            setStringMeasurement( ( StringMeasurement ) newValue );
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
        case CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
            unsetStringMeasurement();
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
        case CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
            return isSetStringMeasurement();
        }
        return super.eIsSet( featureID );
    }

} //StringMeasurementValueImpl
