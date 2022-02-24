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
 * A representation of the literals of the enumeration '<em><b>Synchronous Machine Operating Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Synchronous machine operating mode.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineOperatingMode()
 * @model
 * @generated
 */
public enum SynchronousMachineOperatingMode implements Enumerator {
    /**
     * The '<em><b>Motor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operating as motor.
     * <!-- end-model-doc -->
     * @see #MOTOR_VALUE
     * @generated
     * @ordered
     */
    MOTOR( 1, "motor", "motor" ),

    /**
     * The '<em><b>Generator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operating as generator.
     * <!-- end-model-doc -->
     * @see #GENERATOR_VALUE
     * @generated
     * @ordered
     */
    GENERATOR( 2, "generator", "generator" ),

    /**
     * The '<em><b>Condenser</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operating as condenser.
     * <!-- end-model-doc -->
     * @see #CONDENSER_VALUE
     * @generated
     * @ordered
     */
    CONDENSER( 3, "condenser", "condenser" );

    /**
     * The '<em><b>Motor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operating as motor.
     * <!-- end-model-doc -->
     * @see #MOTOR
     * @model name="motor"
     * @generated
     * @ordered
     */
    public static final int MOTOR_VALUE = 1;

    /**
     * The '<em><b>Generator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operating as generator.
     * <!-- end-model-doc -->
     * @see #GENERATOR
     * @model name="generator"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_VALUE = 2;

    /**
     * The '<em><b>Condenser</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Operating as condenser.
     * <!-- end-model-doc -->
     * @see #CONDENSER
     * @model name="condenser"
     * @generated
     * @ordered
     */
    public static final int CONDENSER_VALUE = 3;

    /**
     * An array of all the '<em><b>Synchronous Machine Operating Mode</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SynchronousMachineOperatingMode[] VALUES_ARRAY = new SynchronousMachineOperatingMode[] {
            MOTOR,
            GENERATOR,
            CONDENSER,
    };

    /**
     * A public read-only list of all the '<em><b>Synchronous Machine Operating Mode</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< SynchronousMachineOperatingMode > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Synchronous Machine Operating Mode</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineOperatingMode get( String literal ) {
        for( SynchronousMachineOperatingMode result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Synchronous Machine Operating Mode</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineOperatingMode getByName( String name ) {
        for( SynchronousMachineOperatingMode result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Synchronous Machine Operating Mode</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineOperatingMode get( int value ) {
        switch( value ) {
        case MOTOR_VALUE:
            return MOTOR;
        case GENERATOR_VALUE:
            return GENERATOR;
        case CONDENSER_VALUE:
            return CONDENSER;
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
    private SynchronousMachineOperatingMode( int value, String name, String literal ) {
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

} //SynchronousMachineOperatingMode
