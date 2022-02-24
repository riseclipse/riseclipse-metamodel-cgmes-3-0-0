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
 * A representation of the literals of the enumeration '<em><b>Wind Lookup Table Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Function of the lookup table.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindLookupTableFunctionKind()
 * @model
 * @generated
 */
public enum WindLookupTableFunctionKind implements Enumerator {
    /**
     * The '<em><b>Qwp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Look up table for the UQ static mode (q<sub>WP</sub>(u<sub>err</sub>)). It is used for the voltage and reactive power control model, IEC 61400-27-1:2015, Annex D.
     * <!-- end-model-doc -->
     * @see #QWP_VALUE
     * @generated
     * @ordered
     */
    QWP( 1, "qwp", "qwp" ),

    /**
     * The '<em><b>Qmaxp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for active power dependency of reactive power maximum limit (q<sub>maxp</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMAXP_VALUE
     * @generated
     * @ordered
     */
    QMAXP( 2, "qmaxp", "qmaxp" ),

    /**
     * The '<em><b>Iqmax</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of reactive current limits (i<sub>qmax</sub>(u<sub>WT</sub>)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
     * <!-- end-model-doc -->
     * @see #IQMAX_VALUE
     * @generated
     * @ordered
     */
    IQMAX( 3, "iqmax", "iqmax" ),

    /**
     * The '<em><b>Qmaxu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of reactive power maximum limit (q<sub>maxu</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMAXU_VALUE
     * @generated
     * @ordered
     */
    QMAXU( 4, "qmaxu", "qmaxu" ),

    /**
     * The '<em><b>Tcwdu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Crowbar duration versus voltage variation look-up table (T<sub>CW</sub>(du)). It is a case-dependent parameter. It is used for the type 3B generator set model, IEC 61400-27-1:2015, 5.6.3.3.
     * <!-- end-model-doc -->
     * @see #TCWDU_VALUE
     * @generated
     * @ordered
     */
    TCWDU( 5, "tcwdu", "tcwdu" ),

    /**
     * The '<em><b>Ipmax</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of active current limits (i<sub>pmax</sub>(u<sub>WT</sub>)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
     * <!-- end-model-doc -->
     * @see #IPMAX_VALUE
     * @generated
     * @ordered
     */
    IPMAX( 6, "ipmax", "ipmax" ),

    /**
     * The '<em><b>Prr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power versus speed change (negative slip) lookup table (p<sub>rr</sub>(deltaomega)). It is used for the rotor resistance control model, IEC 61400-27-1:2015, 5.6.5.3.
     * <!-- end-model-doc -->
     * @see #PRR_VALUE
     * @generated
     * @ordered
     */
    PRR( 7, "prr", "prr" ),

    /**
     * The '<em><b>Pwp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power vs. frequency lookup table (p<sub>WPbias</sub>(f)). It is used for the wind power plant frequency and active power control model, IEC 61400-27-1:2015, Annex D.
     * <!-- end-model-doc -->
     * @see #PWP_VALUE
     * @generated
     * @ordered
     */
    PWP( 8, "pwp", "pwp" ),

    /**
     * The '<em><b>Tfunder</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus under-frequency lookup table (T<sub>funder</sub>(f<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TFUNDER_VALUE
     * @generated
     * @ordered
     */
    TFUNDER( 9, "tfunder", "tfunder" ),

    /**
     * The '<em><b>Tuunder</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus under-voltage lookup table (T<sub>uunder</sub>(u<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TUUNDER_VALUE
     * @generated
     * @ordered
     */
    TUUNDER( 10, "tuunder", "tuunder" ),

    /**
     * The '<em><b>Tuover</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus over-voltage lookup table (T<sub>uover</sub>(u<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TUOVER_VALUE
     * @generated
     * @ordered
     */
    TUOVER( 11, "tuover", "tuover" ),

    /**
     * The '<em><b>Tfover</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus over-frequency lookup table (T<sub>fover</sub>(f<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TFOVER_VALUE
     * @generated
     * @ordered
     */
    TFOVER( 12, "tfover", "tfover" ),

