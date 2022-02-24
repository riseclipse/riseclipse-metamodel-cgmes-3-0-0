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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Value Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementValueQualityImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValueQualityImpl extends Quality61850Impl implements MeasurementValueQuality {
    /**
     * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValue()
     * @generated
     * @ordered
     */
    protected MeasurementValue measurementValue;

    /**
     * This is true if the Measurement Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementValueQualityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeasurementValueQuality();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValue getMeasurementValue() {
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValue( MeasurementValue newMeasurementValue, NotificationChain msgs ) {
        MeasurementValue oldMeasurementValue = measurementValue;
        measurementValue = newMeasurementValue;
        boolean oldMeasurementValueESet = measurementValueESet;
        measurementValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, oldMeasurementValue, newMeasurementValue,
                    !oldMeasurementValueESet );
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
    public void setMeasurementValue( MeasurementValue newMeasurementValue ) {
        if( newMeasurementValue != measurementValue ) {
            NotificationChain msgs = null;
            if( measurementValue != null )
                msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs );
            if( newMeasurementValue != null )
                msgs = ( ( InternalEObject ) newMeasurementValue ).eInverseAdd( this,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs );
            msgs = basicSetMeasurementValue( newMeasurementValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueESet = measurementValueESet;
            measurementValueESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, newMeasurementValue,
                        newMeasurementValue, !oldMeasurementValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValue( NotificationChain msgs ) {
        MeasurementValue oldMeasurementValue = measurementValue;
        measurementValue = null;
        boolean oldMeasurementValueESet = measurementValueESet;
        measurementValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, oldMeasurementValue, null,
                    oldMeasurementValueESet );
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
    public void unsetMeasurementValue() {
        if( measurementValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs );
            msgs = basicUnsetMeasurementValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueESet = measurementValueESet;
            measurementValueESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, null, null,
                        oldMeasurementValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValue() {
        return measurementValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
            if( measurementValue != null )
                msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs );
            return basicSetMeasurementValue( ( MeasurementValue ) otherEnd, msgs );
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
        case CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
            return basicUnsetMeasurementValue( msgs );
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
        case CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
            return getMeasurementValue();
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
        case CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
            setMeasurementValue( ( MeasurementValue ) newValue );
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
        case CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
            unsetMeasurementValue();
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
        case CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
            return isSetMeasurementValue();
        }
        return super.eIsSet( featureID );
    }

} //MeasurementValueQualityImpl
