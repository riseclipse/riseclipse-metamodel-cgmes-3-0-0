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
 * A representation of the literals of the enumeration '<em><b>Operational Limit Direction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The direction attribute describes the side of  a limit that is a violation.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitDirectionKind()
 * @model
 * @generated
 */
public enum OperationalLimitDirectionKind implements Enumerator {
    /**
     * The '<em><b>High</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High means that a monitored value above the limit value is a violation.   If applied to a terminal flow, the positive direction is into the terminal.
     * <!-- end-model-doc -->
     * @see #HIGH_VALUE
     * @generated
     * @ordered
     */
    HIGH( 1, "high", "high" ),

    /**
     * The '<em><b>Absolute Value</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An absoluteValue limit means that a monitored absolute value above the limit value is a violation.
     * <!-- end-model-doc -->
     * @see #ABSOLUTE_VALUE_VALUE
     * @generated
     * @ordered
     */
    ABSOLUTE_VALUE( 2, "absoluteValue", "absoluteValue" ),
    /**
     * The '<em><b>Low</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low means a monitored value below the limit is a violation.  If applied to a terminal flow, the positive direction is into the terminal.
     * <!-- end-model-doc -->
     * @see #LOW_VALUE
     * @generated
     * @ordered
     */
    LOW( 3, "low", "low" );

    /**
     * The '<em><b>High</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High means that a monitored value above the limit value is a violation.   If applied to a terminal flow, the positive direction is into the terminal.
     * <!-- end-model-doc -->
     * @see #HIGH
     * @model name="high"
     * @generated
     * @ordered
     */
    public static final int HIGH_VALUE = 1;

    /**
     * The '<em><b>Absolute Value</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An absoluteValue limit means that a monitored absolute value above the limit value is a violation.
     * <!-- end-model-doc -->
     * @see #ABSOLUTE_VALUE
     * @model name="absoluteValue"
     * @generated
     * @ordered
     */
    public static final int ABSOLUTE_VALUE_VALUE = 2;

    /**
     * The '<em><b>Low</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low means a monitored value below the limit is a violation.  If applied to a terminal flow, the positive direction is into the terminal.
     * <!-- end-model-doc -->
     * @see #LOW
     * @model name="low"
     * @generated
     * @ordered
     */
    public static final int LOW_VALUE = 3;

    /**
     * An array of all the '<em><b>Operational Limit Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OperationalLimitDirectionKind[] VALUES_ARRAY = new OperationalLimitDirectionKind[] {
            HIGH,
            ABSOLUTE_VALUE,
            LOW,
    };

    /**
     * A public read-only list of all the '<em><b>Operational Limit Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OperationalLimitDirectionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Operational Limit Direction Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperationalLimitDirectionKind get( String literal ) {
        for( OperationalLimitDirectionKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Operational Limit Direction Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperationalLimitDirectionKind getByName( String name ) {
        for( OperationalLimitDirectionKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Operational Limit Direction Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperationalLimitDirectionKind get( int value ) {
        switch( value ) {
        case HIGH_VALUE:
            return HIGH;
        case ABSOLUTE_VALUE_VALUE:
            return ABSOLUTE_VALUE;
        case LOW_VALUE:
            return LOW;
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
    private OperationalLimitDirectionKind( int value, String name, String literal ) {
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

} //OperationalLimitDirectionKind
