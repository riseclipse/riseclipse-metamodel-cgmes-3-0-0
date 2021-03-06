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
 * A representation of the literals of the enumeration '<em><b>Ifd Base Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Excitation base system mode.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIfdBaseKind()
 * @model
 * @generated
 */
public enum IfdBaseKind implements Enumerator {
    /**
     * The '<em><b>Ifnl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No load system with saturation mode.
     * <!-- end-model-doc -->
     * @see #IFNL_VALUE
     * @generated
     * @ordered
     */
    IFNL( 1, "ifnl", "ifnl" ),

    /**
     * The '<em><b>Ifag</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Air gap line mode.
     * <!-- end-model-doc -->
     * @see #IFAG_VALUE
     * @generated
     * @ordered
     */
    IFAG( 2, "ifag", "ifag" ),

    /**
     * The '<em><b>Iffl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Full load system mode.
     * <!-- end-model-doc -->
     * @see #IFFL_VALUE
     * @generated
     * @ordered
     */
    IFFL( 3, "iffl", "iffl" );

    /**
     * The '<em><b>Ifnl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No load system with saturation mode.
     * <!-- end-model-doc -->
     * @see #IFNL
     * @model name="ifnl"
     * @generated
     * @ordered
     */
    public static final int IFNL_VALUE = 1;

    /**
     * The '<em><b>Ifag</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Air gap line mode.
     * <!-- end-model-doc -->
     * @see #IFAG
     * @model name="ifag"
     * @generated
     * @ordered
     */
    public static final int IFAG_VALUE = 2;

    /**
     * The '<em><b>Iffl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Full load system mode.
     * <!-- end-model-doc -->
     * @see #IFFL
     * @model name="iffl"
     * @generated
     * @ordered
     */
    public static final int IFFL_VALUE = 3;

    /**
     * An array of all the '<em><b>Ifd Base Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IfdBaseKind[] VALUES_ARRAY = new IfdBaseKind[] {
            IFNL,
            IFAG,
            IFFL,
    };

    /**
     * A public read-only list of all the '<em><b>Ifd Base Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< IfdBaseKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Ifd Base Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfdBaseKind get( String literal ) {
        for( IfdBaseKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifd Base Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfdBaseKind getByName( String name ) {
        for( IfdBaseKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ifd Base Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IfdBaseKind get( int value ) {
        switch( value ) {
        case IFNL_VALUE:
            return IFNL;
        case IFAG_VALUE:
            return IFAG;
        case IFFL_VALUE:
            return IFFL;
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
    private IfdBaseKind( int value, String name, String literal ) {
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

} //IfdBaseKind
