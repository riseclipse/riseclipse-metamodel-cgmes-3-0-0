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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Limit Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Limit kinds.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getLimitKind()
 * @model
 * @generated
 */
public enum LimitKind implements Enumerator {
    /**
     * The '<em><b>Tatl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temporarily Admissible Transmission Loading (TATL) which is the loading in amperes, MVA or MW that can be accepted by a branch for a certain limited duration.
     * The TATL can be defined in different ways:
     * <ul>
     * 	<li>as a fixed percentage of the PATL for a given time (for example, 115% of the PATL that can be accepted during 15 minutes),</li>
     * </ul>
     * <ul>
     * 	<li>pairs of TATL type and Duration calculated for each line taking into account its particular configuration and conditions of functioning (for example, it can define a TATL acceptable during 20 minutes and another one acceptable during 10 minutes).</li>
     * </ul>
     * Such a definition of TATL can depend on the initial operating conditions of the network element (sag situation of a line).
     * The duration attribute can be used to define several TATL limit types. Hence multiple TATL limit values may exist having different durations.
     * <!-- end-model-doc -->
     * @see #TATL_VALUE
     * @generated
     * @ordered
     */
    TATL( 1, "tatl", "tatl" ),
    /**
     * The '<em><b>Warning Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage warning.
     * <!-- end-model-doc -->
     * @see #WARNING_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    WARNING_VOLTAGE( 2, "warningVoltage", "warningVoltage" ),

    /**
     * The '<em><b>Patl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Permanent Admissible Transmission Loading (PATL) is the loading in amperes, MVA or MW that can be accepted by a network branch for an unlimited duration without any risk for the material.
     * The OperationnalLimitType.isInfiniteDuration is set to true. There shall be only one OperationalLimitType of kind PATL per OperationalLimitSet if the PATL is ApparentPowerLimit, ActivePowerLimit, or CurrentLimit for a given Terminal or Equipment.
     * <!-- end-model-doc -->
     * @see #PATL_VALUE
     * @generated
     * @ordered
     */
    PATL( 3, "patl", "patl" ),
    /**
     * The '<em><b>Tc</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tripping Current (TC) is the ultimate intensity without any delay. It is defined as the threshold the line will trip without any possible remedial actions.
     * The tripping of the network element is ordered by protections against short circuits or by overload protections, but in any case, the activation delay of these protections is not compatible with the reaction delay of an operator (less than one minute).
     * The duration is always zero if the OperationalLimitType.acceptableDuration is exchanged. Only one limit value exists for the TC type.
     * <!-- end-model-doc -->
     * @see #TC_VALUE
     * @generated
     * @ordered
     */
    TC( 4, "tc", "tc" ),
    /**
     * The '<em><b>Tct</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tripping Current Threshold  (TCT) is a value in engineering units defined for TC and calculated using a percentage less than 100 % of the TC type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
     * <!-- end-model-doc -->
     * @see #TCT_VALUE
     * @generated
     * @ordered
     */
    TCT( 5, "tct", "tct" ),
    /**
     * The '<em><b>Operational Voltage Limit</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operational voltage limit.
     * <!-- end-model-doc -->
     * @see #OPERATIONAL_VOLTAGE_LIMIT_VALUE
     * @generated
     * @ordered
     */
    OPERATIONAL_VOLTAGE_LIMIT( 6, "operationalVoltageLimit", "operationalVoltageLimit" ),
    /**
     * The '<em><b>Alarm Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage alarm.
     * <!-- end-model-doc -->
     * @see #ALARM_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    ALARM_VOLTAGE( 7, "alarmVoltage", "alarmVoltage" ),
    /**
     * The '<em><b>Low Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A too low voltage can disturb the normal operation of some protections and transformer equipped with on-load tap changers, electronic power devices or can affect the behaviour of the auxiliaries of generation units.
     * This limit type may or may not have duration.
     * <!-- end-model-doc -->
     * @see #LOW_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    LOW_VOLTAGE( 8, "lowVoltage", "lowVoltage" ),
    /**
     * The '<em><b>High Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Referring to the rating of the equipments, a voltage too high can lead to accelerated ageing or the destruction of the equipment.
     * This limit type may or may not have duration.
     * <!-- end-model-doc -->
     * @see #HIGH_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    HIGH_VOLTAGE( 9, "highVoltage", "highVoltage" ),
    /**
     * The '<em><b>Patlt</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent Admissible Transmission Loading Threshold  (PATLT) is a value in engineering units defined for PATL and calculated using a percentage less than 100 % of the PATL type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
     * <!-- end-model-doc -->
     * @see #PATLT_VALUE
     * @generated
     * @ordered
     */
    PATLT( 10, "patlt", "patlt" ),
    /**
     * The '<em><b>Stability</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stability.
     * <!-- end-model-doc -->
     * @see #STABILITY_VALUE
     * @generated
     * @ordered
     */
    STABILITY( 11, "stability", "stability" );

