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
 * A representation of the literals of the enumeration '<em><b>Hydro Energy Conversion Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specifies the capability of the hydro generating unit to convert energy as a generator or pump.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroEnergyConversionKind()
 * @model
 * @generated
 */
public enum HydroEnergyConversionKind implements Enumerator {
    /**
     * The '<em><b>Generator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Able to generate power, but not able to pump water for energy storage.
     * <!-- end-model-doc -->
     * @see #GENERATOR_VALUE
     * @generated
     * @ordered
     */
    GENERATOR( 1, "generator", "generator" ),

    /**
     * The '<em><b>Pump And Generator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Able to both generate power and pump water for energy storage.
     * <!-- end-model-doc -->
     * @see #PUMP_AND_GENERATOR_VALUE
     * @generated
     * @ordered
     */
    PUMP_AND_GENERATOR( 2, "pumpAndGenerator", "pumpAndGenerator" );

    /**
     * The '<em><b>Generator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Able to generate power, but not able to pump water for energy storage.
     * <!-- end-model-doc -->
     * @see #GENERATOR
     * @model name="generator"
     * @generated
     * @ordered
     */
    public static final int GENERATOR_VALUE = 1;

    /**
     * The '<em><b>Pump And Generator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Able to both generate power and pump water for energy storage.
     * <!-- end-model-doc -->
     * @see #PUMP_AND_GENERATOR
     * @model name="pumpAndGenerator"
     * @generated
     * @ordered
     */
    public static final int PUMP_AND_GENERATOR_VALUE = 2;

    /**
     * An array of all the '<em><b>Hydro Energy Conversion Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final HydroEnergyConversionKind[] VALUES_ARRAY = new HydroEnergyConversionKind[] {
            GENERATOR,
            PUMP_AND_GENERATOR,
    };

    /**
     * A public read-only list of all the '<em><b>Hydro Energy Conversion Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< HydroEnergyConversionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Hydro Energy Conversion Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HydroEnergyConversionKind get( String literal ) {
        for( HydroEnergyConversionKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Hydro Energy Conversion Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HydroEnergyConversionKind getByName( String name ) {
        for( HydroEnergyConversionKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Hydro Energy Conversion Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HydroEnergyConversionKind get( int value ) {
        switch( value ) {
        case GENERATOR_VALUE:
            return GENERATOR;
        case PUMP_AND_GENERATOR_VALUE:
            return PUMP_AND_GENERATOR;
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
    private HydroEnergyConversionKind( int value, String name, String literal ) {
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

} //HydroEnergyConversionKind
