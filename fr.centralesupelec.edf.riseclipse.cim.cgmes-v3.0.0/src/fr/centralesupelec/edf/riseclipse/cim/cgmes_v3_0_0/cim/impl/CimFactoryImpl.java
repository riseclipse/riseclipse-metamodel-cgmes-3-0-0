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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CimFactoryImpl extends EFactoryImpl implements CimFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CimFactory init() {
        try {
            CimFactory theCimFactory = ( CimFactory ) EPackage.Registry.INSTANCE.getEFactory( CimPackage.eNS_URI );
            if( theCimFactory != null ) {
                return theCimFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new CimFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CimFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case CimPackage.CIM_OBJECT_WITH_ID:
            return createCimObjectWithID();
        case CimPackage.DAY_TYPE:
            return createDayType();
        case CimPackage.BUSBAR_SECTION:
            return createBusbarSection();
        case CimPackage.FAULT_INDICATOR:
            return createFaultIndicator();
        case CimPackage.DC_BUSBAR:
            return createDCBusbar();
        case CimPackage.HYDRO_POWER_PLANT:
            return createHydroPowerPlant();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC:
            return createLoadResponseCharacteristic();
        case CimPackage.APPARENT_POWER_LIMIT:
            return createApparentPowerLimit();
        case CimPackage.VS_CONVERTER:
            return createVsConverter();
        case CimPackage.VS_CAPABILITY_CURVE:
            return createVsCapabilityCurve();
        case CimPackage.POTENTIAL_TRANSFORMER:
            return createPotentialTransformer();
        case CimPackage.DC_TERMINAL:
            return createDCTerminal();
        case CimPackage.STATIC_VAR_COMPENSATOR:
            return createStaticVarCompensator();
        case CimPackage.CS_CONVERTER:
            return createCsConverter();
        case CimPackage.ACDC_TERMINAL:
            return createACDCTerminal();
        case CimPackage.DISCONNECTING_CIRCUIT_BREAKER:
            return createDisconnectingCircuitBreaker();
        case CimPackage.RATIO_TAP_CHANGER:
            return createRatioTapChanger();
        case CimPackage.LINE:
            return createLine();
        case CimPackage.BREAKER:
            return createBreaker();
        case CimPackage.DISCONNECTOR:
            return createDisconnector();
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL:
            return createPhaseTapChangerAsymmetrical();
        case CimPackage.OPERATIONAL_LIMIT_SET:
            return createOperationalLimitSet();
        case CimPackage.OPERATIONAL_LIMIT:
            return createOperationalLimit();
        case CimPackage.HYDRO_PUMP:
            return createHydroPump();
        case CimPackage.REGULATION_SCHEDULE:
            return createRegulationSchedule();
        case CimPackage.TAP_CHANGER_CONTROL:
            return createTapChangerControl();
        case CimPackage.EQUIPMENT:
            return createEquipment();
        case CimPackage.ACTIVE_POWER_LIMIT:
            return createActivePowerLimit();
        case CimPackage.DC_SERIES_DEVICE:
            return createDCSeriesDevice();
        case CimPackage.SURGE_ARRESTER:
            return createSurgeArrester();
        case CimPackage.CONNECTOR:
            return createConnector();
        case CimPackage.CURRENT_TRANSFORMER:
            return createCurrentTransformer();
        case CimPackage.CURVE_DATA:
            return createCurveData();
        case CimPackage.DC_SHUNT:
            return createDCShunt();
        case CimPackage.SUB_LOAD_AREA:
            return createSubLoadArea();
        case CimPackage.PHASE_TAP_CHANGER_LINEAR:
            return createPhaseTapChangerLinear();
        case CimPackage.SERIES_COMPENSATOR:
            return createSeriesCompensator();
        case CimPackage.REGULATING_COND_EQ:
            return createRegulatingCondEq();
        case CimPackage.TERMINAL:
            return createTerminal();
        case CimPackage.ASYNCHRONOUS_MACHINE:
            return createAsynchronousMachine();
        case CimPackage.CURRENT_LIMIT:
            return createCurrentLimit();
        case CimPackage.TAP_CHANGER_TABLE_POINT:
            return createTapChangerTablePoint();
        case CimPackage.DC_EQUIPMENT_CONTAINER:
            return createDCEquipmentContainer();
        case CimPackage.EXTERNAL_NETWORK_INJECTION:
            return createExternalNetworkInjection();
        case CimPackage.LOAD_GROUP:
            return createLoadGroup();
        case CimPackage.SOLAR_GENERATING_UNIT:
            return createSolarGeneratingUnit();
        case CimPackage.SYNCHRONOUS_MACHINE:
            return createSynchronousMachine();
        case CimPackage.ACDC_CONVERTER:
            return createACDCConverter();
        case CimPackage.GROUND_DISCONNECTOR:
            return createGroundDisconnector();
        case CimPackage.TAP_SCHEDULE:
            return createTapSchedule();
        case CimPackage.EQUIPMENT_CONTAINER:
            return createEquipmentContainer();
        case CimPackage.TAP_CHANGER:
            return createTapChanger();
        case CimPackage.DC_BREAKER:
            return createDCBreaker();
        case CimPackage.EQUIVALENT_BRANCH:
            return createEquivalentBranch();
        case CimPackage.TRANSFORMER_END:
            return createTransformerEnd();
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE:
            return createNonConformLoadSchedule();
        case CimPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE:
            return createGrossToNetActivePowerCurve();
        case CimPackage.EQUIVALENT_NETWORK:
            return createEquivalentNetwork();
        case CimPackage.CONFORM_LOAD_GROUP:
            return createConformLoadGroup();
        case CimPackage.LOAD_AREA:
            return createLoadArea();
        case CimPackage.ENERGY_CONNECTION:
            return createEnergyConnection();
        case CimPackage.THERMAL_GENERATING_UNIT:
            return createThermalGeneratingUnit();
        case CimPackage.ROTATING_MACHINE:
            return createRotatingMachine();
        case CimPackage.BAY:
            return createBay();
        case CimPackage.CAES_PLANT:
            return createCAESPlant();
        case CimPackage.CONTROL_AREA_GENERATING_UNIT:
            return createControlAreaGeneratingUnit();
        case CimPackage.SUB_GEOGRAPHICAL_REGION:
            return createSubGeographicalRegion();
        case CimPackage.SWITCH_SCHEDULE:
            return createSwitchSchedule();
        case CimPackage.DC_CHOPPER:
            return createDCChopper();
        case CimPackage.GROUND:
            return createGround();
        case CimPackage.EQUIVALENT_SHUNT:
            return createEquivalentShunt();
        case CimPackage.CONDUCTOR:
            return createConductor();
        case CimPackage.PHASE_TAP_CHANGER_TABLE:
            return createPhaseTapChangerTable();
        case CimPackage.DC_BASE_TERMINAL:
            return createDCBaseTerminal();
        case CimPackage.DC_SWITCH:
            return createDCSwitch();
        case CimPackage.FUSE:
            return createFuse();
        case CimPackage.SUBSTATION:
            return createSubstation();
        case CimPackage.AC_LINE_SEGMENT:
            return createACLineSegment();
        case CimPackage.DC_LINE_SEGMENT:
            return createDCLineSegment();
        case CimPackage.CURVE:
            return createCurve();
        case CimPackage.PHASE_TAP_CHANGER:
            return createPhaseTapChanger();
        case CimPackage.STATION_SUPPLY:
            return createStationSupply();
        case CimPackage.PETERSEN_COIL:
            return createPetersenCoil();
        case CimPackage.PROTECTED_SWITCH:
            return createProtectedSwitch();
        case CimPackage.DC_LINE:
            return createDCLine();
        case CimPackage.POWER_TRANSFORMER_END:
            return createPowerTransformerEnd();
        case CimPackage.COMBINED_CYCLE_PLANT:
            return createCombinedCyclePlant();
        case CimPackage.RATIO_TAP_CHANGER_TABLE:
            return createRatioTapChangerTable();
        case CimPackage.IDENTIFIED_OBJECT:
            return createIdentifiedObject();
        case CimPackage.LOAD_BREAK_SWITCH:
            return createLoadBreakSwitch();
        case CimPackage.DC_CONDUCTING_EQUIPMENT:
            return createDCConductingEquipment();
        case CimPackage.CLAMP:
            return createClamp();
        case CimPackage.JUMPER:
            return createJumper();
        case CimPackage.CONTROL_AREA:
            return createControlArea();
        case CimPackage.PHASE_TAP_CHANGER_SYMMETRICAL:
            return createPhaseTapChangerSymmetrical();
        case CimPackage.CONNECTIVITY_NODE:
            return createConnectivityNode();
        case CimPackage.POWER_ELECTRONICS_UNIT:
            return createPowerElectronicsUnit();
        case CimPackage.CONFORM_LOAD:
            return createConformLoad();
        case CimPackage.PHOTO_VOLTAIC_UNIT:
            return createPhotoVoltaicUnit();
        case CimPackage.WIND_GENERATING_UNIT:
            return createWindGeneratingUnit();
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE:
            return createSeasonDayTypeSchedule();
        case CimPackage.CUT:
            return createCut();
        case CimPackage.DC_GROUND:
            return createDCGround();
        case CimPackage.VOLTAGE_LIMIT:
            return createVoltageLimit();
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL:
            return createACDCConverterDCTerminal();
        case CimPackage.POWER_ELECTRONICS_WIND_UNIT:
            return createPowerElectronicsWindUnit();
        case CimPackage.NUCLEAR_GENERATING_UNIT:
            return createNuclearGeneratingUnit();
        case CimPackage.REGULATING_CONTROL:
            return createRegulatingControl();
        case CimPackage.SENSOR:
            return createSensor();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR:
            return createNonlinearShuntCompensator();
        case CimPackage.BATTERY_UNIT:
            return createBatteryUnit();
        case CimPackage.REACTIVE_CAPABILITY_CURVE:
            return createReactiveCapabilityCurve();
        case CimPackage.VOLTAGE_LEVEL:
            return createVoltageLevel();
        case CimPackage.DC_NODE:
            return createDCNode();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT:
            return createNonlinearShuntCompensatorPoint();
        case CimPackage.DC_DISCONNECTOR:
            return createDCDisconnector();
        case CimPackage.JUNCTION:
            return createJunction();
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR:
            return createPhaseTapChangerNonLinear();
        case CimPackage.CONDUCTING_EQUIPMENT:
            return createConductingEquipment();
        case CimPackage.BASE_VOLTAGE:
            return createBaseVoltage();
        case CimPackage.FOSSIL_FUEL:
            return createFossilFuel();
        case CimPackage.SWITCH:
            return createSwitch();
        case CimPackage.AUXILIARY_EQUIPMENT:
            return createAuxiliaryEquipment();
        case CimPackage.REPORTING_GROUP:
            return createReportingGroup();
        case CimPackage.GROUNDING_IMPEDANCE:
            return createGroundingImpedance();
        case CimPackage.NON_CONFORM_LOAD:
            return createNonConformLoad();
        case CimPackage.WAVE_TRAP:
            return createWaveTrap();
        case CimPackage.SEASON:
            return createSeason();
        case CimPackage.TIE_FLOW:
            return createTieFlow();
        case CimPackage.POWER_SYSTEM_RESOURCE:
            return createPowerSystemResource();
        case CimPackage.HYDRO_GENERATING_UNIT:
            return createHydroGeneratingUnit();
        case CimPackage.ENERGY_CONSUMER:
            return createEnergyConsumer();
        case CimPackage.POWER_ELECTRONICS_CONNECTION:
            return createPowerElectronicsConnection();
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT:
            return createPhaseTapChangerTablePoint();
        case CimPackage.ENERGY_SCHEDULING_TYPE:
            return createEnergySchedulingType();
        case CimPackage.DC_CONVERTER_UNIT:
            return createDCConverterUnit();
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT:
            return createRatioTapChangerTablePoint();
        case CimPackage.EARTH_FAULT_COMPENSATOR:
            return createEarthFaultCompensator();
        case CimPackage.EQUIVALENT_INJECTION:
            return createEquivalentInjection();
        case CimPackage.NON_CONFORM_LOAD_GROUP:
            return createNonConformLoadGroup();
        case CimPackage.LINEAR_SHUNT_COMPENSATOR:
            return createLinearShuntCompensator();
        case CimPackage.POST_LINE_SENSOR:
            return createPostLineSensor();
        case CimPackage.PHASE_TAP_CHANGER_TABULAR:
            return createPhaseTapChangerTabular();
        case CimPackage.BUS_NAME_MARKER:
            return createBusNameMarker();
        case CimPackage.ENERGY_SOURCE:
            return createEnergySource();
        case CimPackage.GENERATING_UNIT:
            return createGeneratingUnit();
        case CimPackage.BASIC_INTERVAL_SCHEDULE:
            return createBasicIntervalSchedule();
        case CimPackage.EQUIVALENT_EQUIPMENT:
            return createEquivalentEquipment();
        case CimPackage.REGULAR_TIME_POINT:
            return createRegularTimePoint();
        case CimPackage.REGULAR_INTERVAL_SCHEDULE:
            return createRegularIntervalSchedule();
        case CimPackage.CONNECTIVITY_NODE_CONTAINER:
            return createConnectivityNodeContainer();
        case CimPackage.ENERGY_AREA:
            return createEnergyArea();
        case CimPackage.COGENERATION_PLANT:
            return createCogenerationPlant();
        case CimPackage.POWER_TRANSFORMER:
            return createPowerTransformer();
        case CimPackage.OPERATIONAL_LIMIT_TYPE:
            return createOperationalLimitType();
        case CimPackage.GEOGRAPHICAL_REGION:
            return createGeographicalRegion();
        case CimPackage.CONFORM_LOAD_SCHEDULE:
            return createConformLoadSchedule();
        case CimPackage.SHUNT_COMPENSATOR:
            return createShuntCompensator();
        case CimPackage.VISIBILITY_LAYER:
            return createVisibilityLayer();
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT:
            return createDiagramObjectGluePoint();
        case CimPackage.DIAGRAM:
            return createDiagram();
        case CimPackage.DIAGRAM_OBJECT_STYLE:
            return createDiagramObjectStyle();
        case CimPackage.TEXT_DIAGRAM_OBJECT:
            return createTextDiagramObject();
        case CimPackage.DIAGRAM_OBJECT:
            return createDiagramObject();
        case CimPackage.DIAGRAM_STYLE:
            return createDiagramStyle();
        case CimPackage.DIAGRAM_OBJECT_POINT:
            return createDiagramObjectPoint();
        case CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED:
            return createUnderexcitationLimiterUserDefined();
        case CimPackage.PSS_IEEE3B:
            return createPssIEEE3B();
        case CimPackage.PSS_IEEE2B:
            return createPssIEEE2B();
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            return createDiscontinuousExcitationControlUserDefined();
        case CimPackage.EXC_PIC:
            return createExcPIC();
        case CimPackage.PSS_IEEE4B:
            return createPssIEEE4B();
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS:
            return createDiscontinuousExcitationControlDynamics();
        case CimPackage.PSS_IEEE1A:
            return createPssIEEE1A();
        case CimPackage.VSC_USER_DEFINED:
            return createVSCUserDefined();
        case CimPackage.GOV_GAST:
            return createGovGAST();
        case CimPackage.PSS_WECC:
            return createPssWECC();
        case CimPackage.WIND_AERO_ONE_DIM_IEC:
            return createWindAeroOneDimIEC();
        case CimPackage.SYNCHRONOUS_MACHINE_SIMPLIFIED:
            return createSynchronousMachineSimplified();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT:
            return createAsynchronousMachineEquivalentCircuit();
        case CimPackage.EXC_IEEEST1A:
            return createExcIEEEST1A();
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS:
            return createTurbineLoadControllerDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED:
            return createSynchronousMachineDetailed();
        case CimPackage.EXC_IEEEST2A:
            return createExcIEEEST2A();
        case CimPackage.EXC_HU:
            return createExcHU();
        case CimPackage.EXC_CZ:
            return createExcCZ();
        case CimPackage.MECHANICAL_LOAD_DYNAMICS:
            return createMechanicalLoadDynamics();
        case CimPackage.PSS2_ST:
            return createPss2ST();
        case CimPackage.EXC_SCRX:
            return createExcSCRX();
        case CimPackage.GOV_GASTWD:
            return createGovGASTWD();
        case CimPackage.WIND_TYPE3OR4_USER_DEFINED:
            return createWindType3or4UserDefined();
        case CimPackage.GOV_HYDRO1:
            return createGovHydro1();
        case CimPackage.GOV_HYDRO2:
            return createGovHydro2();
        case CimPackage.GOV_HYDRO3:
            return createGovHydro3();
        case CimPackage.GOV_HYDRO4:
            return createGovHydro4();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS:
            return createProprietaryParameterDynamics();
        case CimPackage.EXC_NI:
            return createExcNI();
        case CimPackage.WIND_TURBINE_TYPE4_IEC:
            return createWindTurbineType4IEC();
        case CimPackage.GOV_STEAM2:
            return createGovSteam2();
        case CimPackage.GOV_STEAM1:
            return createGovSteam1();
        case CimPackage.GOV_STEAM0:
            return createGovSteam0();
        case CimPackage.GOV_HYDRO_R:
            return createGovHydroR();
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS:
            return createTurbineGovernorDynamics();
        case CimPackage.LOAD_MOTOR:
            return createLoadMotor();
        case CimPackage.WIND_CONT_QIEC:
            return createWindContQIEC();
        case CimPackage.WIND_GEN_TYPE3A_IEC:
            return createWindGenType3aIEC();
        case CimPackage.EXC_SK:
            return createExcSK();
        case CimPackage.ROTATING_MACHINE_DYNAMICS:
            return createRotatingMachineDynamics();
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS:
            return createVoltageAdjusterDynamics();
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS:
            return createPFVArControllerType2Dynamics();
        case CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED:
            return createVoltageCompensatorUserDefined();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC:
            return createWindPitchContPowerIEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC:
            return createWindGenTurbineType1aIEC();
        case CimPackage.WIND_PROTECTION_IEC:
            return createWindProtectionIEC();
        case CimPackage.WIND_REF_FRAME_ROT_IEC:
            return createWindRefFrameRotIEC();
        case CimPackage.LOAD_GENERIC_NON_LINEAR:
            return createLoadGenericNonLinear();
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC:
            return createWindTurbineType1or2IEC();
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC:
            return createWindGenTurbineType2IEC();
        case CimPackage.WIND_GEN_TYPE3_IEC:
            return createWindGenType3IEC();
        case CimPackage.WIND_CONT_PTYPE3_IEC:
            return createWindContPType3IEC();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED:
            return createUnderexcLim2Simplified();
        case CimPackage.WIND_PLANT_IEC:
            return createWindPlantIEC();
        case CimPackage.PSS5:
            return createPss5();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE:
            return createAsynchronousMachineTimeConstantReactance();
        case CimPackage.PSS_STAB2A:
            return createPssSTAB2A();
        case CimPackage.PSS1:
            return createPss1();
        case CimPackage.WIND_TURBINE_TYPE4B_IEC:
            return createWindTurbineType4bIEC();
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            return createPFVArControllerType2UserDefined();
        case CimPackage.GOV_HYDRO_PID2:
            return createGovHydroPID2();
        case CimPackage.GOV_HYDRO_FRANCIS:
            return createGovHydroFrancis();
        case CimPackage.CSC_DYNAMICS:
            return createCSCDynamics();
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS:
            return createOverexcitationLimiterDynamics();
        case CimPackage.EXC_RQB:
            return createExcRQB();
        case CimPackage.EXC_ANS:
            return createExcANS();
        case CimPackage.LOAD_AGGREGATE:
            return createLoadAggregate();
        case CimPackage.WIND_GEN_TYPE3B_IEC:
            return createWindGenType3bIEC();
        case CimPackage.GOV_STEAM_IEEE1:
            return createGovSteamIEEE1();
        case CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS:
            return createUnderexcitationLimiterDynamics();
        case CimPackage.GOV_HYDRO_WEH:
            return createGovHydroWEH();
        case CimPackage.EXC_DC3A1:
            return createExcDC3A1();
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS:
            return createWindTurbineType1or2Dynamics();
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED:
            return createOverexcitationLimiterUserDefined();
        case CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            return createTurbineLoadControllerUserDefined();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC:
            return createWindContPitchAngleIEC();
        case CimPackage.EXC_BBC:
            return createExcBBC();
        case CimPackage.OVEREXC_LIM_IEEE:
            return createOverexcLimIEEE();
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return createWindTurbineType3or4Dynamics();
        case CimPackage.REMOTE_INPUT_SIGNAL:
            return createRemoteInputSignal();
        case CimPackage.EXC_AVR1:
            return createExcAVR1();
        case CimPackage.EXC_AVR2:
            return createExcAVR2();
        case CimPackage.EXC_AVR3:
            return createExcAVR3();
        case CimPackage.EXC_AVR4:
            return createExcAVR4();
        case CimPackage.EXC_AVR5:
            return createExcAVR5();
        case CimPackage.EXC_AVR7:
            return createExcAVR7();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER:
            return createPFVArType2IEEEVArController();
        case CimPackage.EXC_IEEEAC2A:
            return createExcIEEEAC2A();
        case CimPackage.LOAD_USER_DEFINED:
            return createLoadUserDefined();
        case CimPackage.MECHANICAL_LOAD_USER_DEFINED:
            return createMechanicalLoadUserDefined();
        case CimPackage.EXC_IEEEAC1A:
            return createExcIEEEAC1A();
        case CimPackage.GOV_HYDRO_IEEE0:
            return createGovHydroIEEE0();
        case CimPackage.GOV_HYDRO_IEEE2:
            return createGovHydroIEEE2();
        case CimPackage.EXC_IEEEAC6A:
            return createExcIEEEAC6A();
        case CimPackage.EXC_IEEEAC5A:
            return createExcIEEEAC5A();
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            return createCrossCompoundTurbineGovernorDynamics();
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS:
            return createStaticVarCompensatorDynamics();
        case CimPackage.EXC_IEEEAC4A:
            return createExcIEEEAC4A();
        case CimPackage.EXC_IEEEAC3A:
            return createExcIEEEAC3A();
        case CimPackage.EXCITATION_SYSTEM_USER_DEFINED:
            return createExcitationSystemUserDefined();
        case CimPackage.WIND_TYPE1OR2_USER_DEFINED:
            return createWindType1or2UserDefined();
        case CimPackage.GOV_GAST4:
            return createGovGAST4();
        case CimPackage.GOV_GAST3:
            return createGovGAST3();
        case CimPackage.GOV_GAST2:
            return createGovGAST2();
        case CimPackage.GOV_GAST1:
            return createGovGAST1();
        case CimPackage.MECH_LOAD1:
            return createMechLoad1();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER:
            return createPFVArType1IEEEVArController();
        case CimPackage.WIND_CONT_ROTOR_RIEC:
            return createWindContRotorRIEC();
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER:
            return createPFVArType2IEEEPFController();
        case CimPackage.VADJ_IEEE:
            return createVAdjIEEE();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT:
            return createSynchronousMachineEquivalentCircuit();
        case CimPackage.WIND_PLANT_DYNAMICS:
            return createWindPlantDynamics();
        case CimPackage.EXC_ELIN1:
            return createExcELIN1();
        case CimPackage.EXC_ELIN2:
            return createExcELIN2();
        case CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED:
            return createAsynchronousMachineUserDefined();
        case CimPackage.EXC_ST4B:
            return createExcST4B();
        case CimPackage.EXC_ST3A:
            return createExcST3A();
        case CimPackage.EXC_ST2A:
            return createExcST2A();
        case CimPackage.EXC_IEEEAC8B:
            return createExcIEEEAC8B();
        case CimPackage.EXC_ST1A:
            return createExcST1A();
        case CimPackage.EXC_IEEEAC7B:
            return createExcIEEEAC7B();
        case CimPackage.GOV_STEAM_SGO:
            return createGovSteamSGO();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC:
            return createWindPlantFreqPcontrolIEC();
        case CimPackage.EXC_ST7B:
            return createExcST7B();
        case CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED:
            return createPowerSystemStabilizerUserDefined();
        case CimPackage.DYNAMICS_FUNCTION_BLOCK:
            return createDynamicsFunctionBlock();
        case CimPackage.GOV_HYDRO_PID:
            return createGovHydroPID();
        case CimPackage.EXC_ST6B:
            return createExcST6B();
        case CimPackage.WIND_CONT_PTYPE4B_IEC:
            return createWindContPType4bIEC();
        case CimPackage.GOV_HYDRO_PELTON:
            return createGovHydroPelton();
        case CimPackage.VSC_DYNAMICS:
            return createVSCDynamics();
        case CimPackage.LOAD_DYNAMICS:
            return createLoadDynamics();
        case CimPackage.PSS_ELIN2:
            return createPssELIN2();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE:
            return createSynchronousMachineTimeConstantReactance();
        case CimPackage.GOV_CT1:
            return createGovCT1();
        case CimPackage.GOV_CT2:
            return createGovCT2();
        case CimPackage.EXC_IEEEDC1A:
            return createExcIEEEDC1A();
        case CimPackage.WIND_CONT_QPQU_LIM_IEC:
            return createWindContQPQULimIEC();
        case CimPackage.EXC_IEEEDC4B:
            return createExcIEEEDC4B();
        case CimPackage.EXC_IEEEDC3A:
            return createExcIEEEDC3A();
        case CimPackage.EXC_IEEEDC2A:
            return createExcIEEEDC2A();
        case CimPackage.CSC_USER_DEFINED:
            return createCSCUserDefined();
        case CimPackage.LOAD_STATIC:
            return createLoadStatic();
        case CimPackage.WIND_AERO_TWO_DIM_IEC:
            return createWindAeroTwoDimIEC();
        case CimPackage.WIND_CONT_CURR_LIM_IEC:
            return createWindContCurrLimIEC();
        case CimPackage.PSS_PTIST1:
            return createPssPTIST1();
        case CimPackage.PSS_PTIST3:
            return createPssPTIST3();
        case CimPackage.GOV_HYDRO_WPID:
            return createGovHydroWPID();
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS:
            return createPFVArControllerType1Dynamics();
        case CimPackage.WIND_CONT_QLIM_IEC:
            return createWindContQLimIEC();
        case CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS:
            return createVoltageCompensatorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED:
            return createSynchronousMachineUserDefined();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J:
            return createGenICompensationForGenJ();
        case CimPackage.EXC_REXS:
            return createExcREXS();
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS:
            return createAsynchronousMachineDynamics();
        case CimPackage.PFV_AR_TYPE2_COMMON1:
            return createPFVArType2Common1();
        case CimPackage.WIND_AERO_CONST_IEC:
            return createWindAeroConstIEC();
        case CimPackage.HVDC_DYNAMICS:
            return createHVDCDynamics();
        case CimPackage.TURBINE_GOVERNOR_USER_DEFINED:
            return createTurbineGovernorUserDefined();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER:
            return createPFVArType1IEEEPFController();
        case CimPackage.EXC_DC3A:
            return createExcDC3A();
        case CimPackage.PSS2_B:
            return createPss2B();
        case CimPackage.EXC_DC2A:
            return createExcDC2A();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC:
            return createWindPlantReactiveControlIEC();
        case CimPackage.GOV_STEAM_CC:
            return createGovSteamCC();
        case CimPackage.EXC_DC1A:
            return createExcDC1A();
        case CimPackage.OVEREXC_LIM2:
            return createOverexcLim2();
        case CimPackage.GOV_STEAM_EU:
            return createGovSteamEU();
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE:
            return createWindDynamicsLookupTable();
        case CimPackage.PSS1_A:
            return createPss1A();
        case CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED:
            return createVoltageAdjusterUserDefined();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS:
            return createSynchronousMachineDynamics();
        case CimPackage.GOV_STEAM_BB:
            return createGovSteamBB();
        case CimPackage.UNDEREXC_LIM_X2:
            return createUnderexcLimX2();
        case CimPackage.UNDEREXC_LIM_X1:
            return createUnderexcLimX1();
        case CimPackage.WIND_GEN_TYPE4_IEC:
            return createWindGenType4IEC();
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            return createPFVArControllerType1UserDefined();
        case CimPackage.EXC_OEX3T:
            return createExcOEX3T();
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC:
            return createWindGenTurbineType1bIEC();
        case CimPackage.PSS_SB4:
            return createPssSB4();
        case CimPackage.LOAD_COMPOSITE:
            return createLoadComposite();
        case CimPackage.EXC_SEXS:
            return createExcSEXS();
        case CimPackage.WIND_CONT_PTYPE4A_IEC:
            return createWindContPType4aIEC();
        case CimPackage.EXC_AC4A:
            return createExcAC4A();
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS:
            return createExcitationSystemDynamics();
        case CimPackage.EXC_AC3A:
            return createExcAC3A();
        case CimPackage.EXC_AC2A:
            return createExcAC2A();
        case CimPackage.EXC_AC1A:
            return createExcAC1A();
        case CimPackage.EXC_AC8B:
            return createExcAC8B();
        case CimPackage.EXC_IEEEST7B:
            return createExcIEEEST7B();
        case CimPackage.PSS_RQB:
            return createPssRQB();
        case CimPackage.VCOMP_IEEE_TYPE1:
            return createVCompIEEEType1();
        case CimPackage.EXC_AC6A:
            return createExcAC6A();
        case CimPackage.VCOMP_IEEE_TYPE2:
            return createVCompIEEEType2();
        case CimPackage.EXC_AC5A:
            return createExcAC5A();
        case CimPackage.WIND_MECH_IEC:
            return createWindMechIEC();
        case CimPackage.OVEREXC_LIM_X1:
            return createOverexcLimX1();
        case CimPackage.OVEREXC_LIM_X2:
            return createOverexcLimX2();
        case CimPackage.UNDEREXC_LIM_IEEE2:
            return createUnderexcLimIEEE2();
        case CimPackage.UNDEREXC_LIM_IEEE1:
            return createUnderexcLimIEEE1();
        case CimPackage.EXC_IEEEST3A:
            return createExcIEEEST3A();
        case CimPackage.PSS_SH:
            return createPssSH();
        case CimPackage.GOV_HYDRO_DD:
            return createGovHydroDD();
        case CimPackage.PSS_SK:
            return createPssSK();
        case CimPackage.EXC_IEEEST4B:
            return createExcIEEEST4B();
        case CimPackage.WIND_TURBINE_TYPE4A_IEC:
            return createWindTurbineType4aIEC();
        case CimPackage.EXC_IEEEST5B:
            return createExcIEEEST5B();
        case CimPackage.EXC_IEEEST6B:
            return createExcIEEEST6B();
        case CimPackage.GOV_STEAM_FV4:
            return createGovSteamFV4();
        case CimPackage.GOV_STEAM_FV3:
            return createGovSteamFV3();
        case CimPackage.GOV_STEAM_FV2:
            return createGovSteamFV2();
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS:
            return createPowerSystemStabilizerDynamics();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A:
            return createDiscExcContIEEEDEC1A();
        case CimPackage.WIND_TURBINE_TYPE3_IEC:
            return createWindTurbineType3IEC();
        case CimPackage.WIND_PLANT_USER_DEFINED:
            return createWindPlantUserDefined();
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A:
            return createDiscExcContIEEEDEC3A();
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A:
            return createDiscExcContIEEEDEC2A();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC:
            return createWindTurbineType3or4IEC();
        case CimPackage.SVC_USER_DEFINED:
            return createSVCUserDefined();
        case CimPackage.TURB_LCFB1:
            return createTurbLCFB1();
        case CimPackage.STREET_ADDRESS:
            return createStreetAddress();
        case CimPackage.STATUS:
            return createStatus();
        case CimPackage.SERVICE_LOCATION:
            return createServiceLocation();
        case CimPackage.COORDINATE_SYSTEM:
            return createCoordinateSystem();
        case CimPackage.POSITION_POINT:
            return createPositionPoint();
        case CimPackage.STREET_DETAIL:
            return createStreetDetail();
        case CimPackage.WORK_LOCATION:
            return createWorkLocation();
        case CimPackage.TOWN_DETAIL:
            return createTownDetail();
        case CimPackage.LOCATION:
            return createLocation();
        case CimPackage.ANALOG_VALUE:
            return createAnalogValue();
        case CimPackage.COMMAND:
            return createCommand();
        case CimPackage.DISCRETE_VALUE:
            return createDiscreteValue();
        case CimPackage.MEASUREMENT_VALUE_QUALITY:
            return createMeasurementValueQuality();
        case CimPackage.ANALOG_LIMIT_SET:
            return createAnalogLimitSet();
        case CimPackage.LIMIT:
            return createLimit();
        case CimPackage.ANALOG_CONTROL:
            return createAnalogControl();
        case CimPackage.STRING_MEASUREMENT_VALUE:
            return createStringMeasurementValue();
        case CimPackage.ACCUMULATOR_VALUE:
            return createAccumulatorValue();
        case CimPackage.SET_POINT:
            return createSetPoint();
        case CimPackage.ANALOG:
            return createAnalog();
        case CimPackage.MEASUREMENT_VALUE_SOURCE:
            return createMeasurementValueSource();
        case CimPackage.MEASUREMENT_VALUE:
            return createMeasurementValue();
        case CimPackage.QUALITY61850:
            return createQuality61850();
        case CimPackage.LIMIT_SET:
            return createLimitSet();
        case CimPackage.ACCUMULATOR_LIMIT:
            return createAccumulatorLimit();
        case CimPackage.MEASUREMENT:
            return createMeasurement();
        case CimPackage.VALUE_ALIAS_SET:
            return createValueAliasSet();
        case CimPackage.ACCUMULATOR:
            return createAccumulator();
        case CimPackage.ACCUMULATOR_LIMIT_SET:
            return createAccumulatorLimitSet();
        case CimPackage.VALUE_TO_ALIAS:
            return createValueToAlias();
        case CimPackage.DISCRETE:
            return createDiscrete();
        case CimPackage.RAISE_LOWER_COMMAND:
            return createRaiseLowerCommand();
        case CimPackage.IO_POINT:
            return createIOPoint();
        case CimPackage.ACCUMULATOR_RESET:
            return createAccumulatorReset();
        case CimPackage.ANALOG_LIMIT:
            return createAnalogLimit();
        case CimPackage.STRING_MEASUREMENT:
            return createStringMeasurement();
        case CimPackage.CONTROL:
            return createControl();
        case CimPackage.MUTUAL_COUPLING:
            return createMutualCoupling();
        case CimPackage.SV_TAP_STEP:
            return createSvTapStep();
        case CimPackage.TOPOLOGICAL_ISLAND:
            return createTopologicalIsland();
        case CimPackage.SV_SWITCH:
            return createSvSwitch();
        case CimPackage.SV_POWER_FLOW:
            return createSvPowerFlow();
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS:
            return createSvShuntCompensatorSections();
        case CimPackage.SV_VOLTAGE:
            return createSvVoltage();
        case CimPackage.DC_TOPOLOGICAL_ISLAND:
            return createDCTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE:
            return createTopologicalNode();
        case CimPackage.SV_STATUS:
            return createSvStatus();
        case CimPackage.SV_INJECTION:
            return createSvInjection();
        case CimPackage.DC_TOPOLOGICAL_NODE:
            return createDCTopologicalNode();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch( eDataType.getClassifierID() ) {
        case CimPackage.DC_CONVERTER_OPERATING_MODE_KIND:
            return createDCConverterOperatingModeKindFromString( eDataType, initialValue );
        case CimPackage.CONTROL_AREA_TYPE_KIND:
            return createControlAreaTypeKindFromString( eDataType, initialValue );
        case CimPackage.HYDRO_TURBINE_KIND:
            return createHydroTurbineKindFromString( eDataType, initialValue );
        case CimPackage.REGULATING_CONTROL_MODE_KIND:
            return createRegulatingControlModeKindFromString( eDataType, initialValue );
        case CimPackage.WIND_GEN_UNIT_KIND:
            return createWindGenUnitKindFromString( eDataType, initialValue );
        case CimPackage.DC_POLARITY_KIND:
            return createDCPolarityKindFromString( eDataType, initialValue );
        case CimPackage.HYDRO_ENERGY_CONVERSION_KIND:
            return createHydroEnergyConversionKindFromString( eDataType, initialValue );
        case CimPackage.PHASE_CODE:
            return createPhaseCodeFromString( eDataType, initialValue );
        case CimPackage.FUEL_TYPE:
            return createFuelTypeFromString( eDataType, initialValue );
        case CimPackage.SYNCHRONOUS_MACHINE_KIND:
            return createSynchronousMachineKindFromString( eDataType, initialValue );
        case CimPackage.WINDING_CONNECTION:
            return createWindingConnectionFromString( eDataType, initialValue );
        case CimPackage.SVC_CONTROL_MODE:
            return createSVCControlModeFromString( eDataType, initialValue );
        case CimPackage.GENERATOR_CONTROL_SOURCE:
            return createGeneratorControlSourceFromString( eDataType, initialValue );
        case CimPackage.UNIT_MULTIPLIER:
            return createUnitMultiplierFromString( eDataType, initialValue );
        case CimPackage.HYDRO_PLANT_STORAGE_KIND:
            return createHydroPlantStorageKindFromString( eDataType, initialValue );
        case CimPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
            return createOperationalLimitDirectionKindFromString( eDataType, initialValue );
        case CimPackage.UNIT_SYMBOL:
            return createUnitSymbolFromString( eDataType, initialValue );
        case CimPackage.CURRENCY:
            return createCurrencyFromString( eDataType, initialValue );
        case CimPackage.CURVE_STYLE:
            return createCurveStyleFromString( eDataType, initialValue );
        case CimPackage.ORIENTATION_KIND:
            return createOrientationKindFromString( eDataType, initialValue );
        case CimPackage.WIND_UVRT_QCONTROL_MODE_KIND:
            return createWindUVRTQcontrolModeKindFromString( eDataType, initialValue );
        case CimPackage.EXC_IEEEST1AUE_LSELECTOR_KIND:
            return createExcIEEEST1AUELselectorKindFromString( eDataType, initialValue );
        case CimPackage.EXC_ST6BOE_LSELECTOR_KIND:
            return createExcST6BOELselectorKindFromString( eDataType, initialValue );
        case CimPackage.WIND_PLANT_QCONTROL_MODE_KIND:
            return createWindPlantQcontrolModeKindFromString( eDataType, initialValue );
        case CimPackage.GOV_HYDRO4_MODEL_KIND:
            return createGovHydro4ModelKindFromString( eDataType, initialValue );
        case CimPackage.IFD_BASE_KIND:
            return createIfdBaseKindFromString( eDataType, initialValue );
        case CimPackage.INPUT_SIGNAL_KIND:
            return createInputSignalKindFromString( eDataType, initialValue );
        case CimPackage.GENERIC_NON_LINEAR_LOAD_MODEL_KIND:
            return createGenericNonLinearLoadModelKindFromString( eDataType, initialValue );
        case CimPackage.DROOP_SIGNAL_FEEDBACK_KIND:
            return createDroopSignalFeedbackKindFromString( eDataType, initialValue );
        case CimPackage.EXC_REXS_FEEDBACK_SIGNAL_KIND:
            return createExcREXSFeedbackSignalKindFromString( eDataType, initialValue );
        case CimPackage.WIND_LOOKUP_TABLE_FUNCTION_KIND:
            return createWindLookupTableFunctionKindFromString( eDataType, initialValue );
        case CimPackage.WIND_QCONTROL_MODE_KIND:
            return createWindQcontrolModeKindFromString( eDataType, initialValue );
        case CimPackage.EXC_ST7BUE_LSELECTOR_KIND:
            return createExcST7BUELselectorKindFromString( eDataType, initialValue );
        case CimPackage.REMOTE_SIGNAL_KIND:
            return createRemoteSignalKindFromString( eDataType, initialValue );
        case CimPackage.FRANCIS_GOVERNOR_CONTROL_KIND:
            return createFrancisGovernorControlKindFromString( eDataType, initialValue );
        case CimPackage.ROTOR_KIND:
            return createRotorKindFromString( eDataType, initialValue );
        case CimPackage.STATIC_LOAD_MODEL_KIND:
            return createStaticLoadModelKindFromString( eDataType, initialValue );
        case CimPackage.EXC_ST7BOE_LSELECTOR_KIND:
            return createExcST7BOELselectorKindFromString( eDataType, initialValue );
        case CimPackage.SYNCHRONOUS_MACHINE_MODEL_KIND:
            return createSynchronousMachineModelKindFromString( eDataType, initialValue );
        case CimPackage.VALIDITY:
            return createValidityFromString( eDataType, initialValue );
        case CimPackage.SOURCE:
            return createSourceFromString( eDataType, initialValue );
        case CimPackage.SHORT_CIRCUIT_ROTOR_KIND:
            return createShortCircuitRotorKindFromString( eDataType, initialValue );
        case CimPackage.PETERSEN_COIL_MODE_KIND:
            return createPetersenCoilModeKindFromString( eDataType, initialValue );
        case CimPackage.VS_PPCC_CONTROL_KIND:
            return createVsPpccControlKindFromString( eDataType, initialValue );
        case CimPackage.BATTERY_STATE_KIND:
            return createBatteryStateKindFromString( eDataType, initialValue );
        case CimPackage.CS_PPCC_CONTROL_KIND:
            return createCsPpccControlKindFromString( eDataType, initialValue );
        case CimPackage.VS_QPCC_CONTROL_KIND:
            return createVsQpccControlKindFromString( eDataType, initialValue );
        case CimPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
            return createSynchronousMachineOperatingModeFromString( eDataType, initialValue );
        case CimPackage.CS_OPERATING_MODE_KIND:
            return createCsOperatingModeKindFromString( eDataType, initialValue );
        case CimPackage.ASYNCHRONOUS_MACHINE_KIND:
            return createAsynchronousMachineKindFromString( eDataType, initialValue );
        case CimPackage.DATE:
            return createDateFromString( eDataType, initialValue );
        case CimPackage.INTEGER:
            return createIntegerFromString( eDataType, initialValue );
        case CimPackage.DATE_TIME:
            return createDateTimeFromString( eDataType, initialValue );
        case CimPackage.FLOAT:
            return createFloatFromString( eDataType, initialValue );
        case CimPackage.STRING:
            return createStringFromString( eDataType, initialValue );
        case CimPackage.DECIMAL:
            return createDecimalFromString( eDataType, initialValue );
        case CimPackage.BOOLEAN:
            return createBooleanFromString( eDataType, initialValue );
        case CimPackage.REAL_ENERGY:
            return createRealEnergyFromString( eDataType, initialValue );
        case CimPackage.CONDUCTANCE:
            return createConductanceFromString( eDataType, initialValue );
        case CimPackage.MONEY:
            return createMoneyFromString( eDataType, initialValue );
        case CimPackage.INDUCTANCE:
            return createInductanceFromString( eDataType, initialValue );
        case CimPackage.CAPACITANCE:
            return createCapacitanceFromString( eDataType, initialValue );
        case CimPackage.ROTATION_SPEED:
            return createRotationSpeedFromString( eDataType, initialValue );
        case CimPackage.ACTIVE_POWER_PER_CURRENT_FLOW:
            return createActivePowerPerCurrentFlowFromString( eDataType, initialValue );
        case CimPackage.VOLTAGE:
            return createVoltageFromString( eDataType, initialValue );
        case CimPackage.RESISTANCE:
            return createResistanceFromString( eDataType, initialValue );
        case CimPackage.PER_CENT:
            return createPerCentFromString( eDataType, initialValue );
        case CimPackage.ACTIVE_POWER:
            return createActivePowerFromString( eDataType, initialValue );
        case CimPackage.REACTANCE:
            return createReactanceFromString( eDataType, initialValue );
        case CimPackage.ACTIVE_POWER_PER_FREQUENCY:
            return createActivePowerPerFrequencyFromString( eDataType, initialValue );
        case CimPackage.FREQUENCY:
            return createFrequencyFromString( eDataType, initialValue );
        case CimPackage.CURRENT_FLOW:
            return createCurrentFlowFromString( eDataType, initialValue );
        case CimPackage.SUSCEPTANCE:
            return createSusceptanceFromString( eDataType, initialValue );
        case CimPackage.VOLTAGE_PER_REACTIVE_POWER:
            return createVoltagePerReactivePowerFromString( eDataType, initialValue );
        case CimPackage.LENGTH:
            return createLengthFromString( eDataType, initialValue );
        case CimPackage.REACTIVE_POWER:
            return createReactivePowerFromString( eDataType, initialValue );
        case CimPackage.APPARENT_POWER:
            return createApparentPowerFromString( eDataType, initialValue );
        case CimPackage.ANGLE_DEGREES:
            return createAngleDegreesFromString( eDataType, initialValue );
        case CimPackage.SECONDS:
            return createSecondsFromString( eDataType, initialValue );
        case CimPackage.AREA:
            return createAreaFromString( eDataType, initialValue );
        case CimPackage.VOLUME_FLOW_RATE:
            return createVolumeFlowRateFromString( eDataType, initialValue );
        case CimPackage.TEMPERATURE:
            return createTemperatureFromString( eDataType, initialValue );
        case CimPackage.PU:
            return createPUFromString( eDataType, initialValue );
        case CimPackage.ANGLE_RADIANS:
            return createAngleRadiansFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch( eDataType.getClassifierID() ) {
        case CimPackage.DC_CONVERTER_OPERATING_MODE_KIND:
            return convertDCConverterOperatingModeKindToString( eDataType, instanceValue );
        case CimPackage.CONTROL_AREA_TYPE_KIND:
            return convertControlAreaTypeKindToString( eDataType, instanceValue );
        case CimPackage.HYDRO_TURBINE_KIND:
            return convertHydroTurbineKindToString( eDataType, instanceValue );
        case CimPackage.REGULATING_CONTROL_MODE_KIND:
            return convertRegulatingControlModeKindToString( eDataType, instanceValue );
        case CimPackage.WIND_GEN_UNIT_KIND:
            return convertWindGenUnitKindToString( eDataType, instanceValue );
        case CimPackage.DC_POLARITY_KIND:
            return convertDCPolarityKindToString( eDataType, instanceValue );
        case CimPackage.HYDRO_ENERGY_CONVERSION_KIND:
            return convertHydroEnergyConversionKindToString( eDataType, instanceValue );
        case CimPackage.PHASE_CODE:
            return convertPhaseCodeToString( eDataType, instanceValue );
        case CimPackage.FUEL_TYPE:
            return convertFuelTypeToString( eDataType, instanceValue );
        case CimPackage.SYNCHRONOUS_MACHINE_KIND:
            return convertSynchronousMachineKindToString( eDataType, instanceValue );
        case CimPackage.WINDING_CONNECTION:
            return convertWindingConnectionToString( eDataType, instanceValue );
        case CimPackage.SVC_CONTROL_MODE:
            return convertSVCControlModeToString( eDataType, instanceValue );
        case CimPackage.GENERATOR_CONTROL_SOURCE:
            return convertGeneratorControlSourceToString( eDataType, instanceValue );
        case CimPackage.UNIT_MULTIPLIER:
            return convertUnitMultiplierToString( eDataType, instanceValue );
        case CimPackage.HYDRO_PLANT_STORAGE_KIND:
            return convertHydroPlantStorageKindToString( eDataType, instanceValue );
        case CimPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
            return convertOperationalLimitDirectionKindToString( eDataType, instanceValue );
        case CimPackage.UNIT_SYMBOL:
            return convertUnitSymbolToString( eDataType, instanceValue );
        case CimPackage.CURRENCY:
            return convertCurrencyToString( eDataType, instanceValue );
        case CimPackage.CURVE_STYLE:
            return convertCurveStyleToString( eDataType, instanceValue );
        case CimPackage.ORIENTATION_KIND:
            return convertOrientationKindToString( eDataType, instanceValue );
        case CimPackage.WIND_UVRT_QCONTROL_MODE_KIND:
            return convertWindUVRTQcontrolModeKindToString( eDataType, instanceValue );
        case CimPackage.EXC_IEEEST1AUE_LSELECTOR_KIND:
            return convertExcIEEEST1AUELselectorKindToString( eDataType, instanceValue );
        case CimPackage.EXC_ST6BOE_LSELECTOR_KIND:
            return convertExcST6BOELselectorKindToString( eDataType, instanceValue );
        case CimPackage.WIND_PLANT_QCONTROL_MODE_KIND:
            return convertWindPlantQcontrolModeKindToString( eDataType, instanceValue );
        case CimPackage.GOV_HYDRO4_MODEL_KIND:
            return convertGovHydro4ModelKindToString( eDataType, instanceValue );
        case CimPackage.IFD_BASE_KIND:
            return convertIfdBaseKindToString( eDataType, instanceValue );
        case CimPackage.INPUT_SIGNAL_KIND:
            return convertInputSignalKindToString( eDataType, instanceValue );
        case CimPackage.GENERIC_NON_LINEAR_LOAD_MODEL_KIND:
            return convertGenericNonLinearLoadModelKindToString( eDataType, instanceValue );
        case CimPackage.DROOP_SIGNAL_FEEDBACK_KIND:
            return convertDroopSignalFeedbackKindToString( eDataType, instanceValue );
        case CimPackage.EXC_REXS_FEEDBACK_SIGNAL_KIND:
            return convertExcREXSFeedbackSignalKindToString( eDataType, instanceValue );
        case CimPackage.WIND_LOOKUP_TABLE_FUNCTION_KIND:
            return convertWindLookupTableFunctionKindToString( eDataType, instanceValue );
        case CimPackage.WIND_QCONTROL_MODE_KIND:
            return convertWindQcontrolModeKindToString( eDataType, instanceValue );
        case CimPackage.EXC_ST7BUE_LSELECTOR_KIND:
            return convertExcST7BUELselectorKindToString( eDataType, instanceValue );
        case CimPackage.REMOTE_SIGNAL_KIND:
            return convertRemoteSignalKindToString( eDataType, instanceValue );
        case CimPackage.FRANCIS_GOVERNOR_CONTROL_KIND:
            return convertFrancisGovernorControlKindToString( eDataType, instanceValue );
        case CimPackage.ROTOR_KIND:
            return convertRotorKindToString( eDataType, instanceValue );
        case CimPackage.STATIC_LOAD_MODEL_KIND:
            return convertStaticLoadModelKindToString( eDataType, instanceValue );
        case CimPackage.EXC_ST7BOE_LSELECTOR_KIND:
            return convertExcST7BOELselectorKindToString( eDataType, instanceValue );
        case CimPackage.SYNCHRONOUS_MACHINE_MODEL_KIND:
            return convertSynchronousMachineModelKindToString( eDataType, instanceValue );
        case CimPackage.VALIDITY:
            return convertValidityToString( eDataType, instanceValue );
        case CimPackage.SOURCE:
            return convertSourceToString( eDataType, instanceValue );
        case CimPackage.SHORT_CIRCUIT_ROTOR_KIND:
            return convertShortCircuitRotorKindToString( eDataType, instanceValue );
        case CimPackage.PETERSEN_COIL_MODE_KIND:
            return convertPetersenCoilModeKindToString( eDataType, instanceValue );
        case CimPackage.VS_PPCC_CONTROL_KIND:
            return convertVsPpccControlKindToString( eDataType, instanceValue );
        case CimPackage.BATTERY_STATE_KIND:
            return convertBatteryStateKindToString( eDataType, instanceValue );
        case CimPackage.CS_PPCC_CONTROL_KIND:
            return convertCsPpccControlKindToString( eDataType, instanceValue );
        case CimPackage.VS_QPCC_CONTROL_KIND:
            return convertVsQpccControlKindToString( eDataType, instanceValue );
        case CimPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
            return convertSynchronousMachineOperatingModeToString( eDataType, instanceValue );
        case CimPackage.CS_OPERATING_MODE_KIND:
            return convertCsOperatingModeKindToString( eDataType, instanceValue );
        case CimPackage.ASYNCHRONOUS_MACHINE_KIND:
            return convertAsynchronousMachineKindToString( eDataType, instanceValue );
        case CimPackage.DATE:
            return convertDateToString( eDataType, instanceValue );
        case CimPackage.INTEGER:
            return convertIntegerToString( eDataType, instanceValue );
        case CimPackage.DATE_TIME:
            return convertDateTimeToString( eDataType, instanceValue );
        case CimPackage.FLOAT:
            return convertFloatToString( eDataType, instanceValue );
        case CimPackage.STRING:
            return convertStringToString( eDataType, instanceValue );
        case CimPackage.DECIMAL:
            return convertDecimalToString( eDataType, instanceValue );
        case CimPackage.BOOLEAN:
            return convertBooleanToString( eDataType, instanceValue );
        case CimPackage.REAL_ENERGY:
            return convertRealEnergyToString( eDataType, instanceValue );
        case CimPackage.CONDUCTANCE:
            return convertConductanceToString( eDataType, instanceValue );
        case CimPackage.MONEY:
            return convertMoneyToString( eDataType, instanceValue );
        case CimPackage.INDUCTANCE:
            return convertInductanceToString( eDataType, instanceValue );
        case CimPackage.CAPACITANCE:
            return convertCapacitanceToString( eDataType, instanceValue );
        case CimPackage.ROTATION_SPEED:
            return convertRotationSpeedToString( eDataType, instanceValue );
        case CimPackage.ACTIVE_POWER_PER_CURRENT_FLOW:
            return convertActivePowerPerCurrentFlowToString( eDataType, instanceValue );
        case CimPackage.VOLTAGE:
            return convertVoltageToString( eDataType, instanceValue );
        case CimPackage.RESISTANCE:
            return convertResistanceToString( eDataType, instanceValue );
        case CimPackage.PER_CENT:
            return convertPerCentToString( eDataType, instanceValue );
        case CimPackage.ACTIVE_POWER:
            return convertActivePowerToString( eDataType, instanceValue );
        case CimPackage.REACTANCE:
            return convertReactanceToString( eDataType, instanceValue );
        case CimPackage.ACTIVE_POWER_PER_FREQUENCY:
            return convertActivePowerPerFrequencyToString( eDataType, instanceValue );
        case CimPackage.FREQUENCY:
            return convertFrequencyToString( eDataType, instanceValue );
        case CimPackage.CURRENT_FLOW:
            return convertCurrentFlowToString( eDataType, instanceValue );
        case CimPackage.SUSCEPTANCE:
            return convertSusceptanceToString( eDataType, instanceValue );
        case CimPackage.VOLTAGE_PER_REACTIVE_POWER:
            return convertVoltagePerReactivePowerToString( eDataType, instanceValue );
        case CimPackage.LENGTH:
            return convertLengthToString( eDataType, instanceValue );
        case CimPackage.REACTIVE_POWER:
            return convertReactivePowerToString( eDataType, instanceValue );
        case CimPackage.APPARENT_POWER:
            return convertApparentPowerToString( eDataType, instanceValue );
        case CimPackage.ANGLE_DEGREES:
            return convertAngleDegreesToString( eDataType, instanceValue );
        case CimPackage.SECONDS:
            return convertSecondsToString( eDataType, instanceValue );
        case CimPackage.AREA:
            return convertAreaToString( eDataType, instanceValue );
        case CimPackage.VOLUME_FLOW_RATE:
            return convertVolumeFlowRateToString( eDataType, instanceValue );
        case CimPackage.TEMPERATURE:
            return convertTemperatureToString( eDataType, instanceValue );
        case CimPackage.PU:
            return convertPUToString( eDataType, instanceValue );
        case CimPackage.ANGLE_RADIANS:
            return convertAngleRadiansToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CimObjectWithID createCimObjectWithID() {
        CimObjectWithIDImpl cimObjectWithID = new CimObjectWithIDImpl();
        return cimObjectWithID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentInjection createEquivalentInjection() {
        EquivalentInjectionImpl equivalentInjection = new EquivalentInjectionImpl();
        return equivalentInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPowerPlant createHydroPowerPlant() {
        HydroPowerPlantImpl hydroPowerPlant = new HydroPowerPlantImpl();
        return hydroPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySource createEnergySource() {
        EnergySourceImpl energySource = new EnergySourceImpl();
        return energySource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapSchedule createTapSchedule() {
        TapScheduleImpl tapSchedule = new TapScheduleImpl();
        return tapSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCSeriesDevice createDCSeriesDevice() {
        DCSeriesDeviceImpl dcSeriesDevice = new DCSeriesDeviceImpl();
        return dcSeriesDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExternalNetworkInjection createExternalNetworkInjection() {
        ExternalNetworkInjectionImpl externalNetworkInjection = new ExternalNetworkInjectionImpl();
        return externalNetworkInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimit createOperationalLimit() {
        OperationalLimitImpl operationalLimit = new OperationalLimitImpl();
        return operationalLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChanger createRatioTapChanger() {
        RatioTapChangerImpl ratioTapChanger = new RatioTapChangerImpl();
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportingGroup createReportingGroup() {
        ReportingGroupImpl reportingGroup = new ReportingGroupImpl();
        return reportingGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurveData createCurveData() {
        CurveDataImpl curveData = new CurveDataImpl();
        return curveData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensator createNonlinearShuntCompensator() {
        NonlinearShuntCompensatorImpl nonlinearShuntCompensator = new NonlinearShuntCompensatorImpl();
        return nonlinearShuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNodeContainer createConnectivityNodeContainer() {
        ConnectivityNodeContainerImpl connectivityNodeContainer = new ConnectivityNodeContainerImpl();
        return connectivityNodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoadSchedule createConformLoadSchedule() {
        ConformLoadScheduleImpl conformLoadSchedule = new ConformLoadScheduleImpl();
        return conformLoadSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCLineSegment createDCLineSegment() {
        DCLineSegmentImpl dcLineSegment = new DCLineSegmentImpl();
        return dcLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerSymmetrical createPhaseTapChangerSymmetrical() {
        PhaseTapChangerSymmetricalImpl phaseTapChangerSymmetrical = new PhaseTapChangerSymmetricalImpl();
        return phaseTapChangerSymmetrical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BatteryUnit createBatteryUnit() {
        BatteryUnitImpl batteryUnit = new BatteryUnitImpl();
        return batteryUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChangerTable createRatioTapChangerTable() {
        RatioTapChangerTableImpl ratioTapChangerTable = new RatioTapChangerTableImpl();
        return ratioTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ActivePowerLimit createActivePowerLimit() {
        ActivePowerLimitImpl activePowerLimit = new ActivePowerLimitImpl();
        return activePowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTable createPhaseTapChangerTable() {
        PhaseTapChangerTableImpl phaseTapChangerTable = new PhaseTapChangerTableImpl();
        return phaseTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergyArea createEnergyArea() {
        EnergyAreaImpl energyArea = new EnergyAreaImpl();
        return energyArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundDisconnector createGroundDisconnector() {
        GroundDisconnectorImpl groundDisconnector = new GroundDisconnectorImpl();
        return groundDisconnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCBaseTerminal createDCBaseTerminal() {
        DCBaseTerminalImpl dcBaseTerminal = new DCBaseTerminalImpl();
        return dcBaseTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReactiveCapabilityCurve createReactiveCapabilityCurve() {
        ReactiveCapabilityCurveImpl reactiveCapabilityCurve = new ReactiveCapabilityCurveImpl();
        return reactiveCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCBusbar createDCBusbar() {
        DCBusbarImpl dcBusbar = new DCBusbarImpl();
        return dcBusbar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DayType createDayType() {
        DayTypeImpl dayType = new DayTypeImpl();
        return dayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchSchedule createSwitchSchedule() {
        SwitchScheduleImpl switchSchedule = new SwitchScheduleImpl();
        return switchSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCBreaker createDCBreaker() {
        DCBreakerImpl dcBreaker = new DCBreakerImpl();
        return dcBreaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TieFlow createTieFlow() {
        TieFlowImpl tieFlow = new TieFlowImpl();
        return tieFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadGroup createLoadGroup() {
        LoadGroupImpl loadGroup = new LoadGroupImpl();
        return loadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentContainer createEquipmentContainer() {
        EquipmentContainerImpl equipmentContainer = new EquipmentContainerImpl();
        return equipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StationSupply createStationSupply() {
        StationSupplyImpl stationSupply = new StationSupplyImpl();
        return stationSupply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACLineSegment createACLineSegment() {
        ACLineSegmentImpl acLineSegment = new ACLineSegmentImpl();
        return acLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Ground createGround() {
        GroundImpl ground = new GroundImpl();
        return ground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cut createCut() {
        CutImpl cut = new CutImpl();
        return cut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CogenerationPlant createCogenerationPlant() {
        CogenerationPlantImpl cogenerationPlant = new CogenerationPlantImpl();
        return cogenerationPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SurgeArrester createSurgeArrester() {
        SurgeArresterImpl surgeArrester = new SurgeArresterImpl();
        return surgeArrester;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentBranch createEquivalentBranch() {
        EquivalentBranchImpl equivalentBranch = new EquivalentBranchImpl();
        return equivalentBranch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPump createHydroPump() {
        HydroPumpImpl hydroPump = new HydroPumpImpl();
        return hydroPump;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoadGroup createConformLoadGroup() {
        ConformLoadGroupImpl conformLoadGroup = new ConformLoadGroupImpl();
        return conformLoadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoad createNonConformLoad() {
        NonConformLoadImpl nonConformLoad = new NonConformLoadImpl();
        return nonConformLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CAESPlant createCAESPlant() {
        CAESPlantImpl caesPlant = new CAESPlantImpl();
        return caesPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Breaker createBreaker() {
        BreakerImpl breaker = new BreakerImpl();
        return breaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundingImpedance createGroundingImpedance() {
        GroundingImpedanceImpl groundingImpedance = new GroundingImpedanceImpl();
        return groundingImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitType createOperationalLimitType() {
        OperationalLimitTypeImpl operationalLimitType = new OperationalLimitTypeImpl();
        return operationalLimitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlAreaGeneratingUnit createControlAreaGeneratingUnit() {
        ControlAreaGeneratingUnitImpl controlAreaGeneratingUnit = new ControlAreaGeneratingUnitImpl();
        return controlAreaGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusNameMarker createBusNameMarker() {
        BusNameMarkerImpl busNameMarker = new BusNameMarkerImpl();
        return busNameMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticVarCompensator createStaticVarCompensator() {
        StaticVarCompensatorImpl staticVarCompensator = new StaticVarCompensatorImpl();
        return staticVarCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Conductor createConductor() {
        ConductorImpl conductor = new ConductorImpl();
        return conductor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCLine createDCLine() {
        DCLineImpl dcLine = new DCLineImpl();
        return dcLine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTabular createPhaseTapChangerTabular() {
        PhaseTapChangerTabularImpl phaseTapChangerTabular = new PhaseTapChangerTabularImpl();
        return phaseTapChangerTabular;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Equipment createEquipment() {
        EquipmentImpl equipment = new EquipmentImpl();
        return equipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCChopper createDCChopper() {
        DCChopperImpl dcChopper = new DCChopperImpl();
        return dcChopper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerControl createTapChangerControl() {
        TapChangerControlImpl tapChangerControl = new TapChangerControlImpl();
        return tapChangerControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EarthFaultCompensator createEarthFaultCompensator() {
        EarthFaultCompensatorImpl earthFaultCompensator = new EarthFaultCompensatorImpl();
        return earthFaultCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FaultIndicator createFaultIndicator() {
        FaultIndicatorImpl faultIndicator = new FaultIndicatorImpl();
        return faultIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCConverterUnit createDCConverterUnit() {
        DCConverterUnitImpl dcConverterUnit = new DCConverterUnitImpl();
        return dcConverterUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Curve createCurve() {
        CurveImpl curve = new CurveImpl();
        return curve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsConverter createVsConverter() {
        VsConverterImpl vsConverter = new VsConverterImpl();
        return vsConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroGeneratingUnit createHydroGeneratingUnit() {
        HydroGeneratingUnitImpl hydroGeneratingUnit = new HydroGeneratingUnitImpl();
        return hydroGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulationSchedule createRegulationSchedule() {
        RegulationScheduleImpl regulationSchedule = new RegulationScheduleImpl();
        return regulationSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergyConnection createEnergyConnection() {
        EnergyConnectionImpl energyConnection = new EnergyConnectionImpl();
        return energyConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentEquipment createEquivalentEquipment() {
        EquivalentEquipmentImpl equivalentEquipment = new EquivalentEquipmentImpl();
        return equivalentEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FossilFuel createFossilFuel() {
        FossilFuelImpl fossilFuel = new FossilFuelImpl();
        return fossilFuel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadArea createLoadArea() {
        LoadAreaImpl loadArea = new LoadAreaImpl();
        return loadArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombinedCyclePlant createCombinedCyclePlant() {
        CombinedCyclePlantImpl combinedCyclePlant = new CombinedCyclePlantImpl();
        return combinedCyclePlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment createConductingEquipment() {
        ConductingEquipmentImpl conductingEquipment = new ConductingEquipmentImpl();
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Clamp createClamp() {
        ClampImpl clamp = new ClampImpl();
        return clamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApparentPowerLimit createApparentPowerLimit() {
        ApparentPowerLimitImpl apparentPowerLimit = new ApparentPowerLimitImpl();
        return apparentPowerLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NuclearGeneratingUnit createNuclearGeneratingUnit() {
        NuclearGeneratingUnitImpl nuclearGeneratingUnit = new NuclearGeneratingUnitImpl();
        return nuclearGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PetersenCoil createPetersenCoil() {
        PetersenCoilImpl petersenCoil = new PetersenCoilImpl();
        return petersenCoil;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadResponseCharacteristic createLoadResponseCharacteristic() {
        LoadResponseCharacteristicImpl loadResponseCharacteristic = new LoadResponseCharacteristicImpl();
        return loadResponseCharacteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformerEnd createPowerTransformerEnd() {
        PowerTransformerEndImpl powerTransformerEnd = new PowerTransformerEndImpl();
        return powerTransformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal createTerminal() {
        TerminalImpl terminal = new TerminalImpl();
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bay createBay() {
        BayImpl bay = new BayImpl();
        return bay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingControl createRegulatingControl() {
        RegulatingControlImpl regulatingControl = new RegulatingControlImpl();
        return regulatingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SeriesCompensator createSeriesCompensator() {
        SeriesCompensatorImpl seriesCompensator = new SeriesCompensatorImpl();
        return seriesCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProtectedSwitch createProtectedSwitch() {
        ProtectedSwitchImpl protectedSwitch = new ProtectedSwitchImpl();
        return protectedSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerTablePoint createTapChangerTablePoint() {
        TapChangerTablePointImpl tapChangerTablePoint = new TapChangerTablePointImpl();
        return tapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusbarSection createBusbarSection() {
        BusbarSectionImpl busbarSection = new BusbarSectionImpl();
        return busbarSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhotoVoltaicUnit createPhotoVoltaicUnit() {
        PhotoVoltaicUnitImpl photoVoltaicUnit = new PhotoVoltaicUnitImpl();
        return photoVoltaicUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Line createLine() {
        LineImpl line = new LineImpl();
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Season createSeason() {
        SeasonImpl season = new SeasonImpl();
        return season;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegularIntervalSchedule createRegularIntervalSchedule() {
        RegularIntervalScheduleImpl regularIntervalSchedule = new RegularIntervalScheduleImpl();
        return regularIntervalSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoadGroup createNonConformLoadGroup() {
        NonConformLoadGroupImpl nonConformLoadGroup = new NonConformLoadGroupImpl();
        return nonConformLoadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitSet createOperationalLimitSet() {
        OperationalLimitSetImpl operationalLimitSet = new OperationalLimitSetImpl();
        return operationalLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChanger createPhaseTapChanger() {
        PhaseTapChangerImpl phaseTapChanger = new PhaseTapChangerImpl();
        return phaseTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCEquipmentContainer createDCEquipmentContainer() {
        DCEquipmentContainerImpl dcEquipmentContainer = new DCEquipmentContainerImpl();
        return dcEquipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerAsymmetrical createPhaseTapChangerAsymmetrical() {
        PhaseTapChangerAsymmetricalImpl phaseTapChangerAsymmetrical = new PhaseTapChangerAsymmetricalImpl();
        return phaseTapChangerAsymmetrical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNode createConnectivityNode() {
        ConnectivityNodeImpl connectivityNode = new ConnectivityNodeImpl();
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Sensor createSensor() {
        SensorImpl sensor = new SensorImpl();
        return sensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadBreakSwitch createLoadBreakSwitch() {
        LoadBreakSwitchImpl loadBreakSwitch = new LoadBreakSwitchImpl();
        return loadBreakSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SeasonDayTypeSchedule createSeasonDayTypeSchedule() {
        SeasonDayTypeScheduleImpl seasonDayTypeSchedule = new SeasonDayTypeScheduleImpl();
        return seasonDayTypeSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DisconnectingCircuitBreaker createDisconnectingCircuitBreaker() {
        DisconnectingCircuitBreakerImpl disconnectingCircuitBreaker = new DisconnectingCircuitBreakerImpl();
        return disconnectingCircuitBreaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCSwitch createDCSwitch() {
        DCSwitchImpl dcSwitch = new DCSwitchImpl();
        return dcSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Disconnector createDisconnector() {
        DisconnectorImpl disconnector = new DisconnectorImpl();
        return disconnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCNode createDCNode() {
        DCNodeImpl dcNode = new DCNodeImpl();
        return dcNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SolarGeneratingUnit createSolarGeneratingUnit() {
        SolarGeneratingUnitImpl solarGeneratingUnit = new SolarGeneratingUnitImpl();
        return solarGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation createSubstation() {
        SubstationImpl substation = new SubstationImpl();
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonlinearShuntCompensatorPoint createNonlinearShuntCompensatorPoint() {
        NonlinearShuntCompensatorPointImpl nonlinearShuntCompensatorPoint = new NonlinearShuntCompensatorPointImpl();
        return nonlinearShuntCompensatorPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifiedObject createIdentifiedObject() {
        IdentifiedObjectImpl identifiedObject = new IdentifiedObjectImpl();
        return identifiedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource createPowerSystemResource() {
        PowerSystemResourceImpl powerSystemResource = new PowerSystemResourceImpl();
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubGeographicalRegion createSubGeographicalRegion() {
        SubGeographicalRegionImpl subGeographicalRegion = new SubGeographicalRegionImpl();
        return subGeographicalRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit createThermalGeneratingUnit() {
        ThermalGeneratingUnitImpl thermalGeneratingUnit = new ThermalGeneratingUnitImpl();
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PotentialTransformer createPotentialTransformer() {
        PotentialTransformerImpl potentialTransformer = new PotentialTransformerImpl();
        return potentialTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsCapabilityCurve createVsCapabilityCurve() {
        VsCapabilityCurveImpl vsCapabilityCurve = new VsCapabilityCurveImpl();
        return vsCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCGround createDCGround() {
        DCGroundImpl dcGround = new DCGroundImpl();
        return dcGround;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingCondEq createRegulatingCondEq() {
        RegulatingCondEqImpl regulatingCondEq = new RegulatingCondEqImpl();
        return regulatingCondEq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergyConsumer createEnergyConsumer() {
        EnergyConsumerImpl energyConsumer = new EnergyConsumerImpl();
        return energyConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeographicalRegion createGeographicalRegion() {
        GeographicalRegionImpl geographicalRegion = new GeographicalRegionImpl();
        return geographicalRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentNetwork createEquivalentNetwork() {
        EquivalentNetworkImpl equivalentNetwork = new EquivalentNetworkImpl();
        return equivalentNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GrossToNetActivePowerCurve createGrossToNetActivePowerCurve() {
        GrossToNetActivePowerCurveImpl grossToNetActivePowerCurve = new GrossToNetActivePowerCurveImpl();
        return grossToNetActivePowerCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage createBaseVoltage() {
        BaseVoltageImpl baseVoltage = new BaseVoltageImpl();
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCShunt createDCShunt() {
        DCShuntImpl dcShunt = new DCShuntImpl();
        return dcShunt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsConverter createCsConverter() {
        CsConverterImpl csConverter = new CsConverterImpl();
        return csConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCConductingEquipment createDCConductingEquipment() {
        DCConductingEquipmentImpl dcConductingEquipment = new DCConductingEquipmentImpl();
        return dcConductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Jumper createJumper() {
        JumperImpl jumper = new JumperImpl();
        return jumper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurrentLimit createCurrentLimit() {
        CurrentLimitImpl currentLimit = new CurrentLimitImpl();
        return currentLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEnd createTransformerEnd() {
        TransformerEndImpl transformerEnd = new TransformerEndImpl();
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoadSchedule createNonConformLoadSchedule() {
        NonConformLoadScheduleImpl nonConformLoadSchedule = new NonConformLoadScheduleImpl();
        return nonConformLoadSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotatingMachine createRotatingMachine() {
        RotatingMachineImpl rotatingMachine = new RotatingMachineImpl();
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySchedulingType createEnergySchedulingType() {
        EnergySchedulingTypeImpl energySchedulingType = new EnergySchedulingTypeImpl();
        return energySchedulingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerLinear createPhaseTapChangerLinear() {
        PhaseTapChangerLinearImpl phaseTapChangerLinear = new PhaseTapChangerLinearImpl();
        return phaseTapChangerLinear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicIntervalSchedule createBasicIntervalSchedule() {
        BasicIntervalScheduleImpl basicIntervalSchedule = new BasicIntervalScheduleImpl();
        return basicIntervalSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCConverterDCTerminal createACDCConverterDCTerminal() {
        ACDCConverterDCTerminalImpl acdcConverterDCTerminal = new ACDCConverterDCTerminalImpl();
        return acdcConverterDCTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurrentTransformer createCurrentTransformer() {
        CurrentTransformerImpl currentTransformer = new CurrentTransformerImpl();
        return currentTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerElectronicsWindUnit createPowerElectronicsWindUnit() {
        PowerElectronicsWindUnitImpl powerElectronicsWindUnit = new PowerElectronicsWindUnitImpl();
        return powerElectronicsWindUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer createPowerTransformer() {
        PowerTransformerImpl powerTransformer = new PowerTransformerImpl();
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WaveTrap createWaveTrap() {
        WaveTrapImpl waveTrap = new WaveTrapImpl();
        return waveTrap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentShunt createEquivalentShunt() {
        EquivalentShuntImpl equivalentShunt = new EquivalentShuntImpl();
        return equivalentShunt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LinearShuntCompensator createLinearShuntCompensator() {
        LinearShuntCompensatorImpl linearShuntCompensator = new LinearShuntCompensatorImpl();
        return linearShuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlArea createControlArea() {
        ControlAreaImpl controlArea = new ControlAreaImpl();
        return controlArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachine createSynchronousMachine() {
        SynchronousMachineImpl synchronousMachine = new SynchronousMachineImpl();
        return synchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AuxiliaryEquipment createAuxiliaryEquipment() {
        AuxiliaryEquipmentImpl auxiliaryEquipment = new AuxiliaryEquipmentImpl();
        return auxiliaryEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel createVoltageLevel() {
        VoltageLevelImpl voltageLevel = new VoltageLevelImpl();
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger createTapChanger() {
        TapChangerImpl tapChanger = new TapChangerImpl();
        return tapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoad createConformLoad() {
        ConformLoadImpl conformLoad = new ConformLoadImpl();
        return conformLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChangerTablePoint createRatioTapChangerTablePoint() {
        RatioTapChangerTablePointImpl ratioTapChangerTablePoint = new RatioTapChangerTablePointImpl();
        return ratioTapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTerminal createDCTerminal() {
        DCTerminalImpl dcTerminal = new DCTerminalImpl();
        return dcTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PostLineSensor createPostLineSensor() {
        PostLineSensorImpl postLineSensor = new PostLineSensorImpl();
        return postLineSensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneratingUnit createGeneratingUnit() {
        GeneratingUnitImpl generatingUnit = new GeneratingUnitImpl();
        return generatingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGeneratingUnit createWindGeneratingUnit() {
        WindGeneratingUnitImpl windGeneratingUnit = new WindGeneratingUnitImpl();
        return windGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Junction createJunction() {
        JunctionImpl junction = new JunctionImpl();
        return junction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerElectronicsUnit createPowerElectronicsUnit() {
        PowerElectronicsUnitImpl powerElectronicsUnit = new PowerElectronicsUnitImpl();
        return powerElectronicsUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegularTimePoint createRegularTimePoint() {
        RegularTimePointImpl regularTimePoint = new RegularTimePointImpl();
        return regularTimePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerElectronicsConnection createPowerElectronicsConnection() {
        PowerElectronicsConnectionImpl powerElectronicsConnection = new PowerElectronicsConnectionImpl();
        return powerElectronicsConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCConverter createACDCConverter() {
        ACDCConverterImpl acdcConverter = new ACDCConverterImpl();
        return acdcConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch createSwitch() {
        SwitchImpl switch_ = new SwitchImpl();
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCDisconnector createDCDisconnector() {
        DCDisconnectorImpl dcDisconnector = new DCDisconnectorImpl();
        return dcDisconnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCTerminal createACDCTerminal() {
        ACDCTerminalImpl acdcTerminal = new ACDCTerminalImpl();
        return acdcTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubLoadArea createSubLoadArea() {
        SubLoadAreaImpl subLoadArea = new SubLoadAreaImpl();
        return subLoadArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerNonLinear createPhaseTapChangerNonLinear() {
        PhaseTapChangerNonLinearImpl phaseTapChangerNonLinear = new PhaseTapChangerNonLinearImpl();
        return phaseTapChangerNonLinear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLimit createVoltageLimit() {
        VoltageLimitImpl voltageLimit = new VoltageLimitImpl();
        return voltageLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fuse createFuse() {
        FuseImpl fuse = new FuseImpl();
        return fuse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachine createAsynchronousMachine() {
        AsynchronousMachineImpl asynchronousMachine = new AsynchronousMachineImpl();
        return asynchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTablePoint createPhaseTapChangerTablePoint() {
        PhaseTapChangerTablePointImpl phaseTapChangerTablePoint = new PhaseTapChangerTablePointImpl();
        return phaseTapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShuntCompensator createShuntCompensator() {
        ShuntCompensatorImpl shuntCompensator = new ShuntCompensatorImpl();
        return shuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VisibilityLayer createVisibilityLayer() {
        VisibilityLayerImpl visibilityLayer = new VisibilityLayerImpl();
        return visibilityLayer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectGluePoint createDiagramObjectGluePoint() {
        DiagramObjectGluePointImpl diagramObjectGluePoint = new DiagramObjectGluePointImpl();
        return diagramObjectGluePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectStyle createDiagramObjectStyle() {
        DiagramObjectStyleImpl diagramObjectStyle = new DiagramObjectStyleImpl();
        return diagramObjectStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextDiagramObject createTextDiagramObject() {
        TextDiagramObjectImpl textDiagramObject = new TextDiagramObjectImpl();
        return textDiagramObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObject createDiagramObject() {
        DiagramObjectImpl diagramObject = new DiagramObjectImpl();
        return diagramObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramStyle createDiagramStyle() {
        DiagramStyleImpl diagramStyle = new DiagramStyleImpl();
        return diagramStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectPoint createDiagramObjectPoint() {
        DiagramObjectPointImpl diagramObjectPoint = new DiagramObjectPointImpl();
        return diagramObjectPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcitationLimiterUserDefined createUnderexcitationLimiterUserDefined() {
        UnderexcitationLimiterUserDefinedImpl underexcitationLimiterUserDefined = new UnderexcitationLimiterUserDefinedImpl();
        return underexcitationLimiterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE3B createPssIEEE3B() {
        PssIEEE3BImpl pssIEEE3B = new PssIEEE3BImpl();
        return pssIEEE3B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE2B createPssIEEE2B() {
        PssIEEE2BImpl pssIEEE2B = new PssIEEE2BImpl();
        return pssIEEE2B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscontinuousExcitationControlUserDefined createDiscontinuousExcitationControlUserDefined() {
        DiscontinuousExcitationControlUserDefinedImpl discontinuousExcitationControlUserDefined = new DiscontinuousExcitationControlUserDefinedImpl();
        return discontinuousExcitationControlUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcPIC createExcPIC() {
        ExcPICImpl excPIC = new ExcPICImpl();
        return excPIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE4B createPssIEEE4B() {
        PssIEEE4BImpl pssIEEE4B = new PssIEEE4BImpl();
        return pssIEEE4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscontinuousExcitationControlDynamics createDiscontinuousExcitationControlDynamics() {
        DiscontinuousExcitationControlDynamicsImpl discontinuousExcitationControlDynamics = new DiscontinuousExcitationControlDynamicsImpl();
        return discontinuousExcitationControlDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssIEEE1A createPssIEEE1A() {
        PssIEEE1AImpl pssIEEE1A = new PssIEEE1AImpl();
        return pssIEEE1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VSCUserDefined createVSCUserDefined() {
        VSCUserDefinedImpl vscUserDefined = new VSCUserDefinedImpl();
        return vscUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST createGovGAST() {
        GovGASTImpl govGAST = new GovGASTImpl();
        return govGAST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssWECC createPssWECC() {
        PssWECCImpl pssWECC = new PssWECCImpl();
        return pssWECC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroOneDimIEC createWindAeroOneDimIEC() {
        WindAeroOneDimIECImpl windAeroOneDimIEC = new WindAeroOneDimIECImpl();
        return windAeroOneDimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineSimplified createSynchronousMachineSimplified() {
        SynchronousMachineSimplifiedImpl synchronousMachineSimplified = new SynchronousMachineSimplifiedImpl();
        return synchronousMachineSimplified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineEquivalentCircuit createAsynchronousMachineEquivalentCircuit() {
        AsynchronousMachineEquivalentCircuitImpl asynchronousMachineEquivalentCircuit = new AsynchronousMachineEquivalentCircuitImpl();
        return asynchronousMachineEquivalentCircuit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST1A createExcIEEEST1A() {
        ExcIEEEST1AImpl excIEEEST1A = new ExcIEEEST1AImpl();
        return excIEEEST1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineLoadControllerDynamics createTurbineLoadControllerDynamics() {
        TurbineLoadControllerDynamicsImpl turbineLoadControllerDynamics = new TurbineLoadControllerDynamicsImpl();
        return turbineLoadControllerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDetailed createSynchronousMachineDetailed() {
        SynchronousMachineDetailedImpl synchronousMachineDetailed = new SynchronousMachineDetailedImpl();
        return synchronousMachineDetailed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST2A createExcIEEEST2A() {
        ExcIEEEST2AImpl excIEEEST2A = new ExcIEEEST2AImpl();
        return excIEEEST2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcHU createExcHU() {
        ExcHUImpl excHU = new ExcHUImpl();
        return excHU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcCZ createExcCZ() {
        ExcCZImpl excCZ = new ExcCZImpl();
        return excCZ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadDynamics createMechanicalLoadDynamics() {
        MechanicalLoadDynamicsImpl mechanicalLoadDynamics = new MechanicalLoadDynamicsImpl();
        return mechanicalLoadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss2ST createPss2ST() {
        Pss2STImpl pss2ST = new Pss2STImpl();
        return pss2ST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcSCRX createExcSCRX() {
        ExcSCRXImpl excSCRX = new ExcSCRXImpl();
        return excSCRX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGASTWD createGovGASTWD() {
        GovGASTWDImpl govGASTWD = new GovGASTWDImpl();
        return govGASTWD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindType3or4UserDefined createWindType3or4UserDefined() {
        WindType3or4UserDefinedImpl windType3or4UserDefined = new WindType3or4UserDefinedImpl();
        return windType3or4UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro1 createGovHydro1() {
        GovHydro1Impl govHydro1 = new GovHydro1Impl();
        return govHydro1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro2 createGovHydro2() {
        GovHydro2Impl govHydro2 = new GovHydro2Impl();
        return govHydro2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro3 createGovHydro3() {
        GovHydro3Impl govHydro3 = new GovHydro3Impl();
        return govHydro3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydro4 createGovHydro4() {
        GovHydro4Impl govHydro4 = new GovHydro4Impl();
        return govHydro4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProprietaryParameterDynamics createProprietaryParameterDynamics() {
        ProprietaryParameterDynamicsImpl proprietaryParameterDynamics = new ProprietaryParameterDynamicsImpl();
        return proprietaryParameterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcNI createExcNI() {
        ExcNIImpl excNI = new ExcNIImpl();
        return excNI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4IEC createWindTurbineType4IEC() {
        WindTurbineType4IECImpl windTurbineType4IEC = new WindTurbineType4IECImpl();
        return windTurbineType4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteam2 createGovSteam2() {
        GovSteam2Impl govSteam2 = new GovSteam2Impl();
        return govSteam2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteam1 createGovSteam1() {
        GovSteam1Impl govSteam1 = new GovSteam1Impl();
        return govSteam1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteam0 createGovSteam0() {
        GovSteam0Impl govSteam0 = new GovSteam0Impl();
        return govSteam0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroR createGovHydroR() {
        GovHydroRImpl govHydroR = new GovHydroRImpl();
        return govHydroR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineGovernorDynamics createTurbineGovernorDynamics() {
        TurbineGovernorDynamicsImpl turbineGovernorDynamics = new TurbineGovernorDynamicsImpl();
        return turbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadMotor createLoadMotor() {
        LoadMotorImpl loadMotor = new LoadMotorImpl();
        return loadMotor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQIEC createWindContQIEC() {
        WindContQIECImpl windContQIEC = new WindContQIECImpl();
        return windContQIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType3aIEC createWindGenType3aIEC() {
        WindGenType3aIECImpl windGenType3aIEC = new WindGenType3aIECImpl();
        return windGenType3aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcSK createExcSK() {
        ExcSKImpl excSK = new ExcSKImpl();
        return excSK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotatingMachineDynamics createRotatingMachineDynamics() {
        RotatingMachineDynamicsImpl rotatingMachineDynamics = new RotatingMachineDynamicsImpl();
        return rotatingMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageAdjusterDynamics createVoltageAdjusterDynamics() {
        VoltageAdjusterDynamicsImpl voltageAdjusterDynamics = new VoltageAdjusterDynamicsImpl();
        return voltageAdjusterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType2Dynamics createPFVArControllerType2Dynamics() {
        PFVArControllerType2DynamicsImpl pfvArControllerType2Dynamics = new PFVArControllerType2DynamicsImpl();
        return pfvArControllerType2Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorUserDefined createVoltageCompensatorUserDefined() {
        VoltageCompensatorUserDefinedImpl voltageCompensatorUserDefined = new VoltageCompensatorUserDefinedImpl();
        return voltageCompensatorUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPitchContPowerIEC createWindPitchContPowerIEC() {
        WindPitchContPowerIECImpl windPitchContPowerIEC = new WindPitchContPowerIECImpl();
        return windPitchContPowerIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType1aIEC createWindGenTurbineType1aIEC() {
        WindGenTurbineType1aIECImpl windGenTurbineType1aIEC = new WindGenTurbineType1aIECImpl();
        return windGenTurbineType1aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindProtectionIEC createWindProtectionIEC() {
        WindProtectionIECImpl windProtectionIEC = new WindProtectionIECImpl();
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindRefFrameRotIEC createWindRefFrameRotIEC() {
        WindRefFrameRotIECImpl windRefFrameRotIEC = new WindRefFrameRotIECImpl();
        return windRefFrameRotIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadGenericNonLinear createLoadGenericNonLinear() {
        LoadGenericNonLinearImpl loadGenericNonLinear = new LoadGenericNonLinearImpl();
        return loadGenericNonLinear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType1or2IEC createWindTurbineType1or2IEC() {
        WindTurbineType1or2IECImpl windTurbineType1or2IEC = new WindTurbineType1or2IECImpl();
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType2IEC createWindGenTurbineType2IEC() {
        WindGenTurbineType2IECImpl windGenTurbineType2IEC = new WindGenTurbineType2IECImpl();
        return windGenTurbineType2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType3IEC createWindGenType3IEC() {
        WindGenType3IECImpl windGenType3IEC = new WindGenType3IECImpl();
        return windGenType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType3IEC createWindContPType3IEC() {
        WindContPType3IECImpl windContPType3IEC = new WindContPType3IECImpl();
        return windContPType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLim2Simplified createUnderexcLim2Simplified() {
        UnderexcLim2SimplifiedImpl underexcLim2Simplified = new UnderexcLim2SimplifiedImpl();
        return underexcLim2Simplified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantIEC createWindPlantIEC() {
        WindPlantIECImpl windPlantIEC = new WindPlantIECImpl();
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss5 createPss5() {
        Pss5Impl pss5 = new Pss5Impl();
        return pss5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineTimeConstantReactance createAsynchronousMachineTimeConstantReactance() {
        AsynchronousMachineTimeConstantReactanceImpl asynchronousMachineTimeConstantReactance = new AsynchronousMachineTimeConstantReactanceImpl();
        return asynchronousMachineTimeConstantReactance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSTAB2A createPssSTAB2A() {
        PssSTAB2AImpl pssSTAB2A = new PssSTAB2AImpl();
        return pssSTAB2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss1 createPss1() {
        Pss1Impl pss1 = new Pss1Impl();
        return pss1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4bIEC createWindTurbineType4bIEC() {
        WindTurbineType4bIECImpl windTurbineType4bIEC = new WindTurbineType4bIECImpl();
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType2UserDefined createPFVArControllerType2UserDefined() {
        PFVArControllerType2UserDefinedImpl pfvArControllerType2UserDefined = new PFVArControllerType2UserDefinedImpl();
        return pfvArControllerType2UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroPID2 createGovHydroPID2() {
        GovHydroPID2Impl govHydroPID2 = new GovHydroPID2Impl();
        return govHydroPID2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroFrancis createGovHydroFrancis() {
        GovHydroFrancisImpl govHydroFrancis = new GovHydroFrancisImpl();
        return govHydroFrancis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CSCDynamics createCSCDynamics() {
        CSCDynamicsImpl cscDynamics = new CSCDynamicsImpl();
        return cscDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcitationLimiterDynamics createOverexcitationLimiterDynamics() {
        OverexcitationLimiterDynamicsImpl overexcitationLimiterDynamics = new OverexcitationLimiterDynamicsImpl();
        return overexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcRQB createExcRQB() {
        ExcRQBImpl excRQB = new ExcRQBImpl();
        return excRQB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcANS createExcANS() {
        ExcANSImpl excANS = new ExcANSImpl();
        return excANS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadAggregate createLoadAggregate() {
        LoadAggregateImpl loadAggregate = new LoadAggregateImpl();
        return loadAggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType3bIEC createWindGenType3bIEC() {
        WindGenType3bIECImpl windGenType3bIEC = new WindGenType3bIECImpl();
        return windGenType3bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamIEEE1 createGovSteamIEEE1() {
        GovSteamIEEE1Impl govSteamIEEE1 = new GovSteamIEEE1Impl();
        return govSteamIEEE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcitationLimiterDynamics createUnderexcitationLimiterDynamics() {
        UnderexcitationLimiterDynamicsImpl underexcitationLimiterDynamics = new UnderexcitationLimiterDynamicsImpl();
        return underexcitationLimiterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroWEH createGovHydroWEH() {
        GovHydroWEHImpl govHydroWEH = new GovHydroWEHImpl();
        return govHydroWEH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC3A1 createExcDC3A1() {
        ExcDC3A1Impl excDC3A1 = new ExcDC3A1Impl();
        return excDC3A1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType1or2Dynamics createWindTurbineType1or2Dynamics() {
        WindTurbineType1or2DynamicsImpl windTurbineType1or2Dynamics = new WindTurbineType1or2DynamicsImpl();
        return windTurbineType1or2Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcitationLimiterUserDefined createOverexcitationLimiterUserDefined() {
        OverexcitationLimiterUserDefinedImpl overexcitationLimiterUserDefined = new OverexcitationLimiterUserDefinedImpl();
        return overexcitationLimiterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineLoadControllerUserDefined createTurbineLoadControllerUserDefined() {
        TurbineLoadControllerUserDefinedImpl turbineLoadControllerUserDefined = new TurbineLoadControllerUserDefinedImpl();
        return turbineLoadControllerUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPitchAngleIEC createWindContPitchAngleIEC() {
        WindContPitchAngleIECImpl windContPitchAngleIEC = new WindContPitchAngleIECImpl();
        return windContPitchAngleIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcBBC createExcBBC() {
        ExcBBCImpl excBBC = new ExcBBCImpl();
        return excBBC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLimIEEE createOverexcLimIEEE() {
        OverexcLimIEEEImpl overexcLimIEEE = new OverexcLimIEEEImpl();
        return overexcLimIEEE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4Dynamics createWindTurbineType3or4Dynamics() {
        WindTurbineType3or4DynamicsImpl windTurbineType3or4Dynamics = new WindTurbineType3or4DynamicsImpl();
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteInputSignal createRemoteInputSignal() {
        RemoteInputSignalImpl remoteInputSignal = new RemoteInputSignalImpl();
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR1 createExcAVR1() {
        ExcAVR1Impl excAVR1 = new ExcAVR1Impl();
        return excAVR1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR2 createExcAVR2() {
        ExcAVR2Impl excAVR2 = new ExcAVR2Impl();
        return excAVR2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR3 createExcAVR3() {
        ExcAVR3Impl excAVR3 = new ExcAVR3Impl();
        return excAVR3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR4 createExcAVR4() {
        ExcAVR4Impl excAVR4 = new ExcAVR4Impl();
        return excAVR4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR5 createExcAVR5() {
        ExcAVR5Impl excAVR5 = new ExcAVR5Impl();
        return excAVR5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAVR7 createExcAVR7() {
        ExcAVR7Impl excAVR7 = new ExcAVR7Impl();
        return excAVR7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType2IEEEVArController createPFVArType2IEEEVArController() {
        PFVArType2IEEEVArControllerImpl pfvArType2IEEEVArController = new PFVArType2IEEEVArControllerImpl();
        return pfvArType2IEEEVArController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC2A createExcIEEEAC2A() {
        ExcIEEEAC2AImpl excIEEEAC2A = new ExcIEEEAC2AImpl();
        return excIEEEAC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadUserDefined createLoadUserDefined() {
        LoadUserDefinedImpl loadUserDefined = new LoadUserDefinedImpl();
        return loadUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadUserDefined createMechanicalLoadUserDefined() {
        MechanicalLoadUserDefinedImpl mechanicalLoadUserDefined = new MechanicalLoadUserDefinedImpl();
        return mechanicalLoadUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC1A createExcIEEEAC1A() {
        ExcIEEEAC1AImpl excIEEEAC1A = new ExcIEEEAC1AImpl();
        return excIEEEAC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroIEEE0 createGovHydroIEEE0() {
        GovHydroIEEE0Impl govHydroIEEE0 = new GovHydroIEEE0Impl();
        return govHydroIEEE0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroIEEE2 createGovHydroIEEE2() {
        GovHydroIEEE2Impl govHydroIEEE2 = new GovHydroIEEE2Impl();
        return govHydroIEEE2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC6A createExcIEEEAC6A() {
        ExcIEEEAC6AImpl excIEEEAC6A = new ExcIEEEAC6AImpl();
        return excIEEEAC6A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC5A createExcIEEEAC5A() {
        ExcIEEEAC5AImpl excIEEEAC5A = new ExcIEEEAC5AImpl();
        return excIEEEAC5A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrossCompoundTurbineGovernorDynamics createCrossCompoundTurbineGovernorDynamics() {
        CrossCompoundTurbineGovernorDynamicsImpl crossCompoundTurbineGovernorDynamics = new CrossCompoundTurbineGovernorDynamicsImpl();
        return crossCompoundTurbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticVarCompensatorDynamics createStaticVarCompensatorDynamics() {
        StaticVarCompensatorDynamicsImpl staticVarCompensatorDynamics = new StaticVarCompensatorDynamicsImpl();
        return staticVarCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC4A createExcIEEEAC4A() {
        ExcIEEEAC4AImpl excIEEEAC4A = new ExcIEEEAC4AImpl();
        return excIEEEAC4A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC3A createExcIEEEAC3A() {
        ExcIEEEAC3AImpl excIEEEAC3A = new ExcIEEEAC3AImpl();
        return excIEEEAC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemUserDefined createExcitationSystemUserDefined() {
        ExcitationSystemUserDefinedImpl excitationSystemUserDefined = new ExcitationSystemUserDefinedImpl();
        return excitationSystemUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindType1or2UserDefined createWindType1or2UserDefined() {
        WindType1or2UserDefinedImpl windType1or2UserDefined = new WindType1or2UserDefinedImpl();
        return windType1or2UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST4 createGovGAST4() {
        GovGAST4Impl govGAST4 = new GovGAST4Impl();
        return govGAST4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST3 createGovGAST3() {
        GovGAST3Impl govGAST3 = new GovGAST3Impl();
        return govGAST3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST2 createGovGAST2() {
        GovGAST2Impl govGAST2 = new GovGAST2Impl();
        return govGAST2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovGAST1 createGovGAST1() {
        GovGAST1Impl govGAST1 = new GovGAST1Impl();
        return govGAST1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechLoad1 createMechLoad1() {
        MechLoad1Impl mechLoad1 = new MechLoad1Impl();
        return mechLoad1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType1IEEEVArController createPFVArType1IEEEVArController() {
        PFVArType1IEEEVArControllerImpl pfvArType1IEEEVArController = new PFVArType1IEEEVArControllerImpl();
        return pfvArType1IEEEVArController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContRotorRIEC createWindContRotorRIEC() {
        WindContRotorRIECImpl windContRotorRIEC = new WindContRotorRIECImpl();
        return windContRotorRIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType2IEEEPFController createPFVArType2IEEEPFController() {
        PFVArType2IEEEPFControllerImpl pfvArType2IEEEPFController = new PFVArType2IEEEPFControllerImpl();
        return pfvArType2IEEEPFController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VAdjIEEE createVAdjIEEE() {
        VAdjIEEEImpl vAdjIEEE = new VAdjIEEEImpl();
        return vAdjIEEE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineEquivalentCircuit createSynchronousMachineEquivalentCircuit() {
        SynchronousMachineEquivalentCircuitImpl synchronousMachineEquivalentCircuit = new SynchronousMachineEquivalentCircuitImpl();
        return synchronousMachineEquivalentCircuit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantDynamics createWindPlantDynamics() {
        WindPlantDynamicsImpl windPlantDynamics = new WindPlantDynamicsImpl();
        return windPlantDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcELIN1 createExcELIN1() {
        ExcELIN1Impl excELIN1 = new ExcELIN1Impl();
        return excELIN1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcELIN2 createExcELIN2() {
        ExcELIN2Impl excELIN2 = new ExcELIN2Impl();
        return excELIN2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineUserDefined createAsynchronousMachineUserDefined() {
        AsynchronousMachineUserDefinedImpl asynchronousMachineUserDefined = new AsynchronousMachineUserDefinedImpl();
        return asynchronousMachineUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST4B createExcST4B() {
        ExcST4BImpl excST4B = new ExcST4BImpl();
        return excST4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST3A createExcST3A() {
        ExcST3AImpl excST3A = new ExcST3AImpl();
        return excST3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST2A createExcST2A() {
        ExcST2AImpl excST2A = new ExcST2AImpl();
        return excST2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC8B createExcIEEEAC8B() {
        ExcIEEEAC8BImpl excIEEEAC8B = new ExcIEEEAC8BImpl();
        return excIEEEAC8B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST1A createExcST1A() {
        ExcST1AImpl excST1A = new ExcST1AImpl();
        return excST1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEAC7B createExcIEEEAC7B() {
        ExcIEEEAC7BImpl excIEEEAC7B = new ExcIEEEAC7BImpl();
        return excIEEEAC7B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamSGO createGovSteamSGO() {
        GovSteamSGOImpl govSteamSGO = new GovSteamSGOImpl();
        return govSteamSGO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantFreqPcontrolIEC createWindPlantFreqPcontrolIEC() {
        WindPlantFreqPcontrolIECImpl windPlantFreqPcontrolIEC = new WindPlantFreqPcontrolIECImpl();
        return windPlantFreqPcontrolIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST7B createExcST7B() {
        ExcST7BImpl excST7B = new ExcST7BImpl();
        return excST7B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemStabilizerUserDefined createPowerSystemStabilizerUserDefined() {
        PowerSystemStabilizerUserDefinedImpl powerSystemStabilizerUserDefined = new PowerSystemStabilizerUserDefinedImpl();
        return powerSystemStabilizerUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DynamicsFunctionBlock createDynamicsFunctionBlock() {
        DynamicsFunctionBlockImpl dynamicsFunctionBlock = new DynamicsFunctionBlockImpl();
        return dynamicsFunctionBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroPID createGovHydroPID() {
        GovHydroPIDImpl govHydroPID = new GovHydroPIDImpl();
        return govHydroPID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST6B createExcST6B() {
        ExcST6BImpl excST6B = new ExcST6BImpl();
        return excST6B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType4bIEC createWindContPType4bIEC() {
        WindContPType4bIECImpl windContPType4bIEC = new WindContPType4bIECImpl();
        return windContPType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroPelton createGovHydroPelton() {
        GovHydroPeltonImpl govHydroPelton = new GovHydroPeltonImpl();
        return govHydroPelton;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VSCDynamics createVSCDynamics() {
        VSCDynamicsImpl vscDynamics = new VSCDynamicsImpl();
        return vscDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadDynamics createLoadDynamics() {
        LoadDynamicsImpl loadDynamics = new LoadDynamicsImpl();
        return loadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssELIN2 createPssELIN2() {
        PssELIN2Impl pssELIN2 = new PssELIN2Impl();
        return pssELIN2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineTimeConstantReactance createSynchronousMachineTimeConstantReactance() {
        SynchronousMachineTimeConstantReactanceImpl synchronousMachineTimeConstantReactance = new SynchronousMachineTimeConstantReactanceImpl();
        return synchronousMachineTimeConstantReactance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovCT1 createGovCT1() {
        GovCT1Impl govCT1 = new GovCT1Impl();
        return govCT1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovCT2 createGovCT2() {
        GovCT2Impl govCT2 = new GovCT2Impl();
        return govCT2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC1A createExcIEEEDC1A() {
        ExcIEEEDC1AImpl excIEEEDC1A = new ExcIEEEDC1AImpl();
        return excIEEEDC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQPQULimIEC createWindContQPQULimIEC() {
        WindContQPQULimIECImpl windContQPQULimIEC = new WindContQPQULimIECImpl();
        return windContQPQULimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC4B createExcIEEEDC4B() {
        ExcIEEEDC4BImpl excIEEEDC4B = new ExcIEEEDC4BImpl();
        return excIEEEDC4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC3A createExcIEEEDC3A() {
        ExcIEEEDC3AImpl excIEEEDC3A = new ExcIEEEDC3AImpl();
        return excIEEEDC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEDC2A createExcIEEEDC2A() {
        ExcIEEEDC2AImpl excIEEEDC2A = new ExcIEEEDC2AImpl();
        return excIEEEDC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CSCUserDefined createCSCUserDefined() {
        CSCUserDefinedImpl cscUserDefined = new CSCUserDefinedImpl();
        return cscUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadStatic createLoadStatic() {
        LoadStaticImpl loadStatic = new LoadStaticImpl();
        return loadStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroTwoDimIEC createWindAeroTwoDimIEC() {
        WindAeroTwoDimIECImpl windAeroTwoDimIEC = new WindAeroTwoDimIECImpl();
        return windAeroTwoDimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContCurrLimIEC createWindContCurrLimIEC() {
        WindContCurrLimIECImpl windContCurrLimIEC = new WindContCurrLimIECImpl();
        return windContCurrLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssPTIST1 createPssPTIST1() {
        PssPTIST1Impl pssPTIST1 = new PssPTIST1Impl();
        return pssPTIST1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssPTIST3 createPssPTIST3() {
        PssPTIST3Impl pssPTIST3 = new PssPTIST3Impl();
        return pssPTIST3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroWPID createGovHydroWPID() {
        GovHydroWPIDImpl govHydroWPID = new GovHydroWPIDImpl();
        return govHydroWPID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1Dynamics createPFVArControllerType1Dynamics() {
        PFVArControllerType1DynamicsImpl pfvArControllerType1Dynamics = new PFVArControllerType1DynamicsImpl();
        return pfvArControllerType1Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQLimIEC createWindContQLimIEC() {
        WindContQLimIECImpl windContQLimIEC = new WindContQLimIECImpl();
        return windContQLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorDynamics createVoltageCompensatorDynamics() {
        VoltageCompensatorDynamicsImpl voltageCompensatorDynamics = new VoltageCompensatorDynamicsImpl();
        return voltageCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineUserDefined createSynchronousMachineUserDefined() {
        SynchronousMachineUserDefinedImpl synchronousMachineUserDefined = new SynchronousMachineUserDefinedImpl();
        return synchronousMachineUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenICompensationForGenJ createGenICompensationForGenJ() {
        GenICompensationForGenJImpl genICompensationForGenJ = new GenICompensationForGenJImpl();
        return genICompensationForGenJ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcREXS createExcREXS() {
        ExcREXSImpl excREXS = new ExcREXSImpl();
        return excREXS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineDynamics createAsynchronousMachineDynamics() {
        AsynchronousMachineDynamicsImpl asynchronousMachineDynamics = new AsynchronousMachineDynamicsImpl();
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType2Common1 createPFVArType2Common1() {
        PFVArType2Common1Impl pfvArType2Common1 = new PFVArType2Common1Impl();
        return pfvArType2Common1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroConstIEC createWindAeroConstIEC() {
        WindAeroConstIECImpl windAeroConstIEC = new WindAeroConstIECImpl();
        return windAeroConstIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HVDCDynamics createHVDCDynamics() {
        HVDCDynamicsImpl hvdcDynamics = new HVDCDynamicsImpl();
        return hvdcDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineGovernorUserDefined createTurbineGovernorUserDefined() {
        TurbineGovernorUserDefinedImpl turbineGovernorUserDefined = new TurbineGovernorUserDefinedImpl();
        return turbineGovernorUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArType1IEEEPFController createPFVArType1IEEEPFController() {
        PFVArType1IEEEPFControllerImpl pfvArType1IEEEPFController = new PFVArType1IEEEPFControllerImpl();
        return pfvArType1IEEEPFController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC3A createExcDC3A() {
        ExcDC3AImpl excDC3A = new ExcDC3AImpl();
        return excDC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss2B createPss2B() {
        Pss2BImpl pss2B = new Pss2BImpl();
        return pss2B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC2A createExcDC2A() {
        ExcDC2AImpl excDC2A = new ExcDC2AImpl();
        return excDC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantReactiveControlIEC createWindPlantReactiveControlIEC() {
        WindPlantReactiveControlIECImpl windPlantReactiveControlIEC = new WindPlantReactiveControlIECImpl();
        return windPlantReactiveControlIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamCC createGovSteamCC() {
        GovSteamCCImpl govSteamCC = new GovSteamCCImpl();
        return govSteamCC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcDC1A createExcDC1A() {
        ExcDC1AImpl excDC1A = new ExcDC1AImpl();
        return excDC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLim2 createOverexcLim2() {
        OverexcLim2Impl overexcLim2 = new OverexcLim2Impl();
        return overexcLim2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamEU createGovSteamEU() {
        GovSteamEUImpl govSteamEU = new GovSteamEUImpl();
        return govSteamEU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindDynamicsLookupTable createWindDynamicsLookupTable() {
        WindDynamicsLookupTableImpl windDynamicsLookupTable = new WindDynamicsLookupTableImpl();
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Pss1A createPss1A() {
        Pss1AImpl pss1A = new Pss1AImpl();
        return pss1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageAdjusterUserDefined createVoltageAdjusterUserDefined() {
        VoltageAdjusterUserDefinedImpl voltageAdjusterUserDefined = new VoltageAdjusterUserDefinedImpl();
        return voltageAdjusterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics createSynchronousMachineDynamics() {
        SynchronousMachineDynamicsImpl synchronousMachineDynamics = new SynchronousMachineDynamicsImpl();
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamBB createGovSteamBB() {
        GovSteamBBImpl govSteamBB = new GovSteamBBImpl();
        return govSteamBB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimX2 createUnderexcLimX2() {
        UnderexcLimX2Impl underexcLimX2 = new UnderexcLimX2Impl();
        return underexcLimX2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimX1 createUnderexcLimX1() {
        UnderexcLimX1Impl underexcLimX1 = new UnderexcLimX1Impl();
        return underexcLimX1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType4IEC createWindGenType4IEC() {
        WindGenType4IECImpl windGenType4IEC = new WindGenType4IECImpl();
        return windGenType4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1UserDefined createPFVArControllerType1UserDefined() {
        PFVArControllerType1UserDefinedImpl pfvArControllerType1UserDefined = new PFVArControllerType1UserDefinedImpl();
        return pfvArControllerType1UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcOEX3T createExcOEX3T() {
        ExcOEX3TImpl excOEX3T = new ExcOEX3TImpl();
        return excOEX3T;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType1bIEC createWindGenTurbineType1bIEC() {
        WindGenTurbineType1bIECImpl windGenTurbineType1bIEC = new WindGenTurbineType1bIECImpl();
        return windGenTurbineType1bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSB4 createPssSB4() {
        PssSB4Impl pssSB4 = new PssSB4Impl();
        return pssSB4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadComposite createLoadComposite() {
        LoadCompositeImpl loadComposite = new LoadCompositeImpl();
        return loadComposite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcSEXS createExcSEXS() {
        ExcSEXSImpl excSEXS = new ExcSEXSImpl();
        return excSEXS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType4aIEC createWindContPType4aIEC() {
        WindContPType4aIECImpl windContPType4aIEC = new WindContPType4aIECImpl();
        return windContPType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC4A createExcAC4A() {
        ExcAC4AImpl excAC4A = new ExcAC4AImpl();
        return excAC4A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemDynamics createExcitationSystemDynamics() {
        ExcitationSystemDynamicsImpl excitationSystemDynamics = new ExcitationSystemDynamicsImpl();
        return excitationSystemDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC3A createExcAC3A() {
        ExcAC3AImpl excAC3A = new ExcAC3AImpl();
        return excAC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC2A createExcAC2A() {
        ExcAC2AImpl excAC2A = new ExcAC2AImpl();
        return excAC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC1A createExcAC1A() {
        ExcAC1AImpl excAC1A = new ExcAC1AImpl();
        return excAC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC8B createExcAC8B() {
        ExcAC8BImpl excAC8B = new ExcAC8BImpl();
        return excAC8B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST7B createExcIEEEST7B() {
        ExcIEEEST7BImpl excIEEEST7B = new ExcIEEEST7BImpl();
        return excIEEEST7B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssRQB createPssRQB() {
        PssRQBImpl pssRQB = new PssRQBImpl();
        return pssRQB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VCompIEEEType1 createVCompIEEEType1() {
        VCompIEEEType1Impl vCompIEEEType1 = new VCompIEEEType1Impl();
        return vCompIEEEType1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC6A createExcAC6A() {
        ExcAC6AImpl excAC6A = new ExcAC6AImpl();
        return excAC6A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VCompIEEEType2 createVCompIEEEType2() {
        VCompIEEEType2Impl vCompIEEEType2 = new VCompIEEEType2Impl();
        return vCompIEEEType2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcAC5A createExcAC5A() {
        ExcAC5AImpl excAC5A = new ExcAC5AImpl();
        return excAC5A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindMechIEC createWindMechIEC() {
        WindMechIECImpl windMechIEC = new WindMechIECImpl();
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLimX1 createOverexcLimX1() {
        OverexcLimX1Impl overexcLimX1 = new OverexcLimX1Impl();
        return overexcLimX1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcLimX2 createOverexcLimX2() {
        OverexcLimX2Impl overexcLimX2 = new OverexcLimX2Impl();
        return overexcLimX2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimIEEE2 createUnderexcLimIEEE2() {
        UnderexcLimIEEE2Impl underexcLimIEEE2 = new UnderexcLimIEEE2Impl();
        return underexcLimIEEE2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcLimIEEE1 createUnderexcLimIEEE1() {
        UnderexcLimIEEE1Impl underexcLimIEEE1 = new UnderexcLimIEEE1Impl();
        return underexcLimIEEE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST3A createExcIEEEST3A() {
        ExcIEEEST3AImpl excIEEEST3A = new ExcIEEEST3AImpl();
        return excIEEEST3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSH createPssSH() {
        PssSHImpl pssSH = new PssSHImpl();
        return pssSH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovHydroDD createGovHydroDD() {
        GovHydroDDImpl govHydroDD = new GovHydroDDImpl();
        return govHydroDD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PssSK createPssSK() {
        PssSKImpl pssSK = new PssSKImpl();
        return pssSK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST4B createExcIEEEST4B() {
        ExcIEEEST4BImpl excIEEEST4B = new ExcIEEEST4BImpl();
        return excIEEEST4B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4aIEC createWindTurbineType4aIEC() {
        WindTurbineType4aIECImpl windTurbineType4aIEC = new WindTurbineType4aIECImpl();
        return windTurbineType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST5B createExcIEEEST5B() {
        ExcIEEEST5BImpl excIEEEST5B = new ExcIEEEST5BImpl();
        return excIEEEST5B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcIEEEST6B createExcIEEEST6B() {
        ExcIEEEST6BImpl excIEEEST6B = new ExcIEEEST6BImpl();
        return excIEEEST6B;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamFV4 createGovSteamFV4() {
        GovSteamFV4Impl govSteamFV4 = new GovSteamFV4Impl();
        return govSteamFV4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamFV3 createGovSteamFV3() {
        GovSteamFV3Impl govSteamFV3 = new GovSteamFV3Impl();
        return govSteamFV3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GovSteamFV2 createGovSteamFV2() {
        GovSteamFV2Impl govSteamFV2 = new GovSteamFV2Impl();
        return govSteamFV2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemStabilizerDynamics createPowerSystemStabilizerDynamics() {
        PowerSystemStabilizerDynamicsImpl powerSystemStabilizerDynamics = new PowerSystemStabilizerDynamicsImpl();
        return powerSystemStabilizerDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscExcContIEEEDEC1A createDiscExcContIEEEDEC1A() {
        DiscExcContIEEEDEC1AImpl discExcContIEEEDEC1A = new DiscExcContIEEEDEC1AImpl();
        return discExcContIEEEDEC1A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC createWindTurbineType3IEC() {
        WindTurbineType3IECImpl windTurbineType3IEC = new WindTurbineType3IECImpl();
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantUserDefined createWindPlantUserDefined() {
        WindPlantUserDefinedImpl windPlantUserDefined = new WindPlantUserDefinedImpl();
        return windPlantUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscExcContIEEEDEC3A createDiscExcContIEEEDEC3A() {
        DiscExcContIEEEDEC3AImpl discExcContIEEEDEC3A = new DiscExcContIEEEDEC3AImpl();
        return discExcContIEEEDEC3A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscExcContIEEEDEC2A createDiscExcContIEEEDEC2A() {
        DiscExcContIEEEDEC2AImpl discExcContIEEEDEC2A = new DiscExcContIEEEDEC2AImpl();
        return discExcContIEEEDEC2A;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4IEC createWindTurbineType3or4IEC() {
        WindTurbineType3or4IECImpl windTurbineType3or4IEC = new WindTurbineType3or4IECImpl();
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SVCUserDefined createSVCUserDefined() {
        SVCUserDefinedImpl svcUserDefined = new SVCUserDefinedImpl();
        return svcUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbLCFB1 createTurbLCFB1() {
        TurbLCFB1Impl turbLCFB1 = new TurbLCFB1Impl();
        return turbLCFB1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress createStreetAddress() {
        StreetAddressImpl streetAddress = new StreetAddressImpl();
        return streetAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status createStatus() {
        StatusImpl status = new StatusImpl();
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceLocation createServiceLocation() {
        ServiceLocationImpl serviceLocation = new ServiceLocationImpl();
        return serviceLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CoordinateSystem createCoordinateSystem() {
        CoordinateSystemImpl coordinateSystem = new CoordinateSystemImpl();
        return coordinateSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PositionPoint createPositionPoint() {
        PositionPointImpl positionPoint = new PositionPointImpl();
        return positionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetDetail createStreetDetail() {
        StreetDetailImpl streetDetail = new StreetDetailImpl();
        return streetDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkLocation createWorkLocation() {
        WorkLocationImpl workLocation = new WorkLocationImpl();
        return workLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TownDetail createTownDetail() {
        TownDetailImpl townDetail = new TownDetailImpl();
        return townDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location createLocation() {
        LocationImpl location = new LocationImpl();
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogValue createAnalogValue() {
        AnalogValueImpl analogValue = new AnalogValueImpl();
        return analogValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Command createCommand() {
        CommandImpl command = new CommandImpl();
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscreteValue createDiscreteValue() {
        DiscreteValueImpl discreteValue = new DiscreteValueImpl();
        return discreteValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueQuality createMeasurementValueQuality() {
        MeasurementValueQualityImpl measurementValueQuality = new MeasurementValueQualityImpl();
        return measurementValueQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogLimitSet createAnalogLimitSet() {
        AnalogLimitSetImpl analogLimitSet = new AnalogLimitSetImpl();
        return analogLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Limit createLimit() {
        LimitImpl limit = new LimitImpl();
        return limit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogControl createAnalogControl() {
        AnalogControlImpl analogControl = new AnalogControlImpl();
        return analogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringMeasurementValue createStringMeasurementValue() {
        StringMeasurementValueImpl stringMeasurementValue = new StringMeasurementValueImpl();
        return stringMeasurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorValue createAccumulatorValue() {
        AccumulatorValueImpl accumulatorValue = new AccumulatorValueImpl();
        return accumulatorValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SetPoint createSetPoint() {
        SetPointImpl setPoint = new SetPointImpl();
        return setPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Analog createAnalog() {
        AnalogImpl analog = new AnalogImpl();
        return analog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueSource createMeasurementValueSource() {
        MeasurementValueSourceImpl measurementValueSource = new MeasurementValueSourceImpl();
        return measurementValueSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValue createMeasurementValue() {
        MeasurementValueImpl measurementValue = new MeasurementValueImpl();
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Quality61850 createQuality61850() {
        Quality61850Impl quality61850 = new Quality61850Impl();
        return quality61850;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LimitSet createLimitSet() {
        LimitSetImpl limitSet = new LimitSetImpl();
        return limitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorLimit createAccumulatorLimit() {
        AccumulatorLimitImpl accumulatorLimit = new AccumulatorLimitImpl();
        return accumulatorLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Measurement createMeasurement() {
        MeasurementImpl measurement = new MeasurementImpl();
        return measurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueAliasSet createValueAliasSet() {
        ValueAliasSetImpl valueAliasSet = new ValueAliasSetImpl();
        return valueAliasSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Accumulator createAccumulator() {
        AccumulatorImpl accumulator = new AccumulatorImpl();
        return accumulator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorLimitSet createAccumulatorLimitSet() {
        AccumulatorLimitSetImpl accumulatorLimitSet = new AccumulatorLimitSetImpl();
        return accumulatorLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueToAlias createValueToAlias() {
        ValueToAliasImpl valueToAlias = new ValueToAliasImpl();
        return valueToAlias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Discrete createDiscrete() {
        DiscreteImpl discrete = new DiscreteImpl();
        return discrete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RaiseLowerCommand createRaiseLowerCommand() {
        RaiseLowerCommandImpl raiseLowerCommand = new RaiseLowerCommandImpl();
        return raiseLowerCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IOPoint createIOPoint() {
        IOPointImpl ioPoint = new IOPointImpl();
        return ioPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorReset createAccumulatorReset() {
        AccumulatorResetImpl accumulatorReset = new AccumulatorResetImpl();
        return accumulatorReset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogLimit createAnalogLimit() {
        AnalogLimitImpl analogLimit = new AnalogLimitImpl();
        return analogLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringMeasurement createStringMeasurement() {
        StringMeasurementImpl stringMeasurement = new StringMeasurementImpl();
        return stringMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Control createControl() {
        ControlImpl control = new ControlImpl();
        return control;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MutualCoupling createMutualCoupling() {
        MutualCouplingImpl mutualCoupling = new MutualCouplingImpl();
        return mutualCoupling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvTapStep createSvTapStep() {
        SvTapStepImpl svTapStep = new SvTapStepImpl();
        return svTapStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalIsland createTopologicalIsland() {
        TopologicalIslandImpl topologicalIsland = new TopologicalIslandImpl();
        return topologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvSwitch createSvSwitch() {
        SvSwitchImpl svSwitch = new SvSwitchImpl();
        return svSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvPowerFlow createSvPowerFlow() {
        SvPowerFlowImpl svPowerFlow = new SvPowerFlowImpl();
        return svPowerFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvShuntCompensatorSections createSvShuntCompensatorSections() {
        SvShuntCompensatorSectionsImpl svShuntCompensatorSections = new SvShuntCompensatorSectionsImpl();
        return svShuntCompensatorSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvVoltage createSvVoltage() {
        SvVoltageImpl svVoltage = new SvVoltageImpl();
        return svVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTopologicalIsland createDCTopologicalIsland() {
        DCTopologicalIslandImpl dcTopologicalIsland = new DCTopologicalIslandImpl();
        return dcTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalNode createTopologicalNode() {
        TopologicalNodeImpl topologicalNode = new TopologicalNodeImpl();
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvStatus createSvStatus() {
        SvStatusImpl svStatus = new SvStatusImpl();
        return svStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvInjection createSvInjection() {
        SvInjectionImpl svInjection = new SvInjectionImpl();
        return svInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTopologicalNode createDCTopologicalNode() {
        DCTopologicalNodeImpl dcTopologicalNode = new DCTopologicalNodeImpl();
        return dcTopologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FuelType createFuelTypeFromString( EDataType eDataType, String initialValue ) {
        FuelType result = FuelType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFuelTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SVCControlMode createSVCControlModeFromString( EDataType eDataType, String initialValue ) {
        SVCControlMode result = SVCControlMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSVCControlModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenUnitKind createWindGenUnitKindFromString( EDataType eDataType, String initialValue ) {
        WindGenUnitKind result = WindGenUnitKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindGenUnitKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Currency createCurrencyFromString( EDataType eDataType, String initialValue ) {
        Currency result = Currency.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCurrencyToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlAreaTypeKind createControlAreaTypeKindFromString( EDataType eDataType, String initialValue ) {
        ControlAreaTypeKind result = ControlAreaTypeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertControlAreaTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegulatingControlModeKind createRegulatingControlModeKindFromString( EDataType eDataType,
            String initialValue ) {
        RegulatingControlModeKind result = RegulatingControlModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRegulatingControlModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhaseCode createPhaseCodeFromString( EDataType eDataType, String initialValue ) {
        PhaseCode result = PhaseCode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPhaseCodeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindingConnection createWindingConnectionFromString( EDataType eDataType, String initialValue ) {
        WindingConnection result = WindingConnection.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindingConnectionToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroEnergyConversionKind createHydroEnergyConversionKindFromString( EDataType eDataType,
            String initialValue ) {
        HydroEnergyConversionKind result = HydroEnergyConversionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHydroEnergyConversionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitSymbol createUnitSymbolFromString( EDataType eDataType, String initialValue ) {
        UnitSymbol result = UnitSymbol.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnitSymbolToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitMultiplier createUnitMultiplierFromString( EDataType eDataType, String initialValue ) {
        UnitMultiplier result = UnitMultiplier.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnitMultiplierToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CurveStyle createCurveStyleFromString( EDataType eDataType, String initialValue ) {
        CurveStyle result = CurveStyle.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCurveStyleToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrientationKind createOrientationKindFromString( EDataType eDataType, String initialValue ) {
        OrientationKind result = OrientationKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOrientationKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindUVRTQcontrolModeKind createWindUVRTQcontrolModeKindFromString( EDataType eDataType,
            String initialValue ) {
        WindUVRTQcontrolModeKind result = WindUVRTQcontrolModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindUVRTQcontrolModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEST1AUELselectorKind createExcIEEEST1AUELselectorKindFromString( EDataType eDataType,
            String initialValue ) {
        ExcIEEEST1AUELselectorKind result = ExcIEEEST1AUELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcIEEEST1AUELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST6BOELselectorKind createExcST6BOELselectorKindFromString( EDataType eDataType, String initialValue ) {
        ExcST6BOELselectorKind result = ExcST6BOELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcST6BOELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantQcontrolModeKind createWindPlantQcontrolModeKindFromString( EDataType eDataType,
            String initialValue ) {
        WindPlantQcontrolModeKind result = WindPlantQcontrolModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindPlantQcontrolModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydro4ModelKind createGovHydro4ModelKindFromString( EDataType eDataType, String initialValue ) {
        GovHydro4ModelKind result = GovHydro4ModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGovHydro4ModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IfdBaseKind createIfdBaseKindFromString( EDataType eDataType, String initialValue ) {
        IfdBaseKind result = IfdBaseKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIfdBaseKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSignalKind createInputSignalKindFromString( EDataType eDataType, String initialValue ) {
        InputSignalKind result = InputSignalKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInputSignalKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericNonLinearLoadModelKind createGenericNonLinearLoadModelKindFromString( EDataType eDataType,
            String initialValue ) {
        GenericNonLinearLoadModelKind result = GenericNonLinearLoadModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGenericNonLinearLoadModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DroopSignalFeedbackKind createDroopSignalFeedbackKindFromString( EDataType eDataType, String initialValue ) {
        DroopSignalFeedbackKind result = DroopSignalFeedbackKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDroopSignalFeedbackKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcREXSFeedbackSignalKind createExcREXSFeedbackSignalKindFromString( EDataType eDataType,
            String initialValue ) {
        ExcREXSFeedbackSignalKind result = ExcREXSFeedbackSignalKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcREXSFeedbackSignalKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindLookupTableFunctionKind createWindLookupTableFunctionKindFromString( EDataType eDataType,
            String initialValue ) {
        WindLookupTableFunctionKind result = WindLookupTableFunctionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindLookupTableFunctionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindQcontrolModeKind createWindQcontrolModeKindFromString( EDataType eDataType, String initialValue ) {
        WindQcontrolModeKind result = WindQcontrolModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertWindQcontrolModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST7BUELselectorKind createExcST7BUELselectorKindFromString( EDataType eDataType, String initialValue ) {
        ExcST7BUELselectorKind result = ExcST7BUELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcST7BUELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteSignalKind createRemoteSignalKindFromString( EDataType eDataType, String initialValue ) {
        RemoteSignalKind result = RemoteSignalKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRemoteSignalKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FrancisGovernorControlKind createFrancisGovernorControlKindFromString( EDataType eDataType,
            String initialValue ) {
        FrancisGovernorControlKind result = FrancisGovernorControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFrancisGovernorControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RotorKind createRotorKindFromString( EDataType eDataType, String initialValue ) {
        RotorKind result = RotorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRotorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticLoadModelKind createStaticLoadModelKindFromString( EDataType eDataType, String initialValue ) {
        StaticLoadModelKind result = StaticLoadModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStaticLoadModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST7BOELselectorKind createExcST7BOELselectorKindFromString( EDataType eDataType, String initialValue ) {
        ExcST7BOELselectorKind result = ExcST7BOELselectorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExcST7BOELselectorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineModelKind createSynchronousMachineModelKindFromString( EDataType eDataType,
            String initialValue ) {
        SynchronousMachineModelKind result = SynchronousMachineModelKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSynchronousMachineModelKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Validity createValidityFromString( EDataType eDataType, String initialValue ) {
        Validity result = Validity.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValidityToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Source createSourceFromString( EDataType eDataType, String initialValue ) {
        Source result = Source.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSourceToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShortCircuitRotorKind createShortCircuitRotorKindFromString( EDataType eDataType, String initialValue ) {
        ShortCircuitRotorKind result = ShortCircuitRotorKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertShortCircuitRotorKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PetersenCoilModeKind createPetersenCoilModeKindFromString( EDataType eDataType, String initialValue ) {
        PetersenCoilModeKind result = PetersenCoilModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPetersenCoilModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VsPpccControlKind createVsPpccControlKindFromString( EDataType eDataType, String initialValue ) {
        VsPpccControlKind result = VsPpccControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVsPpccControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BatteryStateKind createBatteryStateKindFromString( EDataType eDataType, String initialValue ) {
        BatteryStateKind result = BatteryStateKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBatteryStateKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CsPpccControlKind createCsPpccControlKindFromString( EDataType eDataType, String initialValue ) {
        CsPpccControlKind result = CsPpccControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCsPpccControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VsQpccControlKind createVsQpccControlKindFromString( EDataType eDataType, String initialValue ) {
        VsQpccControlKind result = VsQpccControlKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVsQpccControlKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineOperatingMode createSynchronousMachineOperatingModeFromString( EDataType eDataType,
            String initialValue ) {
        SynchronousMachineOperatingMode result = SynchronousMachineOperatingMode.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSynchronousMachineOperatingModeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CsOperatingModeKind createCsOperatingModeKindFromString( EDataType eDataType, String initialValue ) {
        CsOperatingModeKind result = CsOperatingModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCsOperatingModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineKind createAsynchronousMachineKindFromString( EDataType eDataType, String initialValue ) {
        AsynchronousMachineKind result = AsynchronousMachineKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAsynchronousMachineKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date createDateFromString( EDataType eDataType, String initialValue ) {
        return ( Date ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineKind createSynchronousMachineKindFromString( EDataType eDataType, String initialValue ) {
        SynchronousMachineKind result = SynchronousMachineKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSynchronousMachineKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneratorControlSource createGeneratorControlSourceFromString( EDataType eDataType, String initialValue ) {
        GeneratorControlSource result = GeneratorControlSource.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGeneratorControlSourceToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationalLimitDirectionKind createOperationalLimitDirectionKindFromString( EDataType eDataType,
            String initialValue ) {
        OperationalLimitDirectionKind result = OperationalLimitDirectionKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOperationalLimitDirectionKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DCPolarityKind createDCPolarityKindFromString( EDataType eDataType, String initialValue ) {
        DCPolarityKind result = DCPolarityKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDCPolarityKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroTurbineKind createHydroTurbineKindFromString( EDataType eDataType, String initialValue ) {
        HydroTurbineKind result = HydroTurbineKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHydroTurbineKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroPlantStorageKind createHydroPlantStorageKindFromString( EDataType eDataType, String initialValue ) {
        HydroPlantStorageKind result = HydroPlantStorageKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHydroPlantStorageKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DCConverterOperatingModeKind createDCConverterOperatingModeKindFromString( EDataType eDataType,
            String initialValue ) {
        DCConverterOperatingModeKind result = DCConverterOperatingModeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDCConverterOperatingModeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createStringFromString( EDataType eDataType, String initialValue ) {
        return ( String ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStringToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean createBooleanFromString( EDataType eDataType, String initialValue ) {
        return ( Boolean ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBooleanToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal createDecimalFromString( EDataType eDataType, String initialValue ) {
        return ( BigDecimal ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDecimalToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date createDateTimeFromString( EDataType eDataType, String initialValue ) {
        return ( Date ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateTimeToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createFloatFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFloatToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger createIntegerFromString( EDataType eDataType, String initialValue ) {
        return ( BigInteger ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntegerToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createInductanceFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInductanceToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createPerCentFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPerCentToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createAngleDegreesFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAngleDegreesToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createRealEnergyFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRealEnergyToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createLengthFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLengthToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createActivePowerFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertActivePowerToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createActivePowerPerCurrentFlowFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertActivePowerPerCurrentFlowToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createSecondsFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSecondsToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createAreaFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAreaToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createVolumeFlowRateFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVolumeFlowRateToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createTemperatureFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTemperatureToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createPUFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPUToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createAngleRadiansFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAngleRadiansToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createReactivePowerFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReactivePowerToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createResistanceFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertResistanceToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createFrequencyFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFrequencyToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createVoltagePerReactivePowerFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVoltagePerReactivePowerToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal createMoneyFromString( EDataType eDataType, String initialValue ) {
        return ( BigDecimal ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMoneyToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createApparentPowerFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertApparentPowerToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createReactanceFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReactanceToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createConductanceFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertConductanceToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createCurrentFlowFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCurrentFlowToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createActivePowerPerFrequencyFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertActivePowerPerFrequencyToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createRotationSpeedFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRotationSpeedToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createSusceptanceFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSusceptanceToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createVoltageFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVoltageToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double createCapacitanceFromString( EDataType eDataType, String initialValue ) {
        return ( Double ) super.createFromString( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCapacitanceToString( EDataType eDataType, Object instanceValue ) {
        return super.convertToString( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CimPackage getCimPackage() {
        return ( CimPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CimPackage getPackage() {
        return CimPackage.eINSTANCE;
    }

} //CimFactoryImpl
