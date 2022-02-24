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
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement.
 * The PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leaves, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.
 * Some Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (VT) or potential transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment.
 * If both a Terminal and PSR are associated, and the PSR is of type ConductingEquipment, the associated Terminal should belong to that ConductingEquipment instance.
 * When the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Phases</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseCode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates to which phases the measurement applies and avoids the need to use 'measurementType' to also encode phase information (which would explode the types). The phase information in Measurement, along with 'measurementType' and 'phases' uniquely defines a Measurement for a device, based on normal network phase. Their meaning will not change when the computed energizing phasing is changed due to jumpers or other reasons.
     * If the attribute is missing three phases (ABC) shall be assumed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Phases</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #setPhases(PhaseCode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement_Phases()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Measurement.phases' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PhaseCode getPhases();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phases</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #getPhases()
     * @generated
     */
    void setPhases( PhaseCode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    void unsetPhases();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPhases <em>Phases</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phases</em>' attribute is set.
     * @see #unsetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    boolean isSetPhases();

    /**
     * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit of measure of the measured quantity.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Unit Symbol</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement_UnitSymbol()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Measurement.unitSymbol' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getUnitSymbol();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Symbol</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @generated
     */
    void setUnitSymbol( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    void unsetUnitSymbol();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitSymbol <em>Unit Symbol</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Symbol</em>' attribute is set.
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    boolean isSetUnitSymbol();

    /**
     * Returns the value of the '<em><b>Measurement Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the type of measurement.  For example, this specifies if the measurement represents an indoor temperature, outdoor temperature, bus voltage, line flow, etc.
     * When the measurementType is set to "Specialization", the type of Measurement is defined in more detail by the specialized class which inherits from Measurement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurement Type</em>' attribute.
     * @see #isSetMeasurementType()
     * @see #unsetMeasurementType()
     * @see #setMeasurementType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement_MeasurementType()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='Measurement.measurementType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getMeasurementType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getMeasurementType <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Type</em>' attribute.
     * @see #isSetMeasurementType()
     * @see #unsetMeasurementType()
     * @see #getMeasurementType()
     * @generated
     */
    void setMeasurementType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getMeasurementType <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementType()
     * @see #getMeasurementType()
     * @see #setMeasurementType(String)
     * @generated
     */
    void unsetMeasurementType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getMeasurementType <em>Measurement Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Type</em>' attribute is set.
     * @see #unsetMeasurementType()
     * @see #getMeasurementType()
     * @see #setMeasurementType(String)
     * @generated
     */
    boolean isSetMeasurementType();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * One or more measurements may be associated with a terminal in the network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(ACDCTerminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getMeasurements
     * @model opposite="Measurements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Measurement.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ACDCTerminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( ACDCTerminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(ACDCTerminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(ACDCTerminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Unit Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit multiplier of the measured quantity.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement_UnitMultiplier()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Measurement.unitMultiplier' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitMultiplier getUnitMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @generated
     */
    void setUnitMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetUnitMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Multiplier</em>' attribute is set.
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetUnitMultiplier();

    /**
     * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The power system resource that contains the measurement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMeasurement_PowerSystemResource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getMeasurements
     * @model opposite="Measurements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Measurement.PowerSystemResource' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerSystemResource getPowerSystemResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @generated
     */
    void setPowerSystemResource( PowerSystemResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    void unsetPowerSystemResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPowerSystemResource <em>Power System Resource</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resource</em>' reference is set.
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    boolean isSetPowerSystemResource();

} // Measurement
