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
 * A representation of the model object '<em><b>Day Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Group of similar days.   For example it could be used to represent weekdays, weekend, or holidays.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDayType()
 * @model
 * @generated
 */
public interface DayType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Schedules that use this DayType.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
     * @see #isSetSeasonDayTypeSchedules()
     * @see #unsetSeasonDayTypeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDayType_SeasonDayTypeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getDayType
     * @model opposite="DayType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DayType.SeasonDayTypeSchedules' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SeasonDayTypeSchedule > getSeasonDayTypeSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeasonDayTypeSchedules()
     * @see #getSeasonDayTypeSchedules()
     * @generated
     */
    void unsetSeasonDayTypeSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Season Day Type Schedules</em>' reference list is set.
     * @see #unsetSeasonDayTypeSchedules()
     * @see #getSeasonDayTypeSchedules()
     * @generated
     */
    boolean isSetSeasonDayTypeSchedules();

} // DayType
