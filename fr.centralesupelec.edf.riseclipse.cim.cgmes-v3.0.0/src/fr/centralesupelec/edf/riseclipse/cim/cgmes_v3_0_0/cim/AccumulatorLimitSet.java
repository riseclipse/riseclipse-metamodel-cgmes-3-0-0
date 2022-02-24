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
 * A representation of the model object '<em><b>Accumulator Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AccumulatorLimitSet specifies a set of Limits that are associated with an Accumulator measurement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getLimits <em>Limits</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulatorLimitSet()
 * @model
 * @generated
 */
public interface AccumulatorLimitSet extends LimitSet {
    /**
     * Returns the value of the '<em><b>Limits</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimit#getLimitSet <em>Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The limit values used for supervision of Measurements.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Limits</em>' reference list.
     * @see #isSetLimits()
     * @see #unsetLimits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulatorLimitSet_Limits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimit#getLimitSet
     * @model opposite="LimitSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AccumulatorLimitSet.Limits' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< AccumulatorLimit > getLimits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getLimits <em>Limits</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimits()
     * @see #getLimits()
     * @generated
     */
    void unsetLimits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getLimits <em>Limits</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limits</em>' reference list is set.
     * @see #unsetLimits()
     * @see #getLimits()
     * @generated
     */
    boolean isSetLimits();

    /**
     * Returns the value of the '<em><b>Measurements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getLimitSets <em>Limit Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Measurements using the LimitSet.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurements</em>' reference list.
     * @see #isSetMeasurements()
     * @see #unsetMeasurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulatorLimitSet_Measurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getLimitSets
     * @model opposite="LimitSets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='AccumulatorLimitSet.Measurements' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Accumulator > getMeasurements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    void unsetMeasurements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurements</em>' reference list is set.
     * @see #unsetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    boolean isSetMeasurements();

} // AccumulatorLimitSet
