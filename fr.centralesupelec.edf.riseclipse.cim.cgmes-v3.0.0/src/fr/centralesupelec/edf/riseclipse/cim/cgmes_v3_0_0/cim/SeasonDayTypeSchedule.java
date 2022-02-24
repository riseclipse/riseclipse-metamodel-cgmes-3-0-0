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
 * A representation of the model object '<em><b>Season Day Type Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time schedule covering a 24 hour period, with curve data for a specific type of season and day.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeasonDayTypeSchedule()
 * @model
 * @generated
 */
public interface SeasonDayTypeSchedule extends RegularIntervalSchedule {
    /**
     * Returns the value of the '<em><b>Season</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Season for the Schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Season</em>' reference.
     * @see #isSetSeason()
     * @see #unsetSeason()
     * @see #setSeason(Season)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeasonDayTypeSchedule_Season()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season#getSeasonDayTypeSchedules
     * @model opposite="SeasonDayTypeSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SeasonDayTypeSchedule.Season' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Season getSeason();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getSeason <em>Season</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Season</em>' reference.
     * @see #isSetSeason()
     * @see #unsetSeason()
     * @see #getSeason()
     * @generated
     */
    void setSeason( Season value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getSeason <em>Season</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeason()
     * @see #getSeason()
     * @see #setSeason(Season)
     * @generated
     */
    void unsetSeason();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getSeason <em>Season</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Season</em>' reference is set.
     * @see #unsetSeason()
     * @see #getSeason()
     * @see #setSeason(Season)
     * @generated
     */
    boolean isSetSeason();

    /**
     * Returns the value of the '<em><b>Day Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DayType for the Schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Day Type</em>' reference.
     * @see #isSetDayType()
     * @see #unsetDayType()
     * @see #setDayType(DayType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSeasonDayTypeSchedule_DayType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType#getSeasonDayTypeSchedules
     * @model opposite="SeasonDayTypeSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SeasonDayTypeSchedule.DayType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DayType getDayType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Day Type</em>' reference.
     * @see #isSetDayType()
     * @see #unsetDayType()
     * @see #getDayType()
     * @generated
     */
    void setDayType( DayType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDayType()
     * @see #getDayType()
     * @see #setDayType(DayType)
     * @generated
     */
    void unsetDayType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Day Type</em>' reference is set.
     * @see #unsetDayType()
     * @see #getDayType()
     * @see #setDayType(DayType)
     * @generated
     */
    boolean isSetDayType();

} // SeasonDayTypeSchedule
