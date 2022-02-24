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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseCode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementImpl#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementImpl#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementImpl#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.MeasurementImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends IdentifiedObjectImpl implements Measurement {
    /**
     * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.BCN;

    /**
     * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected PhaseCode phases = PHASES_EDEFAULT;

    /**
     * This is true if the Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phasesESet;

    /**
     * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.WPERM_K;

    /**
     * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;

    /**
     * This is true if the Unit Symbol attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitSymbolESet;

    /**
     * The default value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementType()
     * @generated
     * @ordered
     */
    protected static final String MEASUREMENT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementType()
     * @generated
     * @ordered
     */
    protected String measurementType = MEASUREMENT_TYPE_EDEFAULT;

    /**
     * This is true if the Measurement Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementTypeESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected ACDCTerminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * The default value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.ZETTA;

    /**
     * The cached value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Unit Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitMultiplierESet;

    /**
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;

    /**
     * This is true if the Power System Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeasurement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhases() {
        return phases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhases( PhaseCode newPhases ) {
        PhaseCode oldPhases = phases;
        phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
        boolean oldPhasesESet = phasesESet;
        phasesESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__PHASES, oldPhases, phases,
                    !oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhases() {
        PhaseCode oldPhases = phases;
        boolean oldPhasesESet = phasesESet;
        phases = PHASES_EDEFAULT;
        phasesESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__PHASES, oldPhases,
                    PHASES_EDEFAULT, oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhases() {
        return phasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitSymbol( UnitSymbol newUnitSymbol ) {
        UnitSymbol oldUnitSymbol = unitSymbol;
        unitSymbol = newUnitSymbol == null ? UNIT_SYMBOL_EDEFAULT : newUnitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbolESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__UNIT_SYMBOL, oldUnitSymbol,
                    unitSymbol, !oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitSymbol() {
        UnitSymbol oldUnitSymbol = unitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbol = UNIT_SYMBOL_EDEFAULT;
        unitSymbolESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__UNIT_SYMBOL,
                    oldUnitSymbol, UNIT_SYMBOL_EDEFAULT, oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitSymbol() {
        return unitSymbolESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeasurementType( String newMeasurementType ) {
        String oldMeasurementType = measurementType;
        measurementType = newMeasurementType;
        boolean oldMeasurementTypeESet = measurementTypeESet;
        measurementTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__MEASUREMENT_TYPE,
                    oldMeasurementType, measurementType, !oldMeasurementTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurementType() {
        String oldMeasurementType = measurementType;
        boolean oldMeasurementTypeESet = measurementTypeESet;
        measurementType = MEASUREMENT_TYPE_EDEFAULT;
        measurementTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__MEASUREMENT_TYPE,
                    oldMeasurementType, MEASUREMENT_TYPE_EDEFAULT, oldMeasurementTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementType() {
        return measurementTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCTerminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( ACDCTerminal newTerminal, NotificationChain msgs ) {
        ACDCTerminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTerminal( ACDCTerminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.ACDC_TERMINAL__MEASUREMENTS,
                        ACDCTerminal.class, msgs );
            if( newTerminal != null )
                msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this, CimPackage.ACDC_TERMINAL__MEASUREMENTS,
                        ACDCTerminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__TERMINAL, newTerminal,
                        newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        ACDCTerminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__TERMINAL, oldTerminal, null, oldTerminalESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.ACDC_TERMINAL__MEASUREMENTS,
                    ACDCTerminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__TERMINAL, null, null,
                        oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitMultiplier( UnitMultiplier newUnitMultiplier ) {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        unitMultiplier = newUnitMultiplier == null ? UNIT_MULTIPLIER_EDEFAULT : newUnitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplierESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__UNIT_MULTIPLIER,
                    oldUnitMultiplier, unitMultiplier, !oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitMultiplier() {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
        unitMultiplierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__UNIT_MULTIPLIER,
                    oldUnitMultiplier, UNIT_MULTIPLIER_EDEFAULT, oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitMultiplier() {
        return unitMultiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResource( PowerSystemResource newPowerSystemResource,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource,
                    !oldPowerSystemResourceESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerSystemResource( PowerSystemResource newPowerSystemResource ) {
        if( newPowerSystemResource != powerSystemResource ) {
            NotificationChain msgs = null;
            if( powerSystemResource != null )
                msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            if( newPowerSystemResource != null )
                msgs = ( ( InternalEObject ) newPowerSystemResource ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            msgs = basicSetPowerSystemResource( newPowerSystemResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE,
                        newPowerSystemResource, newPowerSystemResource, !oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResource( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = null;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, null,
                    oldPowerSystemResourceESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE,
                        null, null, oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT__TERMINAL:
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.ACDC_TERMINAL__MEASUREMENTS,
                        ACDCTerminal.class, msgs );
            return basicSetTerminal( ( ACDCTerminal ) otherEnd, msgs );
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            if( powerSystemResource != null )
                msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            return basicSetPowerSystemResource( ( PowerSystemResource ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            return basicUnsetPowerSystemResource( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT__PHASES:
            return getPhases();
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            return getUnitSymbol();
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            return getMeasurementType();
        case CimPackage.MEASUREMENT__TERMINAL:
            return getTerminal();
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            return getUnitMultiplier();
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT__PHASES:
            setPhases( ( PhaseCode ) newValue );
            return;
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            setUnitSymbol( ( UnitSymbol ) newValue );
            return;
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            setMeasurementType( ( String ) newValue );
            return;
        case CimPackage.MEASUREMENT__TERMINAL:
            setTerminal( ( ACDCTerminal ) newValue );
            return;
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            setUnitMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            setPowerSystemResource( ( PowerSystemResource ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT__PHASES:
            unsetPhases();
            return;
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            unsetUnitSymbol();
            return;
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            unsetMeasurementType();
            return;
        case CimPackage.MEASUREMENT__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            unsetUnitMultiplier();
            return;
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.MEASUREMENT__PHASES:
            return isSetPhases();
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            return isSetUnitSymbol();
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            return isSetMeasurementType();
        case CimPackage.MEASUREMENT__TERMINAL:
            return isSetTerminal();
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            return isSetUnitMultiplier();
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (phases: " );
        if( phasesESet )
            result.append( phases );
        else
            result.append( "<unset>" );
        result.append( ", unitSymbol: " );
        if( unitSymbolESet )
            result.append( unitSymbol );
        else
            result.append( "<unset>" );
        result.append( ", measurementType: " );
        if( measurementTypeESet )
            result.append( measurementType );
        else
            result.append( "<unset>" );
        result.append( ", unitMultiplier: " );
        if( unitMultiplierESet )
            result.append( unitMultiplier );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MeasurementImpl
