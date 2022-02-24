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
 * A representation of the model object '<em><b>Switch Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A schedule of switch positions.  If RegularTimePoint.value1 is 0, the switch is open.  If 1, the switch is closed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitchSchedule()
 * @model
 * @generated
 */
public interface SwitchSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A SwitchSchedule is associated with a Switch.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #setSwitch(Switch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitchSchedule_Switch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSwitchSchedules
     * @model opposite="SwitchSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SwitchSchedule.Switch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Switch getSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @generated
     */
    void setSwitch( Switch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    void unsetSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule#getSwitch <em>Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch</em>' reference is set.
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    boolean isSetSwitch();

} // SwitchSchedule
