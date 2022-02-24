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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Schedule of values at points in time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBasicIntervalSchedule()
 * @model
 * @generated
 */
public interface BasicIntervalSchedule extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Value1 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value1 units of measure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetValue1Unit()
     * @see #unsetValue1Unit()
     * @see #setValue1Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBasicIntervalSchedule_Value1Unit()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BasicIntervalSchedule.value1Unit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getValue1Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetValue1Unit()
     * @see #unsetValue1Unit()
     * @see #getValue1Unit()
     * @generated
     */
    void setValue1Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue1Unit()
     * @see #getValue1Unit()
     * @see #setValue1Unit(UnitSymbol)
     * @generated
     */
    void unsetValue1Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value1 Unit</em>' attribute is set.
     * @see #unsetValue1Unit()
     * @see #getValue1Unit()
     * @see #setValue1Unit(UnitSymbol)
     * @generated
     */
    boolean isSetValue1Unit();

    /**
     * Returns the value of the '<em><b>Value2 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value2 units of measure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetValue2Unit()
     * @see #unsetValue2Unit()
     * @see #setValue2Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBasicIntervalSchedule_Value2Unit()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BasicIntervalSchedule.value2Unit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getValue2Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetValue2Unit()
     * @see #unsetValue2Unit()
     * @see #getValue2Unit()
     * @generated
     */
    void setValue2Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue2Unit()
     * @see #getValue2Unit()
     * @see #setValue2Unit(UnitSymbol)
     * @generated
     */
    void unsetValue2Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value2 Unit</em>' attribute is set.
     * @see #unsetValue2Unit()
     * @see #getValue2Unit()
     * @see #setValue2Unit(UnitSymbol)
     * @generated
     */
    boolean isSetValue2Unit();

    /**
     * Returns the value of the '<em><b>Start Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The time for the first time point.  The value can be a time of day, not a specific date.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Start Time</em>' attribute.
     * @see #isSetStartTime()
     * @see #unsetStartTime()
     * @see #setStartTime(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBasicIntervalSchedule_StartTime()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DateTime" transient="true" ordered="false"
     *        extendedMetaData="name='BasicIntervalSchedule.startTime' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    XMLGregorianCalendar getStartTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Time</em>' attribute.
     * @see #isSetStartTime()
     * @see #unsetStartTime()
     * @see #getStartTime()
     * @generated
     */
    void setStartTime( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartTime()
     * @see #getStartTime()
     * @see #setStartTime(XMLGregorianCalendar)
     * @generated
     */
    void unsetStartTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Time</em>' attribute is set.
     * @see #unsetStartTime()
     * @see #getStartTime()
     * @see #setStartTime(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetStartTime();

} // BasicIntervalSchedule
