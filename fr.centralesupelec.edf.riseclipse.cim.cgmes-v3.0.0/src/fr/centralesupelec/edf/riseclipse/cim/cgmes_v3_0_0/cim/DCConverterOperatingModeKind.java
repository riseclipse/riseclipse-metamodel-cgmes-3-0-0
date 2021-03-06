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
 * A representation of the literals of the enumeration '<em><b>DC Converter Operating Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The operating mode of an HVDC bipole.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConverterOperatingModeKind()
 * @model
 * @generated
 */
public enum DCConverterOperatingModeKind implements Enumerator {
    /**
     * The '<em><b>Monopolar Metallic Return</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Monopolar operation with metallic return.
     * <!-- end-model-doc -->
     * @see #MONOPOLAR_METALLIC_RETURN_VALUE
     * @generated
     * @ordered
     */
    MONOPOLAR_METALLIC_RETURN( 1, "monopolarMetallicReturn", "monopolarMetallicReturn" ),

    /**
     * The '<em><b>Bipolar</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bipolar operation.
     * <!-- end-model-doc -->
     * @see #BIPOLAR_VALUE
     * @generated
     * @ordered
     */
    BIPOLAR( 2, "bipolar", "bipolar" ),
    /**
     * The '<em><b>Monopolar Ground Return</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Monopolar operation with ground return.
     * <!-- end-model-doc -->
     * @see #MONOPOLAR_GROUND_RETURN_VALUE
     * @generated
     * @ordered
     */
    MONOPOLAR_GROUND_RETURN( 3, "monopolarGroundReturn", "monopolarGroundReturn" );

    /**
     * The '<em><b>Monopolar Metallic Return</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Monopolar operation with metallic return.
     * <!-- end-model-doc -->
     * @see #MONOPOLAR_METALLIC_RETURN
     * @model name="monopolarMetallicReturn"
     * @generated
     * @ordered
     */
    public static final int MONOPOLAR_METALLIC_RETURN_VALUE = 1;

    /**
     * The '<em><b>Bipolar</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bipolar operation.
     * <!-- end-model-doc -->
     * @see #BIPOLAR
     * @model name="bipolar"
     * @generated
     * @ordered
     */
    public static final int BIPOLAR_VALUE = 2;

    /**
     * The '<em><b>Monopolar Ground Return</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Monopolar operation with ground return.
     * <!-- end-model-doc -->
     * @see #MONOPOLAR_GROUND_RETURN
     * @model name="monopolarGroundReturn"
     * @generated
     * @ordered
     */
    public static final int MONOPOLAR_GROUND_RETURN_VALUE = 3;

    /**
     * An array of all the '<em><b>DC Converter Operating Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DCConverterOperatingModeKind[] VALUES_ARRAY = new DCConverterOperatingModeKind[] {
            MONOPOLAR_METALLIC_RETURN,
            BIPOLAR,
            MONOPOLAR_GROUND_RETURN,
    };

    /**
     * A public read-only list of all the '<em><b>DC Converter Operating Mode Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< DCConverterOperatingModeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>DC Converter Operating Mode Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DCConverterOperatingModeKind get( String literal ) {
        for( DCConverterOperatingModeKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DC Converter Operating Mode Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DCConverterOperatingModeKind getByName( String name ) {
        for( DCConverterOperatingModeKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DC Converter Operating Mode Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DCConverterOperatingModeKind get( int value ) {
        switch( value ) {
        case MONOPOLAR_METALLIC_RETURN_VALUE:
            return MONOPOLAR_METALLIC_RETURN;
        case BIPOLAR_VALUE:
            return BIPOLAR;
        case MONOPOLAR_GROUND_RETURN_VALUE:
            return MONOPOLAR_GROUND_RETURN;
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
    private DCConverterOperatingModeKind( int value, String name, String literal ) {
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

} //DCConverterOperatingModeKind
