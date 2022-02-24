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
 * A representation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A hydro power station which can generate or pump. When generating, the generator turbines receive water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPowerPlant()
 * @model
 * @generated
 */
public interface HydroPowerPlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Hydro Pumps</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The hydro pump may be a member of a pumped storage plant or a pump for distributing water.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hydro Pumps</em>' reference list.
     * @see #isSetHydroPumps()
     * @see #unsetHydroPumps()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPowerPlant_HydroPumps()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getHydroPowerPlant
     * @model opposite="HydroPowerPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='HydroPowerPlant.HydroPumps' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< HydroPump > getHydroPumps();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPumps()
     * @see #getHydroPumps()
     * @generated
     */
    void unsetHydroPumps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Pumps</em>' reference list is set.
     * @see #unsetHydroPumps()
     * @see #getHydroPumps()
     * @generated
     */
    boolean isSetHydroPumps();

    /**
     * Returns the value of the '<em><b>Hydro Plant Storage Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPlantStorageKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of hydro power plant water storage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hydro Plant Storage Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPlantStorageKind
     * @see #isSetHydroPlantStorageType()
     * @see #unsetHydroPlantStorageType()
     * @see #setHydroPlantStorageType(HydroPlantStorageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPowerPlant_HydroPlantStorageType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='HydroPowerPlant.hydroPlantStorageType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    HydroPlantStorageKind getHydroPlantStorageType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Plant Storage Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPlantStorageKind
     * @see #isSetHydroPlantStorageType()
     * @see #unsetHydroPlantStorageType()
     * @see #getHydroPlantStorageType()
     * @generated
     */
    void setHydroPlantStorageType( HydroPlantStorageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPlantStorageType()
     * @see #getHydroPlantStorageType()
     * @see #setHydroPlantStorageType(HydroPlantStorageKind)
     * @generated
     */
    void unsetHydroPlantStorageType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Plant Storage Type</em>' attribute is set.
     * @see #unsetHydroPlantStorageType()
     * @see #getHydroPlantStorageType()
     * @see #setHydroPlantStorageType(HydroPlantStorageKind)
     * @generated
     */
    boolean isSetHydroPlantStorageType();

    /**
     * Returns the value of the '<em><b>Hydro Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The hydro generating unit belongs to a hydro power plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hydro Generating Units</em>' reference list.
     * @see #isSetHydroGeneratingUnits()
     * @see #unsetHydroGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPowerPlant_HydroGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getHydroPowerPlant
     * @model opposite="HydroPowerPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='HydroPowerPlant.HydroGeneratingUnits' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< HydroGeneratingUnit > getHydroGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroGeneratingUnits()
     * @see #getHydroGeneratingUnits()
     * @generated
     */
    void unsetHydroGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Generating Units</em>' reference list is set.
     * @see #unsetHydroGeneratingUnits()
     * @see #getHydroGeneratingUnits()
     * @generated
     */
    boolean isSetHydroGeneratingUnits();

} // HydroPowerPlant
