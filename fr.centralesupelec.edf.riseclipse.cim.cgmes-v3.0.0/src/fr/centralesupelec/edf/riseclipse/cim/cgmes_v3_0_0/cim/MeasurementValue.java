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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValue()
 * @model
 * @generated
 */
public interface MeasurementValue extends IOPoint {
    /**
     * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The time when the value was last updated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #setTimeStamp(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValue_TimeStamp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DateTime" transient="true" ordered="false"
     *        extendedMetaData="name='MeasurementValue.timeStamp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    XMLGregorianCalendar getTimeStamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @generated
     */
    void setTimeStamp( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(XMLGregorianCalendar)
     * @generated
     */
    void unsetTimeStamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetTimeStamp();

    /**
     * Returns the value of the '<em><b>Measurement Value Quality</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A MeasurementValue has a MeasurementValueQuality associated with it.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurement Value Quality</em>' reference.
     * @see #isSetMeasurementValueQuality()
     * @see #unsetMeasurementValueQuality()
     * @see #setMeasurementValueQuality(MeasurementValueQuality)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValue_MeasurementValueQuality()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality#getMeasurementValue
     * @model opposite="MeasurementValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='MeasurementValue.MeasurementValueQuality' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    MeasurementValueQuality getMeasurementValueQuality();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value Quality</em>' reference.
     * @see #isSetMeasurementValueQuality()
     * @see #unsetMeasurementValueQuality()
     * @see #getMeasurementValueQuality()
     * @generated
     */
    void setMeasurementValueQuality( MeasurementValueQuality value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValueQuality()
     * @see #getMeasurementValueQuality()
     * @see #setMeasurementValueQuality(MeasurementValueQuality)
     * @generated
     */
    void unsetMeasurementValueQuality();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value Quality</em>' reference is set.
     * @see #unsetMeasurementValueQuality()
     * @see #getMeasurementValueQuality()
     * @see #setMeasurementValueQuality(MeasurementValueQuality)
     * @generated
     */
    boolean isSetMeasurementValueQuality();

    /**
     * Returns the value of the '<em><b>Measurement Value Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurement Value Source</em>' reference.
     * @see #isSetMeasurementValueSource()
     * @see #unsetMeasurementValueSource()
     * @see #setMeasurementValueSource(MeasurementValueSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValue_MeasurementValueSource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource#getMeasurementValues
     * @model opposite="MeasurementValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='MeasurementValue.MeasurementValueSource' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    MeasurementValueSource getMeasurementValueSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value Source</em>' reference.
     * @see #isSetMeasurementValueSource()
     * @see #unsetMeasurementValueSource()
     * @see #getMeasurementValueSource()
     * @generated
     */
    void setMeasurementValueSource( MeasurementValueSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValueSource()
     * @see #getMeasurementValueSource()
     * @see #setMeasurementValueSource(MeasurementValueSource)
     * @generated
     */
    void unsetMeasurementValueSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value Source</em>' reference is set.
     * @see #unsetMeasurementValueSource()
     * @see #getMeasurementValueSource()
     * @see #setMeasurementValueSource(MeasurementValueSource)
     * @generated
     */
    boolean isSetMeasurementValueSource();

    /**
     * Returns the value of the '<em><b>Sensor Accuracy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The limit, expressed as a percentage of the sensor maximum, that errors will not exceed when the sensor is used under  reference conditions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sensor Accuracy</em>' attribute.
     * @see #isSetSensorAccuracy()
     * @see #unsetSensorAccuracy()
     * @see #setSensorAccuracy(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValue_SensorAccuracy()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='MeasurementValue.sensorAccuracy' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSensorAccuracy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sensor Accuracy</em>' attribute.
     * @see #isSetSensorAccuracy()
     * @see #unsetSensorAccuracy()
     * @see #getSensorAccuracy()
     * @generated
     */
    void setSensorAccuracy( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSensorAccuracy()
     * @see #getSensorAccuracy()
     * @see #setSensorAccuracy(Double)
     * @generated
     */
    void unsetSensorAccuracy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sensor Accuracy</em>' attribute is set.
     * @see #unsetSensorAccuracy()
     * @see #getSensorAccuracy()
     * @see #setSensorAccuracy(Double)
     * @generated
     */
    boolean isSetSensorAccuracy();

} // MeasurementValue
