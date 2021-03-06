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
 * A representation of the literals of the enumeration '<em><b>DC Polarity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Polarity for DC circuits.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCPolarityKind()
 * @model
 * @generated
 */
public enum DCPolarityKind implements Enumerator {
    /**
     * The '<em><b>Middle</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Middle pole. The converter terminal is the midpoint in a bipolar or symmetric monopole configuration. The midpoint can be grounded and/or have a metallic return.
     * <!-- end-model-doc -->
     * @see #MIDDLE_VALUE
     * @generated
     * @ordered
     */
    MIDDLE( 1, "middle", "middle" ),
    /**
     * The '<em><b>Positive</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive pole. The converter terminal is intended to operate at a positive voltage relative the midpoint or negative terminal.
     * <!-- end-model-doc -->
     * @see #POSITIVE_VALUE
     * @generated
     * @ordered
     */
    POSITIVE( 2, "positive", "positive" ),

    /**
     * The '<em><b>Negative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative pole. The converter terminal is intended to operate at a negative voltage relative the midpoint or positive terminal.
     * <!-- end-model-doc -->
     * @see #NEGATIVE_VALUE
     * @generated
     * @ordered
     */
    NEGATIVE( 3, "negative", "negative" );

    /**
     * The '<em><b>Middle</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Middle pole. The converter terminal is the midpoint in a bipolar or symmetric monopole configuration. The midpoint can be grounded and/or have a metallic return.
     * <!-- end-model-doc -->
     * @see #MIDDLE
     * @model name="middle"
     * @generated
     * @ordered
     */
    public static final int MIDDLE_VALUE = 1;

    /**
     * The '<em><b>Positive</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive pole. The converter terminal is intended to operate at a positive voltage relative the midpoint or negative terminal.
     * <!-- end-model-doc -->
     * @see #POSITIVE
     * @model name="positive"
     * @generated
     * @ordered
     */
    public static final int POSITIVE_VALUE = 2;

    /**
     * The '<em><b>Negative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative pole. The converter terminal is intended to operate at a negative voltage relative the midpoint or positive terminal.
     * <!-- end-model-doc -->
     * @see #NEGATIVE
     * @model name="negative"
     * @generated
     * @ordered
     */
    public static final int NEGATIVE_VALUE = 3;

    /**
     * An array of all the '<em><b>DC Polarity Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DCPolarityKind[] VALUES_ARRAY = new DCPolarityKind[] {
            MIDDLE,
            POSITIVE,
            NEGATIVE,
    };

    /**
     * A public read-only list of all the '<em><b>DC Polarity Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< DCPolarityKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>DC Polarity Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DCPolarityKind get( String literal ) {
        for( DCPolarityKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DC Polarity Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DCPolarityKind getByName( String name ) {
        for( DCPolarityKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DC Polarity Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DCPolarityKind get( int value ) {
        switch( value ) {
        case MIDDLE_VALUE:
            return MIDDLE;
        case POSITIVE_VALUE:
            return POSITIVE;
        case NEGATIVE_VALUE:
            return NEGATIVE;
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
    private DCPolarityKind( int value, String name, String literal ) {
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

} //DCPolarityKind
