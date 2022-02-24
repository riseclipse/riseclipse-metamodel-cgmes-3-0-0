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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuFactory
 * @model kind="package"
 * @generated
 */
public interface EuPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "eu";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://iec.ch/TC57/CIM100-European";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "eu";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EuPackage eINSTANCE = fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl.init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.SolarPowerPlantImpl <em>Solar Power Plant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.SolarPowerPlantImpl
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getSolarPowerPlant()
     * @generated
     */
    int SOLAR_POWER_PLANT = 1;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.WindPowerPlantImpl <em>Wind Power Plant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.WindPowerPlantImpl
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getWindPowerPlant()
     * @generated
     */
    int WIND_POWER_PLANT = 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__ID = CimPackage.POWER_SYSTEM_RESOURCE__ID;

    /**
     * The feature id for the '<em><b>Energy Ident Code Eic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__ENERGY_IDENT_CODE_EIC = CimPackage.POWER_SYSTEM_RESOURCE__ENERGY_IDENT_CODE_EIC;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__DESCRIPTION = CimPackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>MRID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__MRID = CimPackage.POWER_SYSTEM_RESOURCE__MRID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__NAME = CimPackage.POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__SHORT_NAME = CimPackage.POWER_SYSTEM_RESOURCE__SHORT_NAME;

    /**
     * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__DIAGRAM_OBJECTS = CimPackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

    /**
     * The feature id for the '<em><b>Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__LOCATION = CimPackage.POWER_SYSTEM_RESOURCE__LOCATION;

    /**
     * The feature id for the '<em><b>Measurements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__MEASUREMENTS = CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

    /**
     * The feature id for the '<em><b>Controls</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__CONTROLS = CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS;

    /**
     * The feature id for the '<em><b>Wind Generating Units</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT__WIND_GENERATING_UNITS = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Wind Power Plant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT_FEATURE_COUNT = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Wind Power Plant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIND_POWER_PLANT_OPERATION_COUNT = CimPackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__ID = CimPackage.POWER_SYSTEM_RESOURCE__ID;

    /**
     * The feature id for the '<em><b>Energy Ident Code Eic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__ENERGY_IDENT_CODE_EIC = CimPackage.POWER_SYSTEM_RESOURCE__ENERGY_IDENT_CODE_EIC;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__DESCRIPTION = CimPackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>MRID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__MRID = CimPackage.POWER_SYSTEM_RESOURCE__MRID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__NAME = CimPackage.POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__SHORT_NAME = CimPackage.POWER_SYSTEM_RESOURCE__SHORT_NAME;

    /**
     * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__DIAGRAM_OBJECTS = CimPackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

    /**
     * The feature id for the '<em><b>Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__LOCATION = CimPackage.POWER_SYSTEM_RESOURCE__LOCATION;

    /**
     * The feature id for the '<em><b>Measurements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__MEASUREMENTS = CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

    /**
     * The feature id for the '<em><b>Controls</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__CONTROLS = CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS;

    /**
     * The feature id for the '<em><b>Solar Generating Units</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Solar Power Plant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT_FEATURE_COUNT = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Solar Power Plant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLAR_POWER_PLANT_OPERATION_COUNT = CimPackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl <em>Boundary Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getBoundaryPoint()
     * @generated
     */
    int BOUNDARY_POINT = 2;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__ID = CimPackage.POWER_SYSTEM_RESOURCE__ID;

    /**
     * The feature id for the '<em><b>Energy Ident Code Eic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__ENERGY_IDENT_CODE_EIC = CimPackage.POWER_SYSTEM_RESOURCE__ENERGY_IDENT_CODE_EIC;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__DESCRIPTION = CimPackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>MRID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__MRID = CimPackage.POWER_SYSTEM_RESOURCE__MRID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__NAME = CimPackage.POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__SHORT_NAME = CimPackage.POWER_SYSTEM_RESOURCE__SHORT_NAME;

    /**
     * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__DIAGRAM_OBJECTS = CimPackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

    /**
     * The feature id for the '<em><b>Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__LOCATION = CimPackage.POWER_SYSTEM_RESOURCE__LOCATION;

    /**
     * The feature id for the '<em><b>Measurements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__MEASUREMENTS = CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

    /**
     * The feature id for the '<em><b>Controls</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__CONTROLS = CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS;

    /**
     * The feature id for the '<em><b>Connectivity Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__CONNECTIVITY_NODE = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To End Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__TO_END_NAME = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Direct Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__IS_DIRECT_CURRENT = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>From End Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__FROM_END_NAME = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>To End Iso Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__TO_END_ISO_CODE = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Excluded From Area Interchange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>To End Name Tso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__TO_END_NAME_TSO = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>From End Iso Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__FROM_END_ISO_CODE = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>From End Name Tso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT__FROM_END_NAME_TSO = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Boundary Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT_FEATURE_COUNT = CimPackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Boundary Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_POINT_OPERATION_COUNT = CimPackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind <em>Limit Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getLimitKind()
     * @generated
     */
    int LIMIT_KIND = 3;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant <em>Solar Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Solar Power Plant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant
     * @generated
     */
    EClass getSolarPowerPlant();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits <em>Solar Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Solar Generating Units</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant#getSolarGeneratingUnits()
     * @see #getSolarPowerPlant()
     * @generated
     */
    EReference getSolarPowerPlant_SolarGeneratingUnits();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant <em>Wind Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wind Power Plant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant
     * @generated
     */
    EClass getWindPowerPlant();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits <em>Wind Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Wind Generating Units</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits()
     * @see #getWindPowerPlant()
     * @generated
     */
    EReference getWindPowerPlant_WindGeneratingUnits();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint <em>Boundary Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boundary Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint
     * @generated
     */
    EClass getBoundaryPoint();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndIsoCode <em>To End Iso Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To End Iso Code</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndIsoCode()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_ToEndIsoCode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndNameTso <em>To End Name Tso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To End Name Tso</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndNameTso()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_ToEndNameTso();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndIsoCode <em>From End Iso Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From End Iso Code</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndIsoCode()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_FromEndIsoCode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsExcludedFromAreaInterchange <em>Is Excluded From Area Interchange</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Excluded From Area Interchange</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsExcludedFromAreaInterchange()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_IsExcludedFromAreaInterchange();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Connectivity Node</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode()
     * @see #getBoundaryPoint()
     * @generated
     */
    EReference getBoundaryPoint_ConnectivityNode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsDirectCurrent <em>Is Direct Current</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Direct Current</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsDirectCurrent()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_IsDirectCurrent();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndNameTso <em>From End Name Tso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From End Name Tso</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndNameTso()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_FromEndNameTso();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndName <em>From End Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From End Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndName()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_FromEndName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndName <em>To End Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To End Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndName()
     * @see #getBoundaryPoint()
     * @generated
     */
    EAttribute getBoundaryPoint_ToEndName();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind <em>Limit Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Limit Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind
     * @generated
     */
    EEnum getLimitKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EuFactory getEuFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.SolarPowerPlantImpl <em>Solar Power Plant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.SolarPowerPlantImpl
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getSolarPowerPlant()
         * @generated
         */
        EClass SOLAR_POWER_PLANT = eINSTANCE.getSolarPowerPlant();

        /**
         * The meta object literal for the '<em><b>Solar Generating Units</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOLAR_POWER_PLANT__SOLAR_GENERATING_UNITS = eINSTANCE.getSolarPowerPlant_SolarGeneratingUnits();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.WindPowerPlantImpl <em>Wind Power Plant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.WindPowerPlantImpl
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getWindPowerPlant()
         * @generated
         */
        EClass WIND_POWER_PLANT = eINSTANCE.getWindPowerPlant();

        /**
         * The meta object literal for the '<em><b>Wind Generating Units</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WIND_POWER_PLANT__WIND_GENERATING_UNITS = eINSTANCE.getWindPowerPlant_WindGeneratingUnits();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl <em>Boundary Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getBoundaryPoint()
         * @generated
         */
        EClass BOUNDARY_POINT = eINSTANCE.getBoundaryPoint();

        /**
         * The meta object literal for the '<em><b>To End Iso Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__TO_END_ISO_CODE = eINSTANCE.getBoundaryPoint_ToEndIsoCode();

        /**
         * The meta object literal for the '<em><b>To End Name Tso</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__TO_END_NAME_TSO = eINSTANCE.getBoundaryPoint_ToEndNameTso();

        /**
         * The meta object literal for the '<em><b>From End Iso Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__FROM_END_ISO_CODE = eINSTANCE.getBoundaryPoint_FromEndIsoCode();

        /**
         * The meta object literal for the '<em><b>Is Excluded From Area Interchange</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE = eINSTANCE
                .getBoundaryPoint_IsExcludedFromAreaInterchange();

        /**
         * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOUNDARY_POINT__CONNECTIVITY_NODE = eINSTANCE.getBoundaryPoint_ConnectivityNode();

        /**
         * The meta object literal for the '<em><b>Is Direct Current</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__IS_DIRECT_CURRENT = eINSTANCE.getBoundaryPoint_IsDirectCurrent();

        /**
         * The meta object literal for the '<em><b>From End Name Tso</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__FROM_END_NAME_TSO = eINSTANCE.getBoundaryPoint_FromEndNameTso();

        /**
         * The meta object literal for the '<em><b>From End Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__FROM_END_NAME = eINSTANCE.getBoundaryPoint_FromEndName();

        /**
         * The meta object literal for the '<em><b>To End Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDARY_POINT__TO_END_NAME = eINSTANCE.getBoundaryPoint_ToEndName();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind <em>Limit Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind
         * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuPackageImpl#getLimitKind()
         * @generated
         */
        EEnum LIMIT_KIND = eINSTANCE.getLimitKind();

    }

} //EuPackage
