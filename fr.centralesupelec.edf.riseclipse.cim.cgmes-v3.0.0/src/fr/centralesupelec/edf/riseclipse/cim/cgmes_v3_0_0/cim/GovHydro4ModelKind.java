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
 * A representation of the literals of the enumeration '<em><b>Gov Hydro4 Model Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Possible types of GovHydro4 models.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4ModelKind()
 * @model
 * @generated
 */
public enum GovHydro4ModelKind implements Enumerator {
    /**
     * The '<em><b>Francis Pelton</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Francis or Pelton model.
     * <!-- end-model-doc -->
     * @see #FRANCIS_PELTON_VALUE
     * @generated
     * @ordered
     */
    FRANCIS_PELTON( 1, "francisPelton", "francisPelton" ),

    /**
     * The '<em><b>Kaplan</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan model.
     * <!-- end-model-doc -->
     * @see #KAPLAN_VALUE
     * @generated
     * @ordered
     */
    KAPLAN( 2, "kaplan", "kaplan" ),

    /**
     * The '<em><b>Simple</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Simple model.
     * <!-- end-model-doc -->
     * @see #SIMPLE_VALUE
     * @generated
     * @ordered
     */
    SIMPLE( 3, "simple", "simple" );

    /**
     * The '<em><b>Francis Pelton</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Francis or Pelton model.
     * <!-- end-model-doc -->
     * @see #FRANCIS_PELTON
     * @model name="francisPelton"
     * @generated
     * @ordered
     */
    public static final int FRANCIS_PELTON_VALUE = 1;

    /**
     * The '<em><b>Kaplan</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan model.
     * <!-- end-model-doc -->
     * @see #KAPLAN
     * @model name="kaplan"
     * @generated
     * @ordered
     */
    public static final int KAPLAN_VALUE = 2;

    /**
     * The '<em><b>Simple</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Simple model.
     * <!-- end-model-doc -->
     * @see #SIMPLE
     * @model name="simple"
     * @generated
     * @ordered
     */
    public static final int SIMPLE_VALUE = 3;

    /**
     * An array of all the '<em><b>Gov Hydro4 Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final GovHydro4ModelKind[] VALUES_ARRAY = new GovHydro4ModelKind[] {
            FRANCIS_PELTON,
            KAPLAN,
            SIMPLE,
    };

    /**
     * A public read-only list of all the '<em><b>Gov Hydro4 Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< GovHydro4ModelKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Gov Hydro4 Model Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GovHydro4ModelKind get( String literal ) {
        for( GovHydro4ModelKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Gov Hydro4 Model Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GovHydro4ModelKind getByName( String name ) {
        for( GovHydro4ModelKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Gov Hydro4 Model Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GovHydro4ModelKind get( int value ) {
        switch( value ) {
        case FRANCIS_PELTON_VALUE:
            return FRANCIS_PELTON;
        case KAPLAN_VALUE:
            return KAPLAN;
        case SIMPLE_VALUE:
            return SIMPLE;
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
    private GovHydro4ModelKind( int value, String name, String literal ) {
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

} //GovHydro4ModelKind
