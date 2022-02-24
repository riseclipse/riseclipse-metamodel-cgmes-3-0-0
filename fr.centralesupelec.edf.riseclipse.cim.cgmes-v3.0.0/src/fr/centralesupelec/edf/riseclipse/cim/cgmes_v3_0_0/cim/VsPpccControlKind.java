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
 * A representation of the literals of the enumeration '<em><b>Vs Ppcc Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types applicable to the control of real power and/or DC voltage by voltage source converter.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsPpccControlKind()
 * @model
 * @generated
 */
public enum VsPpccControlKind implements Enumerator {
    /**
     * The '<em><b>PPcc And Udc Droop With Compensation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power at point of common coupling and compensated DC voltage, with the droop. Compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc, VsConverter.droop and VsConverter.droopCompensation.
     * <!-- end-model-doc -->
     * @see #PPCC_AND_UDC_DROOP_WITH_COMPENSATION_VALUE
     * @generated
     * @ordered
     */
    PPCC_AND_UDC_DROOP_WITH_COMPENSATION( 1, "pPccAndUdcDroopWithCompensation", "pPccAndUdcDroopWithCompensation" ),

    /**
     * The '<em><b>PPcc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is real power at point of common coupling. The target value is provided by ACDCConverter.targetPpcc.
     * <!-- end-model-doc -->
     * @see #PPCC_VALUE
     * @generated
     * @ordered
     */
    PPCC( 2, "pPcc", "pPcc" ),

    /**
     * The '<em><b>Udc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
     * <!-- end-model-doc -->
     * @see #UDC_VALUE
     * @generated
     * @ordered
     */
    UDC( 3, "udc", "udc" ),

    /**
     * The '<em><b>PPcc And Udc Droop</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power at point of common coupling and local DC voltage, with the droop. Target values are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and VsConverter.droop.
     * <!-- end-model-doc -->
     * @see #PPCC_AND_UDC_DROOP_VALUE
     * @generated
     * @ordered
     */
    PPCC_AND_UDC_DROOP( 4, "pPccAndUdcDroop", "pPccAndUdcDroop" ),

    /**
     * The '<em><b>Phase Pcc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is phase at point of common coupling. Target is provided by VsConverter.targetPhasePcc.
     * <!-- end-model-doc -->
     * @see #PHASE_PCC_VALUE
     * @generated
     * @ordered
     */
    PHASE_PCC( 5, "phasePcc", "phasePcc" ),

    /**
     * The '<em><b>PPcc And Udc Droop Pilot</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power at point of common coupling and the pilot DC voltage, with the droop. The mode is used for Multi Terminal High Voltage DC (MTDC) systems where multiple HVDC Substations are connected to the HVDC transmission lines. The pilot voltage is then used to coordinate the control the DC voltage across the HVDC substations. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and  VsConverter.droop.
     * <!-- end-model-doc -->
     * @see #PPCC_AND_UDC_DROOP_PILOT_VALUE
     * @generated
     * @ordered
     */
    PPCC_AND_UDC_DROOP_PILOT( 6, "pPccAndUdcDroopPilot", "pPccAndUdcDroopPilot" );

    /**
     * The '<em><b>PPcc And Udc Droop With Compensation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power at point of common coupling and compensated DC voltage, with the droop. Compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc, VsConverter.droop and VsConverter.droopCompensation.
     * <!-- end-model-doc -->
     * @see #PPCC_AND_UDC_DROOP_WITH_COMPENSATION
     * @model name="pPccAndUdcDroopWithCompensation"
     * @generated
     * @ordered
     */
    public static final int PPCC_AND_UDC_DROOP_WITH_COMPENSATION_VALUE = 1;

    /**
     * The '<em><b>PPcc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is real power at point of common coupling. The target value is provided by ACDCConverter.targetPpcc.
     * <!-- end-model-doc -->
     * @see #PPCC
     * @model name="pPcc"
     * @generated
     * @ordered
     */
    public static final int PPCC_VALUE = 2;

    /**
     * The '<em><b>Udc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
     * <!-- end-model-doc -->
     * @see #UDC
     * @model name="udc"
     * @generated
     * @ordered
     */
    public static final int UDC_VALUE = 3;

    /**
     * The '<em><b>PPcc And Udc Droop</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power at point of common coupling and local DC voltage, with the droop. Target values are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and VsConverter.droop.
     * <!-- end-model-doc -->
     * @see #PPCC_AND_UDC_DROOP
     * @model name="pPccAndUdcDroop"
     * @generated
     * @ordered
     */
    public static final int PPCC_AND_UDC_DROOP_VALUE = 4;

    /**
     * The '<em><b>Phase Pcc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is phase at point of common coupling. Target is provided by VsConverter.targetPhasePcc.
     * <!-- end-model-doc -->
     * @see #PHASE_PCC
     * @model name="phasePcc"
     * @generated
     * @ordered
     */
    public static final int PHASE_PCC_VALUE = 5;

    /**
     * The '<em><b>PPcc And Udc Droop Pilot</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control is active power at point of common coupling and the pilot DC voltage, with the droop. The mode is used for Multi Terminal High Voltage DC (MTDC) systems where multiple HVDC Substations are connected to the HVDC transmission lines. The pilot voltage is then used to coordinate the control the DC voltage across the HVDC substations. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and  VsConverter.droop.
     * <!-- end-model-doc -->
     * @see #PPCC_AND_UDC_DROOP_PILOT
     * @model name="pPccAndUdcDroopPilot"
     * @generated
     * @ordered
     */
    public static final int PPCC_AND_UDC_DROOP_PILOT_VALUE = 6;

    /**
     * An array of all the '<em><b>Vs Ppcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final VsPpccControlKind[] VALUES_ARRAY = new VsPpccControlKind[] {
            PPCC_AND_UDC_DROOP_WITH_COMPENSATION,
            PPCC,
            UDC,
            PPCC_AND_UDC_DROOP,
            PHASE_PCC,
            PPCC_AND_UDC_DROOP_PILOT,
    };

    /**
     * A public read-only list of all the '<em><b>Vs Ppcc Control Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< VsPpccControlKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Vs Ppcc Control Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsPpccControlKind get( String literal ) {
        for( VsPpccControlKind result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Vs Ppcc Control Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsPpccControlKind getByName( String name ) {
        for( VsPpccControlKind result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Vs Ppcc Control Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VsPpccControlKind get( int value ) {
        switch( value ) {
        case PPCC_AND_UDC_DROOP_WITH_COMPENSATION_VALUE:
            return PPCC_AND_UDC_DROOP_WITH_COMPENSATION;
        case PPCC_VALUE:
            return PPCC;
        case UDC_VALUE:
            return UDC;
        case PPCC_AND_UDC_DROOP_VALUE:
            return PPCC_AND_UDC_DROOP;
        case PHASE_PCC_VALUE:
            return PHASE_PCC;
        case PPCC_AND_UDC_DROOP_PILOT_VALUE:
            return PPCC_AND_UDC_DROOP_PILOT;
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
    private VsPpccControlKind( int value, String name, String literal ) {
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

} //VsPpccControlKind
