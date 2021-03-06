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
 * A representation of the literals of the enumeration '<em><b>Synchronous Machine Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Synchronous machine type.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineKind()
 * @model
 * @generated
 */
public enum SynchronousMachineKind implements Enumerator {
    /**
     * The '<em><b>Generator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator.
     * <!-- end-model-doc -->
     * @see #GENERATOR_VALUE
     * @generated
     * @ordered
     */
    GENERATOR( 1, "generator", "generator" ),

    /**
     * The '<em><b>Generator Or Condenser</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator or as a condenser.
     * <!-- end-model-doc -->
     * @see #GENERATOR_OR_CONDENSER_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_OR_CONDENSER( 2, "generatorOrCondenser", "generatorOrCondenser" ),

    /**
     * The '<em><b>Generator Or Motor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator or as a motor.
     * <!-- end-model-doc -->
     * @see #GENERATOR_OR_MOTOR_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_OR_MOTOR( 3, "generatorOrMotor", "generatorOrMotor" ),
    /**
     * The '<em><b>Motor</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a motor.
     * <!-- end-model-doc -->
     * @see #MOTOR_VALUE
     * @generated
     * @ordered
     */
    MOTOR( 4, "motor", "motor" ),
    /**
     * The '<em><b>Motor Or Condenser</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a motor or as a condenser.
     * <!-- end-model-doc -->
     * @see #MOTOR_OR_CONDENSER_VALUE
     * @generated
     * @ordered
     */
    MOTOR_OR_CONDENSER( 5, "motorOrCondenser", "motorOrCondenser" ),
    /**
     * The '<em><b>Condenser</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a condenser.
     * <!-- end-model-doc -->
     * @see #CONDENSER_VALUE
     * @generated
     * @ordered
     */
    CONDENSER( 6, "condenser", "condenser" ),

    /**
     * The '<em><b>Generator Or Condenser Or Motor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator or as a condenser or as a motor.
     * <!-- end-model-doc -->
     * @see #GENERATOR_OR_CONDENSER_OR_MOTOR_VALUE
     * @generated
     * @ordered
     */
    GENERATOR_OR_CONDENSER_OR_MOTOR( 7, "generatorOrCondenserOrMotor", "generatorOrCondenserOrMotor" );

    /**
     * The '<em><b>Generator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator.
     * <!-- end-model-doc -->
     * @see #GENERATOR
     * @model name="generator"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_VALUE = 1;

    /**
     * The '<em><b>Generator Or Condenser</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator or as a condenser.
     * <!-- end-model-doc -->
     * @see #GENERATOR_OR_CONDENSER
     * @model name="generatorOrCondenser"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_OR_CONDENSER_VALUE = 2;

    /**
     * The '<em><b>Generator Or Motor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator or as a motor.
     * <!-- end-model-doc -->
     * @see #GENERATOR_OR_MOTOR
     * @model name="generatorOrMotor"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_OR_MOTOR_VALUE = 3;

    /**
     * The '<em><b>Motor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a motor.
     * <!-- end-model-doc -->
     * @see #MOTOR
     * @model name="motor"
     * @generated
     * @ordered
     */
    public static final int MOTOR_VALUE = 4;

    /**
     * The '<em><b>Motor Or Condenser</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a motor or as a condenser.
     * <!-- end-model-doc -->
     * @see #MOTOR_OR_CONDENSER
     * @model name="motorOrCondenser"
     * @generated
     * @ordered
     */
    public static final int MOTOR_OR_CONDENSER_VALUE = 5;

    /**
     * The '<em><b>Condenser</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a condenser.
     * <!-- end-model-doc -->
     * @see #CONDENSER
     * @model name="condenser"
     * @generated
     * @ordered
     */
    public static final int CONDENSER_VALUE = 6;

    /**
     * The '<em><b>Generator Or Condenser Or Motor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the synchronous machine can operate as a generator or as a condenser or as a motor.
     * <!-- end-model-doc -->
     * @see #GENERATOR_OR_CONDENSER_OR_MOTOR
     * @model name="generatorOrCondenserOrMotor"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_OR_CONDENSER_OR_MOTOR_VALUE = 7;

    /**
     * An array of all the '<em><b>Synchronous Machine Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SynchronousMachineKind[] VALUES_ARRAY = new SynchronousMachineKind[] {
            GENERATOR,
            GENERATOR_OR_CONDENSER,
            GENERATOR_OR_MOTOR,
            MOTOR,
            MOTOR_OR_CONDENSER,
            CONDENSER,
            GENERATOR_OR_CONDENSER_OR_MOTOR,
    };

    /**
     * A public read-only list of all the '<em><b>Synchronous Machine Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< SynchronousMachineKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Synchronous Machine Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineKind get( String literal ) {
        for( SynchronousMachineKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Synchronous Machine Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineKind getByName( String name ) {
        for( SynchronousMachineKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Synchronous Machine Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineKind get( int value ) {
        switch( value ) {
        case GENERATOR_VALUE:
            return GENERATOR;
        case GENERATOR_OR_CONDENSER_VALUE:
            return GENERATOR_OR_CONDENSER;
        case GENERATOR_OR_MOTOR_VALUE:
            return GENERATOR_OR_MOTOR;
        case MOTOR_VALUE:
            return MOTOR;
        case MOTOR_OR_CONDENSER_VALUE:
            return MOTOR_OR_CONDENSER;
        case CONDENSER_VALUE:
            return CONDENSER;
        case GENERATOR_OR_CONDENSER_OR_MOTOR_VALUE:
            return GENERATOR_OR_CONDENSER_OR_MOTOR;
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
    private SynchronousMachineKind( int value, String name, String literal ) {
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

} //SynchronousMachineKind
