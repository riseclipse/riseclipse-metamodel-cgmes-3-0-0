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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor. A negative value for bPerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNomU <em>Nom U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator()
 * @model
 * @generated
 */
public interface ShuntCompensator extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>AVR Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An automatic voltage regulation delay (AVRDelay) which is the time delay from a change in voltage to when the capacitor is allowed to change state. This filters out temporary changes in voltage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>AVR Delay</em>' attribute.
     * @see #isSetAVRDelay()
     * @see #unsetAVRDelay()
     * @see #setAVRDelay(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_AVRDelay()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.aVRDelay' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAVRDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AVR Delay</em>' attribute.
     * @see #isSetAVRDelay()
     * @see #unsetAVRDelay()
     * @see #getAVRDelay()
     * @generated
     */
    void setAVRDelay( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAVRDelay()
     * @see #getAVRDelay()
     * @see #setAVRDelay(Double)
     * @generated
     */
    void unsetAVRDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AVR Delay</em>' attribute is set.
     * @see #unsetAVRDelay()
     * @see #getAVRDelay()
     * @see #setAVRDelay(Double)
     * @generated
     */
    boolean isSetAVRDelay();

    /**
     * Returns the value of the '<em><b>Maximum Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum number of sections that may be switched in.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Maximum Sections</em>' attribute.
     * @see #isSetMaximumSections()
     * @see #unsetMaximumSections()
     * @see #setMaximumSections(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_MaximumSections()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.maximumSections' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getMaximumSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Sections</em>' attribute.
     * @see #isSetMaximumSections()
     * @see #unsetMaximumSections()
     * @see #getMaximumSections()
     * @generated
     */
    void setMaximumSections( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumSections()
     * @see #getMaximumSections()
     * @see #setMaximumSections(BigInteger)
     * @generated
     */
    void unsetMaximumSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Sections</em>' attribute is set.
     * @see #unsetMaximumSections()
     * @see #getMaximumSections()
     * @see #setMaximumSections(BigInteger)
     * @generated
     */
    boolean isSetMaximumSections();

    /**
     * Returns the value of the '<em><b>Voltage Sensitivity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage sensitivity required for the device to regulate the bus voltage, in voltage/reactive power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Sensitivity</em>' attribute.
     * @see #isSetVoltageSensitivity()
     * @see #unsetVoltageSensitivity()
     * @see #setVoltageSensitivity(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_VoltageSensitivity()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltagePerReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.voltageSensitivity' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageSensitivity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Sensitivity</em>' attribute.
     * @see #isSetVoltageSensitivity()
     * @see #unsetVoltageSensitivity()
     * @see #getVoltageSensitivity()
     * @generated
     */
    void setVoltageSensitivity( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageSensitivity()
     * @see #getVoltageSensitivity()
     * @see #setVoltageSensitivity(Double)
     * @generated
     */
    void unsetVoltageSensitivity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Sensitivity</em>' attribute is set.
     * @see #unsetVoltageSensitivity()
     * @see #getVoltageSensitivity()
     * @see #setVoltageSensitivity(Double)
     * @generated
     */
    boolean isSetVoltageSensitivity();

    /**
     * Returns the value of the '<em><b>Nom U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage at which the nominal reactive power may be calculated. This should normally be within 10% of the voltage at which the capacitor is connected to the network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nom U</em>' attribute.
     * @see #isSetNomU()
     * @see #unsetNomU()
     * @see #setNomU(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_NomU()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.nomU' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNomU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nom U</em>' attribute.
     * @see #isSetNomU()
     * @see #unsetNomU()
     * @see #getNomU()
     * @generated
     */
    void setNomU( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNomU()
     * @see #getNomU()
     * @see #setNomU(Double)
     * @generated
     */
    void unsetNomU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNomU <em>Nom U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nom U</em>' attribute is set.
     * @see #unsetNomU()
     * @see #getNomU()
     * @see #setNomU(Double)
     * @generated
     */
    boolean isSetNomU();

    /**
     * Returns the value of the '<em><b>Grounded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for Yn and Zn connections. True if the neutral is solidly grounded.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #setGrounded(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_Grounded()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.grounded' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getGrounded();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @generated
     */
    void setGrounded( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    void unsetGrounded();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getGrounded <em>Grounded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded</em>' attribute is set.
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    boolean isSetGrounded();

    /**
     * Returns the value of the '<em><b>Normal Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The normal number of sections switched in. The value shall be between zero and ShuntCompensator.maximumSections.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Normal Sections</em>' attribute.
     * @see #isSetNormalSections()
     * @see #unsetNormalSections()
     * @see #setNormalSections(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_NormalSections()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.normalSections' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getNormalSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Sections</em>' attribute.
     * @see #isSetNormalSections()
     * @see #unsetNormalSections()
     * @see #getNormalSections()
     * @generated
     */
    void setNormalSections( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalSections()
     * @see #getNormalSections()
     * @see #setNormalSections(BigInteger)
     * @generated
     */
    void unsetNormalSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Sections</em>' attribute is set.
     * @see #unsetNormalSections()
     * @see #getNormalSections()
     * @see #setNormalSections(BigInteger)
     * @generated
     */
    boolean isSetNormalSections();

    /**
     * Returns the value of the '<em><b>Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Shunt compensator sections in use. Starting value for steady state solution. The attribute shall be a positive value or zero. Non integer values are allowed to support continuous variables. The reasons for continuous value are to support study cases where no discrete shunt compensators has yet been designed, a solutions where a narrow voltage band force the sections to oscillate or accommodate for a continuous solution as input.
     * For LinearShuntConpensator the value shall be between zero and ShuntCompensator.maximumSections. At value zero the shunt compensator conductance and admittance is zero. Linear interpolation of conductance and admittance between the previous and next integer section is applied in case of non-integer values.
     * For NonlinearShuntCompensator-s shall only be set to one of the NonlinearShuntCompenstorPoint.sectionNumber. There is no interpolation between NonlinearShuntCompenstorPoint-s.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #setSections(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_Sections()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.sections' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #getSections()
     * @generated
     */
    void setSections( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSections()
     * @see #getSections()
     * @see #setSections(Double)
     * @generated
     */
    void unsetSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSections <em>Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sections</em>' attribute is set.
     * @see #unsetSections()
     * @see #getSections()
     * @see #setSections(Double)
     * @generated
     */
    boolean isSetSections();

    /**
     * Returns the value of the '<em><b>Sv Shunt Compensator Sections</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The state for the number of shunt compensator sections in service.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sv Shunt Compensator Sections</em>' reference.
     * @see #isSetSvShuntCompensatorSections()
     * @see #unsetSvShuntCompensatorSections()
     * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShuntCompensator_SvShuntCompensatorSections()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getShuntCompensator
     * @model opposite="ShuntCompensator" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ShuntCompensator.SvShuntCompensatorSections' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SvShuntCompensatorSections getSvShuntCompensatorSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Shunt Compensator Sections</em>' reference.
     * @see #isSetSvShuntCompensatorSections()
     * @see #unsetSvShuntCompensatorSections()
     * @see #getSvShuntCompensatorSections()
     * @generated
     */
    void setSvShuntCompensatorSections( SvShuntCompensatorSections value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvShuntCompensatorSections()
     * @see #getSvShuntCompensatorSections()
     * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
     * @generated
     */
    void unsetSvShuntCompensatorSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Shunt Compensator Sections</em>' reference is set.
     * @see #unsetSvShuntCompensatorSections()
     * @see #getSvShuntCompensatorSections()
     * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
     * @generated
     */
    boolean isSetSvShuntCompensatorSections();

} // ShuntCompensator
