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
 * A representation of the literals of the enumeration '<em><b>Cs Ppcc Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Active power control modes for HVDC line operating as Current Source Converter.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsPpccControlKind()
 * @model
 * @generated
 */
public enum CsPpccControlKind implements Enumerator {
    /**
     * The '<em><b>Dc Voltage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
     * <!-- end-model-doc -->
     * @see #DC_VOLTAGE_VALUE
     * @generated
     * @ordered
     */
    DC_VOLTAGE( 1, "dcVoltage", "dcVoltage" ),

    /**
     * The '<em><b>Dc Current</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is DC current  with target value provided by CsConverter.targetIdc.
     * <!-- end-model-doc -->
     * @see #DC_CURRENT_VALUE
     * @generated
     * @ordered
     */
    DC_CURRENT( 2, "dcCurrent", "dcCurrent" ),

    /**
     * The '<em><b>Active Power</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power control at AC side, at point of common coupling. Target is provided by ACDCConverter.targetPpcc.
     * <!-- end-model-doc -->
     * @see #ACTIVE_POWER_VALUE
     * @generated
     * @ordered
     */
    ACTIVE_POWER( 3, "activePower", "activePower" );

    /**
     * The '<em><b>Dc Voltage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
     * <!-- end-model-doc -->
     * @see #DC_VOLTAGE
     * @model name="dcVoltage"
     * @generated
     * @ordered
     */
    public static final int DC_VOLTAGE_VALUE = 1;

    /**
     * The '<em><b>Dc Current</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is DC current  with target value provided by CsConverter.targetIdc.
     * <!-- end-model-doc -->
     * @see #DC_CURRENT
     * @model name="dcCurrent"
     * @generated
     * @ordered
     */
    public static final int DC_CURRENT_VALUE = 2;

    /**
     * The '<em><b>Active Power</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power control at AC side, at point of common coupling. Target is provided by ACDCConverter.targetPpcc.
     * <!-- end-model-doc -->
     * @see #ACTIVE_POWER
     * @model name="activePower"
     * @generated
     * @ordered
     */
    public static final int ACTIVE_POWER_VALUE = 3;

    /**
     * An array of all the '<em><b>Cs Ppcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CsPpccControlKind[] VALUES_ARRAY = new CsPpccControlKind[] {
            DC_VOLTAGE,
            DC_CURRENT,
            ACTIVE_POWER,
    };

    /**
     * A public read-only list of all the '<em><b>Cs Ppcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< CsPpccControlKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Cs Ppcc Control Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CsPpccControlKind get( String literal ) {
        for( CsPpccControlKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cs Ppcc Control Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CsPpccControlKind getByName( String name ) {
        for( CsPpccControlKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cs Ppcc Control Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CsPpccControlKind get( int value ) {
        switch( value ) {
        case DC_VOLTAGE_VALUE:
            return DC_VOLTAGE;
        case DC_CURRENT_VALUE:
            return DC_CURRENT;
        case ACTIVE_POWER_VALUE:
            return ACTIVE_POWER;
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
    private CsPpccControlKind( int value, String name, String literal ) {
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

} //CsPpccControlKind
