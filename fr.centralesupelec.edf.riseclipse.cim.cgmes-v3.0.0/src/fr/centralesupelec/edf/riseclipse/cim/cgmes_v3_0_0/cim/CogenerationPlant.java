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
 * A representation of the model object '<em><b>Cogeneration Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of thermal generating units for the production of electrical energy and process steam (usually from the output of the steam turbines). The steam sendout is typically used for industrial purposes or for municipal heating and cooling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCogenerationPlant()
 * @model
 * @generated
 */
public interface CogenerationPlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A thermal generating unit may be a member of a cogeneration plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thermal Generating Units</em>' reference list.
     * @see #isSetThermalGeneratingUnits()
     * @see #unsetThermalGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCogenerationPlant_ThermalGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCogenerationPlant
     * @model opposite="CogenerationPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='CogenerationPlant.ThermalGeneratingUnits' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ThermalGeneratingUnit > getThermalGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnits()
     * @see #getThermalGeneratingUnits()
     * @generated
     */
    void unsetThermalGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Units</em>' reference list is set.
     * @see #unsetThermalGeneratingUnits()
     * @see #getThermalGeneratingUnits()
     * @generated
     */
    boolean isSetThermalGeneratingUnits();

} // CogenerationPlant
