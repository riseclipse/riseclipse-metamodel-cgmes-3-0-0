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
 * A representation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoadSchedule()
 * @model
 * @generated
 */
public interface ConformLoadSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Conform Load Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ConformLoadGroup where the ConformLoadSchedule belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Conform Load Group</em>' reference.
     * @see #isSetConformLoadGroup()
     * @see #unsetConformLoadGroup()
     * @see #setConformLoadGroup(ConformLoadGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoadSchedule_ConformLoadGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getConformLoadSchedules
     * @model opposite="ConformLoadSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ConformLoadSchedule.ConformLoadGroup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ConformLoadGroup getConformLoadGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conform Load Group</em>' reference.
     * @see #isSetConformLoadGroup()
     * @see #unsetConformLoadGroup()
     * @see #getConformLoadGroup()
     * @generated
     */
    void setConformLoadGroup( ConformLoadGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConformLoadGroup()
     * @see #getConformLoadGroup()
     * @see #setConformLoadGroup(ConformLoadGroup)
     * @generated
     */
    void unsetConformLoadGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conform Load Group</em>' reference is set.
     * @see #unsetConformLoadGroup()
     * @see #getConformLoadGroup()
     * @see #setConformLoadGroup(ConformLoadGroup)
     * @generated
     */
    boolean isSetConformLoadGroup();

} // ConformLoadSchedule
