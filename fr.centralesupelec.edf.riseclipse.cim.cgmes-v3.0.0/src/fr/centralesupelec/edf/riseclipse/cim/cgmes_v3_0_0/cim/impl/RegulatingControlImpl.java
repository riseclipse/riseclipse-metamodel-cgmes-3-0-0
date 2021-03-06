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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControlModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulationSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getTargetDeadband <em>Target Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getMaxAllowedTargetValue <em>Max Allowed Target Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getMinAllowedTargetValue <em>Min Allowed Target Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegulatingControlImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatingControlImpl extends PowerSystemResourceImpl implements RegulatingControl {
    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final RegulatingControlModeKind MODE_EDEFAULT = RegulatingControlModeKind.REACTIVE_POWER;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected RegulatingControlModeKind mode = MODE_EDEFAULT;

    /**
     * This is true if the Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modeESet;

    /**
     * The cached value of the '{@link #getRegulationSchedule() <em>Regulation Schedule</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationSchedule()
     * @generated
     * @ordered
     */
    protected EList< RegulationSchedule > regulationSchedule;

    /**
     * The cached value of the '{@link #getRegulatingCondEq() <em>Regulating Cond Eq</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulatingCondEq()
     * @generated
     * @ordered
     */
    protected EList< RegulatingCondEq > regulatingCondEq;

    /**
     * The default value of the '{@link #getDiscrete() <em>Discrete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscrete()
     * @generated
     * @ordered
     */
    protected static final Boolean DISCRETE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiscrete() <em>Discrete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscrete()
     * @generated
     * @ordered
     */
    protected Boolean discrete = DISCRETE_EDEFAULT;

    /**
     * This is true if the Discrete attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean discreteESet;

    /**
     * The default value of the '{@link #getTargetDeadband() <em>Target Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetDeadband()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_DEADBAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetDeadband() <em>Target Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetDeadband()
     * @generated
     * @ordered
     */
    protected Double targetDeadband = TARGET_DEADBAND_EDEFAULT;

    /**
     * This is true if the Target Deadband attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetDeadbandESet;

    /**
     * The default value of the '{@link #getMaxAllowedTargetValue() <em>Max Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAllowedTargetValue()
     * @generated
     * @ordered
     */
    protected static final Double MAX_ALLOWED_TARGET_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAllowedTargetValue() <em>Max Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAllowedTargetValue()
     * @generated
     * @ordered
     */
    protected Double maxAllowedTargetValue = MAX_ALLOWED_TARGET_VALUE_EDEFAULT;

    /**
     * This is true if the Max Allowed Target Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxAllowedTargetValueESet;

    /**
     * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabled()
     * @generated
     * @ordered
     */
    protected static final Boolean ENABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabled()
     * @generated
     * @ordered
     */
    protected Boolean enabled = ENABLED_EDEFAULT;

    /**
     * This is true if the Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enabledESet;

    /**
     * The default value of the '{@link #getTargetValueUnitMultiplier() <em>Target Value Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetValueUnitMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier TARGET_VALUE_UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.ZETTA;

    /**
     * The cached value of the '{@link #getTargetValueUnitMultiplier() <em>Target Value Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetValueUnitMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier targetValueUnitMultiplier = TARGET_VALUE_UNIT_MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Target Value Unit Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetValueUnitMultiplierESet;

    /**
     * The default value of the '{@link #getMinAllowedTargetValue() <em>Min Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAllowedTargetValue()
     * @generated
     * @ordered
     */
    protected static final Double MIN_ALLOWED_TARGET_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinAllowedTargetValue() <em>Min Allowed Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAllowedTargetValue()
     * @generated
     * @ordered
     */
    protected Double minAllowedTargetValue = MIN_ALLOWED_TARGET_VALUE_EDEFAULT;

    /**
     * This is true if the Min Allowed Target Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minAllowedTargetValueESet;

    /**
     * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetValue()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetValue()
     * @generated
     * @ordered
     */
    protected Double targetValue = TARGET_VALUE_EDEFAULT;

    /**
     * This is true if the Target Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegulatingControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRegulatingControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RegulatingCondEq > getRegulatingCondEq() {
        if( regulatingCondEq == null ) {
            regulatingCondEq = new EObjectWithInverseResolvingEList.Unsettable< >(
                    RegulatingCondEq.class, this, CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ,
                    CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL );
        }
        return regulatingCondEq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegulatingCondEq() {
        if( regulatingCondEq != null ) ( ( InternalEList.Unsettable< ? > ) regulatingCondEq ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulatingCondEq() {
        return regulatingCondEq != null && ( ( InternalEList.Unsettable< ? > ) regulatingCondEq ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDiscrete() {
        return discrete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiscrete( Boolean newDiscrete ) {
        Boolean oldDiscrete = discrete;
        discrete = newDiscrete;
        boolean oldDiscreteESet = discreteESet;
        discreteESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_CONTROL__DISCRETE,
                    oldDiscrete, discrete, !oldDiscreteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiscrete() {
        Boolean oldDiscrete = discrete;
        boolean oldDiscreteESet = discreteESet;
        discrete = DISCRETE_EDEFAULT;
        discreteESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_CONTROL__DISCRETE,
                    oldDiscrete, DISCRETE_EDEFAULT, oldDiscreteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscrete() {
        return discreteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetDeadband() {
        return targetDeadband;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetDeadband( Double newTargetDeadband ) {
        Double oldTargetDeadband = targetDeadband;
        targetDeadband = newTargetDeadband;
        boolean oldTargetDeadbandESet = targetDeadbandESet;
        targetDeadbandESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_CONTROL__TARGET_DEADBAND,
                    oldTargetDeadband, targetDeadband, !oldTargetDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetDeadband() {
        Double oldTargetDeadband = targetDeadband;
        boolean oldTargetDeadbandESet = targetDeadbandESet;
        targetDeadband = TARGET_DEADBAND_EDEFAULT;
        targetDeadbandESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_CONTROL__TARGET_DEADBAND,
                    oldTargetDeadband, TARGET_DEADBAND_EDEFAULT, oldTargetDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetDeadband() {
        return targetDeadbandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxAllowedTargetValue() {
        return maxAllowedTargetValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxAllowedTargetValue( Double newMaxAllowedTargetValue ) {
        Double oldMaxAllowedTargetValue = maxAllowedTargetValue;
        maxAllowedTargetValue = newMaxAllowedTargetValue;
        boolean oldMaxAllowedTargetValueESet = maxAllowedTargetValueESet;
        maxAllowedTargetValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGULATING_CONTROL__MAX_ALLOWED_TARGET_VALUE, oldMaxAllowedTargetValue,
                    maxAllowedTargetValue, !oldMaxAllowedTargetValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxAllowedTargetValue() {
        Double oldMaxAllowedTargetValue = maxAllowedTargetValue;
        boolean oldMaxAllowedTargetValueESet = maxAllowedTargetValueESet;
        maxAllowedTargetValue = MAX_ALLOWED_TARGET_VALUE_EDEFAULT;
        maxAllowedTargetValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATING_CONTROL__MAX_ALLOWED_TARGET_VALUE, oldMaxAllowedTargetValue,
                    MAX_ALLOWED_TARGET_VALUE_EDEFAULT, oldMaxAllowedTargetValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxAllowedTargetValue() {
        return maxAllowedTargetValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnabled( Boolean newEnabled ) {
        Boolean oldEnabled = enabled;
        enabled = newEnabled;
        boolean oldEnabledESet = enabledESet;
        enabledESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_CONTROL__ENABLED, oldEnabled,
                    enabled, !oldEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnabled() {
        Boolean oldEnabled = enabled;
        boolean oldEnabledESet = enabledESet;
        enabled = ENABLED_EDEFAULT;
        enabledESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_CONTROL__ENABLED,
                    oldEnabled, ENABLED_EDEFAULT, oldEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnabled() {
        return enabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getTargetValueUnitMultiplier() {
        return targetValueUnitMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetValueUnitMultiplier( UnitMultiplier newTargetValueUnitMultiplier ) {
        UnitMultiplier oldTargetValueUnitMultiplier = targetValueUnitMultiplier;
        targetValueUnitMultiplier = newTargetValueUnitMultiplier == null ? TARGET_VALUE_UNIT_MULTIPLIER_EDEFAULT
                : newTargetValueUnitMultiplier;
        boolean oldTargetValueUnitMultiplierESet = targetValueUnitMultiplierESet;
        targetValueUnitMultiplierESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER, oldTargetValueUnitMultiplier,
                    targetValueUnitMultiplier, !oldTargetValueUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetValueUnitMultiplier() {
        UnitMultiplier oldTargetValueUnitMultiplier = targetValueUnitMultiplier;
        boolean oldTargetValueUnitMultiplierESet = targetValueUnitMultiplierESet;
        targetValueUnitMultiplier = TARGET_VALUE_UNIT_MULTIPLIER_EDEFAULT;
        targetValueUnitMultiplierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER, oldTargetValueUnitMultiplier,
                    TARGET_VALUE_UNIT_MULTIPLIER_EDEFAULT, oldTargetValueUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetValueUnitMultiplier() {
        return targetValueUnitMultiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinAllowedTargetValue() {
        return minAllowedTargetValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinAllowedTargetValue( Double newMinAllowedTargetValue ) {
        Double oldMinAllowedTargetValue = minAllowedTargetValue;
        minAllowedTargetValue = newMinAllowedTargetValue;
        boolean oldMinAllowedTargetValueESet = minAllowedTargetValueESet;
        minAllowedTargetValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGULATING_CONTROL__MIN_ALLOWED_TARGET_VALUE, oldMinAllowedTargetValue,
                    minAllowedTargetValue, !oldMinAllowedTargetValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinAllowedTargetValue() {
        Double oldMinAllowedTargetValue = minAllowedTargetValue;
        boolean oldMinAllowedTargetValueESet = minAllowedTargetValueESet;
        minAllowedTargetValue = MIN_ALLOWED_TARGET_VALUE_EDEFAULT;
        minAllowedTargetValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATING_CONTROL__MIN_ALLOWED_TARGET_VALUE, oldMinAllowedTargetValue,
                    MIN_ALLOWED_TARGET_VALUE_EDEFAULT, oldMinAllowedTargetValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinAllowedTargetValue() {
        return minAllowedTargetValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetValue( Double newTargetValue ) {
        Double oldTargetValue = targetValue;
        targetValue = newTargetValue;
        boolean oldTargetValueESet = targetValueESet;
        targetValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_CONTROL__TARGET_VALUE,
                    oldTargetValue, targetValue, !oldTargetValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetValue() {
        Double oldTargetValue = targetValue;
        boolean oldTargetValueESet = targetValueESet;
        targetValue = TARGET_VALUE_EDEFAULT;
        targetValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_CONTROL__TARGET_VALUE,
                    oldTargetValue, TARGET_VALUE_EDEFAULT, oldTargetValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetValue() {
        return targetValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingControlModeKind getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMode( RegulatingControlModeKind newMode ) {
        RegulatingControlModeKind oldMode = mode;
        mode = newMode == null ? MODE_EDEFAULT : newMode;
        boolean oldModeESet = modeESet;
        modeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_CONTROL__MODE, oldMode, mode,
                    !oldModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMode() {
        RegulatingControlModeKind oldMode = mode;
        boolean oldModeESet = modeESet;
        mode = MODE_EDEFAULT;
        modeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_CONTROL__MODE, oldMode,
                    MODE_EDEFAULT, oldModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMode() {
        return modeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RegulationSchedule > getRegulationSchedule() {
        if( regulationSchedule == null ) {
            regulationSchedule = new EObjectWithInverseResolvingEList.Unsettable< >(
                    RegulationSchedule.class, this, CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE,
                    CimPackage.REGULATION_SCHEDULE__REGULATING_CONTROL );
        }
        return regulationSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegulationSchedule() {
        if( regulationSchedule != null ) ( ( InternalEList.Unsettable< ? > ) regulationSchedule ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulationSchedule() {
        return regulationSchedule != null && ( ( InternalEList.Unsettable< ? > ) regulationSchedule ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( Terminal newTerminal, NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( Terminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__REGULATING_CONTROL,
                        Terminal.class, msgs );
            if( newTerminal != null )
                msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this, CimPackage.TERMINAL__REGULATING_CONTROL,
                        Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_CONTROL__TERMINAL,
                        newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, null, oldTerminalESet );
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
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__REGULATING_CONTROL,
                    Terminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_CONTROL__TERMINAL, null,
                        null, oldTerminalESet ) );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REGULATING_CONTROL__TERMINAL:
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__REGULATING_CONTROL,
                        Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
        case CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRegulationSchedule() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRegulatingCondEq() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.REGULATING_CONTROL__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
            return ( ( InternalEList< ? > ) getRegulationSchedule() ).basicRemove( otherEnd, msgs );
        case CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
            return ( ( InternalEList< ? > ) getRegulatingCondEq() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REGULATING_CONTROL__TERMINAL:
            return getTerminal();
        case CimPackage.REGULATING_CONTROL__MODE:
            return getMode();
        case CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
            return getRegulationSchedule();
        case CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
            return getRegulatingCondEq();
        case CimPackage.REGULATING_CONTROL__DISCRETE:
            return getDiscrete();
        case CimPackage.REGULATING_CONTROL__TARGET_DEADBAND:
            return getTargetDeadband();
        case CimPackage.REGULATING_CONTROL__MAX_ALLOWED_TARGET_VALUE:
            return getMaxAllowedTargetValue();
        case CimPackage.REGULATING_CONTROL__ENABLED:
            return getEnabled();
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER:
            return getTargetValueUnitMultiplier();
        case CimPackage.REGULATING_CONTROL__MIN_ALLOWED_TARGET_VALUE:
            return getMinAllowedTargetValue();
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE:
            return getTargetValue();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.REGULATING_CONTROL__TERMINAL:
            setTerminal( ( Terminal ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__MODE:
            setMode( ( RegulatingControlModeKind ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
            getRegulationSchedule().clear();
            getRegulationSchedule().addAll( ( Collection< ? extends RegulationSchedule > ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
            getRegulatingCondEq().clear();
            getRegulatingCondEq().addAll( ( Collection< ? extends RegulatingCondEq > ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__DISCRETE:
            setDiscrete( ( Boolean ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__TARGET_DEADBAND:
            setTargetDeadband( ( Double ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__MAX_ALLOWED_TARGET_VALUE:
            setMaxAllowedTargetValue( ( Double ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__ENABLED:
            setEnabled( ( Boolean ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER:
            setTargetValueUnitMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__MIN_ALLOWED_TARGET_VALUE:
            setMinAllowedTargetValue( ( Double ) newValue );
            return;
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE:
            setTargetValue( ( Double ) newValue );
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
        case CimPackage.REGULATING_CONTROL__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.REGULATING_CONTROL__MODE:
            unsetMode();
            return;
        case CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
            unsetRegulationSchedule();
            return;
        case CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
            unsetRegulatingCondEq();
            return;
        case CimPackage.REGULATING_CONTROL__DISCRETE:
            unsetDiscrete();
            return;
        case CimPackage.REGULATING_CONTROL__TARGET_DEADBAND:
            unsetTargetDeadband();
            return;
        case CimPackage.REGULATING_CONTROL__MAX_ALLOWED_TARGET_VALUE:
            unsetMaxAllowedTargetValue();
            return;
        case CimPackage.REGULATING_CONTROL__ENABLED:
            unsetEnabled();
            return;
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER:
            unsetTargetValueUnitMultiplier();
            return;
        case CimPackage.REGULATING_CONTROL__MIN_ALLOWED_TARGET_VALUE:
            unsetMinAllowedTargetValue();
            return;
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE:
            unsetTargetValue();
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
        case CimPackage.REGULATING_CONTROL__TERMINAL:
            return isSetTerminal();
        case CimPackage.REGULATING_CONTROL__MODE:
            return isSetMode();
        case CimPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
            return isSetRegulationSchedule();
        case CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
            return isSetRegulatingCondEq();
        case CimPackage.REGULATING_CONTROL__DISCRETE:
            return isSetDiscrete();
        case CimPackage.REGULATING_CONTROL__TARGET_DEADBAND:
            return isSetTargetDeadband();
        case CimPackage.REGULATING_CONTROL__MAX_ALLOWED_TARGET_VALUE:
            return isSetMaxAllowedTargetValue();
        case CimPackage.REGULATING_CONTROL__ENABLED:
            return isSetEnabled();
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER:
            return isSetTargetValueUnitMultiplier();
        case CimPackage.REGULATING_CONTROL__MIN_ALLOWED_TARGET_VALUE:
            return isSetMinAllowedTargetValue();
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE:
            return isSetTargetValue();
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
        result.append( " (mode: " );
        if( modeESet )
            result.append( mode );
        else
            result.append( "<unset>" );
        result.append( ", discrete: " );
        if( discreteESet )
            result.append( discrete );
        else
            result.append( "<unset>" );
        result.append( ", targetDeadband: " );
        if( targetDeadbandESet )
            result.append( targetDeadband );
        else
            result.append( "<unset>" );
        result.append( ", maxAllowedTargetValue: " );
        if( maxAllowedTargetValueESet )
            result.append( maxAllowedTargetValue );
        else
            result.append( "<unset>" );
        result.append( ", enabled: " );
        if( enabledESet )
            result.append( enabled );
        else
            result.append( "<unset>" );
        result.append( ", targetValueUnitMultiplier: " );
        if( targetValueUnitMultiplierESet )
            result.append( targetValueUnitMultiplier );
        else
            result.append( "<unset>" );
        result.append( ", minAllowedTargetValue: " );
        if( minAllowedTargetValueESet )
            result.append( minAllowedTargetValue );
        else
            result.append( "<unset>" );
        result.append( ", targetValue: " );
        if( targetValueESet )
            result.append( targetValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RegulatingControlImpl
