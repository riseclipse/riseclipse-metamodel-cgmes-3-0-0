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
 * A representation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.
 * Remote bus voltage control is possible by specifying the controlled terminal located at some place remote from the controlling equipment.
 * The specified terminal shall be associated with the connectivity node of the controlled point.  The most specific subtype of RegulatingControl shall be used in case such equipment participate in the control, e.g. TapChangerControl for tap changers.
 * For flow control, load sign convention is used, i.e. positive sign means flow out from a TopologicalNode (bus) into the conducting equipment.
 * The attribute minAllowedTargetValue and maxAllowedTargetValue are required in the following cases:
 * - For a power generating module operated in power factor control mode to specify maximum and minimum power factor values;
 * - Whenever it is necessary to have an off center target voltage for the tap changer regulator. For instance, due to long cables to off shore wind farms and the need to have a simpler setup at the off shore transformer platform, the voltage is controlled from the land at the connection point for the off shore wind farm. Since there usually is a voltage rise along the cable, there is typical and overvoltage of up 3-4 kV compared to the on shore station. Thus in normal operation the tap changer on the on shore station is operated with a target set point, which is in the lower parts of the dead band.
 * The attributes minAllowedTargetValue and maxAllowedTargetValue are not related to the attribute targetDeadband and thus they are not treated as an alternative of the targetDeadband. They are needed due to limitations in the local substation controller. The attribute targetDeadband is used to prevent the power flow from move the tap position in circles (hunting) that is to be used regardless of the attributes minAllowedTargetValue and maxAllowedTargetValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMaxAllowedTargetValue <em>Max Allowed Target Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMinAllowedTargetValue <em>Min Allowed Target Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl()
 * @model
 * @generated
 */