    /**
     * The '<em><b>Tatl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temporarily Admissible Transmission Loading (TATL) which is the loading in amperes, MVA or MW that can be accepted by a branch for a certain limited duration.
     * The TATL can be defined in different ways:
     * <ul>
     * 	<li>as a fixed percentage of the PATL for a given time (for example, 115% of the PATL that can be accepted during 15 minutes),</li>
     * </ul>
     * <ul>
     * 	<li>pairs of TATL type and Duration calculated for each line taking into account its particular configuration and conditions of functioning (for example, it can define a TATL acceptable during 20 minutes and another one acceptable during 10 minutes).</li>
     * </ul>
     * Such a definition of TATL can depend on the initial operating conditions of the network element (sag situation of a line).
     * The duration attribute can be used to define several TATL limit types. Hence multiple TATL limit values may exist having different durations.
     * <!-- end-model-doc -->
     * @see #TATL
     * @model name="tatl"
     * @generated
     * @ordered
     */
    public static final int TATL_VALUE = 1;

    /**
     * The '<em><b>Warning Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage warning.
     * <!-- end-model-doc -->
     * @see #WARNING_VOLTAGE
     * @model name="warningVoltage"
     * @generated
     * @ordered
     */
    public static final int WARNING_VOLTAGE_VALUE = 2;

    /**
     * The '<em><b>Patl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Permanent Admissible Transmission Loading (PATL) is the loading in amperes, MVA or MW that can be accepted by a network branch for an unlimited duration without any risk for the material.
     * The OperationnalLimitType.isInfiniteDuration is set to true. There shall be only one OperationalLimitType of kind PATL per OperationalLimitSet if the PATL is ApparentPowerLimit, ActivePowerLimit, or CurrentLimit for a given Terminal or Equipment.
     * <!-- end-model-doc -->
     * @see #PATL
     * @model name="patl"
     * @generated
     * @ordered
     */
    public static final int PATL_VALUE = 3;

    /**
     * The '<em><b>Tc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tripping Current (TC) is the ultimate intensity without any delay. It is defined as the threshold the line will trip without any possible remedial actions.
     * The tripping of the network element is ordered by protections against short circuits or by overload protections, but in any case, the activation delay of these protections is not compatible with the reaction delay of an operator (less than one minute).
     * The duration is always zero if the OperationalLimitType.acceptableDuration is exchanged. Only one limit value exists for the TC type.
     * <!-- end-model-doc -->
     * @see #TC
     * @model name="tc"
     * @generated
     * @ordered
     */
    public static final int TC_VALUE = 4;

    /**
     * The '<em><b>Tct</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tripping Current Threshold  (TCT) is a value in engineering units defined for TC and calculated using a percentage less than 100 % of the TC type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
     * <!-- end-model-doc -->
     * @see #TCT
     * @model name="tct"
     * @generated
     * @ordered
     */
    public static final int TCT_VALUE = 5;

