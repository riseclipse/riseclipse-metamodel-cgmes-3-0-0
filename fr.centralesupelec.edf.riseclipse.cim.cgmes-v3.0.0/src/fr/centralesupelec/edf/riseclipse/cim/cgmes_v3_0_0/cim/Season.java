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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specified time period of the year.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Date season starts.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #isSetStartDate()
     * @see #unsetStartDate()
     * @see #setStartDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeason_StartDate()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MonthDay" transient="true" ordered="false"
     *        extendedMetaData="name='Season.startDate' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    XMLGregorianCalendar getStartDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #isSetStartDate()
     * @see #unsetStartDate()
     * @see #getStartDate()
     * @generated
     */
    void setStartDate( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartDate()
     * @see #getStartDate()
     * @see #setStartDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetStartDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getStartDate <em>Start Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Date</em>' attribute is set.
     * @see #unsetStartDate()
     * @see #getStartDate()
     * @see #setStartDate(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetStartDate();

    /**
     * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Schedules that use this Season.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
     * @see #isSetSeasonDayTypeSchedules()
     * @see #unsetSeasonDayTypeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeason_SeasonDayTypeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getSeason
     * @model opposite="Season" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Season.SeasonDayTypeSchedules' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SeasonDayTypeSchedule > getSeasonDayTypeSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeasonDayTypeSchedules()
     * @see #getSeasonDayTypeSchedules()
     * @generated
     */
    void unsetSeasonDayTypeSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Season Day Type Schedules</em>' reference list is set.
     * @see #unsetSeasonDayTypeSchedules()
     * @see #getSeasonDayTypeSchedules()
     * @generated
     */
    boolean isSetSeasonDayTypeSchedules();

    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Date season ends.
     * <!-- end-model-doc -->
     * @return the value of the '<em>End Date</em>' attribute.
     * @see #isSetEndDate()
     * @see #unsetEndDate()
     * @see #setEndDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeason_EndDate()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MonthDay" transient="true" ordered="false"
     *        extendedMetaData="name='Season.endDate' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    XMLGregorianCalendar getEndDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @see #isSetEndDate()
     * @see #unsetEndDate()
     * @see #getEndDate()
     * @generated
     */
    void setEndDate( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDate()
     * @see #getEndDate()
     * @see #setEndDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetEndDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getEndDate <em>End Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Date</em>' attribute is set.
     * @see #unsetEndDate()
     * @see #getEndDate()
     * @see #setEndDate(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetEndDate();

} // Season
