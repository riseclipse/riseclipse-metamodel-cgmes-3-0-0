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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu;

import org.eclipse.emf.common.util.EList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Power Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wind power plant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits <em>Wind Generating Units</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getWindPowerPlant()
 * @model
 * @generated
 */
public interface WindPowerPlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Wind Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindPowerPlant <em>Wind Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A wind generating unit or units may be a member of a wind power plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Generating Units</em>' reference list.
     * @see #isSetWindGeneratingUnits()
     * @see #unsetWindGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getWindPowerPlant_WindGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindPowerPlant
     * @model opposite="WindPowerPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPowerPlant.WindGeneratingUnits' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    EList< WindGeneratingUnit > getWindGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits <em>Wind Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGeneratingUnits()
     * @see #getWindGeneratingUnits()
     * @generated
     */
    void unsetWindGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits <em>Wind Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Generating Units</em>' reference list is set.
     * @see #unsetWindGeneratingUnits()
     * @see #getWindGeneratingUnits()
     * @generated
     */
    boolean isSetWindGeneratingUnits();

} // WindPowerPlant