    /**
     * The '<em><b>Operational Voltage Limit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operational voltage limit.
     * <!-- end-model-doc -->
     * @see #OPERATIONAL_VOLTAGE_LIMIT
     * @model name="operationalVoltageLimit"
     * @generated
     * @ordered
     */
    public static final int OPERATIONAL_VOLTAGE_LIMIT_VALUE = 6;

    /**
     * The '<em><b>Alarm Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage alarm.
     * <!-- end-model-doc -->
     * @see #ALARM_VOLTAGE
     * @model name="alarmVoltage"
     * @generated
     * @ordered
     */
    public static final int ALARM_VOLTAGE_VALUE = 7;

    /**
     * The '<em><b>Low Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A too low voltage can disturb the normal operation of some protections and transformer equipped with on-load tap changers, electronic power devices or can affect the behaviour of the auxiliaries of generation units.
     * This limit type may or may not have duration.
     * <!-- end-model-doc -->
     * @see #LOW_VOLTAGE
     * @model name="lowVoltage"
     * @generated
     * @ordered
     */
    public static final int LOW_VOLTAGE_VALUE = 8;

    /**
     * The '<em><b>High Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Referring to the rating of the equipments, a voltage too high can lead to accelerated ageing or the destruction of the equipment.
     * This limit type may or may not have duration.
     * <!-- end-model-doc -->
     * @see #HIGH_VOLTAGE
     * @model name="highVoltage"
     * @generated
     * @ordered
     */
    public static final int HIGH_VOLTAGE_VALUE = 9;

    /**
     * The '<em><b>Patlt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent Admissible Transmission Loading Threshold  (PATLT) is a value in engineering units defined for PATL and calculated using a percentage less than 100 % of the PATL type intended to alert operators of an arising condition. The percentage should be given in the name of the OperationalLimitSet. The aceptableDuration is another way to express the severity of the limit.
     * <!-- end-model-doc -->
     * @see #PATLT
     * @model name="patlt"
     * @generated
     * @ordered
     */
    public static final int PATLT_VALUE = 10;

    /**
     * The '<em><b>Stability</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stability.
     * <!-- end-model-doc -->
     * @see #STABILITY
     * @model name="stability"
     * @generated
     * @ordered
     */
    public static final int STABILITY_VALUE = 11;

    /**
     * An array of all the '<em><b>Limit Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final LimitKind[] VALUES_ARRAY = new LimitKind[] {
            TATL,
            WARNING_VOLTAGE,
            PATL,
            TC,
            TCT,
            OPERATIONAL_VOLTAGE_LIMIT,
            ALARM_VOLTAGE,
            LOW_VOLTAGE,
            HIGH_VOLTAGE,
            PATLT,
            STABILITY,
    };

    /**
     * A public read-only list of all the '<em><b>Limit Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< LimitKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Limit Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LimitKind get( String literal ) {
        for( LimitKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Limit Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LimitKind getByName( String name ) {
        for( LimitKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Limit Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LimitKind get( int value ) {
        switch( value ) {
        case TATL_VALUE:
            return TATL;
        case WARNING_VOLTAGE_VALUE:
            return WARNING_VOLTAGE;
        case PATL_VALUE:
            return PATL;
        case TC_VALUE:
            return TC;
        case TCT_VALUE:
            return TCT;
        case OPERATIONAL_VOLTAGE_LIMIT_VALUE:
            return OPERATIONAL_VOLTAGE_LIMIT;
        case ALARM_VOLTAGE_VALUE:
            return ALARM_VOLTAGE;
        case LOW_VOLTAGE_VALUE:
            return LOW_VOLTAGE;
        case HIGH_VOLTAGE_VALUE:
            return HIGH_VOLTAGE;
        case PATLT_VALUE:
            return PATLT;
        case STABILITY_VALUE:
            return STABILITY;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private LimitKind( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //LimitKind
