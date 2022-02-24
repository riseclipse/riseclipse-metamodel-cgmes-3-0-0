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
 * A representation of the model object '<em><b>Measurement Value Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurement quality flags. Bits 0-10 are defined for substation automation in IEC 61850-7-3. Bits 11-15 are reserved for future expansion by that document. Bits 16-31 are reserved for EMS applications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValueQuality()
 * @model
 * @generated
 */
public interface MeasurementValueQuality extends Quality61850 {
    /**
     * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A MeasurementValue has a MeasurementValueQuality associated with it.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurement Value</em>' reference.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValueQuality_MeasurementValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueQuality
     * @model opposite="MeasurementValueQuality" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='MeasurementValueQuality.MeasurementValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    MeasurementValue getMeasurementValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value</em>' reference.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @generated
     */
    void setMeasurementValue( MeasurementValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    void unsetMeasurementValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value</em>' reference is set.
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    boolean isSetMeasurementValue();

} // MeasurementValueQuality
