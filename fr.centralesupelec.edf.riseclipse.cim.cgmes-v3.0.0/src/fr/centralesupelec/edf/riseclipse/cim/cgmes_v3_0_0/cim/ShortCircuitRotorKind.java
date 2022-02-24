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
 * A representation of the literals of the enumeration '<em><b>Short Circuit Rotor Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of rotor, used by short circuit applications.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getShortCircuitRotorKind()
 * @model
 * @generated
 */
public enum ShortCircuitRotorKind implements Enumerator {
    /**
     * The '<em><b>Turbo Series1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbo Series 1 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #TURBO_SERIES1_VALUE
     * @generated
     * @ordered
     */
    TURBO_SERIES1( 1, "turboSeries1", "turboSeries1" ),

    /**
     * The '<em><b>Turbo Series2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbo series 2 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #TURBO_SERIES2_VALUE
     * @generated
     * @ordered
     */
    TURBO_SERIES2( 2, "turboSeries2", "turboSeries2" ),

    /**
     * The '<em><b>Salient Pole2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Salient pole 2 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #SALIENT_POLE2_VALUE
     * @generated
     * @ordered
     */
    SALIENT_POLE2( 3, "salientPole2", "salientPole2" ),

    /**
     * The '<em><b>Salient Pole1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Salient pole 1 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #SALIENT_POLE1_VALUE
     * @generated
     * @ordered
     */
    SALIENT_POLE1( 4, "salientPole1", "salientPole1" );

    /**
     * The '<em><b>Turbo Series1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbo Series 1 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #TURBO_SERIES1
     * @model name="turboSeries1"
     * @generated
     * @ordered
     */
    public static final int TURBO_SERIES1_VALUE = 1;

    /**
     * The '<em><b>Turbo Series2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbo series 2 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #TURBO_SERIES2
     * @model name="turboSeries2"
     * @generated
     * @ordered
     */
    public static final int TURBO_SERIES2_VALUE = 2;

    /**
     * The '<em><b>Salient Pole2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Salient pole 2 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #SALIENT_POLE2
     * @model name="salientPole2"
     * @generated
     * @ordered
     */
    public static final int SALIENT_POLE2_VALUE = 3;

    /**
     * The '<em><b>Salient Pole1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Salient pole 1 in IEC 60909.
     * <!-- end-model-doc -->
     * @see #SALIENT_POLE1
     * @model name="salientPole1"
     * @generated
     * @ordered
     */
    public static final int SALIENT_POLE1_VALUE = 4;

    /**
     * An array of all the '<em><b>Short Circuit Rotor Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ShortCircuitRotorKind[] VALUES_ARRAY = new ShortCircuitRotorKind[] {
            TURBO_SERIES1,
            TURBO_SERIES2,
            SALIENT_POLE2,
            SALIENT_POLE1,
    };

    /**
     * A public read-only list of all the '<em><b>Short Circuit Rotor Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ShortCircuitRotorKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Short Circuit Rotor Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ShortCircuitRotorKind get( String literal ) {
        for( ShortCircuitRotorKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Short Circuit Rotor Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ShortCircuitRotorKind getByName( String name ) {
        for( ShortCircuitRotorKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Short Circuit Rotor Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ShortCircuitRotorKind get( int value ) {
        switch( value ) {
        case TURBO_SERIES1_VALUE:
            return TURBO_SERIES1;
        case TURBO_SERIES2_VALUE:
            return TURBO_SERIES2;
        case SALIENT_POLE2_VALUE:
            return SALIENT_POLE2;
        case SALIENT_POLE1_VALUE:
            return SALIENT_POLE1;
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
    private ShortCircuitRotorKind( int value, String name, String literal ) {
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

} //ShortCircuitRotorKind
