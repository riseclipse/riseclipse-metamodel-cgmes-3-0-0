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
 * A representation of the literals of the enumeration '<em><b>Francis Governor Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Governor control flag for Francis hydro model.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getFrancisGovernorControlKind()
 * @model
 * @generated
 */
public enum FrancisGovernorControlKind implements Enumerator {
    /**
     * The '<em><b>Mechanic Hydrolic Tacho Accelerator</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanic-hydraulic regulator with tacho-accelerometer (Cflag = 1).
     * <!-- end-model-doc -->
     * @see #MECHANIC_HYDROLIC_TACHO_ACCELERATOR_VALUE
     * @generated
     * @ordered
     */
    MECHANIC_HYDROLIC_TACHO_ACCELERATOR( 1, "mechanicHydrolicTachoAccelerator", "mechanicHydrolicTachoAccelerator" ),

    /**
     * The '<em><b>Electromechanical Electrohydraulic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electromechanical and electrohydraulic regulator (Cflag=3).
     * <!-- end-model-doc -->
     * @see #ELECTROMECHANICAL_ELECTROHYDRAULIC_VALUE
     * @generated
     * @ordered
     */
    ELECTROMECHANICAL_ELECTROHYDRAULIC( 2, "electromechanicalElectrohydraulic", "electromechanicalElectrohydraulic" ),

    /**
     * The '<em><b>Mechanic Hydraulic Transient Feedback</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanic-hydraulic regulator with transient feedback (Cflag=2).
     * <!-- end-model-doc -->
     * @see #MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK_VALUE
     * @generated
     * @ordered
     */
    MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK( 3, "mechanicHydraulicTransientFeedback",
            "mechanicHydraulicTransientFeedback" );

    /**
     * The '<em><b>Mechanic Hydrolic Tacho Accelerator</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanic-hydraulic regulator with tacho-accelerometer (Cflag = 1).
     * <!-- end-model-doc -->
     * @see #MECHANIC_HYDROLIC_TACHO_ACCELERATOR
     * @model name="mechanicHydrolicTachoAccelerator"
     * @generated
     * @ordered
     */
    public static final int MECHANIC_HYDROLIC_TACHO_ACCELERATOR_VALUE = 1;

    /**
     * The '<em><b>Electromechanical Electrohydraulic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electromechanical and electrohydraulic regulator (Cflag=3).
     * <!-- end-model-doc -->
     * @see #ELECTROMECHANICAL_ELECTROHYDRAULIC
     * @model name="electromechanicalElectrohydraulic"
     * @generated
     * @ordered
     */
    public static final int ELECTROMECHANICAL_ELECTROHYDRAULIC_VALUE = 2;

    /**
     * The '<em><b>Mechanic Hydraulic Transient Feedback</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanic-hydraulic regulator with transient feedback (Cflag=2).
     * <!-- end-model-doc -->
     * @see #MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK
     * @model name="mechanicHydraulicTransientFeedback"
     * @generated
     * @ordered
     */
    public static final int MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK_VALUE = 3;

    /**
     * An array of all the '<em><b>Francis Governor Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FrancisGovernorControlKind[] VALUES_ARRAY = new FrancisGovernorControlKind[] {
            MECHANIC_HYDROLIC_TACHO_ACCELERATOR,
            ELECTROMECHANICAL_ELECTROHYDRAULIC,
            MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK,
    };

    /**
     * A public read-only list of all the '<em><b>Francis Governor Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< FrancisGovernorControlKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Francis Governor Control Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FrancisGovernorControlKind get( String literal ) {
        for( FrancisGovernorControlKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Francis Governor Control Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FrancisGovernorControlKind getByName( String name ) {
        for( FrancisGovernorControlKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Francis Governor Control Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FrancisGovernorControlKind get( int value ) {
        switch( value ) {
        case MECHANIC_HYDROLIC_TACHO_ACCELERATOR_VALUE:
            return MECHANIC_HYDROLIC_TACHO_ACCELERATOR;
        case ELECTROMECHANICAL_ELECTROHYDRAULIC_VALUE:
            return ELECTROMECHANICAL_ELECTROHYDRAULIC;
        case MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK_VALUE:
            return MECHANIC_HYDRAULIC_TRANSIENT_FEEDBACK;
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
    private FrancisGovernorControlKind( int value, String name, String literal ) {
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

} //FrancisGovernorControlKind