    /**
     * The '<em><b>Tduwt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table to determine the duration of the power reduction after a voltage dip, depending on the size of the voltage dip (T<sub>d</sub>(u<sub>WT</sub>)). It is a type-dependent parameter. It is used for the pitch control power model, IEC 61400-27-1:2015, 5.6.5.1.
     * <!-- end-model-doc -->
     * @see #TDUWT_VALUE
     * @generated
     * @ordered
     */
    TDUWT( 13, "tduwt", "tduwt" ),

    /**
     * The '<em><b>Qminu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of reactive power minimum limit (q<sub>minu</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMINU_VALUE
     * @generated
     * @ordered
     */
    QMINU( 14, "qminu", "qminu" ),

    /**
     * The '<em><b>Qminp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for active power dependency of reactive power minimum limit (q<sub>minp</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMINP_VALUE
     * @generated
     * @ordered
     */
    QMINP( 15, "qminp", "qminp" ),

    /**
     * The '<em><b>Omegap</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power vs. speed lookup table (omega(p)). It is used for the P control model type 3, IEC 61400-27-1:2015, 5.6.5.4.
     * <!-- end-model-doc -->
     * @see #OMEGAP_VALUE
     * @generated
     * @ordered
     */
    OMEGAP( 16, "omegap", "omegap" );

    /**
     * The '<em><b>Qwp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Look up table for the UQ static mode (q<sub>WP</sub>(u<sub>err</sub>)). It is used for the voltage and reactive power control model, IEC 61400-27-1:2015, Annex D.
     * <!-- end-model-doc -->
     * @see #QWP
     * @model name="qwp"
     * @generated
     * @ordered
     */
    public static final int QWP_VALUE = 1;

    /**
     * The '<em><b>Qmaxp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for active power dependency of reactive power maximum limit (q<sub>maxp</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMAXP
     * @model name="qmaxp"
     * @generated
     * @ordered
     */
    public static final int QMAXP_VALUE = 2;

    /**
     * The '<em><b>Iqmax</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of reactive current limits (i<sub>qmax</sub>(u<sub>WT</sub>)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
     * <!-- end-model-doc -->
     * @see #IQMAX
     * @model name="iqmax"
     * @generated
     * @ordered
     */
    public static final int IQMAX_VALUE = 3;

    /**
     * The '<em><b>Qmaxu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of reactive power maximum limit (q<sub>maxu</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMAXU
     * @model name="qmaxu"
     * @generated
     * @ordered
     */
    public static final int QMAXU_VALUE = 4;

    /**
     * The '<em><b>Tcwdu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Crowbar duration versus voltage variation look-up table (T<sub>CW</sub>(du)). It is a case-dependent parameter. It is used for the type 3B generator set model, IEC 61400-27-1:2015, 5.6.3.3.
     * <!-- end-model-doc -->
     * @see #TCWDU
     * @model name="tcwdu"
     * @generated
     * @ordered
     */
    public static final int TCWDU_VALUE = 5;

    /**
     * The '<em><b>Ipmax</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of active current limits (i<sub>pmax</sub>(u<sub>WT</sub>)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
     * <!-- end-model-doc -->
     * @see #IPMAX
     * @model name="ipmax"
     * @generated
     * @ordered
     */
    public static final int IPMAX_VALUE = 6;

    /**
     * The '<em><b>Prr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power versus speed change (negative slip) lookup table (p<sub>rr</sub>(deltaomega)). It is used for the rotor resistance control model, IEC 61400-27-1:2015, 5.6.5.3.
     * <!-- end-model-doc -->
     * @see #PRR
     * @model name="prr"
     * @generated
     * @ordered
     */
    public static final int PRR_VALUE = 7;

    /**
     * The '<em><b>Pwp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power vs. frequency lookup table (p<sub>WPbias</sub>(f)). It is used for the wind power plant frequency and active power control model, IEC 61400-27-1:2015, Annex D.
     * <!-- end-model-doc -->
     * @see #PWP
     * @model name="pwp"
     * @generated
     * @ordered
     */
    public static final int PWP_VALUE = 8;

    /**
     * The '<em><b>Tfunder</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus under-frequency lookup table (T<sub>funder</sub>(f<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TFUNDER
     * @model name="tfunder"
     * @generated
     * @ordered
     */
    public static final int TFUNDER_VALUE = 9;

