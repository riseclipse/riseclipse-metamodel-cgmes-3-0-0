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
 * A representation of the literals of the enumeration '<em><b>Battery State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The state of the battery unit.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBatteryStateKind()
 * @model
 * @generated
 */
public enum BatteryStateKind implements Enumerator {
    /**
     * The '<em><b>Charging</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stored energy is increasing.
     * <!-- end-model-doc -->
     * @see #CHARGING_VALUE
     * @generated
     * @ordered
     */
    CHARGING( 1, "charging", "charging" ),

    /**
     * The '<em><b>Full</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unable to charge, and not discharging.
     * <!-- end-model-doc -->
     * @see #FULL_VALUE
     * @generated
     * @ordered
     */
    FULL( 2, "full", "full" ),

    /**
     * The '<em><b>Discharging</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stored energy is decreasing.
     * <!-- end-model-doc -->
     * @see #DISCHARGING_VALUE
     * @generated
     * @ordered
     */
    DISCHARGING( 3, "discharging", "discharging" ),

    /**
     * The '<em><b>Waiting</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Neither charging nor discharging, but able to do so.
     * <!-- end-model-doc -->
     * @see #WAITING_VALUE
     * @generated
     * @ordered
     */
    WAITING( 4, "waiting", "waiting" ),

    /**
     * The '<em><b>Empty</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unable to discharge, and not charging.
     * <!-- end-model-doc -->
     * @see #EMPTY_VALUE
     * @generated
     * @ordered
     */
    EMPTY( 5, "empty", "empty" );

    /**
     * The '<em><b>Charging</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stored energy is increasing.
     * <!-- end-model-doc -->
     * @see #CHARGING
     * @model name="charging"
     * @generated
     * @ordered
     */
    public static final int CHARGING_VALUE = 1;

    /**
     * The '<em><b>Full</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unable to charge, and not discharging.
     * <!-- end-model-doc -->
     * @see #FULL
     * @model name="full"
     * @generated
     * @ordered
     */
    public static final int FULL_VALUE = 2;

    /**
     * The '<em><b>Discharging</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stored energy is decreasing.
     * <!-- end-model-doc -->
     * @see #DISCHARGING
     * @model name="discharging"
     * @generated
     * @ordered
     */
    public static final int DISCHARGING_VALUE = 3;

    /**
     * The '<em><b>Waiting</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Neither charging nor discharging, but able to do so.
     * <!-- end-model-doc -->
     * @see #WAITING
     * @model name="waiting"
     * @generated
     * @ordered
     */
    public static final int WAITING_VALUE = 4;

    /**
     * The '<em><b>Empty</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unable to discharge, and not charging.
     * <!-- end-model-doc -->
     * @see #EMPTY
     * @model name="empty"
     * @generated
     * @ordered
     */
    public static final int EMPTY_VALUE = 5;

    /**
     * An array of all the '<em><b>Battery State Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BatteryStateKind[] VALUES_ARRAY = new BatteryStateKind[] {
            CHARGING,
            FULL,
            DISCHARGING,
            WAITING,
            EMPTY,
    };

    /**
     * A public read-only list of all the '<em><b>Battery State Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BatteryStateKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Battery State Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BatteryStateKind get( String literal ) {
        for( BatteryStateKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Battery State Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BatteryStateKind getByName( String name ) {
        for( BatteryStateKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Battery State Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BatteryStateKind get( int value ) {
        switch( value ) {
        case CHARGING_VALUE:
            return CHARGING;
        case FULL_VALUE:
            return FULL;
        case DISCHARGING_VALUE:
            return DISCHARGING;
        case WAITING_VALUE:
            return WAITING;
        case EMPTY_VALUE:
            return EMPTY;
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
    private BatteryStateKind( int value, String name, String literal ) {
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

} //BatteryStateKind
