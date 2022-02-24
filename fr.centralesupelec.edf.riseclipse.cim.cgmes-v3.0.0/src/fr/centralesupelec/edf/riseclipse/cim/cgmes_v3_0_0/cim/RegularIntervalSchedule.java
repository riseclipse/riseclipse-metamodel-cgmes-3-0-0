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
 * A representation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The schedule has time points where the time between them is constant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularIntervalSchedule()
 * @model
 * @generated
 */
public interface RegularIntervalSchedule extends BasicIntervalSchedule {
    /**
     * Returns the value of the '<em><b>Time Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The regular interval time point data values that define this schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Time Points</em>' reference list.
     * @see #isSetTimePoints()
     * @see #unsetTimePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularIntervalSchedule_TimePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getIntervalSchedule
     * @model opposite="IntervalSchedule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RegularIntervalSchedule.TimePoints' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RegularTimePoint > getTimePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimePoints()
     * @see #getTimePoints()
     * @generated
     */
    void unsetTimePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Points</em>' reference list is set.
     * @see #unsetTimePoints()
     * @see #getTimePoints()
     * @generated
     */
    boolean isSetTimePoints();

    /**
     * Returns the value of the '<em><b>Time Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The time between each pair of subsequent regular time points in sequence order.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Time Step</em>' attribute.
     * @see #isSetTimeStep()
     * @see #unsetTimeStep()
     * @see #setTimeStep(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularIntervalSchedule_TimeStep()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='RegularIntervalSchedule.timeStep' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTimeStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step</em>' attribute.
     * @see #isSetTimeStep()
     * @see #unsetTimeStep()
     * @see #getTimeStep()
     * @generated
     */
    void setTimeStep( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeStep()
     * @see #getTimeStep()
     * @see #setTimeStep(Double)
     * @generated
     */
    void unsetTimeStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Step</em>' attribute is set.
     * @see #unsetTimeStep()
     * @see #getTimeStep()
     * @see #setTimeStep(Double)
     * @generated
     */
    boolean isSetTimeStep();

    /**
     * Returns the value of the '<em><b>End Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The time for the last time point.  The value can be a time of day, not a specific date.
     * <!-- end-model-doc -->
     * @return the value of the '<em>End Time</em>' attribute.
     * @see #isSetEndTime()
     * @see #unsetEndTime()
     * @see #setEndTime(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularIntervalSchedule_EndTime()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DateTime" transient="true" ordered="false"
     *        extendedMetaData="name='RegularIntervalSchedule.endTime' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    XMLGregorianCalendar getEndTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Time</em>' attribute.
     * @see #isSetEndTime()
     * @see #unsetEndTime()
     * @see #getEndTime()
     * @generated
     */
    void setEndTime( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndTime()
     * @see #getEndTime()
     * @see #setEndTime(XMLGregorianCalendar)
     * @generated
     */
    void unsetEndTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Time</em>' attribute is set.
     * @see #unsetEndTime()
     * @see #getEndTime()
     * @see #setEndTime(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetEndTime();

} // RegularIntervalSchedule
