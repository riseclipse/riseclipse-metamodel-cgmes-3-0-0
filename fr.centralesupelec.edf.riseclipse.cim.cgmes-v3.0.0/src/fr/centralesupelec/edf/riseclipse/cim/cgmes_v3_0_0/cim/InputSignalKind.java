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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Input Signal Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of input signals.  In dynamics modelling, commonly represented by the <i>j</i> parameter.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getInputSignalKind()
 * @model
 * @generated
 */
public enum InputSignalKind implements Enumerator {
    /**
     * The '<em><b>Bus Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal <font color="#0f0f0f">is bus voltage.  This could be a terminal voltage or remote voltage.</font>
     * <!-- end-model-doc -->
     * @see #BUS_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    BUS_VOLTAGE( 1, "busVoltage", "busVoltage" ),

    /**
     * The '<em><b>Rotor Angular Frequency Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is rotor or shaft angular frequency deviation.
     * <!-- end-model-doc -->
     * @see #ROTOR_ANGULAR_FREQUENCY_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    ROTOR_ANGULAR_FREQUENCY_DEVIATION( 2, "rotorAngularFrequencyDeviation", "rotorAngularFrequencyDeviation" ),

    /**
     * The '<em><b>Generator Mechanical Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator mechanical power.
     * <!-- end-model-doc -->
     * @see #GENERATOR_MECHANICAL_POWER_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_MECHANICAL_POWER( 3, "generatorMechanicalPower", "generatorMechanicalPower" ),

    /**
     * The '<em><b>Generator Electrical Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator electrical power on rated <i>S</i>.
     * <!-- end-model-doc -->
     * @see #GENERATOR_ELECTRICAL_POWER_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_ELECTRICAL_POWER( 4, "generatorElectricalPower", "generatorElectricalPower" ),

    /**
     * The '<em><b>Bus Voltage Derivative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is derivative of bus voltag<font color="#0f0f0f">e.  This could be a terminal voltage derivative or remote voltage derivative.</font>
     * <!-- end-model-doc -->
     * @see #BUS_VOLTAGE_DERIVATIVE_VALUE
     * @generated
     * @ordered
     */
    BUS_VOLTAGE_DERIVATIVE( 5, "busVoltageDerivative", "busVoltageDerivative" ),

    /**
     * The '<em><b>Bus Frequency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is bus voltage fr<font color="#0f0f0f">equency.  This could be a terminal frequency or remote frequency.</font>
     * <!-- end-model-doc -->
     * @see #BUS_FREQUENCY_VALUE
     * @generated
     * @ordered
     */
    BUS_FREQUENCY( 6, "busFrequency", "busFrequency" ),

    /**
     * The '<em><b>Generator Accelerating Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator accelerating power.
     * <!-- end-model-doc -->
     * @see #GENERATOR_ACCELERATING_POWER_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_ACCELERATING_POWER( 7, "generatorAcceleratingPower", "generatorAcceleratingPower" ),

    /**
     * The '<em><b>Rotor Speed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is rotor or shaft speed (angular frequency).
     * <!-- end-model-doc -->
     * @see #ROTOR_SPEED_VALUE
     * @generated
     * @ordered
     */
    ROTOR_SPEED( 8, "rotorSpeed", "rotorSpeed" ),

    /**
     * The '<em><b>Branch Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is amplitude of remote branch current.
     * <!-- end-model-doc -->
     * @see #BRANCH_CURRENT_VALUE
     * @generated
     * @ordered
     */
    BRANCH_CURRENT( 9, "branchCurrent", "branchCurrent" ),

    /**
     * The '<em><b>Bus Frequency Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is deviation of bus voltage frequ<font color="#0f0f0f">ency.  This could be a terminal frequency deviation or remote frequency deviation.</font>
     * <!-- end-model-doc -->
     * @see #BUS_FREQUENCY_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    BUS_FREQUENCY_DEVIATION( 10, "busFrequencyDeviation", "busFrequencyDeviation" ),

    /**
     * The '<em><b>Field Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator field current.
     * <!-- end-model-doc -->
     * @see #FIELD_CURRENT_VALUE
     * @generated
     * @ordered
     */
    FIELD_CURRENT( 11, "fieldCurrent", "fieldCurrent" );

    /**
     * The '<em><b>Bus Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal <font color="#0f0f0f">is bus voltage.  This could be a terminal voltage or remote voltage.</font>
     * <!-- end-model-doc -->
     * @see #BUS_VOLTAGE
     * @model name="busVoltage"
     * @generated
     * @ordered
     */
    public static final int BUS_VOLTAGE_VALUE = 1;

    /**
     * The '<em><b>Rotor Angular Frequency Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is rotor or shaft angular frequency deviation.
     * <!-- end-model-doc -->
     * @see #ROTOR_ANGULAR_FREQUENCY_DEVIATION
     * @model name="rotorAngularFrequencyDeviation"
     * @generated
     * @ordered
     */
    public static final int ROTOR_ANGULAR_FREQUENCY_DEVIATION_VALUE = 2;

