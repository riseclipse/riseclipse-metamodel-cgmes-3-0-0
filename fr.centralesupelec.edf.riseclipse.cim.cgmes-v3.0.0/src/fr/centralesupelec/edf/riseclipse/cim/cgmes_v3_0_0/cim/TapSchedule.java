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
 * A representation of the model object '<em><b>Tap Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pre-established pattern over time for a tap step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapSchedule()
 * @model
 * @generated
 */
public interface TapSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A TapSchedule is associated with a TapChanger.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tap Changer</em>' reference.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see #setTapChanger(TapChanger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapSchedule_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapSchedules
     * @model opposite="TapSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TapSchedule.TapChanger' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TapChanger getTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule#getTapChanger <em>Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer</em>' reference.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    void setTapChanger( TapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule#getTapChanger <em>Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChanger()
     * @see #getTapChanger()
     * @see #setTapChanger(TapChanger)
     * @generated
     */
    void unsetTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule#getTapChanger <em>Tap Changer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer</em>' reference is set.
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @see #setTapChanger(TapChanger)
     * @generated
     */
    boolean isSetTapChanger();

} // TapSchedule
