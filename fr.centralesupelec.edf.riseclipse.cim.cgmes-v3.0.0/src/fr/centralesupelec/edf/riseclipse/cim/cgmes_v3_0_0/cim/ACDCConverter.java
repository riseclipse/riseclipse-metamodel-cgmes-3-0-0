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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACDC Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unit with valves for three phases, together with unit control equipment, essential protective and switching devices, DC storage capacitors, phase reactors and auxiliaries, if any, used for conversion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPccTerminal <em>Pcc Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getResistiveLoss <em>Resistive Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getBaseS <em>Base S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdleLoss <em>Idle Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getNumberOfValves <em>Number Of Valves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getValveU0 <em>Valve U0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinUdc <em>Min Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxUdc <em>Max Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getSwitchingLoss <em>Switching Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getRatedUdc <em>Rated Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetPpcc <em>Target Ppcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetUdc <em>Target Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdc <em>Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUdc <em>Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPoleLossP <em>Pole Loss P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUc <em>Uc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter()
 * @model
 * @generated
 */
public interface ACDCConverter extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum active power limit. The value is overwritten by values of VsCapabilityCurve, if present.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max P</em>' attribute.
     * @see #isSetMaxP()
     * @see #unsetMaxP()
     * @see #setMaxP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_MaxP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.maxP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max P</em>' attribute.
     * @see #isSetMaxP()
     * @see #unsetMaxP()
     * @see #getMaxP()
     * @generated
     */
    void setMaxP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Double)
     * @generated
     */
    void unsetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxP <em>Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max P</em>' attribute is set.
     * @see #unsetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Double)
     * @generated
     */
    boolean isSetMaxP();

    /**
     * Returns the value of the '<em><b>Min Udc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum voltage on the DC side at which the converter should operate. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Udc</em>' attribute.
     * @see #isSetMinUdc()
     * @see #unsetMinUdc()
     * @see #setMinUdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_MinUdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.minUdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinUdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinUdc <em>Min Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Udc</em>' attribute.
     * @see #isSetMinUdc()
     * @see #unsetMinUdc()
     * @see #getMinUdc()
     * @generated
     */
    void setMinUdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinUdc <em>Min Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinUdc()
     * @see #getMinUdc()
     * @see #setMinUdc(Double)
     * @generated
     */
    void unsetMinUdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinUdc <em>Min Udc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Udc</em>' attribute is set.
     * @see #unsetMinUdc()
     * @see #getMinUdc()
     * @see #setMinUdc(Double)
     * @generated
     */
    boolean isSetMinUdc();

    /**
     * Returns the value of the '<em><b>Valve U0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Valve threshold voltage, also called Uvalve. Forward voltage drop when the valve is conducting. Used in loss calculations, i.e. the switchLoss depend on numberOfValves * valveU0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Valve U0</em>' attribute.
     * @see #isSetValveU0()
     * @see #unsetValveU0()
     * @see #setValveU0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_ValveU0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.valveU0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getValveU0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getValveU0 <em>Valve U0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valve U0</em>' attribute.
     * @see #isSetValveU0()
     * @see #unsetValveU0()
     * @see #getValveU0()
     * @generated
     */
    void setValveU0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getValveU0 <em>Valve U0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValveU0()
     * @see #getValveU0()
     * @see #setValveU0(Double)
     * @generated
     */
    void unsetValveU0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getValveU0 <em>Valve U0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Valve U0</em>' attribute is set.
     * @see #unsetValveU0()
     * @see #getValveU0()
     * @see #setValveU0(Double)
     * @generated
     */
    boolean isSetValveU0();

    /**
     * Returns the value of the '<em><b>DC Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A DC converter have DC converter terminals. A converter has two DC converter terminals.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Terminals</em>' reference list.
     * @see #isSetDCTerminals()
     * @see #unsetDCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_DCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getDCConductingEquipment
     * @model opposite="DCConductingEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.DCTerminals' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ACDCConverterDCTerminal > getDCTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getDCTerminals <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    void unsetDCTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getDCTerminals <em>DC Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Terminals</em>' reference list is set.
     * @see #unsetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    boolean isSetDCTerminals();

    /**
     * Returns the value of the '<em><b>Number Of Valves</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of valves in the converter. Used in loss calculations.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Number Of Valves</em>' attribute.
     * @see #isSetNumberOfValves()
     * @see #unsetNumberOfValves()
     * @see #setNumberOfValves(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_NumberOfValves()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.numberOfValves' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getNumberOfValves();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getNumberOfValves <em>Number Of Valves</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Valves</em>' attribute.
     * @see #isSetNumberOfValves()
     * @see #unsetNumberOfValves()
     * @see #getNumberOfValves()
     * @generated
     */
    void setNumberOfValves( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getNumberOfValves <em>Number Of Valves</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNumberOfValves()
     * @see #getNumberOfValves()
     * @see #setNumberOfValves(BigInteger)
     * @generated
     */
    void unsetNumberOfValves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getNumberOfValves <em>Number Of Valves</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Number Of Valves</em>' attribute is set.
     * @see #unsetNumberOfValves()
     * @see #getNumberOfValves()
     * @see #setNumberOfValves(BigInteger)
     * @generated
     */
    boolean isSetNumberOfValves();

    /**
     * Returns the value of the '<em><b>Resistive Loss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * It is converter’s configuration data used in power flow. Refer to poleLossP. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resistive Loss</em>' attribute.
     * @see #isSetResistiveLoss()
     * @see #unsetResistiveLoss()
     * @see #setResistiveLoss(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_ResistiveLoss()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.resistiveLoss' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getResistiveLoss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getResistiveLoss <em>Resistive Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resistive Loss</em>' attribute.
     * @see #isSetResistiveLoss()
     * @see #unsetResistiveLoss()
     * @see #getResistiveLoss()
     * @generated
     */
    void setResistiveLoss( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getResistiveLoss <em>Resistive Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResistiveLoss()
     * @see #getResistiveLoss()
     * @see #setResistiveLoss(Double)
     * @generated
     */
    void unsetResistiveLoss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getResistiveLoss <em>Resistive Loss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resistive Loss</em>' attribute is set.
     * @see #unsetResistiveLoss()
     * @see #getResistiveLoss()
     * @see #setResistiveLoss(Double)
     * @generated
     */
    boolean isSetResistiveLoss();

    /**
     * Returns the value of the '<em><b>Base S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base apparent power of the converter pole. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base S</em>' attribute.
     * @see #isSetBaseS()
     * @see #unsetBaseS()
     * @see #setBaseS(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_BaseS()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ApparentPower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.baseS' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBaseS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getBaseS <em>Base S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base S</em>' attribute.
     * @see #isSetBaseS()
     * @see #unsetBaseS()
     * @see #getBaseS()
     * @generated
     */
    void setBaseS( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getBaseS <em>Base S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseS()
     * @see #getBaseS()
     * @see #setBaseS(Double)
     * @generated
     */
    void unsetBaseS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getBaseS <em>Base S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base S</em>' attribute is set.
     * @see #unsetBaseS()
     * @see #getBaseS()
     * @see #setBaseS(Double)
     * @generated
     */
    boolean isSetBaseS();

    /**
     * Returns the value of the '<em><b>Max Udc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum voltage on the DC side at which the converter should operate. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Udc</em>' attribute.
     * @see #isSetMaxUdc()
     * @see #unsetMaxUdc()
     * @see #setMaxUdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_MaxUdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.maxUdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxUdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxUdc <em>Max Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Udc</em>' attribute.
     * @see #isSetMaxUdc()
     * @see #unsetMaxUdc()
     * @see #getMaxUdc()
     * @generated
     */
    void setMaxUdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxUdc <em>Max Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxUdc()
     * @see #getMaxUdc()
     * @see #setMaxUdc(Double)
     * @generated
     */
    void unsetMaxUdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMaxUdc <em>Max Udc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Udc</em>' attribute is set.
     * @see #unsetMaxUdc()
     * @see #getMaxUdc()
     * @see #setMaxUdc(Double)
     * @generated
     */
    boolean isSetMaxUdc();

    /**
     * Returns the value of the '<em><b>Idle Loss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power loss in pole at no power transfer. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Idle Loss</em>' attribute.
     * @see #isSetIdleLoss()
     * @see #unsetIdleLoss()
     * @see #setIdleLoss(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_IdleLoss()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.idleLoss' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIdleLoss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdleLoss <em>Idle Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idle Loss</em>' attribute.
     * @see #isSetIdleLoss()
     * @see #unsetIdleLoss()
     * @see #getIdleLoss()
     * @generated
     */
    void setIdleLoss( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdleLoss <em>Idle Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdleLoss()
     * @see #getIdleLoss()
     * @see #setIdleLoss(Double)
     * @generated
     */
    void unsetIdleLoss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdleLoss <em>Idle Loss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Idle Loss</em>' attribute is set.
     * @see #unsetIdleLoss()
     * @see #getIdleLoss()
     * @see #setIdleLoss(Double)
     * @generated
     */
    boolean isSetIdleLoss();

    /**
     * Returns the value of the '<em><b>Pcc Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getConverterDCSides <em>Converter DC Sides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Point of common coupling terminal for this converter DC side. It is typically the terminal on the power transformer (or switch) closest to the AC network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pcc Terminal</em>' reference.
     * @see #isSetPccTerminal()
     * @see #unsetPccTerminal()
     * @see #setPccTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_PccTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getConverterDCSides
     * @model opposite="ConverterDCSides" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.PccTerminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getPccTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPccTerminal <em>Pcc Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pcc Terminal</em>' reference.
     * @see #isSetPccTerminal()
     * @see #unsetPccTerminal()
     * @see #getPccTerminal()
     * @generated
     */
    void setPccTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPccTerminal <em>Pcc Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPccTerminal()
     * @see #getPccTerminal()
     * @see #setPccTerminal(Terminal)
     * @generated
     */
    void unsetPccTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPccTerminal <em>Pcc Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pcc Terminal</em>' reference is set.
     * @see #unsetPccTerminal()
     * @see #getPccTerminal()
     * @see #setPccTerminal(Terminal)
     * @generated
     */
    boolean isSetPccTerminal();

    /**
     * Returns the value of the '<em><b>Switching Loss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Switching losses, relative to the base apparent power 'baseS'. Refer to poleLossP. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Switching Loss</em>' attribute.
     * @see #isSetSwitchingLoss()
     * @see #unsetSwitchingLoss()
     * @see #setSwitchingLoss(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_SwitchingLoss()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePowerPerCurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.switchingLoss' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSwitchingLoss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getSwitchingLoss <em>Switching Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switching Loss</em>' attribute.
     * @see #isSetSwitchingLoss()
     * @see #unsetSwitchingLoss()
     * @see #getSwitchingLoss()
     * @generated
     */
    void setSwitchingLoss( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getSwitchingLoss <em>Switching Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingLoss()
     * @see #getSwitchingLoss()
     * @see #setSwitchingLoss(Double)
     * @generated
     */
    void unsetSwitchingLoss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getSwitchingLoss <em>Switching Loss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Loss</em>' attribute is set.
     * @see #unsetSwitchingLoss()
     * @see #getSwitchingLoss()
     * @see #setSwitchingLoss(Double)
     * @generated
     */
    boolean isSetSwitchingLoss();

    /**
     * Returns the value of the '<em><b>Rated Udc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated converter DC voltage, also called UdN. The attribute shall be a positive value. It is converter’s configuration data used in power flow. For instance a bipolar HVDC link with value  200 kV has a 400kV difference between the dc lines.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Udc</em>' attribute.
     * @see #isSetRatedUdc()
     * @see #unsetRatedUdc()
     * @see #setRatedUdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_RatedUdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.ratedUdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedUdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getRatedUdc <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Udc</em>' attribute.
     * @see #isSetRatedUdc()
     * @see #unsetRatedUdc()
     * @see #getRatedUdc()
     * @generated
     */
    void setRatedUdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getRatedUdc <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedUdc()
     * @see #getRatedUdc()
     * @see #setRatedUdc(Double)
     * @generated
     */
    void unsetRatedUdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getRatedUdc <em>Rated Udc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Udc</em>' attribute is set.
     * @see #unsetRatedUdc()
     * @see #getRatedUdc()
     * @see #setRatedUdc(Double)
     * @generated
     */
    boolean isSetRatedUdc();

    /**
     * Returns the value of the '<em><b>Target Ppcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power injection target in AC grid, at point of common coupling.  Load sign convention is used, i.e. positive sign means flow out from a node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Ppcc</em>' attribute.
     * @see #isSetTargetPpcc()
     * @see #unsetTargetPpcc()
     * @see #setTargetPpcc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_TargetPpcc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.targetPpcc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetPpcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetPpcc <em>Target Ppcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ppcc</em>' attribute.
     * @see #isSetTargetPpcc()
     * @see #unsetTargetPpcc()
     * @see #getTargetPpcc()
     * @generated
     */
    void setTargetPpcc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetPpcc <em>Target Ppcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetPpcc()
     * @see #getTargetPpcc()
     * @see #setTargetPpcc(Double)
     * @generated
     */
    void unsetTargetPpcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetPpcc <em>Target Ppcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Ppcc</em>' attribute is set.
     * @see #unsetTargetPpcc()
     * @see #getTargetPpcc()
     * @see #setTargetPpcc(Double)
     * @generated
     */
    boolean isSetTargetPpcc();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power at the point of common coupling. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution in the case a simplified power flow model is used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power at the point of common coupling. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution in the case a simplified power flow model is used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_P()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.p' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #getP()
     * @generated
     */
    void setP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getP <em>P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' attribute is set.
     * @see #unsetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    boolean isSetP();

    /**
     * Returns the value of the '<em><b>Target Udc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Target value for DC voltage magnitude. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Udc</em>' attribute.
     * @see #isSetTargetUdc()
     * @see #unsetTargetUdc()
     * @see #setTargetUdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_TargetUdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.targetUdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetUdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetUdc <em>Target Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Udc</em>' attribute.
     * @see #isSetTargetUdc()
     * @see #unsetTargetUdc()
     * @see #getTargetUdc()
     * @generated
     */
    void setTargetUdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetUdc <em>Target Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetUdc()
     * @see #getTargetUdc()
     * @see #setTargetUdc(Double)
     * @generated
     */
    void unsetTargetUdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getTargetUdc <em>Target Udc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Udc</em>' attribute is set.
     * @see #unsetTargetUdc()
     * @see #getTargetUdc()
     * @see #setTargetUdc(Double)
     * @generated
     */
    boolean isSetTargetUdc();

    /**
     * Returns the value of the '<em><b>Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Converter DC current, also called Id. It is converter’s state variable, result from power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Idc</em>' attribute.
     * @see #isSetIdc()
     * @see #unsetIdc()
     * @see #setIdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_Idc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.idc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdc <em>Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idc</em>' attribute.
     * @see #isSetIdc()
     * @see #unsetIdc()
     * @see #getIdc()
     * @generated
     */
    void setIdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdc <em>Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdc()
     * @see #getIdc()
     * @see #setIdc(Double)
     * @generated
     */
    void unsetIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getIdc <em>Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Idc</em>' attribute is set.
     * @see #unsetIdc()
     * @see #getIdc()
     * @see #setIdc(Double)
     * @generated
     */
    boolean isSetIdc();

    /**
     * Returns the value of the '<em><b>Udc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Converter voltage at the DC side, also called Ud. It is converter’s state variable, result from power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Udc</em>' attribute.
     * @see #isSetUdc()
     * @see #unsetUdc()
     * @see #setUdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_Udc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.udc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUdc <em>Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udc</em>' attribute.
     * @see #isSetUdc()
     * @see #unsetUdc()
     * @see #getUdc()
     * @generated
     */
    void setUdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUdc <em>Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdc()
     * @see #getUdc()
     * @see #setUdc(Double)
     * @generated
     */
    void unsetUdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUdc <em>Udc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udc</em>' attribute is set.
     * @see #unsetUdc()
     * @see #getUdc()
     * @see #setUdc(Double)
     * @generated
     */
    boolean isSetUdc();

    /**
     * Returns the value of the '<em><b>Pole Loss P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The active power loss at a DC Pole
     * = idleLoss + switchingLoss*|Idc| + resitiveLoss*Idc^2.
     * For lossless operation Pdc=Pac.
     * For rectifier operation with losses Pdc=Pac-lossP.
     * For inverter operation with losses Pdc=Pac+lossP.
     * It is converter’s state variable used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pole Loss P</em>' attribute.
     * @see #isSetPoleLossP()
     * @see #unsetPoleLossP()
     * @see #setPoleLossP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_PoleLossP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.poleLossP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPoleLossP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPoleLossP <em>Pole Loss P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pole Loss P</em>' attribute.
     * @see #isSetPoleLossP()
     * @see #unsetPoleLossP()
     * @see #getPoleLossP()
     * @generated
     */
    void setPoleLossP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPoleLossP <em>Pole Loss P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPoleLossP()
     * @see #getPoleLossP()
     * @see #setPoleLossP(Double)
     * @generated
     */
    void unsetPoleLossP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getPoleLossP <em>Pole Loss P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pole Loss P</em>' attribute is set.
     * @see #unsetPoleLossP()
     * @see #getPoleLossP()
     * @see #setPoleLossP(Double)
     * @generated
     */
    boolean isSetPoleLossP();

    /**
     * Returns the value of the '<em><b>Uc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Line-to-line converter voltage, the voltage at the AC side of the valve. It is converter’s state variable, result from power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uc</em>' attribute.
     * @see #isSetUc()
     * @see #unsetUc()
     * @see #setUc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_Uc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.uc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUc <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uc</em>' attribute.
     * @see #isSetUc()
     * @see #unsetUc()
     * @see #getUc()
     * @generated
     */
    void setUc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUc <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUc()
     * @see #getUc()
     * @see #setUc(Double)
     * @generated
     */
    void unsetUc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getUc <em>Uc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uc</em>' attribute is set.
     * @see #unsetUc()
     * @see #getUc()
     * @see #setUc(Double)
     * @generated
     */
    boolean isSetUc();

    /**
     * Returns the value of the '<em><b>Min P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum active power limit. The value is overwritten by values of VsCapabilityCurve, if present.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min P</em>' attribute.
     * @see #isSetMinP()
     * @see #unsetMinP()
     * @see #setMinP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverter_MinP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverter.minP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min P</em>' attribute.
     * @see #isSetMinP()
     * @see #unsetMinP()
     * @see #getMinP()
     * @generated
     */
    void setMinP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinP()
     * @see #getMinP()
     * @see #setMinP(Double)
     * @generated
     */
    void unsetMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getMinP <em>Min P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min P</em>' attribute is set.
     * @see #unsetMinP()
     * @see #getMinP()
     * @see #setMinP(Double)
     * @generated
     */
    boolean isSetMinP();

} // ACDCConverter
