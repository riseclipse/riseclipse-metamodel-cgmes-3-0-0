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
 * A representation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).
 * A power transformer may be composed of separate transformer tanks that need not be identical.
 * A power transformer can be modelled with or without tanks and is intended for use in both balanced and unbalanced representations.   A power transformer typically has two terminals, but may have one (grounding), three or more terminals.
 * The inherited association ConductingEquipment.BaseVoltage should not be used.  The association from TransformerEnd to BaseVoltage should be used instead.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer()
 * @model
 * @generated
 */
public interface PowerTransformer extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Power Transformer End</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ends of this power transformer.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power Transformer End</em>' reference list.
     * @see #isSetPowerTransformerEnd()
     * @see #unsetPowerTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_PowerTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd#getPowerTransformer
     * @model opposite="PowerTransformer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.PowerTransformerEnd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< PowerTransformerEnd > getPowerTransformerEnd();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerTransformerEnd()
     * @see #getPowerTransformerEnd()
     * @generated
     */
    void unsetPowerTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Transformer End</em>' reference list is set.
     * @see #unsetPowerTransformerEnd()
     * @see #getPowerTransformerEnd()
     * @generated
     */
    boolean isSetPowerTransformerEnd();

    /**
     * Returns the value of the '<em><b>Before Sh Circuit Highest Operating Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The highest operating voltage (Ub in IEC 60909-0) before short circuit. It is used for calculation of the impedance correction factor KT defined in IEC 60909-0. This is worst case voltage on the low side winding (3.7.1 of IEC 60909:2001). Used to define operating conditions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingVoltage()
     * @see #unsetBeforeShCircuitHighestOperatingVoltage()
     * @see #setBeforeShCircuitHighestOperatingVoltage(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_BeforeShCircuitHighestOperatingVoltage()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.beforeShCircuitHighestOperatingVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBeforeShCircuitHighestOperatingVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingVoltage()
     * @see #unsetBeforeShCircuitHighestOperatingVoltage()
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @generated
     */
    void setBeforeShCircuitHighestOperatingVoltage( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBeforeShCircuitHighestOperatingVoltage()
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @see #setBeforeShCircuitHighestOperatingVoltage(Double)
     * @generated
     */
    void unsetBeforeShCircuitHighestOperatingVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Before Sh Circuit Highest Operating Voltage</em>' attribute is set.
     * @see #unsetBeforeShCircuitHighestOperatingVoltage()
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @see #setBeforeShCircuitHighestOperatingVoltage(Double)
     * @generated
     */
    boolean isSetBeforeShCircuitHighestOperatingVoltage();

    /**
     * Returns the value of the '<em><b>High Side Min Operating U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum operating voltage (uQmin in IEC 60909-0) at the high voltage side (Q side) of the unit transformer of the power station unit. A value well established from long-term operating experience of the system. It is used for calculation of the impedance correction factor KG defined in IEC 60909-0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>High Side Min Operating U</em>' attribute.
     * @see #isSetHighSideMinOperatingU()
     * @see #unsetHighSideMinOperatingU()
     * @see #setHighSideMinOperatingU(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_HighSideMinOperatingU()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.highSideMinOperatingU' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHighSideMinOperatingU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Side Min Operating U</em>' attribute.
     * @see #isSetHighSideMinOperatingU()
     * @see #unsetHighSideMinOperatingU()
     * @see #getHighSideMinOperatingU()
     * @generated
     */
    void setHighSideMinOperatingU( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighSideMinOperatingU()
     * @see #getHighSideMinOperatingU()
     * @see #setHighSideMinOperatingU(Double)
     * @generated
     */
    void unsetHighSideMinOperatingU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getHighSideMinOperatingU <em>High Side Min Operating U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Side Min Operating U</em>' attribute is set.
     * @see #unsetHighSideMinOperatingU()
     * @see #getHighSideMinOperatingU()
     * @see #setHighSideMinOperatingU(Double)
     * @generated
     */
    boolean isSetHighSideMinOperatingU();

    /**
     * Returns the value of the '<em><b>Is Part Of Generator Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether the machine is part of a power station unit. Used for short circuit data exchange according to IEC 60909.  It has an impact on how the correction factors are calculated for transformers, since the transformer is not necessarily part of a synchronous machine and generating unit. It is not always possible to derive this information from the model. This is why the attribute is necessary.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Part Of Generator Unit</em>' attribute.
     * @see #isSetIsPartOfGeneratorUnit()
     * @see #unsetIsPartOfGeneratorUnit()
     * @see #setIsPartOfGeneratorUnit(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_IsPartOfGeneratorUnit()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.isPartOfGeneratorUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getIsPartOfGeneratorUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Part Of Generator Unit</em>' attribute.
     * @see #isSetIsPartOfGeneratorUnit()
     * @see #unsetIsPartOfGeneratorUnit()
     * @see #getIsPartOfGeneratorUnit()
     * @generated
     */
    void setIsPartOfGeneratorUnit( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPartOfGeneratorUnit()
     * @see #getIsPartOfGeneratorUnit()
     * @see #setIsPartOfGeneratorUnit(Boolean)
     * @generated
     */
    void unsetIsPartOfGeneratorUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Part Of Generator Unit</em>' attribute is set.
     * @see #unsetIsPartOfGeneratorUnit()
     * @see #getIsPartOfGeneratorUnit()
     * @see #setIsPartOfGeneratorUnit(Boolean)
     * @generated
     */
    boolean isSetIsPartOfGeneratorUnit();

    /**
     * Returns the value of the '<em><b>Before Sh Circuit Highest Operating Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The highest operating current (Ib in IEC 60909-0) before short circuit (depends on network configuration and relevant reliability philosophy). It is used for calculation of the impedance correction factor KT defined in IEC 60909-0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingCurrent()
     * @see #unsetBeforeShCircuitHighestOperatingCurrent()
     * @see #setBeforeShCircuitHighestOperatingCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_BeforeShCircuitHighestOperatingCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.beforeShCircuitHighestOperatingCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBeforeShCircuitHighestOperatingCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute.
     * @see #isSetBeforeShCircuitHighestOperatingCurrent()
     * @see #unsetBeforeShCircuitHighestOperatingCurrent()
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @generated
     */
    void setBeforeShCircuitHighestOperatingCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBeforeShCircuitHighestOperatingCurrent()
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @see #setBeforeShCircuitHighestOperatingCurrent(Double)
     * @generated
     */
    void unsetBeforeShCircuitHighestOperatingCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Before Sh Circuit Highest Operating Current</em>' attribute is set.
     * @see #unsetBeforeShCircuitHighestOperatingCurrent()
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @see #setBeforeShCircuitHighestOperatingCurrent(Double)
     * @generated
     */
    boolean isSetBeforeShCircuitHighestOperatingCurrent();

    /**
     * Returns the value of the '<em><b>Operational Values Considered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * It is used to define if the data (other attributes related to short circuit data exchange) defines long term operational conditions or not. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Values Considered</em>' attribute.
     * @see #isSetOperationalValuesConsidered()
     * @see #unsetOperationalValuesConsidered()
     * @see #setOperationalValuesConsidered(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_OperationalValuesConsidered()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.operationalValuesConsidered' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOperationalValuesConsidered();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operational Values Considered</em>' attribute.
     * @see #isSetOperationalValuesConsidered()
     * @see #unsetOperationalValuesConsidered()
     * @see #getOperationalValuesConsidered()
     * @generated
     */
    void setOperationalValuesConsidered( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalValuesConsidered()
     * @see #getOperationalValuesConsidered()
     * @see #setOperationalValuesConsidered(Boolean)
     * @generated
     */
    void unsetOperationalValuesConsidered();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getOperationalValuesConsidered <em>Operational Values Considered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Values Considered</em>' attribute is set.
     * @see #unsetOperationalValuesConsidered()
     * @see #getOperationalValuesConsidered()
     * @see #setOperationalValuesConsidered(Boolean)
     * @generated
     */
    boolean isSetOperationalValuesConsidered();

    /**
     * Returns the value of the '<em><b>Before Short Circuit Angle Pf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The angle of power factor before short circuit (phib in IEC 60909-0). It is used for calculation of the impedance correction factor KT defined in IEC 60909-0. This is the worst case power factor. Used to define operating conditions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Before Short Circuit Angle Pf</em>' attribute.
     * @see #isSetBeforeShortCircuitAnglePf()
     * @see #unsetBeforeShortCircuitAnglePf()
     * @see #setBeforeShortCircuitAnglePf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerTransformer_BeforeShortCircuitAnglePf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='PowerTransformer.beforeShortCircuitAnglePf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBeforeShortCircuitAnglePf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Before Short Circuit Angle Pf</em>' attribute.
     * @see #isSetBeforeShortCircuitAnglePf()
     * @see #unsetBeforeShortCircuitAnglePf()
     * @see #getBeforeShortCircuitAnglePf()
     * @generated
     */
    void setBeforeShortCircuitAnglePf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBeforeShortCircuitAnglePf()
     * @see #getBeforeShortCircuitAnglePf()
     * @see #setBeforeShortCircuitAnglePf(Double)
     * @generated
     */
    void unsetBeforeShortCircuitAnglePf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Before Short Circuit Angle Pf</em>' attribute is set.
     * @see #unsetBeforeShortCircuitAnglePf()
     * @see #getBeforeShortCircuitAnglePf()
     * @see #setBeforeShortCircuitAnglePf(Double)
     * @generated
     */
    boolean isSetBeforeShortCircuitAnglePf();

} // PowerTransformer
