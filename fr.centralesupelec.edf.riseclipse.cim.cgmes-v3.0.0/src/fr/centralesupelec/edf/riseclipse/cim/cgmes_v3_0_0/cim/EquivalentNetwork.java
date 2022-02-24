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
 * A representation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class that groups electrical equivalents, including internal nodes, of a network that has been reduced. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are not contained by the equivalent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentNetwork()
 * @model
 * @generated
 */
public interface EquivalentNetwork extends ConnectivityNodeContainer {
    /**
     * Returns the value of the '<em><b>Equivalent Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The associated reduced equivalents.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equivalent Equipments</em>' reference list.
     * @see #isSetEquivalentEquipments()
     * @see #unsetEquivalentEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentNetwork_EquivalentEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment#getEquivalentNetwork
     * @model opposite="EquivalentNetwork" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentNetwork.EquivalentEquipments' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< EquivalentEquipment > getEquivalentEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquivalentEquipments()
     * @see #getEquivalentEquipments()
     * @generated
     */
    void unsetEquivalentEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equivalent Equipments</em>' reference list is set.
     * @see #unsetEquivalentEquipments()
     * @see #getEquivalentEquipments()
     * @generated
     */
    boolean isSetEquivalentEquipments();

} // EquivalentNetwork
