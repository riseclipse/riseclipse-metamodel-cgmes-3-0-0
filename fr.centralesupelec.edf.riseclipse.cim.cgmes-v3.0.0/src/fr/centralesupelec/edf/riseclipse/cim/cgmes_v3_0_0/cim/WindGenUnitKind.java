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
 * A representation of the literals of the enumeration '<em><b>Wind Gen Unit Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Kind of wind generating unit.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenUnitKind()
 * @model
 * @generated
 */
public enum WindGenUnitKind implements Enumerator {
    /**
     * The '<em><b>Offshore</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind generating unit is located offshore.
     * <!-- end-model-doc -->
     * @see #OFFSHORE_VALUE
     * @generated
     * @ordered
     */
    OFFSHORE( 1, "offshore", "offshore" ),
    /**
     * The '<em><b>Onshore</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind generating unit is located onshore.
     * <!-- end-model-doc -->
     * @see #ONSHORE_VALUE
     * @generated
     * @ordered
     */
    ONSHORE( 2, "onshore", "onshore" );

    /**
     * The '<em><b>Offshore</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind generating unit is located offshore.
     * <!-- end-model-doc -->
     * @see #OFFSHORE
     * @model name="offshore"
     * @generated
     * @ordered
     */
    public static final int OFFSHORE_VALUE = 1;

    /**
     * The '<em><b>Onshore</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind generating unit is located onshore.
     * <!-- end-model-doc -->
     * @see #ONSHORE
     * @model name="onshore"
     * @generated
     * @ordered
     */
    public static final int ONSHORE_VALUE = 2;

    /**
     * An array of all the '<em><b>Wind Gen Unit Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindGenUnitKind[] VALUES_ARRAY = new WindGenUnitKind[] {
            OFFSHORE,
            ONSHORE,
    };

    /**
     * A public read-only list of all the '<em><b>Wind Gen Unit Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindGenUnitKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wind Gen Unit Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindGenUnitKind get( String literal ) {
        for( WindGenUnitKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Gen Unit Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindGenUnitKind getByName( String name ) {
        for( WindGenUnitKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Gen Unit Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindGenUnitKind get( int value ) {
        switch( value ) {
        case OFFSHORE_VALUE:
            return OFFSHORE;
        case ONSHORE_VALUE:
            return ONSHORE;
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
    private WindGenUnitKind( int value, String name, String literal ) {
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

} //WindGenUnitKind
