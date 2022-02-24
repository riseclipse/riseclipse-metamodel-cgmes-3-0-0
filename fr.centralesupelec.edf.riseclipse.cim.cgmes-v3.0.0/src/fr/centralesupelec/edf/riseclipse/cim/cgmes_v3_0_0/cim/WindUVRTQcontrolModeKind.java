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
 * A representation of the literals of the enumeration '<em><b>Wind UVRT Qcontrol Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * UVRT Q control modes <i>M</i><i><sub>qUVRT</sub></i><i>.</i>
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindUVRTQcontrolModeKind()
 * @model
 * @generated
 */
public enum WindUVRTQcontrolModeKind implements Enumerator {
    /**
     * The '<em><b>Mode1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection (<i>M</i><i><sub>qUVRT</sub></i> equals 1).
     * <!-- end-model-doc -->
     * @see #MODE1_VALUE
     * @generated
     * @ordered
     */
    MODE1( 1, "mode1", "mode1" ),

    /**
     * The '<em><b>Mode2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive current injection controlled as the pre-fault value plus an additional voltage-dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault (<i>M</i><i><sub>qUVRT</sub></i><sub>  </sub>equals 2).
     * <!-- end-model-doc -->
     * @see #MODE2_VALUE
     * @generated
     * @ordered
     */
    MODE2( 2, "mode2", "mode2" ),

    /**
     * The '<em><b>Mode0</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage-dependent reactive current injection (<i>M</i><i><sub>qUVRT</sub></i> <sub> </sub>equals 0).
     * <!-- end-model-doc -->
     * @see #MODE0_VALUE
     * @generated
     * @ordered
     */
    MODE0( 3, "mode0", "mode0" );

    /**
     * The '<em><b>Mode1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection (<i>M</i><i><sub>qUVRT</sub></i> equals 1).
     * <!-- end-model-doc -->
     * @see #MODE1
     * @model name="mode1"
     * @generated
     * @ordered
     */
    public static final int MODE1_VALUE = 1;

    /**
     * The '<em><b>Mode2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive current injection controlled as the pre-fault value plus an additional voltage-dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault (<i>M</i><i><sub>qUVRT</sub></i><sub>  </sub>equals 2).
     * <!-- end-model-doc -->
     * @see #MODE2
     * @model name="mode2"
     * @generated
     * @ordered
     */
    public static final int MODE2_VALUE = 2;

    /**
     * The '<em><b>Mode0</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage-dependent reactive current injection (<i>M</i><i><sub>qUVRT</sub></i> <sub> </sub>equals 0).
     * <!-- end-model-doc -->
     * @see #MODE0
     * @model name="mode0"
     * @generated
     * @ordered
     */
    public static final int MODE0_VALUE = 3;

    /**
     * An array of all the '<em><b>Wind UVRT Qcontrol Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindUVRTQcontrolModeKind[] VALUES_ARRAY = new WindUVRTQcontrolModeKind[] {
            MODE1,
            MODE2,
            MODE0,
    };

    /**
     * A public read-only list of all the '<em><b>Wind UVRT Qcontrol Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindUVRTQcontrolModeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wind UVRT Qcontrol Mode Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindUVRTQcontrolModeKind get( String literal ) {
        for( WindUVRTQcontrolModeKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind UVRT Qcontrol Mode Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindUVRTQcontrolModeKind getByName( String name ) {
        for( WindUVRTQcontrolModeKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind UVRT Qcontrol Mode Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindUVRTQcontrolModeKind get( int value ) {
        switch( value ) {
        case MODE1_VALUE:
            return MODE1;
        case MODE2_VALUE:
            return MODE2;
        case MODE0_VALUE:
            return MODE0;
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
    private WindUVRTQcontrolModeKind( int value, String name, String literal ) {
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

} //WindUVRTQcontrolModeKind
