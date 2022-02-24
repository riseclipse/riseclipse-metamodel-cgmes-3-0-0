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
 * A representation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.  A bay typically represents a physical grouping related to modularization of equipment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay#getVoltageLevel <em>Voltage Level</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBay()
 * @model
 * @generated
 */
public interface Bay extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>Voltage Level</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBays <em>Bays</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage level containing this bay.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Level</em>' reference.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBay_VoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBays
     * @model opposite="Bays" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Bay.VoltageLevel' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VoltageLevel getVoltageLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay#getVoltageLevel <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Level</em>' reference.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    void setVoltageLevel( VoltageLevel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay#getVoltageLevel <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageLevel()
     * @see #getVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @generated
     */
    void unsetVoltageLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay#getVoltageLevel <em>Voltage Level</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Level</em>' reference is set.
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @generated
     */
    boolean isSetVoltageLevel();

} // Bay
