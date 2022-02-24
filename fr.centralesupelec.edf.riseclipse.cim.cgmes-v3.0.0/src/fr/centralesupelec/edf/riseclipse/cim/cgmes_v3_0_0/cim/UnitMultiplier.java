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
 * A representation of the literals of the enumeration '<em><b>Unit Multiplier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The unit multipliers defined for the CIM.  When applied to unit symbols, the unit symbol is treated as a derived unit. Regardless of the contents of the unit symbol text, the unit symbol shall be treated as if it were a single-character unit symbol. Unit symbols should not contain multipliers, and it should be left to the multiplier to define the multiple for an entire data type.
 *
 * For example, if a unit symbol is "m2Pers" and the multiplier is "k", then the value is k(m**2/s), and the multiplier applies to the entire final value, not to any individual part of the value. This can be conceptualized by substituting a derived unit symbol for the unit type. If one imagines that the symbol "Þ" represents the derived unit "m2Pers", then applying the multiplier "k" can be conceptualized simply as "kÞ".
 *
 * For example, the SI unit for mass is "kg" and not "g".  If the unit symbol is defined as "kg", then the multiplier is applied to "kg" as a whole and does not replace the "k" in front of the "g". In this case, the multiplier of "m" would be used with the unit symbol of "kg" to represent one gram.  As a text string, this violates the instructions in IEC 80000-1. However, because the unit symbol in CIM is treated as a derived unit instead of as an SI unit, it makes more sense to conceptualize the "kg" as if it were replaced by one of the proposed replacements for the SI mass symbol. If one imagines that the "kg" were replaced by a symbol "Þ", then it is easier to conceptualize the multiplier "m" as creating the proper unit "mÞ", and not the forbidden unit "mkg".
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnitMultiplier()
 * @model
 * @generated
 */
public enum UnitMultiplier implements Enumerator {
    /**
     * The '<em><b>Zetta</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zetta 10**21.
     * <!-- end-model-doc -->
     * @see #ZETTA_VALUE
     * @generated
     * @ordered
     */
    ZETTA( 1, "Zetta", "Z" ),

    /**
     * The '<em><b>Yotta</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Yotta 10**24.
     * <!-- end-model-doc -->
     * @see #YOTTA_VALUE
     * @generated
     * @ordered
     */
    YOTTA( 2, "Yotta", "Y" ),

    /**
     * The '<em><b>Peta</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Peta 10**15.
     * <!-- end-model-doc -->
     * @see #PETA_VALUE
     * @generated
     * @ordered
     */
    PETA( 3, "Peta", "P" ),

    /**
     * The '<em><b>Mile</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mega 10**6.
     * <!-- end-model-doc -->
     * @see #MILE_VALUE
     * @generated
     * @ordered
     */
    MILE( 4, "Mile", "M" ),

