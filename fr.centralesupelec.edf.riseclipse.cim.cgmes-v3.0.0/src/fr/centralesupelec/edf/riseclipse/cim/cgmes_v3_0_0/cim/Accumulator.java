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
 * A representation of the model object '<em><b>Accumulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Accumulator represents an accumulated (counted) Measurement, e.g. an energy value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulator()
 * @model
 * @generated
 */
public interface Accumulator extends Measurement {
    /**
     * Returns the value of the '<em><b>Accumulator Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The values connected to this measurement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Accumulator Values</em>' reference list.
     * @see #isSetAccumulatorValues()
     * @see #unsetAccumulatorValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulator_AccumulatorValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulator
     * @model opposite="Accumulator" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Accumulator.AccumulatorValues' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< AccumulatorValue > getAccumulatorValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulatorValues()
     * @see #getAccumulatorValues()
     * @generated
     */
    void unsetAccumulatorValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator Values</em>' reference list is set.
     * @see #unsetAccumulatorValues()
     * @see #getAccumulatorValues()
     * @generated
     */
    boolean isSetAccumulatorValues();

    /**
     * Returns the value of the '<em><b>Limit Sets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A measurement may have zero or more limit ranges defined for it.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Limit Sets</em>' reference list.
     * @see #isSetLimitSets()
     * @see #unsetLimitSets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulator_LimitSets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet#getMeasurements
     * @model opposite="Measurements" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Accumulator.LimitSets' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< AccumulatorLimitSet > getLimitSets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getLimitSets <em>Limit Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimitSets()
     * @see #getLimitSets()
     * @generated
     */
    void unsetLimitSets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getLimitSets <em>Limit Sets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit Sets</em>' reference list is set.
     * @see #unsetLimitSets()
     * @see #getLimitSets()
     * @generated
     */
    boolean isSetLimitSets();

} // Accumulator
