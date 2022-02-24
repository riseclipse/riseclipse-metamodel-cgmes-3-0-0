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
 * A representation of the model object '<em><b>Measurement Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are defined in IEC 61970-301.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValueSource()
 * @model
 * @generated
 */
public interface MeasurementValueSource extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The MeasurementValues updated by the source.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurement Values</em>' reference list.
     * @see #isSetMeasurementValues()
     * @see #unsetMeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurementValueSource_MeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue#getMeasurementValueSource
     * @model opposite="MeasurementValueSource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='MeasurementValueSource.MeasurementValues' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< MeasurementValue > getMeasurementValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValues()
     * @see #getMeasurementValues()
     * @generated
     */
    void unsetMeasurementValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Values</em>' reference list is set.
     * @see #unsetMeasurementValues()
     * @see #getMeasurementValues()
     * @generated
     */
    boolean isSetMeasurementValues();

} // MeasurementValueSource
