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
 * A representation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Loads that do not follow a daily and seasonal load variation pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonConformLoadGroup()
 * @model
 * @generated
 */
public interface NonConformLoadGroup extends LoadGroup {
    /**
     * Returns the value of the '<em><b>Non Conform Load Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The NonConformLoadSchedules in the NonConformLoadGroup.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Non Conform Load Schedules</em>' reference list.
     * @see #isSetNonConformLoadSchedules()
     * @see #unsetNonConformLoadSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonConformLoadGroup_NonConformLoadSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadSchedule#getNonConformLoadGroup
     * @model opposite="NonConformLoadGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='NonConformLoadGroup.NonConformLoadSchedules' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< NonConformLoadSchedule > getNonConformLoadSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNonConformLoadSchedules()
     * @see #getNonConformLoadSchedules()
     * @generated
     */
    void unsetNonConformLoadSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Non Conform Load Schedules</em>' reference list is set.
     * @see #unsetNonConformLoadSchedules()
     * @see #getNonConformLoadSchedules()
     * @generated
     */
    boolean isSetNonConformLoadSchedules();

    /**
     * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conform loads assigned to this ConformLoadGroup.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Consumers</em>' reference list.
     * @see #isSetEnergyConsumers()
     * @see #unsetEnergyConsumers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonConformLoadGroup_EnergyConsumers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad#getLoadGroup
     * @model opposite="LoadGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='NonConformLoadGroup.EnergyConsumers' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< NonConformLoad > getEnergyConsumers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumers()
     * @see #getEnergyConsumers()
     * @generated
     */
    void unsetEnergyConsumers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumers</em>' reference list is set.
     * @see #unsetEnergyConsumers()
     * @see #getEnergyConsumers()
     * @generated
     */
    boolean isSetEnergyConsumers();

} // NonConformLoadGroup
