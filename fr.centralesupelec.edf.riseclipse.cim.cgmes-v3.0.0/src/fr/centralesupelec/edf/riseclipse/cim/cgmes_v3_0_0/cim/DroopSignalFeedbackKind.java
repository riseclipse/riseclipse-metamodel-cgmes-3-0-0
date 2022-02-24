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
 * A representation of the literals of the enumeration '<em><b>Droop Signal Feedback Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Governor droop signal feedback source.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDroopSignalFeedbackKind()
 * @model
 * @generated
 */
public enum DroopSignalFeedbackKind implements Enumerator {
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No droop signal feedback, is isochronous governor.
     * <!-- end-model-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 1, "none", "none" ),

    /**
     * The '<em><b>Governor Output</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor output feedback (requested stroke) (connection indicated as 3 in the block diagrams of models, e.g. GovCT1, GovCT2).
     * <!-- end-model-doc -->
     * @see #GOVERNOR_OUTPUT_VALUE
     * @generated
     * @ordered
     */
    GOVERNOR_OUTPUT( 2, "governorOutput", "governorOutput" ),

    /**
     * The '<em><b>Electrical Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electrical power feedback (connection indicated as 1 in the block diagrams of models, e.g. GovCT1, GovCT2).
     * <!-- end-model-doc -->
     * @see #ELECTRICAL_POWER_VALUE
     * @generated
     * @ordered
     */
    ELECTRICAL_POWER( 3, "electricalPower", "electricalPower" ),

    /**
     * The '<em><b>Fuel Valve Stroke</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel valve stroke feedback (true stroke) (connection indicated as 2 in the block diagrams of model, e.g. GovCT1, GovCT2).
     * <!-- end-model-doc -->
     * @see #FUEL_VALVE_STROKE_VALUE
     * @generated
     * @ordered
     */
    FUEL_VALVE_STROKE( 4, "fuelValveStroke", "fuelValveStroke" );

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No droop signal feedback, is isochronous governor.
     * <!-- end-model-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 1;

    /**
     * The '<em><b>Governor Output</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor output feedback (requested stroke) (connection indicated as 3 in the block diagrams of models, e.g. GovCT1, GovCT2).
     * <!-- end-model-doc -->
     * @see #GOVERNOR_OUTPUT
     * @model name="governorOutput"
     * @generated
     * @ordered
     */
    public static final int GOVERNOR_OUTPUT_VALUE = 2;

    /**
     * The '<em><b>Electrical Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electrical power feedback (connection indicated as 1 in the block diagrams of models, e.g. GovCT1, GovCT2).
     * <!-- end-model-doc -->
     * @see #ELECTRICAL_POWER
     * @model name="electricalPower"
     * @generated
     * @ordered
     */
    public static final int ELECTRICAL_POWER_VALUE = 3;

    /**
     * The '<em><b>Fuel Valve Stroke</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel valve stroke feedback (true stroke) (connection indicated as 2 in the block diagrams of model, e.g. GovCT1, GovCT2).
     * <!-- end-model-doc -->
     * @see #FUEL_VALVE_STROKE
     * @model name="fuelValveStroke"
     * @generated
     * @ordered
     */
    public static final int FUEL_VALVE_STROKE_VALUE = 4;

    /**
     * An array of all the '<em><b>Droop Signal Feedback Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DroopSignalFeedbackKind[] VALUES_ARRAY = new DroopSignalFeedbackKind[] {
            NONE,
            GOVERNOR_OUTPUT,
            ELECTRICAL_POWER,
            FUEL_VALVE_STROKE,
    };

    /**
     * A public read-only list of all the '<em><b>Droop Signal Feedback Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< DroopSignalFeedbackKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Droop Signal Feedback Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DroopSignalFeedbackKind get( String literal ) {
        for( DroopSignalFeedbackKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Droop Signal Feedback Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DroopSignalFeedbackKind getByName( String name ) {
        for( DroopSignalFeedbackKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Droop Signal Feedback Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DroopSignalFeedbackKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case GOVERNOR_OUTPUT_VALUE:
            return GOVERNOR_OUTPUT;
        case ELECTRICAL_POWER_VALUE:
            return ELECTRICAL_POWER;
        case FUEL_VALVE_STROKE_VALUE:
            return FUEL_VALVE_STROKE;
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
    private DroopSignalFeedbackKind( int value, String name, String literal ) {
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

} //DroopSignalFeedbackKind
