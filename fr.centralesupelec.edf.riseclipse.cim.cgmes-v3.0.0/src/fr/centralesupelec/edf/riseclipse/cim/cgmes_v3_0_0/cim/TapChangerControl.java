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
 * A representation of the model object '<em><b>Tap Changer Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes behaviour specific to tap changers, e.g. how the voltage at the end of a line varies with the load level and compensation of the voltage drop by tap adjustment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChangerControl()
 * @model
 * @generated
 */
public interface TapChangerControl extends RegulatingControl {
    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The tap changers that participates in this regulating tap control scheme.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tap Changer</em>' reference list.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChangerControl_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapChangerControl
     * @model opposite="TapChangerControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TapChangerControl.TapChanger' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TapChanger > getTapChanger();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    void unsetTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer</em>' reference list is set.
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    boolean isSetTapChanger();

} // TapChangerControl
