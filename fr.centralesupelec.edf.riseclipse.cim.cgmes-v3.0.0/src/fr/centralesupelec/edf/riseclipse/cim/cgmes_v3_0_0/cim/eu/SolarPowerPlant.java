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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solar Power Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Solar power plant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits <em>Solar Generating Units</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getSolarPowerPlant()
 * @model
 * @generated
 */
public interface SolarPowerPlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Solar Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit#getSolarPowerPlant <em>Solar Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A solar generating unit or units may be a member of a solar power plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Solar Generating Units</em>' reference list.
     * @see #isSetSolarGeneratingUnits()
     * @see #unsetSolarGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getSolarPowerPlant_SolarGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit#getSolarPowerPlant
     * @model opposite="SolarPowerPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SolarPowerPlant.SolarGeneratingUnits' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    EList< SolarGeneratingUnit > getSolarGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits <em>Solar Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSolarGeneratingUnits()
     * @see #getSolarGeneratingUnits()
     * @generated
     */
    void unsetSolarGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits <em>Solar Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Solar Generating Units</em>' reference list is set.
     * @see #unsetSolarGeneratingUnits()
     * @see #getSolarGeneratingUnits()
     * @generated
     */
    boolean isSetSolarGeneratingUnits();

} // SolarPowerPlant
