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
 * A representation of the model object '<em><b>Energy Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an area having energy production or consumption.  Specializations are intended to support the load allocation function as typically required in energy management systems or planning studies to allocate hypothesized load levels to individual load points for power flow analysis.  Often the energy area can be linked to both measured and forecast load levels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyArea()
 * @model
 * @generated
 */
public interface EnergyArea extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Control Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getEnergyArea <em>Energy Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The control area specification that is used for the load forecast.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #setControlArea(ControlArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyArea_ControlArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getEnergyArea
     * @model opposite="EnergyArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyArea.ControlArea' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ControlArea getControlArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @generated
     */
    void setControlArea( ControlArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    void unsetControlArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea#getControlArea <em>Control Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area</em>' reference is set.
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    boolean isSetControlArea();

} // EnergyArea