    /**
     * The '<em><b>T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tera 10**12.
     * <!-- end-model-doc -->
     * @see #T_VALUE
     * @generated
     * @ordered
     */
    T( 5, "T", "T" ),
    /**
     * The '<em><b>G</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Giga 10**9.
     * <!-- end-model-doc -->
     * @see #G_VALUE
     * @generated
     * @ordered
     */
    G( 6, "G", "G" ),
    /**
     * The '<em><b>E</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exa 10**18.
     * <!-- end-model-doc -->
     * @see #E_VALUE
     * @generated
     * @ordered
     */
    E( 7, "E", "E" ),
    /**
     * The '<em><b>Zepto</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zepto 10**-21.
     * <!-- end-model-doc -->
     * @see #ZEPTO_VALUE
     * @generated
     * @ordered
     */
    ZEPTO( 8, "zepto", "z" ),
    /**
     * The '<em><b>Yocto</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Yocto 10**-24.
     * <!-- end-model-doc -->
     * @see #YOCTO_VALUE
     * @generated
     * @ordered
     */
    YOCTO( 9, "yocto", "y" ),
    /**
     * The '<em><b>Pico</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pico 10**-12.
     * <!-- end-model-doc -->
     * @see #PICO_VALUE
     * @generated
     * @ordered
     */
    PICO( 10, "pico", "p" ),
    /**
     * The '<em><b>N</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nano 10**-9.
     * <!-- end-model-doc -->
     * @see #N_VALUE
     * @generated
     * @ordered
     */
    N( 11, "n", "n" ),
    /**
     * The '<em><b>Meter</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Milli 10**-3.
     * <!-- end-model-doc -->
     * @see #METER_VALUE
     * @generated
     * @ordered
     */
    METER( 12, "meter", "m" ),
    /**
     * The '<em><b>Henry</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hecto 10**2.
     * <!-- end-model-doc -->
     * @see #HENRY_VALUE
     * @generated
     * @ordered
     */
    HENRY( 13, "henry", "h" ),
    /**
     * The '<em><b>F</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Femto 10**-15.
     * <!-- end-model-doc -->
     * @see #F_VALUE
     * @generated
     * @ordered
     */
    F( 14, "f", "f" ),
    /**
     * The '<em><b>K</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kilo 10**3.
     * <!-- end-model-doc -->
     * @see #K_VALUE
     * @generated
     * @ordered
     */
    K( 15, "k", "k" ),
    /**
     * The '<em><b>D</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deci 10**-1.
     * <!-- end-model-doc -->
     * @see #D_VALUE
     * @generated
     * @ordered
     */
    D( 16, "d", "d" ),
    /**
     * The '<em><b>C</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Centi 10**-2.
     * <!-- end-model-doc -->
     * @see #C_VALUE
     * @generated
     * @ordered
     */
    C( 17, "c", "c" ),
    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Atto 10**-18.
     * <!-- end-model-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 18, "a", "a" ),

    /**
     * The '<em><b>Da</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deca 10**1.
     * <!-- end-model-doc -->
     * @see #DA_VALUE
     * @generated
     * @ordered
     */
    DA( 19, "da", "da" ),

    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No multiplier or equivalently multiply by 1.
     * <!-- end-model-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 20, "none", "none" ),
    /**
     * The '<em><b>Micro</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Micro 10**-6.
     * <!-- end-model-doc -->
     * @see #MICRO_VALUE
     * @generated
     * @ordered
     */
    MICRO( 21, "micro", "micro" );

    /**
     * The '<em><b>Zetta</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zetta 10**21.
     * <!-- end-model-doc -->
     * @see #ZETTA
     * @model name="Zetta" literal="Z"
     * @generated
     * @ordered
     */
    public static final int ZETTA_VALUE = 1;

    /**
     * The '<em><b>Yotta</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Yotta 10**24.
     * <!-- end-model-doc -->
     * @see #YOTTA
     * @model name="Yotta" literal="Y"
     * @generated
     * @ordered
     */
    public static final int YOTTA_VALUE = 2;

    /**
     * The '<em><b>Peta</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Peta 10**15.
     * <!-- end-model-doc -->
     * @see #PETA
     * @model name="Peta" literal="P"
     * @generated
     * @ordered
     */
    public static final int PETA_VALUE = 3;

    /**
     * The '<em><b>Mile</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mega 10**6.
     * <!-- end-model-doc -->
     * @see #MILE
     * @model name="Mile" literal="M"
     * @generated
     * @ordered
     */
    public static final int MILE_VALUE = 4;

    /**
     * The '<em><b>T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tera 10**12.
     * <!-- end-model-doc -->
     * @see #T
     * @model
     * @generated
     * @ordered
     */
    public static final int T_VALUE = 5;

    /**
     * The '<em><b>G</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Giga 10**9.
     * <!-- end-model-doc -->
     * @see #G
     * @model
     * @generated
     * @ordered
     */
    public static final int G_VALUE = 6;

    /**
     * The '<em><b>E</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exa 10**18.
     * <!-- end-model-doc -->
     * @see #E
     * @model
     * @generated
     * @ordered
     */
    public static final int E_VALUE = 7;

    /**
     * The '<em><b>Zepto</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zepto 10**-21.
     * <!-- end-model-doc -->
     * @see #ZEPTO
     * @model name="zepto" literal="z"
     * @generated
     * @ordered
     */
    public static final int ZEPTO_VALUE = 8;

    /**
     * The '<em><b>Yocto</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Yocto 10**-24.
     * <!-- end-model-doc -->
     * @see #YOCTO
     * @model name="yocto" literal="y"
     * @generated
     * @ordered
     */
    public static final int YOCTO_VALUE = 9;

    /**
     * The '<em><b>Pico</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pico 10**-12.
     * <!-- end-model-doc -->
     * @see #PICO
     * @model name="pico" literal="p"
     * @generated
     * @ordered
     */
    public static final int PICO_VALUE = 10;

    /**
     * The '<em><b>N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nano 10**-9.
     * <!-- end-model-doc -->
     * @see #N
     * @model name="n"
     * @generated
     * @ordered
     */
    public static final int N_VALUE = 11;

    /**
     * The '<em><b>Meter</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Milli 10**-3.
     * <!-- end-model-doc -->
     * @see #METER
     * @model name="meter" literal="m"
     * @generated
     * @ordered
     */
    public static final int METER_VALUE = 12;

    /**
     * The '<em><b>Henry</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hecto 10**2.
     * <!-- end-model-doc -->
     * @see #HENRY
     * @model name="henry" literal="h"
     * @generated
     * @ordered
     */
    public static final int HENRY_VALUE = 13;

    /**
     * The '<em><b>F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Femto 10**-15.
     * <!-- end-model-doc -->
     * @see #F
     * @model name="f"
     * @generated
     * @ordered
     */
    public static final int F_VALUE = 14;

    /**
     * The '<em><b>K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kilo 10**3.
     * <!-- end-model-doc -->
     * @see #K
     * @model name="k"
     * @generated
     * @ordered
     */
    public static final int K_VALUE = 15;

    /**
     * The '<em><b>D</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deci 10**-1.
     * <!-- end-model-doc -->
     * @see #D
     * @model name="d"
     * @generated
     * @ordered
     */
    public static final int D_VALUE = 16;

    /**
     * The '<em><b>C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Centi 10**-2.
     * <!-- end-model-doc -->
     * @see #C
     * @model name="c"
     * @generated
     * @ordered
     */
    public static final int C_VALUE = 17;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Atto 10**-18.
     * <!-- end-model-doc -->
     * @see #A
     * @model name="a"
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 18;

    /**
     * The '<em><b>Da</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deca 10**1.
     * <!-- end-model-doc -->
     * @see #DA
     * @model name="da"
     * @generated
     * @ordered
     */
    public static final int DA_VALUE = 19;

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No multiplier or equivalently multiply by 1.
     * <!-- end-model-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 20;

    /**
     * The '<em><b>Micro</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Micro 10**-6.
     * <!-- end-model-doc -->
     * @see #MICRO
     * @model name="micro"
     * @generated
     * @ordered
     */
    public static final int MICRO_VALUE = 21;

    /**
     * An array of all the '<em><b>Unit Multiplier</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UnitMultiplier[] VALUES_ARRAY = new UnitMultiplier[] {
            ZETTA,
            YOTTA,
            PETA,
            MILE,
            T,
            G,
            E,
            ZEPTO,
            YOCTO,
            PICO,
            N,
            METER,
            HENRY,
            F,
            K,
            D,
            C,
            A,
            DA,
            NONE,
            MICRO,
    };

    /**
     * A public read-only list of all the '<em><b>Unit Multiplier</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< UnitMultiplier > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Unit Multiplier</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplier get( String literal ) {
        for( UnitMultiplier result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Multiplier</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplier getByName( String name ) {
        for( UnitMultiplier result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Multiplier</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplier get( int value ) {
        switch( value ) {
        case ZETTA_VALUE:
            return ZETTA;
        case YOTTA_VALUE:
            return YOTTA;
        case PETA_VALUE:
            return PETA;
        case MILE_VALUE:
            return MILE;
        case T_VALUE:
            return T;
        case G_VALUE:
            return G;
        case E_VALUE:
            return E;
        case ZEPTO_VALUE:
            return ZEPTO;
        case YOCTO_VALUE:
            return YOCTO;
        case PICO_VALUE:
            return PICO;
        case N_VALUE:
            return N;
        case METER_VALUE:
            return METER;
        case HENRY_VALUE:
            return HENRY;
        case F_VALUE:
            return F;
        case K_VALUE:
            return K;
        case D_VALUE:
            return D;
        case C_VALUE:
            return C;
        case A_VALUE:
            return A;
        case DA_VALUE:
            return DA;
        case NONE_VALUE:
            return NONE;
        case MICRO_VALUE:
            return MICRO;
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
    private UnitMultiplier( int value, String name, String literal ) {
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

} //UnitMultiplier
