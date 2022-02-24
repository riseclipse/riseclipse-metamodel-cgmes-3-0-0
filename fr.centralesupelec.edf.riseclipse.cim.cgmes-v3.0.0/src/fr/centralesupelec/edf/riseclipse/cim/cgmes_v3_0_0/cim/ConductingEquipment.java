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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The parts of the AC power system that are designed to carry current or that are conductively connected through terminals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConductingEquipment()
 * @model
 * @generated
 */
public interface ConductingEquipment extends Equipment {
    /**
     * Returns the value of the '<em><b>Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conducting equipment have terminals that may be connected to other conducting equipment terminals via connectivity nodes or topological nodes.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminals</em>' reference list.
     * @see #isSetTerminals()
     * @see #unsetTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConductingEquipment_Terminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getConductingEquipment
     * @model opposite="ConductingEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConductingEquipment.Terminals' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Terminal > getTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getTerminals <em>Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminals()
     * @see #getTerminals()
     * @generated
     */
    void unsetTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getTerminals <em>Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminals</em>' reference list is set.
     * @see #unsetTerminals()
     * @see #getTerminals()
     * @generated
     */
    boolean isSetTerminals();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base voltage of this conducting equipment.  Use only when there is no voltage level container used and only one base voltage applies.  For example, not used for transformers.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConductingEquipment_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ConductingEquipment.BaseVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @generated
     */
    void setBaseVoltage( BaseVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Voltage</em>' reference is set.
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    boolean isSetBaseVoltage();

    /**
     * Returns the value of the '<em><b>Sv Status</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The status state variable associated with this conducting equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sv Status</em>' reference.
     * @see #isSetSvStatus()
     * @see #unsetSvStatus()
     * @see #setSvStatus(SvStatus)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConductingEquipment_SvStatus()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getConductingEquipment
     * @model opposite="ConductingEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConductingEquipment.SvStatus' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SvStatus getSvStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Status</em>' reference.
     * @see #isSetSvStatus()
     * @see #unsetSvStatus()
     * @see #getSvStatus()
     * @generated
     */
    void setSvStatus( SvStatus value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvStatus()
     * @see #getSvStatus()
     * @see #setSvStatus(SvStatus)
     * @generated
     */
    void unsetSvStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Status</em>' reference is set.
     * @see #unsetSvStatus()
     * @see #getSvStatus()
     * @see #setSvStatus(SvStatus)
     * @generated
     */
    boolean isSetSvStatus();

} // ConductingEquipment
