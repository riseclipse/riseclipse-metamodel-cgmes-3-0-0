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
 * A representation of the literals of the enumeration '<em><b>Phase Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * An unordered enumeration of phase identifiers.  Allows designation of phases for both transmission and distribution equipment, circuits and loads.   The enumeration, by itself, does not describe how the phases are connected together or connected to ground.  Ground is not explicitly denoted as a phase.
 * Residential and small commercial loads are often served from single-phase, or split-phase, secondary circuits. For the example of s12N, phases 1 and 2 refer to hot wires that are 180 degrees out of phase, while N refers to the neutral wire. Through single-phase transformer connections, these secondary circuits may be served from one or two of the primary phases A, B, and C. For three-phase loads, use the A, B, C phase codes instead of s12N.
 * The integer values are from IEC 61968-9 to support revenue metering applications.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseCode()
 * @model
 * @generated
 */
public enum PhaseCode implements Enumerator {
    /**
     * The '<em><b>BCN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases B, C, and neutral.
     * <!-- end-model-doc -->
     * @see #BCN_VALUE
     * @generated
     * @ordered
     */
    BCN( 1, "BCN", "BCN" ),

    /**
     * The '<em><b>XY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Two unknown non-neutral phases.
     * <!-- end-model-doc -->
     * @see #XY_VALUE
     * @generated
     * @ordered
     */
    XY( 2, "XY", "XY" ),
    /**
     * The '<em><b>XN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unknown non-neutral phase plus neutral.
     * <!-- end-model-doc -->
     * @see #XN_VALUE
     * @generated
     * @ordered
     */
    XN( 3, "XN", "XN" ),
    /**
     * The '<em><b>N</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Neutral phase.
     * <!-- end-model-doc -->
     * @see #N_VALUE
     * @generated
     * @ordered
     */
    N( 4, "N", "N" ),
    /**
     * The '<em><b>C</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase C.
     * <!-- end-model-doc -->
     * @see #C_VALUE
     * @generated
     * @ordered
     */
    C( 5, "C", "C" ),
    /**
     * The '<em><b>B</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase B.
     * <!-- end-model-doc -->
     * @see #B_VALUE
     * @generated
     * @ordered
     */
    B( 6, "B", "B" ),
    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase A.
     * <!-- end-model-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 7, "A", "A" ),
    /**
     * The '<em><b>X</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unknown non-neutral phase.
     * <!-- end-model-doc -->
     * @see #X_VALUE
     * @generated
     * @ordered
     */
    X( 8, "X", "X" ),
    /**
     * The '<em><b>S2N</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 2 and neutral.
     * <!-- end-model-doc -->
     * @see #S2_N_VALUE
     * @generated
     * @ordered
     */
    S2_N( 9, "s2N", "s2N" ),

    /**
     * The '<em><b>S12</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 1 and 2.
     * <!-- end-model-doc -->
     * @see #S12_VALUE
     * @generated
     * @ordered
     */
    S12( 10, "s12", "s12" ),

    /**
     * The '<em><b>S1N</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 1 and neutral.
     * <!-- end-model-doc -->
     * @see #S1_N_VALUE
     * @generated
     * @ordered
     */
    S1_N( 11, "s1N", "s1N" ),

    /**
     * The '<em><b>XYN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Two unknown non-neutral phases plus neutral.
     * <!-- end-model-doc -->
     * @see #XYN_VALUE
     * @generated
     * @ordered
     */
    XYN( 12, "XYN", "XYN" ),
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No phases specified.
     * <!-- end-model-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 13, "none", "none" ),
    /**
     * The '<em><b>AC</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A and C.
     * <!-- end-model-doc -->
     * @see #AC_VALUE
     * @generated
     * @ordered
     */
    AC( 14, "AC", "AC" ),
    /**
     * The '<em><b>AB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A and B.
     * <!-- end-model-doc -->
     * @see #AB_VALUE
     * @generated
     * @ordered
     */
    AB( 15, "AB", "AB" ),
    /**
     * The '<em><b>AN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A and neutral.
     * <!-- end-model-doc -->
     * @see #AN_VALUE
     * @generated
     * @ordered
     */
    AN( 16, "AN", "AN" ),
    /**
     * The '<em><b>BC</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases B and C.
     * <!-- end-model-doc -->
     * @see #BC_VALUE
     * @generated
     * @ordered
     */
    BC( 17, "BC", "BC" ),
    /**
     * The '<em><b>BN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases B and neutral.
     * <!-- end-model-doc -->
     * @see #BN_VALUE
     * @generated
     * @ordered
     */
    BN( 18, "BN", "BN" ),
    /**
     * The '<em><b>CN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases C and neutral.
     * <!-- end-model-doc -->
     * @see #CN_VALUE
     * @generated
     * @ordered
     */
    CN( 19, "CN", "CN" ),
    /**
     * The '<em><b>ABN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, B, and neutral.
     * <!-- end-model-doc -->
     * @see #ABN_VALUE
     * @generated
     * @ordered
     */
    ABN( 20, "ABN", "ABN" ),
    /**
     * The '<em><b>ABC</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, B, and C.
     * <!-- end-model-doc -->
     * @see #ABC_VALUE
     * @generated
     * @ordered
     */
    ABC( 21, "ABC", "ABC" ),
    /**
     * The '<em><b>ACN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, C and neutral.
     * <!-- end-model-doc -->
     * @see #ACN_VALUE
     * @generated
     * @ordered
     */
    ACN( 22, "ACN", "ACN" ),
    /**
     * The '<em><b>S12N</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phases 1, 2, and neutral.
     * <!-- end-model-doc -->
     * @see #S12_N_VALUE
     * @generated
     * @ordered
     */
    S12_N( 23, "s12N", "s12N" ),
    /**
     * The '<em><b>ABCN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, B, C, and N.
     * <!-- end-model-doc -->
     * @see #ABCN_VALUE
     * @generated
     * @ordered
     */
    ABCN( 24, "ABCN", "ABCN" ),
    /**
     * The '<em><b>S2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 2.
     * <!-- end-model-doc -->
     * @see #S2_VALUE
     * @generated
     * @ordered
     */
    S2( 25, "s2", "s2" ),
    /**
     * The '<em><b>S1</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 1.
     * <!-- end-model-doc -->
     * @see #S1_VALUE
     * @generated
     * @ordered
     */
    S1( 26, "s1", "s1" );

    /**
     * The '<em><b>BCN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases B, C, and neutral.
     * <!-- end-model-doc -->
     * @see #BCN
     * @model
     * @generated
     * @ordered
     */
    public static final int BCN_VALUE = 1;

    /**
     * The '<em><b>XY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Two unknown non-neutral phases.
     * <!-- end-model-doc -->
     * @see #XY
     * @model
     * @generated
     * @ordered
     */
    public static final int XY_VALUE = 2;

    /**
     * The '<em><b>XN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unknown non-neutral phase plus neutral.
     * <!-- end-model-doc -->
     * @see #XN
     * @model
     * @generated
     * @ordered
     */
    public static final int XN_VALUE = 3;

    /**
     * The '<em><b>N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Neutral phase.
     * <!-- end-model-doc -->
     * @see #N
     * @model
     * @generated
     * @ordered
     */
    public static final int N_VALUE = 4;

    /**
     * The '<em><b>C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase C.
     * <!-- end-model-doc -->
     * @see #C
     * @model
     * @generated
     * @ordered
     */
    public static final int C_VALUE = 5;

    /**
     * The '<em><b>B</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase B.
     * <!-- end-model-doc -->
     * @see #B
     * @model
     * @generated
     * @ordered
     */
    public static final int B_VALUE = 6;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase A.
     * <!-- end-model-doc -->
     * @see #A
     * @model
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 7;

    /**
     * The '<em><b>X</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unknown non-neutral phase.
     * <!-- end-model-doc -->
     * @see #X
     * @model
     * @generated
     * @ordered
     */
    public static final int X_VALUE = 8;

    /**
     * The '<em><b>S2N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 2 and neutral.
     * <!-- end-model-doc -->
     * @see #S2_N
     * @model name="s2N"
     * @generated
     * @ordered
     */
    public static final int S2_N_VALUE = 9;

    /**
     * The '<em><b>S12</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 1 and 2.
     * <!-- end-model-doc -->
     * @see #S12
     * @model name="s12"
     * @generated
     * @ordered
     */
    public static final int S12_VALUE = 10;

    /**
     * The '<em><b>S1N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 1 and neutral.
     * <!-- end-model-doc -->
     * @see #S1_N
     * @model name="s1N"
     * @generated
     * @ordered
     */
    public static final int S1_N_VALUE = 11;

    /**
     * The '<em><b>XYN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Two unknown non-neutral phases plus neutral.
     * <!-- end-model-doc -->
     * @see #XYN
     * @model
     * @generated
     * @ordered
     */
    public static final int XYN_VALUE = 12;

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No phases specified.
     * <!-- end-model-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 13;

    /**
     * The '<em><b>AC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A and C.
     * <!-- end-model-doc -->
     * @see #AC
     * @model
     * @generated
     * @ordered
     */
    public static final int AC_VALUE = 14;

    /**
     * The '<em><b>AB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A and B.
     * <!-- end-model-doc -->
     * @see #AB
     * @model
     * @generated
     * @ordered
     */
    public static final int AB_VALUE = 15;

    /**
     * The '<em><b>AN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A and neutral.
     * <!-- end-model-doc -->
     * @see #AN
     * @model
     * @generated
     * @ordered
     */
    public static final int AN_VALUE = 16;

    /**
     * The '<em><b>BC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases B and C.
     * <!-- end-model-doc -->
     * @see #BC
     * @model
     * @generated
     * @ordered
     */
    public static final int BC_VALUE = 17;

    /**
     * The '<em><b>BN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases B and neutral.
     * <!-- end-model-doc -->
     * @see #BN
     * @model
     * @generated
     * @ordered
     */
    public static final int BN_VALUE = 18;

    /**
     * The '<em><b>CN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases C and neutral.
     * <!-- end-model-doc -->
     * @see #CN
     * @model
     * @generated
     * @ordered
     */
    public static final int CN_VALUE = 19;

    /**
     * The '<em><b>ABN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, B, and neutral.
     * <!-- end-model-doc -->
     * @see #ABN
     * @model
     * @generated
     * @ordered
     */
    public static final int ABN_VALUE = 20;

    /**
     * The '<em><b>ABC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, B, and C.
     * <!-- end-model-doc -->
     * @see #ABC
     * @model
     * @generated
     * @ordered
     */
    public static final int ABC_VALUE = 21;

    /**
     * The '<em><b>ACN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, C and neutral.
     * <!-- end-model-doc -->
     * @see #ACN
     * @model
     * @generated
     * @ordered
     */
    public static final int ACN_VALUE = 22;

    /**
     * The '<em><b>S12N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phases 1, 2, and neutral.
     * <!-- end-model-doc -->
     * @see #S12_N
     * @model name="s12N"
     * @generated
     * @ordered
     */
    public static final int S12_N_VALUE = 23;

    /**
     * The '<em><b>ABCN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phases A, B, C, and N.
     * <!-- end-model-doc -->
     * @see #ABCN
     * @model
     * @generated
     * @ordered
     */
    public static final int ABCN_VALUE = 24;

    /**
     * The '<em><b>S2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 2.
     * <!-- end-model-doc -->
     * @see #S2
     * @model name="s2"
     * @generated
     * @ordered
     */
    public static final int S2_VALUE = 25;

    /**
     * The '<em><b>S1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary phase 1.
     * <!-- end-model-doc -->
     * @see #S1
     * @model name="s1"
     * @generated
     * @ordered
     */
    public static final int S1_VALUE = 26;

    /**
     * An array of all the '<em><b>Phase Code</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PhaseCode[] VALUES_ARRAY = new PhaseCode[] {
            BCN,
            XY,
            XN,
            N,
            C,
            B,
            A,
            X,
            S2_N,
            S12,
            S1_N,
            XYN,
            NONE,
            AC,
            AB,
            AN,
            BC,
            BN,
            CN,
            ABN,
            ABC,
            ACN,
            S12_N,
            ABCN,
            S2,
            S1,
    };

    /**
     * A public read-only list of all the '<em><b>Phase Code</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< PhaseCode > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Phase Code</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PhaseCode get( String literal ) {
        for( PhaseCode result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Phase Code</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PhaseCode getByName( String name ) {
        for( PhaseCode result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Phase Code</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PhaseCode get( int value ) {
        switch( value ) {
        case BCN_VALUE:
            return BCN;
        case XY_VALUE:
            return XY;
        case XN_VALUE:
            return XN;
        case N_VALUE:
            return N;
        case C_VALUE:
            return C;
        case B_VALUE:
            return B;
        case A_VALUE:
            return A;
        case X_VALUE:
            return X;
        case S2_N_VALUE:
            return S2_N;
        case S12_VALUE:
            return S12;
        case S1_N_VALUE:
            return S1_N;
        case XYN_VALUE:
            return XYN;
        case NONE_VALUE:
            return NONE;
        case AC_VALUE:
            return AC;
        case AB_VALUE:
            return AB;
        case AN_VALUE:
            return AN;
        case BC_VALUE:
            return BC;
        case BN_VALUE:
            return BN;
        case CN_VALUE:
            return CN;
        case ABN_VALUE:
            return ABN;
        case ABC_VALUE:
            return ABC;
        case ACN_VALUE:
            return ACN;
        case S12_N_VALUE:
            return S12_N;
        case ABCN_VALUE:
            return ABCN;
        case S2_VALUE:
            return S2;
        case S1_VALUE:
            return S1;
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
    private PhaseCode( int value, String name, String literal ) {
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

} //PhaseCode
