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
 * A representation of the literals of the enumeration '<em><b>Petersen Coil Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The mode of operation for a Petersen coil.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoilModeKind()
 * @model
 * @generated
 */
public enum PetersenCoilModeKind implements Enumerator {
    /**
     * The '<em><b>Fixed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fixed position.
     * <!-- end-model-doc -->
     * @see #FIXED_VALUE
     * @generated
     * @ordered
     */
    FIXED( 1, "fixed", "fixed" ),

    /**
     * The '<em><b>Manual</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Manual positioning.
     * <!-- end-model-doc -->
     * @see #MANUAL_VALUE
     * @generated
     * @ordered
     */
    MANUAL( 2, "manual", "manual" ),

    /**
     * The '<em><b>Automatic Positioning</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Automatic positioning.
     * <!-- end-model-doc -->
     * @see #AUTOMATIC_POSITIONING_VALUE
     * @generated
     * @ordered
     */
    AUTOMATIC_POSITIONING( 3, "automaticPositioning", "automaticPositioning" );

    /**
     * The '<em><b>Fixed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fixed position.
     * <!-- end-model-doc -->
     * @see #FIXED
     * @model name="fixed"
     * @generated
     * @ordered
     */
    public static final int FIXED_VALUE = 1;

    /**
     * The '<em><b>Manual</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Manual positioning.
     * <!-- end-model-doc -->
     * @see #MANUAL
     * @model name="manual"
     * @generated
     * @ordered
     */
    public static final int MANUAL_VALUE = 2;

    /**
     * The '<em><b>Automatic Positioning</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Automatic positioning.
     * <!-- end-model-doc -->
     * @see #AUTOMATIC_POSITIONING
     * @model name="automaticPositioning"
     * @generated
     * @ordered
     */
    public static final int AUTOMATIC_POSITIONING_VALUE = 3;

    /**
     * An array of all the '<em><b>Petersen Coil Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PetersenCoilModeKind[] VALUES_ARRAY = new PetersenCoilModeKind[] {
            FIXED,
            MANUAL,
            AUTOMATIC_POSITIONING,
    };

    /**
     * A public read-only list of all the '<em><b>Petersen Coil Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< PetersenCoilModeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Petersen Coil Mode Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PetersenCoilModeKind get( String literal ) {
        for( PetersenCoilModeKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Petersen Coil Mode Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PetersenCoilModeKind getByName( String name ) {
        for( PetersenCoilModeKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Petersen Coil Mode Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PetersenCoilModeKind get( int value ) {
        switch( value ) {
        case FIXED_VALUE:
            return FIXED;
        case MANUAL_VALUE:
            return MANUAL;
        case AUTOMATIC_POSITIONING_VALUE:
            return AUTOMATIC_POSITIONING;
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
    private PetersenCoilModeKind( int value, String name, String literal ) {
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

} //PetersenCoilModeKind
