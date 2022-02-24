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
 * A representation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getDropHeight <em>Drop Height</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroGeneratingUnit()
 * @model
 * @generated
 */
public interface HydroGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>Energy Conversion Capability</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroEnergyConversionKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy conversion capability for generating.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Conversion Capability</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroEnergyConversionKind
     * @see #isSetEnergyConversionCapability()
     * @see #unsetEnergyConversionCapability()
     * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroGeneratingUnit_EnergyConversionCapability()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='HydroGeneratingUnit.energyConversionCapability' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    HydroEnergyConversionKind getEnergyConversionCapability();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Conversion Capability</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroEnergyConversionKind
     * @see #isSetEnergyConversionCapability()
     * @see #unsetEnergyConversionCapability()
     * @see #getEnergyConversionCapability()
     * @generated
     */
    void setEnergyConversionCapability( HydroEnergyConversionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConversionCapability()
     * @see #getEnergyConversionCapability()
     * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
     * @generated
     */
    void unsetEnergyConversionCapability();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Conversion Capability</em>' attribute is set.
     * @see #unsetEnergyConversionCapability()
     * @see #getEnergyConversionCapability()
     * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
     * @generated
     */
    boolean isSetEnergyConversionCapability();

    /**
     * Returns the value of the '<em><b>Drop Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The height water drops from the reservoir mid-point to the turbine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Drop Height</em>' attribute.
     * @see #isSetDropHeight()
     * @see #unsetDropHeight()
     * @see #setDropHeight(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroGeneratingUnit_DropHeight()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='HydroGeneratingUnit.dropHeight' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDropHeight();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getDropHeight <em>Drop Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Drop Height</em>' attribute.
     * @see #isSetDropHeight()
     * @see #unsetDropHeight()
     * @see #getDropHeight()
     * @generated
     */
    void setDropHeight( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getDropHeight <em>Drop Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDropHeight()
     * @see #getDropHeight()
     * @see #setDropHeight(Double)
     * @generated
     */
    void unsetDropHeight();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getDropHeight <em>Drop Height</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Drop Height</em>' attribute is set.
     * @see #unsetDropHeight()
     * @see #getDropHeight()
     * @see #setDropHeight(Double)
     * @generated
     */
    boolean isSetDropHeight();

    /**
     * Returns the value of the '<em><b>Turbine Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroTurbineKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of turbine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroTurbineKind
     * @see #isSetTurbineType()
     * @see #unsetTurbineType()
     * @see #setTurbineType(HydroTurbineKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroGeneratingUnit_TurbineType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='HydroGeneratingUnit.turbineType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    HydroTurbineKind getTurbineType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getTurbineType <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroTurbineKind
     * @see #isSetTurbineType()
     * @see #unsetTurbineType()
     * @see #getTurbineType()
     * @generated
     */
    void setTurbineType( HydroTurbineKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getTurbineType <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineType()
     * @see #getTurbineType()
     * @see #setTurbineType(HydroTurbineKind)
     * @generated
     */
    void unsetTurbineType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getTurbineType <em>Turbine Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Type</em>' attribute is set.
     * @see #unsetTurbineType()
     * @see #getTurbineType()
     * @see #setTurbineType(HydroTurbineKind)
     * @generated
     */
    boolean isSetTurbineType();

    /**
     * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The hydro generating unit belongs to a hydro power plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroGeneratingUnit_HydroPowerPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroGeneratingUnits
     * @model opposite="HydroGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='HydroGeneratingUnit.HydroPowerPlant' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    HydroPowerPlant getHydroPowerPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @generated
     */
    void setHydroPowerPlant( HydroPowerPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    void unsetHydroPowerPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Power Plant</em>' reference is set.
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    boolean isSetHydroPowerPlant();

} // HydroGeneratingUnit
