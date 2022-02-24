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
 * A representation of the model object '<em><b>Accumulator Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AccumulatorValue represents an accumulated (counted) MeasurementValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulatorValue()
 * @model
 * @generated
 */
public interface AccumulatorValue extends MeasurementValue {
    /**
     * Returns the value of the '<em><b>Accumulator Reset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The command that resets the accumulator value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Accumulator Reset</em>' reference.
     * @see #isSetAccumulatorReset()
     * @see #unsetAccumulatorReset()
     * @see #setAccumulatorReset(AccumulatorReset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulatorValue_AccumulatorReset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorReset#getAccumulatorValue
     * @model opposite="AccumulatorValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AccumulatorValue.AccumulatorReset' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AccumulatorReset getAccumulatorReset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator Reset</em>' reference.
     * @see #isSetAccumulatorReset()
     * @see #unsetAccumulatorReset()
     * @see #getAccumulatorReset()
     * @generated
     */
    void setAccumulatorReset( AccumulatorReset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulatorReset()
     * @see #getAccumulatorReset()
     * @see #setAccumulatorReset(AccumulatorReset)
     * @generated
     */
    void unsetAccumulatorReset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator Reset</em>' reference is set.
     * @see #unsetAccumulatorReset()
     * @see #getAccumulatorReset()
     * @see #setAccumulatorReset(AccumulatorReset)
     * @generated
     */
    boolean isSetAccumulatorReset();

    /**
     * Returns the value of the '<em><b>Accumulator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement to which this value is connected.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Accumulator</em>' reference.
     * @see #isSetAccumulator()
     * @see #unsetAccumulator()
     * @see #setAccumulator(Accumulator)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAccumulatorValue_Accumulator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator#getAccumulatorValues
     * @model opposite="AccumulatorValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='AccumulatorValue.Accumulator' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Accumulator getAccumulator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator</em>' reference.
     * @see #isSetAccumulator()
     * @see #unsetAccumulator()
     * @see #getAccumulator()
     * @generated
     */
    void setAccumulator( Accumulator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulator()
     * @see #getAccumulator()
     * @see #setAccumulator(Accumulator)
     * @generated
     */
    void unsetAccumulator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator</em>' reference is set.
     * @see #unsetAccumulator()
     * @see #getAccumulator()
     * @see #setAccumulator(Accumulator)
     * @generated
     */
    boolean isSetAccumulator();

} // AccumulatorValue
