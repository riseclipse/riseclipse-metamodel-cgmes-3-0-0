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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage
 * @generated
 */
public class CimSwitch< T > extends Switch< T > {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CimPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CimSwitch() {
        if( modelPackage == null ) {
            modelPackage = CimPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch( classifierID ) {
        case CimPackage.CIM_OBJECT_WITH_ID: {
            CimObjectWithID cimObjectWithID = ( CimObjectWithID ) theEObject;
            T result = caseCimObjectWithID( cimObjectWithID );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DAY_TYPE: {
            DayType dayType = ( DayType ) theEObject;
            T result = caseDayType( dayType );
            if( result == null ) result = caseIdentifiedObject( dayType );
            if( result == null ) result = caseCimObjectWithID( dayType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BUSBAR_SECTION: {
            BusbarSection busbarSection = ( BusbarSection ) theEObject;
            T result = caseBusbarSection( busbarSection );
            if( result == null ) result = caseConnector( busbarSection );
            if( result == null ) result = caseConductingEquipment( busbarSection );
            if( result == null ) result = caseEquipment( busbarSection );
            if( result == null ) result = casePowerSystemResource( busbarSection );
            if( result == null ) result = caseIdentifiedObject( busbarSection );
            if( result == null ) result = caseCimObjectWithID( busbarSection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FAULT_INDICATOR: {
            FaultIndicator faultIndicator = ( FaultIndicator ) theEObject;
            T result = caseFaultIndicator( faultIndicator );
            if( result == null ) result = caseAuxiliaryEquipment( faultIndicator );
            if( result == null ) result = caseEquipment( faultIndicator );
            if( result == null ) result = casePowerSystemResource( faultIndicator );
            if( result == null ) result = caseIdentifiedObject( faultIndicator );
            if( result == null ) result = caseCimObjectWithID( faultIndicator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_BUSBAR: {
            DCBusbar dcBusbar = ( DCBusbar ) theEObject;
            T result = caseDCBusbar( dcBusbar );
            if( result == null ) result = caseDCConductingEquipment( dcBusbar );
            if( result == null ) result = caseEquipment( dcBusbar );
            if( result == null ) result = casePowerSystemResource( dcBusbar );
            if( result == null ) result = caseIdentifiedObject( dcBusbar );
            if( result == null ) result = caseCimObjectWithID( dcBusbar );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_POWER_PLANT: {
            HydroPowerPlant hydroPowerPlant = ( HydroPowerPlant ) theEObject;
            T result = caseHydroPowerPlant( hydroPowerPlant );
            if( result == null ) result = casePowerSystemResource( hydroPowerPlant );
            if( result == null ) result = caseIdentifiedObject( hydroPowerPlant );
            if( result == null ) result = caseCimObjectWithID( hydroPowerPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC: {
            LoadResponseCharacteristic loadResponseCharacteristic = ( LoadResponseCharacteristic ) theEObject;
            T result = caseLoadResponseCharacteristic( loadResponseCharacteristic );
            if( result == null ) result = caseIdentifiedObject( loadResponseCharacteristic );
            if( result == null ) result = caseCimObjectWithID( loadResponseCharacteristic );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.APPARENT_POWER_LIMIT: {
            ApparentPowerLimit apparentPowerLimit = ( ApparentPowerLimit ) theEObject;
            T result = caseApparentPowerLimit( apparentPowerLimit );
            if( result == null ) result = caseOperationalLimit( apparentPowerLimit );
            if( result == null ) result = caseIdentifiedObject( apparentPowerLimit );
            if( result == null ) result = caseCimObjectWithID( apparentPowerLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VS_CONVERTER: {
            VsConverter vsConverter = ( VsConverter ) theEObject;
            T result = caseVsConverter( vsConverter );
            if( result == null ) result = caseACDCConverter( vsConverter );
            if( result == null ) result = caseConductingEquipment( vsConverter );
            if( result == null ) result = caseEquipment( vsConverter );
            if( result == null ) result = casePowerSystemResource( vsConverter );
            if( result == null ) result = caseIdentifiedObject( vsConverter );
            if( result == null ) result = caseCimObjectWithID( vsConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VS_CAPABILITY_CURVE: {
            VsCapabilityCurve vsCapabilityCurve = ( VsCapabilityCurve ) theEObject;
            T result = caseVsCapabilityCurve( vsCapabilityCurve );
            if( result == null ) result = caseCurve( vsCapabilityCurve );
            if( result == null ) result = caseIdentifiedObject( vsCapabilityCurve );
            if( result == null ) result = caseCimObjectWithID( vsCapabilityCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POTENTIAL_TRANSFORMER: {
            PotentialTransformer potentialTransformer = ( PotentialTransformer ) theEObject;
            T result = casePotentialTransformer( potentialTransformer );
            if( result == null ) result = caseSensor( potentialTransformer );
            if( result == null ) result = caseAuxiliaryEquipment( potentialTransformer );
            if( result == null ) result = caseEquipment( potentialTransformer );
            if( result == null ) result = casePowerSystemResource( potentialTransformer );
            if( result == null ) result = caseIdentifiedObject( potentialTransformer );
            if( result == null ) result = caseCimObjectWithID( potentialTransformer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_TERMINAL: {
            DCTerminal dcTerminal = ( DCTerminal ) theEObject;
            T result = caseDCTerminal( dcTerminal );
            if( result == null ) result = caseDCBaseTerminal( dcTerminal );
            if( result == null ) result = caseACDCTerminal( dcTerminal );
            if( result == null ) result = caseIdentifiedObject( dcTerminal );
            if( result == null ) result = caseCimObjectWithID( dcTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATIC_VAR_COMPENSATOR: {
            StaticVarCompensator staticVarCompensator = ( StaticVarCompensator ) theEObject;
            T result = caseStaticVarCompensator( staticVarCompensator );
            if( result == null ) result = caseRegulatingCondEq( staticVarCompensator );
            if( result == null ) result = caseEnergyConnection( staticVarCompensator );
            if( result == null ) result = caseConductingEquipment( staticVarCompensator );
            if( result == null ) result = caseEquipment( staticVarCompensator );
            if( result == null ) result = casePowerSystemResource( staticVarCompensator );
            if( result == null ) result = caseIdentifiedObject( staticVarCompensator );
            if( result == null ) result = caseCimObjectWithID( staticVarCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CS_CONVERTER: {
            CsConverter csConverter = ( CsConverter ) theEObject;
            T result = caseCsConverter( csConverter );
            if( result == null ) result = caseACDCConverter( csConverter );
            if( result == null ) result = caseConductingEquipment( csConverter );
            if( result == null ) result = caseEquipment( csConverter );
            if( result == null ) result = casePowerSystemResource( csConverter );
            if( result == null ) result = caseIdentifiedObject( csConverter );
            if( result == null ) result = caseCimObjectWithID( csConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACDC_TERMINAL: {
            ACDCTerminal acdcTerminal = ( ACDCTerminal ) theEObject;
            T result = caseACDCTerminal( acdcTerminal );
            if( result == null ) result = caseIdentifiedObject( acdcTerminal );
            if( result == null ) result = caseCimObjectWithID( acdcTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONNECTING_CIRCUIT_BREAKER: {
            DisconnectingCircuitBreaker disconnectingCircuitBreaker = ( DisconnectingCircuitBreaker ) theEObject;
            T result = caseDisconnectingCircuitBreaker( disconnectingCircuitBreaker );
            if( result == null ) result = caseBreaker( disconnectingCircuitBreaker );
            if( result == null ) result = caseProtectedSwitch( disconnectingCircuitBreaker );
            if( result == null ) result = caseSwitch( disconnectingCircuitBreaker );
            if( result == null ) result = caseConductingEquipment( disconnectingCircuitBreaker );
            if( result == null ) result = caseEquipment( disconnectingCircuitBreaker );
            if( result == null ) result = casePowerSystemResource( disconnectingCircuitBreaker );
            if( result == null ) result = caseIdentifiedObject( disconnectingCircuitBreaker );
            if( result == null ) result = caseCimObjectWithID( disconnectingCircuitBreaker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIO_TAP_CHANGER: {
            RatioTapChanger ratioTapChanger = ( RatioTapChanger ) theEObject;
            T result = caseRatioTapChanger( ratioTapChanger );
            if( result == null ) result = caseTapChanger( ratioTapChanger );
            if( result == null ) result = casePowerSystemResource( ratioTapChanger );
            if( result == null ) result = caseIdentifiedObject( ratioTapChanger );
            if( result == null ) result = caseCimObjectWithID( ratioTapChanger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINE: {
            Line line = ( Line ) theEObject;
            T result = caseLine( line );
            if( result == null ) result = caseEquipmentContainer( line );
            if( result == null ) result = caseConnectivityNodeContainer( line );
            if( result == null ) result = casePowerSystemResource( line );
            if( result == null ) result = caseIdentifiedObject( line );
            if( result == null ) result = caseCimObjectWithID( line );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BREAKER: {
            Breaker breaker = ( Breaker ) theEObject;
            T result = caseBreaker( breaker );
            if( result == null ) result = caseProtectedSwitch( breaker );
            if( result == null ) result = caseSwitch( breaker );
            if( result == null ) result = caseConductingEquipment( breaker );
            if( result == null ) result = caseEquipment( breaker );
            if( result == null ) result = casePowerSystemResource( breaker );
            if( result == null ) result = caseIdentifiedObject( breaker );
            if( result == null ) result = caseCimObjectWithID( breaker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONNECTOR: {
            Disconnector disconnector = ( Disconnector ) theEObject;
            T result = caseDisconnector( disconnector );
            if( result == null ) result = caseSwitch( disconnector );
            if( result == null ) result = caseConductingEquipment( disconnector );
            if( result == null ) result = caseEquipment( disconnector );
            if( result == null ) result = casePowerSystemResource( disconnector );
            if( result == null ) result = caseIdentifiedObject( disconnector );
            if( result == null ) result = caseCimObjectWithID( disconnector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL: {
            PhaseTapChangerAsymmetrical phaseTapChangerAsymmetrical = ( PhaseTapChangerAsymmetrical ) theEObject;
            T result = casePhaseTapChangerAsymmetrical( phaseTapChangerAsymmetrical );
            if( result == null ) result = casePhaseTapChangerNonLinear( phaseTapChangerAsymmetrical );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerAsymmetrical );
            if( result == null ) result = caseTapChanger( phaseTapChangerAsymmetrical );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerAsymmetrical );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerAsymmetrical );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerAsymmetrical );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_LIMIT_SET: {
            OperationalLimitSet operationalLimitSet = ( OperationalLimitSet ) theEObject;
            T result = caseOperationalLimitSet( operationalLimitSet );
            if( result == null ) result = caseIdentifiedObject( operationalLimitSet );
            if( result == null ) result = caseCimObjectWithID( operationalLimitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_LIMIT: {
            OperationalLimit operationalLimit = ( OperationalLimit ) theEObject;
            T result = caseOperationalLimit( operationalLimit );
            if( result == null ) result = caseIdentifiedObject( operationalLimit );
            if( result == null ) result = caseCimObjectWithID( operationalLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_PUMP: {
            HydroPump hydroPump = ( HydroPump ) theEObject;
            T result = caseHydroPump( hydroPump );
            if( result == null ) result = caseEquipment( hydroPump );
            if( result == null ) result = casePowerSystemResource( hydroPump );
            if( result == null ) result = caseIdentifiedObject( hydroPump );
            if( result == null ) result = caseCimObjectWithID( hydroPump );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULATION_SCHEDULE: {
            RegulationSchedule regulationSchedule = ( RegulationSchedule ) theEObject;
            T result = caseRegulationSchedule( regulationSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( regulationSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( regulationSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( regulationSchedule );
            if( result == null ) result = caseIdentifiedObject( regulationSchedule );
            if( result == null ) result = caseCimObjectWithID( regulationSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER_CONTROL: {
            TapChangerControl tapChangerControl = ( TapChangerControl ) theEObject;
            T result = caseTapChangerControl( tapChangerControl );
            if( result == null ) result = caseRegulatingControl( tapChangerControl );
            if( result == null ) result = casePowerSystemResource( tapChangerControl );
            if( result == null ) result = caseIdentifiedObject( tapChangerControl );
            if( result == null ) result = caseCimObjectWithID( tapChangerControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIPMENT: {
            Equipment equipment = ( Equipment ) theEObject;
            T result = caseEquipment( equipment );
            if( result == null ) result = casePowerSystemResource( equipment );
            if( result == null ) result = caseIdentifiedObject( equipment );
            if( result == null ) result = caseCimObjectWithID( equipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACTIVE_POWER_LIMIT: {
            ActivePowerLimit activePowerLimit = ( ActivePowerLimit ) theEObject;
            T result = caseActivePowerLimit( activePowerLimit );
            if( result == null ) result = caseOperationalLimit( activePowerLimit );
            if( result == null ) result = caseIdentifiedObject( activePowerLimit );
            if( result == null ) result = caseCimObjectWithID( activePowerLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_SERIES_DEVICE: {
            DCSeriesDevice dcSeriesDevice = ( DCSeriesDevice ) theEObject;
            T result = caseDCSeriesDevice( dcSeriesDevice );
            if( result == null ) result = caseDCConductingEquipment( dcSeriesDevice );
            if( result == null ) result = caseEquipment( dcSeriesDevice );
            if( result == null ) result = casePowerSystemResource( dcSeriesDevice );
            if( result == null ) result = caseIdentifiedObject( dcSeriesDevice );
            if( result == null ) result = caseCimObjectWithID( dcSeriesDevice );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SURGE_ARRESTER: {
            SurgeArrester surgeArrester = ( SurgeArrester ) theEObject;
            T result = caseSurgeArrester( surgeArrester );
            if( result == null ) result = caseAuxiliaryEquipment( surgeArrester );
            if( result == null ) result = caseEquipment( surgeArrester );
            if( result == null ) result = casePowerSystemResource( surgeArrester );
            if( result == null ) result = caseIdentifiedObject( surgeArrester );
            if( result == null ) result = caseCimObjectWithID( surgeArrester );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECTOR: {
            Connector connector = ( Connector ) theEObject;
            T result = caseConnector( connector );
            if( result == null ) result = caseConductingEquipment( connector );
            if( result == null ) result = caseEquipment( connector );
            if( result == null ) result = casePowerSystemResource( connector );
            if( result == null ) result = caseIdentifiedObject( connector );
            if( result == null ) result = caseCimObjectWithID( connector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURRENT_TRANSFORMER: {
            CurrentTransformer currentTransformer = ( CurrentTransformer ) theEObject;
            T result = caseCurrentTransformer( currentTransformer );
            if( result == null ) result = caseSensor( currentTransformer );
            if( result == null ) result = caseAuxiliaryEquipment( currentTransformer );
            if( result == null ) result = caseEquipment( currentTransformer );
            if( result == null ) result = casePowerSystemResource( currentTransformer );
            if( result == null ) result = caseIdentifiedObject( currentTransformer );
            if( result == null ) result = caseCimObjectWithID( currentTransformer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURVE_DATA: {
            CurveData curveData = ( CurveData ) theEObject;
            T result = caseCurveData( curveData );
            if( result == null ) result = caseCimObjectWithID( curveData );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_SHUNT: {
            DCShunt dcShunt = ( DCShunt ) theEObject;
            T result = caseDCShunt( dcShunt );
            if( result == null ) result = caseDCConductingEquipment( dcShunt );
            if( result == null ) result = caseEquipment( dcShunt );
            if( result == null ) result = casePowerSystemResource( dcShunt );
            if( result == null ) result = caseIdentifiedObject( dcShunt );
            if( result == null ) result = caseCimObjectWithID( dcShunt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUB_LOAD_AREA: {
            SubLoadArea subLoadArea = ( SubLoadArea ) theEObject;
            T result = caseSubLoadArea( subLoadArea );
            if( result == null ) result = caseEnergyArea( subLoadArea );
            if( result == null ) result = caseIdentifiedObject( subLoadArea );
            if( result == null ) result = caseCimObjectWithID( subLoadArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_LINEAR: {
            PhaseTapChangerLinear phaseTapChangerLinear = ( PhaseTapChangerLinear ) theEObject;
            T result = casePhaseTapChangerLinear( phaseTapChangerLinear );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerLinear );
            if( result == null ) result = caseTapChanger( phaseTapChangerLinear );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerLinear );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerLinear );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerLinear );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERIES_COMPENSATOR: {
            SeriesCompensator seriesCompensator = ( SeriesCompensator ) theEObject;
            T result = caseSeriesCompensator( seriesCompensator );
            if( result == null ) result = caseConductingEquipment( seriesCompensator );
            if( result == null ) result = caseEquipment( seriesCompensator );
            if( result == null ) result = casePowerSystemResource( seriesCompensator );
            if( result == null ) result = caseIdentifiedObject( seriesCompensator );
            if( result == null ) result = caseCimObjectWithID( seriesCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULATING_COND_EQ: {
            RegulatingCondEq regulatingCondEq = ( RegulatingCondEq ) theEObject;
            T result = caseRegulatingCondEq( regulatingCondEq );
            if( result == null ) result = caseEnergyConnection( regulatingCondEq );
            if( result == null ) result = caseConductingEquipment( regulatingCondEq );
            if( result == null ) result = caseEquipment( regulatingCondEq );
            if( result == null ) result = casePowerSystemResource( regulatingCondEq );
            if( result == null ) result = caseIdentifiedObject( regulatingCondEq );
            if( result == null ) result = caseCimObjectWithID( regulatingCondEq );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TERMINAL: {
            Terminal terminal = ( Terminal ) theEObject;
            T result = caseTerminal( terminal );
            if( result == null ) result = caseACDCTerminal( terminal );
            if( result == null ) result = caseIdentifiedObject( terminal );
            if( result == null ) result = caseCimObjectWithID( terminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE: {
            AsynchronousMachine asynchronousMachine = ( AsynchronousMachine ) theEObject;
            T result = caseAsynchronousMachine( asynchronousMachine );
            if( result == null ) result = caseRotatingMachine( asynchronousMachine );
            if( result == null ) result = caseRegulatingCondEq( asynchronousMachine );
            if( result == null ) result = caseEnergyConnection( asynchronousMachine );
            if( result == null ) result = caseConductingEquipment( asynchronousMachine );
            if( result == null ) result = caseEquipment( asynchronousMachine );
            if( result == null ) result = casePowerSystemResource( asynchronousMachine );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachine );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURRENT_LIMIT: {
            CurrentLimit currentLimit = ( CurrentLimit ) theEObject;
            T result = caseCurrentLimit( currentLimit );
            if( result == null ) result = caseOperationalLimit( currentLimit );
            if( result == null ) result = caseIdentifiedObject( currentLimit );
            if( result == null ) result = caseCimObjectWithID( currentLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER_TABLE_POINT: {
            TapChangerTablePoint tapChangerTablePoint = ( TapChangerTablePoint ) theEObject;
            T result = caseTapChangerTablePoint( tapChangerTablePoint );
            if( result == null ) result = caseCimObjectWithID( tapChangerTablePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_EQUIPMENT_CONTAINER: {
            DCEquipmentContainer dcEquipmentContainer = ( DCEquipmentContainer ) theEObject;
            T result = caseDCEquipmentContainer( dcEquipmentContainer );
            if( result == null ) result = caseEquipmentContainer( dcEquipmentContainer );
            if( result == null ) result = caseConnectivityNodeContainer( dcEquipmentContainer );
            if( result == null ) result = casePowerSystemResource( dcEquipmentContainer );
            if( result == null ) result = caseIdentifiedObject( dcEquipmentContainer );
            if( result == null ) result = caseCimObjectWithID( dcEquipmentContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXTERNAL_NETWORK_INJECTION: {
            ExternalNetworkInjection externalNetworkInjection = ( ExternalNetworkInjection ) theEObject;
            T result = caseExternalNetworkInjection( externalNetworkInjection );
            if( result == null ) result = caseRegulatingCondEq( externalNetworkInjection );
            if( result == null ) result = caseEnergyConnection( externalNetworkInjection );
            if( result == null ) result = caseConductingEquipment( externalNetworkInjection );
            if( result == null ) result = caseEquipment( externalNetworkInjection );
            if( result == null ) result = casePowerSystemResource( externalNetworkInjection );
            if( result == null ) result = caseIdentifiedObject( externalNetworkInjection );
            if( result == null ) result = caseCimObjectWithID( externalNetworkInjection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_GROUP: {
            LoadGroup loadGroup = ( LoadGroup ) theEObject;
            T result = caseLoadGroup( loadGroup );
            if( result == null ) result = caseIdentifiedObject( loadGroup );
            if( result == null ) result = caseCimObjectWithID( loadGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SOLAR_GENERATING_UNIT: {
            SolarGeneratingUnit solarGeneratingUnit = ( SolarGeneratingUnit ) theEObject;
            T result = caseSolarGeneratingUnit( solarGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( solarGeneratingUnit );
            if( result == null ) result = caseEquipment( solarGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( solarGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( solarGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( solarGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE: {
            SynchronousMachine synchronousMachine = ( SynchronousMachine ) theEObject;
            T result = caseSynchronousMachine( synchronousMachine );
            if( result == null ) result = caseRotatingMachine( synchronousMachine );
            if( result == null ) result = caseRegulatingCondEq( synchronousMachine );
            if( result == null ) result = caseEnergyConnection( synchronousMachine );
            if( result == null ) result = caseConductingEquipment( synchronousMachine );
            if( result == null ) result = caseEquipment( synchronousMachine );
            if( result == null ) result = casePowerSystemResource( synchronousMachine );
            if( result == null ) result = caseIdentifiedObject( synchronousMachine );
            if( result == null ) result = caseCimObjectWithID( synchronousMachine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACDC_CONVERTER: {
            ACDCConverter acdcConverter = ( ACDCConverter ) theEObject;
            T result = caseACDCConverter( acdcConverter );
            if( result == null ) result = caseConductingEquipment( acdcConverter );
            if( result == null ) result = caseEquipment( acdcConverter );
            if( result == null ) result = casePowerSystemResource( acdcConverter );
            if( result == null ) result = caseIdentifiedObject( acdcConverter );
            if( result == null ) result = caseCimObjectWithID( acdcConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUND_DISCONNECTOR: {
            GroundDisconnector groundDisconnector = ( GroundDisconnector ) theEObject;
            T result = caseGroundDisconnector( groundDisconnector );
            if( result == null ) result = caseSwitch( groundDisconnector );
            if( result == null ) result = caseConductingEquipment( groundDisconnector );
            if( result == null ) result = caseEquipment( groundDisconnector );
            if( result == null ) result = casePowerSystemResource( groundDisconnector );
            if( result == null ) result = caseIdentifiedObject( groundDisconnector );
            if( result == null ) result = caseCimObjectWithID( groundDisconnector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_SCHEDULE: {
            TapSchedule tapSchedule = ( TapSchedule ) theEObject;
            T result = caseTapSchedule( tapSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( tapSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( tapSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( tapSchedule );
            if( result == null ) result = caseIdentifiedObject( tapSchedule );
            if( result == null ) result = caseCimObjectWithID( tapSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIPMENT_CONTAINER: {
            EquipmentContainer equipmentContainer = ( EquipmentContainer ) theEObject;
            T result = caseEquipmentContainer( equipmentContainer );
            if( result == null ) result = caseConnectivityNodeContainer( equipmentContainer );
            if( result == null ) result = casePowerSystemResource( equipmentContainer );
            if( result == null ) result = caseIdentifiedObject( equipmentContainer );
            if( result == null ) result = caseCimObjectWithID( equipmentContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER: {
            TapChanger tapChanger = ( TapChanger ) theEObject;
            T result = caseTapChanger( tapChanger );
            if( result == null ) result = casePowerSystemResource( tapChanger );
            if( result == null ) result = caseIdentifiedObject( tapChanger );
            if( result == null ) result = caseCimObjectWithID( tapChanger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_BREAKER: {
            DCBreaker dcBreaker = ( DCBreaker ) theEObject;
            T result = caseDCBreaker( dcBreaker );
            if( result == null ) result = caseDCSwitch( dcBreaker );
            if( result == null ) result = caseDCConductingEquipment( dcBreaker );
            if( result == null ) result = caseEquipment( dcBreaker );
            if( result == null ) result = casePowerSystemResource( dcBreaker );
            if( result == null ) result = caseIdentifiedObject( dcBreaker );
            if( result == null ) result = caseCimObjectWithID( dcBreaker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_BRANCH: {
            EquivalentBranch equivalentBranch = ( EquivalentBranch ) theEObject;
            T result = caseEquivalentBranch( equivalentBranch );
            if( result == null ) result = caseEquivalentEquipment( equivalentBranch );
            if( result == null ) result = caseConductingEquipment( equivalentBranch );
            if( result == null ) result = caseEquipment( equivalentBranch );
            if( result == null ) result = casePowerSystemResource( equivalentBranch );
            if( result == null ) result = caseIdentifiedObject( equivalentBranch );
            if( result == null ) result = caseCimObjectWithID( equivalentBranch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_END: {
            TransformerEnd transformerEnd = ( TransformerEnd ) theEObject;
            T result = caseTransformerEnd( transformerEnd );
            if( result == null ) result = caseIdentifiedObject( transformerEnd );
            if( result == null ) result = caseCimObjectWithID( transformerEnd );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE: {
            NonConformLoadSchedule nonConformLoadSchedule = ( NonConformLoadSchedule ) theEObject;
            T result = caseNonConformLoadSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseIdentifiedObject( nonConformLoadSchedule );
            if( result == null ) result = caseCimObjectWithID( nonConformLoadSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE: {
            GrossToNetActivePowerCurve grossToNetActivePowerCurve = ( GrossToNetActivePowerCurve ) theEObject;
            T result = caseGrossToNetActivePowerCurve( grossToNetActivePowerCurve );
            if( result == null ) result = caseCurve( grossToNetActivePowerCurve );
            if( result == null ) result = caseIdentifiedObject( grossToNetActivePowerCurve );
            if( result == null ) result = caseCimObjectWithID( grossToNetActivePowerCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_NETWORK: {
            EquivalentNetwork equivalentNetwork = ( EquivalentNetwork ) theEObject;
            T result = caseEquivalentNetwork( equivalentNetwork );
            if( result == null ) result = caseConnectivityNodeContainer( equivalentNetwork );
            if( result == null ) result = casePowerSystemResource( equivalentNetwork );
            if( result == null ) result = caseIdentifiedObject( equivalentNetwork );
            if( result == null ) result = caseCimObjectWithID( equivalentNetwork );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFORM_LOAD_GROUP: {
            ConformLoadGroup conformLoadGroup = ( ConformLoadGroup ) theEObject;
            T result = caseConformLoadGroup( conformLoadGroup );
            if( result == null ) result = caseLoadGroup( conformLoadGroup );
            if( result == null ) result = caseIdentifiedObject( conformLoadGroup );
            if( result == null ) result = caseCimObjectWithID( conformLoadGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_AREA: {
            LoadArea loadArea = ( LoadArea ) theEObject;
            T result = caseLoadArea( loadArea );
            if( result == null ) result = caseEnergyArea( loadArea );
            if( result == null ) result = caseIdentifiedObject( loadArea );
            if( result == null ) result = caseCimObjectWithID( loadArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_CONNECTION: {
            EnergyConnection energyConnection = ( EnergyConnection ) theEObject;
            T result = caseEnergyConnection( energyConnection );
            if( result == null ) result = caseConductingEquipment( energyConnection );
            if( result == null ) result = caseEquipment( energyConnection );
            if( result == null ) result = casePowerSystemResource( energyConnection );
            if( result == null ) result = caseIdentifiedObject( energyConnection );
            if( result == null ) result = caseCimObjectWithID( energyConnection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.THERMAL_GENERATING_UNIT: {
            ThermalGeneratingUnit thermalGeneratingUnit = ( ThermalGeneratingUnit ) theEObject;
            T result = caseThermalGeneratingUnit( thermalGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( thermalGeneratingUnit );
            if( result == null ) result = caseEquipment( thermalGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( thermalGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( thermalGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( thermalGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ROTATING_MACHINE: {
            RotatingMachine rotatingMachine = ( RotatingMachine ) theEObject;
            T result = caseRotatingMachine( rotatingMachine );
            if( result == null ) result = caseRegulatingCondEq( rotatingMachine );
            if( result == null ) result = caseEnergyConnection( rotatingMachine );
            if( result == null ) result = caseConductingEquipment( rotatingMachine );
            if( result == null ) result = caseEquipment( rotatingMachine );
            if( result == null ) result = casePowerSystemResource( rotatingMachine );
            if( result == null ) result = caseIdentifiedObject( rotatingMachine );
            if( result == null ) result = caseCimObjectWithID( rotatingMachine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BAY: {
            Bay bay = ( Bay ) theEObject;
            T result = caseBay( bay );
            if( result == null ) result = caseEquipmentContainer( bay );
            if( result == null ) result = caseConnectivityNodeContainer( bay );
            if( result == null ) result = casePowerSystemResource( bay );
            if( result == null ) result = caseIdentifiedObject( bay );
            if( result == null ) result = caseCimObjectWithID( bay );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CAES_PLANT: {
            CAESPlant caesPlant = ( CAESPlant ) theEObject;
            T result = caseCAESPlant( caesPlant );
            if( result == null ) result = casePowerSystemResource( caesPlant );
            if( result == null ) result = caseIdentifiedObject( caesPlant );
            if( result == null ) result = caseCimObjectWithID( caesPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROL_AREA_GENERATING_UNIT: {
            ControlAreaGeneratingUnit controlAreaGeneratingUnit = ( ControlAreaGeneratingUnit ) theEObject;
            T result = caseControlAreaGeneratingUnit( controlAreaGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( controlAreaGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( controlAreaGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUB_GEOGRAPHICAL_REGION: {
            SubGeographicalRegion subGeographicalRegion = ( SubGeographicalRegion ) theEObject;
            T result = caseSubGeographicalRegion( subGeographicalRegion );
            if( result == null ) result = caseIdentifiedObject( subGeographicalRegion );
            if( result == null ) result = caseCimObjectWithID( subGeographicalRegion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH_SCHEDULE: {
            SwitchSchedule switchSchedule = ( SwitchSchedule ) theEObject;
            T result = caseSwitchSchedule( switchSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( switchSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( switchSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( switchSchedule );
            if( result == null ) result = caseIdentifiedObject( switchSchedule );
            if( result == null ) result = caseCimObjectWithID( switchSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_CHOPPER: {
            DCChopper dcChopper = ( DCChopper ) theEObject;
            T result = caseDCChopper( dcChopper );
            if( result == null ) result = caseDCConductingEquipment( dcChopper );
            if( result == null ) result = caseEquipment( dcChopper );
            if( result == null ) result = casePowerSystemResource( dcChopper );
            if( result == null ) result = caseIdentifiedObject( dcChopper );
            if( result == null ) result = caseCimObjectWithID( dcChopper );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUND: {
            Ground ground = ( Ground ) theEObject;
            T result = caseGround( ground );
            if( result == null ) result = caseConductingEquipment( ground );
            if( result == null ) result = caseEquipment( ground );
            if( result == null ) result = casePowerSystemResource( ground );
            if( result == null ) result = caseIdentifiedObject( ground );
            if( result == null ) result = caseCimObjectWithID( ground );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_SHUNT: {
            EquivalentShunt equivalentShunt = ( EquivalentShunt ) theEObject;
            T result = caseEquivalentShunt( equivalentShunt );
            if( result == null ) result = caseEquivalentEquipment( equivalentShunt );
            if( result == null ) result = caseConductingEquipment( equivalentShunt );
            if( result == null ) result = caseEquipment( equivalentShunt );
            if( result == null ) result = casePowerSystemResource( equivalentShunt );
            if( result == null ) result = caseIdentifiedObject( equivalentShunt );
            if( result == null ) result = caseCimObjectWithID( equivalentShunt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONDUCTOR: {
            Conductor conductor = ( Conductor ) theEObject;
            T result = caseConductor( conductor );
            if( result == null ) result = caseConductingEquipment( conductor );
            if( result == null ) result = caseEquipment( conductor );
            if( result == null ) result = casePowerSystemResource( conductor );
            if( result == null ) result = caseIdentifiedObject( conductor );
            if( result == null ) result = caseCimObjectWithID( conductor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_TABLE: {
            PhaseTapChangerTable phaseTapChangerTable = ( PhaseTapChangerTable ) theEObject;
            T result = casePhaseTapChangerTable( phaseTapChangerTable );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerTable );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_BASE_TERMINAL: {
            DCBaseTerminal dcBaseTerminal = ( DCBaseTerminal ) theEObject;
            T result = caseDCBaseTerminal( dcBaseTerminal );
            if( result == null ) result = caseACDCTerminal( dcBaseTerminal );
            if( result == null ) result = caseIdentifiedObject( dcBaseTerminal );
            if( result == null ) result = caseCimObjectWithID( dcBaseTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_SWITCH: {
            DCSwitch dcSwitch = ( DCSwitch ) theEObject;
            T result = caseDCSwitch( dcSwitch );
            if( result == null ) result = caseDCConductingEquipment( dcSwitch );
            if( result == null ) result = caseEquipment( dcSwitch );
            if( result == null ) result = casePowerSystemResource( dcSwitch );
            if( result == null ) result = caseIdentifiedObject( dcSwitch );
            if( result == null ) result = caseCimObjectWithID( dcSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FUSE: {
            Fuse fuse = ( Fuse ) theEObject;
            T result = caseFuse( fuse );
            if( result == null ) result = caseSwitch( fuse );
            if( result == null ) result = caseConductingEquipment( fuse );
            if( result == null ) result = caseEquipment( fuse );
            if( result == null ) result = casePowerSystemResource( fuse );
            if( result == null ) result = caseIdentifiedObject( fuse );
            if( result == null ) result = caseCimObjectWithID( fuse );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUBSTATION: {
            Substation substation = ( Substation ) theEObject;
            T result = caseSubstation( substation );
            if( result == null ) result = caseEquipmentContainer( substation );
            if( result == null ) result = caseConnectivityNodeContainer( substation );
            if( result == null ) result = casePowerSystemResource( substation );
            if( result == null ) result = caseIdentifiedObject( substation );
            if( result == null ) result = caseCimObjectWithID( substation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AC_LINE_SEGMENT: {
            ACLineSegment acLineSegment = ( ACLineSegment ) theEObject;
            T result = caseACLineSegment( acLineSegment );
            if( result == null ) result = caseConductor( acLineSegment );
            if( result == null ) result = caseConductingEquipment( acLineSegment );
            if( result == null ) result = caseEquipment( acLineSegment );
            if( result == null ) result = casePowerSystemResource( acLineSegment );
            if( result == null ) result = caseIdentifiedObject( acLineSegment );
            if( result == null ) result = caseCimObjectWithID( acLineSegment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_LINE_SEGMENT: {
            DCLineSegment dcLineSegment = ( DCLineSegment ) theEObject;
            T result = caseDCLineSegment( dcLineSegment );
            if( result == null ) result = caseDCConductingEquipment( dcLineSegment );
            if( result == null ) result = caseEquipment( dcLineSegment );
            if( result == null ) result = casePowerSystemResource( dcLineSegment );
            if( result == null ) result = caseIdentifiedObject( dcLineSegment );
            if( result == null ) result = caseCimObjectWithID( dcLineSegment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURVE: {
            Curve curve = ( Curve ) theEObject;
            T result = caseCurve( curve );
            if( result == null ) result = caseIdentifiedObject( curve );
            if( result == null ) result = caseCimObjectWithID( curve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER: {
            PhaseTapChanger phaseTapChanger = ( PhaseTapChanger ) theEObject;
            T result = casePhaseTapChanger( phaseTapChanger );
            if( result == null ) result = caseTapChanger( phaseTapChanger );
            if( result == null ) result = casePowerSystemResource( phaseTapChanger );
            if( result == null ) result = caseIdentifiedObject( phaseTapChanger );
            if( result == null ) result = caseCimObjectWithID( phaseTapChanger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATION_SUPPLY: {
            StationSupply stationSupply = ( StationSupply ) theEObject;
            T result = caseStationSupply( stationSupply );
            if( result == null ) result = caseEnergyConsumer( stationSupply );
            if( result == null ) result = caseEnergyConnection( stationSupply );
            if( result == null ) result = caseConductingEquipment( stationSupply );
            if( result == null ) result = caseEquipment( stationSupply );
            if( result == null ) result = casePowerSystemResource( stationSupply );
            if( result == null ) result = caseIdentifiedObject( stationSupply );
            if( result == null ) result = caseCimObjectWithID( stationSupply );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PETERSEN_COIL: {
            PetersenCoil petersenCoil = ( PetersenCoil ) theEObject;
            T result = casePetersenCoil( petersenCoil );
            if( result == null ) result = caseEarthFaultCompensator( petersenCoil );
            if( result == null ) result = caseConductingEquipment( petersenCoil );
            if( result == null ) result = caseEquipment( petersenCoil );
            if( result == null ) result = casePowerSystemResource( petersenCoil );
            if( result == null ) result = caseIdentifiedObject( petersenCoil );
            if( result == null ) result = caseCimObjectWithID( petersenCoil );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROTECTED_SWITCH: {
            ProtectedSwitch protectedSwitch = ( ProtectedSwitch ) theEObject;
            T result = caseProtectedSwitch( protectedSwitch );
            if( result == null ) result = caseSwitch( protectedSwitch );
            if( result == null ) result = caseConductingEquipment( protectedSwitch );
            if( result == null ) result = caseEquipment( protectedSwitch );
            if( result == null ) result = casePowerSystemResource( protectedSwitch );
            if( result == null ) result = caseIdentifiedObject( protectedSwitch );
            if( result == null ) result = caseCimObjectWithID( protectedSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_LINE: {
            DCLine dcLine = ( DCLine ) theEObject;
            T result = caseDCLine( dcLine );
            if( result == null ) result = caseDCEquipmentContainer( dcLine );
            if( result == null ) result = caseEquipmentContainer( dcLine );
            if( result == null ) result = caseConnectivityNodeContainer( dcLine );
            if( result == null ) result = casePowerSystemResource( dcLine );
            if( result == null ) result = caseIdentifiedObject( dcLine );
            if( result == null ) result = caseCimObjectWithID( dcLine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_TRANSFORMER_END: {
            PowerTransformerEnd powerTransformerEnd = ( PowerTransformerEnd ) theEObject;
            T result = casePowerTransformerEnd( powerTransformerEnd );
            if( result == null ) result = caseTransformerEnd( powerTransformerEnd );
            if( result == null ) result = caseIdentifiedObject( powerTransformerEnd );
            if( result == null ) result = caseCimObjectWithID( powerTransformerEnd );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMBINED_CYCLE_PLANT: {
            CombinedCyclePlant combinedCyclePlant = ( CombinedCyclePlant ) theEObject;
            T result = caseCombinedCyclePlant( combinedCyclePlant );
            if( result == null ) result = casePowerSystemResource( combinedCyclePlant );
            if( result == null ) result = caseIdentifiedObject( combinedCyclePlant );
            if( result == null ) result = caseCimObjectWithID( combinedCyclePlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIO_TAP_CHANGER_TABLE: {
            RatioTapChangerTable ratioTapChangerTable = ( RatioTapChangerTable ) theEObject;
            T result = caseRatioTapChangerTable( ratioTapChangerTable );
            if( result == null ) result = caseIdentifiedObject( ratioTapChangerTable );
            if( result == null ) result = caseCimObjectWithID( ratioTapChangerTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IDENTIFIED_OBJECT: {
            IdentifiedObject identifiedObject = ( IdentifiedObject ) theEObject;
            T result = caseIdentifiedObject( identifiedObject );
            if( result == null ) result = caseCimObjectWithID( identifiedObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_BREAK_SWITCH: {
            LoadBreakSwitch loadBreakSwitch = ( LoadBreakSwitch ) theEObject;
            T result = caseLoadBreakSwitch( loadBreakSwitch );
            if( result == null ) result = caseProtectedSwitch( loadBreakSwitch );
            if( result == null ) result = caseSwitch( loadBreakSwitch );
            if( result == null ) result = caseConductingEquipment( loadBreakSwitch );
            if( result == null ) result = caseEquipment( loadBreakSwitch );
            if( result == null ) result = casePowerSystemResource( loadBreakSwitch );
            if( result == null ) result = caseIdentifiedObject( loadBreakSwitch );
            if( result == null ) result = caseCimObjectWithID( loadBreakSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_CONDUCTING_EQUIPMENT: {
            DCConductingEquipment dcConductingEquipment = ( DCConductingEquipment ) theEObject;
            T result = caseDCConductingEquipment( dcConductingEquipment );
            if( result == null ) result = caseEquipment( dcConductingEquipment );
            if( result == null ) result = casePowerSystemResource( dcConductingEquipment );
            if( result == null ) result = caseIdentifiedObject( dcConductingEquipment );
            if( result == null ) result = caseCimObjectWithID( dcConductingEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CLAMP: {
            Clamp clamp = ( Clamp ) theEObject;
            T result = caseClamp( clamp );
            if( result == null ) result = caseConductingEquipment( clamp );
            if( result == null ) result = caseEquipment( clamp );
            if( result == null ) result = casePowerSystemResource( clamp );
            if( result == null ) result = caseIdentifiedObject( clamp );
            if( result == null ) result = caseCimObjectWithID( clamp );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.JUMPER: {
            Jumper jumper = ( Jumper ) theEObject;
            T result = caseJumper( jumper );
            if( result == null ) result = caseSwitch( jumper );
            if( result == null ) result = caseConductingEquipment( jumper );
            if( result == null ) result = caseEquipment( jumper );
            if( result == null ) result = casePowerSystemResource( jumper );
            if( result == null ) result = caseIdentifiedObject( jumper );
            if( result == null ) result = caseCimObjectWithID( jumper );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROL_AREA: {
            ControlArea controlArea = ( ControlArea ) theEObject;
            T result = caseControlArea( controlArea );
            if( result == null ) result = casePowerSystemResource( controlArea );
            if( result == null ) result = caseIdentifiedObject( controlArea );
            if( result == null ) result = caseCimObjectWithID( controlArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_SYMMETRICAL: {
            PhaseTapChangerSymmetrical phaseTapChangerSymmetrical = ( PhaseTapChangerSymmetrical ) theEObject;
            T result = casePhaseTapChangerSymmetrical( phaseTapChangerSymmetrical );
            if( result == null ) result = casePhaseTapChangerNonLinear( phaseTapChangerSymmetrical );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerSymmetrical );
            if( result == null ) result = caseTapChanger( phaseTapChangerSymmetrical );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerSymmetrical );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerSymmetrical );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerSymmetrical );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECTIVITY_NODE: {
            ConnectivityNode connectivityNode = ( ConnectivityNode ) theEObject;
            T result = caseConnectivityNode( connectivityNode );
            if( result == null ) result = caseIdentifiedObject( connectivityNode );
            if( result == null ) result = caseCimObjectWithID( connectivityNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_ELECTRONICS_UNIT: {
            PowerElectronicsUnit powerElectronicsUnit = ( PowerElectronicsUnit ) theEObject;
            T result = casePowerElectronicsUnit( powerElectronicsUnit );
            if( result == null ) result = caseEquipment( powerElectronicsUnit );
            if( result == null ) result = casePowerSystemResource( powerElectronicsUnit );
            if( result == null ) result = caseIdentifiedObject( powerElectronicsUnit );
            if( result == null ) result = caseCimObjectWithID( powerElectronicsUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFORM_LOAD: {
            ConformLoad conformLoad = ( ConformLoad ) theEObject;
            T result = caseConformLoad( conformLoad );
            if( result == null ) result = caseEnergyConsumer( conformLoad );
            if( result == null ) result = caseEnergyConnection( conformLoad );
            if( result == null ) result = caseConductingEquipment( conformLoad );
            if( result == null ) result = caseEquipment( conformLoad );
            if( result == null ) result = casePowerSystemResource( conformLoad );
            if( result == null ) result = caseIdentifiedObject( conformLoad );
            if( result == null ) result = caseCimObjectWithID( conformLoad );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHOTO_VOLTAIC_UNIT: {
            PhotoVoltaicUnit photoVoltaicUnit = ( PhotoVoltaicUnit ) theEObject;
            T result = casePhotoVoltaicUnit( photoVoltaicUnit );
            if( result == null ) result = casePowerElectronicsUnit( photoVoltaicUnit );
            if( result == null ) result = caseEquipment( photoVoltaicUnit );
            if( result == null ) result = casePowerSystemResource( photoVoltaicUnit );
            if( result == null ) result = caseIdentifiedObject( photoVoltaicUnit );
            if( result == null ) result = caseCimObjectWithID( photoVoltaicUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GENERATING_UNIT: {
            WindGeneratingUnit windGeneratingUnit = ( WindGeneratingUnit ) theEObject;
            T result = caseWindGeneratingUnit( windGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( windGeneratingUnit );
            if( result == null ) result = caseEquipment( windGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( windGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( windGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( windGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE: {
            SeasonDayTypeSchedule seasonDayTypeSchedule = ( SeasonDayTypeSchedule ) theEObject;
            T result = caseSeasonDayTypeSchedule( seasonDayTypeSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( seasonDayTypeSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( seasonDayTypeSchedule );
            if( result == null ) result = caseIdentifiedObject( seasonDayTypeSchedule );
            if( result == null ) result = caseCimObjectWithID( seasonDayTypeSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUT: {
            Cut cut = ( Cut ) theEObject;
            T result = caseCut( cut );
            if( result == null ) result = caseSwitch( cut );
            if( result == null ) result = caseConductingEquipment( cut );
            if( result == null ) result = caseEquipment( cut );
            if( result == null ) result = casePowerSystemResource( cut );
            if( result == null ) result = caseIdentifiedObject( cut );
            if( result == null ) result = caseCimObjectWithID( cut );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_GROUND: {
            DCGround dcGround = ( DCGround ) theEObject;
            T result = caseDCGround( dcGround );
            if( result == null ) result = caseDCConductingEquipment( dcGround );
            if( result == null ) result = caseEquipment( dcGround );
            if( result == null ) result = casePowerSystemResource( dcGround );
            if( result == null ) result = caseIdentifiedObject( dcGround );
            if( result == null ) result = caseCimObjectWithID( dcGround );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_LIMIT: {
            VoltageLimit voltageLimit = ( VoltageLimit ) theEObject;
            T result = caseVoltageLimit( voltageLimit );
            if( result == null ) result = caseOperationalLimit( voltageLimit );
            if( result == null ) result = caseIdentifiedObject( voltageLimit );
            if( result == null ) result = caseCimObjectWithID( voltageLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL: {
            ACDCConverterDCTerminal acdcConverterDCTerminal = ( ACDCConverterDCTerminal ) theEObject;
            T result = caseACDCConverterDCTerminal( acdcConverterDCTerminal );
            if( result == null ) result = caseDCBaseTerminal( acdcConverterDCTerminal );
            if( result == null ) result = caseACDCTerminal( acdcConverterDCTerminal );
            if( result == null ) result = caseIdentifiedObject( acdcConverterDCTerminal );
            if( result == null ) result = caseCimObjectWithID( acdcConverterDCTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_ELECTRONICS_WIND_UNIT: {
            PowerElectronicsWindUnit powerElectronicsWindUnit = ( PowerElectronicsWindUnit ) theEObject;
            T result = casePowerElectronicsWindUnit( powerElectronicsWindUnit );
            if( result == null ) result = casePowerElectronicsUnit( powerElectronicsWindUnit );
            if( result == null ) result = caseEquipment( powerElectronicsWindUnit );
            if( result == null ) result = casePowerSystemResource( powerElectronicsWindUnit );
            if( result == null ) result = caseIdentifiedObject( powerElectronicsWindUnit );
            if( result == null ) result = caseCimObjectWithID( powerElectronicsWindUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NUCLEAR_GENERATING_UNIT: {
            NuclearGeneratingUnit nuclearGeneratingUnit = ( NuclearGeneratingUnit ) theEObject;
            T result = caseNuclearGeneratingUnit( nuclearGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( nuclearGeneratingUnit );
            if( result == null ) result = caseEquipment( nuclearGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( nuclearGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( nuclearGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( nuclearGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULATING_CONTROL: {
            RegulatingControl regulatingControl = ( RegulatingControl ) theEObject;
            T result = caseRegulatingControl( regulatingControl );
            if( result == null ) result = casePowerSystemResource( regulatingControl );
            if( result == null ) result = caseIdentifiedObject( regulatingControl );
            if( result == null ) result = caseCimObjectWithID( regulatingControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SENSOR: {
            Sensor sensor = ( Sensor ) theEObject;
            T result = caseSensor( sensor );
            if( result == null ) result = caseAuxiliaryEquipment( sensor );
            if( result == null ) result = caseEquipment( sensor );
            if( result == null ) result = casePowerSystemResource( sensor );
            if( result == null ) result = caseIdentifiedObject( sensor );
            if( result == null ) result = caseCimObjectWithID( sensor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR: {
            NonlinearShuntCompensator nonlinearShuntCompensator = ( NonlinearShuntCompensator ) theEObject;
            T result = caseNonlinearShuntCompensator( nonlinearShuntCompensator );
            if( result == null ) result = caseShuntCompensator( nonlinearShuntCompensator );
            if( result == null ) result = caseRegulatingCondEq( nonlinearShuntCompensator );
            if( result == null ) result = caseEnergyConnection( nonlinearShuntCompensator );
            if( result == null ) result = caseConductingEquipment( nonlinearShuntCompensator );
            if( result == null ) result = caseEquipment( nonlinearShuntCompensator );
            if( result == null ) result = casePowerSystemResource( nonlinearShuntCompensator );
            if( result == null ) result = caseIdentifiedObject( nonlinearShuntCompensator );
            if( result == null ) result = caseCimObjectWithID( nonlinearShuntCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BATTERY_UNIT: {
            BatteryUnit batteryUnit = ( BatteryUnit ) theEObject;
            T result = caseBatteryUnit( batteryUnit );
            if( result == null ) result = casePowerElectronicsUnit( batteryUnit );
            if( result == null ) result = caseEquipment( batteryUnit );
            if( result == null ) result = casePowerSystemResource( batteryUnit );
            if( result == null ) result = caseIdentifiedObject( batteryUnit );
            if( result == null ) result = caseCimObjectWithID( batteryUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REACTIVE_CAPABILITY_CURVE: {
            ReactiveCapabilityCurve reactiveCapabilityCurve = ( ReactiveCapabilityCurve ) theEObject;
            T result = caseReactiveCapabilityCurve( reactiveCapabilityCurve );
            if( result == null ) result = caseCurve( reactiveCapabilityCurve );
            if( result == null ) result = caseIdentifiedObject( reactiveCapabilityCurve );
            if( result == null ) result = caseCimObjectWithID( reactiveCapabilityCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_LEVEL: {
            VoltageLevel voltageLevel = ( VoltageLevel ) theEObject;
            T result = caseVoltageLevel( voltageLevel );
            if( result == null ) result = caseEquipmentContainer( voltageLevel );
            if( result == null ) result = caseConnectivityNodeContainer( voltageLevel );
            if( result == null ) result = casePowerSystemResource( voltageLevel );
            if( result == null ) result = caseIdentifiedObject( voltageLevel );
            if( result == null ) result = caseCimObjectWithID( voltageLevel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_NODE: {
            DCNode dcNode = ( DCNode ) theEObject;
            T result = caseDCNode( dcNode );
            if( result == null ) result = caseIdentifiedObject( dcNode );
            if( result == null ) result = caseCimObjectWithID( dcNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT: {
            NonlinearShuntCompensatorPoint nonlinearShuntCompensatorPoint = ( NonlinearShuntCompensatorPoint ) theEObject;
            T result = caseNonlinearShuntCompensatorPoint( nonlinearShuntCompensatorPoint );
            if( result == null ) result = caseCimObjectWithID( nonlinearShuntCompensatorPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_DISCONNECTOR: {
            DCDisconnector dcDisconnector = ( DCDisconnector ) theEObject;
            T result = caseDCDisconnector( dcDisconnector );
            if( result == null ) result = caseDCSwitch( dcDisconnector );
            if( result == null ) result = caseDCConductingEquipment( dcDisconnector );
            if( result == null ) result = caseEquipment( dcDisconnector );
            if( result == null ) result = casePowerSystemResource( dcDisconnector );
            if( result == null ) result = caseIdentifiedObject( dcDisconnector );
            if( result == null ) result = caseCimObjectWithID( dcDisconnector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.JUNCTION: {
            Junction junction = ( Junction ) theEObject;
            T result = caseJunction( junction );
            if( result == null ) result = caseConnector( junction );
            if( result == null ) result = caseConductingEquipment( junction );
            if( result == null ) result = caseEquipment( junction );
            if( result == null ) result = casePowerSystemResource( junction );
            if( result == null ) result = caseIdentifiedObject( junction );
            if( result == null ) result = caseCimObjectWithID( junction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR: {
            PhaseTapChangerNonLinear phaseTapChangerNonLinear = ( PhaseTapChangerNonLinear ) theEObject;
            T result = casePhaseTapChangerNonLinear( phaseTapChangerNonLinear );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerNonLinear );
            if( result == null ) result = caseTapChanger( phaseTapChangerNonLinear );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerNonLinear );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerNonLinear );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerNonLinear );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONDUCTING_EQUIPMENT: {
            ConductingEquipment conductingEquipment = ( ConductingEquipment ) theEObject;
            T result = caseConductingEquipment( conductingEquipment );
            if( result == null ) result = caseEquipment( conductingEquipment );
            if( result == null ) result = casePowerSystemResource( conductingEquipment );
            if( result == null ) result = caseIdentifiedObject( conductingEquipment );
            if( result == null ) result = caseCimObjectWithID( conductingEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASE_VOLTAGE: {
            BaseVoltage baseVoltage = ( BaseVoltage ) theEObject;
            T result = caseBaseVoltage( baseVoltage );
            if( result == null ) result = caseIdentifiedObject( baseVoltage );
            if( result == null ) result = caseCimObjectWithID( baseVoltage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FOSSIL_FUEL: {
            FossilFuel fossilFuel = ( FossilFuel ) theEObject;
            T result = caseFossilFuel( fossilFuel );
            if( result == null ) result = caseIdentifiedObject( fossilFuel );
            if( result == null ) result = caseCimObjectWithID( fossilFuel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH: {
            fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch switch_ = ( fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch ) theEObject;
            T result = caseSwitch( switch_ );
            if( result == null ) result = caseConductingEquipment( switch_ );
            if( result == null ) result = caseEquipment( switch_ );
            if( result == null ) result = casePowerSystemResource( switch_ );
            if( result == null ) result = caseIdentifiedObject( switch_ );
            if( result == null ) result = caseCimObjectWithID( switch_ );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AUXILIARY_EQUIPMENT: {
            AuxiliaryEquipment auxiliaryEquipment = ( AuxiliaryEquipment ) theEObject;
            T result = caseAuxiliaryEquipment( auxiliaryEquipment );
            if( result == null ) result = caseEquipment( auxiliaryEquipment );
            if( result == null ) result = casePowerSystemResource( auxiliaryEquipment );
            if( result == null ) result = caseIdentifiedObject( auxiliaryEquipment );
            if( result == null ) result = caseCimObjectWithID( auxiliaryEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REPORTING_GROUP: {
            ReportingGroup reportingGroup = ( ReportingGroup ) theEObject;
            T result = caseReportingGroup( reportingGroup );
            if( result == null ) result = caseIdentifiedObject( reportingGroup );
            if( result == null ) result = caseCimObjectWithID( reportingGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUNDING_IMPEDANCE: {
            GroundingImpedance groundingImpedance = ( GroundingImpedance ) theEObject;
            T result = caseGroundingImpedance( groundingImpedance );
            if( result == null ) result = caseEarthFaultCompensator( groundingImpedance );
            if( result == null ) result = caseConductingEquipment( groundingImpedance );
            if( result == null ) result = caseEquipment( groundingImpedance );
            if( result == null ) result = casePowerSystemResource( groundingImpedance );
            if( result == null ) result = caseIdentifiedObject( groundingImpedance );
            if( result == null ) result = caseCimObjectWithID( groundingImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NON_CONFORM_LOAD: {
            NonConformLoad nonConformLoad = ( NonConformLoad ) theEObject;
            T result = caseNonConformLoad( nonConformLoad );
            if( result == null ) result = caseEnergyConsumer( nonConformLoad );
            if( result == null ) result = caseEnergyConnection( nonConformLoad );
            if( result == null ) result = caseConductingEquipment( nonConformLoad );
            if( result == null ) result = caseEquipment( nonConformLoad );
            if( result == null ) result = casePowerSystemResource( nonConformLoad );
            if( result == null ) result = caseIdentifiedObject( nonConformLoad );
            if( result == null ) result = caseCimObjectWithID( nonConformLoad );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WAVE_TRAP: {
            WaveTrap waveTrap = ( WaveTrap ) theEObject;
            T result = caseWaveTrap( waveTrap );
            if( result == null ) result = caseAuxiliaryEquipment( waveTrap );
            if( result == null ) result = caseEquipment( waveTrap );
            if( result == null ) result = casePowerSystemResource( waveTrap );
            if( result == null ) result = caseIdentifiedObject( waveTrap );
            if( result == null ) result = caseCimObjectWithID( waveTrap );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SEASON: {
            Season season = ( Season ) theEObject;
            T result = caseSeason( season );
            if( result == null ) result = caseIdentifiedObject( season );
            if( result == null ) result = caseCimObjectWithID( season );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TIE_FLOW: {
            TieFlow tieFlow = ( TieFlow ) theEObject;
            T result = caseTieFlow( tieFlow );
            if( result == null ) result = caseIdentifiedObject( tieFlow );
            if( result == null ) result = caseCimObjectWithID( tieFlow );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_SYSTEM_RESOURCE: {
            PowerSystemResource powerSystemResource = ( PowerSystemResource ) theEObject;
            T result = casePowerSystemResource( powerSystemResource );
            if( result == null ) result = caseIdentifiedObject( powerSystemResource );
            if( result == null ) result = caseCimObjectWithID( powerSystemResource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_GENERATING_UNIT: {
            HydroGeneratingUnit hydroGeneratingUnit = ( HydroGeneratingUnit ) theEObject;
            T result = caseHydroGeneratingUnit( hydroGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( hydroGeneratingUnit );
            if( result == null ) result = caseEquipment( hydroGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( hydroGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( hydroGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( hydroGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_CONSUMER: {
            EnergyConsumer energyConsumer = ( EnergyConsumer ) theEObject;
            T result = caseEnergyConsumer( energyConsumer );
            if( result == null ) result = caseEnergyConnection( energyConsumer );
            if( result == null ) result = caseConductingEquipment( energyConsumer );
            if( result == null ) result = caseEquipment( energyConsumer );
            if( result == null ) result = casePowerSystemResource( energyConsumer );
            if( result == null ) result = caseIdentifiedObject( energyConsumer );
            if( result == null ) result = caseCimObjectWithID( energyConsumer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_ELECTRONICS_CONNECTION: {
            PowerElectronicsConnection powerElectronicsConnection = ( PowerElectronicsConnection ) theEObject;
            T result = casePowerElectronicsConnection( powerElectronicsConnection );
            if( result == null ) result = caseRegulatingCondEq( powerElectronicsConnection );
            if( result == null ) result = caseEnergyConnection( powerElectronicsConnection );
            if( result == null ) result = caseConductingEquipment( powerElectronicsConnection );
            if( result == null ) result = caseEquipment( powerElectronicsConnection );
            if( result == null ) result = casePowerSystemResource( powerElectronicsConnection );
            if( result == null ) result = caseIdentifiedObject( powerElectronicsConnection );
            if( result == null ) result = caseCimObjectWithID( powerElectronicsConnection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT: {
            PhaseTapChangerTablePoint phaseTapChangerTablePoint = ( PhaseTapChangerTablePoint ) theEObject;
            T result = casePhaseTapChangerTablePoint( phaseTapChangerTablePoint );
            if( result == null ) result = caseTapChangerTablePoint( phaseTapChangerTablePoint );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerTablePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_SCHEDULING_TYPE: {
            EnergySchedulingType energySchedulingType = ( EnergySchedulingType ) theEObject;
            T result = caseEnergySchedulingType( energySchedulingType );
            if( result == null ) result = caseIdentifiedObject( energySchedulingType );
            if( result == null ) result = caseCimObjectWithID( energySchedulingType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_CONVERTER_UNIT: {
            DCConverterUnit dcConverterUnit = ( DCConverterUnit ) theEObject;
            T result = caseDCConverterUnit( dcConverterUnit );
            if( result == null ) result = caseDCEquipmentContainer( dcConverterUnit );
            if( result == null ) result = caseEquipmentContainer( dcConverterUnit );
            if( result == null ) result = caseConnectivityNodeContainer( dcConverterUnit );
            if( result == null ) result = casePowerSystemResource( dcConverterUnit );
            if( result == null ) result = caseIdentifiedObject( dcConverterUnit );
            if( result == null ) result = caseCimObjectWithID( dcConverterUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT: {
            RatioTapChangerTablePoint ratioTapChangerTablePoint = ( RatioTapChangerTablePoint ) theEObject;
            T result = caseRatioTapChangerTablePoint( ratioTapChangerTablePoint );
            if( result == null ) result = caseTapChangerTablePoint( ratioTapChangerTablePoint );
            if( result == null ) result = caseCimObjectWithID( ratioTapChangerTablePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EARTH_FAULT_COMPENSATOR: {
            EarthFaultCompensator earthFaultCompensator = ( EarthFaultCompensator ) theEObject;
            T result = caseEarthFaultCompensator( earthFaultCompensator );
            if( result == null ) result = caseConductingEquipment( earthFaultCompensator );
            if( result == null ) result = caseEquipment( earthFaultCompensator );
            if( result == null ) result = casePowerSystemResource( earthFaultCompensator );
            if( result == null ) result = caseIdentifiedObject( earthFaultCompensator );
            if( result == null ) result = caseCimObjectWithID( earthFaultCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_INJECTION: {
            EquivalentInjection equivalentInjection = ( EquivalentInjection ) theEObject;
            T result = caseEquivalentInjection( equivalentInjection );
            if( result == null ) result = caseEquivalentEquipment( equivalentInjection );
            if( result == null ) result = caseConductingEquipment( equivalentInjection );
            if( result == null ) result = caseEquipment( equivalentInjection );
            if( result == null ) result = casePowerSystemResource( equivalentInjection );
            if( result == null ) result = caseIdentifiedObject( equivalentInjection );
            if( result == null ) result = caseCimObjectWithID( equivalentInjection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NON_CONFORM_LOAD_GROUP: {
            NonConformLoadGroup nonConformLoadGroup = ( NonConformLoadGroup ) theEObject;
            T result = caseNonConformLoadGroup( nonConformLoadGroup );
            if( result == null ) result = caseLoadGroup( nonConformLoadGroup );
            if( result == null ) result = caseIdentifiedObject( nonConformLoadGroup );
            if( result == null ) result = caseCimObjectWithID( nonConformLoadGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINEAR_SHUNT_COMPENSATOR: {
            LinearShuntCompensator linearShuntCompensator = ( LinearShuntCompensator ) theEObject;
            T result = caseLinearShuntCompensator( linearShuntCompensator );
            if( result == null ) result = caseShuntCompensator( linearShuntCompensator );
            if( result == null ) result = caseRegulatingCondEq( linearShuntCompensator );
            if( result == null ) result = caseEnergyConnection( linearShuntCompensator );
            if( result == null ) result = caseConductingEquipment( linearShuntCompensator );
            if( result == null ) result = caseEquipment( linearShuntCompensator );
            if( result == null ) result = casePowerSystemResource( linearShuntCompensator );
            if( result == null ) result = caseIdentifiedObject( linearShuntCompensator );
            if( result == null ) result = caseCimObjectWithID( linearShuntCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POST_LINE_SENSOR: {
            PostLineSensor postLineSensor = ( PostLineSensor ) theEObject;
            T result = casePostLineSensor( postLineSensor );
            if( result == null ) result = caseSensor( postLineSensor );
            if( result == null ) result = caseAuxiliaryEquipment( postLineSensor );
            if( result == null ) result = caseEquipment( postLineSensor );
            if( result == null ) result = casePowerSystemResource( postLineSensor );
            if( result == null ) result = caseIdentifiedObject( postLineSensor );
            if( result == null ) result = caseCimObjectWithID( postLineSensor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_TABULAR: {
            PhaseTapChangerTabular phaseTapChangerTabular = ( PhaseTapChangerTabular ) theEObject;
            T result = casePhaseTapChangerTabular( phaseTapChangerTabular );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerTabular );
            if( result == null ) result = caseTapChanger( phaseTapChangerTabular );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerTabular );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerTabular );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerTabular );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BUS_NAME_MARKER: {
            BusNameMarker busNameMarker = ( BusNameMarker ) theEObject;
            T result = caseBusNameMarker( busNameMarker );
            if( result == null ) result = caseIdentifiedObject( busNameMarker );
            if( result == null ) result = caseCimObjectWithID( busNameMarker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_SOURCE: {
            EnergySource energySource = ( EnergySource ) theEObject;
            T result = caseEnergySource( energySource );
            if( result == null ) result = caseEnergyConnection( energySource );
            if( result == null ) result = caseConductingEquipment( energySource );
            if( result == null ) result = caseEquipment( energySource );
            if( result == null ) result = casePowerSystemResource( energySource );
            if( result == null ) result = caseIdentifiedObject( energySource );
            if( result == null ) result = caseCimObjectWithID( energySource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GENERATING_UNIT: {
            GeneratingUnit generatingUnit = ( GeneratingUnit ) theEObject;
            T result = caseGeneratingUnit( generatingUnit );
            if( result == null ) result = caseEquipment( generatingUnit );
            if( result == null ) result = casePowerSystemResource( generatingUnit );
            if( result == null ) result = caseIdentifiedObject( generatingUnit );
            if( result == null ) result = caseCimObjectWithID( generatingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASIC_INTERVAL_SCHEDULE: {
            BasicIntervalSchedule basicIntervalSchedule = ( BasicIntervalSchedule ) theEObject;
            T result = caseBasicIntervalSchedule( basicIntervalSchedule );
            if( result == null ) result = caseIdentifiedObject( basicIntervalSchedule );
            if( result == null ) result = caseCimObjectWithID( basicIntervalSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_EQUIPMENT: {
            EquivalentEquipment equivalentEquipment = ( EquivalentEquipment ) theEObject;
            T result = caseEquivalentEquipment( equivalentEquipment );
            if( result == null ) result = caseConductingEquipment( equivalentEquipment );
            if( result == null ) result = caseEquipment( equivalentEquipment );
            if( result == null ) result = casePowerSystemResource( equivalentEquipment );
            if( result == null ) result = caseIdentifiedObject( equivalentEquipment );
            if( result == null ) result = caseCimObjectWithID( equivalentEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULAR_TIME_POINT: {
            RegularTimePoint regularTimePoint = ( RegularTimePoint ) theEObject;
            T result = caseRegularTimePoint( regularTimePoint );
            if( result == null ) result = caseCimObjectWithID( regularTimePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULAR_INTERVAL_SCHEDULE: {
            RegularIntervalSchedule regularIntervalSchedule = ( RegularIntervalSchedule ) theEObject;
            T result = caseRegularIntervalSchedule( regularIntervalSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( regularIntervalSchedule );
            if( result == null ) result = caseIdentifiedObject( regularIntervalSchedule );
            if( result == null ) result = caseCimObjectWithID( regularIntervalSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECTIVITY_NODE_CONTAINER: {
            ConnectivityNodeContainer connectivityNodeContainer = ( ConnectivityNodeContainer ) theEObject;
            T result = caseConnectivityNodeContainer( connectivityNodeContainer );
            if( result == null ) result = casePowerSystemResource( connectivityNodeContainer );
            if( result == null ) result = caseIdentifiedObject( connectivityNodeContainer );
            if( result == null ) result = caseCimObjectWithID( connectivityNodeContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_AREA: {
            EnergyArea energyArea = ( EnergyArea ) theEObject;
            T result = caseEnergyArea( energyArea );
            if( result == null ) result = caseIdentifiedObject( energyArea );
            if( result == null ) result = caseCimObjectWithID( energyArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COGENERATION_PLANT: {
            CogenerationPlant cogenerationPlant = ( CogenerationPlant ) theEObject;
            T result = caseCogenerationPlant( cogenerationPlant );
            if( result == null ) result = casePowerSystemResource( cogenerationPlant );
            if( result == null ) result = caseIdentifiedObject( cogenerationPlant );
            if( result == null ) result = caseCimObjectWithID( cogenerationPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_TRANSFORMER: {
            PowerTransformer powerTransformer = ( PowerTransformer ) theEObject;
            T result = casePowerTransformer( powerTransformer );
            if( result == null ) result = caseConductingEquipment( powerTransformer );
            if( result == null ) result = caseEquipment( powerTransformer );
            if( result == null ) result = casePowerSystemResource( powerTransformer );
            if( result == null ) result = caseIdentifiedObject( powerTransformer );
            if( result == null ) result = caseCimObjectWithID( powerTransformer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_LIMIT_TYPE: {
            OperationalLimitType operationalLimitType = ( OperationalLimitType ) theEObject;
            T result = caseOperationalLimitType( operationalLimitType );
            if( result == null ) result = caseIdentifiedObject( operationalLimitType );
            if( result == null ) result = caseCimObjectWithID( operationalLimitType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GEOGRAPHICAL_REGION: {
            GeographicalRegion geographicalRegion = ( GeographicalRegion ) theEObject;
            T result = caseGeographicalRegion( geographicalRegion );
            if( result == null ) result = caseIdentifiedObject( geographicalRegion );
            if( result == null ) result = caseCimObjectWithID( geographicalRegion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFORM_LOAD_SCHEDULE: {
            ConformLoadSchedule conformLoadSchedule = ( ConformLoadSchedule ) theEObject;
            T result = caseConformLoadSchedule( conformLoadSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( conformLoadSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( conformLoadSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( conformLoadSchedule );
            if( result == null ) result = caseIdentifiedObject( conformLoadSchedule );
            if( result == null ) result = caseCimObjectWithID( conformLoadSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHUNT_COMPENSATOR: {
            ShuntCompensator shuntCompensator = ( ShuntCompensator ) theEObject;
            T result = caseShuntCompensator( shuntCompensator );
            if( result == null ) result = caseRegulatingCondEq( shuntCompensator );
            if( result == null ) result = caseEnergyConnection( shuntCompensator );
            if( result == null ) result = caseConductingEquipment( shuntCompensator );
            if( result == null ) result = caseEquipment( shuntCompensator );
            if( result == null ) result = casePowerSystemResource( shuntCompensator );
            if( result == null ) result = caseIdentifiedObject( shuntCompensator );
            if( result == null ) result = caseCimObjectWithID( shuntCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VISIBILITY_LAYER: {
            VisibilityLayer visibilityLayer = ( VisibilityLayer ) theEObject;
            T result = caseVisibilityLayer( visibilityLayer );
            if( result == null ) result = caseIdentifiedObject( visibilityLayer );
            if( result == null ) result = caseCimObjectWithID( visibilityLayer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT: {
            DiagramObjectGluePoint diagramObjectGluePoint = ( DiagramObjectGluePoint ) theEObject;
            T result = caseDiagramObjectGluePoint( diagramObjectGluePoint );
            if( result == null ) result = caseCimObjectWithID( diagramObjectGluePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM: {
            Diagram diagram = ( Diagram ) theEObject;
            T result = caseDiagram( diagram );
            if( result == null ) result = caseIdentifiedObject( diagram );
            if( result == null ) result = caseCimObjectWithID( diagram );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT_STYLE: {
            DiagramObjectStyle diagramObjectStyle = ( DiagramObjectStyle ) theEObject;
            T result = caseDiagramObjectStyle( diagramObjectStyle );
            if( result == null ) result = caseIdentifiedObject( diagramObjectStyle );
            if( result == null ) result = caseCimObjectWithID( diagramObjectStyle );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TEXT_DIAGRAM_OBJECT: {
            TextDiagramObject textDiagramObject = ( TextDiagramObject ) theEObject;
            T result = caseTextDiagramObject( textDiagramObject );
            if( result == null ) result = caseDiagramObject( textDiagramObject );
            if( result == null ) result = caseIdentifiedObject( textDiagramObject );
            if( result == null ) result = caseCimObjectWithID( textDiagramObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT: {
            DiagramObject diagramObject = ( DiagramObject ) theEObject;
            T result = caseDiagramObject( diagramObject );
            if( result == null ) result = caseIdentifiedObject( diagramObject );
            if( result == null ) result = caseCimObjectWithID( diagramObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_STYLE: {
            DiagramStyle diagramStyle = ( DiagramStyle ) theEObject;
            T result = caseDiagramStyle( diagramStyle );
            if( result == null ) result = caseIdentifiedObject( diagramStyle );
            if( result == null ) result = caseCimObjectWithID( diagramStyle );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT_POINT: {
            DiagramObjectPoint diagramObjectPoint = ( DiagramObjectPoint ) theEObject;
            T result = caseDiagramObjectPoint( diagramObjectPoint );
            if( result == null ) result = caseCimObjectWithID( diagramObjectPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED: {
            UnderexcitationLimiterUserDefined underexcitationLimiterUserDefined = ( UnderexcitationLimiterUserDefined ) theEObject;
            T result = caseUnderexcitationLimiterUserDefined( underexcitationLimiterUserDefined );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcitationLimiterUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcitationLimiterUserDefined );
            if( result == null ) result = caseIdentifiedObject( underexcitationLimiterUserDefined );
            if( result == null ) result = caseCimObjectWithID( underexcitationLimiterUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE3B: {
            PssIEEE3B pssIEEE3B = ( PssIEEE3B ) theEObject;
            T result = casePssIEEE3B( pssIEEE3B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE3B );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE3B );
            if( result == null ) result = caseIdentifiedObject( pssIEEE3B );
            if( result == null ) result = caseCimObjectWithID( pssIEEE3B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE2B: {
            PssIEEE2B pssIEEE2B = ( PssIEEE2B ) theEObject;
            T result = casePssIEEE2B( pssIEEE2B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE2B );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE2B );
            if( result == null ) result = caseIdentifiedObject( pssIEEE2B );
            if( result == null ) result = caseCimObjectWithID( pssIEEE2B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED: {
            DiscontinuousExcitationControlUserDefined discontinuousExcitationControlUserDefined = ( DiscontinuousExcitationControlUserDefined ) theEObject;
            T result = caseDiscontinuousExcitationControlUserDefined( discontinuousExcitationControlUserDefined );
            if( result == null )
                result = caseDiscontinuousExcitationControlDynamics( discontinuousExcitationControlUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( discontinuousExcitationControlUserDefined );
            if( result == null ) result = caseIdentifiedObject( discontinuousExcitationControlUserDefined );
            if( result == null ) result = caseCimObjectWithID( discontinuousExcitationControlUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_PIC: {
            ExcPIC excPIC = ( ExcPIC ) theEObject;
            T result = caseExcPIC( excPIC );
            if( result == null ) result = caseExcitationSystemDynamics( excPIC );
            if( result == null ) result = caseDynamicsFunctionBlock( excPIC );
            if( result == null ) result = caseIdentifiedObject( excPIC );
            if( result == null ) result = caseCimObjectWithID( excPIC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE4B: {
            PssIEEE4B pssIEEE4B = ( PssIEEE4B ) theEObject;
            T result = casePssIEEE4B( pssIEEE4B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE4B );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE4B );
            if( result == null ) result = caseIdentifiedObject( pssIEEE4B );
            if( result == null ) result = caseCimObjectWithID( pssIEEE4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS: {
            DiscontinuousExcitationControlDynamics discontinuousExcitationControlDynamics = ( DiscontinuousExcitationControlDynamics ) theEObject;
            T result = caseDiscontinuousExcitationControlDynamics( discontinuousExcitationControlDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( discontinuousExcitationControlDynamics );
            if( result == null ) result = caseIdentifiedObject( discontinuousExcitationControlDynamics );
            if( result == null ) result = caseCimObjectWithID( discontinuousExcitationControlDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE1A: {
            PssIEEE1A pssIEEE1A = ( PssIEEE1A ) theEObject;
            T result = casePssIEEE1A( pssIEEE1A );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE1A );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE1A );
            if( result == null ) result = caseIdentifiedObject( pssIEEE1A );
            if( result == null ) result = caseCimObjectWithID( pssIEEE1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VSC_USER_DEFINED: {
            VSCUserDefined vscUserDefined = ( VSCUserDefined ) theEObject;
            T result = caseVSCUserDefined( vscUserDefined );
            if( result == null ) result = caseVSCDynamics( vscUserDefined );
            if( result == null ) result = caseHVDCDynamics( vscUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( vscUserDefined );
            if( result == null ) result = caseIdentifiedObject( vscUserDefined );
            if( result == null ) result = caseCimObjectWithID( vscUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST: {
            GovGAST govGAST = ( GovGAST ) theEObject;
            T result = caseGovGAST( govGAST );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST );
            if( result == null ) result = caseIdentifiedObject( govGAST );
            if( result == null ) result = caseCimObjectWithID( govGAST );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_WECC: {
            PssWECC pssWECC = ( PssWECC ) theEObject;
            T result = casePssWECC( pssWECC );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssWECC );
            if( result == null ) result = caseDynamicsFunctionBlock( pssWECC );
            if( result == null ) result = caseIdentifiedObject( pssWECC );
            if( result == null ) result = caseCimObjectWithID( pssWECC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_AERO_ONE_DIM_IEC: {
            WindAeroOneDimIEC windAeroOneDimIEC = ( WindAeroOneDimIEC ) theEObject;
            T result = caseWindAeroOneDimIEC( windAeroOneDimIEC );
            if( result == null ) result = caseIdentifiedObject( windAeroOneDimIEC );
            if( result == null ) result = caseCimObjectWithID( windAeroOneDimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_SIMPLIFIED: {
            SynchronousMachineSimplified synchronousMachineSimplified = ( SynchronousMachineSimplified ) theEObject;
            T result = caseSynchronousMachineSimplified( synchronousMachineSimplified );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineSimplified );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineSimplified );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineSimplified );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineSimplified );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineSimplified );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT: {
            AsynchronousMachineEquivalentCircuit asynchronousMachineEquivalentCircuit = ( AsynchronousMachineEquivalentCircuit ) theEObject;
            T result = caseAsynchronousMachineEquivalentCircuit( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseAsynchronousMachineDynamics( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST1A: {
            ExcIEEEST1A excIEEEST1A = ( ExcIEEEST1A ) theEObject;
            T result = caseExcIEEEST1A( excIEEEST1A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST1A );
            if( result == null ) result = caseIdentifiedObject( excIEEEST1A );
            if( result == null ) result = caseCimObjectWithID( excIEEEST1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS: {
            TurbineLoadControllerDynamics turbineLoadControllerDynamics = ( TurbineLoadControllerDynamics ) theEObject;
            T result = caseTurbineLoadControllerDynamics( turbineLoadControllerDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineLoadControllerDynamics );
            if( result == null ) result = caseIdentifiedObject( turbineLoadControllerDynamics );
            if( result == null ) result = caseCimObjectWithID( turbineLoadControllerDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED: {
            SynchronousMachineDetailed synchronousMachineDetailed = ( SynchronousMachineDetailed ) theEObject;
            T result = caseSynchronousMachineDetailed( synchronousMachineDetailed );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineDetailed );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineDetailed );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineDetailed );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineDetailed );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineDetailed );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST2A: {
            ExcIEEEST2A excIEEEST2A = ( ExcIEEEST2A ) theEObject;
            T result = caseExcIEEEST2A( excIEEEST2A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST2A );
            if( result == null ) result = caseIdentifiedObject( excIEEEST2A );
            if( result == null ) result = caseCimObjectWithID( excIEEEST2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_HU: {
            ExcHU excHU = ( ExcHU ) theEObject;
            T result = caseExcHU( excHU );
            if( result == null ) result = caseExcitationSystemDynamics( excHU );
            if( result == null ) result = caseDynamicsFunctionBlock( excHU );
            if( result == null ) result = caseIdentifiedObject( excHU );
            if( result == null ) result = caseCimObjectWithID( excHU );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_CZ: {
            ExcCZ excCZ = ( ExcCZ ) theEObject;
            T result = caseExcCZ( excCZ );
            if( result == null ) result = caseExcitationSystemDynamics( excCZ );
            if( result == null ) result = caseDynamicsFunctionBlock( excCZ );
            if( result == null ) result = caseIdentifiedObject( excCZ );
            if( result == null ) result = caseCimObjectWithID( excCZ );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MECHANICAL_LOAD_DYNAMICS: {
            MechanicalLoadDynamics mechanicalLoadDynamics = ( MechanicalLoadDynamics ) theEObject;
            T result = caseMechanicalLoadDynamics( mechanicalLoadDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( mechanicalLoadDynamics );
            if( result == null ) result = caseIdentifiedObject( mechanicalLoadDynamics );
            if( result == null ) result = caseCimObjectWithID( mechanicalLoadDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS2_ST: {
            Pss2ST pss2ST = ( Pss2ST ) theEObject;
            T result = casePss2ST( pss2ST );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss2ST );
            if( result == null ) result = caseDynamicsFunctionBlock( pss2ST );
            if( result == null ) result = caseIdentifiedObject( pss2ST );
            if( result == null ) result = caseCimObjectWithID( pss2ST );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_SCRX: {
            ExcSCRX excSCRX = ( ExcSCRX ) theEObject;
            T result = caseExcSCRX( excSCRX );
            if( result == null ) result = caseExcitationSystemDynamics( excSCRX );
            if( result == null ) result = caseDynamicsFunctionBlock( excSCRX );
            if( result == null ) result = caseIdentifiedObject( excSCRX );
            if( result == null ) result = caseCimObjectWithID( excSCRX );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GASTWD: {
            GovGASTWD govGASTWD = ( GovGASTWD ) theEObject;
            T result = caseGovGASTWD( govGASTWD );
            if( result == null ) result = caseTurbineGovernorDynamics( govGASTWD );
            if( result == null ) result = caseDynamicsFunctionBlock( govGASTWD );
            if( result == null ) result = caseIdentifiedObject( govGASTWD );
            if( result == null ) result = caseCimObjectWithID( govGASTWD );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TYPE3OR4_USER_DEFINED: {
            WindType3or4UserDefined windType3or4UserDefined = ( WindType3or4UserDefined ) theEObject;
            T result = caseWindType3or4UserDefined( windType3or4UserDefined );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windType3or4UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( windType3or4UserDefined );
            if( result == null ) result = caseIdentifiedObject( windType3or4UserDefined );
            if( result == null ) result = caseCimObjectWithID( windType3or4UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO1: {
            GovHydro1 govHydro1 = ( GovHydro1 ) theEObject;
            T result = caseGovHydro1( govHydro1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro1 );
            if( result == null ) result = caseIdentifiedObject( govHydro1 );
            if( result == null ) result = caseCimObjectWithID( govHydro1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO2: {
            GovHydro2 govHydro2 = ( GovHydro2 ) theEObject;
            T result = caseGovHydro2( govHydro2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro2 );
            if( result == null ) result = caseIdentifiedObject( govHydro2 );
            if( result == null ) result = caseCimObjectWithID( govHydro2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO3: {
            GovHydro3 govHydro3 = ( GovHydro3 ) theEObject;
            T result = caseGovHydro3( govHydro3 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro3 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro3 );
            if( result == null ) result = caseIdentifiedObject( govHydro3 );
            if( result == null ) result = caseCimObjectWithID( govHydro3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO4: {
            GovHydro4 govHydro4 = ( GovHydro4 ) theEObject;
            T result = caseGovHydro4( govHydro4 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro4 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro4 );
            if( result == null ) result = caseIdentifiedObject( govHydro4 );
            if( result == null ) result = caseCimObjectWithID( govHydro4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS: {
            ProprietaryParameterDynamics proprietaryParameterDynamics = ( ProprietaryParameterDynamics ) theEObject;
            T result = caseProprietaryParameterDynamics( proprietaryParameterDynamics );
            if( result == null ) result = caseCimObjectWithID( proprietaryParameterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_NI: {
            ExcNI excNI = ( ExcNI ) theEObject;
            T result = caseExcNI( excNI );
            if( result == null ) result = caseExcitationSystemDynamics( excNI );
            if( result == null ) result = caseDynamicsFunctionBlock( excNI );
            if( result == null ) result = caseIdentifiedObject( excNI );
            if( result == null ) result = caseCimObjectWithID( excNI );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE4_IEC: {
            WindTurbineType4IEC windTurbineType4IEC = ( WindTurbineType4IEC ) theEObject;
            T result = caseWindTurbineType4IEC( windTurbineType4IEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType4IEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType4IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType4IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType4IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType4IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM2: {
            GovSteam2 govSteam2 = ( GovSteam2 ) theEObject;
            T result = caseGovSteam2( govSteam2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteam2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteam2 );
            if( result == null ) result = caseIdentifiedObject( govSteam2 );
            if( result == null ) result = caseCimObjectWithID( govSteam2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM1: {
            GovSteam1 govSteam1 = ( GovSteam1 ) theEObject;
            T result = caseGovSteam1( govSteam1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteam1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteam1 );
            if( result == null ) result = caseIdentifiedObject( govSteam1 );
            if( result == null ) result = caseCimObjectWithID( govSteam1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM0: {
            GovSteam0 govSteam0 = ( GovSteam0 ) theEObject;
            T result = caseGovSteam0( govSteam0 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteam0 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteam0 );
            if( result == null ) result = caseIdentifiedObject( govSteam0 );
            if( result == null ) result = caseCimObjectWithID( govSteam0 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_R: {
            GovHydroR govHydroR = ( GovHydroR ) theEObject;
            T result = caseGovHydroR( govHydroR );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroR );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroR );
            if( result == null ) result = caseIdentifiedObject( govHydroR );
            if( result == null ) result = caseCimObjectWithID( govHydroR );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS: {
            TurbineGovernorDynamics turbineGovernorDynamics = ( TurbineGovernorDynamics ) theEObject;
            T result = caseTurbineGovernorDynamics( turbineGovernorDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineGovernorDynamics );
            if( result == null ) result = caseIdentifiedObject( turbineGovernorDynamics );
            if( result == null ) result = caseCimObjectWithID( turbineGovernorDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_MOTOR: {
            LoadMotor loadMotor = ( LoadMotor ) theEObject;
            T result = caseLoadMotor( loadMotor );
            if( result == null ) result = caseIdentifiedObject( loadMotor );
            if( result == null ) result = caseCimObjectWithID( loadMotor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_QIEC: {
            WindContQIEC windContQIEC = ( WindContQIEC ) theEObject;
            T result = caseWindContQIEC( windContQIEC );
            if( result == null ) result = caseIdentifiedObject( windContQIEC );
            if( result == null ) result = caseCimObjectWithID( windContQIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE3A_IEC: {
            WindGenType3aIEC windGenType3aIEC = ( WindGenType3aIEC ) theEObject;
            T result = caseWindGenType3aIEC( windGenType3aIEC );
            if( result == null ) result = caseWindGenType3IEC( windGenType3aIEC );
            if( result == null ) result = caseIdentifiedObject( windGenType3aIEC );
            if( result == null ) result = caseCimObjectWithID( windGenType3aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_SK: {
            ExcSK excSK = ( ExcSK ) theEObject;
            T result = caseExcSK( excSK );
            if( result == null ) result = caseExcitationSystemDynamics( excSK );
            if( result == null ) result = caseDynamicsFunctionBlock( excSK );
            if( result == null ) result = caseIdentifiedObject( excSK );
            if( result == null ) result = caseCimObjectWithID( excSK );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ROTATING_MACHINE_DYNAMICS: {
            RotatingMachineDynamics rotatingMachineDynamics = ( RotatingMachineDynamics ) theEObject;
            T result = caseRotatingMachineDynamics( rotatingMachineDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( rotatingMachineDynamics );
            if( result == null ) result = caseIdentifiedObject( rotatingMachineDynamics );
            if( result == null ) result = caseCimObjectWithID( rotatingMachineDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS: {
            VoltageAdjusterDynamics voltageAdjusterDynamics = ( VoltageAdjusterDynamics ) theEObject;
            T result = caseVoltageAdjusterDynamics( voltageAdjusterDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageAdjusterDynamics );
            if( result == null ) result = caseIdentifiedObject( voltageAdjusterDynamics );
            if( result == null ) result = caseCimObjectWithID( voltageAdjusterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS: {
            PFVArControllerType2Dynamics pfvArControllerType2Dynamics = ( PFVArControllerType2Dynamics ) theEObject;
            T result = casePFVArControllerType2Dynamics( pfvArControllerType2Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType2Dynamics );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType2Dynamics );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType2Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED: {
            VoltageCompensatorUserDefined voltageCompensatorUserDefined = ( VoltageCompensatorUserDefined ) theEObject;
            T result = caseVoltageCompensatorUserDefined( voltageCompensatorUserDefined );
            if( result == null ) result = caseVoltageCompensatorDynamics( voltageCompensatorUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageCompensatorUserDefined );
            if( result == null ) result = caseIdentifiedObject( voltageCompensatorUserDefined );
            if( result == null ) result = caseCimObjectWithID( voltageCompensatorUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PITCH_CONT_POWER_IEC: {
            WindPitchContPowerIEC windPitchContPowerIEC = ( WindPitchContPowerIEC ) theEObject;
            T result = caseWindPitchContPowerIEC( windPitchContPowerIEC );
            if( result == null ) result = caseIdentifiedObject( windPitchContPowerIEC );
            if( result == null ) result = caseCimObjectWithID( windPitchContPowerIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC: {
            WindGenTurbineType1aIEC windGenTurbineType1aIEC = ( WindGenTurbineType1aIEC ) theEObject;
            T result = caseWindGenTurbineType1aIEC( windGenTurbineType1aIEC );
            if( result == null ) result = caseWindTurbineType1or2IEC( windGenTurbineType1aIEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windGenTurbineType1aIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windGenTurbineType1aIEC );
            if( result == null ) result = caseIdentifiedObject( windGenTurbineType1aIEC );
            if( result == null ) result = caseCimObjectWithID( windGenTurbineType1aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PROTECTION_IEC: {
            WindProtectionIEC windProtectionIEC = ( WindProtectionIEC ) theEObject;
            T result = caseWindProtectionIEC( windProtectionIEC );
            if( result == null ) result = caseIdentifiedObject( windProtectionIEC );
            if( result == null ) result = caseCimObjectWithID( windProtectionIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_REF_FRAME_ROT_IEC: {
            WindRefFrameRotIEC windRefFrameRotIEC = ( WindRefFrameRotIEC ) theEObject;
            T result = caseWindRefFrameRotIEC( windRefFrameRotIEC );
            if( result == null ) result = caseIdentifiedObject( windRefFrameRotIEC );
            if( result == null ) result = caseCimObjectWithID( windRefFrameRotIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_GENERIC_NON_LINEAR: {
            LoadGenericNonLinear loadGenericNonLinear = ( LoadGenericNonLinear ) theEObject;
            T result = caseLoadGenericNonLinear( loadGenericNonLinear );
            if( result == null ) result = caseLoadDynamics( loadGenericNonLinear );
            if( result == null ) result = caseIdentifiedObject( loadGenericNonLinear );
            if( result == null ) result = caseCimObjectWithID( loadGenericNonLinear );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC: {
            WindTurbineType1or2IEC windTurbineType1or2IEC = ( WindTurbineType1or2IEC ) theEObject;
            T result = caseWindTurbineType1or2IEC( windTurbineType1or2IEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windTurbineType1or2IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType1or2IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType1or2IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType1or2IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC: {
            WindGenTurbineType2IEC windGenTurbineType2IEC = ( WindGenTurbineType2IEC ) theEObject;
            T result = caseWindGenTurbineType2IEC( windGenTurbineType2IEC );
            if( result == null ) result = caseWindTurbineType1or2IEC( windGenTurbineType2IEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windGenTurbineType2IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windGenTurbineType2IEC );
            if( result == null ) result = caseIdentifiedObject( windGenTurbineType2IEC );
            if( result == null ) result = caseCimObjectWithID( windGenTurbineType2IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE3_IEC: {
            WindGenType3IEC windGenType3IEC = ( WindGenType3IEC ) theEObject;
            T result = caseWindGenType3IEC( windGenType3IEC );
            if( result == null ) result = caseIdentifiedObject( windGenType3IEC );
            if( result == null ) result = caseCimObjectWithID( windGenType3IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PTYPE3_IEC: {
            WindContPType3IEC windContPType3IEC = ( WindContPType3IEC ) theEObject;
            T result = caseWindContPType3IEC( windContPType3IEC );
            if( result == null ) result = caseIdentifiedObject( windContPType3IEC );
            if( result == null ) result = caseCimObjectWithID( windContPType3IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED: {
            UnderexcLim2Simplified underexcLim2Simplified = ( UnderexcLim2Simplified ) theEObject;
            T result = caseUnderexcLim2Simplified( underexcLim2Simplified );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLim2Simplified );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLim2Simplified );
            if( result == null ) result = caseIdentifiedObject( underexcLim2Simplified );
            if( result == null ) result = caseCimObjectWithID( underexcLim2Simplified );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_IEC: {
            WindPlantIEC windPlantIEC = ( WindPlantIEC ) theEObject;
            T result = caseWindPlantIEC( windPlantIEC );
            if( result == null ) result = caseWindPlantDynamics( windPlantIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windPlantIEC );
            if( result == null ) result = caseIdentifiedObject( windPlantIEC );
            if( result == null ) result = caseCimObjectWithID( windPlantIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS5: {
            Pss5 pss5 = ( Pss5 ) theEObject;
            T result = casePss5( pss5 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss5 );
            if( result == null ) result = caseDynamicsFunctionBlock( pss5 );
            if( result == null ) result = caseIdentifiedObject( pss5 );
            if( result == null ) result = caseCimObjectWithID( pss5 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE: {
            AsynchronousMachineTimeConstantReactance asynchronousMachineTimeConstantReactance = ( AsynchronousMachineTimeConstantReactance ) theEObject;
            T result = caseAsynchronousMachineTimeConstantReactance( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseAsynchronousMachineDynamics( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_STAB2A: {
            PssSTAB2A pssSTAB2A = ( PssSTAB2A ) theEObject;
            T result = casePssSTAB2A( pssSTAB2A );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSTAB2A );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSTAB2A );
            if( result == null ) result = caseIdentifiedObject( pssSTAB2A );
            if( result == null ) result = caseCimObjectWithID( pssSTAB2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS1: {
            Pss1 pss1 = ( Pss1 ) theEObject;
            T result = casePss1( pss1 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss1 );
            if( result == null ) result = caseDynamicsFunctionBlock( pss1 );
            if( result == null ) result = caseIdentifiedObject( pss1 );
            if( result == null ) result = caseCimObjectWithID( pss1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE4B_IEC: {
            WindTurbineType4bIEC windTurbineType4bIEC = ( WindTurbineType4bIEC ) theEObject;
            T result = caseWindTurbineType4bIEC( windTurbineType4bIEC );
            if( result == null ) result = caseWindTurbineType4IEC( windTurbineType4bIEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType4bIEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType4bIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType4bIEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType4bIEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType4bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED: {
            PFVArControllerType2UserDefined pfvArControllerType2UserDefined = ( PFVArControllerType2UserDefined ) theEObject;
            T result = casePFVArControllerType2UserDefined( pfvArControllerType2UserDefined );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArControllerType2UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType2UserDefined );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType2UserDefined );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType2UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_PID2: {
            GovHydroPID2 govHydroPID2 = ( GovHydroPID2 ) theEObject;
            T result = caseGovHydroPID2( govHydroPID2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroPID2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroPID2 );
            if( result == null ) result = caseIdentifiedObject( govHydroPID2 );
            if( result == null ) result = caseCimObjectWithID( govHydroPID2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_FRANCIS: {
            GovHydroFrancis govHydroFrancis = ( GovHydroFrancis ) theEObject;
            T result = caseGovHydroFrancis( govHydroFrancis );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroFrancis );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroFrancis );
            if( result == null ) result = caseIdentifiedObject( govHydroFrancis );
            if( result == null ) result = caseCimObjectWithID( govHydroFrancis );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CSC_DYNAMICS: {
            CSCDynamics cscDynamics = ( CSCDynamics ) theEObject;
            T result = caseCSCDynamics( cscDynamics );
            if( result == null ) result = caseHVDCDynamics( cscDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( cscDynamics );
            if( result == null ) result = caseIdentifiedObject( cscDynamics );
            if( result == null ) result = caseCimObjectWithID( cscDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS: {
            OverexcitationLimiterDynamics overexcitationLimiterDynamics = ( OverexcitationLimiterDynamics ) theEObject;
            T result = caseOverexcitationLimiterDynamics( overexcitationLimiterDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcitationLimiterDynamics );
            if( result == null ) result = caseIdentifiedObject( overexcitationLimiterDynamics );
            if( result == null ) result = caseCimObjectWithID( overexcitationLimiterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_RQB: {
            ExcRQB excRQB = ( ExcRQB ) theEObject;
            T result = caseExcRQB( excRQB );
            if( result == null ) result = caseExcitationSystemDynamics( excRQB );
            if( result == null ) result = caseDynamicsFunctionBlock( excRQB );
            if( result == null ) result = caseIdentifiedObject( excRQB );
            if( result == null ) result = caseCimObjectWithID( excRQB );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ANS: {
            ExcANS excANS = ( ExcANS ) theEObject;
            T result = caseExcANS( excANS );
            if( result == null ) result = caseExcitationSystemDynamics( excANS );
            if( result == null ) result = caseDynamicsFunctionBlock( excANS );
            if( result == null ) result = caseIdentifiedObject( excANS );
            if( result == null ) result = caseCimObjectWithID( excANS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_AGGREGATE: {
            LoadAggregate loadAggregate = ( LoadAggregate ) theEObject;
            T result = caseLoadAggregate( loadAggregate );
            if( result == null ) result = caseLoadDynamics( loadAggregate );
            if( result == null ) result = caseIdentifiedObject( loadAggregate );
            if( result == null ) result = caseCimObjectWithID( loadAggregate );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE3B_IEC: {
            WindGenType3bIEC windGenType3bIEC = ( WindGenType3bIEC ) theEObject;
            T result = caseWindGenType3bIEC( windGenType3bIEC );
            if( result == null ) result = caseWindGenType3IEC( windGenType3bIEC );
            if( result == null ) result = caseIdentifiedObject( windGenType3bIEC );
            if( result == null ) result = caseCimObjectWithID( windGenType3bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_IEEE1: {
            GovSteamIEEE1 govSteamIEEE1 = ( GovSteamIEEE1 ) theEObject;
            T result = caseGovSteamIEEE1( govSteamIEEE1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamIEEE1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamIEEE1 );
            if( result == null ) result = caseIdentifiedObject( govSteamIEEE1 );
            if( result == null ) result = caseCimObjectWithID( govSteamIEEE1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS: {
            UnderexcitationLimiterDynamics underexcitationLimiterDynamics = ( UnderexcitationLimiterDynamics ) theEObject;
            T result = caseUnderexcitationLimiterDynamics( underexcitationLimiterDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcitationLimiterDynamics );
            if( result == null ) result = caseIdentifiedObject( underexcitationLimiterDynamics );
            if( result == null ) result = caseCimObjectWithID( underexcitationLimiterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_WEH: {
            GovHydroWEH govHydroWEH = ( GovHydroWEH ) theEObject;
            T result = caseGovHydroWEH( govHydroWEH );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroWEH );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroWEH );
            if( result == null ) result = caseIdentifiedObject( govHydroWEH );
            if( result == null ) result = caseCimObjectWithID( govHydroWEH );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC3A1: {
            ExcDC3A1 excDC3A1 = ( ExcDC3A1 ) theEObject;
            T result = caseExcDC3A1( excDC3A1 );
            if( result == null ) result = caseExcitationSystemDynamics( excDC3A1 );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC3A1 );
            if( result == null ) result = caseIdentifiedObject( excDC3A1 );
            if( result == null ) result = caseCimObjectWithID( excDC3A1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS: {
            WindTurbineType1or2Dynamics windTurbineType1or2Dynamics = ( WindTurbineType1or2Dynamics ) theEObject;
            T result = caseWindTurbineType1or2Dynamics( windTurbineType1or2Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType1or2Dynamics );
            if( result == null ) result = caseIdentifiedObject( windTurbineType1or2Dynamics );
            if( result == null ) result = caseCimObjectWithID( windTurbineType1or2Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED: {
            OverexcitationLimiterUserDefined overexcitationLimiterUserDefined = ( OverexcitationLimiterUserDefined ) theEObject;
            T result = caseOverexcitationLimiterUserDefined( overexcitationLimiterUserDefined );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcitationLimiterUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcitationLimiterUserDefined );
            if( result == null ) result = caseIdentifiedObject( overexcitationLimiterUserDefined );
            if( result == null ) result = caseCimObjectWithID( overexcitationLimiterUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED: {
            TurbineLoadControllerUserDefined turbineLoadControllerUserDefined = ( TurbineLoadControllerUserDefined ) theEObject;
            T result = caseTurbineLoadControllerUserDefined( turbineLoadControllerUserDefined );
            if( result == null ) result = caseTurbineLoadControllerDynamics( turbineLoadControllerUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineLoadControllerUserDefined );
            if( result == null ) result = caseIdentifiedObject( turbineLoadControllerUserDefined );
            if( result == null ) result = caseCimObjectWithID( turbineLoadControllerUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC: {
            WindContPitchAngleIEC windContPitchAngleIEC = ( WindContPitchAngleIEC ) theEObject;
            T result = caseWindContPitchAngleIEC( windContPitchAngleIEC );
            if( result == null ) result = caseIdentifiedObject( windContPitchAngleIEC );
            if( result == null ) result = caseCimObjectWithID( windContPitchAngleIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_BBC: {
            ExcBBC excBBC = ( ExcBBC ) theEObject;
            T result = caseExcBBC( excBBC );
            if( result == null ) result = caseExcitationSystemDynamics( excBBC );
            if( result == null ) result = caseDynamicsFunctionBlock( excBBC );
            if( result == null ) result = caseIdentifiedObject( excBBC );
            if( result == null ) result = caseCimObjectWithID( excBBC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM_IEEE: {
            OverexcLimIEEE overexcLimIEEE = ( OverexcLimIEEE ) theEObject;
            T result = caseOverexcLimIEEE( overexcLimIEEE );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLimIEEE );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLimIEEE );
            if( result == null ) result = caseIdentifiedObject( overexcLimIEEE );
            if( result == null ) result = caseCimObjectWithID( overexcLimIEEE );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS: {
            WindTurbineType3or4Dynamics windTurbineType3or4Dynamics = ( WindTurbineType3or4Dynamics ) theEObject;
            T result = caseWindTurbineType3or4Dynamics( windTurbineType3or4Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType3or4Dynamics );
            if( result == null ) result = caseIdentifiedObject( windTurbineType3or4Dynamics );
            if( result == null ) result = caseCimObjectWithID( windTurbineType3or4Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_INPUT_SIGNAL: {
            RemoteInputSignal remoteInputSignal = ( RemoteInputSignal ) theEObject;
            T result = caseRemoteInputSignal( remoteInputSignal );
            if( result == null ) result = caseIdentifiedObject( remoteInputSignal );
            if( result == null ) result = caseCimObjectWithID( remoteInputSignal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR1: {
            ExcAVR1 excAVR1 = ( ExcAVR1 ) theEObject;
            T result = caseExcAVR1( excAVR1 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR1 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR1 );
            if( result == null ) result = caseIdentifiedObject( excAVR1 );
            if( result == null ) result = caseCimObjectWithID( excAVR1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR2: {
            ExcAVR2 excAVR2 = ( ExcAVR2 ) theEObject;
            T result = caseExcAVR2( excAVR2 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR2 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR2 );
            if( result == null ) result = caseIdentifiedObject( excAVR2 );
            if( result == null ) result = caseCimObjectWithID( excAVR2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR3: {
            ExcAVR3 excAVR3 = ( ExcAVR3 ) theEObject;
            T result = caseExcAVR3( excAVR3 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR3 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR3 );
            if( result == null ) result = caseIdentifiedObject( excAVR3 );
            if( result == null ) result = caseCimObjectWithID( excAVR3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR4: {
            ExcAVR4 excAVR4 = ( ExcAVR4 ) theEObject;
            T result = caseExcAVR4( excAVR4 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR4 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR4 );
            if( result == null ) result = caseIdentifiedObject( excAVR4 );
            if( result == null ) result = caseCimObjectWithID( excAVR4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR5: {
            ExcAVR5 excAVR5 = ( ExcAVR5 ) theEObject;
            T result = caseExcAVR5( excAVR5 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR5 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR5 );
            if( result == null ) result = caseIdentifiedObject( excAVR5 );
            if( result == null ) result = caseCimObjectWithID( excAVR5 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR7: {
            ExcAVR7 excAVR7 = ( ExcAVR7 ) theEObject;
            T result = caseExcAVR7( excAVR7 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR7 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR7 );
            if( result == null ) result = caseIdentifiedObject( excAVR7 );
            if( result == null ) result = caseCimObjectWithID( excAVR7 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER: {
            PFVArType2IEEEVArController pfvArType2IEEEVArController = ( PFVArType2IEEEVArController ) theEObject;
            T result = casePFVArType2IEEEVArController( pfvArType2IEEEVArController );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArType2IEEEVArController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType2IEEEVArController );
            if( result == null ) result = caseIdentifiedObject( pfvArType2IEEEVArController );
            if( result == null ) result = caseCimObjectWithID( pfvArType2IEEEVArController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC2A: {
            ExcIEEEAC2A excIEEEAC2A = ( ExcIEEEAC2A ) theEObject;
            T result = caseExcIEEEAC2A( excIEEEAC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC2A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC2A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_USER_DEFINED: {
            LoadUserDefined loadUserDefined = ( LoadUserDefined ) theEObject;
            T result = caseLoadUserDefined( loadUserDefined );
            if( result == null ) result = caseLoadDynamics( loadUserDefined );
            if( result == null ) result = caseIdentifiedObject( loadUserDefined );
            if( result == null ) result = caseCimObjectWithID( loadUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MECHANICAL_LOAD_USER_DEFINED: {
            MechanicalLoadUserDefined mechanicalLoadUserDefined = ( MechanicalLoadUserDefined ) theEObject;
            T result = caseMechanicalLoadUserDefined( mechanicalLoadUserDefined );
            if( result == null ) result = caseMechanicalLoadDynamics( mechanicalLoadUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( mechanicalLoadUserDefined );
            if( result == null ) result = caseIdentifiedObject( mechanicalLoadUserDefined );
            if( result == null ) result = caseCimObjectWithID( mechanicalLoadUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC1A: {
            ExcIEEEAC1A excIEEEAC1A = ( ExcIEEEAC1A ) theEObject;
            T result = caseExcIEEEAC1A( excIEEEAC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC1A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC1A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_IEEE0: {
            GovHydroIEEE0 govHydroIEEE0 = ( GovHydroIEEE0 ) theEObject;
            T result = caseGovHydroIEEE0( govHydroIEEE0 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroIEEE0 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroIEEE0 );
            if( result == null ) result = caseIdentifiedObject( govHydroIEEE0 );
            if( result == null ) result = caseCimObjectWithID( govHydroIEEE0 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_IEEE2: {
            GovHydroIEEE2 govHydroIEEE2 = ( GovHydroIEEE2 ) theEObject;
            T result = caseGovHydroIEEE2( govHydroIEEE2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroIEEE2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroIEEE2 );
            if( result == null ) result = caseIdentifiedObject( govHydroIEEE2 );
            if( result == null ) result = caseCimObjectWithID( govHydroIEEE2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC6A: {
            ExcIEEEAC6A excIEEEAC6A = ( ExcIEEEAC6A ) theEObject;
            T result = caseExcIEEEAC6A( excIEEEAC6A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC6A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC6A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC6A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC6A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC5A: {
            ExcIEEEAC5A excIEEEAC5A = ( ExcIEEEAC5A ) theEObject;
            T result = caseExcIEEEAC5A( excIEEEAC5A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC5A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC5A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC5A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC5A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS: {
            CrossCompoundTurbineGovernorDynamics crossCompoundTurbineGovernorDynamics = ( CrossCompoundTurbineGovernorDynamics ) theEObject;
            T result = caseCrossCompoundTurbineGovernorDynamics( crossCompoundTurbineGovernorDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( crossCompoundTurbineGovernorDynamics );
            if( result == null ) result = caseIdentifiedObject( crossCompoundTurbineGovernorDynamics );
            if( result == null ) result = caseCimObjectWithID( crossCompoundTurbineGovernorDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS: {
            StaticVarCompensatorDynamics staticVarCompensatorDynamics = ( StaticVarCompensatorDynamics ) theEObject;
            T result = caseStaticVarCompensatorDynamics( staticVarCompensatorDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( staticVarCompensatorDynamics );
            if( result == null ) result = caseIdentifiedObject( staticVarCompensatorDynamics );
            if( result == null ) result = caseCimObjectWithID( staticVarCompensatorDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC4A: {
            ExcIEEEAC4A excIEEEAC4A = ( ExcIEEEAC4A ) theEObject;
            T result = caseExcIEEEAC4A( excIEEEAC4A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC4A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC4A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC4A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC4A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC3A: {
            ExcIEEEAC3A excIEEEAC3A = ( ExcIEEEAC3A ) theEObject;
            T result = caseExcIEEEAC3A( excIEEEAC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC3A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC3A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXCITATION_SYSTEM_USER_DEFINED: {
            ExcitationSystemUserDefined excitationSystemUserDefined = ( ExcitationSystemUserDefined ) theEObject;
            T result = caseExcitationSystemUserDefined( excitationSystemUserDefined );
            if( result == null ) result = caseExcitationSystemDynamics( excitationSystemUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( excitationSystemUserDefined );
            if( result == null ) result = caseIdentifiedObject( excitationSystemUserDefined );
            if( result == null ) result = caseCimObjectWithID( excitationSystemUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TYPE1OR2_USER_DEFINED: {
            WindType1or2UserDefined windType1or2UserDefined = ( WindType1or2UserDefined ) theEObject;
            T result = caseWindType1or2UserDefined( windType1or2UserDefined );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windType1or2UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( windType1or2UserDefined );
            if( result == null ) result = caseIdentifiedObject( windType1or2UserDefined );
            if( result == null ) result = caseCimObjectWithID( windType1or2UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST4: {
            GovGAST4 govGAST4 = ( GovGAST4 ) theEObject;
            T result = caseGovGAST4( govGAST4 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST4 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST4 );
            if( result == null ) result = caseIdentifiedObject( govGAST4 );
            if( result == null ) result = caseCimObjectWithID( govGAST4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST3: {
            GovGAST3 govGAST3 = ( GovGAST3 ) theEObject;
            T result = caseGovGAST3( govGAST3 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST3 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST3 );
            if( result == null ) result = caseIdentifiedObject( govGAST3 );
            if( result == null ) result = caseCimObjectWithID( govGAST3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST2: {
            GovGAST2 govGAST2 = ( GovGAST2 ) theEObject;
            T result = caseGovGAST2( govGAST2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST2 );
            if( result == null ) result = caseIdentifiedObject( govGAST2 );
            if( result == null ) result = caseCimObjectWithID( govGAST2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST1: {
            GovGAST1 govGAST1 = ( GovGAST1 ) theEObject;
            T result = caseGovGAST1( govGAST1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST1 );
            if( result == null ) result = caseIdentifiedObject( govGAST1 );
            if( result == null ) result = caseCimObjectWithID( govGAST1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MECH_LOAD1: {
            MechLoad1 mechLoad1 = ( MechLoad1 ) theEObject;
            T result = caseMechLoad1( mechLoad1 );
            if( result == null ) result = caseMechanicalLoadDynamics( mechLoad1 );
            if( result == null ) result = caseDynamicsFunctionBlock( mechLoad1 );
            if( result == null ) result = caseIdentifiedObject( mechLoad1 );
            if( result == null ) result = caseCimObjectWithID( mechLoad1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER: {
            PFVArType1IEEEVArController pfvArType1IEEEVArController = ( PFVArType1IEEEVArController ) theEObject;
            T result = casePFVArType1IEEEVArController( pfvArType1IEEEVArController );
            if( result == null ) result = casePFVArControllerType1Dynamics( pfvArType1IEEEVArController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType1IEEEVArController );
            if( result == null ) result = caseIdentifiedObject( pfvArType1IEEEVArController );
            if( result == null ) result = caseCimObjectWithID( pfvArType1IEEEVArController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_ROTOR_RIEC: {
            WindContRotorRIEC windContRotorRIEC = ( WindContRotorRIEC ) theEObject;
            T result = caseWindContRotorRIEC( windContRotorRIEC );
            if( result == null ) result = caseIdentifiedObject( windContRotorRIEC );
            if( result == null ) result = caseCimObjectWithID( windContRotorRIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER: {
            PFVArType2IEEEPFController pfvArType2IEEEPFController = ( PFVArType2IEEEPFController ) theEObject;
            T result = casePFVArType2IEEEPFController( pfvArType2IEEEPFController );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArType2IEEEPFController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType2IEEEPFController );
            if( result == null ) result = caseIdentifiedObject( pfvArType2IEEEPFController );
            if( result == null ) result = caseCimObjectWithID( pfvArType2IEEEPFController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VADJ_IEEE: {
            VAdjIEEE vAdjIEEE = ( VAdjIEEE ) theEObject;
            T result = caseVAdjIEEE( vAdjIEEE );
            if( result == null ) result = caseVoltageAdjusterDynamics( vAdjIEEE );
            if( result == null ) result = caseDynamicsFunctionBlock( vAdjIEEE );
            if( result == null ) result = caseIdentifiedObject( vAdjIEEE );
            if( result == null ) result = caseCimObjectWithID( vAdjIEEE );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT: {
            SynchronousMachineEquivalentCircuit synchronousMachineEquivalentCircuit = ( SynchronousMachineEquivalentCircuit ) theEObject;
            T result = caseSynchronousMachineEquivalentCircuit( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseSynchronousMachineDetailed( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineEquivalentCircuit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_DYNAMICS: {
            WindPlantDynamics windPlantDynamics = ( WindPlantDynamics ) theEObject;
            T result = caseWindPlantDynamics( windPlantDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( windPlantDynamics );
            if( result == null ) result = caseIdentifiedObject( windPlantDynamics );
            if( result == null ) result = caseCimObjectWithID( windPlantDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ELIN1: {
            ExcELIN1 excELIN1 = ( ExcELIN1 ) theEObject;
            T result = caseExcELIN1( excELIN1 );
            if( result == null ) result = caseExcitationSystemDynamics( excELIN1 );
            if( result == null ) result = caseDynamicsFunctionBlock( excELIN1 );
            if( result == null ) result = caseIdentifiedObject( excELIN1 );
            if( result == null ) result = caseCimObjectWithID( excELIN1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ELIN2: {
            ExcELIN2 excELIN2 = ( ExcELIN2 ) theEObject;
            T result = caseExcELIN2( excELIN2 );
            if( result == null ) result = caseExcitationSystemDynamics( excELIN2 );
            if( result == null ) result = caseDynamicsFunctionBlock( excELIN2 );
            if( result == null ) result = caseIdentifiedObject( excELIN2 );
            if( result == null ) result = caseCimObjectWithID( excELIN2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED: {
            AsynchronousMachineUserDefined asynchronousMachineUserDefined = ( AsynchronousMachineUserDefined ) theEObject;
            T result = caseAsynchronousMachineUserDefined( asynchronousMachineUserDefined );
            if( result == null ) result = caseAsynchronousMachineDynamics( asynchronousMachineUserDefined );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineUserDefined );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineUserDefined );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST4B: {
            ExcST4B excST4B = ( ExcST4B ) theEObject;
            T result = caseExcST4B( excST4B );
            if( result == null ) result = caseExcitationSystemDynamics( excST4B );
            if( result == null ) result = caseDynamicsFunctionBlock( excST4B );
            if( result == null ) result = caseIdentifiedObject( excST4B );
            if( result == null ) result = caseCimObjectWithID( excST4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST3A: {
            ExcST3A excST3A = ( ExcST3A ) theEObject;
            T result = caseExcST3A( excST3A );
            if( result == null ) result = caseExcitationSystemDynamics( excST3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excST3A );
            if( result == null ) result = caseIdentifiedObject( excST3A );
            if( result == null ) result = caseCimObjectWithID( excST3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST2A: {
            ExcST2A excST2A = ( ExcST2A ) theEObject;
            T result = caseExcST2A( excST2A );
            if( result == null ) result = caseExcitationSystemDynamics( excST2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excST2A );
            if( result == null ) result = caseIdentifiedObject( excST2A );
            if( result == null ) result = caseCimObjectWithID( excST2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC8B: {
            ExcIEEEAC8B excIEEEAC8B = ( ExcIEEEAC8B ) theEObject;
            T result = caseExcIEEEAC8B( excIEEEAC8B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC8B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC8B );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC8B );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC8B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST1A: {
            ExcST1A excST1A = ( ExcST1A ) theEObject;
            T result = caseExcST1A( excST1A );
            if( result == null ) result = caseExcitationSystemDynamics( excST1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excST1A );
            if( result == null ) result = caseIdentifiedObject( excST1A );
            if( result == null ) result = caseCimObjectWithID( excST1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC7B: {
            ExcIEEEAC7B excIEEEAC7B = ( ExcIEEEAC7B ) theEObject;
            T result = caseExcIEEEAC7B( excIEEEAC7B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC7B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC7B );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC7B );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC7B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_SGO: {
            GovSteamSGO govSteamSGO = ( GovSteamSGO ) theEObject;
            T result = caseGovSteamSGO( govSteamSGO );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamSGO );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamSGO );
            if( result == null ) result = caseIdentifiedObject( govSteamSGO );
            if( result == null ) result = caseCimObjectWithID( govSteamSGO );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC: {
            WindPlantFreqPcontrolIEC windPlantFreqPcontrolIEC = ( WindPlantFreqPcontrolIEC ) theEObject;
            T result = caseWindPlantFreqPcontrolIEC( windPlantFreqPcontrolIEC );
            if( result == null ) result = caseIdentifiedObject( windPlantFreqPcontrolIEC );
            if( result == null ) result = caseCimObjectWithID( windPlantFreqPcontrolIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST7B: {
            ExcST7B excST7B = ( ExcST7B ) theEObject;
            T result = caseExcST7B( excST7B );
            if( result == null ) result = caseExcitationSystemDynamics( excST7B );
            if( result == null ) result = caseDynamicsFunctionBlock( excST7B );
            if( result == null ) result = caseIdentifiedObject( excST7B );
            if( result == null ) result = caseCimObjectWithID( excST7B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED: {
            PowerSystemStabilizerUserDefined powerSystemStabilizerUserDefined = ( PowerSystemStabilizerUserDefined ) theEObject;
            T result = casePowerSystemStabilizerUserDefined( powerSystemStabilizerUserDefined );
            if( result == null ) result = casePowerSystemStabilizerDynamics( powerSystemStabilizerUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( powerSystemStabilizerUserDefined );
            if( result == null ) result = caseIdentifiedObject( powerSystemStabilizerUserDefined );
            if( result == null ) result = caseCimObjectWithID( powerSystemStabilizerUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DYNAMICS_FUNCTION_BLOCK: {
            DynamicsFunctionBlock dynamicsFunctionBlock = ( DynamicsFunctionBlock ) theEObject;
            T result = caseDynamicsFunctionBlock( dynamicsFunctionBlock );
            if( result == null ) result = caseIdentifiedObject( dynamicsFunctionBlock );
            if( result == null ) result = caseCimObjectWithID( dynamicsFunctionBlock );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_PID: {
            GovHydroPID govHydroPID = ( GovHydroPID ) theEObject;
            T result = caseGovHydroPID( govHydroPID );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroPID );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroPID );
            if( result == null ) result = caseIdentifiedObject( govHydroPID );
            if( result == null ) result = caseCimObjectWithID( govHydroPID );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST6B: {
            ExcST6B excST6B = ( ExcST6B ) theEObject;
            T result = caseExcST6B( excST6B );
            if( result == null ) result = caseExcitationSystemDynamics( excST6B );
            if( result == null ) result = caseDynamicsFunctionBlock( excST6B );
            if( result == null ) result = caseIdentifiedObject( excST6B );
            if( result == null ) result = caseCimObjectWithID( excST6B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PTYPE4B_IEC: {
            WindContPType4bIEC windContPType4bIEC = ( WindContPType4bIEC ) theEObject;
            T result = caseWindContPType4bIEC( windContPType4bIEC );
            if( result == null ) result = caseIdentifiedObject( windContPType4bIEC );
            if( result == null ) result = caseCimObjectWithID( windContPType4bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_PELTON: {
            GovHydroPelton govHydroPelton = ( GovHydroPelton ) theEObject;
            T result = caseGovHydroPelton( govHydroPelton );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroPelton );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroPelton );
            if( result == null ) result = caseIdentifiedObject( govHydroPelton );
            if( result == null ) result = caseCimObjectWithID( govHydroPelton );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VSC_DYNAMICS: {
            VSCDynamics vscDynamics = ( VSCDynamics ) theEObject;
            T result = caseVSCDynamics( vscDynamics );
            if( result == null ) result = caseHVDCDynamics( vscDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( vscDynamics );
            if( result == null ) result = caseIdentifiedObject( vscDynamics );
            if( result == null ) result = caseCimObjectWithID( vscDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_DYNAMICS: {
            LoadDynamics loadDynamics = ( LoadDynamics ) theEObject;
            T result = caseLoadDynamics( loadDynamics );
            if( result == null ) result = caseIdentifiedObject( loadDynamics );
            if( result == null ) result = caseCimObjectWithID( loadDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_ELIN2: {
            PssELIN2 pssELIN2 = ( PssELIN2 ) theEObject;
            T result = casePssELIN2( pssELIN2 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssELIN2 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssELIN2 );
            if( result == null ) result = caseIdentifiedObject( pssELIN2 );
            if( result == null ) result = caseCimObjectWithID( pssELIN2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE: {
            SynchronousMachineTimeConstantReactance synchronousMachineTimeConstantReactance = ( SynchronousMachineTimeConstantReactance ) theEObject;
            T result = caseSynchronousMachineTimeConstantReactance( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseSynchronousMachineDetailed( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineTimeConstantReactance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_CT1: {
            GovCT1 govCT1 = ( GovCT1 ) theEObject;
            T result = caseGovCT1( govCT1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govCT1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govCT1 );
            if( result == null ) result = caseIdentifiedObject( govCT1 );
            if( result == null ) result = caseCimObjectWithID( govCT1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_CT2: {
            GovCT2 govCT2 = ( GovCT2 ) theEObject;
            T result = caseGovCT2( govCT2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govCT2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govCT2 );
            if( result == null ) result = caseIdentifiedObject( govCT2 );
            if( result == null ) result = caseCimObjectWithID( govCT2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC1A: {
            ExcIEEEDC1A excIEEEDC1A = ( ExcIEEEDC1A ) theEObject;
            T result = caseExcIEEEDC1A( excIEEEDC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC1A );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC1A );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_QPQU_LIM_IEC: {
            WindContQPQULimIEC windContQPQULimIEC = ( WindContQPQULimIEC ) theEObject;
            T result = caseWindContQPQULimIEC( windContQPQULimIEC );
            if( result == null ) result = caseIdentifiedObject( windContQPQULimIEC );
            if( result == null ) result = caseCimObjectWithID( windContQPQULimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC4B: {
            ExcIEEEDC4B excIEEEDC4B = ( ExcIEEEDC4B ) theEObject;
            T result = caseExcIEEEDC4B( excIEEEDC4B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC4B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC4B );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC4B );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC3A: {
            ExcIEEEDC3A excIEEEDC3A = ( ExcIEEEDC3A ) theEObject;
            T result = caseExcIEEEDC3A( excIEEEDC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC3A );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC3A );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC2A: {
            ExcIEEEDC2A excIEEEDC2A = ( ExcIEEEDC2A ) theEObject;
            T result = caseExcIEEEDC2A( excIEEEDC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC2A );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC2A );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CSC_USER_DEFINED: {
            CSCUserDefined cscUserDefined = ( CSCUserDefined ) theEObject;
            T result = caseCSCUserDefined( cscUserDefined );
            if( result == null ) result = caseCSCDynamics( cscUserDefined );
            if( result == null ) result = caseHVDCDynamics( cscUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( cscUserDefined );
            if( result == null ) result = caseIdentifiedObject( cscUserDefined );
            if( result == null ) result = caseCimObjectWithID( cscUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_STATIC: {
            LoadStatic loadStatic = ( LoadStatic ) theEObject;
            T result = caseLoadStatic( loadStatic );
            if( result == null ) result = caseIdentifiedObject( loadStatic );
            if( result == null ) result = caseCimObjectWithID( loadStatic );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_AERO_TWO_DIM_IEC: {
            WindAeroTwoDimIEC windAeroTwoDimIEC = ( WindAeroTwoDimIEC ) theEObject;
            T result = caseWindAeroTwoDimIEC( windAeroTwoDimIEC );
            if( result == null ) result = caseIdentifiedObject( windAeroTwoDimIEC );
            if( result == null ) result = caseCimObjectWithID( windAeroTwoDimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_CURR_LIM_IEC: {
            WindContCurrLimIEC windContCurrLimIEC = ( WindContCurrLimIEC ) theEObject;
            T result = caseWindContCurrLimIEC( windContCurrLimIEC );
            if( result == null ) result = caseIdentifiedObject( windContCurrLimIEC );
            if( result == null ) result = caseCimObjectWithID( windContCurrLimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_PTIST1: {
            PssPTIST1 pssPTIST1 = ( PssPTIST1 ) theEObject;
            T result = casePssPTIST1( pssPTIST1 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssPTIST1 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssPTIST1 );
            if( result == null ) result = caseIdentifiedObject( pssPTIST1 );
            if( result == null ) result = caseCimObjectWithID( pssPTIST1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_PTIST3: {
            PssPTIST3 pssPTIST3 = ( PssPTIST3 ) theEObject;
            T result = casePssPTIST3( pssPTIST3 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssPTIST3 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssPTIST3 );
            if( result == null ) result = caseIdentifiedObject( pssPTIST3 );
            if( result == null ) result = caseCimObjectWithID( pssPTIST3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_WPID: {
            GovHydroWPID govHydroWPID = ( GovHydroWPID ) theEObject;
            T result = caseGovHydroWPID( govHydroWPID );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroWPID );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroWPID );
            if( result == null ) result = caseIdentifiedObject( govHydroWPID );
            if( result == null ) result = caseCimObjectWithID( govHydroWPID );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS: {
            PFVArControllerType1Dynamics pfvArControllerType1Dynamics = ( PFVArControllerType1Dynamics ) theEObject;
            T result = casePFVArControllerType1Dynamics( pfvArControllerType1Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType1Dynamics );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType1Dynamics );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType1Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_QLIM_IEC: {
            WindContQLimIEC windContQLimIEC = ( WindContQLimIEC ) theEObject;
            T result = caseWindContQLimIEC( windContQLimIEC );
            if( result == null ) result = caseIdentifiedObject( windContQLimIEC );
            if( result == null ) result = caseCimObjectWithID( windContQLimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS: {
            VoltageCompensatorDynamics voltageCompensatorDynamics = ( VoltageCompensatorDynamics ) theEObject;
            T result = caseVoltageCompensatorDynamics( voltageCompensatorDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageCompensatorDynamics );
            if( result == null ) result = caseIdentifiedObject( voltageCompensatorDynamics );
            if( result == null ) result = caseCimObjectWithID( voltageCompensatorDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED: {
            SynchronousMachineUserDefined synchronousMachineUserDefined = ( SynchronousMachineUserDefined ) theEObject;
            T result = caseSynchronousMachineUserDefined( synchronousMachineUserDefined );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineUserDefined );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineUserDefined );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineUserDefined );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J: {
            GenICompensationForGenJ genICompensationForGenJ = ( GenICompensationForGenJ ) theEObject;
            T result = caseGenICompensationForGenJ( genICompensationForGenJ );
            if( result == null ) result = caseIdentifiedObject( genICompensationForGenJ );
            if( result == null ) result = caseCimObjectWithID( genICompensationForGenJ );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_REXS: {
            ExcREXS excREXS = ( ExcREXS ) theEObject;
            T result = caseExcREXS( excREXS );
            if( result == null ) result = caseExcitationSystemDynamics( excREXS );
            if( result == null ) result = caseDynamicsFunctionBlock( excREXS );
            if( result == null ) result = caseIdentifiedObject( excREXS );
            if( result == null ) result = caseCimObjectWithID( excREXS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS: {
            AsynchronousMachineDynamics asynchronousMachineDynamics = ( AsynchronousMachineDynamics ) theEObject;
            T result = caseAsynchronousMachineDynamics( asynchronousMachineDynamics );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineDynamics );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineDynamics );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE2_COMMON1: {
            PFVArType2Common1 pfvArType2Common1 = ( PFVArType2Common1 ) theEObject;
            T result = casePFVArType2Common1( pfvArType2Common1 );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArType2Common1 );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType2Common1 );
            if( result == null ) result = caseIdentifiedObject( pfvArType2Common1 );
            if( result == null ) result = caseCimObjectWithID( pfvArType2Common1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_AERO_CONST_IEC: {
            WindAeroConstIEC windAeroConstIEC = ( WindAeroConstIEC ) theEObject;
            T result = caseWindAeroConstIEC( windAeroConstIEC );
            if( result == null ) result = caseIdentifiedObject( windAeroConstIEC );
            if( result == null ) result = caseCimObjectWithID( windAeroConstIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HVDC_DYNAMICS: {
            HVDCDynamics hvdcDynamics = ( HVDCDynamics ) theEObject;
            T result = caseHVDCDynamics( hvdcDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( hvdcDynamics );
            if( result == null ) result = caseIdentifiedObject( hvdcDynamics );
            if( result == null ) result = caseCimObjectWithID( hvdcDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_GOVERNOR_USER_DEFINED: {
            TurbineGovernorUserDefined turbineGovernorUserDefined = ( TurbineGovernorUserDefined ) theEObject;
            T result = caseTurbineGovernorUserDefined( turbineGovernorUserDefined );
            if( result == null ) result = caseTurbineGovernorDynamics( turbineGovernorUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineGovernorUserDefined );
            if( result == null ) result = caseIdentifiedObject( turbineGovernorUserDefined );
            if( result == null ) result = caseCimObjectWithID( turbineGovernorUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER: {
            PFVArType1IEEEPFController pfvArType1IEEEPFController = ( PFVArType1IEEEPFController ) theEObject;
            T result = casePFVArType1IEEEPFController( pfvArType1IEEEPFController );
            if( result == null ) result = casePFVArControllerType1Dynamics( pfvArType1IEEEPFController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType1IEEEPFController );
            if( result == null ) result = caseIdentifiedObject( pfvArType1IEEEPFController );
            if( result == null ) result = caseCimObjectWithID( pfvArType1IEEEPFController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC3A: {
            ExcDC3A excDC3A = ( ExcDC3A ) theEObject;
            T result = caseExcDC3A( excDC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excDC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC3A );
            if( result == null ) result = caseIdentifiedObject( excDC3A );
            if( result == null ) result = caseCimObjectWithID( excDC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS2_B: {
            Pss2B pss2B = ( Pss2B ) theEObject;
            T result = casePss2B( pss2B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss2B );
            if( result == null ) result = caseDynamicsFunctionBlock( pss2B );
            if( result == null ) result = caseIdentifiedObject( pss2B );
            if( result == null ) result = caseCimObjectWithID( pss2B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC2A: {
            ExcDC2A excDC2A = ( ExcDC2A ) theEObject;
            T result = caseExcDC2A( excDC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excDC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC2A );
            if( result == null ) result = caseIdentifiedObject( excDC2A );
            if( result == null ) result = caseCimObjectWithID( excDC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC: {
            WindPlantReactiveControlIEC windPlantReactiveControlIEC = ( WindPlantReactiveControlIEC ) theEObject;
            T result = caseWindPlantReactiveControlIEC( windPlantReactiveControlIEC );
            if( result == null ) result = caseIdentifiedObject( windPlantReactiveControlIEC );
            if( result == null ) result = caseCimObjectWithID( windPlantReactiveControlIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_CC: {
            GovSteamCC govSteamCC = ( GovSteamCC ) theEObject;
            T result = caseGovSteamCC( govSteamCC );
            if( result == null ) result = caseCrossCompoundTurbineGovernorDynamics( govSteamCC );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamCC );
            if( result == null ) result = caseIdentifiedObject( govSteamCC );
            if( result == null ) result = caseCimObjectWithID( govSteamCC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC1A: {
            ExcDC1A excDC1A = ( ExcDC1A ) theEObject;
            T result = caseExcDC1A( excDC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excDC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC1A );
            if( result == null ) result = caseIdentifiedObject( excDC1A );
            if( result == null ) result = caseCimObjectWithID( excDC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM2: {
            OverexcLim2 overexcLim2 = ( OverexcLim2 ) theEObject;
            T result = caseOverexcLim2( overexcLim2 );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLim2 );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLim2 );
            if( result == null ) result = caseIdentifiedObject( overexcLim2 );
            if( result == null ) result = caseCimObjectWithID( overexcLim2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_EU: {
            GovSteamEU govSteamEU = ( GovSteamEU ) theEObject;
            T result = caseGovSteamEU( govSteamEU );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamEU );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamEU );
            if( result == null ) result = caseIdentifiedObject( govSteamEU );
            if( result == null ) result = caseCimObjectWithID( govSteamEU );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE: {
            WindDynamicsLookupTable windDynamicsLookupTable = ( WindDynamicsLookupTable ) theEObject;
            T result = caseWindDynamicsLookupTable( windDynamicsLookupTable );
            if( result == null ) result = caseIdentifiedObject( windDynamicsLookupTable );
            if( result == null ) result = caseCimObjectWithID( windDynamicsLookupTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS1_A: {
            Pss1A pss1A = ( Pss1A ) theEObject;
            T result = casePss1A( pss1A );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss1A );
            if( result == null ) result = caseDynamicsFunctionBlock( pss1A );
            if( result == null ) result = caseIdentifiedObject( pss1A );
            if( result == null ) result = caseCimObjectWithID( pss1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED: {
            VoltageAdjusterUserDefined voltageAdjusterUserDefined = ( VoltageAdjusterUserDefined ) theEObject;
            T result = caseVoltageAdjusterUserDefined( voltageAdjusterUserDefined );
            if( result == null ) result = caseVoltageAdjusterDynamics( voltageAdjusterUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageAdjusterUserDefined );
            if( result == null ) result = caseIdentifiedObject( voltageAdjusterUserDefined );
            if( result == null ) result = caseCimObjectWithID( voltageAdjusterUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS: {
            SynchronousMachineDynamics synchronousMachineDynamics = ( SynchronousMachineDynamics ) theEObject;
            T result = caseSynchronousMachineDynamics( synchronousMachineDynamics );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineDynamics );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineDynamics );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_BB: {
            GovSteamBB govSteamBB = ( GovSteamBB ) theEObject;
            T result = caseGovSteamBB( govSteamBB );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamBB );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamBB );
            if( result == null ) result = caseIdentifiedObject( govSteamBB );
            if( result == null ) result = caseCimObjectWithID( govSteamBB );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_X2: {
            UnderexcLimX2 underexcLimX2 = ( UnderexcLimX2 ) theEObject;
            T result = caseUnderexcLimX2( underexcLimX2 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimX2 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimX2 );
            if( result == null ) result = caseIdentifiedObject( underexcLimX2 );
            if( result == null ) result = caseCimObjectWithID( underexcLimX2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_X1: {
            UnderexcLimX1 underexcLimX1 = ( UnderexcLimX1 ) theEObject;
            T result = caseUnderexcLimX1( underexcLimX1 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimX1 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimX1 );
            if( result == null ) result = caseIdentifiedObject( underexcLimX1 );
            if( result == null ) result = caseCimObjectWithID( underexcLimX1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE4_IEC: {
            WindGenType4IEC windGenType4IEC = ( WindGenType4IEC ) theEObject;
            T result = caseWindGenType4IEC( windGenType4IEC );
            if( result == null ) result = caseIdentifiedObject( windGenType4IEC );
            if( result == null ) result = caseCimObjectWithID( windGenType4IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED: {
            PFVArControllerType1UserDefined pfvArControllerType1UserDefined = ( PFVArControllerType1UserDefined ) theEObject;
            T result = casePFVArControllerType1UserDefined( pfvArControllerType1UserDefined );
            if( result == null ) result = casePFVArControllerType1Dynamics( pfvArControllerType1UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType1UserDefined );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType1UserDefined );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType1UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_OEX3T: {
            ExcOEX3T excOEX3T = ( ExcOEX3T ) theEObject;
            T result = caseExcOEX3T( excOEX3T );
            if( result == null ) result = caseExcitationSystemDynamics( excOEX3T );
            if( result == null ) result = caseDynamicsFunctionBlock( excOEX3T );
            if( result == null ) result = caseIdentifiedObject( excOEX3T );
            if( result == null ) result = caseCimObjectWithID( excOEX3T );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC: {
            WindGenTurbineType1bIEC windGenTurbineType1bIEC = ( WindGenTurbineType1bIEC ) theEObject;
            T result = caseWindGenTurbineType1bIEC( windGenTurbineType1bIEC );
            if( result == null ) result = caseWindTurbineType1or2IEC( windGenTurbineType1bIEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windGenTurbineType1bIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windGenTurbineType1bIEC );
            if( result == null ) result = caseIdentifiedObject( windGenTurbineType1bIEC );
            if( result == null ) result = caseCimObjectWithID( windGenTurbineType1bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_SB4: {
            PssSB4 pssSB4 = ( PssSB4 ) theEObject;
            T result = casePssSB4( pssSB4 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSB4 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSB4 );
            if( result == null ) result = caseIdentifiedObject( pssSB4 );
            if( result == null ) result = caseCimObjectWithID( pssSB4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_COMPOSITE: {
            LoadComposite loadComposite = ( LoadComposite ) theEObject;
            T result = caseLoadComposite( loadComposite );
            if( result == null ) result = caseLoadDynamics( loadComposite );
            if( result == null ) result = caseIdentifiedObject( loadComposite );
            if( result == null ) result = caseCimObjectWithID( loadComposite );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_SEXS: {
            ExcSEXS excSEXS = ( ExcSEXS ) theEObject;
            T result = caseExcSEXS( excSEXS );
            if( result == null ) result = caseExcitationSystemDynamics( excSEXS );
            if( result == null ) result = caseDynamicsFunctionBlock( excSEXS );
            if( result == null ) result = caseIdentifiedObject( excSEXS );
            if( result == null ) result = caseCimObjectWithID( excSEXS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PTYPE4A_IEC: {
            WindContPType4aIEC windContPType4aIEC = ( WindContPType4aIEC ) theEObject;
            T result = caseWindContPType4aIEC( windContPType4aIEC );
            if( result == null ) result = caseIdentifiedObject( windContPType4aIEC );
            if( result == null ) result = caseCimObjectWithID( windContPType4aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC4A: {
            ExcAC4A excAC4A = ( ExcAC4A ) theEObject;
            T result = caseExcAC4A( excAC4A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC4A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC4A );
            if( result == null ) result = caseIdentifiedObject( excAC4A );
            if( result == null ) result = caseCimObjectWithID( excAC4A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS: {
            ExcitationSystemDynamics excitationSystemDynamics = ( ExcitationSystemDynamics ) theEObject;
            T result = caseExcitationSystemDynamics( excitationSystemDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( excitationSystemDynamics );
            if( result == null ) result = caseIdentifiedObject( excitationSystemDynamics );
            if( result == null ) result = caseCimObjectWithID( excitationSystemDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC3A: {
            ExcAC3A excAC3A = ( ExcAC3A ) theEObject;
            T result = caseExcAC3A( excAC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC3A );
            if( result == null ) result = caseIdentifiedObject( excAC3A );
            if( result == null ) result = caseCimObjectWithID( excAC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC2A: {
            ExcAC2A excAC2A = ( ExcAC2A ) theEObject;
            T result = caseExcAC2A( excAC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC2A );
            if( result == null ) result = caseIdentifiedObject( excAC2A );
            if( result == null ) result = caseCimObjectWithID( excAC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC1A: {
            ExcAC1A excAC1A = ( ExcAC1A ) theEObject;
            T result = caseExcAC1A( excAC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC1A );
            if( result == null ) result = caseIdentifiedObject( excAC1A );
            if( result == null ) result = caseCimObjectWithID( excAC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC8B: {
            ExcAC8B excAC8B = ( ExcAC8B ) theEObject;
            T result = caseExcAC8B( excAC8B );
            if( result == null ) result = caseExcitationSystemDynamics( excAC8B );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC8B );
            if( result == null ) result = caseIdentifiedObject( excAC8B );
            if( result == null ) result = caseCimObjectWithID( excAC8B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST7B: {
            ExcIEEEST7B excIEEEST7B = ( ExcIEEEST7B ) theEObject;
            T result = caseExcIEEEST7B( excIEEEST7B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST7B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST7B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST7B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST7B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_RQB: {
            PssRQB pssRQB = ( PssRQB ) theEObject;
            T result = casePssRQB( pssRQB );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssRQB );
            if( result == null ) result = caseDynamicsFunctionBlock( pssRQB );
            if( result == null ) result = caseIdentifiedObject( pssRQB );
            if( result == null ) result = caseCimObjectWithID( pssRQB );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VCOMP_IEEE_TYPE1: {
            VCompIEEEType1 vCompIEEEType1 = ( VCompIEEEType1 ) theEObject;
            T result = caseVCompIEEEType1( vCompIEEEType1 );
            if( result == null ) result = caseVoltageCompensatorDynamics( vCompIEEEType1 );
            if( result == null ) result = caseDynamicsFunctionBlock( vCompIEEEType1 );
            if( result == null ) result = caseIdentifiedObject( vCompIEEEType1 );
            if( result == null ) result = caseCimObjectWithID( vCompIEEEType1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC6A: {
            ExcAC6A excAC6A = ( ExcAC6A ) theEObject;
            T result = caseExcAC6A( excAC6A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC6A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC6A );
            if( result == null ) result = caseIdentifiedObject( excAC6A );
            if( result == null ) result = caseCimObjectWithID( excAC6A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VCOMP_IEEE_TYPE2: {
            VCompIEEEType2 vCompIEEEType2 = ( VCompIEEEType2 ) theEObject;
            T result = caseVCompIEEEType2( vCompIEEEType2 );
            if( result == null ) result = caseVoltageCompensatorDynamics( vCompIEEEType2 );
            if( result == null ) result = caseDynamicsFunctionBlock( vCompIEEEType2 );
            if( result == null ) result = caseIdentifiedObject( vCompIEEEType2 );
            if( result == null ) result = caseCimObjectWithID( vCompIEEEType2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC5A: {
            ExcAC5A excAC5A = ( ExcAC5A ) theEObject;
            T result = caseExcAC5A( excAC5A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC5A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC5A );
            if( result == null ) result = caseIdentifiedObject( excAC5A );
            if( result == null ) result = caseCimObjectWithID( excAC5A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_MECH_IEC: {
            WindMechIEC windMechIEC = ( WindMechIEC ) theEObject;
            T result = caseWindMechIEC( windMechIEC );
            if( result == null ) result = caseIdentifiedObject( windMechIEC );
            if( result == null ) result = caseCimObjectWithID( windMechIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM_X1: {
            OverexcLimX1 overexcLimX1 = ( OverexcLimX1 ) theEObject;
            T result = caseOverexcLimX1( overexcLimX1 );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLimX1 );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLimX1 );
            if( result == null ) result = caseIdentifiedObject( overexcLimX1 );
            if( result == null ) result = caseCimObjectWithID( overexcLimX1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM_X2: {
            OverexcLimX2 overexcLimX2 = ( OverexcLimX2 ) theEObject;
            T result = caseOverexcLimX2( overexcLimX2 );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLimX2 );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLimX2 );
            if( result == null ) result = caseIdentifiedObject( overexcLimX2 );
            if( result == null ) result = caseCimObjectWithID( overexcLimX2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_IEEE2: {
            UnderexcLimIEEE2 underexcLimIEEE2 = ( UnderexcLimIEEE2 ) theEObject;
            T result = caseUnderexcLimIEEE2( underexcLimIEEE2 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimIEEE2 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimIEEE2 );
            if( result == null ) result = caseIdentifiedObject( underexcLimIEEE2 );
            if( result == null ) result = caseCimObjectWithID( underexcLimIEEE2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_IEEE1: {
            UnderexcLimIEEE1 underexcLimIEEE1 = ( UnderexcLimIEEE1 ) theEObject;
            T result = caseUnderexcLimIEEE1( underexcLimIEEE1 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimIEEE1 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimIEEE1 );
            if( result == null ) result = caseIdentifiedObject( underexcLimIEEE1 );
            if( result == null ) result = caseCimObjectWithID( underexcLimIEEE1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST3A: {
            ExcIEEEST3A excIEEEST3A = ( ExcIEEEST3A ) theEObject;
            T result = caseExcIEEEST3A( excIEEEST3A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST3A );
            if( result == null ) result = caseIdentifiedObject( excIEEEST3A );
            if( result == null ) result = caseCimObjectWithID( excIEEEST3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_SH: {
            PssSH pssSH = ( PssSH ) theEObject;
            T result = casePssSH( pssSH );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSH );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSH );
            if( result == null ) result = caseIdentifiedObject( pssSH );
            if( result == null ) result = caseCimObjectWithID( pssSH );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_DD: {
            GovHydroDD govHydroDD = ( GovHydroDD ) theEObject;
            T result = caseGovHydroDD( govHydroDD );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroDD );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroDD );
            if( result == null ) result = caseIdentifiedObject( govHydroDD );
            if( result == null ) result = caseCimObjectWithID( govHydroDD );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_SK: {
            PssSK pssSK = ( PssSK ) theEObject;
            T result = casePssSK( pssSK );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSK );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSK );
            if( result == null ) result = caseIdentifiedObject( pssSK );
            if( result == null ) result = caseCimObjectWithID( pssSK );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST4B: {
            ExcIEEEST4B excIEEEST4B = ( ExcIEEEST4B ) theEObject;
            T result = caseExcIEEEST4B( excIEEEST4B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST4B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST4B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST4B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE4A_IEC: {
            WindTurbineType4aIEC windTurbineType4aIEC = ( WindTurbineType4aIEC ) theEObject;
            T result = caseWindTurbineType4aIEC( windTurbineType4aIEC );
            if( result == null ) result = caseWindTurbineType4IEC( windTurbineType4aIEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType4aIEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType4aIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType4aIEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType4aIEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType4aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST5B: {
            ExcIEEEST5B excIEEEST5B = ( ExcIEEEST5B ) theEObject;
            T result = caseExcIEEEST5B( excIEEEST5B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST5B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST5B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST5B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST5B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST6B: {
            ExcIEEEST6B excIEEEST6B = ( ExcIEEEST6B ) theEObject;
            T result = caseExcIEEEST6B( excIEEEST6B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST6B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST6B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST6B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST6B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_FV4: {
            GovSteamFV4 govSteamFV4 = ( GovSteamFV4 ) theEObject;
            T result = caseGovSteamFV4( govSteamFV4 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamFV4 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamFV4 );
            if( result == null ) result = caseIdentifiedObject( govSteamFV4 );
            if( result == null ) result = caseCimObjectWithID( govSteamFV4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_FV3: {
            GovSteamFV3 govSteamFV3 = ( GovSteamFV3 ) theEObject;
            T result = caseGovSteamFV3( govSteamFV3 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamFV3 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamFV3 );
            if( result == null ) result = caseIdentifiedObject( govSteamFV3 );
            if( result == null ) result = caseCimObjectWithID( govSteamFV3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_FV2: {
            GovSteamFV2 govSteamFV2 = ( GovSteamFV2 ) theEObject;
            T result = caseGovSteamFV2( govSteamFV2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamFV2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamFV2 );
            if( result == null ) result = caseIdentifiedObject( govSteamFV2 );
            if( result == null ) result = caseCimObjectWithID( govSteamFV2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS: {
            PowerSystemStabilizerDynamics powerSystemStabilizerDynamics = ( PowerSystemStabilizerDynamics ) theEObject;
            T result = casePowerSystemStabilizerDynamics( powerSystemStabilizerDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( powerSystemStabilizerDynamics );
            if( result == null ) result = caseIdentifiedObject( powerSystemStabilizerDynamics );
            if( result == null ) result = caseCimObjectWithID( powerSystemStabilizerDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A: {
            DiscExcContIEEEDEC1A discExcContIEEEDEC1A = ( DiscExcContIEEEDEC1A ) theEObject;
            T result = caseDiscExcContIEEEDEC1A( discExcContIEEEDEC1A );
            if( result == null ) result = caseDiscontinuousExcitationControlDynamics( discExcContIEEEDEC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( discExcContIEEEDEC1A );
            if( result == null ) result = caseIdentifiedObject( discExcContIEEEDEC1A );
            if( result == null ) result = caseCimObjectWithID( discExcContIEEEDEC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE3_IEC: {
            WindTurbineType3IEC windTurbineType3IEC = ( WindTurbineType3IEC ) theEObject;
            T result = caseWindTurbineType3IEC( windTurbineType3IEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType3IEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType3IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType3IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType3IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType3IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_USER_DEFINED: {
            WindPlantUserDefined windPlantUserDefined = ( WindPlantUserDefined ) theEObject;
            T result = caseWindPlantUserDefined( windPlantUserDefined );
            if( result == null ) result = caseWindPlantDynamics( windPlantUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( windPlantUserDefined );
            if( result == null ) result = caseIdentifiedObject( windPlantUserDefined );
            if( result == null ) result = caseCimObjectWithID( windPlantUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A: {
            DiscExcContIEEEDEC3A discExcContIEEEDEC3A = ( DiscExcContIEEEDEC3A ) theEObject;
            T result = caseDiscExcContIEEEDEC3A( discExcContIEEEDEC3A );
            if( result == null ) result = caseDiscontinuousExcitationControlDynamics( discExcContIEEEDEC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( discExcContIEEEDEC3A );
            if( result == null ) result = caseIdentifiedObject( discExcContIEEEDEC3A );
            if( result == null ) result = caseCimObjectWithID( discExcContIEEEDEC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A: {
            DiscExcContIEEEDEC2A discExcContIEEEDEC2A = ( DiscExcContIEEEDEC2A ) theEObject;
            T result = caseDiscExcContIEEEDEC2A( discExcContIEEEDEC2A );
            if( result == null ) result = caseDiscontinuousExcitationControlDynamics( discExcContIEEEDEC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( discExcContIEEEDEC2A );
            if( result == null ) result = caseIdentifiedObject( discExcContIEEEDEC2A );
            if( result == null ) result = caseCimObjectWithID( discExcContIEEEDEC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC: {
            WindTurbineType3or4IEC windTurbineType3or4IEC = ( WindTurbineType3or4IEC ) theEObject;
            T result = caseWindTurbineType3or4IEC( windTurbineType3or4IEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType3or4IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType3or4IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType3or4IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType3or4IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SVC_USER_DEFINED: {
            SVCUserDefined svcUserDefined = ( SVCUserDefined ) theEObject;
            T result = caseSVCUserDefined( svcUserDefined );
            if( result == null ) result = caseStaticVarCompensatorDynamics( svcUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( svcUserDefined );
            if( result == null ) result = caseIdentifiedObject( svcUserDefined );
            if( result == null ) result = caseCimObjectWithID( svcUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURB_LCFB1: {
            TurbLCFB1 turbLCFB1 = ( TurbLCFB1 ) theEObject;
            T result = caseTurbLCFB1( turbLCFB1 );
            if( result == null ) result = caseTurbineLoadControllerDynamics( turbLCFB1 );
            if( result == null ) result = caseDynamicsFunctionBlock( turbLCFB1 );
            if( result == null ) result = caseIdentifiedObject( turbLCFB1 );
            if( result == null ) result = caseCimObjectWithID( turbLCFB1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STREET_ADDRESS: {
            StreetAddress streetAddress = ( StreetAddress ) theEObject;
            T result = caseStreetAddress( streetAddress );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATUS: {
            Status status = ( Status ) theEObject;
            T result = caseStatus( status );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERVICE_LOCATION: {
            ServiceLocation serviceLocation = ( ServiceLocation ) theEObject;
            T result = caseServiceLocation( serviceLocation );
            if( result == null ) result = caseWorkLocation( serviceLocation );
            if( result == null ) result = caseLocation( serviceLocation );
            if( result == null ) result = caseIdentifiedObject( serviceLocation );
            if( result == null ) result = caseCimObjectWithID( serviceLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COORDINATE_SYSTEM: {
            CoordinateSystem coordinateSystem = ( CoordinateSystem ) theEObject;
            T result = caseCoordinateSystem( coordinateSystem );
            if( result == null ) result = caseIdentifiedObject( coordinateSystem );
            if( result == null ) result = caseCimObjectWithID( coordinateSystem );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POSITION_POINT: {
            PositionPoint positionPoint = ( PositionPoint ) theEObject;
            T result = casePositionPoint( positionPoint );
            if( result == null ) result = caseCimObjectWithID( positionPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STREET_DETAIL: {
            StreetDetail streetDetail = ( StreetDetail ) theEObject;
            T result = caseStreetDetail( streetDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK_LOCATION: {
            WorkLocation workLocation = ( WorkLocation ) theEObject;
            T result = caseWorkLocation( workLocation );
            if( result == null ) result = caseLocation( workLocation );
            if( result == null ) result = caseIdentifiedObject( workLocation );
            if( result == null ) result = caseCimObjectWithID( workLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOWN_DETAIL: {
            TownDetail townDetail = ( TownDetail ) theEObject;
            T result = caseTownDetail( townDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOCATION: {
            Location location = ( Location ) theEObject;
            T result = caseLocation( location );
            if( result == null ) result = caseIdentifiedObject( location );
            if( result == null ) result = caseCimObjectWithID( location );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_VALUE: {
            AnalogValue analogValue = ( AnalogValue ) theEObject;
            T result = caseAnalogValue( analogValue );
            if( result == null ) result = caseMeasurementValue( analogValue );
            if( result == null ) result = caseIOPoint( analogValue );
            if( result == null ) result = caseIdentifiedObject( analogValue );
            if( result == null ) result = caseCimObjectWithID( analogValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMMAND: {
            Command command = ( Command ) theEObject;
            T result = caseCommand( command );
            if( result == null ) result = caseControl( command );
            if( result == null ) result = caseIOPoint( command );
            if( result == null ) result = caseIdentifiedObject( command );
            if( result == null ) result = caseCimObjectWithID( command );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCRETE_VALUE: {
            DiscreteValue discreteValue = ( DiscreteValue ) theEObject;
            T result = caseDiscreteValue( discreteValue );
            if( result == null ) result = caseMeasurementValue( discreteValue );
            if( result == null ) result = caseIOPoint( discreteValue );
            if( result == null ) result = caseIdentifiedObject( discreteValue );
            if( result == null ) result = caseCimObjectWithID( discreteValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT_VALUE_QUALITY: {
            MeasurementValueQuality measurementValueQuality = ( MeasurementValueQuality ) theEObject;
            T result = caseMeasurementValueQuality( measurementValueQuality );
            if( result == null ) result = caseQuality61850( measurementValueQuality );
            if( result == null ) result = caseCimObjectWithID( measurementValueQuality );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_LIMIT_SET: {
            AnalogLimitSet analogLimitSet = ( AnalogLimitSet ) theEObject;
            T result = caseAnalogLimitSet( analogLimitSet );
            if( result == null ) result = caseLimitSet( analogLimitSet );
            if( result == null ) result = caseIdentifiedObject( analogLimitSet );
            if( result == null ) result = caseCimObjectWithID( analogLimitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LIMIT: {
            Limit limit = ( Limit ) theEObject;
            T result = caseLimit( limit );
            if( result == null ) result = caseIdentifiedObject( limit );
            if( result == null ) result = caseCimObjectWithID( limit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_CONTROL: {
            AnalogControl analogControl = ( AnalogControl ) theEObject;
            T result = caseAnalogControl( analogControl );
            if( result == null ) result = caseControl( analogControl );
            if( result == null ) result = caseIOPoint( analogControl );
            if( result == null ) result = caseIdentifiedObject( analogControl );
            if( result == null ) result = caseCimObjectWithID( analogControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRING_MEASUREMENT_VALUE: {
            StringMeasurementValue stringMeasurementValue = ( StringMeasurementValue ) theEObject;
            T result = caseStringMeasurementValue( stringMeasurementValue );
            if( result == null ) result = caseMeasurementValue( stringMeasurementValue );
            if( result == null ) result = caseIOPoint( stringMeasurementValue );
            if( result == null ) result = caseIdentifiedObject( stringMeasurementValue );
            if( result == null ) result = caseCimObjectWithID( stringMeasurementValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_VALUE: {
            AccumulatorValue accumulatorValue = ( AccumulatorValue ) theEObject;
            T result = caseAccumulatorValue( accumulatorValue );
            if( result == null ) result = caseMeasurementValue( accumulatorValue );
            if( result == null ) result = caseIOPoint( accumulatorValue );
            if( result == null ) result = caseIdentifiedObject( accumulatorValue );
            if( result == null ) result = caseCimObjectWithID( accumulatorValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SET_POINT: {
            SetPoint setPoint = ( SetPoint ) theEObject;
            T result = caseSetPoint( setPoint );
            if( result == null ) result = caseAnalogControl( setPoint );
            if( result == null ) result = caseControl( setPoint );
            if( result == null ) result = caseIOPoint( setPoint );
            if( result == null ) result = caseIdentifiedObject( setPoint );
            if( result == null ) result = caseCimObjectWithID( setPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG: {
            Analog analog = ( Analog ) theEObject;
            T result = caseAnalog( analog );
            if( result == null ) result = caseMeasurement( analog );
            if( result == null ) result = caseIdentifiedObject( analog );
            if( result == null ) result = caseCimObjectWithID( analog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT_VALUE_SOURCE: {
            MeasurementValueSource measurementValueSource = ( MeasurementValueSource ) theEObject;
            T result = caseMeasurementValueSource( measurementValueSource );
            if( result == null ) result = caseIdentifiedObject( measurementValueSource );
            if( result == null ) result = caseCimObjectWithID( measurementValueSource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT_VALUE: {
            MeasurementValue measurementValue = ( MeasurementValue ) theEObject;
            T result = caseMeasurementValue( measurementValue );
            if( result == null ) result = caseIOPoint( measurementValue );
            if( result == null ) result = caseIdentifiedObject( measurementValue );
            if( result == null ) result = caseCimObjectWithID( measurementValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.QUALITY61850: {
            Quality61850 quality61850 = ( Quality61850 ) theEObject;
            T result = caseQuality61850( quality61850 );
            if( result == null ) result = caseCimObjectWithID( quality61850 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LIMIT_SET: {
            LimitSet limitSet = ( LimitSet ) theEObject;
            T result = caseLimitSet( limitSet );
            if( result == null ) result = caseIdentifiedObject( limitSet );
            if( result == null ) result = caseCimObjectWithID( limitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_LIMIT: {
            AccumulatorLimit accumulatorLimit = ( AccumulatorLimit ) theEObject;
            T result = caseAccumulatorLimit( accumulatorLimit );
            if( result == null ) result = caseLimit( accumulatorLimit );
            if( result == null ) result = caseIdentifiedObject( accumulatorLimit );
            if( result == null ) result = caseCimObjectWithID( accumulatorLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT: {
            Measurement measurement = ( Measurement ) theEObject;
            T result = caseMeasurement( measurement );
            if( result == null ) result = caseIdentifiedObject( measurement );
            if( result == null ) result = caseCimObjectWithID( measurement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VALUE_ALIAS_SET: {
            ValueAliasSet valueAliasSet = ( ValueAliasSet ) theEObject;
            T result = caseValueAliasSet( valueAliasSet );
            if( result == null ) result = caseIdentifiedObject( valueAliasSet );
            if( result == null ) result = caseCimObjectWithID( valueAliasSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR: {
            Accumulator accumulator = ( Accumulator ) theEObject;
            T result = caseAccumulator( accumulator );
            if( result == null ) result = caseMeasurement( accumulator );
            if( result == null ) result = caseIdentifiedObject( accumulator );
            if( result == null ) result = caseCimObjectWithID( accumulator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_LIMIT_SET: {
            AccumulatorLimitSet accumulatorLimitSet = ( AccumulatorLimitSet ) theEObject;
            T result = caseAccumulatorLimitSet( accumulatorLimitSet );
            if( result == null ) result = caseLimitSet( accumulatorLimitSet );
            if( result == null ) result = caseIdentifiedObject( accumulatorLimitSet );
            if( result == null ) result = caseCimObjectWithID( accumulatorLimitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VALUE_TO_ALIAS: {
            ValueToAlias valueToAlias = ( ValueToAlias ) theEObject;
            T result = caseValueToAlias( valueToAlias );
            if( result == null ) result = caseIdentifiedObject( valueToAlias );
            if( result == null ) result = caseCimObjectWithID( valueToAlias );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCRETE: {
            Discrete discrete = ( Discrete ) theEObject;
            T result = caseDiscrete( discrete );
            if( result == null ) result = caseMeasurement( discrete );
            if( result == null ) result = caseIdentifiedObject( discrete );
            if( result == null ) result = caseCimObjectWithID( discrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RAISE_LOWER_COMMAND: {
            RaiseLowerCommand raiseLowerCommand = ( RaiseLowerCommand ) theEObject;
            T result = caseRaiseLowerCommand( raiseLowerCommand );
            if( result == null ) result = caseAnalogControl( raiseLowerCommand );
            if( result == null ) result = caseControl( raiseLowerCommand );
            if( result == null ) result = caseIOPoint( raiseLowerCommand );
            if( result == null ) result = caseIdentifiedObject( raiseLowerCommand );
            if( result == null ) result = caseCimObjectWithID( raiseLowerCommand );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IO_POINT: {
            IOPoint ioPoint = ( IOPoint ) theEObject;
            T result = caseIOPoint( ioPoint );
            if( result == null ) result = caseIdentifiedObject( ioPoint );
            if( result == null ) result = caseCimObjectWithID( ioPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_RESET: {
            AccumulatorReset accumulatorReset = ( AccumulatorReset ) theEObject;
            T result = caseAccumulatorReset( accumulatorReset );
            if( result == null ) result = caseControl( accumulatorReset );
            if( result == null ) result = caseIOPoint( accumulatorReset );
            if( result == null ) result = caseIdentifiedObject( accumulatorReset );
            if( result == null ) result = caseCimObjectWithID( accumulatorReset );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_LIMIT: {
            AnalogLimit analogLimit = ( AnalogLimit ) theEObject;
            T result = caseAnalogLimit( analogLimit );
            if( result == null ) result = caseLimit( analogLimit );
            if( result == null ) result = caseIdentifiedObject( analogLimit );
            if( result == null ) result = caseCimObjectWithID( analogLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRING_MEASUREMENT: {
            StringMeasurement stringMeasurement = ( StringMeasurement ) theEObject;
            T result = caseStringMeasurement( stringMeasurement );
            if( result == null ) result = caseMeasurement( stringMeasurement );
            if( result == null ) result = caseIdentifiedObject( stringMeasurement );
            if( result == null ) result = caseCimObjectWithID( stringMeasurement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROL: {
            Control control = ( Control ) theEObject;
            T result = caseControl( control );
            if( result == null ) result = caseIOPoint( control );
            if( result == null ) result = caseIdentifiedObject( control );
            if( result == null ) result = caseCimObjectWithID( control );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MUTUAL_COUPLING: {
            MutualCoupling mutualCoupling = ( MutualCoupling ) theEObject;
            T result = caseMutualCoupling( mutualCoupling );
            if( result == null ) result = caseIdentifiedObject( mutualCoupling );
            if( result == null ) result = caseCimObjectWithID( mutualCoupling );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_TAP_STEP: {
            SvTapStep svTapStep = ( SvTapStep ) theEObject;
            T result = caseSvTapStep( svTapStep );
            if( result == null ) result = caseCimObjectWithID( svTapStep );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOPOLOGICAL_ISLAND: {
            TopologicalIsland topologicalIsland = ( TopologicalIsland ) theEObject;
            T result = caseTopologicalIsland( topologicalIsland );
            if( result == null ) result = caseIdentifiedObject( topologicalIsland );
            if( result == null ) result = caseCimObjectWithID( topologicalIsland );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_SWITCH: {
            SvSwitch svSwitch = ( SvSwitch ) theEObject;
            T result = caseSvSwitch( svSwitch );
            if( result == null ) result = caseCimObjectWithID( svSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_POWER_FLOW: {
            SvPowerFlow svPowerFlow = ( SvPowerFlow ) theEObject;
            T result = caseSvPowerFlow( svPowerFlow );
            if( result == null ) result = caseCimObjectWithID( svPowerFlow );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS: {
            SvShuntCompensatorSections svShuntCompensatorSections = ( SvShuntCompensatorSections ) theEObject;
            T result = caseSvShuntCompensatorSections( svShuntCompensatorSections );
            if( result == null ) result = caseCimObjectWithID( svShuntCompensatorSections );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_VOLTAGE: {
            SvVoltage svVoltage = ( SvVoltage ) theEObject;
            T result = caseSvVoltage( svVoltage );
            if( result == null ) result = caseCimObjectWithID( svVoltage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_TOPOLOGICAL_ISLAND: {
            DCTopologicalIsland dcTopologicalIsland = ( DCTopologicalIsland ) theEObject;
            T result = caseDCTopologicalIsland( dcTopologicalIsland );
            if( result == null ) result = caseIdentifiedObject( dcTopologicalIsland );
            if( result == null ) result = caseCimObjectWithID( dcTopologicalIsland );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOPOLOGICAL_NODE: {
            TopologicalNode topologicalNode = ( TopologicalNode ) theEObject;
            T result = caseTopologicalNode( topologicalNode );
            if( result == null ) result = caseIdentifiedObject( topologicalNode );
            if( result == null ) result = caseCimObjectWithID( topologicalNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_STATUS: {
            SvStatus svStatus = ( SvStatus ) theEObject;
            T result = caseSvStatus( svStatus );
            if( result == null ) result = caseCimObjectWithID( svStatus );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_INJECTION: {
            SvInjection svInjection = ( SvInjection ) theEObject;
            T result = caseSvInjection( svInjection );
            if( result == null ) result = caseCimObjectWithID( svInjection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_TOPOLOGICAL_NODE: {
            DCTopologicalNode dcTopologicalNode = ( DCTopologicalNode ) theEObject;
            T result = caseDCTopologicalNode( dcTopologicalNode );
            if( result == null ) result = caseIdentifiedObject( dcTopologicalNode );
            if( result == null ) result = caseCimObjectWithID( dcTopologicalNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object With ID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object With ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCimObjectWithID( CimObjectWithID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Injection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Injection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentInjection( EquivalentInjection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Power Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Power Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroPowerPlant( HydroPowerPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergySource( EnergySource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapSchedule( TapSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Series Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Series Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCSeriesDevice( DCSeriesDevice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Network Injection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Network Injection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalNetworkInjection( ExternalNetworkInjection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalLimit( OperationalLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRatioTapChanger( RatioTapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reporting Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reporting Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportingGroup( ReportingGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Curve Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Curve Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurveData( CurveData object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonlinearShuntCompensator( NonlinearShuntCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectivityNodeContainer( ConnectivityNodeContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conform Load Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConformLoadSchedule( ConformLoadSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnector( Connector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Line Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCLineSegment( DCLineSegment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Symmetrical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Symmetrical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerSymmetrical( PhaseTapChangerSymmetrical object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Battery Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Battery Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBatteryUnit( BatteryUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRatioTapChangerTable( RatioTapChangerTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivePowerLimit( ActivePowerLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerTable( PhaseTapChangerTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyArea( EnergyArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ground Disconnector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ground Disconnector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroundDisconnector( GroundDisconnector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Base Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Base Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCBaseTerminal( DCBaseTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReactiveCapabilityCurve( ReactiveCapabilityCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Busbar</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Busbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCBusbar( DCBusbar object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Day Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Day Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDayType( DayType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchSchedule( SwitchSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Breaker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Breaker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCBreaker( DCBreaker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTieFlow( TieFlow object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadGroup( LoadGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipmentContainer( EquipmentContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Station Supply</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Station Supply</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStationSupply( StationSupply object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACLineSegment( ACLineSegment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ground</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ground</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGround( Ground object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cut</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cut</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCut( Cut object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cogeneration Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cogeneration Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCogenerationPlant( CogenerationPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Surge Arrester</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Surge Arrester</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSurgeArrester( SurgeArrester object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Branch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Branch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentBranch( EquivalentBranch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Pump</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Pump</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroPump( HydroPump object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConformLoadGroup( ConformLoadGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonConformLoad( NonConformLoad object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CAES Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CAES Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCAESPlant( CAESPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Breaker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Breaker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBreaker( Breaker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Grounding Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Grounding Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroundingImpedance( GroundingImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Limit Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Limit Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalLimitType( OperationalLimitType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Area Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Area Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlAreaGeneratingUnit( ControlAreaGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bus Name Marker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bus Name Marker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusNameMarker( BusNameMarker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticVarCompensator( StaticVarCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conductor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conductor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConductor( Conductor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Line</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCLine( DCLine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Tabular</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Tabular</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerTabular( PhaseTapChangerTabular object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipment( Equipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Chopper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Chopper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCChopper( DCChopper object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChangerControl( TapChangerControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Earth Fault Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Earth Fault Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEarthFaultCompensator( EarthFaultCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fault Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fault Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFaultIndicator( FaultIndicator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Converter Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Converter Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCConverterUnit( DCConverterUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurve( Curve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vs Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vs Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVsConverter( VsConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroGeneratingUnit( HydroGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegulationSchedule( RegulationSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyConnection( EnergyConnection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentEquipment( EquivalentEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fossil Fuel</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fossil Fuel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFossilFuel( FossilFuel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadArea( LoadArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combined Cycle Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combined Cycle Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombinedCyclePlant( CombinedCyclePlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConductingEquipment( ConductingEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clamp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clamp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClamp( Clamp object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApparentPowerLimit( ApparentPowerLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nuclear Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nuclear Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNuclearGeneratingUnit( NuclearGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Petersen Coil</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Petersen Coil</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePetersenCoil( PetersenCoil object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Response Characteristic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Response Characteristic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadResponseCharacteristic( LoadResponseCharacteristic object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Transformer End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Transformer End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerTransformerEnd( PowerTransformerEnd object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTerminal( Terminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bay</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBay( Bay object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegulatingControl( RegulatingControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeriesCompensator( SeriesCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Protected Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Protected Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProtectedSwitch( ProtectedSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer Table Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChangerTablePoint( TapChangerTablePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusbarSection( BusbarSection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Photo Voltaic Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Photo Voltaic Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhotoVoltaicUnit( PhotoVoltaicUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLine( Line object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Season</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Season</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeason( Season object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegularIntervalSchedule( RegularIntervalSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonConformLoadGroup( NonConformLoadGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalLimitSet( OperationalLimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChanger( PhaseTapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Equipment Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCEquipmentContainer( DCEquipmentContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Asymmetrical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Asymmetrical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerAsymmetrical( PhaseTapChangerAsymmetrical object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectivityNode( ConnectivityNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensor( Sensor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadBreakSwitch( LoadBreakSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeasonDayTypeSchedule( SeasonDayTypeSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disconnecting Circuit Breaker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disconnecting Circuit Breaker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDisconnectingCircuitBreaker( DisconnectingCircuitBreaker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCSwitch( DCSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disconnector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disconnector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDisconnector( Disconnector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCNode( DCNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Solar Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Solar Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSolarGeneratingUnit( SolarGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubstation( Substation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonlinearShuntCompensatorPoint( NonlinearShuntCompensatorPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiedObject( IdentifiedObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemResource( PowerSystemResource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubGeographicalRegion( SubGeographicalRegion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThermalGeneratingUnit( ThermalGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Potential Transformer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Potential Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePotentialTransformer( PotentialTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vs Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vs Capability Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVsCapabilityCurve( VsCapabilityCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Ground</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Ground</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCGround( DCGround object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegulatingCondEq( RegulatingCondEq object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyConsumer( EnergyConsumer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeographicalRegion( GeographicalRegion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Network</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentNetwork( EquivalentNetwork object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGrossToNetActivePowerCurve( GrossToNetActivePowerCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseVoltage( BaseVoltage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Shunt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Shunt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCShunt( DCShunt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cs Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cs Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCsConverter( CsConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Conducting Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCConductingEquipment( DCConductingEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Jumper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jumper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJumper( Jumper object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Current Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Current Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrentLimit( CurrentLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerEnd( TransformerEnd object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Conform Load Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonConformLoadSchedule( NonConformLoadSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rotating Machine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rotating Machine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRotatingMachine( RotatingMachine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Scheduling Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Scheduling Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergySchedulingType( EnergySchedulingType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Linear</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Linear</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerLinear( PhaseTapChangerLinear object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicIntervalSchedule( BasicIntervalSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACDC Converter DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACDC Converter DC Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACDCConverterDCTerminal( ACDCConverterDCTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Current Transformer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Current Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrentTransformer( CurrentTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Electronics Wind Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Electronics Wind Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerElectronicsWindUnit( PowerElectronicsWindUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerTransformer( PowerTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wave Trap</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wave Trap</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWaveTrap( WaveTrap object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Shunt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Shunt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentShunt( EquivalentShunt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linear Shunt Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinearShuntCompensator( LinearShuntCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlArea( ControlArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachine( SynchronousMachine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auxiliary Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auxiliary Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuxiliaryEquipment( AuxiliaryEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageLevel( VoltageLevel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChanger( TapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conform Load</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conform Load</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConformLoad( ConformLoad object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRatioTapChangerTablePoint( RatioTapChangerTablePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCTerminal( DCTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Post Line Sensor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Post Line Sensor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePostLineSensor( PostLineSensor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneratingUnit( GeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGeneratingUnit( WindGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJunction( Junction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Electronics Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Electronics Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerElectronicsUnit( PowerElectronicsUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegularTimePoint( RegularTimePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Electronics Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Electronics Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerElectronicsConnection( PowerElectronicsConnection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACDC Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACDC Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACDCConverter( ACDCConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitch( fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Disconnector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Disconnector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCDisconnector( DCDisconnector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACDC Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACDC Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACDCTerminal( ACDCTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubLoadArea( SubLoadArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Non Linear</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Non Linear</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerNonLinear( PhaseTapChangerNonLinear object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageLimit( VoltageLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fuse</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fuse</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFuse( Fuse object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachine( AsynchronousMachine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Table Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerTablePoint( PhaseTapChangerTablePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShuntCompensator( ShuntCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Visibility Layer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Visibility Layer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVisibilityLayer( VisibilityLayer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object Glue Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object Glue Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObjectGluePoint( DiagramObjectGluePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagram( Diagram object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObjectStyle( DiagramObjectStyle object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Diagram Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextDiagramObject( TextDiagramObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObject( DiagramObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramStyle( DiagramStyle object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObjectPoint( DiagramObjectPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexcitation Limiter User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcitationLimiterUserDefined( UnderexcitationLimiterUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE3B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE3B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE3B( PssIEEE3B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE2B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE2B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE2B( PssIEEE2B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscontinuousExcitationControlUserDefined( DiscontinuousExcitationControlUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc PIC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc PIC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcPIC( ExcPIC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE4B( PssIEEE4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscontinuousExcitationControlDynamics( DiscontinuousExcitationControlDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE1A( PssIEEE1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VSC User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VSC User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVSCUserDefined( VSCUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST( GovGAST object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss WECC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss WECC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssWECC( PssWECC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Aero One Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Aero One Dim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindAeroOneDimIEC( WindAeroOneDimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Simplified</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Simplified</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineSimplified( SynchronousMachineSimplified object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineEquivalentCircuit( AsynchronousMachineEquivalentCircuit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST1A( ExcIEEEST1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Load Controller Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Load Controller Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineLoadControllerDynamics( TurbineLoadControllerDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Detailed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Detailed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineDetailed( SynchronousMachineDetailed object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST2A( ExcIEEEST2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc HU</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc HU</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcHU( ExcHU object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc CZ</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc CZ</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcCZ( ExcCZ object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mechanical Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mechanical Load Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMechanicalLoadDynamics( MechanicalLoadDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss2 ST</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss2 ST</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss2ST( Pss2ST object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc SCRX</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc SCRX</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcSCRX( ExcSCRX object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GASTWD</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GASTWD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGASTWD( GovGASTWD object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Type3or4 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Type3or4 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindType3or4UserDefined( WindType3or4UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro1( GovHydro1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro2( GovHydro2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro3( GovHydro3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro4( GovHydro4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Proprietary Parameter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Proprietary Parameter Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProprietaryParameterDynamics( ProprietaryParameterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc NI</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc NI</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcNI( ExcNI object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type4 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType4IEC( WindTurbineType4IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteam2( GovSteam2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteam1( GovSteam1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam0</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteam0( GovSteam0 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro R</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro R</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroR( GovHydroR object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Governor Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Governor Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineGovernorDynamics( TurbineGovernorDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Motor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Motor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadMotor( LoadMotor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont QIEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont QIEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContQIEC( WindContQIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type3a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type3a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType3aIEC( WindGenType3aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc SK</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc SK</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcSK( ExcSK object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rotating Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rotating Machine Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRotatingMachineDynamics( RotatingMachineDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Adjuster Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Adjuster Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageAdjusterDynamics( VoltageAdjusterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType2Dynamics( PFVArControllerType2Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Compensator User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Compensator User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageCompensatorUserDefined( VoltageCompensatorUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Pitch Cont Power IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Pitch Cont Power IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPitchContPowerIEC( WindPitchContPowerIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenTurbineType1aIEC( WindGenTurbineType1aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Protection IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Protection IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindProtectionIEC( WindProtectionIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Ref Frame Rot IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Ref Frame Rot IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindRefFrameRotIEC( WindRefFrameRotIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Generic Non Linear</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Generic Non Linear</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadGenericNonLinear( LoadGenericNonLinear object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType1or2IEC( WindTurbineType1or2IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type2 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type2 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenTurbineType2IEC( WindGenTurbineType2IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type3 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType3IEC( WindGenType3IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont PType3 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont PType3 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPType3IEC( WindContPType3IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim2 Simplified</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim2 Simplified</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLim2Simplified( UnderexcLim2Simplified object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantIEC( WindPlantIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss5</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss5</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss5( Pss5 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineTimeConstantReactance( AsynchronousMachineTimeConstantReactance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss STAB2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss STAB2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSTAB2A( PssSTAB2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss1( Pss1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type4b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type4b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType4bIEC( WindTurbineType4bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType2UserDefined( PFVArControllerType2UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro PID2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro PID2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroPID2( GovHydroPID2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro Francis</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro Francis</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroFrancis( GovHydroFrancis object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CSC Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CSC Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCSCDynamics( CSCDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexcitation Limiter Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcitationLimiterDynamics( OverexcitationLimiterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc RQB</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc RQB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcRQB( ExcRQB object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ANS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ANS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcANS( ExcANS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Aggregate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Aggregate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadAggregate( LoadAggregate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type3b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type3b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType3bIEC( WindGenType3bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam IEEE1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam IEEE1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamIEEE1( GovSteamIEEE1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexcitation Limiter Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcitationLimiterDynamics( UnderexcitationLimiterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro WEH</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro WEH</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroWEH( GovHydroWEH object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC3A1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC3A1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC3A1( ExcDC3A1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType1or2Dynamics( WindTurbineType1or2Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexcitation Limiter User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcitationLimiterUserDefined( OverexcitationLimiterUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Load Controller User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Load Controller User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineLoadControllerUserDefined( TurbineLoadControllerUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont Pitch Angle IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont Pitch Angle IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPitchAngleIEC( WindContPitchAngleIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc BBC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc BBC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcBBC( ExcBBC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim IEEE</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim IEEE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLimIEEE( OverexcLimIEEE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Input Signal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Input Signal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteInputSignal( RemoteInputSignal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR1( ExcAVR1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR2( ExcAVR2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR3( ExcAVR3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR4( ExcAVR4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR5</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR5</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR5( ExcAVR5 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR7</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR7</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR7( ExcAVR7 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType2IEEEVArController( PFVArType2IEEEVArController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC2A( ExcIEEEAC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadUserDefined( LoadUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mechanical Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mechanical Load User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMechanicalLoadUserDefined( MechanicalLoadUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC1A( ExcIEEEAC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro IEEE0</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro IEEE0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroIEEE0( GovHydroIEEE0 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro IEEE2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro IEEE2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroIEEE2( GovHydroIEEE2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC6A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC6A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC6A( ExcIEEEAC6A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC5A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC5A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC5A( ExcIEEEAC5A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cross Compound Turbine Governor Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cross Compound Turbine Governor Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrossCompoundTurbineGovernorDynamics( CrossCompoundTurbineGovernorDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Var Compensator Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Var Compensator Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticVarCompensatorDynamics( StaticVarCompensatorDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC4A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC4A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC4A( ExcIEEEAC4A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC3A( ExcIEEEAC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Excitation System User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Excitation System User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcitationSystemUserDefined( ExcitationSystemUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Type1or2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Type1or2 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindType1or2UserDefined( WindType1or2UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST4( GovGAST4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST3( GovGAST3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST2( GovGAST2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST1( GovGAST1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mech Load1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mech Load1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMechLoad1( MechLoad1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType1IEEEVArController( PFVArType1IEEEVArController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont Rotor RIEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont Rotor RIEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContRotorRIEC( WindContRotorRIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType2IEEEPFController( PFVArType2IEEEPFController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VAdj IEEE</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VAdj IEEE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVAdjIEEE( VAdjIEEE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Equivalent Circuit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineEquivalentCircuit( SynchronousMachineEquivalentCircuit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantDynamics( WindPlantDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ELIN1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ELIN1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcELIN1( ExcELIN1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ELIN2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ELIN2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcELIN2( ExcELIN2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineUserDefined( AsynchronousMachineUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST4B( ExcST4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST3A( ExcST3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST2A( ExcST2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC8B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC8B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC8B( ExcIEEEAC8B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST1A( ExcST1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC7B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC7B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC7B( ExcIEEEAC7B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam SGO</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam SGO</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamSGO( GovSteamSGO object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST7B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST7B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST7B( ExcST7B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Stabilizer User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Stabilizer User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemStabilizerUserDefined( PowerSystemStabilizerUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dynamics Function Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dynamics Function Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDynamicsFunctionBlock( DynamicsFunctionBlock object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro PID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro PID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroPID( GovHydroPID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST6B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST6B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST6B( ExcST6B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont PType4b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont PType4b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPType4bIEC( WindContPType4bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro Pelton</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro Pelton</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroPelton( GovHydroPelton object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VSC Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VSC Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVSCDynamics( VSCDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadDynamics( LoadDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss ELIN2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss ELIN2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssELIN2( PssELIN2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Time Constant Reactance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineTimeConstantReactance( SynchronousMachineTimeConstantReactance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov CT1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov CT1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovCT1( GovCT1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov CT2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov CT2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovCT2( GovCT2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC1A( ExcIEEEDC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont QPQU Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont QPQU Lim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContQPQULimIEC( WindContQPQULimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC4B( ExcIEEEDC4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC3A( ExcIEEEDC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC2A( ExcIEEEDC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CSC User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CSC User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCSCUserDefined( CSCUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Static</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Static</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadStatic( LoadStatic object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Aero Two Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Aero Two Dim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindAeroTwoDimIEC( WindAeroTwoDimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont Curr Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont Curr Lim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContCurrLimIEC( WindContCurrLimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss PTIST1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss PTIST1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssPTIST1( PssPTIST1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss PTIST3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss PTIST3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssPTIST3( PssPTIST3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro WPID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro WPID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroWPID( GovHydroWPID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType1Dynamics( PFVArControllerType1Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont QLim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont QLim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContQLimIEC( WindContQLimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Compensator Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Compensator Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageCompensatorDynamics( VoltageCompensatorDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineUserDefined( SynchronousMachineUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gen ICompensation For Gen J</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gen ICompensation For Gen J</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenICompensationForGenJ( GenICompensationForGenJ object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc REXS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc REXS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcREXS( ExcREXS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineDynamics( AsynchronousMachineDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type2 Common1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type2 Common1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType2Common1( PFVArType2Common1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Aero Const IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Aero Const IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindAeroConstIEC( WindAeroConstIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HVDC Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HVDC Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHVDCDynamics( HVDCDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Governor User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Governor User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineGovernorUserDefined( TurbineGovernorUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType1IEEEPFController( PFVArType1IEEEPFController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC3A( ExcDC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss2 B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss2 B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss2B( Pss2B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC2A( ExcDC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant Reactive Control IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant Reactive Control IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantReactiveControlIEC( WindPlantReactiveControlIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam CC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam CC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamCC( GovSteamCC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC1A( ExcDC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLim2( OverexcLim2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam EU</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam EU</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamEU( GovSteamEU object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Dynamics Lookup Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Dynamics Lookup Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindDynamicsLookupTable( WindDynamicsLookupTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss1 A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss1 A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss1A( Pss1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Adjuster User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Adjuster User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageAdjusterUserDefined( VoltageAdjusterUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineDynamics( SynchronousMachineDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam BB</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam BB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamBB( GovSteamBB object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim X2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimX2( UnderexcLimX2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim X1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimX1( UnderexcLimX1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type4 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType4IEC( WindGenType4IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType1UserDefined( PFVArControllerType1UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc OEX3T</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc OEX3T</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcOEX3T( ExcOEX3T object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenTurbineType1bIEC( WindGenTurbineType1bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss SB4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss SB4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSB4( PssSB4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Composite</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Composite</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadComposite( LoadComposite object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc SEXS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc SEXS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcSEXS( ExcSEXS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont PType4a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont PType4a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPType4aIEC( WindContPType4aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC4A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC4A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC4A( ExcAC4A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Excitation System Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Excitation System Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcitationSystemDynamics( ExcitationSystemDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC3A( ExcAC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC2A( ExcAC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC1A( ExcAC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC8B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC8B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC8B( ExcAC8B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST7B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST7B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST7B( ExcIEEEST7B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss RQB</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss RQB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssRQB( PssRQB object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VComp IEEE Type1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VComp IEEE Type1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVCompIEEEType1( VCompIEEEType1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC6A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC6A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC6A( ExcAC6A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VComp IEEE Type2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VComp IEEE Type2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVCompIEEEType2( VCompIEEEType2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC5A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC5A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC5A( ExcAC5A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Mech IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Mech IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindMechIEC( WindMechIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim X1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLimX1( OverexcLimX1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim X2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLimX2( OverexcLimX2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim IEEE2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim IEEE2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimIEEE2( UnderexcLimIEEE2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim IEEE1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim IEEE1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimIEEE1( UnderexcLimIEEE1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST3A( ExcIEEEST3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss SH</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss SH</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSH( PssSH object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro DD</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro DD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroDD( GovHydroDD object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss SK</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss SK</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSK( PssSK object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST4B( ExcIEEEST4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type4a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type4a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType4aIEC( WindTurbineType4aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST5B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST5B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST5B( ExcIEEEST5B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST6B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST6B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST6B( ExcIEEEST6B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam FV4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam FV4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamFV4( GovSteamFV4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam FV3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam FV3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamFV3( GovSteamFV3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam FV2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam FV2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamFV2( GovSteamFV2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Stabilizer Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Stabilizer Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemStabilizerDynamics( PowerSystemStabilizerDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscExcContIEEEDEC1A( DiscExcContIEEEDEC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type3 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType3IEC( WindTurbineType3IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantUserDefined( WindPlantUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscExcContIEEEDEC3A( DiscExcContIEEEDEC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscExcContIEEEDEC2A( DiscExcContIEEEDEC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType3or4IEC( WindTurbineType3or4IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SVC User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SVC User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSVCUserDefined( SVCUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turb LCFB1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turb LCFB1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbLCFB1( TurbLCFB1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Street Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Street Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStreetAddress( StreetAddress object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Status</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatus( Status object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceLocation( ServiceLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCoordinateSystem( CoordinateSystem object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Position Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Position Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePositionPoint( PositionPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Street Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Street Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStreetDetail( StreetDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkLocation( WorkLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Town Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Town Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTownDetail( TownDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocation( Location object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogValue( AnalogValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommand( Command object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteValue( DiscreteValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Value Quality</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Value Quality</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementValueQuality( MeasurementValueQuality object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogLimitSet( AnalogLimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLimit( Limit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogControl( AnalogControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Measurement Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringMeasurementValue( StringMeasurementValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorValue( AccumulatorValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetPoint( SetPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalog( Analog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementValueSource( MeasurementValueSource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementValue( MeasurementValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality61850</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality61850</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuality61850( Quality61850 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLimitSet( LimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorLimit( AccumulatorLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurement( Measurement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Alias Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Alias Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueAliasSet( ValueAliasSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulator( Accumulator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorLimitSet( AccumulatorLimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value To Alias</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value To Alias</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueToAlias( ValueToAlias object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscrete( Discrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Raise Lower Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Raise Lower Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRaiseLowerCommand( RaiseLowerCommand object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IO Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IO Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIOPoint( IOPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Reset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Reset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorReset( AccumulatorReset object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogLimit( AnalogLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringMeasurement( StringMeasurement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControl( Control object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mutual Coupling</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mutual Coupling</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMutualCoupling( MutualCoupling object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Tap Step</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Tap Step</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvTapStep( SvTapStep object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Topological Island</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Topological Island</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTopologicalIsland( TopologicalIsland object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvSwitch( SvSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Power Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Power Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvPowerFlow( SvPowerFlow object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Shunt Compensator Sections</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Shunt Compensator Sections</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvShuntCompensatorSections( SvShuntCompensatorSections object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Voltage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Voltage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvVoltage( SvVoltage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Topological Island</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Topological Island</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCTopologicalIsland( DCTopologicalIsland object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Topological Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Topological Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTopologicalNode( TopologicalNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Status</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Status</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvStatus( SvStatus object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Injection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Injection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvInjection( SvInjection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Topological Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Topological Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCTopologicalNode( DCTopologicalNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} //CimSwitch
