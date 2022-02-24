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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Time point for a schedule where the time between the consecutive points is constant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue1 <em>Value1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue2 <em>Value2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularTimePoint()
 * @model
 * @generated
 */
public interface RegularTimePoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Interval Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regular interval schedule containing this time point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Interval Schedule</em>' reference.
     * @see #isSetIntervalSchedule()
     * @see #unsetIntervalSchedule()
     * @see #setIntervalSchedule(RegularIntervalSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularTimePoint_IntervalSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule#getTimePoints
     * @model opposite="TimePoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RegularTimePoint.IntervalSchedule' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RegularIntervalSchedule getIntervalSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interval Schedule</em>' reference.
     * @see #isSetIntervalSchedule()
     * @see #unsetIntervalSchedule()
     * @see #getIntervalSchedule()
     * @generated
     */
    void setIntervalSchedule( RegularIntervalSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntervalSchedule()
     * @see #getIntervalSchedule()
     * @see #setIntervalSchedule(RegularIntervalSchedule)
     * @generated
     */
    void unsetIntervalSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval Schedule</em>' reference is set.
     * @see #unsetIntervalSchedule()
     * @see #getIntervalSchedule()
     * @see #setIntervalSchedule(RegularIntervalSchedule)
     * @generated
     */
    boolean isSetIntervalSchedule();

    /**
     * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The position of the regular time point in the sequence. Note that time points don't have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the associated regular interval schedule's time step with the regular time point sequence number and adding the associated schedules start time. To specify values for the start time, use sequence number 0.  The sequence number cannot be negative.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularTimePoint_SequenceNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='RegularTimePoint.sequenceNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getSequenceNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @generated
     */
    void setSequenceNumber( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    void unsetSequenceNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    boolean isSetSequenceNumber();

    /**
     * Returns the value of the '<em><b>Value1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The first value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value1</em>' attribute.
     * @see #isSetValue1()
     * @see #unsetValue1()
     * @see #setValue1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularTimePoint_Value1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RegularTimePoint.value1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getValue1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue1 <em>Value1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value1</em>' attribute.
     * @see #isSetValue1()
     * @see #unsetValue1()
     * @see #getValue1()
     * @generated
     */
    void setValue1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue1 <em>Value1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue1()
     * @see #getValue1()
     * @see #setValue1(Double)
     * @generated
     */
    void unsetValue1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue1 <em>Value1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value1</em>' attribute is set.
     * @see #unsetValue1()
     * @see #getValue1()
     * @see #setValue1(Double)
     * @generated
     */
    boolean isSetValue1();

    /**
     * Returns the value of the '<em><b>Value2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The second value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value2</em>' attribute.
     * @see #isSetValue2()
     * @see #unsetValue2()
     * @see #setValue2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegularTimePoint_Value2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RegularTimePoint.value2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getValue2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue2 <em>Value2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value2</em>' attribute.
     * @see #isSetValue2()
     * @see #unsetValue2()
     * @see #getValue2()
     * @generated
     */
    void setValue2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue2 <em>Value2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue2()
     * @see #getValue2()
     * @see #setValue2(Double)
     * @generated
     */
    void unsetValue2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint#getValue2 <em>Value2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value2</em>' attribute is set.
     * @see #unsetValue2()
     * @see #getValue2()
     * @see #setValue2(Double)
     * @generated
     */
    boolean isSetValue2();

} // RegularTimePoint
