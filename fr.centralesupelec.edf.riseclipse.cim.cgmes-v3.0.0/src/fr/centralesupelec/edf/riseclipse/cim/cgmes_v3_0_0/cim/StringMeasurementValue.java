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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StringMeasurementValue represents a measurement value of type string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStringMeasurementValue()
 * @model
 * @generated
 */
public interface StringMeasurementValue extends MeasurementValue {
    /**
     * Returns the value of the '<em><b>String Measurement</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement to which this value is connected.
     * <!-- end-model-doc -->
     * @return the value of the '<em>String Measurement</em>' reference.
     * @see #isSetStringMeasurement()
     * @see #unsetStringMeasurement()
     * @see #setStringMeasurement(StringMeasurement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStringMeasurementValue_StringMeasurement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement#getStringMeasurementValues
     * @model opposite="StringMeasurementValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='StringMeasurementValue.StringMeasurement' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    StringMeasurement getStringMeasurement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>String Measurement</em>' reference.
     * @see #isSetStringMeasurement()
     * @see #unsetStringMeasurement()
     * @see #getStringMeasurement()
     * @generated
     */
    void setStringMeasurement( StringMeasurement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStringMeasurement()
     * @see #getStringMeasurement()
     * @see #setStringMeasurement(StringMeasurement)
     * @generated
     */
    void unsetStringMeasurement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>String Measurement</em>' reference is set.
     * @see #unsetStringMeasurement()
     * @see #getStringMeasurement()
     * @see #setStringMeasurement(StringMeasurement)
     * @generated
     */
    boolean isSetStringMeasurement();

} // StringMeasurementValue
