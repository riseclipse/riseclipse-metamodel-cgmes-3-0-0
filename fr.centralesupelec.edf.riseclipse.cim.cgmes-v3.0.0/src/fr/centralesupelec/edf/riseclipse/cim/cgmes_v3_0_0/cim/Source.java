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
 * A representation of the literals of the enumeration '<em><b>Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Source gives information related to the origin of a value.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSource()
 * @model
 * @generated
 */
public enum Source implements Enumerator {
    /**
     * The '<em><b>SUBSTITUTED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value is provided by input of an operator or by an automatic source.
     * <!-- end-model-doc -->
     * @see #SUBSTITUTED_VALUE
     * @generated
     * @ordered
     */
    SUBSTITUTED( 1, "SUBSTITUTED", "SUBSTITUTED" ),

    /**
     * The '<em><b>DEFAULTED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value contains a default value.
     * <!-- end-model-doc -->
     * @see #DEFAULTED_VALUE
     * @generated
     * @ordered
     */
    DEFAULTED( 2, "DEFAULTED", "DEFAULTED" ),

    /**
     * The '<em><b>PROCESS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value is provided by input from the process I/O or being calculated from some function.
     * <!-- end-model-doc -->
     * @see #PROCESS_VALUE
     * @generated
     * @ordered
     */
    PROCESS( 3, "PROCESS", "PROCESS" );

    /**
     * The '<em><b>SUBSTITUTED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value is provided by input of an operator or by an automatic source.
     * <!-- end-model-doc -->
     * @see #SUBSTITUTED
     * @model
     * @generated
     * @ordered
     */
    public static final int SUBSTITUTED_VALUE = 1;

    /**
     * The '<em><b>DEFAULTED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value contains a default value.
     * <!-- end-model-doc -->
     * @see #DEFAULTED
     * @model
     * @generated
     * @ordered
     */
    public static final int DEFAULTED_VALUE = 2;

    /**
     * The '<em><b>PROCESS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value is provided by input from the process I/O or being calculated from some function.
     * <!-- end-model-doc -->
     * @see #PROCESS
     * @model
     * @generated
     * @ordered
     */
    public static final int PROCESS_VALUE = 3;

    /**
     * An array of all the '<em><b>Source</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Source[] VALUES_ARRAY = new Source[] {
            SUBSTITUTED,
            DEFAULTED,
            PROCESS,
    };

    /**
     * A public read-only list of all the '<em><b>Source</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< Source > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Source</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Source get( String literal ) {
        for( Source result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Source</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Source getByName( String name ) {
        for( Source result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Source</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Source get( int value ) {
        switch( value ) {
        case SUBSTITUTED_VALUE:
            return SUBSTITUTED;
        case DEFAULTED_VALUE:
            return DEFAULTED;
        case PROCESS_VALUE:
            return PROCESS;
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
    private Source( int value, String name, String literal ) {
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

} //Source
