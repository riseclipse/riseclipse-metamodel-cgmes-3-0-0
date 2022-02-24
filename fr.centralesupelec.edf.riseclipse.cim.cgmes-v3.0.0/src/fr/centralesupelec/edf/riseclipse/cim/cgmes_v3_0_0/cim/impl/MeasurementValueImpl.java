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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementValueImpl#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementValueImpl#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementValueImpl#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValueImpl extends IOPointImpl implements MeasurementValue {
    /**
     * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar TIME_STAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar timeStamp = TIME_STAMP_EDEFAULT;

    /**
     * This is true if the Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeStampESet;

    /**
     * The cached value of the '{@link #getMeasurementValueQuality() <em>Measurement Value Quality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValueQuality()
     * @generated
     * @ordered
     */
    protected MeasurementValueQuality measurementValueQuality;

    /**
     * This is true if the Measurement Value Quality reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueQualityESet;

    /**
     * The cached value of the '{@link #getMeasurementValueSource() <em>Measurement Value Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValueSource()
     * @generated
     * @ordered
     */
    protected MeasurementValueSource measurementValueSource;

    /**
     * This is true if the Measurement Value Source reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueSourceESet;

    /**
     * The default value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorAccuracy()
     * @generated
     * @ordered
     */
    protected static final Double SENSOR_ACCURACY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorAccuracy()
     * @generated
     * @ordered
     */
    protected Double sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;

    /**
     * This is true if the Sensor Accuracy attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sensorAccuracyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeasurementValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeStamp( XMLGregorianCalendar newTimeStamp ) {
        XMLGregorianCalendar oldTimeStamp = timeStamp;
        timeStamp = newTimeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStampESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT_VALUE__TIME_STAMP,
                    oldTimeStamp, timeStamp, !oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeStamp() {
        XMLGregorianCalendar oldTimeStamp = timeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStamp = TIME_STAMP_EDEFAULT;
        timeStampESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT_VALUE__TIME_STAMP,
                    oldTimeStamp, TIME_STAMP_EDEFAULT, oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeStamp() {
        return timeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueQuality getMeasurementValueQuality() {
        if( measurementValueQuality != null && measurementValueQuality.eIsProxy() ) {
            InternalEObject oldMeasurementValueQuality = ( InternalEObject ) measurementValueQuality;
            measurementValueQuality = ( MeasurementValueQuality ) eResolveProxy( oldMeasurementValueQuality );
            if( measurementValueQuality != oldMeasurementValueQuality ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality,
                            measurementValueQuality ) );
            }
        }
        return measurementValueQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementValueQuality basicGetMeasurementValueQuality() {
        return measurementValueQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValueQuality( MeasurementValueQuality newMeasurementValueQuality,
            NotificationChain msgs ) {
        MeasurementValueQuality oldMeasurementValueQuality = measurementValueQuality;
        measurementValueQuality = newMeasurementValueQuality;
        boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
        measurementValueQualityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality,
                    newMeasurementValueQuality, !oldMeasurementValueQualityESet );
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
    public void setMeasurementValueQuality( MeasurementValueQuality newMeasurementValueQuality ) {
        if( newMeasurementValueQuality != measurementValueQuality ) {
            NotificationChain msgs = null;
            if( measurementValueQuality != null )
                msgs = ( ( InternalEObject ) measurementValueQuality ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            if( newMeasurementValueQuality != null )
                msgs = ( ( InternalEObject ) newMeasurementValueQuality ).eInverseAdd( this,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            msgs = basicSetMeasurementValueQuality( newMeasurementValueQuality, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
            measurementValueQualityESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, newMeasurementValueQuality,
                        newMeasurementValueQuality, !oldMeasurementValueQualityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValueQuality( NotificationChain msgs ) {
        MeasurementValueQuality oldMeasurementValueQuality = measurementValueQuality;
        measurementValueQuality = null;
        boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
        measurementValueQualityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality, null,
                    oldMeasurementValueQualityESet );
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
    public void unsetMeasurementValueQuality() {
        if( measurementValueQuality != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValueQuality ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            msgs = basicUnsetMeasurementValueQuality( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
            measurementValueQualityESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, null, null,
                        oldMeasurementValueQualityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValueQuality() {
        return measurementValueQualityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueSource getMeasurementValueSource() {
        return measurementValueSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValueSource( MeasurementValueSource newMeasurementValueSource,
            NotificationChain msgs ) {
        MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
        measurementValueSource = newMeasurementValueSource;
        boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
        measurementValueSourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource,
                    newMeasurementValueSource, !oldMeasurementValueSourceESet );
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
    public void setMeasurementValueSource( MeasurementValueSource newMeasurementValueSource ) {
        if( newMeasurementValueSource != measurementValueSource ) {
            NotificationChain msgs = null;
            if( measurementValueSource != null )
                msgs = ( ( InternalEObject ) measurementValueSource ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            if( newMeasurementValueSource != null )
                msgs = ( ( InternalEObject ) newMeasurementValueSource ).eInverseAdd( this,
                        CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            msgs = basicSetMeasurementValueSource( newMeasurementValueSource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
            measurementValueSourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, newMeasurementValueSource,
                        newMeasurementValueSource, !oldMeasurementValueSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValueSource( NotificationChain msgs ) {
        MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
        measurementValueSource = null;
        boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
        measurementValueSourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource, null,
                    oldMeasurementValueSourceESet );
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
    public void unsetMeasurementValueSource() {
        if( measurementValueSource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValueSource ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            msgs = basicUnsetMeasurementValueSource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
            measurementValueSourceESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, null, null,
                        oldMeasurementValueSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValueSource() {
        return measurementValueSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSensorAccuracy() {
        return sensorAccuracy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSensorAccuracy( Double newSensorAccuracy ) {
        Double oldSensorAccuracy = sensorAccuracy;
        sensorAccuracy = newSensorAccuracy;
        boolean oldSensorAccuracyESet = sensorAccuracyESet;
        sensorAccuracyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY,
                    oldSensorAccuracy, sensorAccuracy, !oldSensorAccuracyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSensorAccuracy() {
        Double oldSensorAccuracy = sensorAccuracy;
        boolean oldSensorAccuracyESet = sensorAccuracyESet;
        sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;
        sensorAccuracyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY,
                    oldSensorAccuracy, SENSOR_ACCURACY_EDEFAULT, oldSensorAccuracyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSensorAccuracy() {
        return sensorAccuracyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            if( measurementValueQuality != null )
                msgs = ( ( InternalEObject ) measurementValueQuality ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            return basicSetMeasurementValueQuality( ( MeasurementValueQuality ) otherEnd, msgs );
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            if( measurementValueSource != null )
                msgs = ( ( InternalEObject ) measurementValueSource ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            return basicSetMeasurementValueSource( ( MeasurementValueSource ) otherEnd, msgs );
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
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            return basicUnsetMeasurementValueQuality( msgs );
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            return basicUnsetMeasurementValueSource( msgs );
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
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            return getTimeStamp();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            if( resolve ) return getMeasurementValueQuality();
            return basicGetMeasurementValueQuality();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            return getMeasurementValueSource();
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            return getSensorAccuracy();
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
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            setTimeStamp( ( XMLGregorianCalendar ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            setMeasurementValueQuality( ( MeasurementValueQuality ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            setMeasurementValueSource( ( MeasurementValueSource ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            setSensorAccuracy( ( Double ) newValue );
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
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            unsetTimeStamp();
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            unsetMeasurementValueQuality();
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            unsetMeasurementValueSource();
            return;
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            unsetSensorAccuracy();
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
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            return isSetTimeStamp();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            return isSetMeasurementValueQuality();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            return isSetMeasurementValueSource();
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            return isSetSensorAccuracy();
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
        result.append( " (timeStamp: " );
        if( timeStampESet )
            result.append( timeStamp );
        else
            result.append( "<unset>" );
        result.append( ", sensorAccuracy: " );
        if( sensorAccuracyESet )
            result.append( sensorAccuracy );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MeasurementValueImpl
