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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage
 * @generated
 */
public class CimAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CimPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CimAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = CimPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ( ( EObject ) object ).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CimSwitch< Adapter > modelSwitch = new CimSwitch< >() {
        @Override
        public Adapter caseCimObjectWithID( CimObjectWithID object ) {
            return createCimObjectWithIDAdapter();
        }

        @Override
        public Adapter caseDayType( DayType object ) {
            return createDayTypeAdapter();
        }

        @Override
        public Adapter caseBusbarSection( BusbarSection object ) {
            return createBusbarSectionAdapter();
        }

        @Override
        public Adapter caseFaultIndicator( FaultIndicator object ) {
            return createFaultIndicatorAdapter();
        }

        @Override
        public Adapter caseDCBusbar( DCBusbar object ) {
            return createDCBusbarAdapter();
        }

        @Override
        public Adapter caseHydroPowerPlant( HydroPowerPlant object ) {
            return createHydroPowerPlantAdapter();
        }

        @Override
        public Adapter caseLoadResponseCharacteristic( LoadResponseCharacteristic object ) {
            return createLoadResponseCharacteristicAdapter();
        }

        @Override
        public Adapter caseApparentPowerLimit( ApparentPowerLimit object ) {
            return createApparentPowerLimitAdapter();
        }

        @Override
        public Adapter caseVsConverter( VsConverter object ) {
            return createVsConverterAdapter();
        }

        @Override
        public Adapter caseVsCapabilityCurve( VsCapabilityCurve object ) {
            return createVsCapabilityCurveAdapter();
        }

        @Override
        public Adapter casePotentialTransformer( PotentialTransformer object ) {
            return createPotentialTransformerAdapter();
        }

        @Override
        public Adapter caseDCTerminal( DCTerminal object ) {
            return createDCTerminalAdapter();
        }

        @Override
        public Adapter caseStaticVarCompensator( StaticVarCompensator object ) {
            return createStaticVarCompensatorAdapter();
        }

        @Override
        public Adapter caseCsConverter( CsConverter object ) {
            return createCsConverterAdapter();
        }

        @Override
        public Adapter caseACDCTerminal( ACDCTerminal object ) {
            return createACDCTerminalAdapter();
        }

        @Override
        public Adapter caseDisconnectingCircuitBreaker( DisconnectingCircuitBreaker object ) {
            return createDisconnectingCircuitBreakerAdapter();
        }

        @Override
        public Adapter caseRatioTapChanger( RatioTapChanger object ) {
            return createRatioTapChangerAdapter();
        }

        @Override
        public Adapter caseLine( Line object ) {
            return createLineAdapter();
        }

        @Override
        public Adapter caseBreaker( Breaker object ) {
            return createBreakerAdapter();
        }

