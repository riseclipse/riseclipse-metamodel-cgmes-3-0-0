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
 * A representation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models the characteristic response of the load demand due to changes in system conditions such as voltage and frequency. It is not related to demand response.
 * If LoadResponseCharacteristic.exponentModel is True, the exponential voltage or frequency dependent models are specified and used as to calculate active and reactive power components of the load model.
 * The equations to calculate active and reactive power components of the load model are internal to the power flow calculation, hence they use different quantities depending on the use case of the data exchange.
 * The equations for exponential voltage dependent load model injected power are:
 * pInjection= Pnominal* (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent
 * qInjection= Qnominal* (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.qVoltageExponent
 * Where:
 * 1) * means "multiply" and ** is "raised to power of";
 * 2) Pnominal and Qnominal represent the active power and reactive power at nominal voltage as any load described by the voltage exponential model shall be given at nominal voltage.  This means that EnergyConsumer.p and EnergyConsumer.q  are at nominal voltage.
 * 3) After power flow is solved:
 * -pInjection and qInjection correspond to SvPowerflow.p and SvPowerflow.q respectively.
 * - Voltage corresponds to SvVoltage.v at the TopologicalNode where the load is connected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic()
 * @model
 * @generated
 */
public interface LoadResponseCharacteristic extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>PVoltage Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exponent of per unit voltage effecting real power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PVoltage Exponent</em>' attribute.
     * @see #isSetPVoltageExponent()
     * @see #unsetPVoltageExponent()
     * @see #setPVoltageExponent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_PVoltageExponent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.pVoltageExponent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPVoltageExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PVoltage Exponent</em>' attribute.
     * @see #isSetPVoltageExponent()
     * @see #unsetPVoltageExponent()
     * @see #getPVoltageExponent()
     * @generated
     */
    void setPVoltageExponent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPVoltageExponent()
     * @see #getPVoltageExponent()
     * @see #setPVoltageExponent(Double)
     * @generated
     */
    void unsetPVoltageExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PVoltage Exponent</em>' attribute is set.
     * @see #unsetPVoltageExponent()
     * @see #getPVoltageExponent()
     * @see #setPVoltageExponent(Double)
     * @generated
     */
    boolean isSetPVoltageExponent();

    /**
     * Returns the value of the '<em><b>Exponent Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the exponential voltage dependency model is to be used. If false, the coefficient model is to be used.
     * The exponential voltage dependency model consist of the attributes:
     * - pVoltageExponent
     * - qVoltageExponent
     * - pFrequencyExponent
     * - qFrequencyExponent.
     * The coefficient model consist of the attributes:
     * - pConstantImpedance
     * - pConstantCurrent
     * - pConstantPower
     * - qConstantImpedance
     * - qConstantCurrent
     * - qConstantPower.
     * The sum of pConstantImpedance, pConstantCurrent and pConstantPower shall equal 1.
     * The sum of qConstantImpedance, qConstantCurrent and qConstantPower shall equal 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Exponent Model</em>' attribute.
     * @see #isSetExponentModel()
     * @see #unsetExponentModel()
     * @see #setExponentModel(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_ExponentModel()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.exponentModel' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getExponentModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exponent Model</em>' attribute.
     * @see #isSetExponentModel()
     * @see #unsetExponentModel()
     * @see #getExponentModel()
     * @generated
     */
    void setExponentModel( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExponentModel()
     * @see #getExponentModel()
     * @see #setExponentModel(Boolean)
     * @generated
     */
    void unsetExponentModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exponent Model</em>' attribute is set.
     * @see #unsetExponentModel()
     * @see #getExponentModel()
     * @see #setExponentModel(Boolean)
     * @generated
     */
    boolean isSetExponentModel();

    /**
     * Returns the value of the '<em><b>QConstant Impedance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Portion of reactive power load modelled as constant impedance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QConstant Impedance</em>' attribute.
     * @see #isSetQConstantImpedance()
     * @see #unsetQConstantImpedance()
     * @see #setQConstantImpedance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_QConstantImpedance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.qConstantImpedance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQConstantImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QConstant Impedance</em>' attribute.
     * @see #isSetQConstantImpedance()
     * @see #unsetQConstantImpedance()
     * @see #getQConstantImpedance()
     * @generated
     */
    void setQConstantImpedance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQConstantImpedance()
     * @see #getQConstantImpedance()
     * @see #setQConstantImpedance(Double)
     * @generated
     */
    void unsetQConstantImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QConstant Impedance</em>' attribute is set.
     * @see #unsetQConstantImpedance()
     * @see #getQConstantImpedance()
     * @see #setQConstantImpedance(Double)
     * @generated
     */
    boolean isSetQConstantImpedance();

    /**
     * Returns the value of the '<em><b>Energy Consumer</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of loads that have the response characteristics.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Consumer</em>' reference list.
     * @see #isSetEnergyConsumer()
     * @see #unsetEnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_EnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadResponse
     * @model opposite="LoadResponse" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.EnergyConsumer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< EnergyConsumer > getEnergyConsumer();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    void unsetEnergyConsumer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumer</em>' reference list is set.
     * @see #unsetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    boolean isSetEnergyConsumer();

    /**
     * Returns the value of the '<em><b>PConstant Impedance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Portion of active power load modelled as constant impedance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PConstant Impedance</em>' attribute.
     * @see #isSetPConstantImpedance()
     * @see #unsetPConstantImpedance()
     * @see #setPConstantImpedance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_PConstantImpedance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.pConstantImpedance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPConstantImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PConstant Impedance</em>' attribute.
     * @see #isSetPConstantImpedance()
     * @see #unsetPConstantImpedance()
     * @see #getPConstantImpedance()
     * @generated
     */
    void setPConstantImpedance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPConstantImpedance()
     * @see #getPConstantImpedance()
     * @see #setPConstantImpedance(Double)
     * @generated
     */
    void unsetPConstantImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PConstant Impedance</em>' attribute is set.
     * @see #unsetPConstantImpedance()
     * @see #getPConstantImpedance()
     * @see #setPConstantImpedance(Double)
     * @generated
     */
    boolean isSetPConstantImpedance();

    /**
     * Returns the value of the '<em><b>QConstant Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Portion of reactive power load modelled as constant current.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QConstant Current</em>' attribute.
     * @see #isSetQConstantCurrent()
     * @see #unsetQConstantCurrent()
     * @see #setQConstantCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_QConstantCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.qConstantCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQConstantCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QConstant Current</em>' attribute.
     * @see #isSetQConstantCurrent()
     * @see #unsetQConstantCurrent()
     * @see #getQConstantCurrent()
     * @generated
     */
    void setQConstantCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQConstantCurrent()
     * @see #getQConstantCurrent()
     * @see #setQConstantCurrent(Double)
     * @generated
     */
    void unsetQConstantCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QConstant Current</em>' attribute is set.
     * @see #unsetQConstantCurrent()
     * @see #getQConstantCurrent()
     * @see #setQConstantCurrent(Double)
     * @generated
     */
    boolean isSetQConstantCurrent();

    /**
     * Returns the value of the '<em><b>PConstant Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Portion of active power load modelled as constant current.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PConstant Current</em>' attribute.
     * @see #isSetPConstantCurrent()
     * @see #unsetPConstantCurrent()
     * @see #setPConstantCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_PConstantCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.pConstantCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPConstantCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PConstant Current</em>' attribute.
     * @see #isSetPConstantCurrent()
     * @see #unsetPConstantCurrent()
     * @see #getPConstantCurrent()
     * @generated
     */
    void setPConstantCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPConstantCurrent()
     * @see #getPConstantCurrent()
     * @see #setPConstantCurrent(Double)
     * @generated
     */
    void unsetPConstantCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PConstant Current</em>' attribute is set.
     * @see #unsetPConstantCurrent()
     * @see #getPConstantCurrent()
     * @see #setPConstantCurrent(Double)
     * @generated
     */
    boolean isSetPConstantCurrent();

    /**
     * Returns the value of the '<em><b>QConstant Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Portion of reactive power load modelled as constant power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QConstant Power</em>' attribute.
     * @see #isSetQConstantPower()
     * @see #unsetQConstantPower()
     * @see #setQConstantPower(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_QConstantPower()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.qConstantPower' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQConstantPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QConstant Power</em>' attribute.
     * @see #isSetQConstantPower()
     * @see #unsetQConstantPower()
     * @see #getQConstantPower()
     * @generated
     */
    void setQConstantPower( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQConstantPower()
     * @see #getQConstantPower()
     * @see #setQConstantPower(Double)
     * @generated
     */
    void unsetQConstantPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QConstant Power</em>' attribute is set.
     * @see #unsetQConstantPower()
     * @see #getQConstantPower()
     * @see #setQConstantPower(Double)
     * @generated
     */
    boolean isSetQConstantPower();

    /**
     * Returns the value of the '<em><b>PConstant Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Portion of active power load modelled as constant power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PConstant Power</em>' attribute.
     * @see #isSetPConstantPower()
     * @see #unsetPConstantPower()
     * @see #setPConstantPower(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_PConstantPower()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.pConstantPower' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPConstantPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PConstant Power</em>' attribute.
     * @see #isSetPConstantPower()
     * @see #unsetPConstantPower()
     * @see #getPConstantPower()
     * @generated
     */
    void setPConstantPower( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPConstantPower()
     * @see #getPConstantPower()
     * @see #setPConstantPower(Double)
     * @generated
     */
    void unsetPConstantPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PConstant Power</em>' attribute is set.
     * @see #unsetPConstantPower()
     * @see #getPConstantPower()
     * @see #setPConstantPower(Double)
     * @generated
     */
    boolean isSetPConstantPower();

    /**
     * Returns the value of the '<em><b>QVoltage Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exponent of per unit voltage effecting reactive power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QVoltage Exponent</em>' attribute.
     * @see #isSetQVoltageExponent()
     * @see #unsetQVoltageExponent()
     * @see #setQVoltageExponent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_QVoltageExponent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.qVoltageExponent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQVoltageExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QVoltage Exponent</em>' attribute.
     * @see #isSetQVoltageExponent()
     * @see #unsetQVoltageExponent()
     * @see #getQVoltageExponent()
     * @generated
     */
    void setQVoltageExponent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQVoltageExponent()
     * @see #getQVoltageExponent()
     * @see #setQVoltageExponent(Double)
     * @generated
     */
    void unsetQVoltageExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QVoltage Exponent</em>' attribute is set.
     * @see #unsetQVoltageExponent()
     * @see #getQVoltageExponent()
     * @see #setQVoltageExponent(Double)
     * @generated
     */
    boolean isSetQVoltageExponent();

    /**
     * Returns the value of the '<em><b>QFrequency Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exponent of per unit frequency effecting reactive power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QFrequency Exponent</em>' attribute.
     * @see #isSetQFrequencyExponent()
     * @see #unsetQFrequencyExponent()
     * @see #setQFrequencyExponent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_QFrequencyExponent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.qFrequencyExponent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQFrequencyExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QFrequency Exponent</em>' attribute.
     * @see #isSetQFrequencyExponent()
     * @see #unsetQFrequencyExponent()
     * @see #getQFrequencyExponent()
     * @generated
     */
    void setQFrequencyExponent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQFrequencyExponent()
     * @see #getQFrequencyExponent()
     * @see #setQFrequencyExponent(Double)
     * @generated
     */
    void unsetQFrequencyExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QFrequency Exponent</em>' attribute is set.
     * @see #unsetQFrequencyExponent()
     * @see #getQFrequencyExponent()
     * @see #setQFrequencyExponent(Double)
     * @generated
     */
    boolean isSetQFrequencyExponent();

    /**
     * Returns the value of the '<em><b>PFrequency Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exponent of per unit frequency effecting active power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFrequency Exponent</em>' attribute.
     * @see #isSetPFrequencyExponent()
     * @see #unsetPFrequencyExponent()
     * @see #setPFrequencyExponent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadResponseCharacteristic_PFrequencyExponent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadResponseCharacteristic.pFrequencyExponent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPFrequencyExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFrequency Exponent</em>' attribute.
     * @see #isSetPFrequencyExponent()
     * @see #unsetPFrequencyExponent()
     * @see #getPFrequencyExponent()
     * @generated
     */
    void setPFrequencyExponent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFrequencyExponent()
     * @see #getPFrequencyExponent()
     * @see #setPFrequencyExponent(Double)
     * @generated
     */
    void unsetPFrequencyExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFrequency Exponent</em>' attribute is set.
     * @see #unsetPFrequencyExponent()
     * @see #getPFrequencyExponent()
     * @see #setPFrequencyExponent(Double)
     * @generated
     */
    boolean isSetPFrequencyExponent();

} // LoadResponseCharacteristic
