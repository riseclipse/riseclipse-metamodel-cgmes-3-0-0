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
 * A representation of the literals of the enumeration '<em><b>Winding Connection</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Winding connection type.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindingConnection()
 * @model
 * @generated
 */
public enum WindingConnection implements Enumerator {
    /**
     * The '<em><b>Zn</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ZigZag, with neutral brought out for grounding.
     * <!-- end-model-doc -->
     * @see #ZN_VALUE
     * @generated
     * @ordered
     */
    ZN( 1, "Zn", "Zn" ),

    /**
     * The '<em><b>Yn</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wye, with neutral brought out for grounding.
     * <!-- end-model-doc -->
     * @see #YN_VALUE
     * @generated
     * @ordered
     */
    YN( 2, "Yn", "Yn" ),

    /**
     * The '<em><b>D</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Delta.
     * <!-- end-model-doc -->
     * @see #D_VALUE
     * @generated
     * @ordered
     */
    D( 3, "D", "D" ),

    /**
     * The '<em><b>I</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Independent winding, for single-phase connections.
     * <!-- end-model-doc -->
     * @see #I_VALUE
     * @generated
     * @ordered
     */
    I( 4, "I", "I" ),
    /**
     * The '<em><b>Yotta</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wye.
     * <!-- end-model-doc -->
     * @see #YOTTA_VALUE
     * @generated
     * @ordered
     */
    YOTTA( 5, "Yotta", "Y" ),
    /**
     * The '<em><b>Zetta</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ZigZag.
     * <!-- end-model-doc -->
     * @see #ZETTA_VALUE
     * @generated
     * @ordered
     */
    ZETTA( 6, "Zetta", "Z" ),
    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Autotransformer common winding.
     * <!-- end-model-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 7, "A", "A" );

    /**
     * The '<em><b>Zn</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ZigZag, with neutral brought out for grounding.
     * <!-- end-model-doc -->
     * @see #ZN
     * @model name="Zn"
     * @generated
     * @ordered
     */
    public static final int ZN_VALUE = 1;

    /**
     * The '<em><b>Yn</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wye, with neutral brought out for grounding.
     * <!-- end-model-doc -->
     * @see #YN
     * @model name="Yn"
     * @generated
     * @ordered
     */
    public static final int YN_VALUE = 2;

    /**
     * The '<em><b>D</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Delta.
     * <!-- end-model-doc -->
     * @see #D
     * @model
     * @generated
     * @ordered
     */
    public static final int D_VALUE = 3;

    /**
     * The '<em><b>I</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Independent winding, for single-phase connections.
     * <!-- end-model-doc -->
     * @see #I
     * @model
     * @generated
     * @ordered
     */
    public static final int I_VALUE = 4;

    /**
     * The '<em><b>Yotta</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wye.
     * <!-- end-model-doc -->
     * @see #YOTTA
     * @model name="Yotta" literal="Y"
     * @generated
     * @ordered
     */
    public static final int YOTTA_VALUE = 5;

    /**
     * The '<em><b>Zetta</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ZigZag.
     * <!-- end-model-doc -->
     * @see #ZETTA
     * @model name="Zetta" literal="Z"
     * @generated
     * @ordered
     */
    public static final int ZETTA_VALUE = 6;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Autotransformer common winding.
     * <!-- end-model-doc -->
     * @see #A
     * @model
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 7;

    /**
     * An array of all the '<em><b>Winding Connection</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindingConnection[] VALUES_ARRAY = new WindingConnection[] {
            ZN,
            YN,
            D,
            I,
            YOTTA,
            ZETTA,
            A,
    };

    /**
     * A public read-only list of all the '<em><b>Winding Connection</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindingConnection > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Winding Connection</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindingConnection get( String literal ) {
        for( WindingConnection result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Winding Connection</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindingConnection getByName( String name ) {
        for( WindingConnection result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Winding Connection</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindingConnection get( int value ) {
        switch( value ) {
        case ZN_VALUE:
            return ZN;
        case YN_VALUE:
            return YN;
        case D_VALUE:
            return D;
        case I_VALUE:
            return I;
        case YOTTA_VALUE:
            return YOTTA;
        case ZETTA_VALUE:
            return ZETTA;
        case A_VALUE:
            return A;
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
    private WindingConnection( int value, String name, String literal ) {
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

} //WindingConnection
