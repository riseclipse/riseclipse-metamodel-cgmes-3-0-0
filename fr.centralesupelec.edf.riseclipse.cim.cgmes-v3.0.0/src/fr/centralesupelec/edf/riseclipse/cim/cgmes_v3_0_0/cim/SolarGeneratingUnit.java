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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solar Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A solar thermal generating unit, connected to the grid by means of a rotating machine.  This class does not represent photovoltaic (PV) generation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit#getSolarPowerPlant <em>Solar Power Plant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSolarGeneratingUnit()
 * @model
 * @generated
 */
public interface SolarGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>Solar Power Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits <em>Solar Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A solar power plant may have solar generating units.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Solar Power Plant</em>' reference.
     * @see #isSetSolarPowerPlant()
     * @see #unsetSolarPowerPlant()
     * @see #setSolarPowerPlant(SolarPowerPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSolarGeneratingUnit_SolarPowerPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits
     * @model opposite="SolarGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SolarGeneratingUnit.SolarPowerPlant' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    SolarPowerPlant getSolarPowerPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit#getSolarPowerPlant <em>Solar Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Solar Power Plant</em>' reference.
     * @see #isSetSolarPowerPlant()
     * @see #unsetSolarPowerPlant()
     * @see #getSolarPowerPlant()
     * @generated
     */
    void setSolarPowerPlant( SolarPowerPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit#getSolarPowerPlant <em>Solar Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSolarPowerPlant()
     * @see #getSolarPowerPlant()
     * @see #setSolarPowerPlant(SolarPowerPlant)
     * @generated
     */
    void unsetSolarPowerPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit#getSolarPowerPlant <em>Solar Power Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Solar Power Plant</em>' reference is set.
     * @see #unsetSolarPowerPlant()
     * @see #getSolarPowerPlant()
     * @see #setSolarPowerPlant(SolarPowerPlant)
     * @generated
     */
    boolean isSetSolarPowerPlant();

} // SolarGeneratingUnit
