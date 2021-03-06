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
 * A representation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of loads conforming to an allocation pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoadGroup()
 * @model
 * @generated
 */
public interface ConformLoadGroup extends LoadGroup {
    /**
     * Returns the value of the '<em><b>Conform Load Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ConformLoadSchedules in the ConformLoadGroup.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Conform Load Schedules</em>' reference list.
     * @see #isSetConformLoadSchedules()
     * @see #unsetConformLoadSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoadGroup_ConformLoadSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule#getConformLoadGroup
     * @model opposite="ConformLoadGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConformLoadGroup.ConformLoadSchedules' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ConformLoadSchedule > getConformLoadSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConformLoadSchedules()
     * @see #getConformLoadSchedules()
     * @generated
     */
    void unsetConformLoadSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conform Load Schedules</em>' reference list is set.
     * @see #unsetConformLoadSchedules()
     * @see #getConformLoadSchedules()
     * @generated
     */
    boolean isSetConformLoadSchedules();

    /**
     * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad#getLoadGroup <em>Load Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conform loads assigned to this ConformLoadGroup.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Consumers</em>' reference list.
     * @see #isSetEnergyConsumers()
     * @see #unsetEnergyConsumers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoadGroup_EnergyConsumers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad#getLoadGroup
     * @model opposite="LoadGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConformLoadGroup.EnergyConsumers' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ConformLoad > getEnergyConsumers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumers()
     * @see #getEnergyConsumers()
     * @generated
     */
    void unsetEnergyConsumers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumers</em>' reference list is set.
     * @see #unsetEnergyConsumers()
     * @see #getEnergyConsumers()
     * @generated
     */
    boolean isSetEnergyConsumers();

} // ConformLoadGroup
