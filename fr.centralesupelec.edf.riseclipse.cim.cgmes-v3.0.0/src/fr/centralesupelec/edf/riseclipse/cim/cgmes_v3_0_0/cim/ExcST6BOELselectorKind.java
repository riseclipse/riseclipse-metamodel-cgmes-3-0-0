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
 * A representation of the literals of the enumeration '<em><b>Exc ST6BOE Lselector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of connections for the OEL input used for static excitation systems type 6B.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcST6BOELselectorKind()
 * @model
 * @generated
 */
public enum ExcST6BOELselectorKind implements Enumerator {
    /**
     * The '<em><b>No OE Linput</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No OEL input is used. Corresponds to <i>OELin</i> not = 1 and not = 2 on the ExcST6B diagram. Original ExcST6B model would have called this <i>OELin</i> = 0.
     * <!-- end-model-doc -->
     * @see #NO_OE_LINPUT_VALUE
     * @generated
     * @ordered
     */
    NO_OE_LINPUT( 1, "noOELinput", "noOELinput" ),

    /**
     * The '<em><b>Before UEL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connection is before UEL. Corresponds to <i>OELin</i> = 1 on the ExcST6B diagram.
     * <!-- end-model-doc -->
     * @see #BEFORE_UEL_VALUE
     * @generated
     * @ordered
     */
    BEFORE_UEL( 2, "beforeUEL", "beforeUEL" ),

    /**
     * The '<em><b>After UEL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connection is after UEL. Corresponds to <i>OELin</i> = 2 on the ExcST6B diagram.
     * <!-- end-model-doc -->
     * @see #AFTER_UEL_VALUE
     * @generated
     * @ordered
     */
    AFTER_UEL( 3, "afterUEL", "afterUEL" );

    /**
     * The '<em><b>No OE Linput</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No OEL input is used. Corresponds to <i>OELin</i> not = 1 and not = 2 on the ExcST6B diagram. Original ExcST6B model would have called this <i>OELin</i> = 0.
     * <!-- end-model-doc -->
     * @see #NO_OE_LINPUT
     * @model name="noOELinput"
     * @generated
     * @ordered
     */
    public static final int NO_OE_LINPUT_VALUE = 1;

    /**
     * The '<em><b>Before UEL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connection is before UEL. Corresponds to <i>OELin</i> = 1 on the ExcST6B diagram.
     * <!-- end-model-doc -->
     * @see #BEFORE_UEL
     * @model name="beforeUEL"
     * @generated
     * @ordered
     */
    public static final int BEFORE_UEL_VALUE = 2;

    /**
     * The '<em><b>After UEL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connection is after UEL. Corresponds to <i>OELin</i> = 2 on the ExcST6B diagram.
     * <!-- end-model-doc -->
     * @see #AFTER_UEL
     * @model name="afterUEL"
     * @generated
     * @ordered
     */
    public static final int AFTER_UEL_VALUE = 3;

    /**
     * An array of all the '<em><b>Exc ST6BOE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ExcST6BOELselectorKind[] VALUES_ARRAY = new ExcST6BOELselectorKind[] {
            NO_OE_LINPUT,
            BEFORE_UEL,
            AFTER_UEL,
    };

    /**
     * A public read-only list of all the '<em><b>Exc ST6BOE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ExcST6BOELselectorKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Exc ST6BOE Lselector Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST6BOELselectorKind get( String literal ) {
        for( ExcST6BOELselectorKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc ST6BOE Lselector Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST6BOELselectorKind getByName( String name ) {
        for( ExcST6BOELselectorKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc ST6BOE Lselector Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST6BOELselectorKind get( int value ) {
        switch( value ) {
        case NO_OE_LINPUT_VALUE:
            return NO_OE_LINPUT;
        case BEFORE_UEL_VALUE:
            return BEFORE_UEL;
        case AFTER_UEL_VALUE:
            return AFTER_UEL;
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
    private ExcST6BOELselectorKind( int value, String name, String literal ) {
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

} //ExcST6BOELselectorKind
