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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage
 * @generated
 */
public interface CimFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CimFactory eINSTANCE = fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CimFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Object With ID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object With ID</em>'.
     * @generated
     */
    CimObjectWithID createCimObjectWithID();

    /**
     * Returns a new object of class '<em>Equivalent Injection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Injection</em>'.
     * @generated
     */
    EquivalentInjection createEquivalentInjection();

    /**
     * Returns a new object of class '<em>Hydro Power Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Power Plant</em>'.
     * @generated
     */
    HydroPowerPlant createHydroPowerPlant();

    /**
     * Returns a new object of class '<em>Energy Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Source</em>'.
     * @generated
     */
    EnergySource createEnergySource();

    /**
     * Returns a new object of class '<em>Tap Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Schedule</em>'.
     * @generated
     */
    TapSchedule createTapSchedule();

    /**
     * Returns a new object of class '<em>DC Series Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Series Device</em>'.
     * @generated
     */
    DCSeriesDevice createDCSeriesDevice();

    /**
     * Returns a new object of class '<em>External Network Injection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Network Injection</em>'.
     * @generated
     */
    ExternalNetworkInjection createExternalNetworkInjection();

    /**
     * Returns a new object of class '<em>Operational Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Limit</em>'.
     * @generated
     */
    OperationalLimit createOperationalLimit();

    /**
     * Returns a new object of class '<em>Ratio Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio Tap Changer</em>'.
     * @generated
     */
    RatioTapChanger createRatioTapChanger();

    /**
     * Returns a new object of class '<em>Reporting Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reporting Group</em>'.
     * @generated
     */
    ReportingGroup createReportingGroup();

    /**
     * Returns a new object of class '<em>Curve Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Curve Data</em>'.
     * @generated
     */
    CurveData createCurveData();

    /**
     * Returns a new object of class '<em>Nonlinear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nonlinear Shunt Compensator</em>'.
     * @generated
     */
    NonlinearShuntCompensator createNonlinearShuntCompensator();

    /**
     * Returns a new object of class '<em>Connectivity Node Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connectivity Node Container</em>'.
     * @generated
     */
    ConnectivityNodeContainer createConnectivityNodeContainer();

    /**
     * Returns a new object of class '<em>Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conform Load Schedule</em>'.
     * @generated
     */
    ConformLoadSchedule createConformLoadSchedule();

    /**
     * Returns a new object of class '<em>Connector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector</em>'.
     * @generated
     */
    Connector createConnector();

    /**
     * Returns a new object of class '<em>DC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Line Segment</em>'.
     * @generated
     */
    DCLineSegment createDCLineSegment();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Symmetrical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Symmetrical</em>'.
     * @generated
     */
    PhaseTapChangerSymmetrical createPhaseTapChangerSymmetrical();

    /**
     * Returns a new object of class '<em>Battery Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Battery Unit</em>'.
     * @generated
     */
    BatteryUnit createBatteryUnit();

    /**
     * Returns a new object of class '<em>Ratio Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio Tap Changer Table</em>'.
     * @generated
     */
    RatioTapChangerTable createRatioTapChangerTable();

    /**
     * Returns a new object of class '<em>Active Power Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Active Power Limit</em>'.
     * @generated
     */
    ActivePowerLimit createActivePowerLimit();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Table</em>'.
     * @generated
     */
    PhaseTapChangerTable createPhaseTapChangerTable();

    /**
     * Returns a new object of class '<em>Energy Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Area</em>'.
     * @generated
     */
    EnergyArea createEnergyArea();

    /**
     * Returns a new object of class '<em>Ground Disconnector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ground Disconnector</em>'.
     * @generated
     */
    GroundDisconnector createGroundDisconnector();

    /**
     * Returns a new object of class '<em>DC Base Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Base Terminal</em>'.
     * @generated
     */
    DCBaseTerminal createDCBaseTerminal();

    /**
     * Returns a new object of class '<em>Reactive Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reactive Capability Curve</em>'.
     * @generated
     */
    ReactiveCapabilityCurve createReactiveCapabilityCurve();

    /**
     * Returns a new object of class '<em>DC Busbar</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Busbar</em>'.
     * @generated
     */
    DCBusbar createDCBusbar();

    /**
     * Returns a new object of class '<em>Day Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Day Type</em>'.
     * @generated
     */
    DayType createDayType();

    /**
     * Returns a new object of class '<em>Switch Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Schedule</em>'.
     * @generated
     */
    SwitchSchedule createSwitchSchedule();

    /**
     * Returns a new object of class '<em>DC Breaker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Breaker</em>'.
     * @generated
     */
    DCBreaker createDCBreaker();

    /**
     * Returns a new object of class '<em>Tie Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tie Flow</em>'.
     * @generated
     */
    TieFlow createTieFlow();

    /**
     * Returns a new object of class '<em>Load Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Group</em>'.
     * @generated
     */
    LoadGroup createLoadGroup();

    /**
     * Returns a new object of class '<em>Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment Container</em>'.
     * @generated
     */
    EquipmentContainer createEquipmentContainer();

    /**
     * Returns a new object of class '<em>Station Supply</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Station Supply</em>'.
     * @generated
     */
    StationSupply createStationSupply();

    /**
     * Returns a new object of class '<em>AC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>AC Line Segment</em>'.
     * @generated
     */
    ACLineSegment createACLineSegment();

    /**
     * Returns a new object of class '<em>Ground</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ground</em>'.
     * @generated
     */
    Ground createGround();

    /**
     * Returns a new object of class '<em>Cut</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cut</em>'.
     * @generated
     */
    Cut createCut();

    /**
     * Returns a new object of class '<em>Cogeneration Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cogeneration Plant</em>'.
     * @generated
     */
    CogenerationPlant createCogenerationPlant();

    /**
     * Returns a new object of class '<em>Surge Arrester</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Surge Arrester</em>'.
     * @generated
     */
    SurgeArrester createSurgeArrester();

    /**
     * Returns a new object of class '<em>Equivalent Branch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Branch</em>'.
     * @generated
     */
    EquivalentBranch createEquivalentBranch();

    /**
     * Returns a new object of class '<em>Hydro Pump</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Pump</em>'.
     * @generated
     */
    HydroPump createHydroPump();

    /**
     * Returns a new object of class '<em>Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conform Load Group</em>'.
     * @generated
     */
    ConformLoadGroup createConformLoadGroup();

    /**
     * Returns a new object of class '<em>Non Conform Load</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Conform Load</em>'.
     * @generated
     */
    NonConformLoad createNonConformLoad();

    /**
     * Returns a new object of class '<em>CAES Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CAES Plant</em>'.
     * @generated
     */
    CAESPlant createCAESPlant();

    /**
     * Returns a new object of class '<em>Breaker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Breaker</em>'.
     * @generated
     */
    Breaker createBreaker();

    /**
     * Returns a new object of class '<em>Grounding Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Grounding Impedance</em>'.
     * @generated
     */
    GroundingImpedance createGroundingImpedance();

    /**
     * Returns a new object of class '<em>Operational Limit Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Limit Type</em>'.
     * @generated
     */
    OperationalLimitType createOperationalLimitType();

    /**
     * Returns a new object of class '<em>Control Area Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Area Generating Unit</em>'.
     * @generated
     */
    ControlAreaGeneratingUnit createControlAreaGeneratingUnit();

    /**
     * Returns a new object of class '<em>Bus Name Marker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bus Name Marker</em>'.
     * @generated
     */
    BusNameMarker createBusNameMarker();

    /**
     * Returns a new object of class '<em>Static Var Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Var Compensator</em>'.
     * @generated
     */
    StaticVarCompensator createStaticVarCompensator();

    /**
     * Returns a new object of class '<em>Conductor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conductor</em>'.
     * @generated
     */
    Conductor createConductor();

    /**
     * Returns a new object of class '<em>DC Line</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Line</em>'.
     * @generated
     */
    DCLine createDCLine();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Tabular</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Tabular</em>'.
     * @generated
     */
    PhaseTapChangerTabular createPhaseTapChangerTabular();

    /**
     * Returns a new object of class '<em>Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment</em>'.
     * @generated
     */
    Equipment createEquipment();

    /**
     * Returns a new object of class '<em>DC Chopper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Chopper</em>'.
     * @generated
     */
    DCChopper createDCChopper();

    /**
     * Returns a new object of class '<em>Tap Changer Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer Control</em>'.
     * @generated
     */
    TapChangerControl createTapChangerControl();

    /**
     * Returns a new object of class '<em>Earth Fault Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Earth Fault Compensator</em>'.
     * @generated
     */
    EarthFaultCompensator createEarthFaultCompensator();

    /**
     * Returns a new object of class '<em>Fault Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fault Indicator</em>'.
     * @generated
     */
    FaultIndicator createFaultIndicator();

    /**
     * Returns a new object of class '<em>DC Converter Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Converter Unit</em>'.
     * @generated
     */
    DCConverterUnit createDCConverterUnit();

    /**
     * Returns a new object of class '<em>Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Curve</em>'.
     * @generated
     */
    Curve createCurve();

    /**
     * Returns a new object of class '<em>Vs Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vs Converter</em>'.
     * @generated
     */
    VsConverter createVsConverter();

    /**
     * Returns a new object of class '<em>Hydro Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Generating Unit</em>'.
     * @generated
     */
    HydroGeneratingUnit createHydroGeneratingUnit();

    /**
     * Returns a new object of class '<em>Regulation Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regulation Schedule</em>'.
     * @generated
     */
    RegulationSchedule createRegulationSchedule();

    /**
     * Returns a new object of class '<em>Energy Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Connection</em>'.
     * @generated
     */
    EnergyConnection createEnergyConnection();

    /**
     * Returns a new object of class '<em>Equivalent Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Equipment</em>'.
     * @generated
     */
    EquivalentEquipment createEquivalentEquipment();

    /**
     * Returns a new object of class '<em>Fossil Fuel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fossil Fuel</em>'.
     * @generated
     */
    FossilFuel createFossilFuel();

    /**
     * Returns a new object of class '<em>Load Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Area</em>'.
     * @generated
     */
    LoadArea createLoadArea();

    /**
     * Returns a new object of class '<em>Combined Cycle Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combined Cycle Plant</em>'.
     * @generated
     */
    CombinedCyclePlant createCombinedCyclePlant();

    /**
     * Returns a new object of class '<em>Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conducting Equipment</em>'.
     * @generated
     */
    ConductingEquipment createConductingEquipment();

    /**
     * Returns a new object of class '<em>Clamp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clamp</em>'.
     * @generated
     */
    Clamp createClamp();

    /**
     * Returns a new object of class '<em>Apparent Power Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Apparent Power Limit</em>'.
     * @generated
     */
    ApparentPowerLimit createApparentPowerLimit();

    /**
     * Returns a new object of class '<em>Nuclear Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nuclear Generating Unit</em>'.
     * @generated
     */
    NuclearGeneratingUnit createNuclearGeneratingUnit();

    /**
     * Returns a new object of class '<em>Petersen Coil</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Petersen Coil</em>'.
     * @generated
     */
    PetersenCoil createPetersenCoil();

    /**
     * Returns a new object of class '<em>Load Response Characteristic</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Response Characteristic</em>'.
     * @generated
     */
    LoadResponseCharacteristic createLoadResponseCharacteristic();

    /**
     * Returns a new object of class '<em>Power Transformer End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Transformer End</em>'.
     * @generated
     */
    PowerTransformerEnd createPowerTransformerEnd();

    /**
     * Returns a new object of class '<em>Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Terminal</em>'.
     * @generated
     */
    Terminal createTerminal();

    /**
     * Returns a new object of class '<em>Bay</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bay</em>'.
     * @generated
     */
    Bay createBay();

    /**
     * Returns a new object of class '<em>Regulating Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regulating Control</em>'.
     * @generated
     */
    RegulatingControl createRegulatingControl();

    /**
     * Returns a new object of class '<em>Series Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Series Compensator</em>'.
     * @generated
     */
    SeriesCompensator createSeriesCompensator();

    /**
     * Returns a new object of class '<em>Protected Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protected Switch</em>'.
     * @generated
     */
    ProtectedSwitch createProtectedSwitch();

    /**
     * Returns a new object of class '<em>Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer Table Point</em>'.
     * @generated
     */
    TapChangerTablePoint createTapChangerTablePoint();

    /**
     * Returns a new object of class '<em>Busbar Section</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Busbar Section</em>'.
     * @generated
     */
    BusbarSection createBusbarSection();

    /**
     * Returns a new object of class '<em>Photo Voltaic Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Photo Voltaic Unit</em>'.
     * @generated
     */
    PhotoVoltaicUnit createPhotoVoltaicUnit();

    /**
     * Returns a new object of class '<em>Line</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Line</em>'.
     * @generated
     */
    Line createLine();

    /**
     * Returns a new object of class '<em>Season</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Season</em>'.
     * @generated
     */
    Season createSeason();

    /**
     * Returns a new object of class '<em>Regular Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regular Interval Schedule</em>'.
     * @generated
     */
    RegularIntervalSchedule createRegularIntervalSchedule();

    /**
     * Returns a new object of class '<em>Non Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Conform Load Group</em>'.
     * @generated
     */
    NonConformLoadGroup createNonConformLoadGroup();

    /**
     * Returns a new object of class '<em>Operational Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Limit Set</em>'.
     * @generated
     */
    OperationalLimitSet createOperationalLimitSet();

    /**
     * Returns a new object of class '<em>Phase Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer</em>'.
     * @generated
     */
    PhaseTapChanger createPhaseTapChanger();

    /**
     * Returns a new object of class '<em>DC Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Equipment Container</em>'.
     * @generated
     */
    DCEquipmentContainer createDCEquipmentContainer();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Asymmetrical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Asymmetrical</em>'.
     * @generated
     */
    PhaseTapChangerAsymmetrical createPhaseTapChangerAsymmetrical();

    /**
     * Returns a new object of class '<em>Connectivity Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connectivity Node</em>'.
     * @generated
     */
    ConnectivityNode createConnectivityNode();

    /**
     * Returns a new object of class '<em>Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sensor</em>'.
     * @generated
     */
    Sensor createSensor();

    /**
     * Returns a new object of class '<em>Load Break Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Break Switch</em>'.
     * @generated
     */
    LoadBreakSwitch createLoadBreakSwitch();

    /**
     * Returns a new object of class '<em>Season Day Type Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Season Day Type Schedule</em>'.
     * @generated
     */
    SeasonDayTypeSchedule createSeasonDayTypeSchedule();

    /**
     * Returns a new object of class '<em>Disconnecting Circuit Breaker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disconnecting Circuit Breaker</em>'.
     * @generated
     */
    DisconnectingCircuitBreaker createDisconnectingCircuitBreaker();

    /**
     * Returns a new object of class '<em>DC Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Switch</em>'.
     * @generated
     */
    DCSwitch createDCSwitch();

    /**
     * Returns a new object of class '<em>Disconnector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disconnector</em>'.
     * @generated
     */
    Disconnector createDisconnector();

    /**
     * Returns a new object of class '<em>DC Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Node</em>'.
     * @generated
     */
    DCNode createDCNode();

    /**
     * Returns a new object of class '<em>Solar Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Solar Generating Unit</em>'.
     * @generated
     */
    SolarGeneratingUnit createSolarGeneratingUnit();

    /**
     * Returns a new object of class '<em>Substation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Substation</em>'.
     * @generated
     */
    Substation createSubstation();

    /**
     * Returns a new object of class '<em>Nonlinear Shunt Compensator Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nonlinear Shunt Compensator Point</em>'.
     * @generated
     */
    NonlinearShuntCompensatorPoint createNonlinearShuntCompensatorPoint();

    /**
     * Returns a new object of class '<em>Identified Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identified Object</em>'.
     * @generated
     */
    IdentifiedObject createIdentifiedObject();

    /**
     * Returns a new object of class '<em>Power System Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Resource</em>'.
     * @generated
     */
    PowerSystemResource createPowerSystemResource();

    /**
     * Returns a new object of class '<em>Sub Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Geographical Region</em>'.
     * @generated
     */
    SubGeographicalRegion createSubGeographicalRegion();

    /**
     * Returns a new object of class '<em>Thermal Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Thermal Generating Unit</em>'.
     * @generated
     */
    ThermalGeneratingUnit createThermalGeneratingUnit();

    /**
     * Returns a new object of class '<em>Potential Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Potential Transformer</em>'.
     * @generated
     */
    PotentialTransformer createPotentialTransformer();

    /**
     * Returns a new object of class '<em>Vs Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vs Capability Curve</em>'.
     * @generated
     */
    VsCapabilityCurve createVsCapabilityCurve();

    /**
     * Returns a new object of class '<em>DC Ground</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Ground</em>'.
     * @generated
     */
    DCGround createDCGround();

    /**
     * Returns a new object of class '<em>Regulating Cond Eq</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regulating Cond Eq</em>'.
     * @generated
     */
    RegulatingCondEq createRegulatingCondEq();

    /**
     * Returns a new object of class '<em>Energy Consumer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Consumer</em>'.
     * @generated
     */
    EnergyConsumer createEnergyConsumer();

    /**
     * Returns a new object of class '<em>Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Geographical Region</em>'.
     * @generated
     */
    GeographicalRegion createGeographicalRegion();

    /**
     * Returns a new object of class '<em>Equivalent Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Network</em>'.
     * @generated
     */
    EquivalentNetwork createEquivalentNetwork();

    /**
     * Returns a new object of class '<em>Gross To Net Active Power Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gross To Net Active Power Curve</em>'.
     * @generated
     */
    GrossToNetActivePowerCurve createGrossToNetActivePowerCurve();

    /**
     * Returns a new object of class '<em>Base Voltage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Voltage</em>'.
     * @generated
     */
    BaseVoltage createBaseVoltage();

    /**
     * Returns a new object of class '<em>DC Shunt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Shunt</em>'.
     * @generated
     */
    DCShunt createDCShunt();

    /**
     * Returns a new object of class '<em>Cs Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cs Converter</em>'.
     * @generated
     */
    CsConverter createCsConverter();

    /**
     * Returns a new object of class '<em>DC Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Conducting Equipment</em>'.
     * @generated
     */
    DCConductingEquipment createDCConductingEquipment();

    /**
     * Returns a new object of class '<em>Jumper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Jumper</em>'.
     * @generated
     */
    Jumper createJumper();

    /**
     * Returns a new object of class '<em>Current Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Current Limit</em>'.
     * @generated
     */
    CurrentLimit createCurrentLimit();

    /**
     * Returns a new object of class '<em>Transformer End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer End</em>'.
     * @generated
     */
    TransformerEnd createTransformerEnd();

    /**
     * Returns a new object of class '<em>Non Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Conform Load Schedule</em>'.
     * @generated
     */
    NonConformLoadSchedule createNonConformLoadSchedule();

    /**
     * Returns a new object of class '<em>Rotating Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rotating Machine</em>'.
     * @generated
     */
    RotatingMachine createRotatingMachine();

    /**
     * Returns a new object of class '<em>Energy Scheduling Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Scheduling Type</em>'.
     * @generated
     */
    EnergySchedulingType createEnergySchedulingType();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Linear</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Linear</em>'.
     * @generated
     */
    PhaseTapChangerLinear createPhaseTapChangerLinear();

    /**
     * Returns a new object of class '<em>Basic Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Basic Interval Schedule</em>'.
     * @generated
     */
    BasicIntervalSchedule createBasicIntervalSchedule();

    /**
     * Returns a new object of class '<em>ACDC Converter DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACDC Converter DC Terminal</em>'.
     * @generated
     */
    ACDCConverterDCTerminal createACDCConverterDCTerminal();

    /**
     * Returns a new object of class '<em>Current Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Current Transformer</em>'.
     * @generated
     */
    CurrentTransformer createCurrentTransformer();

    /**
     * Returns a new object of class '<em>Power Electronics Wind Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Electronics Wind Unit</em>'.
     * @generated
     */
    PowerElectronicsWindUnit createPowerElectronicsWindUnit();

    /**
     * Returns a new object of class '<em>Power Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Transformer</em>'.
     * @generated
     */
    PowerTransformer createPowerTransformer();

    /**
     * Returns a new object of class '<em>Wave Trap</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wave Trap</em>'.
     * @generated
     */
    WaveTrap createWaveTrap();

    /**
     * Returns a new object of class '<em>Equivalent Shunt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Shunt</em>'.
     * @generated
     */
    EquivalentShunt createEquivalentShunt();

    /**
     * Returns a new object of class '<em>Linear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Linear Shunt Compensator</em>'.
     * @generated
     */
    LinearShuntCompensator createLinearShuntCompensator();

    /**
     * Returns a new object of class '<em>Control Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Area</em>'.
     * @generated
     */
    ControlArea createControlArea();

    /**
     * Returns a new object of class '<em>Synchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine</em>'.
     * @generated
     */
    SynchronousMachine createSynchronousMachine();

    /**
     * Returns a new object of class '<em>Auxiliary Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Auxiliary Equipment</em>'.
     * @generated
     */
    AuxiliaryEquipment createAuxiliaryEquipment();

    /**
     * Returns a new object of class '<em>Voltage Level</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Level</em>'.
     * @generated
     */
    VoltageLevel createVoltageLevel();

    /**
     * Returns a new object of class '<em>Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer</em>'.
     * @generated
     */
    TapChanger createTapChanger();

    /**
     * Returns a new object of class '<em>Conform Load</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conform Load</em>'.
     * @generated
     */
    ConformLoad createConformLoad();

    /**
     * Returns a new object of class '<em>Ratio Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio Tap Changer Table Point</em>'.
     * @generated
     */
    RatioTapChangerTablePoint createRatioTapChangerTablePoint();

    /**
     * Returns a new object of class '<em>DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Terminal</em>'.
     * @generated
     */
    DCTerminal createDCTerminal();

    /**
     * Returns a new object of class '<em>Post Line Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Post Line Sensor</em>'.
     * @generated
     */
    PostLineSensor createPostLineSensor();

    /**
     * Returns a new object of class '<em>Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generating Unit</em>'.
     * @generated
     */
    GeneratingUnit createGeneratingUnit();

    /**
     * Returns a new object of class '<em>Wind Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Generating Unit</em>'.
     * @generated
     */
    WindGeneratingUnit createWindGeneratingUnit();

    /**
     * Returns a new object of class '<em>Junction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Junction</em>'.
     * @generated
     */
    Junction createJunction();

    /**
     * Returns a new object of class '<em>Power Electronics Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Electronics Unit</em>'.
     * @generated
     */
    PowerElectronicsUnit createPowerElectronicsUnit();

    /**
     * Returns a new object of class '<em>Regular Time Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regular Time Point</em>'.
     * @generated
     */
    RegularTimePoint createRegularTimePoint();

    /**
     * Returns a new object of class '<em>Power Electronics Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Electronics Connection</em>'.
     * @generated
     */
    PowerElectronicsConnection createPowerElectronicsConnection();

    /**
     * Returns a new object of class '<em>ACDC Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACDC Converter</em>'.
     * @generated
     */
    ACDCConverter createACDCConverter();

    /**
     * Returns a new object of class '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch</em>'.
     * @generated
     */
    Switch createSwitch();

    /**
     * Returns a new object of class '<em>DC Disconnector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Disconnector</em>'.
     * @generated
     */
    DCDisconnector createDCDisconnector();

    /**
     * Returns a new object of class '<em>ACDC Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACDC Terminal</em>'.
     * @generated
     */
    ACDCTerminal createACDCTerminal();

    /**
     * Returns a new object of class '<em>Sub Load Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Load Area</em>'.
     * @generated
     */
    SubLoadArea createSubLoadArea();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Non Linear</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Non Linear</em>'.
     * @generated
     */
    PhaseTapChangerNonLinear createPhaseTapChangerNonLinear();

    /**
     * Returns a new object of class '<em>Voltage Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Limit</em>'.
     * @generated
     */
    VoltageLimit createVoltageLimit();

    /**
     * Returns a new object of class '<em>Fuse</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fuse</em>'.
     * @generated
     */
    Fuse createFuse();

    /**
     * Returns a new object of class '<em>Asynchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine</em>'.
     * @generated
     */
    AsynchronousMachine createAsynchronousMachine();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Table Point</em>'.
     * @generated
     */
    PhaseTapChangerTablePoint createPhaseTapChangerTablePoint();

    /**
     * Returns a new object of class '<em>Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shunt Compensator</em>'.
     * @generated
     */
    ShuntCompensator createShuntCompensator();

    /**
     * Returns a new object of class '<em>Visibility Layer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Visibility Layer</em>'.
     * @generated
     */
    VisibilityLayer createVisibilityLayer();

    /**
     * Returns a new object of class '<em>Diagram Object Glue Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object Glue Point</em>'.
     * @generated
     */
    DiagramObjectGluePoint createDiagramObjectGluePoint();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    Diagram createDiagram();

    /**
     * Returns a new object of class '<em>Diagram Object Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object Style</em>'.
     * @generated
     */
    DiagramObjectStyle createDiagramObjectStyle();

    /**
     * Returns a new object of class '<em>Text Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Diagram Object</em>'.
     * @generated
     */
    TextDiagramObject createTextDiagramObject();

    /**
     * Returns a new object of class '<em>Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object</em>'.
     * @generated
     */
    DiagramObject createDiagramObject();

    /**
     * Returns a new object of class '<em>Diagram Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Style</em>'.
     * @generated
     */
    DiagramStyle createDiagramStyle();

    /**
     * Returns a new object of class '<em>Diagram Object Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object Point</em>'.
     * @generated
     */
    DiagramObjectPoint createDiagramObjectPoint();

    /**
     * Returns a new object of class '<em>Underexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexcitation Limiter User Defined</em>'.
     * @generated
     */
    UnderexcitationLimiterUserDefined createUnderexcitationLimiterUserDefined();

    /**
     * Returns a new object of class '<em>Pss IEEE3B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE3B</em>'.
     * @generated
     */
    PssIEEE3B createPssIEEE3B();

    /**
     * Returns a new object of class '<em>Pss IEEE2B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE2B</em>'.
     * @generated
     */
    PssIEEE2B createPssIEEE2B();

    /**
     * Returns a new object of class '<em>Discontinuous Excitation Control User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discontinuous Excitation Control User Defined</em>'.
     * @generated
     */
    DiscontinuousExcitationControlUserDefined createDiscontinuousExcitationControlUserDefined();

    /**
     * Returns a new object of class '<em>Exc PIC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc PIC</em>'.
     * @generated
     */
    ExcPIC createExcPIC();

    /**
     * Returns a new object of class '<em>Pss IEEE4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE4B</em>'.
     * @generated
     */
    PssIEEE4B createPssIEEE4B();

    /**
     * Returns a new object of class '<em>Discontinuous Excitation Control Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discontinuous Excitation Control Dynamics</em>'.
     * @generated
     */
    DiscontinuousExcitationControlDynamics createDiscontinuousExcitationControlDynamics();

    /**
     * Returns a new object of class '<em>Pss IEEE1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE1A</em>'.
     * @generated
     */
    PssIEEE1A createPssIEEE1A();

    /**
     * Returns a new object of class '<em>VSC User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VSC User Defined</em>'.
     * @generated
     */
    VSCUserDefined createVSCUserDefined();

    /**
     * Returns a new object of class '<em>Gov GAST</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST</em>'.
     * @generated
     */
    GovGAST createGovGAST();

    /**
     * Returns a new object of class '<em>Pss WECC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss WECC</em>'.
     * @generated
     */
    PssWECC createPssWECC();

    /**
     * Returns a new object of class '<em>Wind Aero One Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Aero One Dim IEC</em>'.
     * @generated
     */
    WindAeroOneDimIEC createWindAeroOneDimIEC();

    /**
     * Returns a new object of class '<em>Synchronous Machine Simplified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Simplified</em>'.
     * @generated
     */
    SynchronousMachineSimplified createSynchronousMachineSimplified();

    /**
     * Returns a new object of class '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * @generated
     */
    AsynchronousMachineEquivalentCircuit createAsynchronousMachineEquivalentCircuit();

    /**
     * Returns a new object of class '<em>Exc IEEEST1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST1A</em>'.
     * @generated
     */
    ExcIEEEST1A createExcIEEEST1A();

    /**
     * Returns a new object of class '<em>Turbine Load Controller Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Load Controller Dynamics</em>'.
     * @generated
     */
    TurbineLoadControllerDynamics createTurbineLoadControllerDynamics();

    /**
     * Returns a new object of class '<em>Synchronous Machine Detailed</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Detailed</em>'.
     * @generated
     */
    SynchronousMachineDetailed createSynchronousMachineDetailed();

    /**
     * Returns a new object of class '<em>Exc IEEEST2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST2A</em>'.
     * @generated
     */
    ExcIEEEST2A createExcIEEEST2A();

    /**
     * Returns a new object of class '<em>Exc HU</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc HU</em>'.
     * @generated
     */
    ExcHU createExcHU();

    /**
     * Returns a new object of class '<em>Exc CZ</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc CZ</em>'.
     * @generated
     */
    ExcCZ createExcCZ();

    /**
     * Returns a new object of class '<em>Mechanical Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mechanical Load Dynamics</em>'.
     * @generated
     */
    MechanicalLoadDynamics createMechanicalLoadDynamics();

    /**
     * Returns a new object of class '<em>Pss2 ST</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss2 ST</em>'.
     * @generated
     */
    Pss2ST createPss2ST();

    /**
     * Returns a new object of class '<em>Exc SCRX</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc SCRX</em>'.
     * @generated
     */
    ExcSCRX createExcSCRX();

    /**
     * Returns a new object of class '<em>Gov GASTWD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GASTWD</em>'.
     * @generated
     */
    GovGASTWD createGovGASTWD();

    /**
     * Returns a new object of class '<em>Wind Type3or4 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Type3or4 User Defined</em>'.
     * @generated
     */
    WindType3or4UserDefined createWindType3or4UserDefined();

    /**
     * Returns a new object of class '<em>Gov Hydro1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro1</em>'.
     * @generated
     */
    GovHydro1 createGovHydro1();

    /**
     * Returns a new object of class '<em>Gov Hydro2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro2</em>'.
     * @generated
     */
    GovHydro2 createGovHydro2();

    /**
     * Returns a new object of class '<em>Gov Hydro3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro3</em>'.
     * @generated
     */
    GovHydro3 createGovHydro3();

    /**
     * Returns a new object of class '<em>Gov Hydro4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro4</em>'.
     * @generated
     */
    GovHydro4 createGovHydro4();

    /**
     * Returns a new object of class '<em>Proprietary Parameter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Proprietary Parameter Dynamics</em>'.
     * @generated
     */
    ProprietaryParameterDynamics createProprietaryParameterDynamics();

    /**
     * Returns a new object of class '<em>Exc NI</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc NI</em>'.
     * @generated
     */
    ExcNI createExcNI();

    /**
     * Returns a new object of class '<em>Wind Turbine Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type4 IEC</em>'.
     * @generated
     */
    WindTurbineType4IEC createWindTurbineType4IEC();

    /**
     * Returns a new object of class '<em>Gov Steam2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam2</em>'.
     * @generated
     */
    GovSteam2 createGovSteam2();

    /**
     * Returns a new object of class '<em>Gov Steam1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam1</em>'.
     * @generated
     */
    GovSteam1 createGovSteam1();

    /**
     * Returns a new object of class '<em>Gov Steam0</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam0</em>'.
     * @generated
     */
    GovSteam0 createGovSteam0();

    /**
     * Returns a new object of class '<em>Gov Hydro R</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro R</em>'.
     * @generated
     */
    GovHydroR createGovHydroR();

    /**
     * Returns a new object of class '<em>Turbine Governor Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Governor Dynamics</em>'.
     * @generated
     */
    TurbineGovernorDynamics createTurbineGovernorDynamics();

    /**
     * Returns a new object of class '<em>Load Motor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Motor</em>'.
     * @generated
     */
    LoadMotor createLoadMotor();

    /**
     * Returns a new object of class '<em>Wind Cont QIEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont QIEC</em>'.
     * @generated
     */
    WindContQIEC createWindContQIEC();

    /**
     * Returns a new object of class '<em>Wind Gen Type3a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type3a IEC</em>'.
     * @generated
     */
    WindGenType3aIEC createWindGenType3aIEC();

    /**
     * Returns a new object of class '<em>Exc SK</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc SK</em>'.
     * @generated
     */
    ExcSK createExcSK();

    /**
     * Returns a new object of class '<em>Rotating Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rotating Machine Dynamics</em>'.
     * @generated
     */
    RotatingMachineDynamics createRotatingMachineDynamics();

    /**
     * Returns a new object of class '<em>Voltage Adjuster Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Adjuster Dynamics</em>'.
     * @generated
     */
    VoltageAdjusterDynamics createVoltageAdjusterDynamics();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * @generated
     */
    PFVArControllerType2Dynamics createPFVArControllerType2Dynamics();

    /**
     * Returns a new object of class '<em>Voltage Compensator User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Compensator User Defined</em>'.
     * @generated
     */
    VoltageCompensatorUserDefined createVoltageCompensatorUserDefined();

    /**
     * Returns a new object of class '<em>Wind Pitch Cont Power IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Pitch Cont Power IEC</em>'.
     * @generated
     */
    WindPitchContPowerIEC createWindPitchContPowerIEC();

    /**
     * Returns a new object of class '<em>Wind Gen Turbine Type1a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Turbine Type1a IEC</em>'.
     * @generated
     */
    WindGenTurbineType1aIEC createWindGenTurbineType1aIEC();

    /**
     * Returns a new object of class '<em>Wind Protection IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Protection IEC</em>'.
     * @generated
     */
    WindProtectionIEC createWindProtectionIEC();

    /**
     * Returns a new object of class '<em>Wind Ref Frame Rot IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Ref Frame Rot IEC</em>'.
     * @generated
     */
    WindRefFrameRotIEC createWindRefFrameRotIEC();

    /**
     * Returns a new object of class '<em>Load Generic Non Linear</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Generic Non Linear</em>'.
     * @generated
     */
    LoadGenericNonLinear createLoadGenericNonLinear();

    /**
     * Returns a new object of class '<em>Wind Turbine Type1or2 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type1or2 IEC</em>'.
     * @generated
     */
    WindTurbineType1or2IEC createWindTurbineType1or2IEC();

    /**
     * Returns a new object of class '<em>Wind Gen Turbine Type2 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Turbine Type2 IEC</em>'.
     * @generated
     */
    WindGenTurbineType2IEC createWindGenTurbineType2IEC();

    /**
     * Returns a new object of class '<em>Wind Gen Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type3 IEC</em>'.
     * @generated
     */
    WindGenType3IEC createWindGenType3IEC();

    /**
     * Returns a new object of class '<em>Wind Cont PType3 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont PType3 IEC</em>'.
     * @generated
     */
    WindContPType3IEC createWindContPType3IEC();

    /**
     * Returns a new object of class '<em>Underexc Lim2 Simplified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim2 Simplified</em>'.
     * @generated
     */
    UnderexcLim2Simplified createUnderexcLim2Simplified();

    /**
     * Returns a new object of class '<em>Wind Plant IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant IEC</em>'.
     * @generated
     */
    WindPlantIEC createWindPlantIEC();

    /**
     * Returns a new object of class '<em>Pss5</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss5</em>'.
     * @generated
     */
    Pss5 createPss5();

    /**
     * Returns a new object of class '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * @generated
     */
    AsynchronousMachineTimeConstantReactance createAsynchronousMachineTimeConstantReactance();

    /**
     * Returns a new object of class '<em>Pss STAB2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss STAB2A</em>'.
     * @generated
     */
    PssSTAB2A createPssSTAB2A();

    /**
     * Returns a new object of class '<em>Pss1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss1</em>'.
     * @generated
     */
    Pss1 createPss1();

    /**
     * Returns a new object of class '<em>Wind Turbine Type4b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type4b IEC</em>'.
     * @generated
     */
    WindTurbineType4bIEC createWindTurbineType4bIEC();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type2 User Defined</em>'.
     * @generated
     */
    PFVArControllerType2UserDefined createPFVArControllerType2UserDefined();

    /**
     * Returns a new object of class '<em>Gov Hydro PID2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro PID2</em>'.
     * @generated
     */
    GovHydroPID2 createGovHydroPID2();

    /**
     * Returns a new object of class '<em>Gov Hydro Francis</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro Francis</em>'.
     * @generated
     */
    GovHydroFrancis createGovHydroFrancis();

    /**
     * Returns a new object of class '<em>CSC Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CSC Dynamics</em>'.
     * @generated
     */
    CSCDynamics createCSCDynamics();

    /**
     * Returns a new object of class '<em>Overexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexcitation Limiter Dynamics</em>'.
     * @generated
     */
    OverexcitationLimiterDynamics createOverexcitationLimiterDynamics();

    /**
     * Returns a new object of class '<em>Exc RQB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc RQB</em>'.
     * @generated
     */
    ExcRQB createExcRQB();

    /**
     * Returns a new object of class '<em>Exc ANS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ANS</em>'.
     * @generated
     */
    ExcANS createExcANS();

    /**
     * Returns a new object of class '<em>Load Aggregate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Aggregate</em>'.
     * @generated
     */
    LoadAggregate createLoadAggregate();

    /**
     * Returns a new object of class '<em>Wind Gen Type3b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type3b IEC</em>'.
     * @generated
     */
    WindGenType3bIEC createWindGenType3bIEC();

    /**
     * Returns a new object of class '<em>Gov Steam IEEE1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam IEEE1</em>'.
     * @generated
     */
    GovSteamIEEE1 createGovSteamIEEE1();

    /**
     * Returns a new object of class '<em>Underexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexcitation Limiter Dynamics</em>'.
     * @generated
     */
    UnderexcitationLimiterDynamics createUnderexcitationLimiterDynamics();

    /**
     * Returns a new object of class '<em>Gov Hydro WEH</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro WEH</em>'.
     * @generated
     */
    GovHydroWEH createGovHydroWEH();

    /**
     * Returns a new object of class '<em>Exc DC3A1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC3A1</em>'.
     * @generated
     */
    ExcDC3A1 createExcDC3A1();

    /**
     * Returns a new object of class '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * @generated
     */
    WindTurbineType1or2Dynamics createWindTurbineType1or2Dynamics();

    /**
     * Returns a new object of class '<em>Overexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexcitation Limiter User Defined</em>'.
     * @generated
     */
    OverexcitationLimiterUserDefined createOverexcitationLimiterUserDefined();

    /**
     * Returns a new object of class '<em>Turbine Load Controller User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Load Controller User Defined</em>'.
     * @generated
     */
    TurbineLoadControllerUserDefined createTurbineLoadControllerUserDefined();

    /**
     * Returns a new object of class '<em>Wind Cont Pitch Angle IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont Pitch Angle IEC</em>'.
     * @generated
     */
    WindContPitchAngleIEC createWindContPitchAngleIEC();

    /**
     * Returns a new object of class '<em>Exc BBC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc BBC</em>'.
     * @generated
     */
    ExcBBC createExcBBC();

    /**
     * Returns a new object of class '<em>Overexc Lim IEEE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim IEEE</em>'.
     * @generated
     */
    OverexcLimIEEE createOverexcLimIEEE();

    /**
     * Returns a new object of class '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * @generated
     */
    WindTurbineType3or4Dynamics createWindTurbineType3or4Dynamics();

    /**
     * Returns a new object of class '<em>Remote Input Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Input Signal</em>'.
     * @generated
     */
    RemoteInputSignal createRemoteInputSignal();

    /**
     * Returns a new object of class '<em>Exc AVR1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR1</em>'.
     * @generated
     */
    ExcAVR1 createExcAVR1();

    /**
     * Returns a new object of class '<em>Exc AVR2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR2</em>'.
     * @generated
     */
    ExcAVR2 createExcAVR2();

    /**
     * Returns a new object of class '<em>Exc AVR3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR3</em>'.
     * @generated
     */
    ExcAVR3 createExcAVR3();

    /**
     * Returns a new object of class '<em>Exc AVR4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR4</em>'.
     * @generated
     */
    ExcAVR4 createExcAVR4();

    /**
     * Returns a new object of class '<em>Exc AVR5</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR5</em>'.
     * @generated
     */
    ExcAVR5 createExcAVR5();

    /**
     * Returns a new object of class '<em>Exc AVR7</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR7</em>'.
     * @generated
     */
    ExcAVR7 createExcAVR7();

    /**
     * Returns a new object of class '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * @generated
     */
    PFVArType2IEEEVArController createPFVArType2IEEEVArController();

    /**
     * Returns a new object of class '<em>Exc IEEEAC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC2A</em>'.
     * @generated
     */
    ExcIEEEAC2A createExcIEEEAC2A();

    /**
     * Returns a new object of class '<em>Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load User Defined</em>'.
     * @generated
     */
    LoadUserDefined createLoadUserDefined();

    /**
     * Returns a new object of class '<em>Mechanical Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mechanical Load User Defined</em>'.
     * @generated
     */
    MechanicalLoadUserDefined createMechanicalLoadUserDefined();

    /**
     * Returns a new object of class '<em>Exc IEEEAC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC1A</em>'.
     * @generated
     */
    ExcIEEEAC1A createExcIEEEAC1A();

    /**
     * Returns a new object of class '<em>Gov Hydro IEEE0</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro IEEE0</em>'.
     * @generated
     */
    GovHydroIEEE0 createGovHydroIEEE0();

    /**
     * Returns a new object of class '<em>Gov Hydro IEEE2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro IEEE2</em>'.
     * @generated
     */
    GovHydroIEEE2 createGovHydroIEEE2();

    /**
     * Returns a new object of class '<em>Exc IEEEAC6A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC6A</em>'.
     * @generated
     */
    ExcIEEEAC6A createExcIEEEAC6A();

    /**
     * Returns a new object of class '<em>Exc IEEEAC5A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC5A</em>'.
     * @generated
     */
    ExcIEEEAC5A createExcIEEEAC5A();

    /**
     * Returns a new object of class '<em>Cross Compound Turbine Governor Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cross Compound Turbine Governor Dynamics</em>'.
     * @generated
     */
    CrossCompoundTurbineGovernorDynamics createCrossCompoundTurbineGovernorDynamics();

    /**
     * Returns a new object of class '<em>Static Var Compensator Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Var Compensator Dynamics</em>'.
     * @generated
     */
    StaticVarCompensatorDynamics createStaticVarCompensatorDynamics();

    /**
     * Returns a new object of class '<em>Exc IEEEAC4A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC4A</em>'.
     * @generated
     */
    ExcIEEEAC4A createExcIEEEAC4A();

    /**
     * Returns a new object of class '<em>Exc IEEEAC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC3A</em>'.
     * @generated
     */
    ExcIEEEAC3A createExcIEEEAC3A();

    /**
     * Returns a new object of class '<em>Excitation System User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Excitation System User Defined</em>'.
     * @generated
     */
    ExcitationSystemUserDefined createExcitationSystemUserDefined();

    /**
     * Returns a new object of class '<em>Wind Type1or2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Type1or2 User Defined</em>'.
     * @generated
     */
    WindType1or2UserDefined createWindType1or2UserDefined();

    /**
     * Returns a new object of class '<em>Gov GAST4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST4</em>'.
     * @generated
     */
    GovGAST4 createGovGAST4();

    /**
     * Returns a new object of class '<em>Gov GAST3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST3</em>'.
     * @generated
     */
    GovGAST3 createGovGAST3();

    /**
     * Returns a new object of class '<em>Gov GAST2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST2</em>'.
     * @generated
     */
    GovGAST2 createGovGAST2();

    /**
     * Returns a new object of class '<em>Gov GAST1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST1</em>'.
     * @generated
     */
    GovGAST1 createGovGAST1();

    /**
     * Returns a new object of class '<em>Mech Load1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mech Load1</em>'.
     * @generated
     */
    MechLoad1 createMechLoad1();

    /**
     * Returns a new object of class '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * @generated
     */
    PFVArType1IEEEVArController createPFVArType1IEEEVArController();

    /**
     * Returns a new object of class '<em>Wind Cont Rotor RIEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont Rotor RIEC</em>'.
     * @generated
     */
    WindContRotorRIEC createWindContRotorRIEC();

    /**
     * Returns a new object of class '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * @generated
     */
    PFVArType2IEEEPFController createPFVArType2IEEEPFController();

    /**
     * Returns a new object of class '<em>VAdj IEEE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VAdj IEEE</em>'.
     * @generated
     */
    VAdjIEEE createVAdjIEEE();

    /**
     * Returns a new object of class '<em>Synchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Equivalent Circuit</em>'.
     * @generated
     */
    SynchronousMachineEquivalentCircuit createSynchronousMachineEquivalentCircuit();

    /**
     * Returns a new object of class '<em>Wind Plant Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant Dynamics</em>'.
     * @generated
     */
    WindPlantDynamics createWindPlantDynamics();

    /**
     * Returns a new object of class '<em>Exc ELIN1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ELIN1</em>'.
     * @generated
     */
    ExcELIN1 createExcELIN1();

    /**
     * Returns a new object of class '<em>Exc ELIN2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ELIN2</em>'.
     * @generated
     */
    ExcELIN2 createExcELIN2();

    /**
     * Returns a new object of class '<em>Asynchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine User Defined</em>'.
     * @generated
     */
    AsynchronousMachineUserDefined createAsynchronousMachineUserDefined();

    /**
     * Returns a new object of class '<em>Exc ST4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST4B</em>'.
     * @generated
     */
    ExcST4B createExcST4B();

    /**
     * Returns a new object of class '<em>Exc ST3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST3A</em>'.
     * @generated
     */
    ExcST3A createExcST3A();

    /**
     * Returns a new object of class '<em>Exc ST2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST2A</em>'.
     * @generated
     */
    ExcST2A createExcST2A();

    /**
     * Returns a new object of class '<em>Exc IEEEAC8B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC8B</em>'.
     * @generated
     */
    ExcIEEEAC8B createExcIEEEAC8B();

    /**
     * Returns a new object of class '<em>Exc ST1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST1A</em>'.
     * @generated
     */
    ExcST1A createExcST1A();

    /**
     * Returns a new object of class '<em>Exc IEEEAC7B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC7B</em>'.
     * @generated
     */
    ExcIEEEAC7B createExcIEEEAC7B();

    /**
     * Returns a new object of class '<em>Gov Steam SGO</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam SGO</em>'.
     * @generated
     */
    GovSteamSGO createGovSteamSGO();

    /**
     * Returns a new object of class '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * @generated
     */
    WindPlantFreqPcontrolIEC createWindPlantFreqPcontrolIEC();

    /**
     * Returns a new object of class '<em>Exc ST7B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST7B</em>'.
     * @generated
     */
    ExcST7B createExcST7B();

    /**
     * Returns a new object of class '<em>Power System Stabilizer User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Stabilizer User Defined</em>'.
     * @generated
     */
    PowerSystemStabilizerUserDefined createPowerSystemStabilizerUserDefined();

    /**
     * Returns a new object of class '<em>Dynamics Function Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dynamics Function Block</em>'.
     * @generated
     */
    DynamicsFunctionBlock createDynamicsFunctionBlock();

    /**
     * Returns a new object of class '<em>Gov Hydro PID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro PID</em>'.
     * @generated
     */
    GovHydroPID createGovHydroPID();

    /**
     * Returns a new object of class '<em>Exc ST6B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST6B</em>'.
     * @generated
     */
    ExcST6B createExcST6B();

    /**
     * Returns a new object of class '<em>Wind Cont PType4b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont PType4b IEC</em>'.
     * @generated
     */
    WindContPType4bIEC createWindContPType4bIEC();

    /**
     * Returns a new object of class '<em>Gov Hydro Pelton</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro Pelton</em>'.
     * @generated
     */
    GovHydroPelton createGovHydroPelton();

    /**
     * Returns a new object of class '<em>VSC Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VSC Dynamics</em>'.
     * @generated
     */
    VSCDynamics createVSCDynamics();

    /**
     * Returns a new object of class '<em>Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Dynamics</em>'.
     * @generated
     */
    LoadDynamics createLoadDynamics();

    /**
     * Returns a new object of class '<em>Pss ELIN2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss ELIN2</em>'.
     * @generated
     */
    PssELIN2 createPssELIN2();

    /**
     * Returns a new object of class '<em>Synchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Time Constant Reactance</em>'.
     * @generated
     */
    SynchronousMachineTimeConstantReactance createSynchronousMachineTimeConstantReactance();

    /**
     * Returns a new object of class '<em>Gov CT1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov CT1</em>'.
     * @generated
     */
    GovCT1 createGovCT1();

    /**
     * Returns a new object of class '<em>Gov CT2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov CT2</em>'.
     * @generated
     */
    GovCT2 createGovCT2();

    /**
     * Returns a new object of class '<em>Exc IEEEDC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC1A</em>'.
     * @generated
     */
    ExcIEEEDC1A createExcIEEEDC1A();

    /**
     * Returns a new object of class '<em>Wind Cont QPQU Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont QPQU Lim IEC</em>'.
     * @generated
     */
    WindContQPQULimIEC createWindContQPQULimIEC();

    /**
     * Returns a new object of class '<em>Exc IEEEDC4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC4B</em>'.
     * @generated
     */
    ExcIEEEDC4B createExcIEEEDC4B();

    /**
     * Returns a new object of class '<em>Exc IEEEDC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC3A</em>'.
     * @generated
     */
    ExcIEEEDC3A createExcIEEEDC3A();

    /**
     * Returns a new object of class '<em>Exc IEEEDC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC2A</em>'.
     * @generated
     */
    ExcIEEEDC2A createExcIEEEDC2A();

    /**
     * Returns a new object of class '<em>CSC User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CSC User Defined</em>'.
     * @generated
     */
    CSCUserDefined createCSCUserDefined();

    /**
     * Returns a new object of class '<em>Load Static</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Static</em>'.
     * @generated
     */
    LoadStatic createLoadStatic();

    /**
     * Returns a new object of class '<em>Wind Aero Two Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Aero Two Dim IEC</em>'.
     * @generated
     */
    WindAeroTwoDimIEC createWindAeroTwoDimIEC();

    /**
     * Returns a new object of class '<em>Wind Cont Curr Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont Curr Lim IEC</em>'.
     * @generated
     */
    WindContCurrLimIEC createWindContCurrLimIEC();

    /**
     * Returns a new object of class '<em>Pss PTIST1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss PTIST1</em>'.
     * @generated
     */
    PssPTIST1 createPssPTIST1();

    /**
     * Returns a new object of class '<em>Pss PTIST3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss PTIST3</em>'.
     * @generated
     */
    PssPTIST3 createPssPTIST3();

    /**
     * Returns a new object of class '<em>Gov Hydro WPID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro WPID</em>'.
     * @generated
     */
    GovHydroWPID createGovHydroWPID();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * @generated
     */
    PFVArControllerType1Dynamics createPFVArControllerType1Dynamics();

    /**
     * Returns a new object of class '<em>Wind Cont QLim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont QLim IEC</em>'.
     * @generated
     */
    WindContQLimIEC createWindContQLimIEC();

    /**
     * Returns a new object of class '<em>Voltage Compensator Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Compensator Dynamics</em>'.
     * @generated
     */
    VoltageCompensatorDynamics createVoltageCompensatorDynamics();

    /**
     * Returns a new object of class '<em>Synchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine User Defined</em>'.
     * @generated
     */
    SynchronousMachineUserDefined createSynchronousMachineUserDefined();

    /**
     * Returns a new object of class '<em>Gen ICompensation For Gen J</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gen ICompensation For Gen J</em>'.
     * @generated
     */
    GenICompensationForGenJ createGenICompensationForGenJ();

    /**
     * Returns a new object of class '<em>Exc REXS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc REXS</em>'.
     * @generated
     */
    ExcREXS createExcREXS();

    /**
     * Returns a new object of class '<em>Asynchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine Dynamics</em>'.
     * @generated
     */
    AsynchronousMachineDynamics createAsynchronousMachineDynamics();

    /**
     * Returns a new object of class '<em>PFV Ar Type2 Common1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type2 Common1</em>'.
     * @generated
     */
    PFVArType2Common1 createPFVArType2Common1();

    /**
     * Returns a new object of class '<em>Wind Aero Const IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Aero Const IEC</em>'.
     * @generated
     */
    WindAeroConstIEC createWindAeroConstIEC();

    /**
     * Returns a new object of class '<em>HVDC Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HVDC Dynamics</em>'.
     * @generated
     */
    HVDCDynamics createHVDCDynamics();

    /**
     * Returns a new object of class '<em>Turbine Governor User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Governor User Defined</em>'.
     * @generated
     */
    TurbineGovernorUserDefined createTurbineGovernorUserDefined();

    /**
     * Returns a new object of class '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * @generated
     */
    PFVArType1IEEEPFController createPFVArType1IEEEPFController();

    /**
     * Returns a new object of class '<em>Exc DC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC3A</em>'.
     * @generated
     */
    ExcDC3A createExcDC3A();

    /**
     * Returns a new object of class '<em>Pss2 B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss2 B</em>'.
     * @generated
     */
    Pss2B createPss2B();

    /**
     * Returns a new object of class '<em>Exc DC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC2A</em>'.
     * @generated
     */
    ExcDC2A createExcDC2A();

    /**
     * Returns a new object of class '<em>Wind Plant Reactive Control IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant Reactive Control IEC</em>'.
     * @generated
     */
    WindPlantReactiveControlIEC createWindPlantReactiveControlIEC();

    /**
     * Returns a new object of class '<em>Gov Steam CC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam CC</em>'.
     * @generated
     */
    GovSteamCC createGovSteamCC();

    /**
     * Returns a new object of class '<em>Exc DC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC1A</em>'.
     * @generated
     */
    ExcDC1A createExcDC1A();

    /**
     * Returns a new object of class '<em>Overexc Lim2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim2</em>'.
     * @generated
     */
    OverexcLim2 createOverexcLim2();

    /**
     * Returns a new object of class '<em>Gov Steam EU</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam EU</em>'.
     * @generated
     */
    GovSteamEU createGovSteamEU();

    /**
     * Returns a new object of class '<em>Wind Dynamics Lookup Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Dynamics Lookup Table</em>'.
     * @generated
     */
    WindDynamicsLookupTable createWindDynamicsLookupTable();

    /**
     * Returns a new object of class '<em>Pss1 A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss1 A</em>'.
     * @generated
     */
    Pss1A createPss1A();

    /**
     * Returns a new object of class '<em>Voltage Adjuster User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Adjuster User Defined</em>'.
     * @generated
     */
    VoltageAdjusterUserDefined createVoltageAdjusterUserDefined();

    /**
     * Returns a new object of class '<em>Synchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Dynamics</em>'.
     * @generated
     */
    SynchronousMachineDynamics createSynchronousMachineDynamics();

    /**
     * Returns a new object of class '<em>Gov Steam BB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam BB</em>'.
     * @generated
     */
    GovSteamBB createGovSteamBB();

    /**
     * Returns a new object of class '<em>Underexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim X2</em>'.
     * @generated
     */
    UnderexcLimX2 createUnderexcLimX2();

    /**
     * Returns a new object of class '<em>Underexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim X1</em>'.
     * @generated
     */
    UnderexcLimX1 createUnderexcLimX1();

    /**
     * Returns a new object of class '<em>Wind Gen Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type4 IEC</em>'.
     * @generated
     */
    WindGenType4IEC createWindGenType4IEC();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type1 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type1 User Defined</em>'.
     * @generated
     */
    PFVArControllerType1UserDefined createPFVArControllerType1UserDefined();

    /**
     * Returns a new object of class '<em>Exc OEX3T</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc OEX3T</em>'.
     * @generated
     */
    ExcOEX3T createExcOEX3T();

    /**
     * Returns a new object of class '<em>Wind Gen Turbine Type1b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Turbine Type1b IEC</em>'.
     * @generated
     */
    WindGenTurbineType1bIEC createWindGenTurbineType1bIEC();

    /**
     * Returns a new object of class '<em>Pss SB4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss SB4</em>'.
     * @generated
     */
    PssSB4 createPssSB4();

    /**
     * Returns a new object of class '<em>Load Composite</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Composite</em>'.
     * @generated
     */
    LoadComposite createLoadComposite();

    /**
     * Returns a new object of class '<em>Exc SEXS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc SEXS</em>'.
     * @generated
     */
    ExcSEXS createExcSEXS();

    /**
     * Returns a new object of class '<em>Wind Cont PType4a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont PType4a IEC</em>'.
     * @generated
     */
    WindContPType4aIEC createWindContPType4aIEC();

    /**
     * Returns a new object of class '<em>Exc AC4A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC4A</em>'.
     * @generated
     */
    ExcAC4A createExcAC4A();

    /**
     * Returns a new object of class '<em>Excitation System Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Excitation System Dynamics</em>'.
     * @generated
     */
    ExcitationSystemDynamics createExcitationSystemDynamics();

    /**
     * Returns a new object of class '<em>Exc AC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC3A</em>'.
     * @generated
     */
    ExcAC3A createExcAC3A();

    /**
     * Returns a new object of class '<em>Exc AC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC2A</em>'.
     * @generated
     */
    ExcAC2A createExcAC2A();

    /**
     * Returns a new object of class '<em>Exc AC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC1A</em>'.
     * @generated
     */
    ExcAC1A createExcAC1A();

    /**
     * Returns a new object of class '<em>Exc AC8B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC8B</em>'.
     * @generated
     */
    ExcAC8B createExcAC8B();

    /**
     * Returns a new object of class '<em>Exc IEEEST7B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST7B</em>'.
     * @generated
     */
    ExcIEEEST7B createExcIEEEST7B();

    /**
     * Returns a new object of class '<em>Pss RQB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss RQB</em>'.
     * @generated
     */
    PssRQB createPssRQB();

    /**
     * Returns a new object of class '<em>VComp IEEE Type1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VComp IEEE Type1</em>'.
     * @generated
     */
    VCompIEEEType1 createVCompIEEEType1();

    /**
     * Returns a new object of class '<em>Exc AC6A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC6A</em>'.
     * @generated
     */
    ExcAC6A createExcAC6A();

    /**
     * Returns a new object of class '<em>VComp IEEE Type2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VComp IEEE Type2</em>'.
     * @generated
     */
    VCompIEEEType2 createVCompIEEEType2();

    /**
     * Returns a new object of class '<em>Exc AC5A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC5A</em>'.
     * @generated
     */
    ExcAC5A createExcAC5A();

    /**
     * Returns a new object of class '<em>Wind Mech IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Mech IEC</em>'.
     * @generated
     */
    WindMechIEC createWindMechIEC();

    /**
     * Returns a new object of class '<em>Overexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim X1</em>'.
     * @generated
     */
    OverexcLimX1 createOverexcLimX1();

    /**
     * Returns a new object of class '<em>Overexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim X2</em>'.
     * @generated
     */
    OverexcLimX2 createOverexcLimX2();

    /**
     * Returns a new object of class '<em>Underexc Lim IEEE2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim IEEE2</em>'.
     * @generated
     */
    UnderexcLimIEEE2 createUnderexcLimIEEE2();

    /**
     * Returns a new object of class '<em>Underexc Lim IEEE1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim IEEE1</em>'.
     * @generated
     */
    UnderexcLimIEEE1 createUnderexcLimIEEE1();

    /**
     * Returns a new object of class '<em>Exc IEEEST3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST3A</em>'.
     * @generated
     */
    ExcIEEEST3A createExcIEEEST3A();

    /**
     * Returns a new object of class '<em>Pss SH</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss SH</em>'.
     * @generated
     */
    PssSH createPssSH();

    /**
     * Returns a new object of class '<em>Gov Hydro DD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro DD</em>'.
     * @generated
     */
    GovHydroDD createGovHydroDD();

    /**
     * Returns a new object of class '<em>Pss SK</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss SK</em>'.
     * @generated
     */
    PssSK createPssSK();

    /**
     * Returns a new object of class '<em>Exc IEEEST4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST4B</em>'.
     * @generated
     */
    ExcIEEEST4B createExcIEEEST4B();

    /**
     * Returns a new object of class '<em>Wind Turbine Type4a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type4a IEC</em>'.
     * @generated
     */
    WindTurbineType4aIEC createWindTurbineType4aIEC();

    /**
     * Returns a new object of class '<em>Exc IEEEST5B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST5B</em>'.
     * @generated
     */
    ExcIEEEST5B createExcIEEEST5B();

    /**
     * Returns a new object of class '<em>Exc IEEEST6B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST6B</em>'.
     * @generated
     */
    ExcIEEEST6B createExcIEEEST6B();

    /**
     * Returns a new object of class '<em>Gov Steam FV4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam FV4</em>'.
     * @generated
     */
    GovSteamFV4 createGovSteamFV4();

    /**
     * Returns a new object of class '<em>Gov Steam FV3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam FV3</em>'.
     * @generated
     */
    GovSteamFV3 createGovSteamFV3();

    /**
     * Returns a new object of class '<em>Gov Steam FV2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam FV2</em>'.
     * @generated
     */
    GovSteamFV2 createGovSteamFV2();

    /**
     * Returns a new object of class '<em>Power System Stabilizer Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Stabilizer Dynamics</em>'.
     * @generated
     */
    PowerSystemStabilizerDynamics createPowerSystemStabilizerDynamics();

    /**
     * Returns a new object of class '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * @generated
     */
    DiscExcContIEEEDEC1A createDiscExcContIEEEDEC1A();

    /**
     * Returns a new object of class '<em>Wind Turbine Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type3 IEC</em>'.
     * @generated
     */
    WindTurbineType3IEC createWindTurbineType3IEC();

    /**
     * Returns a new object of class '<em>Wind Plant User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant User Defined</em>'.
     * @generated
     */
    WindPlantUserDefined createWindPlantUserDefined();

    /**
     * Returns a new object of class '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * @generated
     */
    DiscExcContIEEEDEC3A createDiscExcContIEEEDEC3A();

    /**
     * Returns a new object of class '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * @generated
     */
    DiscExcContIEEEDEC2A createDiscExcContIEEEDEC2A();

    /**
     * Returns a new object of class '<em>Wind Turbine Type3or4 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type3or4 IEC</em>'.
     * @generated
     */
    WindTurbineType3or4IEC createWindTurbineType3or4IEC();

    /**
     * Returns a new object of class '<em>SVC User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SVC User Defined</em>'.
     * @generated
     */
    SVCUserDefined createSVCUserDefined();

    /**
     * Returns a new object of class '<em>Turb LCFB1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turb LCFB1</em>'.
     * @generated
     */
    TurbLCFB1 createTurbLCFB1();

    /**
     * Returns a new object of class '<em>Street Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Street Address</em>'.
     * @generated
     */
    StreetAddress createStreetAddress();

    /**
     * Returns a new object of class '<em>Status</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Status</em>'.
     * @generated
     */
    Status createStatus();

    /**
     * Returns a new object of class '<em>Service Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Location</em>'.
     * @generated
     */
    ServiceLocation createServiceLocation();

    /**
     * Returns a new object of class '<em>Coordinate System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coordinate System</em>'.
     * @generated
     */
    CoordinateSystem createCoordinateSystem();

    /**
     * Returns a new object of class '<em>Position Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position Point</em>'.
     * @generated
     */
    PositionPoint createPositionPoint();

    /**
     * Returns a new object of class '<em>Street Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Street Detail</em>'.
     * @generated
     */
    StreetDetail createStreetDetail();

    /**
     * Returns a new object of class '<em>Work Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Location</em>'.
     * @generated
     */
    WorkLocation createWorkLocation();

    /**
     * Returns a new object of class '<em>Town Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Town Detail</em>'.
     * @generated
     */
    TownDetail createTownDetail();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    Location createLocation();

    /**
     * Returns a new object of class '<em>Analog Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Value</em>'.
     * @generated
     */
    AnalogValue createAnalogValue();

    /**
     * Returns a new object of class '<em>Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Command</em>'.
     * @generated
     */
    Command createCommand();

    /**
     * Returns a new object of class '<em>Discrete Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discrete Value</em>'.
     * @generated
     */
    DiscreteValue createDiscreteValue();

    /**
     * Returns a new object of class '<em>Measurement Value Quality</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement Value Quality</em>'.
     * @generated
     */
    MeasurementValueQuality createMeasurementValueQuality();

    /**
     * Returns a new object of class '<em>Analog Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Limit Set</em>'.
     * @generated
     */
    AnalogLimitSet createAnalogLimitSet();

    /**
     * Returns a new object of class '<em>Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Limit</em>'.
     * @generated
     */
    Limit createLimit();

    /**
     * Returns a new object of class '<em>Analog Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Control</em>'.
     * @generated
     */
    AnalogControl createAnalogControl();

    /**
     * Returns a new object of class '<em>String Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Measurement Value</em>'.
     * @generated
     */
    StringMeasurementValue createStringMeasurementValue();

    /**
     * Returns a new object of class '<em>Accumulator Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Value</em>'.
     * @generated
     */
    AccumulatorValue createAccumulatorValue();

    /**
     * Returns a new object of class '<em>Set Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Point</em>'.
     * @generated
     */
    SetPoint createSetPoint();

    /**
     * Returns a new object of class '<em>Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog</em>'.
     * @generated
     */
    Analog createAnalog();

    /**
     * Returns a new object of class '<em>Measurement Value Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement Value Source</em>'.
     * @generated
     */
    MeasurementValueSource createMeasurementValueSource();

    /**
     * Returns a new object of class '<em>Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement Value</em>'.
     * @generated
     */
    MeasurementValue createMeasurementValue();

    /**
     * Returns a new object of class '<em>Quality61850</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Quality61850</em>'.
     * @generated
     */
    Quality61850 createQuality61850();

    /**
     * Returns a new object of class '<em>Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Limit Set</em>'.
     * @generated
     */
    LimitSet createLimitSet();

    /**
     * Returns a new object of class '<em>Accumulator Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Limit</em>'.
     * @generated
     */
    AccumulatorLimit createAccumulatorLimit();

    /**
     * Returns a new object of class '<em>Measurement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement</em>'.
     * @generated
     */
    Measurement createMeasurement();

    /**
     * Returns a new object of class '<em>Value Alias Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Alias Set</em>'.
     * @generated
     */
    ValueAliasSet createValueAliasSet();

    /**
     * Returns a new object of class '<em>Accumulator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator</em>'.
     * @generated
     */
    Accumulator createAccumulator();

    /**
     * Returns a new object of class '<em>Accumulator Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Limit Set</em>'.
     * @generated
     */
    AccumulatorLimitSet createAccumulatorLimitSet();

    /**
     * Returns a new object of class '<em>Value To Alias</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value To Alias</em>'.
     * @generated
     */
    ValueToAlias createValueToAlias();

    /**
     * Returns a new object of class '<em>Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discrete</em>'.
     * @generated
     */
    Discrete createDiscrete();

    /**
     * Returns a new object of class '<em>Raise Lower Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Raise Lower Command</em>'.
     * @generated
     */
    RaiseLowerCommand createRaiseLowerCommand();

    /**
     * Returns a new object of class '<em>IO Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IO Point</em>'.
     * @generated
     */
    IOPoint createIOPoint();

    /**
     * Returns a new object of class '<em>Accumulator Reset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Reset</em>'.
     * @generated
     */
    AccumulatorReset createAccumulatorReset();

    /**
     * Returns a new object of class '<em>Analog Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Limit</em>'.
     * @generated
     */
    AnalogLimit createAnalogLimit();

    /**
     * Returns a new object of class '<em>String Measurement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Measurement</em>'.
     * @generated
     */
    StringMeasurement createStringMeasurement();

    /**
     * Returns a new object of class '<em>Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control</em>'.
     * @generated
     */
    Control createControl();

    /**
     * Returns a new object of class '<em>Mutual Coupling</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mutual Coupling</em>'.
     * @generated
     */
    MutualCoupling createMutualCoupling();

    /**
     * Returns a new object of class '<em>Sv Tap Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Tap Step</em>'.
     * @generated
     */
    SvTapStep createSvTapStep();

    /**
     * Returns a new object of class '<em>Topological Island</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Topological Island</em>'.
     * @generated
     */
    TopologicalIsland createTopologicalIsland();

    /**
     * Returns a new object of class '<em>Sv Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Switch</em>'.
     * @generated
     */
    SvSwitch createSvSwitch();

    /**
     * Returns a new object of class '<em>Sv Power Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Power Flow</em>'.
     * @generated
     */
    SvPowerFlow createSvPowerFlow();

    /**
     * Returns a new object of class '<em>Sv Shunt Compensator Sections</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Shunt Compensator Sections</em>'.
     * @generated
     */
    SvShuntCompensatorSections createSvShuntCompensatorSections();

    /**
     * Returns a new object of class '<em>Sv Voltage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Voltage</em>'.
     * @generated
     */
    SvVoltage createSvVoltage();

    /**
     * Returns a new object of class '<em>DC Topological Island</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Topological Island</em>'.
     * @generated
     */
    DCTopologicalIsland createDCTopologicalIsland();

    /**
     * Returns a new object of class '<em>Topological Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Topological Node</em>'.
     * @generated
     */
    TopologicalNode createTopologicalNode();

    /**
     * Returns a new object of class '<em>Sv Status</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Status</em>'.
     * @generated
     */
    SvStatus createSvStatus();

    /**
     * Returns a new object of class '<em>Sv Injection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Injection</em>'.
     * @generated
     */
    SvInjection createSvInjection();

    /**
     * Returns a new object of class '<em>DC Topological Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Topological Node</em>'.
     * @generated
     */
    DCTopologicalNode createDCTopologicalNode();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CimPackage getCimPackage();

} //CimFactory
