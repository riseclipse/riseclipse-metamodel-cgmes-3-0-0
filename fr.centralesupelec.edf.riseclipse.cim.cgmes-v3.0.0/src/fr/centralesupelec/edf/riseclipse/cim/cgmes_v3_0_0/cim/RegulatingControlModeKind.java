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
 * A representation of the literals of the enumeration '<em><b>Regulating Control Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The kind of regulation model.   For example regulating voltage, reactive power, active power, etc.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingControlModeKind()
 * @model
 * @generated
 */
public enum RegulatingControlModeKind implements Enumerator {
    /**
     * The '<em><b>Reactive Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power is specified.
     * <!-- end-model-doc -->
     * @see #REACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    REACTIVE_POWER( 1, "reactivePower", "reactivePower" ),
    /**
     * The '<em><b>Active Power</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power is specified.
     * <!-- end-model-doc -->
     * @see #ACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    ACTIVE_POWER( 2, "activePower", "activePower" ),
    /**
     * The '<em><b>Power Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor is specified.
     * <!-- end-model-doc -->
     * @see #POWER_FACTOR_VALUE
     * @generated
     * @ordered
     */
    POWER_FACTOR( 3, "powerFactor", "powerFactor" ),

    /**
     * The '<em><b>Temperature</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control switches on/off based on the local temperature (i.e., a thermostat).
     * <!-- end-model-doc -->
     * @see #TEMPERATURE_VALUE
     * @generated
     * @ordered
     */
    TEMPERATURE( 4, "temperature", "temperature" ),
    /**
     * The '<em><b>Current Flow</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current flow is specified.
     * <!-- end-model-doc -->
     * @see #CURRENT_FLOW_VALUE
     * @generated
     * @ordered
     */
    CURRENT_FLOW( 5, "currentFlow", "currentFlow" ),
    /**
     * The '<em><b>Admittance</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Admittance is specified.
     * <!-- end-model-doc -->
     * @see #ADMITTANCE_VALUE
     * @generated
     * @ordered
     */
    ADMITTANCE( 6, "admittance", "admittance" ),
    /**
     * The '<em><b>Time Scheduled</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control switches on/off by time of day. The times may change on the weekend, or in different seasons.
     * <!-- end-model-doc -->
     * @see #TIME_SCHEDULED_VALUE
     * @generated
     * @ordered
     */
    TIME_SCHEDULED( 7, "timeScheduled", "timeScheduled" ),
    /**
     * The '<em><b>Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage is specified.
     * <!-- end-model-doc -->
     * @see #VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    VOLTAGE( 8, "voltage", "voltage" );

    /**
     * The '<em><b>Reactive Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power is specified.
     * <!-- end-model-doc -->
     * @see #REACTIVE_POWER
     * @model name="reactivePower"
     * @generated
     * @ordered
     */
    public static final int REACTIVE_POWER_VALUE = 1;

    /**
     * The '<em><b>Active Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power is specified.
     * <!-- end-model-doc -->
     * @see #ACTIVE_POWER
     * @model name="activePower"
     * @generated
     * @ordered
     */
    public static final int ACTIVE_POWER_VALUE = 2;

    /**
     * The '<em><b>Power Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor is specified.
     * <!-- end-model-doc -->
     * @see #POWER_FACTOR
     * @model name="powerFactor"
     * @generated
     * @ordered
     */
    public static final int POWER_FACTOR_VALUE = 3;

    /**
     * The '<em><b>Temperature</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control switches on/off based on the local temperature (i.e., a thermostat).
     * <!-- end-model-doc -->
     * @see #TEMPERATURE
     * @model name="temperature"
     * @generated
     * @ordered
     */
    public static final int TEMPERATURE_VALUE = 4;

    /**
     * The '<em><b>Current Flow</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current flow is specified.
     * <!-- end-model-doc -->
     * @see #CURRENT_FLOW
     * @model name="currentFlow"
     * @generated
     * @ordered
     */
    public static final int CURRENT_FLOW_VALUE = 5;

    /**
     * The '<em><b>Admittance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Admittance is specified.
     * <!-- end-model-doc -->
     * @see #ADMITTANCE
     * @model name="admittance"
     * @generated
     * @ordered
     */
    public static final int ADMITTANCE_VALUE = 6;

    /**
     * The '<em><b>Time Scheduled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control switches on/off by time of day. The times may change on the weekend, or in different seasons.
     * <!-- end-model-doc -->
     * @see #TIME_SCHEDULED
     * @model name="timeScheduled"
     * @generated
     * @ordered
     */
    public static final int TIME_SCHEDULED_VALUE = 7;

    /**
     * The '<em><b>Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage is specified.
     * <!-- end-model-doc -->
     * @see #VOLTAGE
     * @model name="voltage"
     * @generated
     * @ordered
     */
    public static final int VOLTAGE_VALUE = 8;

    /**
     * An array of all the '<em><b>Regulating Control Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RegulatingControlModeKind[] VALUES_ARRAY = new RegulatingControlModeKind[] {
            REACTIVE_POWER,
            ACTIVE_POWER,
            POWER_FACTOR,
            TEMPERATURE,
            CURRENT_FLOW,
            ADMITTANCE,
            TIME_SCHEDULED,
            VOLTAGE,
    };

    /**
     * A public read-only list of all the '<em><b>Regulating Control Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< RegulatingControlModeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RegulatingControlModeKind get( String literal ) {
        for( RegulatingControlModeKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RegulatingControlModeKind getByName( String name ) {
        for( RegulatingControlModeKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RegulatingControlModeKind get( int value ) {
        switch( value ) {
        case REACTIVE_POWER_VALUE:
            return REACTIVE_POWER;
        case ACTIVE_POWER_VALUE:
            return ACTIVE_POWER;
        case POWER_FACTOR_VALUE:
            return POWER_FACTOR;
        case TEMPERATURE_VALUE:
            return TEMPERATURE;
        case CURRENT_FLOW_VALUE:
            return CURRENT_FLOW;
        case ADMITTANCE_VALUE:
            return ADMITTANCE;
        case TIME_SCHEDULED_VALUE:
            return TIME_SCHEDULED;
        case VOLTAGE_VALUE:
            return VOLTAGE;
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
    private RegulatingControlModeKind( int value, String name, String literal ) {
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

} //RegulatingControlModeKind