        @Override
        public Adapter caseDisconnector( Disconnector object ) {
            return createDisconnectorAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerAsymmetrical( PhaseTapChangerAsymmetrical object ) {
            return createPhaseTapChangerAsymmetricalAdapter();
        }

        @Override
        public Adapter caseOperationalLimitSet( OperationalLimitSet object ) {
            return createOperationalLimitSetAdapter();
        }

        @Override
        public Adapter caseOperationalLimit( OperationalLimit object ) {
            return createOperationalLimitAdapter();
        }

        @Override
        public Adapter caseHydroPump( HydroPump object ) {
            return createHydroPumpAdapter();
        }

        @Override
        public Adapter caseRegulationSchedule( RegulationSchedule object ) {
            return createRegulationScheduleAdapter();
        }

        @Override
        public Adapter caseTapChangerControl( TapChangerControl object ) {
            return createTapChangerControlAdapter();
        }

        @Override
        public Adapter caseEquipment( Equipment object ) {
            return createEquipmentAdapter();
        }

        @Override
        public Adapter caseActivePowerLimit( ActivePowerLimit object ) {
            return createActivePowerLimitAdapter();
        }

        @Override
        public Adapter caseDCSeriesDevice( DCSeriesDevice object ) {
            return createDCSeriesDeviceAdapter();
        }

        @Override
        public Adapter caseSurgeArrester( SurgeArrester object ) {
            return createSurgeArresterAdapter();
        }

        @Override
        public Adapter caseConnector( Connector object ) {
            return createConnectorAdapter();
        }

        @Override
        public Adapter caseCurrentTransformer( CurrentTransformer object ) {
            return createCurrentTransformerAdapter();
        }

        @Override
        public Adapter caseCurveData( CurveData object ) {
            return createCurveDataAdapter();
        }

        @Override
        public Adapter caseDCShunt( DCShunt object ) {
            return createDCShuntAdapter();
        }

        @Override
        public Adapter caseSubLoadArea( SubLoadArea object ) {
            return createSubLoadAreaAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerLinear( PhaseTapChangerLinear object ) {
            return createPhaseTapChangerLinearAdapter();
        }

        @Override
        public Adapter caseSeriesCompensator( SeriesCompensator object ) {
            return createSeriesCompensatorAdapter();
        }

        @Override
        public Adapter caseRegulatingCondEq( RegulatingCondEq object ) {
            return createRegulatingCondEqAdapter();
        }

        @Override
        public Adapter caseTerminal( Terminal object ) {
            return createTerminalAdapter();
        }

        @Override
        public Adapter caseAsynchronousMachine( AsynchronousMachine object ) {
            return createAsynchronousMachineAdapter();
        }

        @Override
        public Adapter caseCurrentLimit( CurrentLimit object ) {
            return createCurrentLimitAdapter();
        }

        @Override
        public Adapter caseTapChangerTablePoint( TapChangerTablePoint object ) {
            return createTapChangerTablePointAdapter();
        }

        @Override
        public Adapter caseDCEquipmentContainer( DCEquipmentContainer object ) {
            return createDCEquipmentContainerAdapter();
        }

        @Override
        public Adapter caseExternalNetworkInjection( ExternalNetworkInjection object ) {
            return createExternalNetworkInjectionAdapter();
        }

        @Override
        public Adapter caseLoadGroup( LoadGroup object ) {
            return createLoadGroupAdapter();
        }

        @Override
        public Adapter caseSolarGeneratingUnit( SolarGeneratingUnit object ) {
            return createSolarGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseSynchronousMachine( SynchronousMachine object ) {
            return createSynchronousMachineAdapter();
        }

        @Override
        public Adapter caseACDCConverter( ACDCConverter object ) {
            return createACDCConverterAdapter();
        }

        @Override
        public Adapter caseGroundDisconnector( GroundDisconnector object ) {
            return createGroundDisconnectorAdapter();
        }

        @Override
        public Adapter caseTapSchedule( TapSchedule object ) {
            return createTapScheduleAdapter();
        }

        @Override
        public Adapter caseEquipmentContainer( EquipmentContainer object ) {
            return createEquipmentContainerAdapter();
        }

        @Override
        public Adapter caseTapChanger( TapChanger object ) {
            return createTapChangerAdapter();
        }

        @Override
        public Adapter caseDCBreaker( DCBreaker object ) {
            return createDCBreakerAdapter();
        }

        @Override
        public Adapter caseEquivalentBranch( EquivalentBranch object ) {
            return createEquivalentBranchAdapter();
        }

        @Override
        public Adapter caseTransformerEnd( TransformerEnd object ) {
            return createTransformerEndAdapter();
        }

        @Override
        public Adapter caseNonConformLoadSchedule( NonConformLoadSchedule object ) {
            return createNonConformLoadScheduleAdapter();
        }

        @Override
        public Adapter caseGrossToNetActivePowerCurve( GrossToNetActivePowerCurve object ) {
            return createGrossToNetActivePowerCurveAdapter();
        }

        @Override
        public Adapter caseEquivalentNetwork( EquivalentNetwork object ) {
            return createEquivalentNetworkAdapter();
        }

        @Override
        public Adapter caseConformLoadGroup( ConformLoadGroup object ) {
            return createConformLoadGroupAdapter();
        }

        @Override
        public Adapter caseLoadArea( LoadArea object ) {
            return createLoadAreaAdapter();
        }

        @Override
        public Adapter caseEnergyConnection( EnergyConnection object ) {
            return createEnergyConnectionAdapter();
        }

        @Override
        public Adapter caseThermalGeneratingUnit( ThermalGeneratingUnit object ) {
            return createThermalGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseRotatingMachine( RotatingMachine object ) {
            return createRotatingMachineAdapter();
        }

        @Override
        public Adapter caseBay( Bay object ) {
            return createBayAdapter();
        }

        @Override
        public Adapter caseCAESPlant( CAESPlant object ) {
            return createCAESPlantAdapter();
        }

        @Override
        public Adapter caseControlAreaGeneratingUnit( ControlAreaGeneratingUnit object ) {
            return createControlAreaGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseSubGeographicalRegion( SubGeographicalRegion object ) {
            return createSubGeographicalRegionAdapter();
        }

        @Override
        public Adapter caseSwitchSchedule( SwitchSchedule object ) {
            return createSwitchScheduleAdapter();
        }

        @Override
        public Adapter caseDCChopper( DCChopper object ) {
            return createDCChopperAdapter();
        }

        @Override
        public Adapter caseGround( Ground object ) {
            return createGroundAdapter();
        }

        @Override
        public Adapter caseEquivalentShunt( EquivalentShunt object ) {
            return createEquivalentShuntAdapter();
        }

        @Override
        public Adapter caseConductor( Conductor object ) {
            return createConductorAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerTable( PhaseTapChangerTable object ) {
            return createPhaseTapChangerTableAdapter();
        }

        @Override
        public Adapter caseDCBaseTerminal( DCBaseTerminal object ) {
            return createDCBaseTerminalAdapter();
        }

        @Override
        public Adapter caseDCSwitch( DCSwitch object ) {
            return createDCSwitchAdapter();
        }

        @Override
        public Adapter caseFuse( Fuse object ) {
            return createFuseAdapter();
        }

        @Override
        public Adapter caseSubstation( Substation object ) {
            return createSubstationAdapter();
        }

        @Override
        public Adapter caseACLineSegment( ACLineSegment object ) {
            return createACLineSegmentAdapter();
        }

        @Override
        public Adapter caseDCLineSegment( DCLineSegment object ) {
            return createDCLineSegmentAdapter();
        }

        @Override
        public Adapter caseCurve( Curve object ) {
            return createCurveAdapter();
        }

        @Override
        public Adapter casePhaseTapChanger( PhaseTapChanger object ) {
            return createPhaseTapChangerAdapter();
        }

        @Override
        public Adapter caseStationSupply( StationSupply object ) {
            return createStationSupplyAdapter();
        }

        @Override
        public Adapter casePetersenCoil( PetersenCoil object ) {
            return createPetersenCoilAdapter();
        }

        @Override
        public Adapter caseProtectedSwitch( ProtectedSwitch object ) {
            return createProtectedSwitchAdapter();
        }

        @Override
        public Adapter caseDCLine( DCLine object ) {
            return createDCLineAdapter();
        }

        @Override
        public Adapter casePowerTransformerEnd( PowerTransformerEnd object ) {
            return createPowerTransformerEndAdapter();
        }

        @Override
        public Adapter caseCombinedCyclePlant( CombinedCyclePlant object ) {
            return createCombinedCyclePlantAdapter();
        }

        @Override
        public Adapter caseRatioTapChangerTable( RatioTapChangerTable object ) {
            return createRatioTapChangerTableAdapter();
        }

        @Override
        public Adapter caseIdentifiedObject( IdentifiedObject object ) {
            return createIdentifiedObjectAdapter();
        }

        @Override
        public Adapter caseLoadBreakSwitch( LoadBreakSwitch object ) {
            return createLoadBreakSwitchAdapter();
        }

        @Override
        public Adapter caseDCConductingEquipment( DCConductingEquipment object ) {
            return createDCConductingEquipmentAdapter();
        }

        @Override
        public Adapter caseClamp( Clamp object ) {
            return createClampAdapter();
        }

        @Override
        public Adapter caseJumper( Jumper object ) {
            return createJumperAdapter();
        }

        @Override
        public Adapter caseControlArea( ControlArea object ) {
            return createControlAreaAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerSymmetrical( PhaseTapChangerSymmetrical object ) {
            return createPhaseTapChangerSymmetricalAdapter();
        }

        @Override
        public Adapter caseConnectivityNode( ConnectivityNode object ) {
            return createConnectivityNodeAdapter();
        }

        @Override
        public Adapter casePowerElectronicsUnit( PowerElectronicsUnit object ) {
            return createPowerElectronicsUnitAdapter();
        }

        @Override
        public Adapter caseConformLoad( ConformLoad object ) {
            return createConformLoadAdapter();
        }

        @Override
        public Adapter casePhotoVoltaicUnit( PhotoVoltaicUnit object ) {
            return createPhotoVoltaicUnitAdapter();
        }

        @Override
        public Adapter caseWindGeneratingUnit( WindGeneratingUnit object ) {
            return createWindGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseSeasonDayTypeSchedule( SeasonDayTypeSchedule object ) {
            return createSeasonDayTypeScheduleAdapter();
        }

        @Override
        public Adapter caseCut( Cut object ) {
            return createCutAdapter();
        }

        @Override
        public Adapter caseDCGround( DCGround object ) {
            return createDCGroundAdapter();
        }

        @Override
        public Adapter caseVoltageLimit( VoltageLimit object ) {
            return createVoltageLimitAdapter();
        }

        @Override
        public Adapter caseACDCConverterDCTerminal( ACDCConverterDCTerminal object ) {
            return createACDCConverterDCTerminalAdapter();
        }

        @Override
        public Adapter casePowerElectronicsWindUnit( PowerElectronicsWindUnit object ) {
            return createPowerElectronicsWindUnitAdapter();
        }

        @Override
        public Adapter caseNuclearGeneratingUnit( NuclearGeneratingUnit object ) {
            return createNuclearGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseRegulatingControl( RegulatingControl object ) {
            return createRegulatingControlAdapter();
        }

        @Override
        public Adapter caseSensor( Sensor object ) {
            return createSensorAdapter();
        }

        @Override
        public Adapter caseNonlinearShuntCompensator( NonlinearShuntCompensator object ) {
            return createNonlinearShuntCompensatorAdapter();
        }

        @Override
        public Adapter caseBatteryUnit( BatteryUnit object ) {
            return createBatteryUnitAdapter();
        }

        @Override
        public Adapter caseReactiveCapabilityCurve( ReactiveCapabilityCurve object ) {
            return createReactiveCapabilityCurveAdapter();
        }

        @Override
        public Adapter caseVoltageLevel( VoltageLevel object ) {
            return createVoltageLevelAdapter();
        }

        @Override
        public Adapter caseDCNode( DCNode object ) {
            return createDCNodeAdapter();
        }

        @Override
        public Adapter caseNonlinearShuntCompensatorPoint( NonlinearShuntCompensatorPoint object ) {
            return createNonlinearShuntCompensatorPointAdapter();
        }

        @Override
        public Adapter caseDCDisconnector( DCDisconnector object ) {
            return createDCDisconnectorAdapter();
        }

        @Override
        public Adapter caseJunction( Junction object ) {
            return createJunctionAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerNonLinear( PhaseTapChangerNonLinear object ) {
            return createPhaseTapChangerNonLinearAdapter();
        }

        @Override
        public Adapter caseConductingEquipment( ConductingEquipment object ) {
            return createConductingEquipmentAdapter();
        }

        @Override
        public Adapter caseBaseVoltage( BaseVoltage object ) {
            return createBaseVoltageAdapter();
        }

        @Override
        public Adapter caseFossilFuel( FossilFuel object ) {
            return createFossilFuelAdapter();
        }

        @Override
        public Adapter caseSwitch( Switch object ) {
            return createSwitchAdapter();
        }

        @Override
        public Adapter caseAuxiliaryEquipment( AuxiliaryEquipment object ) {
            return createAuxiliaryEquipmentAdapter();
        }

        @Override
        public Adapter caseReportingGroup( ReportingGroup object ) {
            return createReportingGroupAdapter();
        }

        @Override
        public Adapter caseGroundingImpedance( GroundingImpedance object ) {
            return createGroundingImpedanceAdapter();
        }

        @Override
        public Adapter caseNonConformLoad( NonConformLoad object ) {
            return createNonConformLoadAdapter();
        }

        @Override
        public Adapter caseWaveTrap( WaveTrap object ) {
            return createWaveTrapAdapter();
        }

        @Override
        public Adapter caseSeason( Season object ) {
            return createSeasonAdapter();
        }

        @Override
        public Adapter caseTieFlow( TieFlow object ) {
            return createTieFlowAdapter();
        }

        @Override
        public Adapter casePowerSystemResource( PowerSystemResource object ) {
            return createPowerSystemResourceAdapter();
        }

        @Override
        public Adapter caseHydroGeneratingUnit( HydroGeneratingUnit object ) {
            return createHydroGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseEnergyConsumer( EnergyConsumer object ) {
            return createEnergyConsumerAdapter();
        }

        @Override
        public Adapter casePowerElectronicsConnection( PowerElectronicsConnection object ) {
            return createPowerElectronicsConnectionAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerTablePoint( PhaseTapChangerTablePoint object ) {
            return createPhaseTapChangerTablePointAdapter();
        }

        @Override
        public Adapter caseEnergySchedulingType( EnergySchedulingType object ) {
            return createEnergySchedulingTypeAdapter();
        }

        @Override
        public Adapter caseDCConverterUnit( DCConverterUnit object ) {
            return createDCConverterUnitAdapter();
        }

        @Override
        public Adapter caseRatioTapChangerTablePoint( RatioTapChangerTablePoint object ) {
            return createRatioTapChangerTablePointAdapter();
        }

        @Override
        public Adapter caseEarthFaultCompensator( EarthFaultCompensator object ) {
            return createEarthFaultCompensatorAdapter();
        }

        @Override
        public Adapter caseEquivalentInjection( EquivalentInjection object ) {
            return createEquivalentInjectionAdapter();
        }

        @Override
        public Adapter caseNonConformLoadGroup( NonConformLoadGroup object ) {
            return createNonConformLoadGroupAdapter();
        }

        @Override
        public Adapter caseLinearShuntCompensator( LinearShuntCompensator object ) {
            return createLinearShuntCompensatorAdapter();
        }

        @Override
        public Adapter casePostLineSensor( PostLineSensor object ) {
            return createPostLineSensorAdapter();
        }

        @Override
        public Adapter casePhaseTapChangerTabular( PhaseTapChangerTabular object ) {
            return createPhaseTapChangerTabularAdapter();
        }

        @Override
        public Adapter caseBusNameMarker( BusNameMarker object ) {
            return createBusNameMarkerAdapter();
        }

        @Override
        public Adapter caseEnergySource( EnergySource object ) {
            return createEnergySourceAdapter();
        }

        @Override
        public Adapter caseGeneratingUnit( GeneratingUnit object ) {
            return createGeneratingUnitAdapter();
        }

        @Override
        public Adapter caseBasicIntervalSchedule( BasicIntervalSchedule object ) {
            return createBasicIntervalScheduleAdapter();
        }

        @Override
        public Adapter caseEquivalentEquipment( EquivalentEquipment object ) {
            return createEquivalentEquipmentAdapter();
        }

        @Override
        public Adapter caseRegularTimePoint( RegularTimePoint object ) {
            return createRegularTimePointAdapter();
        }

        @Override
        public Adapter caseRegularIntervalSchedule( RegularIntervalSchedule object ) {
            return createRegularIntervalScheduleAdapter();
        }

        @Override
        public Adapter caseConnectivityNodeContainer( ConnectivityNodeContainer object ) {
            return createConnectivityNodeContainerAdapter();
        }

        @Override
        public Adapter caseEnergyArea( EnergyArea object ) {
            return createEnergyAreaAdapter();
        }

        @Override
        public Adapter caseCogenerationPlant( CogenerationPlant object ) {
            return createCogenerationPlantAdapter();
        }

        @Override
        public Adapter casePowerTransformer( PowerTransformer object ) {
            return createPowerTransformerAdapter();
        }

        @Override
        public Adapter caseOperationalLimitType( OperationalLimitType object ) {
            return createOperationalLimitTypeAdapter();
        }

        @Override
        public Adapter caseGeographicalRegion( GeographicalRegion object ) {
            return createGeographicalRegionAdapter();
        }

        @Override
        public Adapter caseConformLoadSchedule( ConformLoadSchedule object ) {
            return createConformLoadScheduleAdapter();
        }

        @Override
        public Adapter caseShuntCompensator( ShuntCompensator object ) {
            return createShuntCompensatorAdapter();
        }

        @Override
        public Adapter caseVisibilityLayer( VisibilityLayer object ) {
            return createVisibilityLayerAdapter();
        }

        @Override
        public Adapter caseDiagramObjectGluePoint( DiagramObjectGluePoint object ) {
            return createDiagramObjectGluePointAdapter();
        }

        @Override
        public Adapter caseDiagram( Diagram object ) {
            return createDiagramAdapter();
        }

        @Override
        public Adapter caseDiagramObjectStyle( DiagramObjectStyle object ) {
            return createDiagramObjectStyleAdapter();
        }

        @Override
        public Adapter caseTextDiagramObject( TextDiagramObject object ) {
            return createTextDiagramObjectAdapter();
        }

        @Override
        public Adapter caseDiagramObject( DiagramObject object ) {
            return createDiagramObjectAdapter();
        }

        @Override
        public Adapter caseDiagramStyle( DiagramStyle object ) {
            return createDiagramStyleAdapter();
        }

        @Override
        public Adapter caseDiagramObjectPoint( DiagramObjectPoint object ) {
            return createDiagramObjectPointAdapter();
        }

        @Override
        public Adapter caseUnderexcitationLimiterUserDefined( UnderexcitationLimiterUserDefined object ) {
            return createUnderexcitationLimiterUserDefinedAdapter();
        }

        @Override
        public Adapter casePssIEEE3B( PssIEEE3B object ) {
            return createPssIEEE3BAdapter();
        }

        @Override
        public Adapter casePssIEEE2B( PssIEEE2B object ) {
            return createPssIEEE2BAdapter();
        }

        @Override
        public Adapter caseDiscontinuousExcitationControlUserDefined(
                DiscontinuousExcitationControlUserDefined object ) {
            return createDiscontinuousExcitationControlUserDefinedAdapter();
        }

        @Override
        public Adapter caseExcPIC( ExcPIC object ) {
            return createExcPICAdapter();
        }

        @Override
        public Adapter casePssIEEE4B( PssIEEE4B object ) {
            return createPssIEEE4BAdapter();
        }

        @Override
        public Adapter caseDiscontinuousExcitationControlDynamics( DiscontinuousExcitationControlDynamics object ) {
            return createDiscontinuousExcitationControlDynamicsAdapter();
        }

        @Override
        public Adapter casePssIEEE1A( PssIEEE1A object ) {
            return createPssIEEE1AAdapter();
        }

        @Override
        public Adapter caseVSCUserDefined( VSCUserDefined object ) {
            return createVSCUserDefinedAdapter();
        }

        @Override
        public Adapter caseGovGAST( GovGAST object ) {
            return createGovGASTAdapter();
        }

        @Override
        public Adapter casePssWECC( PssWECC object ) {
            return createPssWECCAdapter();
        }

        @Override
        public Adapter caseWindAeroOneDimIEC( WindAeroOneDimIEC object ) {
            return createWindAeroOneDimIECAdapter();
        }

        @Override
        public Adapter caseSynchronousMachineSimplified( SynchronousMachineSimplified object ) {
            return createSynchronousMachineSimplifiedAdapter();
        }

        @Override
        public Adapter caseAsynchronousMachineEquivalentCircuit( AsynchronousMachineEquivalentCircuit object ) {
            return createAsynchronousMachineEquivalentCircuitAdapter();
        }

        @Override
        public Adapter caseExcIEEEST1A( ExcIEEEST1A object ) {
            return createExcIEEEST1AAdapter();
        }

        @Override
        public Adapter caseTurbineLoadControllerDynamics( TurbineLoadControllerDynamics object ) {
            return createTurbineLoadControllerDynamicsAdapter();
        }

        @Override
        public Adapter caseSynchronousMachineDetailed( SynchronousMachineDetailed object ) {
            return createSynchronousMachineDetailedAdapter();
        }

        @Override
        public Adapter caseExcIEEEST2A( ExcIEEEST2A object ) {
            return createExcIEEEST2AAdapter();
        }

        @Override
        public Adapter caseExcHU( ExcHU object ) {
            return createExcHUAdapter();
        }

        @Override
        public Adapter caseExcCZ( ExcCZ object ) {
            return createExcCZAdapter();
        }

        @Override
        public Adapter caseMechanicalLoadDynamics( MechanicalLoadDynamics object ) {
            return createMechanicalLoadDynamicsAdapter();
        }

        @Override
        public Adapter casePss2ST( Pss2ST object ) {
            return createPss2STAdapter();
        }

        @Override
        public Adapter caseExcSCRX( ExcSCRX object ) {
            return createExcSCRXAdapter();
        }

        @Override
        public Adapter caseGovGASTWD( GovGASTWD object ) {
            return createGovGASTWDAdapter();
        }

        @Override
        public Adapter caseWindType3or4UserDefined( WindType3or4UserDefined object ) {
            return createWindType3or4UserDefinedAdapter();
        }

        @Override
        public Adapter caseGovHydro1( GovHydro1 object ) {
            return createGovHydro1Adapter();
        }

        @Override
        public Adapter caseGovHydro2( GovHydro2 object ) {
            return createGovHydro2Adapter();
        }

        @Override
        public Adapter caseGovHydro3( GovHydro3 object ) {
            return createGovHydro3Adapter();
        }

        @Override
        public Adapter caseGovHydro4( GovHydro4 object ) {
            return createGovHydro4Adapter();
        }

        @Override
        public Adapter caseProprietaryParameterDynamics( ProprietaryParameterDynamics object ) {
            return createProprietaryParameterDynamicsAdapter();
        }

        @Override
        public Adapter caseExcNI( ExcNI object ) {
            return createExcNIAdapter();
        }

        @Override
        public Adapter caseWindTurbineType4IEC( WindTurbineType4IEC object ) {
            return createWindTurbineType4IECAdapter();
        }

        @Override
        public Adapter caseGovSteam2( GovSteam2 object ) {
            return createGovSteam2Adapter();
        }

        @Override
        public Adapter caseGovSteam1( GovSteam1 object ) {
            return createGovSteam1Adapter();
        }

        @Override
        public Adapter caseGovSteam0( GovSteam0 object ) {
            return createGovSteam0Adapter();
        }

        @Override
        public Adapter caseGovHydroR( GovHydroR object ) {
            return createGovHydroRAdapter();
        }

        @Override
        public Adapter caseTurbineGovernorDynamics( TurbineGovernorDynamics object ) {
            return createTurbineGovernorDynamicsAdapter();
        }

        @Override
        public Adapter caseLoadMotor( LoadMotor object ) {
            return createLoadMotorAdapter();
        }

        @Override
        public Adapter caseWindContQIEC( WindContQIEC object ) {
            return createWindContQIECAdapter();
        }

        @Override
        public Adapter caseWindGenType3aIEC( WindGenType3aIEC object ) {
            return createWindGenType3aIECAdapter();
        }

        @Override
        public Adapter caseExcSK( ExcSK object ) {
            return createExcSKAdapter();
        }

        @Override
        public Adapter caseRotatingMachineDynamics( RotatingMachineDynamics object ) {
            return createRotatingMachineDynamicsAdapter();
        }

        @Override
        public Adapter caseVoltageAdjusterDynamics( VoltageAdjusterDynamics object ) {
            return createVoltageAdjusterDynamicsAdapter();
        }

        @Override
        public Adapter casePFVArControllerType2Dynamics( PFVArControllerType2Dynamics object ) {
            return createPFVArControllerType2DynamicsAdapter();
        }

        @Override
        public Adapter caseVoltageCompensatorUserDefined( VoltageCompensatorUserDefined object ) {
            return createVoltageCompensatorUserDefinedAdapter();
        }

        @Override
        public Adapter caseWindPitchContPowerIEC( WindPitchContPowerIEC object ) {
            return createWindPitchContPowerIECAdapter();
        }

        @Override
        public Adapter caseWindGenTurbineType1aIEC( WindGenTurbineType1aIEC object ) {
            return createWindGenTurbineType1aIECAdapter();
        }

        @Override
        public Adapter caseWindProtectionIEC( WindProtectionIEC object ) {
            return createWindProtectionIECAdapter();
        }

        @Override
        public Adapter caseWindRefFrameRotIEC( WindRefFrameRotIEC object ) {
            return createWindRefFrameRotIECAdapter();
        }

        @Override
        public Adapter caseLoadGenericNonLinear( LoadGenericNonLinear object ) {
            return createLoadGenericNonLinearAdapter();
        }

        @Override
        public Adapter caseWindTurbineType1or2IEC( WindTurbineType1or2IEC object ) {
            return createWindTurbineType1or2IECAdapter();
        }

        @Override
        public Adapter caseWindGenTurbineType2IEC( WindGenTurbineType2IEC object ) {
            return createWindGenTurbineType2IECAdapter();
        }

        @Override
        public Adapter caseWindGenType3IEC( WindGenType3IEC object ) {
            return createWindGenType3IECAdapter();
        }

        @Override
        public Adapter caseWindContPType3IEC( WindContPType3IEC object ) {
            return createWindContPType3IECAdapter();
        }

        @Override
        public Adapter caseUnderexcLim2Simplified( UnderexcLim2Simplified object ) {
            return createUnderexcLim2SimplifiedAdapter();
        }

        @Override
        public Adapter caseWindPlantIEC( WindPlantIEC object ) {
            return createWindPlantIECAdapter();
        }

        @Override
        public Adapter casePss5( Pss5 object ) {
            return createPss5Adapter();
        }

        @Override
        public Adapter caseAsynchronousMachineTimeConstantReactance( AsynchronousMachineTimeConstantReactance object ) {
            return createAsynchronousMachineTimeConstantReactanceAdapter();
        }

        @Override
        public Adapter casePssSTAB2A( PssSTAB2A object ) {
            return createPssSTAB2AAdapter();
        }

        @Override
        public Adapter casePss1( Pss1 object ) {
            return createPss1Adapter();
        }

        @Override
        public Adapter caseWindTurbineType4bIEC( WindTurbineType4bIEC object ) {
            return createWindTurbineType4bIECAdapter();
        }

        @Override
        public Adapter casePFVArControllerType2UserDefined( PFVArControllerType2UserDefined object ) {
            return createPFVArControllerType2UserDefinedAdapter();
        }

        @Override
        public Adapter caseGovHydroPID2( GovHydroPID2 object ) {
            return createGovHydroPID2Adapter();
        }

        @Override
        public Adapter caseGovHydroFrancis( GovHydroFrancis object ) {
            return createGovHydroFrancisAdapter();
        }

        @Override
        public Adapter caseCSCDynamics( CSCDynamics object ) {
            return createCSCDynamicsAdapter();
        }

        @Override
        public Adapter caseOverexcitationLimiterDynamics( OverexcitationLimiterDynamics object ) {
            return createOverexcitationLimiterDynamicsAdapter();
        }

        @Override
        public Adapter caseExcRQB( ExcRQB object ) {
            return createExcRQBAdapter();
        }

        @Override
        public Adapter caseExcANS( ExcANS object ) {
            return createExcANSAdapter();
        }

        @Override
        public Adapter caseLoadAggregate( LoadAggregate object ) {
            return createLoadAggregateAdapter();
        }

        @Override
        public Adapter caseWindGenType3bIEC( WindGenType3bIEC object ) {
            return createWindGenType3bIECAdapter();
        }

        @Override
        public Adapter caseGovSteamIEEE1( GovSteamIEEE1 object ) {
            return createGovSteamIEEE1Adapter();
        }

        @Override
        public Adapter caseUnderexcitationLimiterDynamics( UnderexcitationLimiterDynamics object ) {
            return createUnderexcitationLimiterDynamicsAdapter();
        }

        @Override
        public Adapter caseGovHydroWEH( GovHydroWEH object ) {
            return createGovHydroWEHAdapter();
        }

        @Override
        public Adapter caseExcDC3A1( ExcDC3A1 object ) {
            return createExcDC3A1Adapter();
        }

        @Override
        public Adapter caseWindTurbineType1or2Dynamics( WindTurbineType1or2Dynamics object ) {
            return createWindTurbineType1or2DynamicsAdapter();
        }

        @Override
        public Adapter caseOverexcitationLimiterUserDefined( OverexcitationLimiterUserDefined object ) {
            return createOverexcitationLimiterUserDefinedAdapter();
        }

        @Override
        public Adapter caseTurbineLoadControllerUserDefined( TurbineLoadControllerUserDefined object ) {
            return createTurbineLoadControllerUserDefinedAdapter();
        }

        @Override
        public Adapter caseWindContPitchAngleIEC( WindContPitchAngleIEC object ) {
            return createWindContPitchAngleIECAdapter();
        }

        @Override
        public Adapter caseExcBBC( ExcBBC object ) {
            return createExcBBCAdapter();
        }

        @Override
        public Adapter caseOverexcLimIEEE( OverexcLimIEEE object ) {
            return createOverexcLimIEEEAdapter();
        }

        @Override
        public Adapter caseWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics object ) {
            return createWindTurbineType3or4DynamicsAdapter();
        }

        @Override
        public Adapter caseRemoteInputSignal( RemoteInputSignal object ) {
            return createRemoteInputSignalAdapter();
        }

        @Override
        public Adapter caseExcAVR1( ExcAVR1 object ) {
            return createExcAVR1Adapter();
        }

        @Override
        public Adapter caseExcAVR2( ExcAVR2 object ) {
            return createExcAVR2Adapter();
        }

        @Override
        public Adapter caseExcAVR3( ExcAVR3 object ) {
            return createExcAVR3Adapter();
        }

        @Override
        public Adapter caseExcAVR4( ExcAVR4 object ) {
            return createExcAVR4Adapter();
        }

        @Override
        public Adapter caseExcAVR5( ExcAVR5 object ) {
            return createExcAVR5Adapter();
        }

        @Override
        public Adapter caseExcAVR7( ExcAVR7 object ) {
            return createExcAVR7Adapter();
        }

        @Override
        public Adapter casePFVArType2IEEEVArController( PFVArType2IEEEVArController object ) {
            return createPFVArType2IEEEVArControllerAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC2A( ExcIEEEAC2A object ) {
            return createExcIEEEAC2AAdapter();
        }

        @Override
        public Adapter caseLoadUserDefined( LoadUserDefined object ) {
            return createLoadUserDefinedAdapter();
        }

        @Override
        public Adapter caseMechanicalLoadUserDefined( MechanicalLoadUserDefined object ) {
            return createMechanicalLoadUserDefinedAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC1A( ExcIEEEAC1A object ) {
            return createExcIEEEAC1AAdapter();
        }

        @Override
        public Adapter caseGovHydroIEEE0( GovHydroIEEE0 object ) {
            return createGovHydroIEEE0Adapter();
        }

        @Override
        public Adapter caseGovHydroIEEE2( GovHydroIEEE2 object ) {
            return createGovHydroIEEE2Adapter();
        }

        @Override
        public Adapter caseExcIEEEAC6A( ExcIEEEAC6A object ) {
            return createExcIEEEAC6AAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC5A( ExcIEEEAC5A object ) {
            return createExcIEEEAC5AAdapter();
        }

        @Override
        public Adapter caseCrossCompoundTurbineGovernorDynamics( CrossCompoundTurbineGovernorDynamics object ) {
            return createCrossCompoundTurbineGovernorDynamicsAdapter();
        }

        @Override
        public Adapter caseStaticVarCompensatorDynamics( StaticVarCompensatorDynamics object ) {
            return createStaticVarCompensatorDynamicsAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC4A( ExcIEEEAC4A object ) {
            return createExcIEEEAC4AAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC3A( ExcIEEEAC3A object ) {
            return createExcIEEEAC3AAdapter();
        }

        @Override
        public Adapter caseExcitationSystemUserDefined( ExcitationSystemUserDefined object ) {
            return createExcitationSystemUserDefinedAdapter();
        }

        @Override
        public Adapter caseWindType1or2UserDefined( WindType1or2UserDefined object ) {
            return createWindType1or2UserDefinedAdapter();
        }

        @Override
        public Adapter caseGovGAST4( GovGAST4 object ) {
            return createGovGAST4Adapter();
        }

        @Override
        public Adapter caseGovGAST3( GovGAST3 object ) {
            return createGovGAST3Adapter();
        }

        @Override
        public Adapter caseGovGAST2( GovGAST2 object ) {
            return createGovGAST2Adapter();
        }

        @Override
        public Adapter caseGovGAST1( GovGAST1 object ) {
            return createGovGAST1Adapter();
        }

        @Override
        public Adapter caseMechLoad1( MechLoad1 object ) {
            return createMechLoad1Adapter();
        }

        @Override
        public Adapter casePFVArType1IEEEVArController( PFVArType1IEEEVArController object ) {
            return createPFVArType1IEEEVArControllerAdapter();
        }

        @Override
        public Adapter caseWindContRotorRIEC( WindContRotorRIEC object ) {
            return createWindContRotorRIECAdapter();
        }

        @Override
        public Adapter casePFVArType2IEEEPFController( PFVArType2IEEEPFController object ) {
            return createPFVArType2IEEEPFControllerAdapter();
        }

        @Override
        public Adapter caseVAdjIEEE( VAdjIEEE object ) {
            return createVAdjIEEEAdapter();
        }

        @Override
        public Adapter caseSynchronousMachineEquivalentCircuit( SynchronousMachineEquivalentCircuit object ) {
            return createSynchronousMachineEquivalentCircuitAdapter();
        }

        @Override
        public Adapter caseWindPlantDynamics( WindPlantDynamics object ) {
            return createWindPlantDynamicsAdapter();
        }

        @Override
        public Adapter caseExcELIN1( ExcELIN1 object ) {
            return createExcELIN1Adapter();
        }

        @Override
        public Adapter caseExcELIN2( ExcELIN2 object ) {
            return createExcELIN2Adapter();
        }

        @Override
        public Adapter caseAsynchronousMachineUserDefined( AsynchronousMachineUserDefined object ) {
            return createAsynchronousMachineUserDefinedAdapter();
        }

        @Override
        public Adapter caseExcST4B( ExcST4B object ) {
            return createExcST4BAdapter();
        }

        @Override
        public Adapter caseExcST3A( ExcST3A object ) {
            return createExcST3AAdapter();
        }

        @Override
        public Adapter caseExcST2A( ExcST2A object ) {
            return createExcST2AAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC8B( ExcIEEEAC8B object ) {
            return createExcIEEEAC8BAdapter();
        }

        @Override
        public Adapter caseExcST1A( ExcST1A object ) {
            return createExcST1AAdapter();
        }

        @Override
        public Adapter caseExcIEEEAC7B( ExcIEEEAC7B object ) {
            return createExcIEEEAC7BAdapter();
        }

        @Override
        public Adapter caseGovSteamSGO( GovSteamSGO object ) {
            return createGovSteamSGOAdapter();
        }

        @Override
        public Adapter caseWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC object ) {
            return createWindPlantFreqPcontrolIECAdapter();
        }

        @Override
        public Adapter caseExcST7B( ExcST7B object ) {
            return createExcST7BAdapter();
        }

        @Override
        public Adapter casePowerSystemStabilizerUserDefined( PowerSystemStabilizerUserDefined object ) {
            return createPowerSystemStabilizerUserDefinedAdapter();
        }

        @Override
        public Adapter caseDynamicsFunctionBlock( DynamicsFunctionBlock object ) {
            return createDynamicsFunctionBlockAdapter();
        }

        @Override
        public Adapter caseGovHydroPID( GovHydroPID object ) {
            return createGovHydroPIDAdapter();
        }

        @Override
        public Adapter caseExcST6B( ExcST6B object ) {
            return createExcST6BAdapter();
        }

        @Override
        public Adapter caseWindContPType4bIEC( WindContPType4bIEC object ) {
            return createWindContPType4bIECAdapter();
        }

        @Override
        public Adapter caseGovHydroPelton( GovHydroPelton object ) {
            return createGovHydroPeltonAdapter();
        }

        @Override
        public Adapter caseVSCDynamics( VSCDynamics object ) {
            return createVSCDynamicsAdapter();
        }

        @Override
        public Adapter caseLoadDynamics( LoadDynamics object ) {
            return createLoadDynamicsAdapter();
        }

        @Override
        public Adapter casePssELIN2( PssELIN2 object ) {
            return createPssELIN2Adapter();
        }

        @Override
        public Adapter caseSynchronousMachineTimeConstantReactance( SynchronousMachineTimeConstantReactance object ) {
            return createSynchronousMachineTimeConstantReactanceAdapter();
        }

        @Override
        public Adapter caseGovCT1( GovCT1 object ) {
            return createGovCT1Adapter();
        }

        @Override
        public Adapter caseGovCT2( GovCT2 object ) {
            return createGovCT2Adapter();
        }

        @Override
        public Adapter caseExcIEEEDC1A( ExcIEEEDC1A object ) {
            return createExcIEEEDC1AAdapter();
        }

        @Override
        public Adapter caseWindContQPQULimIEC( WindContQPQULimIEC object ) {
            return createWindContQPQULimIECAdapter();
        }

        @Override
        public Adapter caseExcIEEEDC4B( ExcIEEEDC4B object ) {
            return createExcIEEEDC4BAdapter();
        }

        @Override
        public Adapter caseExcIEEEDC3A( ExcIEEEDC3A object ) {
            return createExcIEEEDC3AAdapter();
        }

        @Override
        public Adapter caseExcIEEEDC2A( ExcIEEEDC2A object ) {
            return createExcIEEEDC2AAdapter();
        }

        @Override
        public Adapter caseCSCUserDefined( CSCUserDefined object ) {
            return createCSCUserDefinedAdapter();
        }

        @Override
        public Adapter caseLoadStatic( LoadStatic object ) {
            return createLoadStaticAdapter();
        }

        @Override
        public Adapter caseWindAeroTwoDimIEC( WindAeroTwoDimIEC object ) {
            return createWindAeroTwoDimIECAdapter();
        }

        @Override
        public Adapter caseWindContCurrLimIEC( WindContCurrLimIEC object ) {
            return createWindContCurrLimIECAdapter();
        }

        @Override
        public Adapter casePssPTIST1( PssPTIST1 object ) {
            return createPssPTIST1Adapter();
        }

        @Override
        public Adapter casePssPTIST3( PssPTIST3 object ) {
            return createPssPTIST3Adapter();
        }

        @Override
        public Adapter caseGovHydroWPID( GovHydroWPID object ) {
            return createGovHydroWPIDAdapter();
        }

        @Override
        public Adapter casePFVArControllerType1Dynamics( PFVArControllerType1Dynamics object ) {
            return createPFVArControllerType1DynamicsAdapter();
        }

        @Override
        public Adapter caseWindContQLimIEC( WindContQLimIEC object ) {
            return createWindContQLimIECAdapter();
        }

        @Override
        public Adapter caseVoltageCompensatorDynamics( VoltageCompensatorDynamics object ) {
            return createVoltageCompensatorDynamicsAdapter();
        }

        @Override
        public Adapter caseSynchronousMachineUserDefined( SynchronousMachineUserDefined object ) {
            return createSynchronousMachineUserDefinedAdapter();
        }

        @Override
        public Adapter caseGenICompensationForGenJ( GenICompensationForGenJ object ) {
            return createGenICompensationForGenJAdapter();
        }

        @Override
        public Adapter caseExcREXS( ExcREXS object ) {
            return createExcREXSAdapter();
        }

        @Override
        public Adapter caseAsynchronousMachineDynamics( AsynchronousMachineDynamics object ) {
            return createAsynchronousMachineDynamicsAdapter();
        }

        @Override
        public Adapter casePFVArType2Common1( PFVArType2Common1 object ) {
            return createPFVArType2Common1Adapter();
        }

        @Override
        public Adapter caseWindAeroConstIEC( WindAeroConstIEC object ) {
            return createWindAeroConstIECAdapter();
        }

        @Override
        public Adapter caseHVDCDynamics( HVDCDynamics object ) {
            return createHVDCDynamicsAdapter();
        }

        @Override
        public Adapter caseTurbineGovernorUserDefined( TurbineGovernorUserDefined object ) {
            return createTurbineGovernorUserDefinedAdapter();
        }

        @Override
        public Adapter casePFVArType1IEEEPFController( PFVArType1IEEEPFController object ) {
            return createPFVArType1IEEEPFControllerAdapter();
        }

        @Override
        public Adapter caseExcDC3A( ExcDC3A object ) {
            return createExcDC3AAdapter();
        }

        @Override
        public Adapter casePss2B( Pss2B object ) {
            return createPss2BAdapter();
        }

        @Override
        public Adapter caseExcDC2A( ExcDC2A object ) {
            return createExcDC2AAdapter();
        }

        @Override
        public Adapter caseWindPlantReactiveControlIEC( WindPlantReactiveControlIEC object ) {
            return createWindPlantReactiveControlIECAdapter();
        }

        @Override
        public Adapter caseGovSteamCC( GovSteamCC object ) {
            return createGovSteamCCAdapter();
        }

        @Override
        public Adapter caseExcDC1A( ExcDC1A object ) {
            return createExcDC1AAdapter();
        }

        @Override
        public Adapter caseOverexcLim2( OverexcLim2 object ) {
            return createOverexcLim2Adapter();
        }

        @Override
        public Adapter caseGovSteamEU( GovSteamEU object ) {
            return createGovSteamEUAdapter();
        }

        @Override
        public Adapter caseWindDynamicsLookupTable( WindDynamicsLookupTable object ) {
            return createWindDynamicsLookupTableAdapter();
        }

        @Override
        public Adapter casePss1A( Pss1A object ) {
            return createPss1AAdapter();
        }

        @Override
        public Adapter caseVoltageAdjusterUserDefined( VoltageAdjusterUserDefined object ) {
            return createVoltageAdjusterUserDefinedAdapter();
        }

        @Override
        public Adapter caseSynchronousMachineDynamics( SynchronousMachineDynamics object ) {
            return createSynchronousMachineDynamicsAdapter();
        }

        @Override
        public Adapter caseGovSteamBB( GovSteamBB object ) {
            return createGovSteamBBAdapter();
        }

        @Override
        public Adapter caseUnderexcLimX2( UnderexcLimX2 object ) {
            return createUnderexcLimX2Adapter();
        }

        @Override
        public Adapter caseUnderexcLimX1( UnderexcLimX1 object ) {
            return createUnderexcLimX1Adapter();
        }

        @Override
        public Adapter caseWindGenType4IEC( WindGenType4IEC object ) {
            return createWindGenType4IECAdapter();
        }

        @Override
        public Adapter casePFVArControllerType1UserDefined( PFVArControllerType1UserDefined object ) {
            return createPFVArControllerType1UserDefinedAdapter();
        }

        @Override
        public Adapter caseExcOEX3T( ExcOEX3T object ) {
            return createExcOEX3TAdapter();
        }

        @Override
        public Adapter caseWindGenTurbineType1bIEC( WindGenTurbineType1bIEC object ) {
            return createWindGenTurbineType1bIECAdapter();
        }

        @Override
        public Adapter casePssSB4( PssSB4 object ) {
            return createPssSB4Adapter();
        }

        @Override
        public Adapter caseLoadComposite( LoadComposite object ) {
            return createLoadCompositeAdapter();
        }

        @Override
        public Adapter caseExcSEXS( ExcSEXS object ) {
            return createExcSEXSAdapter();
        }

        @Override
        public Adapter caseWindContPType4aIEC( WindContPType4aIEC object ) {
            return createWindContPType4aIECAdapter();
        }

        @Override
        public Adapter caseExcAC4A( ExcAC4A object ) {
            return createExcAC4AAdapter();
        }

        @Override
        public Adapter caseExcitationSystemDynamics( ExcitationSystemDynamics object ) {
            return createExcitationSystemDynamicsAdapter();
        }

        @Override
        public Adapter caseExcAC3A( ExcAC3A object ) {
            return createExcAC3AAdapter();
        }

        @Override
        public Adapter caseExcAC2A( ExcAC2A object ) {
            return createExcAC2AAdapter();
        }

        @Override
        public Adapter caseExcAC1A( ExcAC1A object ) {
            return createExcAC1AAdapter();
        }

        @Override
        public Adapter caseExcAC8B( ExcAC8B object ) {
            return createExcAC8BAdapter();
        }

        @Override
        public Adapter caseExcIEEEST7B( ExcIEEEST7B object ) {
            return createExcIEEEST7BAdapter();
        }

        @Override
        public Adapter casePssRQB( PssRQB object ) {
            return createPssRQBAdapter();
        }

        @Override
        public Adapter caseVCompIEEEType1( VCompIEEEType1 object ) {
            return createVCompIEEEType1Adapter();
        }

        @Override
        public Adapter caseExcAC6A( ExcAC6A object ) {
            return createExcAC6AAdapter();
        }

        @Override
        public Adapter caseVCompIEEEType2( VCompIEEEType2 object ) {
            return createVCompIEEEType2Adapter();
        }

        @Override
        public Adapter caseExcAC5A( ExcAC5A object ) {
            return createExcAC5AAdapter();
        }

        @Override
        public Adapter caseWindMechIEC( WindMechIEC object ) {
            return createWindMechIECAdapter();
        }

        @Override
        public Adapter caseOverexcLimX1( OverexcLimX1 object ) {
            return createOverexcLimX1Adapter();
        }

        @Override
        public Adapter caseOverexcLimX2( OverexcLimX2 object ) {
            return createOverexcLimX2Adapter();
        }

        @Override
        public Adapter caseUnderexcLimIEEE2( UnderexcLimIEEE2 object ) {
            return createUnderexcLimIEEE2Adapter();
        }

        @Override
        public Adapter caseUnderexcLimIEEE1( UnderexcLimIEEE1 object ) {
            return createUnderexcLimIEEE1Adapter();
        }

        @Override
        public Adapter caseExcIEEEST3A( ExcIEEEST3A object ) {
            return createExcIEEEST3AAdapter();
        }

        @Override
        public Adapter casePssSH( PssSH object ) {
            return createPssSHAdapter();
        }

        @Override
        public Adapter caseGovHydroDD( GovHydroDD object ) {
            return createGovHydroDDAdapter();
        }

        @Override
        public Adapter casePssSK( PssSK object ) {
            return createPssSKAdapter();
        }

        @Override
        public Adapter caseExcIEEEST4B( ExcIEEEST4B object ) {
            return createExcIEEEST4BAdapter();
        }

        @Override
        public Adapter caseWindTurbineType4aIEC( WindTurbineType4aIEC object ) {
            return createWindTurbineType4aIECAdapter();
        }

        @Override
        public Adapter caseExcIEEEST5B( ExcIEEEST5B object ) {
            return createExcIEEEST5BAdapter();
        }

        @Override
        public Adapter caseExcIEEEST6B( ExcIEEEST6B object ) {
            return createExcIEEEST6BAdapter();
        }

        @Override
        public Adapter caseGovSteamFV4( GovSteamFV4 object ) {
            return createGovSteamFV4Adapter();
        }

        @Override
        public Adapter caseGovSteamFV3( GovSteamFV3 object ) {
            return createGovSteamFV3Adapter();
        }

        @Override
        public Adapter caseGovSteamFV2( GovSteamFV2 object ) {
            return createGovSteamFV2Adapter();
        }

        @Override
        public Adapter casePowerSystemStabilizerDynamics( PowerSystemStabilizerDynamics object ) {
            return createPowerSystemStabilizerDynamicsAdapter();
        }

        @Override
        public Adapter caseDiscExcContIEEEDEC1A( DiscExcContIEEEDEC1A object ) {
            return createDiscExcContIEEEDEC1AAdapter();
        }

        @Override
        public Adapter caseWindTurbineType3IEC( WindTurbineType3IEC object ) {
            return createWindTurbineType3IECAdapter();
        }

        @Override
        public Adapter caseWindPlantUserDefined( WindPlantUserDefined object ) {
            return createWindPlantUserDefinedAdapter();
        }

        @Override
        public Adapter caseDiscExcContIEEEDEC3A( DiscExcContIEEEDEC3A object ) {
            return createDiscExcContIEEEDEC3AAdapter();
        }

        @Override
        public Adapter caseDiscExcContIEEEDEC2A( DiscExcContIEEEDEC2A object ) {
            return createDiscExcContIEEEDEC2AAdapter();
        }

        @Override
        public Adapter caseWindTurbineType3or4IEC( WindTurbineType3or4IEC object ) {
            return createWindTurbineType3or4IECAdapter();
        }

        @Override
        public Adapter caseSVCUserDefined( SVCUserDefined object ) {
            return createSVCUserDefinedAdapter();
        }

        @Override
        public Adapter caseTurbLCFB1( TurbLCFB1 object ) {
            return createTurbLCFB1Adapter();
        }

        @Override
        public Adapter caseStreetAddress( StreetAddress object ) {
            return createStreetAddressAdapter();
        }

        @Override
        public Adapter caseStatus( Status object ) {
            return createStatusAdapter();
        }

        @Override
        public Adapter caseServiceLocation( ServiceLocation object ) {
            return createServiceLocationAdapter();
        }

        @Override
        public Adapter caseCoordinateSystem( CoordinateSystem object ) {
            return createCoordinateSystemAdapter();
        }

        @Override
        public Adapter casePositionPoint( PositionPoint object ) {
            return createPositionPointAdapter();
        }

        @Override
        public Adapter caseStreetDetail( StreetDetail object ) {
            return createStreetDetailAdapter();
        }

        @Override
        public Adapter caseWorkLocation( WorkLocation object ) {
            return createWorkLocationAdapter();
        }

        @Override
        public Adapter caseTownDetail( TownDetail object ) {
            return createTownDetailAdapter();
        }

        @Override
        public Adapter caseLocation( Location object ) {
            return createLocationAdapter();
        }

        @Override
        public Adapter caseAnalogValue( AnalogValue object ) {
            return createAnalogValueAdapter();
        }

        @Override
        public Adapter caseCommand( Command object ) {
            return createCommandAdapter();
        }

        @Override
        public Adapter caseDiscreteValue( DiscreteValue object ) {
            return createDiscreteValueAdapter();
        }

        @Override
        public Adapter caseMeasurementValueQuality( MeasurementValueQuality object ) {
            return createMeasurementValueQualityAdapter();
        }

        @Override
        public Adapter caseAnalogLimitSet( AnalogLimitSet object ) {
            return createAnalogLimitSetAdapter();
        }

        @Override
        public Adapter caseLimit( Limit object ) {
            return createLimitAdapter();
        }

        @Override
        public Adapter caseAnalogControl( AnalogControl object ) {
            return createAnalogControlAdapter();
        }

        @Override
        public Adapter caseStringMeasurementValue( StringMeasurementValue object ) {
            return createStringMeasurementValueAdapter();
        }

        @Override
        public Adapter caseAccumulatorValue( AccumulatorValue object ) {
            return createAccumulatorValueAdapter();
        }

        @Override
        public Adapter caseSetPoint( SetPoint object ) {
            return createSetPointAdapter();
        }

        @Override
        public Adapter caseAnalog( Analog object ) {
            return createAnalogAdapter();
        }

        @Override
        public Adapter caseMeasurementValueSource( MeasurementValueSource object ) {
            return createMeasurementValueSourceAdapter();
        }

        @Override
        public Adapter caseMeasurementValue( MeasurementValue object ) {
            return createMeasurementValueAdapter();
        }

        @Override
        public Adapter caseQuality61850( Quality61850 object ) {
            return createQuality61850Adapter();
        }

        @Override
        public Adapter caseLimitSet( LimitSet object ) {
            return createLimitSetAdapter();
        }

        @Override
        public Adapter caseAccumulatorLimit( AccumulatorLimit object ) {
            return createAccumulatorLimitAdapter();
        }

        @Override
        public Adapter caseMeasurement( Measurement object ) {
            return createMeasurementAdapter();
        }

        @Override
        public Adapter caseValueAliasSet( ValueAliasSet object ) {
            return createValueAliasSetAdapter();
        }

        @Override
        public Adapter caseAccumulator( Accumulator object ) {
            return createAccumulatorAdapter();
        }

        @Override
        public Adapter caseAccumulatorLimitSet( AccumulatorLimitSet object ) {
            return createAccumulatorLimitSetAdapter();
        }

        @Override
        public Adapter caseValueToAlias( ValueToAlias object ) {
            return createValueToAliasAdapter();
        }

        @Override
        public Adapter caseDiscrete( Discrete object ) {
            return createDiscreteAdapter();
        }

        @Override
        public Adapter caseRaiseLowerCommand( RaiseLowerCommand object ) {
            return createRaiseLowerCommandAdapter();
        }

        @Override
        public Adapter caseIOPoint( IOPoint object ) {
            return createIOPointAdapter();
        }

        @Override
        public Adapter caseAccumulatorReset( AccumulatorReset object ) {
            return createAccumulatorResetAdapter();
        }

        @Override
        public Adapter caseAnalogLimit( AnalogLimit object ) {
            return createAnalogLimitAdapter();
        }

        @Override
        public Adapter caseStringMeasurement( StringMeasurement object ) {
            return createStringMeasurementAdapter();
        }

        @Override
        public Adapter caseControl( Control object ) {
            return createControlAdapter();
        }

        @Override
        public Adapter caseMutualCoupling( MutualCoupling object ) {
            return createMutualCouplingAdapter();
        }

        @Override
        public Adapter caseSvTapStep( SvTapStep object ) {
            return createSvTapStepAdapter();
        }

        @Override
        public Adapter caseTopologicalIsland( TopologicalIsland object ) {
            return createTopologicalIslandAdapter();
        }

        @Override
        public Adapter caseSvSwitch( SvSwitch object ) {
            return createSvSwitchAdapter();
        }

        @Override
        public Adapter caseSvPowerFlow( SvPowerFlow object ) {
            return createSvPowerFlowAdapter();
        }

        @Override
        public Adapter caseSvShuntCompensatorSections( SvShuntCompensatorSections object ) {
            return createSvShuntCompensatorSectionsAdapter();
        }

        @Override
        public Adapter caseSvVoltage( SvVoltage object ) {
            return createSvVoltageAdapter();
        }

        @Override
        public Adapter caseDCTopologicalIsland( DCTopologicalIsland object ) {
            return createDCTopologicalIslandAdapter();
        }

        @Override
        public Adapter caseTopologicalNode( TopologicalNode object ) {
            return createTopologicalNodeAdapter();
        }

        @Override
        public Adapter caseSvStatus( SvStatus object ) {
            return createSvStatusAdapter();
        }

        @Override
        public Adapter caseSvInjection( SvInjection object ) {
            return createSvInjectionAdapter();
        }

        @Override
        public Adapter caseDCTopologicalNode( DCTopologicalNode object ) {
            return createDCTopologicalNodeAdapter();
        }

        @Override
        public Adapter defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter( Notifier target ) {
        return modelSwitch.doSwitch( ( EObject ) target );
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID <em>Object With ID</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID
     * @generated
     */
    public Adapter createCimObjectWithIDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection <em>Equivalent Injection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection
     * @generated
     */
    public Adapter createEquivalentInjectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant <em>Hydro Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant
     * @generated
     */
    public Adapter createHydroPowerPlantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource <em>Energy Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource
     * @generated
     */
    public Adapter createEnergySourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule <em>Tap Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule
     * @generated
     */
    public Adapter createTapScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice <em>DC Series Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice
     * @generated
     */
    public Adapter createDCSeriesDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection <em>External Network Injection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection
     * @generated
     */
    public Adapter createExternalNetworkInjectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit <em>Operational Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit
     * @generated
     */
    public Adapter createOperationalLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger <em>Ratio Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger
     * @generated
     */
    public Adapter createRatioTapChangerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup
     * @generated
     */
    public Adapter createReportingGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData <em>Curve Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData
     * @generated
     */
    public Adapter createCurveDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensator
     * @generated
     */
    public Adapter createNonlinearShuntCompensatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer
     * @generated
     */
    public Adapter createConnectivityNodeContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule <em>Conform Load Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadSchedule
     * @generated
     */
    public Adapter createConformLoadScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment <em>DC Line Segment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment
     * @generated
     */
    public Adapter createDCLineSegmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerSymmetrical <em>Phase Tap Changer Symmetrical</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerSymmetrical
     * @generated
     */
    public Adapter createPhaseTapChangerSymmetricalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit <em>Battery Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit
     * @generated
     */
    public Adapter createBatteryUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable <em>Ratio Tap Changer Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable
     * @generated
     */
    public Adapter createRatioTapChangerTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePowerLimit <em>Active Power Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePowerLimit
     * @generated
     */
    public Adapter createActivePowerLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTable <em>Phase Tap Changer Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTable
     * @generated
     */
    public Adapter createPhaseTapChangerTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea <em>Energy Area</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea
     * @generated
     */
    public Adapter createEnergyAreaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GroundDisconnector <em>Ground Disconnector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GroundDisconnector
     * @generated
     */
    public Adapter createGroundDisconnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal <em>DC Base Terminal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal
     * @generated
     */
    public Adapter createDCBaseTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve
     * @generated
     */
    public Adapter createReactiveCapabilityCurveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBusbar <em>DC Busbar</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBusbar
     * @generated
     */
    public Adapter createDCBusbarAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType <em>Day Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DayType
     * @generated
     */
    public Adapter createDayTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule <em>Switch Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule
     * @generated
     */
    public Adapter createSwitchScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBreaker <em>DC Breaker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBreaker
     * @generated
     */
    public Adapter createDCBreakerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow <em>Tie Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow
     * @generated
     */
    public Adapter createTieFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGroup <em>Load Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGroup
     * @generated
     */
    public Adapter createLoadGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer <em>Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer
     * @generated
     */
    public Adapter createEquipmentContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StationSupply <em>Station Supply</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StationSupply
     * @generated
     */
    public Adapter createStationSupplyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment <em>AC Line Segment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment
     * @generated
     */
    public Adapter createACLineSegmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Ground <em>Ground</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Ground
     * @generated
     */
    public Adapter createGroundAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut <em>Cut</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut
     * @generated
     */
    public Adapter createCutAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant <em>Cogeneration Plant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant
     * @generated
     */
    public Adapter createCogenerationPlantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SurgeArrester <em>Surge Arrester</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SurgeArrester
     * @generated
     */
    public Adapter createSurgeArresterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch <em>Equivalent Branch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch
     * @generated
     */
    public Adapter createEquivalentBranchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump <em>Hydro Pump</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump
     * @generated
     */
    public Adapter createHydroPumpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup <em>Conform Load Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup
     * @generated
     */
    public Adapter createConformLoadGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad <em>Non Conform Load</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad
     * @generated
     */
    public Adapter createNonConformLoadAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CAESPlant <em>CAES Plant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CAESPlant
     * @generated
     */
    public Adapter createCAESPlantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Breaker <em>Breaker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Breaker
     * @generated
     */
    public Adapter createBreakerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GroundingImpedance <em>Grounding Impedance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GroundingImpedance
     * @generated
     */
    public Adapter createGroundingImpedanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType <em>Operational Limit Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType
     * @generated
     */
    public Adapter createOperationalLimitTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit
     * @generated
     */
    public Adapter createControlAreaGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker <em>Bus Name Marker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker
     * @generated
     */
    public Adapter createBusNameMarkerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator <em>Static Var Compensator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator
     * @generated
     */
    public Adapter createStaticVarCompensatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductor <em>Conductor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductor
     * @generated
     */
    public Adapter createConductorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine <em>DC Line</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine
     * @generated
     */
    public Adapter createDCLineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTabular
     * @generated
     */
    public Adapter createPhaseTapChangerTabularAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment <em>Equipment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment
     * @generated
     */
    public Adapter createEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCChopper <em>DC Chopper</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCChopper
     * @generated
     */
    public Adapter createDCChopperAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl <em>Tap Changer Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl
     * @generated
     */
    public Adapter createTapChangerControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EarthFaultCompensator <em>Earth Fault Compensator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EarthFaultCompensator
     * @generated
     */
    public Adapter createEarthFaultCompensatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FaultIndicator <em>Fault Indicator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FaultIndicator
     * @generated
     */
    public Adapter createFaultIndicatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit <em>DC Converter Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit
     * @generated
     */
    public Adapter createDCConverterUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve <em>Curve</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve
     * @generated
     */
    public Adapter createCurveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter <em>Vs Converter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter
     * @generated
     */
    public Adapter createVsConverterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroGeneratingUnit
     * @generated
     */
    public Adapter createHydroGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule <em>Regulation Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule
     * @generated
     */
    public Adapter createRegulationScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConnection <em>Energy Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConnection
     * @generated
     */
    public Adapter createEnergyConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment <em>Equivalent Equipment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment
     * @generated
     */
    public Adapter createEquivalentEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel <em>Fossil Fuel</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel
     * @generated
     */
    public Adapter createFossilFuelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadArea <em>Load Area</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadArea
     * @generated
     */
    public Adapter createLoadAreaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CombinedCyclePlant <em>Combined Cycle Plant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CombinedCyclePlant
     * @generated
     */
    public Adapter createCombinedCyclePlantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment
     * @generated
     */
    public Adapter createConductingEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp <em>Clamp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp
     * @generated
     */
    public Adapter createClampAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ApparentPowerLimit
     * @generated
     */
    public Adapter createApparentPowerLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NuclearGeneratingUnit <em>Nuclear Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NuclearGeneratingUnit
     * @generated
     */
    public Adapter createNuclearGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil <em>Petersen Coil</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil
     * @generated
     */
    public Adapter createPetersenCoilAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic <em>Load Response Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic
     * @generated
     */
    public Adapter createLoadResponseCharacteristicAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd <em>Power Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd
     * @generated
     */
    public Adapter createPowerTransformerEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal
     * @generated
     */
    public Adapter createTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay <em>Bay</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay
     * @generated
     */
    public Adapter createBayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl
     * @generated
     */
    public Adapter createRegulatingControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator <em>Series Compensator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeriesCompensator
     * @generated
     */
    public Adapter createSeriesCompensatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProtectedSwitch <em>Protected Switch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProtectedSwitch
     * @generated
     */
    public Adapter createProtectedSwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerTablePoint <em>Tap Changer Table Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerTablePoint
     * @generated
     */
    public Adapter createTapChangerTablePointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusbarSection <em>Busbar Section</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusbarSection
     * @generated
     */
    public Adapter createBusbarSectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhotoVoltaicUnit <em>Photo Voltaic Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhotoVoltaicUnit
     * @generated
     */
    public Adapter createPhotoVoltaicUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Line <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Line
     * @generated
     */
    public Adapter createLineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season <em>Season</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Season
     * @generated
     */
    public Adapter createSeasonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule
     * @generated
     */
    public Adapter createRegularIntervalScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup
     * @generated
     */
    public Adapter createNonConformLoadGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet <em>Operational Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet
     * @generated
     */
    public Adapter createOperationalLimitSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger <em>Phase Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger
     * @generated
     */
    public Adapter createPhaseTapChangerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer <em>DC Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer
     * @generated
     */
    public Adapter createDCEquipmentContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerAsymmetrical <em>Phase Tap Changer Asymmetrical</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerAsymmetrical
     * @generated
     */
    public Adapter createPhaseTapChangerAsymmetricalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode
     * @generated
     */
    public Adapter createConnectivityNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Sensor <em>Sensor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Sensor
     * @generated
     */
    public Adapter createSensorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadBreakSwitch <em>Load Break Switch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadBreakSwitch
     * @generated
     */
    public Adapter createLoadBreakSwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SeasonDayTypeSchedule
     * @generated
     */
    public Adapter createSeasonDayTypeScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DisconnectingCircuitBreaker <em>Disconnecting Circuit Breaker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DisconnectingCircuitBreaker
     * @generated
     */
    public Adapter createDisconnectingCircuitBreakerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSwitch <em>DC Switch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSwitch
     * @generated
     */
    public Adapter createDCSwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Disconnector <em>Disconnector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Disconnector
     * @generated
     */
    public Adapter createDisconnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode <em>DC Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode
     * @generated
     */
    public Adapter createDCNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit <em>Solar Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SolarGeneratingUnit
     * @generated
     */
    public Adapter createSolarGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation
     * @generated
     */
    public Adapter createSubstationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint <em>Nonlinear Shunt Compensator Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint
     * @generated
     */
    public Adapter createNonlinearShuntCompensatorPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject <em>Identified Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject
     * @generated
     */
    public Adapter createIdentifiedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource
     * @generated
     */
    public Adapter createPowerSystemResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion <em>Sub Geographical Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion
     * @generated
     */
    public Adapter createSubGeographicalRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit
     * @generated
     */
    public Adapter createThermalGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PotentialTransformer <em>Potential Transformer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PotentialTransformer
     * @generated
     */
    public Adapter createPotentialTransformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve <em>Vs Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve
     * @generated
     */
    public Adapter createVsCapabilityCurveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCGround <em>DC Ground</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCGround
     * @generated
     */
    public Adapter createDCGroundAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq
     * @generated
     */
    public Adapter createRegulatingCondEqAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer <em>Energy Consumer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer
     * @generated
     */
    public Adapter createEnergyConsumerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion <em>Geographical Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion
     * @generated
     */
    public Adapter createGeographicalRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork <em>Equivalent Network</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork
     * @generated
     */
    public Adapter createEquivalentNetworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GrossToNetActivePowerCurve
     * @generated
     */
    public Adapter createGrossToNetActivePowerCurveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage <em>Base Voltage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage
     * @generated
     */
    public Adapter createBaseVoltageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt <em>DC Shunt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt
     * @generated
     */
    public Adapter createDCShuntAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter <em>Cs Converter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter
     * @generated
     */
    public Adapter createCsConverterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment <em>DC Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment
     * @generated
     */
    public Adapter createDCConductingEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Jumper <em>Jumper</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Jumper
     * @generated
     */
    public Adapter createJumperAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentLimit <em>Current Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentLimit
     * @generated
     */
    public Adapter createCurrentLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd
     * @generated
     */
    public Adapter createTransformerEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadSchedule
     * @generated
     */
    public Adapter createNonConformLoadScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine <em>Rotating Machine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine
     * @generated
     */
    public Adapter createRotatingMachineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType <em>Energy Scheduling Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType
     * @generated
     */
    public Adapter createEnergySchedulingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear <em>Phase Tap Changer Linear</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear
     * @generated
     */
    public Adapter createPhaseTapChangerLinearAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule
     * @generated
     */
    public Adapter createBasicIntervalScheduleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal <em>ACDC Converter DC Terminal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal
     * @generated
     */
    public Adapter createACDCConverterDCTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentTransformer <em>Current Transformer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentTransformer
     * @generated
     */
    public Adapter createCurrentTransformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsWindUnit <em>Power Electronics Wind Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsWindUnit
     * @generated
     */
    public Adapter createPowerElectronicsWindUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer
     * @generated
     */
    public Adapter createPowerTransformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WaveTrap <em>Wave Trap</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WaveTrap
     * @generated
     */
    public Adapter createWaveTrapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentShunt <em>Equivalent Shunt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentShunt
     * @generated
     */
    public Adapter createEquivalentShuntAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator <em>Linear Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator
     * @generated
     */
    public Adapter createLinearShuntCompensatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea
     * @generated
     */
    public Adapter createControlAreaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine <em>Synchronous Machine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine
     * @generated
     */
    public Adapter createSynchronousMachineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AuxiliaryEquipment <em>Auxiliary Equipment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AuxiliaryEquipment
     * @generated
     */
    public Adapter createAuxiliaryEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel
     * @generated
     */
    public Adapter createVoltageLevelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger
     * @generated
     */
    public Adapter createTapChangerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad <em>Conform Load</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad
     * @generated
     */
    public Adapter createConformLoadAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTablePoint <em>Ratio Tap Changer Table Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTablePoint
     * @generated
     */
    public Adapter createRatioTapChangerTablePointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal <em>DC Terminal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal
     * @generated
     */
    public Adapter createDCTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PostLineSensor <em>Post Line Sensor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PostLineSensor
     * @generated
     */
    public Adapter createPostLineSensorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit
     * @generated
     */
    public Adapter createGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit <em>Wind Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit
     * @generated
     */
    public Adapter createWindGeneratingUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Junction <em>Junction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Junction
     * @generated
     */
    public Adapter createJunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsUnit <em>Power Electronics Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsUnit
     * @generated
     */
    public Adapter createPowerElectronicsUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint <em>Regular Time Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint
     * @generated
     */
    public Adapter createRegularTimePointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection <em>Power Electronics Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection
     * @generated
     */
    public Adapter createPowerElectronicsConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter <em>ACDC Converter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter
     * @generated
     */
    public Adapter createACDCConverterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch
     * @generated
     */
    public Adapter createSwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCDisconnector <em>DC Disconnector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCDisconnector
     * @generated
     */
    public Adapter createDCDisconnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal <em>ACDC Terminal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal
     * @generated
     */
    public Adapter createACDCTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea <em>Sub Load Area</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea
     * @generated
     */
    public Adapter createSubLoadAreaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear <em>Phase Tap Changer Non Linear</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear
     * @generated
     */
    public Adapter createPhaseTapChangerNonLinearAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLimit <em>Voltage Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLimit
     * @generated
     */
    public Adapter createVoltageLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Fuse <em>Fuse</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Fuse
     * @generated
     */
    public Adapter createFuseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine <em>Asynchronous Machine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine
     * @generated
     */
    public Adapter createAsynchronousMachineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint <em>Phase Tap Changer Table Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint
     * @generated
     */
    public Adapter createPhaseTapChangerTablePointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator <em>Shunt Compensator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator
     * @generated
     */
    public Adapter createShuntCompensatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer <em>Visibility Layer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer
     * @generated
     */
    public Adapter createVisibilityLayerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint <em>Diagram Object Glue Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint
     * @generated
     */
    public Adapter createDiagramObjectGluePointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle <em>Diagram Object Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle
     * @generated
     */
    public Adapter createDiagramObjectStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TextDiagramObject <em>Text Diagram Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TextDiagramObject
     * @generated
     */
    public Adapter createTextDiagramObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject <em>Diagram Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject
     * @generated
     */
    public Adapter createDiagramObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle <em>Diagram Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle
     * @generated
     */
    public Adapter createDiagramStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint <em>Diagram Object Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint
     * @generated
     */
    public Adapter createDiagramObjectPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterUserDefined <em>Underexcitation Limiter User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterUserDefined
     * @generated
     */
    public Adapter createUnderexcitationLimiterUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B <em>Pss IEEE3B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B
     * @generated
     */
    public Adapter createPssIEEE3BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B <em>Pss IEEE2B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B
     * @generated
     */
    public Adapter createPssIEEE2BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlUserDefined <em>Discontinuous Excitation Control User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlUserDefined
     * @generated
     */
    public Adapter createDiscontinuousExcitationControlUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcPIC <em>Exc PIC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcPIC
     * @generated
     */
    public Adapter createExcPICAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B <em>Pss IEEE4B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B
     * @generated
     */
    public Adapter createPssIEEE4BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics
     * @generated
     */
    public Adapter createDiscontinuousExcitationControlDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE1A <em>Pss IEEE1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE1A
     * @generated
     */
    public Adapter createPssIEEE1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCUserDefined <em>VSC User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCUserDefined
     * @generated
     */
    public Adapter createVSCUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST <em>Gov GAST</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST
     * @generated
     */
    public Adapter createGovGASTAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssWECC <em>Pss WECC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssWECC
     * @generated
     */
    public Adapter createPssWECCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC
     * @generated
     */
    public Adapter createWindAeroOneDimIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineSimplified <em>Synchronous Machine Simplified</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineSimplified
     * @generated
     */
    public Adapter createSynchronousMachineSimplifiedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit <em>Asynchronous Machine Equivalent Circuit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit
     * @generated
     */
    public Adapter createAsynchronousMachineEquivalentCircuitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST1A <em>Exc IEEEST1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST1A
     * @generated
     */
    public Adapter createExcIEEEST1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics
     * @generated
     */
    public Adapter createTurbineLoadControllerDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed <em>Synchronous Machine Detailed</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed
     * @generated
     */
    public Adapter createSynchronousMachineDetailedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST2A <em>Exc IEEEST2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST2A
     * @generated
     */
    public Adapter createExcIEEEST2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU <em>Exc HU</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU
     * @generated
     */
    public Adapter createExcHUAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcCZ <em>Exc CZ</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcCZ
     * @generated
     */
    public Adapter createExcCZAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics
     * @generated
     */
    public Adapter createMechanicalLoadDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST <em>Pss2 ST</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST
     * @generated
     */
    public Adapter createPss2STAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSCRX <em>Exc SCRX</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSCRX
     * @generated
     */
    public Adapter createExcSCRXAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGASTWD <em>Gov GASTWD</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGASTWD
     * @generated
     */
    public Adapter createGovGASTWDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType3or4UserDefined <em>Wind Type3or4 User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType3or4UserDefined
     * @generated
     */
    public Adapter createWindType3or4UserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro1 <em>Gov Hydro1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro1
     * @generated
     */
    public Adapter createGovHydro1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro2 <em>Gov Hydro2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro2
     * @generated
     */
    public Adapter createGovHydro2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro3 <em>Gov Hydro3</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro3
     * @generated
     */
    public Adapter createGovHydro3Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4 <em>Gov Hydro4</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4
     * @generated
     */
    public Adapter createGovHydro4Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics
     * @generated
     */
    public Adapter createProprietaryParameterDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcNI <em>Exc NI</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcNI
     * @generated
     */
    public Adapter createExcNIAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4IEC
     * @generated
     */
    public Adapter createWindTurbineType4IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam2 <em>Gov Steam2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam2
     * @generated
     */
    public Adapter createGovSteam2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1 <em>Gov Steam1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1
     * @generated
     */
    public Adapter createGovSteam1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam0 <em>Gov Steam0</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam0
     * @generated
     */
    public Adapter createGovSteam0Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroR <em>Gov Hydro R</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroR
     * @generated
     */
    public Adapter createGovHydroRAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics
     * @generated
     */
    public Adapter createTurbineGovernorDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor <em>Load Motor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor
     * @generated
     */
    public Adapter createLoadMotorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC <em>Wind Cont QIEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC
     * @generated
     */
    public Adapter createWindContQIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC <em>Wind Gen Type3a IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC
     * @generated
     */
    public Adapter createWindGenType3aIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK <em>Exc SK</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK
     * @generated
     */
    public Adapter createExcSKAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics <em>Rotating Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics
     * @generated
     */
    public Adapter createRotatingMachineDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterDynamics <em>Voltage Adjuster Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterDynamics
     * @generated
     */
    public Adapter createVoltageAdjusterDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2Dynamics
     * @generated
     */
    public Adapter createPFVArControllerType2DynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorUserDefined <em>Voltage Compensator User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorUserDefined
     * @generated
     */
    public Adapter createVoltageCompensatorUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC
     * @generated
     */
    public Adapter createWindPitchContPowerIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC
     * @generated
     */
    public Adapter createWindGenTurbineType1aIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC
     * @generated
     */
    public Adapter createWindProtectionIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC
     * @generated
     */
    public Adapter createWindRefFrameRotIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear <em>Load Generic Non Linear</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear
     * @generated
     */
    public Adapter createLoadGenericNonLinearAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC
     * @generated
     */
    public Adapter createWindTurbineType1or2IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC
     * @generated
     */
    public Adapter createWindGenTurbineType2IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3IEC <em>Wind Gen Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3IEC
     * @generated
     */
    public Adapter createWindGenType3IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC <em>Wind Cont PType3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC
     * @generated
     */
    public Adapter createWindContPType3IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified <em>Underexc Lim2 Simplified</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified
     * @generated
     */
    public Adapter createUnderexcLim2SimplifiedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC <em>Wind Plant IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC
     * @generated
     */
    public Adapter createWindPlantIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5 <em>Pss5</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5
     * @generated
     */
    public Adapter createPss5Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance <em>Asynchronous Machine Time Constant Reactance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance
     * @generated
     */
    public Adapter createAsynchronousMachineTimeConstantReactanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A <em>Pss STAB2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A
     * @generated
     */
    public Adapter createPssSTAB2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss1 <em>Pss1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss1
     * @generated
     */
    public Adapter createPss1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC
     * @generated
     */
    public Adapter createWindTurbineType4bIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2UserDefined <em>PFV Ar Controller Type2 User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2UserDefined
     * @generated
     */
    public Adapter createPFVArControllerType2UserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPID2 <em>Gov Hydro PID2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPID2
     * @generated
     */
    public Adapter createGovHydroPID2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroFrancis <em>Gov Hydro Francis</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroFrancis
     * @generated
     */
    public Adapter createGovHydroFrancisAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics <em>CSC Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics
     * @generated
     */
    public Adapter createCSCDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterDynamics
     * @generated
     */
    public Adapter createOverexcitationLimiterDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB <em>Exc RQB</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB
     * @generated
     */
    public Adapter createExcRQBAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS <em>Exc ANS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS
     * @generated
     */
    public Adapter createExcANSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate <em>Load Aggregate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate
     * @generated
     */
    public Adapter createLoadAggregateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3bIEC <em>Wind Gen Type3b IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3bIEC
     * @generated
     */
    public Adapter createWindGenType3bIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamIEEE1 <em>Gov Steam IEEE1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamIEEE1
     * @generated
     */
    public Adapter createGovSteamIEEE1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterDynamics
     * @generated
     */
    public Adapter createUnderexcitationLimiterDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH <em>Gov Hydro WEH</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH
     * @generated
     */
    public Adapter createGovHydroWEHAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC3A1 <em>Exc DC3A1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC3A1
     * @generated
     */
    public Adapter createExcDC3A1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics
     * @generated
     */
    public Adapter createWindTurbineType1or2DynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterUserDefined <em>Overexcitation Limiter User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterUserDefined
     * @generated
     */
    public Adapter createOverexcitationLimiterUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerUserDefined <em>Turbine Load Controller User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerUserDefined
     * @generated
     */
    public Adapter createTurbineLoadControllerUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC
     * @generated
     */
    public Adapter createWindContPitchAngleIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC <em>Exc BBC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC
     * @generated
     */
    public Adapter createExcBBCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE <em>Overexc Lim IEEE</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE
     * @generated
     */
    public Adapter createOverexcLimIEEEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics
     * @generated
     */
    public Adapter createWindTurbineType3or4DynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal
     * @generated
     */
    public Adapter createRemoteInputSignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1 <em>Exc AVR1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1
     * @generated
     */
    public Adapter createExcAVR1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR2 <em>Exc AVR2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR2
     * @generated
     */
    public Adapter createExcAVR2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR3 <em>Exc AVR3</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR3
     * @generated
     */
    public Adapter createExcAVR3Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR4 <em>Exc AVR4</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR4
     * @generated
     */
    public Adapter createExcAVR4Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR5 <em>Exc AVR5</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR5
     * @generated
     */
    public Adapter createExcAVR5Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR7 <em>Exc AVR7</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR7
     * @generated
     */
    public Adapter createExcAVR7Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController <em>PFV Ar Type2 IEEEV Ar Controller</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController
     * @generated
     */
    public Adapter createPFVArType2IEEEVArControllerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC2A <em>Exc IEEEAC2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC2A
     * @generated
     */
    public Adapter createExcIEEEAC2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadUserDefined <em>Load User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadUserDefined
     * @generated
     */
    public Adapter createLoadUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadUserDefined <em>Mechanical Load User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadUserDefined
     * @generated
     */
    public Adapter createMechanicalLoadUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC1A <em>Exc IEEEAC1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC1A
     * @generated
     */
    public Adapter createExcIEEEAC1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroIEEE0 <em>Gov Hydro IEEE0</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroIEEE0
     * @generated
     */
    public Adapter createGovHydroIEEE0Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroIEEE2 <em>Gov Hydro IEEE2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroIEEE2
     * @generated
     */
    public Adapter createGovHydroIEEE2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A <em>Exc IEEEAC6A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A
     * @generated
     */
    public Adapter createExcIEEEAC6AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A <em>Exc IEEEAC5A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A
     * @generated
     */
    public Adapter createExcIEEEAC5AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics
     * @generated
     */
    public Adapter createCrossCompoundTurbineGovernorDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics
     * @generated
     */
    public Adapter createStaticVarCompensatorDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC4A <em>Exc IEEEAC4A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC4A
     * @generated
     */
    public Adapter createExcIEEEAC4AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC3A <em>Exc IEEEAC3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC3A
     * @generated
     */
    public Adapter createExcIEEEAC3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemUserDefined <em>Excitation System User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemUserDefined
     * @generated
     */
    public Adapter createExcitationSystemUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType1or2UserDefined <em>Wind Type1or2 User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType1or2UserDefined
     * @generated
     */
    public Adapter createWindType1or2UserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4 <em>Gov GAST4</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4
     * @generated
     */
    public Adapter createGovGAST4Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3 <em>Gov GAST3</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3
     * @generated
     */
    public Adapter createGovGAST3Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST2 <em>Gov GAST2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST2
     * @generated
     */
    public Adapter createGovGAST2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST1 <em>Gov GAST1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST1
     * @generated
     */
    public Adapter createGovGAST1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechLoad1 <em>Mech Load1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechLoad1
     * @generated
     */
    public Adapter createMechLoad1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController <em>PFV Ar Type1 IEEEV Ar Controller</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController
     * @generated
     */
    public Adapter createPFVArType1IEEEVArControllerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC
     * @generated
     */
    public Adapter createWindContRotorRIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEPFController <em>PFV Ar Type2 IEEEPF Controller</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEPFController
     * @generated
     */
    public Adapter createPFVArType2IEEEPFControllerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE <em>VAdj IEEE</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE
     * @generated
     */
    public Adapter createVAdjIEEEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit <em>Synchronous Machine Equivalent Circuit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit
     * @generated
     */
    public Adapter createSynchronousMachineEquivalentCircuitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics <em>Wind Plant Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics
     * @generated
     */
    public Adapter createWindPlantDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1 <em>Exc ELIN1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1
     * @generated
     */
    public Adapter createExcELIN1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2 <em>Exc ELIN2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2
     * @generated
     */
    public Adapter createExcELIN2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineUserDefined <em>Asynchronous Machine User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineUserDefined
     * @generated
     */
    public Adapter createAsynchronousMachineUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST4B <em>Exc ST4B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST4B
     * @generated
     */
    public Adapter createExcST4BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST3A <em>Exc ST3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST3A
     * @generated
     */
    public Adapter createExcST3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST2A <em>Exc ST2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST2A
     * @generated
     */
    public Adapter createExcST2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC8B <em>Exc IEEEAC8B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC8B
     * @generated
     */
    public Adapter createExcIEEEAC8BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST1A <em>Exc ST1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST1A
     * @generated
     */
    public Adapter createExcST1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC7B <em>Exc IEEEAC7B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC7B
     * @generated
     */
    public Adapter createExcIEEEAC7BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamSGO <em>Gov Steam SGO</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamSGO
     * @generated
     */
    public Adapter createGovSteamSGOAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC
     * @generated
     */
    public Adapter createWindPlantFreqPcontrolIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7B <em>Exc ST7B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7B
     * @generated
     */
    public Adapter createExcST7BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerUserDefined <em>Power System Stabilizer User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerUserDefined
     * @generated
     */
    public Adapter createPowerSystemStabilizerUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DynamicsFunctionBlock <em>Dynamics Function Block</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DynamicsFunctionBlock
     * @generated
     */
    public Adapter createDynamicsFunctionBlockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPID <em>Gov Hydro PID</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPID
     * @generated
     */
    public Adapter createGovHydroPIDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST6B <em>Exc ST6B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST6B
     * @generated
     */
    public Adapter createExcST6BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC <em>Wind Cont PType4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC
     * @generated
     */
    public Adapter createWindContPType4bIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton <em>Gov Hydro Pelton</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton
     * @generated
     */
    public Adapter createGovHydroPeltonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics <em>VSC Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics
     * @generated
     */
    public Adapter createVSCDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics <em>Load Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics
     * @generated
     */
    public Adapter createLoadDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2 <em>Pss ELIN2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2
     * @generated
     */
    public Adapter createPssELIN2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance <em>Synchronous Machine Time Constant Reactance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance
     * @generated
     */
    public Adapter createSynchronousMachineTimeConstantReactanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1 <em>Gov CT1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1
     * @generated
     */
    public Adapter createGovCT1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2 <em>Gov CT2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2
     * @generated
     */
    public Adapter createGovCT2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC1A <em>Exc IEEEDC1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC1A
     * @generated
     */
    public Adapter createExcIEEEDC1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQPQULimIEC
     * @generated
     */
    public Adapter createWindContQPQULimIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC4B <em>Exc IEEEDC4B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC4B
     * @generated
     */
    public Adapter createExcIEEEDC4BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC3A <em>Exc IEEEDC3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC3A
     * @generated
     */
    public Adapter createExcIEEEDC3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC2A <em>Exc IEEEDC2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC2A
     * @generated
     */
    public Adapter createExcIEEEDC2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCUserDefined <em>CSC User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCUserDefined
     * @generated
     */
    public Adapter createCSCUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic <em>Load Static</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic
     * @generated
     */
    public Adapter createLoadStaticAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC
     * @generated
     */
    public Adapter createWindAeroTwoDimIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC
     * @generated
     */
    public Adapter createWindContCurrLimIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1 <em>Pss PTIST1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1
     * @generated
     */
    public Adapter createPssPTIST1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST3 <em>Pss PTIST3</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST3
     * @generated
     */
    public Adapter createPssPTIST3Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID <em>Gov Hydro WPID</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID
     * @generated
     */
    public Adapter createGovHydroWPIDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics
     * @generated
     */
    public Adapter createPFVArControllerType1DynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQLimIEC <em>Wind Cont QLim IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQLimIEC
     * @generated
     */
    public Adapter createWindContQLimIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorDynamics
     * @generated
     */
    public Adapter createVoltageCompensatorDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineUserDefined <em>Synchronous Machine User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineUserDefined
     * @generated
     */
    public Adapter createSynchronousMachineUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ
     * @generated
     */
    public Adapter createGenICompensationForGenJAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcREXS <em>Exc REXS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcREXS
     * @generated
     */
    public Adapter createExcREXSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics
     * @generated
     */
    public Adapter createAsynchronousMachineDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2Common1 <em>PFV Ar Type2 Common1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2Common1
     * @generated
     */
    public Adapter createPFVArType2Common1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC <em>Wind Aero Const IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC
     * @generated
     */
    public Adapter createWindAeroConstIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HVDCDynamics <em>HVDC Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HVDCDynamics
     * @generated
     */
    public Adapter createHVDCDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined
     * @generated
     */
    public Adapter createTurbineGovernorUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController <em>PFV Ar Type1 IEEEPF Controller</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController
     * @generated
     */
    public Adapter createPFVArType1IEEEPFControllerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC3A <em>Exc DC3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC3A
     * @generated
     */
    public Adapter createExcDC3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2B <em>Pss2 B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2B
     * @generated
     */
    public Adapter createPss2BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC2A <em>Exc DC2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC2A
     * @generated
     */
    public Adapter createExcDC2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC
     * @generated
     */
    public Adapter createWindPlantReactiveControlIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC <em>Gov Steam CC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC
     * @generated
     */
    public Adapter createGovSteamCCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC1A <em>Exc DC1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcDC1A
     * @generated
     */
    public Adapter createExcDC1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2 <em>Overexc Lim2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2
     * @generated
     */
    public Adapter createOverexcLim2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU <em>Gov Steam EU</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU
     * @generated
     */
    public Adapter createGovSteamEUAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable
     * @generated
     */
    public Adapter createWindDynamicsLookupTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss1A <em>Pss1 A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss1A
     * @generated
     */
    public Adapter createPss1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterUserDefined <em>Voltage Adjuster User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterUserDefined
     * @generated
     */
    public Adapter createVoltageAdjusterUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics
     * @generated
     */
    public Adapter createSynchronousMachineDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamBB <em>Gov Steam BB</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamBB
     * @generated
     */
    public Adapter createGovSteamBBAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2 <em>Underexc Lim X2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2
     * @generated
     */
    public Adapter createUnderexcLimX2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1 <em>Underexc Lim X1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1
     * @generated
     */
    public Adapter createUnderexcLimX1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC <em>Wind Gen Type4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC
     * @generated
     */
    public Adapter createWindGenType4IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1UserDefined <em>PFV Ar Controller Type1 User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1UserDefined
     * @generated
     */
    public Adapter createPFVArControllerType1UserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcOEX3T <em>Exc OEX3T</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcOEX3T
     * @generated
     */
    public Adapter createExcOEX3TAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC
     * @generated
     */
    public Adapter createWindGenTurbineType1bIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSB4 <em>Pss SB4</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSB4
     * @generated
     */
    public Adapter createPssSB4Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite <em>Load Composite</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite
     * @generated
     */
    public Adapter createLoadCompositeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSEXS <em>Exc SEXS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSEXS
     * @generated
     */
    public Adapter createExcSEXSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC <em>Wind Cont PType4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC
     * @generated
     */
    public Adapter createWindContPType4aIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC4A <em>Exc AC4A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC4A
     * @generated
     */
    public Adapter createExcAC4AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics
     * @generated
     */
    public Adapter createExcitationSystemDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC3A <em>Exc AC3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC3A
     * @generated
     */
    public Adapter createExcAC3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC2A <em>Exc AC2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC2A
     * @generated
     */
    public Adapter createExcAC2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC1A <em>Exc AC1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC1A
     * @generated
     */
    public Adapter createExcAC1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC8B <em>Exc AC8B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC8B
     * @generated
     */
    public Adapter createExcAC8BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B <em>Exc IEEEST7B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B
     * @generated
     */
    public Adapter createExcIEEEST7BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB <em>Pss RQB</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB
     * @generated
     */
    public Adapter createPssRQBAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1 <em>VComp IEEE Type1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1
     * @generated
     */
    public Adapter createVCompIEEEType1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC6A <em>Exc AC6A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC6A
     * @generated
     */
    public Adapter createExcAC6AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2 <em>VComp IEEE Type2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2
     * @generated
     */
    public Adapter createVCompIEEEType2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC5A <em>Exc AC5A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAC5A
     * @generated
     */
    public Adapter createExcAC5AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC <em>Wind Mech IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC
     * @generated
     */
    public Adapter createWindMechIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1 <em>Overexc Lim X1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1
     * @generated
     */
    public Adapter createOverexcLimX1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2 <em>Overexc Lim X2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2
     * @generated
     */
    public Adapter createOverexcLimX2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2 <em>Underexc Lim IEEE2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2
     * @generated
     */
    public Adapter createUnderexcLimIEEE2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1 <em>Underexc Lim IEEE1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1
     * @generated
     */
    public Adapter createUnderexcLimIEEE1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST3A <em>Exc IEEEST3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST3A
     * @generated
     */
    public Adapter createExcIEEEST3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSH <em>Pss SH</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSH
     * @generated
     */
    public Adapter createPssSHAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD <em>Gov Hydro DD</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD
     * @generated
     */
    public Adapter createGovHydroDDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSK <em>Pss SK</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSK
     * @generated
     */
    public Adapter createPssSKAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST4B <em>Exc IEEEST4B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST4B
     * @generated
     */
    public Adapter createExcIEEEST4BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC
     * @generated
     */
    public Adapter createWindTurbineType4aIECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B <em>Exc IEEEST5B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B
     * @generated
     */
    public Adapter createExcIEEEST5BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST6B <em>Exc IEEEST6B</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST6B
     * @generated
     */
    public Adapter createExcIEEEST6BAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4 <em>Gov Steam FV4</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4
     * @generated
     */
    public Adapter createGovSteamFV4Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV3 <em>Gov Steam FV3</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV3
     * @generated
     */
    public Adapter createGovSteamFV3Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV2 <em>Gov Steam FV2</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV2
     * @generated
     */
    public Adapter createGovSteamFV2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerDynamics
     * @generated
     */
    public Adapter createPowerSystemStabilizerDynamicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A <em>Disc Exc Cont IEEEDEC1A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A
     * @generated
     */
    public Adapter createDiscExcContIEEEDEC1AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC
     * @generated
     */
    public Adapter createWindTurbineType3IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantUserDefined <em>Wind Plant User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantUserDefined
     * @generated
     */
    public Adapter createWindPlantUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A <em>Disc Exc Cont IEEEDEC3A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A
     * @generated
     */
    public Adapter createDiscExcContIEEEDEC3AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A <em>Disc Exc Cont IEEEDEC2A</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A
     * @generated
     */
    public Adapter createDiscExcContIEEEDEC2AAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC
     * @generated
     */
    public Adapter createWindTurbineType3or4IECAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCUserDefined <em>SVC User Defined</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCUserDefined
     * @generated
     */
    public Adapter createSVCUserDefinedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1 <em>Turb LCFB1</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1
     * @generated
     */
    public Adapter createTurbLCFB1Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress <em>Street Address</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress
     * @generated
     */
    public Adapter createStreetAddressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status
     * @generated
     */
    public Adapter createStatusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ServiceLocation <em>Service Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ServiceLocation
     * @generated
     */
    public Adapter createServiceLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem <em>Coordinate System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem
     * @generated
     */
    public Adapter createCoordinateSystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint <em>Position Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint
     * @generated
     */
    public Adapter createPositionPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail <em>Street Detail</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail
     * @generated
     */
    public Adapter createStreetDetailAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WorkLocation <em>Work Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WorkLocation
     * @generated
     */
    public Adapter createWorkLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail <em>Town Detail</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail
     * @generated
     */
    public Adapter createTownDetailAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location
     * @generated
     */
    public Adapter createLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue <em>Analog Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue
     * @generated
     */
    public Adapter createAnalogValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command
     * @generated
     */
    public Adapter createCommandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue <em>Discrete Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue
     * @generated
     */
    public Adapter createDiscreteValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality <em>Measurement Value Quality</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueQuality
     * @generated
     */
    public Adapter createMeasurementValueQualityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet <em>Analog Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet
     * @generated
     */
    public Adapter createAnalogLimitSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Limit <em>Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Limit
     * @generated
     */
    public Adapter createLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl <em>Analog Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl
     * @generated
     */
    public Adapter createAnalogControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue <em>String Measurement Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurementValue
     * @generated
     */
    public Adapter createStringMeasurementValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue <em>Accumulator Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue
     * @generated
     */
    public Adapter createAccumulatorValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SetPoint <em>Set Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SetPoint
     * @generated
     */
    public Adapter createSetPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog <em>Analog</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog
     * @generated
     */
    public Adapter createAnalogAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource <em>Measurement Value Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValueSource
     * @generated
     */
    public Adapter createMeasurementValueSourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue <em>Measurement Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MeasurementValue
     * @generated
     */
    public Adapter createMeasurementValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850 <em>Quality61850</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850
     * @generated
     */
    public Adapter createQuality61850Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LimitSet <em>Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LimitSet
     * @generated
     */
    public Adapter createLimitSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimit <em>Accumulator Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimit
     * @generated
     */
    public Adapter createAccumulatorLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement
     * @generated
     */
    public Adapter createMeasurementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet <em>Value Alias Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet
     * @generated
     */
    public Adapter createValueAliasSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator <em>Accumulator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator
     * @generated
     */
    public Adapter createAccumulatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet <em>Accumulator Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet
     * @generated
     */
    public Adapter createAccumulatorLimitSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueToAlias <em>Value To Alias</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueToAlias
     * @generated
     */
    public Adapter createValueToAliasAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete <em>Discrete</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete
     * @generated
     */
    public Adapter createDiscreteAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand <em>Raise Lower Command</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand
     * @generated
     */
    public Adapter createRaiseLowerCommandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IOPoint <em>IO Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IOPoint
     * @generated
     */
    public Adapter createIOPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorReset <em>Accumulator Reset</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorReset
     * @generated
     */
    public Adapter createAccumulatorResetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit <em>Analog Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit
     * @generated
     */
    public Adapter createAnalogLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement <em>String Measurement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StringMeasurement
     * @generated
     */
    public Adapter createStringMeasurementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control
     * @generated
     */
    public Adapter createControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling <em>Mutual Coupling</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling
     * @generated
     */
    public Adapter createMutualCouplingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep <em>Sv Tap Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep
     * @generated
     */
    public Adapter createSvTapStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland <em>Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland
     * @generated
     */
    public Adapter createTopologicalIslandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch <em>Sv Switch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch
     * @generated
     */
    public Adapter createSvSwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvPowerFlow <em>Sv Power Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvPowerFlow
     * @generated
     */
    public Adapter createSvPowerFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections
     * @generated
     */
    public Adapter createSvShuntCompensatorSectionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage <em>Sv Voltage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage
     * @generated
     */
    public Adapter createSvVoltageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland <em>DC Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland
     * @generated
     */
    public Adapter createDCTopologicalIslandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode
     * @generated
     */
    public Adapter createTopologicalNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus <em>Sv Status</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus
     * @generated
     */
    public Adapter createSvStatusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection <em>Sv Injection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection
     * @generated
     */
    public Adapter createSvInjectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode
     * @generated
     */
    public Adapter createDCTopologicalNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //CimAdapterFactory