    /**
     * The '<em><b>Generator Mechanical Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator mechanical power.
     * <!-- end-model-doc -->
     * @see #GENERATOR_MECHANICAL_POWER
     * @model name="generatorMechanicalPower"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_MECHANICAL_POWER_VALUE = 3;

    /**
     * The '<em><b>Generator Electrical Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator electrical power on rated <i>S</i>.
     * <!-- end-model-doc -->
     * @see #GENERATOR_ELECTRICAL_POWER
     * @model name="generatorElectricalPower"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_ELECTRICAL_POWER_VALUE = 4;

    /**
     * The '<em><b>Bus Voltage Derivative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is derivative of bus voltag<font color="#0f0f0f">e.  This could be a terminal voltage derivative or remote voltage derivative.</font>
     * <!-- end-model-doc -->
     * @see #BUS_VOLTAGE_DERIVATIVE
     * @model name="busVoltageDerivative"
     * @generated
     * @ordered
     */
    public static final int BUS_VOLTAGE_DERIVATIVE_VALUE = 5;

    /**
     * The '<em><b>Bus Frequency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is bus voltage fr<font color="#0f0f0f">equency.  This could be a terminal frequency or remote frequency.</font>
     * <!-- end-model-doc -->
     * @see #BUS_FREQUENCY
     * @model name="busFrequency"
     * @generated
     * @ordered
     */
    public static final int BUS_FREQUENCY_VALUE = 6;

    /**
     * The '<em><b>Generator Accelerating Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator accelerating power.
     * <!-- end-model-doc -->
     * @see #GENERATOR_ACCELERATING_POWER
     * @model name="generatorAcceleratingPower"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_ACCELERATING_POWER_VALUE = 7;

    /**
     * The '<em><b>Rotor Speed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is rotor or shaft speed (angular frequency).
     * <!-- end-model-doc -->
     * @see #ROTOR_SPEED
     * @model name="rotorSpeed"
     * @generated
     * @ordered
     */
    public static final int ROTOR_SPEED_VALUE = 8;

    /**
     * The '<em><b>Branch Current</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is amplitude of remote branch current.
     * <!-- end-model-doc -->
     * @see #BRANCH_CURRENT
     * @model name="branchCurrent"
     * @generated
     * @ordered
     */
    public static final int BRANCH_CURRENT_VALUE = 9;

    /**
     * The '<em><b>Bus Frequency Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is deviation of bus voltage frequ<font color="#0f0f0f">ency.  This could be a terminal frequency deviation or remote frequency deviation.</font>
     * <!-- end-model-doc -->
     * @see #BUS_FREQUENCY_DEVIATION
     * @model name="busFrequencyDeviation"
     * @generated
     * @ordered
     */
    public static final int BUS_FREQUENCY_DEVIATION_VALUE = 10;

    /**
     * The '<em><b>Field Current</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal is generator field current.
     * <!-- end-model-doc -->
     * @see #FIELD_CURRENT
     * @model name="fieldCurrent"
     * @generated
     * @ordered
     */
    public static final int FIELD_CURRENT_VALUE = 11;

    /**
     * An array of all the '<em><b>Input Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InputSignalKind[] VALUES_ARRAY = new InputSignalKind[] {
            BUS_VOLTAGE,
            ROTOR_ANGULAR_FREQUENCY_DEVIATION,
            GENERATOR_MECHANICAL_POWER,
            GENERATOR_ELECTRICAL_POWER,
            BUS_VOLTAGE_DERIVATIVE,
            BUS_FREQUENCY,
            GENERATOR_ACCELERATING_POWER,
            ROTOR_SPEED,
            BRANCH_CURRENT,
            BUS_FREQUENCY_DEVIATION,
            FIELD_CURRENT,
    };

    /**
     * A public read-only list of all the '<em><b>Input Signal Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< InputSignalKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Input Signal Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InputSignalKind get( String literal ) {
        for( InputSignalKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Input Signal Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InputSignalKind getByName( String name ) {
        for( InputSignalKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Input Signal Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InputSignalKind get( int value ) {
        switch( value ) {
        case BUS_VOLTAGE_VALUE:
            return BUS_VOLTAGE;
        case ROTOR_ANGULAR_FREQUENCY_DEVIATION_VALUE:
            return ROTOR_ANGULAR_FREQUENCY_DEVIATION;
        case GENERATOR_MECHANICAL_POWER_VALUE:
            return GENERATOR_MECHANICAL_POWER;
        case GENERATOR_ELECTRICAL_POWER_VALUE:
            return GENERATOR_ELECTRICAL_POWER;
        case BUS_VOLTAGE_DERIVATIVE_VALUE:
            return BUS_VOLTAGE_DERIVATIVE;
        case BUS_FREQUENCY_VALUE:
            return BUS_FREQUENCY;
        case GENERATOR_ACCELERATING_POWER_VALUE:
            return GENERATOR_ACCELERATING_POWER;
        case ROTOR_SPEED_VALUE:
            return ROTOR_SPEED;
        case BRANCH_CURRENT_VALUE:
            return BRANCH_CURRENT;
        case BUS_FREQUENCY_DEVIATION_VALUE:
            return BUS_FREQUENCY_DEVIATION;
        case FIELD_CURRENT_VALUE:
            return FIELD_CURRENT;
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
    private InputSignalKind( int value, String name, String literal ) {
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

} //InputSignalKind
