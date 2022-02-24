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
 * A representation of the literals of the enumeration '<em><b>Curve Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Style or shape of curve.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurveStyle()
 * @model
 * @generated
 */
public enum CurveStyle implements Enumerator {
    /**
     * The '<em><b>Straight Line YValues</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y-axis values are assumed to be a straight line between values.  Also known as linear interpolation.
     * <!-- end-model-doc -->
     * @see #STRAIGHT_LINE_YVALUES_VALUE
     * @generated
     * @ordered
     */
    STRAIGHT_LINE_YVALUES( 1, "straightLineYValues", "straightLineYValues" ),

    /**
     * The '<em><b>Constant YValue</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y-axis values are assumed constant until the next curve point and prior to the first curve point.
     * <!-- end-model-doc -->
     * @see #CONSTANT_YVALUE_VALUE
     * @generated
     * @ordered
     */
    CONSTANT_YVALUE( 2, "constantYValue", "constantYValue" );

    /**
     * The '<em><b>Straight Line YValues</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y-axis values are assumed to be a straight line between values.  Also known as linear interpolation.
     * <!-- end-model-doc -->
     * @see #STRAIGHT_LINE_YVALUES
     * @model name="straightLineYValues"
     * @generated
     * @ordered
     */
    public static final int STRAIGHT_LINE_YVALUES_VALUE = 1;

    /**
     * The '<em><b>Constant YValue</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y-axis values are assumed constant until the next curve point and prior to the first curve point.
     * <!-- end-model-doc -->
     * @see #CONSTANT_YVALUE
     * @model name="constantYValue"
     * @generated
     * @ordered
     */
    public static final int CONSTANT_YVALUE_VALUE = 2;

    /**
     * An array of all the '<em><b>Curve Style</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CurveStyle[] VALUES_ARRAY = new CurveStyle[] {
            STRAIGHT_LINE_YVALUES,
            CONSTANT_YVALUE,
    };

    /**
     * A public read-only list of all the '<em><b>Curve Style</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< CurveStyle > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Curve Style</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CurveStyle get( String literal ) {
        for( CurveStyle result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Curve Style</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CurveStyle getByName( String name ) {
        for( CurveStyle result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Curve Style</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CurveStyle get( int value ) {
        switch( value ) {
        case STRAIGHT_LINE_YVALUES_VALUE:
            return STRAIGHT_LINE_YVALUES;
        case CONSTANT_YVALUE_VALUE:
            return CONSTANT_YVALUE;
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
    private CurveStyle( int value, String name, String literal ) {
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

} //CurveStyle
