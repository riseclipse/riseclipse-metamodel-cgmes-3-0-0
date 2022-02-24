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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StringMeasurement represents a measurement with values of type string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStringMeasurement()
 * @model
 * @generated
 */
public interface StringMeasurement extends Measurement {
    /**
     * Returns the value of the '<em><b>String Measurement Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The values connected to this measurement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>String Measurement Values</em>' reference list.
     * @see #isSetStringMeasurementValues()
     * @see #unsetStringMeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStringMeasurement_StringMeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue#getStringMeasurement
     * @model opposite="StringMeasurement" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='StringMeasurement.StringMeasurementValues' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< StringMeasurementValue > getStringMeasurementValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStringMeasurementValues()
     * @see #getStringMeasurementValues()
     * @generated
     */
    void unsetStringMeasurementValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>String Measurement Values</em>' reference list is set.
     * @see #unsetStringMeasurementValues()
     * @see #getStringMeasurementValues()
     * @generated
     */
    boolean isSetStringMeasurementValues();

} // StringMeasurement