    /**
     * The '<em><b>Tuunder</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus under-voltage lookup table (T<sub>uunder</sub>(u<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TUUNDER
     * @model name="tuunder"
     * @generated
     * @ordered
     */
    public static final int TUUNDER_VALUE = 10;

    /**
     * The '<em><b>Tuover</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus over-voltage lookup table (T<sub>uover</sub>(u<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TUOVER
     * @model name="tuover"
     * @generated
     * @ordered
     */
    public static final int TUOVER_VALUE = 11;

    /**
     * The '<em><b>Tfover</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Disconnection time versus over-frequency lookup table (T<sub>fover</sub>(f<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     * <!-- end-model-doc -->
     * @see #TFOVER
     * @model name="tfover"
     * @generated
     * @ordered
     */
    public static final int TFOVER_VALUE = 12;

    /**
     * The '<em><b>Tduwt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table to determine the duration of the power reduction after a voltage dip, depending on the size of the voltage dip (T<sub>d</sub>(u<sub>WT</sub>)). It is a type-dependent parameter. It is used for the pitch control power model, IEC 61400-27-1:2015, 5.6.5.1.
     * <!-- end-model-doc -->
     * @see #TDUWT
     * @model name="tduwt"
     * @generated
     * @ordered
     */
    public static final int TDUWT_VALUE = 13;

    /**
     * The '<em><b>Qminu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for voltage dependency of reactive power minimum limit (q<sub>minu</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMINU
     * @model name="qminu"
     * @generated
     * @ordered
     */
    public static final int QMINU_VALUE = 14;

    /**
     * The '<em><b>Qminp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lookup table for active power dependency of reactive power minimum limit (q<sub>minp</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     * <!-- end-model-doc -->
     * @see #QMINP
     * @model name="qminp"
     * @generated
     * @ordered
     */
    public static final int QMINP_VALUE = 15;

    /**
     * The '<em><b>Omegap</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power vs. speed lookup table (omega(p)). It is used for the P control model type 3, IEC 61400-27-1:2015, 5.6.5.4.
     * <!-- end-model-doc -->
     * @see #OMEGAP
     * @model name="omegap"
     * @generated
     * @ordered
     */
    public static final int OMEGAP_VALUE = 16;

    /**
     * An array of all the '<em><b>Wind Lookup Table Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WindLookupTableFunctionKind[] VALUES_ARRAY = new WindLookupTableFunctionKind[] {
            QWP,
            QMAXP,
            IQMAX,
            QMAXU,
            TCWDU,
            IPMAX,
            PRR,
            PWP,
            TFUNDER,
            TUUNDER,
            TUOVER,
            TFOVER,
            TDUWT,
            QMINU,
            QMINP,
            OMEGAP,
    };

    /**
     * A public read-only list of all the '<em><b>Wind Lookup Table Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WindLookupTableFunctionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind get( String literal ) {
        for( WindLookupTableFunctionKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind getByName( String name ) {
        for( WindLookupTableFunctionKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wind Lookup Table Function Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WindLookupTableFunctionKind get( int value ) {
        switch( value ) {
        case QWP_VALUE:
            return QWP;
        case QMAXP_VALUE:
            return QMAXP;
        case IQMAX_VALUE:
            return IQMAX;
        case QMAXU_VALUE:
            return QMAXU;
        case TCWDU_VALUE:
            return TCWDU;
        case IPMAX_VALUE:
            return IPMAX;
        case PRR_VALUE:
            return PRR;
        case PWP_VALUE:
            return PWP;
        case TFUNDER_VALUE:
            return TFUNDER;
        case TUUNDER_VALUE:
            return TUUNDER;
        case TUOVER_VALUE:
            return TUOVER;
        case TFOVER_VALUE:
            return TFOVER;
        case TDUWT_VALUE:
            return TDUWT;
        case QMINU_VALUE:
            return QMINU;
        case QMINP_VALUE:
            return QMINP;
        case OMEGAP_VALUE:
            return OMEGAP;
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
    private WindLookupTableFunctionKind( int value, String name, String literal ) {
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

} //WindLookupTableFunctionKind
