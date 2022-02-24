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
 * A representation of the model object '<em><b>Series Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorRatedCurrent <em>Varistor Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorVoltageThreshold <em>Varistor Voltage Threshold</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorPresent <em>Varistor Present</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR0 <em>R0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator()
 * @model
 * @generated
 */
public interface SeriesCompensator extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_X()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.x' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #getX()
     * @generated
     */
    void setX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX <em>X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X</em>' attribute is set.
     * @see #unsetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    boolean isSetX();

    /**
     * Returns the value of the '<em><b>Varistor Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum current the varistor is designed to handle at specified duration. It is used for short circuit calculations and exchanged only if SeriesCompensator.varistorPresent is true.
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Varistor Rated Current</em>' attribute.
     * @see #isSetVaristorRatedCurrent()
     * @see #unsetVaristorRatedCurrent()
     * @see #setVaristorRatedCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_VaristorRatedCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.varistorRatedCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVaristorRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorRatedCurrent <em>Varistor Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Varistor Rated Current</em>' attribute.
     * @see #isSetVaristorRatedCurrent()
     * @see #unsetVaristorRatedCurrent()
     * @see #getVaristorRatedCurrent()
     * @generated
     */
    void setVaristorRatedCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorRatedCurrent <em>Varistor Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVaristorRatedCurrent()
     * @see #getVaristorRatedCurrent()
     * @see #setVaristorRatedCurrent(Double)
     * @generated
     */
    void unsetVaristorRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorRatedCurrent <em>Varistor Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Varistor Rated Current</em>' attribute is set.
     * @see #unsetVaristorRatedCurrent()
     * @see #getVaristorRatedCurrent()
     * @see #setVaristorRatedCurrent(Double)
     * @generated
     */
    boolean isSetVaristorRatedCurrent();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_X0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.x0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>Varistor Voltage Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The dc voltage at which the varistor starts conducting. It is used for short circuit calculations and exchanged only if SeriesCompensator.varistorPresent is true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Varistor Voltage Threshold</em>' attribute.
     * @see #isSetVaristorVoltageThreshold()
     * @see #unsetVaristorVoltageThreshold()
     * @see #setVaristorVoltageThreshold(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_VaristorVoltageThreshold()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.varistorVoltageThreshold' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVaristorVoltageThreshold();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorVoltageThreshold <em>Varistor Voltage Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Varistor Voltage Threshold</em>' attribute.
     * @see #isSetVaristorVoltageThreshold()
     * @see #unsetVaristorVoltageThreshold()
     * @see #getVaristorVoltageThreshold()
     * @generated
     */
    void setVaristorVoltageThreshold( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorVoltageThreshold <em>Varistor Voltage Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVaristorVoltageThreshold()
     * @see #getVaristorVoltageThreshold()
     * @see #setVaristorVoltageThreshold(Double)
     * @generated
     */
    void unsetVaristorVoltageThreshold();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorVoltageThreshold <em>Varistor Voltage Threshold</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Varistor Voltage Threshold</em>' attribute is set.
     * @see #unsetVaristorVoltageThreshold()
     * @see #getVaristorVoltageThreshold()
     * @see #setVaristorVoltageThreshold(Double)
     * @generated
     */
    boolean isSetVaristorVoltageThreshold();

    /**
     * Returns the value of the '<em><b>Varistor Present</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Describe if a metal oxide varistor (mov) for over voltage protection is configured in parallel with the series compensator. It is used for short circuit calculations.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Varistor Present</em>' attribute.
     * @see #isSetVaristorPresent()
     * @see #unsetVaristorPresent()
     * @see #setVaristorPresent(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_VaristorPresent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.varistorPresent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getVaristorPresent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorPresent <em>Varistor Present</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Varistor Present</em>' attribute.
     * @see #isSetVaristorPresent()
     * @see #unsetVaristorPresent()
     * @see #getVaristorPresent()
     * @generated
     */
    void setVaristorPresent( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorPresent <em>Varistor Present</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVaristorPresent()
     * @see #getVaristorPresent()
     * @see #setVaristorPresent(Boolean)
     * @generated
     */
    void unsetVaristorPresent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getVaristorPresent <em>Varistor Present</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Varistor Present</em>' attribute is set.
     * @see #unsetVaristorPresent()
     * @see #getVaristorPresent()
     * @see #setVaristorPresent(Boolean)
     * @generated
     */
    boolean isSetVaristorPresent();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeriesCompensator_R0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='SeriesCompensator.r0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    boolean isSetR0();

} // SeriesCompensator
