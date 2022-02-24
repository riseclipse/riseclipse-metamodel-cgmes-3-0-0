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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electrical connection point to generic DC conducting equipment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTerminal()
 * @model
 * @generated
 */
public interface DCTerminal extends DCBaseTerminal {
    /**
     * Returns the value of the '<em><b>DC Conducting Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getDCTerminals <em>DC Terminals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An DC  terminal belong to a DC conducting equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Conducting Equipment</em>' reference.
     * @see #isSetDCConductingEquipment()
     * @see #unsetDCConductingEquipment()
     * @see #setDCConductingEquipment(DCConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTerminal_DCConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getDCTerminals
     * @model opposite="DCTerminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCTerminal.DCConductingEquipment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCConductingEquipment getDCConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Conducting Equipment</em>' reference.
     * @see #isSetDCConductingEquipment()
     * @see #unsetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @generated
     */
    void setDCConductingEquipment( DCConductingEquipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @see #setDCConductingEquipment(DCConductingEquipment)
     * @generated
     */
    void unsetDCConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Conducting Equipment</em>' reference is set.
     * @see #unsetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @see #setDCConductingEquipment(DCConductingEquipment)
     * @generated
     */
    boolean isSetDCConductingEquipment();

} // DCTerminal
