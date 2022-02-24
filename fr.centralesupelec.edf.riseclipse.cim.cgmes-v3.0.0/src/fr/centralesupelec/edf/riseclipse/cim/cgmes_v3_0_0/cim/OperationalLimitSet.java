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
 * A representation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of limits associated with equipment.  Sets of limits might apply to a specific temperature, or season for example. A set of limits may contain different severities of limit levels that would apply to the same equipment. The set may contain limits of different types such as apparent power and current limits or high and low voltage limits  that are logically applied together as a set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitSet()
 * @model
 * @generated
 */
public interface OperationalLimitSet extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The equipment to which the limit set applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equipment</em>' reference.
     * @see #isSetEquipment()
     * @see #unsetEquipment()
     * @see #setEquipment(Equipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitSet_Equipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getOperationalLimitSet
     * @model opposite="OperationalLimitSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitSet.Equipment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Equipment getEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getEquipment <em>Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equipment</em>' reference.
     * @see #isSetEquipment()
     * @see #unsetEquipment()
     * @see #getEquipment()
     * @generated
     */
    void setEquipment( Equipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getEquipment <em>Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipment()
     * @see #getEquipment()
     * @see #setEquipment(Equipment)
     * @generated
     */
    void unsetEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getEquipment <em>Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipment</em>' reference is set.
     * @see #unsetEquipment()
     * @see #getEquipment()
     * @see #setEquipment(Equipment)
     * @generated
     */
    boolean isSetEquipment();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getOperationalLimitSet <em>Operational Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The terminal where the operational limit set apply.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(ACDCTerminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitSet_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getOperationalLimitSet
     * @model opposite="OperationalLimitSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitSet.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ACDCTerminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( ACDCTerminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(ACDCTerminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(ACDCTerminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Operational Limit Value</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Values of equipment limits.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Limit Value</em>' reference list.
     * @see #isSetOperationalLimitValue()
     * @see #unsetOperationalLimitValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitSet_OperationalLimitValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitSet
     * @model opposite="OperationalLimitSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitSet.OperationalLimitValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< OperationalLimit > getOperationalLimitValue();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimitValue()
     * @see #getOperationalLimitValue()
     * @generated
     */
    void unsetOperationalLimitValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit Value</em>' reference list is set.
     * @see #unsetOperationalLimitValue()
     * @see #getOperationalLimitValue()
     * @generated
     */
    boolean isSetOperationalLimitValue();

} // OperationalLimitSet
