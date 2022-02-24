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
 * A representation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A modelling construct to provide a root class for containing equipment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer#getEquipments <em>Equipments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipmentContainer()
 * @model
 * @generated
 */
public interface EquipmentContainer extends ConnectivityNodeContainer {
    /**
     * Returns the value of the '<em><b>Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contained equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equipments</em>' reference list.
     * @see #isSetEquipments()
     * @see #unsetEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipmentContainer_Equipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getEquipmentContainer
     * @model opposite="EquipmentContainer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='EquipmentContainer.Equipments' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Equipment > getEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer#getEquipments <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipments()
     * @see #getEquipments()
     * @generated
     */
    void unsetEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer#getEquipments <em>Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipments</em>' reference list is set.
     * @see #unsetEquipments()
     * @see #getEquipments()
     * @generated
     */
    boolean isSetEquipments();

} // EquipmentContainer
