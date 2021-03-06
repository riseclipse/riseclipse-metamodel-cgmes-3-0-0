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
 * A representation of the literals of the enumeration '<em><b>Control Area Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of control area.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlAreaTypeKind()
 * @model
 * @generated
 */
public enum ControlAreaTypeKind implements Enumerator {
    /**
     * The '<em><b>Forecast</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for load forecast.
     * <!-- end-model-doc -->
     * @see #FORECAST_VALUE
     * @generated
     * @ordered
     */
    FORECAST( 1, "Forecast", "Forecast" ),

    /**
     * The '<em><b>AGC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for automatic generation control.
     * <!-- end-model-doc -->
     * @see #AGC_VALUE
     * @generated
     * @ordered
     */
    AGC( 2, "AGC", "AGC" ),

    /**
     * The '<em><b>Interchange</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for interchange specification or control.
     * <!-- end-model-doc -->
     * @see #INTERCHANGE_VALUE
     * @generated
     * @ordered
     */
    INTERCHANGE( 3, "Interchange", "Interchange" );

    /**
     * The '<em><b>Forecast</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for load forecast.
     * <!-- end-model-doc -->
     * @see #FORECAST
     * @model name="Forecast"
     * @generated
     * @ordered
     */
    public static final int FORECAST_VALUE = 1;

    /**
     * The '<em><b>AGC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for automatic generation control.
     * <!-- end-model-doc -->
     * @see #AGC
     * @model
     * @generated
     * @ordered
     */
    public static final int AGC_VALUE = 2;

    /**
     * The '<em><b>Interchange</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used for interchange specification or control.
     * <!-- end-model-doc -->
     * @see #INTERCHANGE
     * @model name="Interchange"
     * @generated
     * @ordered
     */
    public static final int INTERCHANGE_VALUE = 3;

    /**
     * An array of all the '<em><b>Control Area Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ControlAreaTypeKind[] VALUES_ARRAY = new ControlAreaTypeKind[] {
            FORECAST,
            AGC,
            INTERCHANGE,
    };

    /**
     * A public read-only list of all the '<em><b>Control Area Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ControlAreaTypeKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Control Area Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ControlAreaTypeKind get( String literal ) {
        for( ControlAreaTypeKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Control Area Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ControlAreaTypeKind getByName( String name ) {
        for( ControlAreaTypeKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Control Area Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ControlAreaTypeKind get( int value ) {
        switch( value ) {
        case FORECAST_VALUE:
            return FORECAST;
        case AGC_VALUE:
            return AGC;
        case INTERCHANGE_VALUE:
            return INTERCHANGE;
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
    private ControlAreaTypeKind( int value, String name, String literal ) {
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

} //ControlAreaTypeKind
