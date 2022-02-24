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
 * A representation of the literals of the enumeration '<em><b>Exc ST7BOE Lselector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of connections for the OEL input used for static excitation systems type 7B.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcST7BOELselectorKind()
 * @model
 * @generated
 */
public enum ExcST7BOELselectorKind implements Enumerator {
    /**
     * The '<em><b>Output LVgate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal is connected into the output <i>LVGate</i>.  Corresponds to <i>OELin</i> = 3 on the ExcST7B diagram.
     * <!-- end-model-doc -->
     * @see #OUTPUT_LVGATE_VALUE
     * @generated
     * @ordered
     */
    OUTPUT_LVGATE( 1, "outputLVgate", "outputLVgate" ),

    /**
     * The '<em><b>Add Vref</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal is added to <i>Vref</i>.  Corresponds to <i>OELin</i> = 1 on the ExcST7B diagram.
     * <!-- end-model-doc -->
     * @see #ADD_VREF_VALUE
     * @generated
     * @ordered
     */
    ADD_VREF( 2, "addVref", "addVref" ),

    /**
     * The '<em><b>No OE Linput</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No OEL input is used. Corresponds to <i>OELin</i> not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this <i>OELin</i> = 0.
     * <!-- end-model-doc -->
     * @see #NO_OE_LINPUT_VALUE
     * @generated
     * @ordered
     */
    NO_OE_LINPUT( 3, "noOELinput", "noOELinput" ),

    /**
     * The '<em><b>Input LVgate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal is connected into the input <i>LVGate</i>. Corresponds to <i>OELin</i> = 2 on the ExcST7B diagram.
     * <!-- end-model-doc -->
     * @see #INPUT_LVGATE_VALUE
     * @generated
     * @ordered
     */
    INPUT_LVGATE( 4, "inputLVgate", "inputLVgate" );

    /**
     * The '<em><b>Output LVgate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal is connected into the output <i>LVGate</i>.  Corresponds to <i>OELin</i> = 3 on the ExcST7B diagram.
     * <!-- end-model-doc -->
     * @see #OUTPUT_LVGATE
     * @model name="outputLVgate"
     * @generated
     * @ordered
     */
    public static final int OUTPUT_LVGATE_VALUE = 1;

    /**
     * The '<em><b>Add Vref</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal is added to <i>Vref</i>.  Corresponds to <i>OELin</i> = 1 on the ExcST7B diagram.
     * <!-- end-model-doc -->
     * @see #ADD_VREF
     * @model name="addVref"
     * @generated
     * @ordered
     */
    public static final int ADD_VREF_VALUE = 2;

    /**
     * The '<em><b>No OE Linput</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No OEL input is used. Corresponds to <i>OELin</i> not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this <i>OELin</i> = 0.
     * <!-- end-model-doc -->
     * @see #NO_OE_LINPUT
     * @model name="noOELinput"
     * @generated
     * @ordered
     */
    public static final int NO_OE_LINPUT_VALUE = 3;

    /**
     * The '<em><b>Input LVgate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal is connected into the input <i>LVGate</i>. Corresponds to <i>OELin</i> = 2 on the ExcST7B diagram.
     * <!-- end-model-doc -->
     * @see #INPUT_LVGATE
     * @model name="inputLVgate"
     * @generated
     * @ordered
     */
    public static final int INPUT_LVGATE_VALUE = 4;

    /**
     * An array of all the '<em><b>Exc ST7BOE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ExcST7BOELselectorKind[] VALUES_ARRAY = new ExcST7BOELselectorKind[] {
            OUTPUT_LVGATE,
            ADD_VREF,
            NO_OE_LINPUT,
            INPUT_LVGATE,
    };

    /**
     * A public read-only list of all the '<em><b>Exc ST7BOE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ExcST7BOELselectorKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Exc ST7BOE Lselector Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST7BOELselectorKind get( String literal ) {
        for( ExcST7BOELselectorKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc ST7BOE Lselector Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST7BOELselectorKind getByName( String name ) {
        for( ExcST7BOELselectorKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc ST7BOE Lselector Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST7BOELselectorKind get( int value ) {
        switch( value ) {
        case OUTPUT_LVGATE_VALUE:
            return OUTPUT_LVGATE;
        case ADD_VREF_VALUE:
            return ADD_VREF;
        case NO_OE_LINPUT_VALUE:
            return NO_OE_LINPUT;
        case INPUT_LVGATE_VALUE:
            return INPUT_LVGATE;
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
    private ExcST7BOELselectorKind( int value, String name, String literal ) {
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

} //ExcST7BOELselectorKind
