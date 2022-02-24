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
 * A representation of the literals of the enumeration '<em><b>Static Load Model Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of static load model.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticLoadModelKind()
 * @model
 * @generated
 */
public enum StaticLoadModelKind implements Enumerator {
    /**
     * The '<em><b>ZIP2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This model separates the frequency-dependent load (primarily motors) from other load.  ZIP2 equations for active and reactive power are used and the following attributes are required:
     * kp1, kp2, kp3, kq4, kpf
     * kq1, kq2, kq3, kq4, kqf.
     * <!-- end-model-doc -->
     * @see #ZIP2_VALUE
     * @generated
     * @ordered
     */
    ZIP2( 1, "zIP2", "zIP2" ),

    /**
     * The '<em><b>ZIP1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This model integrates the frequency-dependent load (primarily motors).  ZIP1 equations for active and reactive power are used and the following attributes are required:
     * kp1, kp2, kp3, kpf
     * kq1, kq2, kq3, kqf.
     * <!-- end-model-doc -->
     * @see #ZIP1_VALUE
     * @generated
     * @ordered
     */
    ZIP1( 2, "zIP1", "zIP1" ),

    /**
     * The '<em><b>Constant Z</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The load is represented as a constant impedance.  ConstantZ equations are used  for active and reactive power and no attributes are required.
     * <!-- end-model-doc -->
     * @see #CONSTANT_Z_VALUE
     * @generated
     * @ordered
     */
    CONSTANT_Z( 3, "constantZ", "constantZ" ),

    /**
     * The '<em><b>Exponential</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This model is an exponential representation of the load. Exponential equations for active and reactive power are used and the following attributes are required:
     * kp1, kp2, kp3, kpf, ep1, ep2, ep3
     * kq1, kq2, kq3, kqf, eq1, eq2, eq3.
     * <!-- end-model-doc -->
     * @see #EXPONENTIAL_VALUE
     * @generated
     * @ordered
     */
    EXPONENTIAL( 4, "exponential", "exponential" );

    /**
     * The '<em><b>ZIP2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This model separates the frequency-dependent load (primarily motors) from other load.  ZIP2 equations for active and reactive power are used and the following attributes are required:
     * kp1, kp2, kp3, kq4, kpf
     * kq1, kq2, kq3, kq4, kqf.
     * <!-- end-model-doc -->
     * @see #ZIP2
     * @model name="zIP2"
     * @generated
     * @ordered
     */
    public static final int ZIP2_VALUE = 1;

    /**
     * The '<em><b>ZIP1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This model integrates the frequency-dependent load (primarily motors).  ZIP1 equations for active and reactive power are used and the following attributes are required:
     * kp1, kp2, kp3, kpf
     * kq1, kq2, kq3, kqf.
     * <!-- end-model-doc -->
     * @see #ZIP1
     * @model name="zIP1"
     * @generated
     * @ordered
     */
    public static final int ZIP1_VALUE = 2;

    /**
     * The '<em><b>Constant Z</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The load is represented as a constant impedance.  ConstantZ equations are used  for active and reactive power and no attributes are required.
     * <!-- end-model-doc -->
     * @see #CONSTANT_Z
     * @model name="constantZ"
     * @generated
     * @ordered
     */
    public static final int CONSTANT_Z_VALUE = 3;

    /**
     * The '<em><b>Exponential</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This model is an exponential representation of the load. Exponential equations for active and reactive power are used and the following attributes are required:
     * kp1, kp2, kp3, kpf, ep1, ep2, ep3
     * kq1, kq2, kq3, kqf, eq1, eq2, eq3.
     * <!-- end-model-doc -->
     * @see #EXPONENTIAL
     * @model name="exponential"
     * @generated
     * @ordered
     */
    public static final int EXPONENTIAL_VALUE = 4;

    /**
     * An array of all the '<em><b>Static Load Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final StaticLoadModelKind[] VALUES_ARRAY = new StaticLoadModelKind[] {
            ZIP2,
            ZIP1,
            CONSTANT_Z,
            EXPONENTIAL,
    };

    /**
     * A public read-only list of all the '<em><b>Static Load Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< StaticLoadModelKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Static Load Model Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StaticLoadModelKind get( String literal ) {
        for( StaticLoadModelKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Static Load Model Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StaticLoadModelKind getByName( String name ) {
        for( StaticLoadModelKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Static Load Model Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static StaticLoadModelKind get( int value ) {
        switch( value ) {
        case ZIP2_VALUE:
            return ZIP2;
        case ZIP1_VALUE:
            return ZIP1;
        case CONSTANT_Z_VALUE:
            return CONSTANT_Z;
        case EXPONENTIAL_VALUE:
            return EXPONENTIAL;
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
    private StaticLoadModelKind( int value, String name, String literal ) {
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

} //StaticLoadModelKind
