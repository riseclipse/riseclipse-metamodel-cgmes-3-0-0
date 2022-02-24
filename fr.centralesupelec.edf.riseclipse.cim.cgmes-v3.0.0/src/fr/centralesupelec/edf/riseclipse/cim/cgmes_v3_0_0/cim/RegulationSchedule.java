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
 * A representation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pre-established pattern over time for a controlled variable, e.g., busbar voltage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulationSchedule()
 * @model
 * @generated
 */
public interface RegulationSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulating controls that have this schedule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulationSchedule_RegulatingControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulationSchedule
     * @model opposite="RegulationSchedule" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RegulationSchedule.RegulatingControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RegulatingControl getRegulatingControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @generated
     */
    void setRegulatingControl( RegulatingControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    void unsetRegulatingControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Control</em>' reference is set.
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    boolean isSetRegulatingControl();

} // RegulationSchedule