public interface RegulatingControl extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The equipment that participates in this regulating control scheme.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulating Cond Eq</em>' reference list.
     * @see #isSetRegulatingCondEq()
     * @see #unsetRegulatingCondEq()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_RegulatingCondEq()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getRegulatingControl
     * @model opposite="RegulatingControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.RegulatingCondEq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RegulatingCondEq > getRegulatingCondEq();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingCondEq()
     * @see #getRegulatingCondEq()
     * @generated
     */
    void unsetRegulatingCondEq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Cond Eq</em>' reference list is set.
     * @see #unsetRegulatingCondEq()
     * @see #getRegulatingCondEq()
     * @generated
     */
    boolean isSetRegulatingCondEq();

    /**
     * Returns the value of the '<em><b>Discrete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The regulation is performed in a discrete mode. This applies to equipment with discrete controls, e.g. tap changers and shunt compensators.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discrete</em>' attribute.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #setDiscrete(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_Discrete()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.discrete' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getDiscrete();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getDiscrete <em>Discrete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discrete</em>' attribute.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @generated
     */
    void setDiscrete( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getDiscrete <em>Discrete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Boolean)
     * @generated
     */
    void unsetDiscrete();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getDiscrete <em>Discrete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete</em>' attribute is set.
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Boolean)
     * @generated
     */
    boolean isSetDiscrete();

    /**
     * Returns the value of the '<em><b>Target Deadband</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is a deadband used with discrete control to avoid excessive update of controls like tap changers and shunt compensator banks while regulating.  The units of those appropriate for the mode. The attribute shall be a positive value or zero. If RegulatingControl.discrete is set to "false", the RegulatingControl.targetDeadband is to be ignored.
     * Note that for instance, if the targetValue is 100 kV and the targetDeadband is 2 kV the range is from 99 to 101 kV.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Deadband</em>' attribute.
     * @see #isSetTargetDeadband()
     * @see #unsetTargetDeadband()
     * @see #setTargetDeadband(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_TargetDeadband()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.targetDeadband' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetDeadband();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Deadband</em>' attribute.
     * @see #isSetTargetDeadband()
     * @see #unsetTargetDeadband()
     * @see #getTargetDeadband()
     * @generated
     */
    void setTargetDeadband( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetDeadband()
     * @see #getTargetDeadband()
     * @see #setTargetDeadband(Double)
     * @generated
     */
    void unsetTargetDeadband();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Deadband</em>' attribute is set.
     * @see #unsetTargetDeadband()
     * @see #getTargetDeadband()
     * @see #setTargetDeadband(Double)
     * @generated
     */
    boolean isSetTargetDeadband();

    /**
     * Returns the value of the '<em><b>Max Allowed Target Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum allowed target value (RegulatingControl.targetValue).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Allowed Target Value</em>' attribute.
     * @see #isSetMaxAllowedTargetValue()
     * @see #unsetMaxAllowedTargetValue()
     * @see #setMaxAllowedTargetValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_MaxAllowedTargetValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.maxAllowedTargetValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxAllowedTargetValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMaxAllowedTargetValue <em>Max Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Allowed Target Value</em>' attribute.
     * @see #isSetMaxAllowedTargetValue()
     * @see #unsetMaxAllowedTargetValue()
     * @see #getMaxAllowedTargetValue()
     * @generated
     */
    void setMaxAllowedTargetValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMaxAllowedTargetValue <em>Max Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxAllowedTargetValue()
     * @see #getMaxAllowedTargetValue()
     * @see #setMaxAllowedTargetValue(Double)
     * @generated
     */
    void unsetMaxAllowedTargetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMaxAllowedTargetValue <em>Max Allowed Target Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Allowed Target Value</em>' attribute is set.
     * @see #unsetMaxAllowedTargetValue()
     * @see #getMaxAllowedTargetValue()
     * @see #setMaxAllowedTargetValue(Double)
     * @generated
     */
    boolean isSetMaxAllowedTargetValue();

    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The flag tells if regulation is enabled.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #setEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_Enabled()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.enabled' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @generated
     */
    void setEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    void unsetEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getEnabled <em>Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enabled</em>' attribute is set.
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    boolean isSetEnabled();

    /**
     * Returns the value of the '<em><b>Target Value Unit Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specify the multiplier for used for the targetValue.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Value Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier
     * @see #isSetTargetValueUnitMultiplier()
     * @see #unsetTargetValueUnitMultiplier()
     * @see #setTargetValueUnitMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_TargetValueUnitMultiplier()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.targetValueUnitMultiplier' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitMultiplier getTargetValueUnitMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Value Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier
     * @see #isSetTargetValueUnitMultiplier()
     * @see #unsetTargetValueUnitMultiplier()
     * @see #getTargetValueUnitMultiplier()
     * @generated
     */
    void setTargetValueUnitMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetValueUnitMultiplier()
     * @see #getTargetValueUnitMultiplier()
     * @see #setTargetValueUnitMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetTargetValueUnitMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Value Unit Multiplier</em>' attribute is set.
     * @see #unsetTargetValueUnitMultiplier()
     * @see #getTargetValueUnitMultiplier()
     * @see #setTargetValueUnitMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetTargetValueUnitMultiplier();

    /**
     * Returns the value of the '<em><b>Min Allowed Target Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum allowed target value (RegulatingControl.targetValue).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Allowed Target Value</em>' attribute.
     * @see #isSetMinAllowedTargetValue()
     * @see #unsetMinAllowedTargetValue()
     * @see #setMinAllowedTargetValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_MinAllowedTargetValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.minAllowedTargetValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinAllowedTargetValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMinAllowedTargetValue <em>Min Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Allowed Target Value</em>' attribute.
     * @see #isSetMinAllowedTargetValue()
     * @see #unsetMinAllowedTargetValue()
     * @see #getMinAllowedTargetValue()
     * @generated
     */
    void setMinAllowedTargetValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMinAllowedTargetValue <em>Min Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinAllowedTargetValue()
     * @see #getMinAllowedTargetValue()
     * @see #setMinAllowedTargetValue(Double)
     * @generated
     */
    void unsetMinAllowedTargetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMinAllowedTargetValue <em>Min Allowed Target Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Allowed Target Value</em>' attribute is set.
     * @see #unsetMinAllowedTargetValue()
     * @see #getMinAllowedTargetValue()
     * @see #setMinAllowedTargetValue(Double)
     * @generated
     */
    boolean isSetMinAllowedTargetValue();

    /**
     * Returns the value of the '<em><b>Target Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The target value specified for case input.   This value can be used for the target value without the use of schedules. The value has the units appropriate to the mode attribute.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Value</em>' attribute.
     * @see #isSetTargetValue()
     * @see #unsetTargetValue()
     * @see #setTargetValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_TargetValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.targetValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Value</em>' attribute.
     * @see #isSetTargetValue()
     * @see #unsetTargetValue()
     * @see #getTargetValue()
     * @generated
     */
    void setTargetValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetValue()
     * @see #getTargetValue()
     * @see #setTargetValue(Double)
     * @generated
     */
    void unsetTargetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Value</em>' attribute is set.
     * @see #unsetTargetValue()
     * @see #getTargetValue()
     * @see #setTargetValue(Double)
     * @generated
     */
    boolean isSetTargetValue();

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControlModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The regulating control mode presently available.  This specification allows for determining the kind of regulation without need for obtaining the units from a schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControlModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #setMode(RegulatingControlModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_Mode()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.mode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RegulatingControlModeKind getMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControlModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #getMode()
     * @generated
     */
    void setMode( RegulatingControlModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMode()
     * @see #getMode()
     * @see #setMode(RegulatingControlModeKind)
     * @generated
     */
    void unsetMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getMode <em>Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mode</em>' attribute is set.
     * @see #unsetMode()
     * @see #getMode()
     * @see #setMode(RegulatingControlModeKind)
     * @generated
     */
    boolean isSetMode();

    /**
     * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Schedule for this regulating control.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulation Schedule</em>' reference list.
     * @see #isSetRegulationSchedule()
     * @see #unsetRegulationSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_RegulationSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule#getRegulatingControl
     * @model opposite="RegulatingControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.RegulationSchedule' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RegulationSchedule > getRegulationSchedule();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @generated
     */
    void unsetRegulationSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulation Schedule</em>' reference list is set.
     * @see #unsetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @generated
     */
    boolean isSetRegulationSchedule();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The terminal associated with this regulating control.  The terminal is associated instead of a node, since the terminal could connect into either a topological node or a connectivity node.  Sometimes it is useful to model regulation at a terminal of a bus bar object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControl_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getRegulatingControl
     * @model opposite="RegulatingControl" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RegulatingControl.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

} // RegulatingControl
