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
 * A representation of the literals of the enumeration '<em><b>Orientation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The orientation of the coordinate system with respect to top, left, and the coordinate number system.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOrientationKind()
 * @model
 * @generated
 */
public enum OrientationKind implements Enumerator {
    /**
     * The '<em><b>Negative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For 2D diagrams, a negative orientation gives the left-hand orientation (favoured by computer graphics displays) with X values increasing from left to right and Y values increasing from top to bottom.   This is also known as a left hand orientation.
     * <!-- end-model-doc -->
     * @see #NEGATIVE_VALUE
     * @generated
     * @ordered
     */
    NEGATIVE( 1, "negative", "negative" ),

    /**
     * The '<em><b>Positive</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For 2D diagrams, a positive orientation will result in X values increasing from left to right and Y values increasing from bottom to top.  This is also known as a right hand orientation.
     * <!-- end-model-doc -->
     * @see #POSITIVE_VALUE
     * @generated
     * @ordered
     */
    POSITIVE( 2, "positive", "positive" );

    /**
     * The '<em><b>Negative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For 2D diagrams, a negative orientation gives the left-hand orientation (favoured by computer graphics displays) with X values increasing from left to right and Y values increasing from top to bottom.   This is also known as a left hand orientation.
     * <!-- end-model-doc -->
     * @see #NEGATIVE
     * @model name="negative"
     * @generated
     * @ordered
     */
    public static final int NEGATIVE_VALUE = 1;

    /**
     * The '<em><b>Positive</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For 2D diagrams, a positive orientation will result in X values increasing from left to right and Y values increasing from bottom to top.  This is also known as a right hand orientation.
     * <!-- end-model-doc -->
     * @see #POSITIVE
     * @model name="positive"
     * @generated
     * @ordered
     */
    public static final int POSITIVE_VALUE = 2;

    /**
     * An array of all the '<em><b>Orientation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OrientationKind[] VALUES_ARRAY = new OrientationKind[] {
            NEGATIVE,
            POSITIVE,
    };

    /**
     * A public read-only list of all the '<em><b>Orientation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OrientationKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Orientation Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OrientationKind get( String literal ) {
        for( OrientationKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Orientation Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OrientationKind getByName( String name ) {
        for( OrientationKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Orientation Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OrientationKind get( int value ) {
        switch( value ) {
        case NEGATIVE_VALUE:
            return NEGATIVE;
        case POSITIVE_VALUE:
            return POSITIVE;
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
    private OrientationKind( int value, String name, String literal ) {
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

} //OrientationKind
