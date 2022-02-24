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
 * A representation of the literals of the enumeration '<em><b>Exc IEEEST1AUE Lselector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of connections for the UEL input used in ExcIEEEST1A.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST1AUELselectorKind()
 * @model
 * @generated
 */
public enum ExcIEEEST1AUELselectorKind implements Enumerator {
    /**
     * The '<em><b>Input HVgate Error Signal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input HV gate with error signal.
     * <!-- end-model-doc -->
     * @see #INPUT_HVGATE_ERROR_SIGNAL_VALUE
     * @generated
     * @ordered
     */
    INPUT_HVGATE_ERROR_SIGNAL( 1, "inputHVgateErrorSignal", "inputHVgateErrorSignal" ),

    /**
     * The '<em><b>Ignore UE Lsignal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ignore UEL signal.
     * <!-- end-model-doc -->
     * @see #IGNORE_UE_LSIGNAL_VALUE
     * @generated
     * @ordered
     */
    IGNORE_UE_LSIGNAL( 2, "ignoreUELsignal", "ignoreUELsignal" ),

    /**
     * The '<em><b>Input HVgate Voltage Output</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input HV gate with voltage regulator output.
     * <!-- end-model-doc -->
     * @see #INPUT_HVGATE_VOLTAGE_OUTPUT_VALUE
     * @generated
     * @ordered
     */
    INPUT_HVGATE_VOLTAGE_OUTPUT( 3, "inputHVgateVoltageOutput", "inputHVgateVoltageOutput" ),

    /**
     * The '<em><b>Input Added To Error Signal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input added to error signal.
     * <!-- end-model-doc -->
     * @see #INPUT_ADDED_TO_ERROR_SIGNAL_VALUE
     * @generated
     * @ordered
     */
    INPUT_ADDED_TO_ERROR_SIGNAL( 4, "inputAddedToErrorSignal", "inputAddedToErrorSignal" );

    /**
     * The '<em><b>Input HVgate Error Signal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input HV gate with error signal.
     * <!-- end-model-doc -->
     * @see #INPUT_HVGATE_ERROR_SIGNAL
     * @model name="inputHVgateErrorSignal"
     * @generated
     * @ordered
     */
    public static final int INPUT_HVGATE_ERROR_SIGNAL_VALUE = 1;

    /**
     * The '<em><b>Ignore UE Lsignal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ignore UEL signal.
     * <!-- end-model-doc -->
     * @see #IGNORE_UE_LSIGNAL
     * @model name="ignoreUELsignal"
     * @generated
     * @ordered
     */
    public static final int IGNORE_UE_LSIGNAL_VALUE = 2;

    /**
     * The '<em><b>Input HVgate Voltage Output</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input HV gate with voltage regulator output.
     * <!-- end-model-doc -->
     * @see #INPUT_HVGATE_VOLTAGE_OUTPUT
     * @model name="inputHVgateVoltageOutput"
     * @generated
     * @ordered
     */
    public static final int INPUT_HVGATE_VOLTAGE_OUTPUT_VALUE = 3;

    /**
     * The '<em><b>Input Added To Error Signal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input added to error signal.
     * <!-- end-model-doc -->
     * @see #INPUT_ADDED_TO_ERROR_SIGNAL
     * @model name="inputAddedToErrorSignal"
     * @generated
     * @ordered
     */
    public static final int INPUT_ADDED_TO_ERROR_SIGNAL_VALUE = 4;

    /**
     * An array of all the '<em><b>Exc IEEEST1AUE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ExcIEEEST1AUELselectorKind[] VALUES_ARRAY = new ExcIEEEST1AUELselectorKind[] {
            INPUT_HVGATE_ERROR_SIGNAL,
            IGNORE_UE_LSIGNAL,
            INPUT_HVGATE_VOLTAGE_OUTPUT,
            INPUT_ADDED_TO_ERROR_SIGNAL,
    };

    /**
     * A public read-only list of all the '<em><b>Exc IEEEST1AUE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ExcIEEEST1AUELselectorKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Exc IEEEST1AUE Lselector Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcIEEEST1AUELselectorKind get( String literal ) {
        for( ExcIEEEST1AUELselectorKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc IEEEST1AUE Lselector Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcIEEEST1AUELselectorKind getByName( String name ) {
        for( ExcIEEEST1AUELselectorKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc IEEEST1AUE Lselector Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcIEEEST1AUELselectorKind get( int value ) {
        switch( value ) {
        case INPUT_HVGATE_ERROR_SIGNAL_VALUE:
            return INPUT_HVGATE_ERROR_SIGNAL;
        case IGNORE_UE_LSIGNAL_VALUE:
            return IGNORE_UE_LSIGNAL;
        case INPUT_HVGATE_VOLTAGE_OUTPUT_VALUE:
            return INPUT_HVGATE_VOLTAGE_OUTPUT;
        case INPUT_ADDED_TO_ERROR_SIGNAL_VALUE:
            return INPUT_ADDED_TO_ERROR_SIGNAL;
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
    private ExcIEEEST1AUELselectorKind( int value, String name, String literal ) {
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

} //ExcIEEEST1AUELselectorKind
